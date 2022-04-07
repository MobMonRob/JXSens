# JXSens
Java Wrapper to get data from XSens sensors.


Tutorial:
Um den Wrapper zu schreiben kann man wie folgt vorgehen:

Welche API:
als erstes muss man sich natürlich für eine API entscheiden die man wrappen möchte, manchmal gibt es mehrere zu auswahl. Hier sollte man einfach die verschiedenen API vergleichen und schauen welche besser passt. Meistens sollten die verschiedenen API sich auch nicht allzu sehr voneinander abweichen. 

Swig interface files:
Hat man sich für eine API entschieden geht es darum diese zu Wrappen. Dafür brauch man als aller erstes den source code der API. 
Aus dem source code sucht man sich jetzt die header heraus von denen man methoden verwenden möchte. Am besten startet man hierbei mit einem minimalbeispiel, oft haben API auch beispielcode indem die API verwendet wird. Man könnte z.B. einfach die header aus der beispielanwendung verwenden um ein minimalbeispiel zu bekommen. 

Ein interface file könnte wie folgt aussehen:

%module minimal //name des moduls

%{
#include stub.h /*alles innerhalb der %{%} klammern wird durch den swig befehl einfach an an den anfang des generierten cpp wrappers gesetzt. Möchte man auf der sicherern seite sein, so #include d man hier einfach alles was man später auch wrappen möchte. Ansonsten wird beim späteren erzeugen der library der compiler manche funktionen nicht erkennen, und deshalb fehler werden */
#include „helper.h“
%}

%include "stub.h" //alle %include files werden später auch gewrappt. d.h. jede .h file die wir brauchen können wir einfach include, falls wir nur einzelne funktionen brauchen, können wir auch einfach nur diese includen

%import "helper.h" //es kommt das eine klasse von einer gewünschten gewrappten methode gebraucht wird, aber nicht direkt von uns. Diese können wir %import einfügen um so später stummel klassen zu verhindern. (dazu später mehr)



	
Lässt man dann swig laufen mittels: 
swig -c++ -java interfacefile.i 
Dann beginnt swig alles zu wrappen, nun sollte wir eine cpp generiert bekommen haben. 
Außerdem sollten eine Menge von .java (oder in welcher sprache auch immer wir den wrapper haben wollen) erzeugt werden. Manche werden den namen von klassen aus den cpp files haben, diese wurden richtig erzeugt und wrappen code wie gewollt. Dann sollte es noch dateien geben die SWIGTYPE… als präfix im namen haben. 
Diese sind stummel bei denen Swig meist nicht weiß was es damit anfangen soll. Um diese zu beheben ist es meist nur notwendig die jeweilige .h zu importen oder zu includen. 
Dann sollte die korrespondieren nicht mehr erzeugt werden. 
Es kann auch zur erzeugung vovn SWIGTYPE_pointer kommen, da kann es helfen in das interface „%pointer_class(type,name)“ einzufügen dann wird eine extra klasse für den pointer erstellt.



Troubleshooting swig compiling
Verschieden Errors: 
  -Error: Macro … redefined: 
  -Error: Platform not supported: Hier kann es sein das ein makro nicht gefunden wurde, man kann das fixen indem man %define dasMakro %include dieVerursachendeZeile %undef dasMakro macht. 
  Eleganter ist es aber wenn man den header indem das Makro definiert wird einfach mittels %import  vor die verursachende Zeile packt.
  -Error: Previous declaration of <<irgendein header>> und <<irgendein header>> is multiply defined in the generated target language module in scope <<someJNI>>
    Diese Fehler kann man beheben indem man %rename verwendet. Konkret wäre das z.B:
      %rename(XsScannerClass) XsScanner;
  -Error:Unable to find "class::method()", hier sollte man zuerst nochmal überprüfen ob man die Klasse korrekt included hat. 
    Sollte es immer noch nicht funktionieren kann man in die interface file:
      "%{#include Klassenname%}
      class Klassenname{
        public: 
          GesamterMethodenkopf(...Parameter...)
      };
    einfügen. 


Verschieden Warnungen:

  -Operatorwarnung: Operatoren gibt es in vielen anderen Sprachen nicht, in c++ allerdings schon, diese Warnung kann man beheben indem man den operator umbenennt sodass er in eine methode gepackt werden kann. Das geht bspw. So: 
  %rename(opSet) operator=;

  -Nothing known about … Maybe you forgot to instantiate <<someTemplate>>: 
  Da hilft es meistens einfach %template vor <<some template>> zu packen bspw. So:
  %template (XsPortInfoArray) XsArrayImpl<XsPortInfo,g_xsPortInfoArrayDescriptor,XsPortInfoArray>;


 Erzeugt Swig nun alle gewünschten Klassen in der gewollten Sprache, so können wir zum nächsten Schritt übergehen.
  
 Anpassen der Pipeline:
  die Pipeline automatisiert das bauen des Projekts, um sie zu verwenden kopiert man am besten die Projektstruktur von bspw. https://github.com/MobMonRob/JRTDE2 
  und kopiert alle bash dateien. Hierbei muss man lediglich die project_config.sh, generate-dynlib_Linux64.sh und generate-wrapper_Multiarch.sh anpassen. Am besten fängt man hier bei bei den skripten im Wrapper bereich an und testet diese dann. 
  
  
  
  
  
  
  
  
  
  
  
