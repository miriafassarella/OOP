# OOP
Repository created to put into practice the knowledge acquired in oop - Object Oriented Programming.
<br>Dans une partie de ce project, on peut voir l'implementation de l'Injection de dépendances et de l'Inversion de contrôle à l'intérieur du packet ioc/di.
- Par exemple, nous injectons dans le contructeur de la classe ActivationClientService l'interface Notifier pour pouvoir enlever le contrôle du type de notification de cette classe.
  
<br> Pour simplifier, si on n'utilise pas l'inversion de contrôle, nous n'aurions pas l'interface Notifier et la classe ActivationClientService restera de cette façon: 

![ActivationClientService](https://github.com/miriafassarella/OOP/assets/43910212/6a2b10bd-c83b-4ac4-8544-b4394f15f477)
<br>Mais on veut enlever le contrôle de cette classe, alors nous injectons un notificateur dans son constructeur:
- De cette façon, on donne le contrôle à quelqu'un qui est dehors de la classe.
<br>
  

![ioc](https://github.com/miriafassarella/OOP/assets/43910212/5faa9e9c-e8d1-4f29-9f2f-365f252c2623)
