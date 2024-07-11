# Security missconfiguration Modul 183
## Einleitung
Wir bekamen den Auftrag in Webgoat die Aufgaben zu Lösen und dort hatten wir 3 Aufgaben zu lösen. Im folgenden ReadMe lesen sie über unsere Lösungswege. 

## Webgoat
### Aufgabe 1
In der ersten Aufgabe ging es darum, dass man in einem Suchfeld mit einer XXE Injection hackt.

![MicrosoftTeams-image (6)](https://github.com/zhyannick/securitymissconfig/assets/94964550/6e808fcb-a5f5-4993-85a3-eb51c8a11409)


Wir haben mit Burb uns verbunden und haben mit der Methode GET unsere Nachricht gesendet und dann hatten wir die möglichkeit diese Anfrage entweder weiterzuleiten oder fallen zu lassen lassen, indem man auf die entsprechenden Schaltflächen "Forward" oder "Drop" klickt. So haben wir diese Aufgabe gelöst.
![Bild (1)](https://github.com/zhyannick/securitymissconfig/assets/94964550/55567cd4-43ba-4bd3-be9e-b52962baa771)

### Aufgabe 2
In der Aufgabe 2 mussten wir uns in WebWolf anmeldent. 
![Bild (2)](https://github.com/zhyannick/securitymissconfig/assets/94964550/5acc1459-a56a-4747-91b1-b77487a2ad5d)

Das ist die Ansicht die man hat nachdem man sich in WebWolf angemeldet hat.
![Bild (3)](https://github.com/zhyannick/securitymissconfig/assets/94964550/8e20af2d-be28-4b2c-afc0-cd994dfcf173)

Hier liessen wir eine attacke generieren.
![Bild (4)](https://github.com/zhyannick/securitymissconfig/assets/94964550/8a57e214-d237-4ab6-ae26-a08b71f0116e)

Hier sind man die Attacke die generiert wurde.
![Bild (5)](https://github.com/zhyannick/securitymissconfig/assets/94964550/9c963db2-5f95-45ed-9663-135d6a0fe8ab)

Hier haben wir wieder mit Burb unsere attacke angepasst.
![Bild (6)](https://github.com/zhyannick/securitymissconfig/assets/94964550/9cfd1095-0d60-445d-80ef-1ed3e1f987b0)

Nach dem wir Forward gewählt haben sah es so aus.
![Bild (7)](https://github.com/zhyannick/securitymissconfig/assets/94964550/2dfabe4b-f4c4-4c07-83b1-6e7629f1174d)


Nach dem wir die Attacke hatten konnte die Nachricht von sich aus geschickt werden.
![Bild (9)](https://github.com/zhyannick/securitymissconfig/assets/94964550/bc05f79f-785a-44ca-be84-8eca2a2e280f)

Hier wurde es erfolgreich gemacht
![Bild (10)](https://github.com/zhyannick/securitymissconfig/assets/94964550/6dbda73b-c892-48ed-977a-766ec8dcb5e9)

### Link Git
https://github.com/zhyannick/securitymissconfig
