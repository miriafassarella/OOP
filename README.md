# OOP
### Repository created to put into practice the knowledge acquired in oop - Object Oriented Programming<br>
#### L'exemple ci-dessous est une réplique du modèle qui a éte donné en classe, en suivant la formation Expert Spring Rest par la plateforme AlgaWorks .

---
Injection de Dépendances (DI - Dependency Injection)
---
L'Injection de Dépendance est une forme d'Inversion de contrôle (Ioc - Inversion of control), un patron de conception qui favorise le faible couplage.

Dans une partie de ce project, il a été mis en place le concept de l'Injection de dépendance et de l'Inversion de contrôle à l'intérieur du packet ioc/di.<br>

#### Par exemple: J'ai une classe toute simple qui s'appelle Client. 
```
public class Cliente {

	private String name;
	private String mail;
	private String phone;
	private boolean active = false;
	
	public Cliente(String name, String mail,String phone) {
		this.name = name;
		this.mail = mail;
		this.phone = phone;
	}

	public String getName() {
			return name;
		}
	public String getMail() {
			return mail;
		}
	public String getPhone() {
			return phone;
		}
	public boolean isActive() {
			return active;
		}
	public void activate() {
			this.active = true;
		}
}
```
#### Je crée une classe pour activer un client:
```
public class AtivacaoClienteService {

	public void ativar(Cliente cliente) {
		cliente.activate();
		
	}
}
```
Mais en activant un client, je veux aussi le notifier. Disons que je veux avoir le choix de lui notifier soit par SMS, soit par courriel.

Alors, je crée la classe NotifierEmail et NotifierSMS.

#### On ne veut pas configurer reelement l'envoie d'un courriel ou d'un SMS. On veut juste afficher dans la console la notification.
```
public class NotifierEmail{ 
	public void notifier(Client client, String message) {
	/* TODO méthode pour envoyer un courriel à programmer*/
		System.out.printf("Notifying the customer %s via email %s: %s\n",
				client.getName(), client.getMail(), message);
	}
}
```
```
public class NotifierSMS{
	public void notifier(Client client, String message) {
		/* TODO méthode pour envoyer un courriel à programmer*/
		System.out.printf("Notifying the customer %s via phone %s: %s\n",
				client.getName(), client.getPhone(), message);
	}
}
```
#### Maintenant j'ai besoin d'instancier un objet NotifierSMS ou un objet NotifierEmail dans la classe ActivationClientService et appeller la méthode notifier().

```
public class ActivationClientService {
	public void activate(Client client) {
		client.activate();

		NotifierEmail notifierEmail = NotifierEmail();
		notifierEmail.notifier(client, "your registration in the system is active.");
	}
	}
```
#### Dans la classe Main, j'active les clients. 
```
public class Main {
	public static void main(String[] args) {
		Client jean = new Client("Jean","jean@gmail.com", "234567788" );
		Client marie = new Client("Marie","marie@gmail.com", "099876445" );

		ActivationClientService activationClient = new ActivationClientService();
		activationClient.activate(marie);
		activationClient.activate(jean);
	}
}
```
Mais disons qu'on a pas juste la classe ActivateClientService, on a des centaines de classes qui font des differentes choses et qu'à chaque appel d'une de ces classes, on veut notifier le client. Pour pouvoir changer la façon de notifier le client, soit par SMS, soit par courriel, on va avoir besoin d'aller en chaque classe pour pouvoir modifier la façon de notifier. 
```
public class ActivationClientService {
	public void activate(Client client) {
		client.activate();

		NotifierSMS notifierSMS = NotifierSMS();
		notifierSMS.notifier(client, "your registration in the system is active.");
	}
	}
```
<br> Alors pour rendre les choses plus simples, je vais créer une interface Notifier et NotifierEmail et NotifierSMS vont implémenter l'interface:
```
public interface Notifier { 
	void notifier(Client client, String message);
}
```
```
public class NotifierSMS implements Notifier{
	@Override
	public void notifier(Client client, String message) {
		/* TODO méthode pour envoyer un courriel à programmer*/
		System.out.printf("Notifying the customer %s via phone %s: %s\n",
				client.getName(), client.getPhone(), message);
	}
}
```
```
public class ActivationClientService {
	private Notifier notifier;
	public ActivationClientService(Notifier notifier){
		this.notifier = notifier;
	}
	public void activate(Client client) {
		client.activate();
		this.notifier.notifier(client, "your registration in the system is active.");
	}
}
```

La classe ActivationClientService n'a plus le contrôle sur quelle notification va être envoyé, courriel ou sms.

#### Pour enlever le contrôle de cette classe : 
- J'ai crée une interface Notifier.
- La classe NotifierEmail et NotifierSMS implémente l'interface Notifier.
- J'ai injectée un notificateur dans le constructeur de la classe ActivationClientService.
  
#### De cette façon, on donne le contrôle d'intancier le type de notification à quelqu'un qui est dehors de la classe ActivationClientService:
```
public class Main {
	public static void main(String[] args) {
		Client jean = new Client("Jean","jean@gmail.com", "234567788" );
		Client marie = new Client("Marie","marie@gmail.com", "099876445" );

		Notifier notifier = new NotifierSMS();
		ActivationClientService activationClient = new ActivationClientService(notifier);
		activationClient.activate(marie);
		activationClient.activate(jean);
	}
}
```

![injection](https://github.com/miriafassarella/OOP/assets/43910212/d214990b-3a79-4bd9-a46f-c734cc666d3e)
