# OOP
##### Repository created to put into practice the knowledge acquired in oop - Object Oriented Programming.<br>

---
Incection de Dépendances
---
![injection](https://github.com/miriafassarella/OOP/assets/43910212/d214990b-3a79-4bd9-a46f-c734cc666d3e)

Dans une partie de ce project, on peut voir l'implementation de l'Injection de dépendances et de l'Inversion de contrôle à l'intérieur du packet ioc/di.<br>

Par exemple, nous injectons dans le contructeur de la classe ActivationClientService l'interface Notifier pour pouvoir enlever le contrôle du type de notification de cette classe.
  
Pour simplifier, si on n'utilise pas l'inversion de contrôle, nous n'aurions pas l'interface Notifier et la classe ActivationClientService restera de cette façon: 

```
public class ActivationClientService {
	public void activate(Client client) {
		client.activate();

		NotifierEmail notifierEmail = NotifierEmail();
		notifier.notifier(client, "your registration in the system is active.");
	}
	}
```
<br>Mais on veut enlever le contrôle de cette classe :  
- Alors nous créons une interface Notifier.
- La classe NotifierEmail et NotifierSMS vont implémenter l'interface Notifier.
- Nous injectons un notificateur dans le constructeur de la classe ActivationClientService.
  
<br>De cette façon, on donne le contrôle d'intancier le type de notification à quelqu'un qui est dehors de la classe:
<br>
  ```
  public class ActivationClientService {

	Notifier notifier;

	public ActivationClientService(Notifier notifier) {
		this.notifier = notifier;
	}
	public void activate(Client client) {
		client.activate();
		notifier.notifier(client, "your registration in the system is active.");
	}
	})
```

