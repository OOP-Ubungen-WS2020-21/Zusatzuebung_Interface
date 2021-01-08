---
title: Zusatzuebung Interface
author: Erstellt von Corinna Geiselhart und Philipp Schauhuber
documentclass: scrartcl
classoption:
  - a4paper
header-includes: |
    \usepackage{german} 
    \usepackage[a4paper,left=2.5cm, right=2.5cm,top=2.5cm, bottom=3cm]{geometry}
    \usepackage{fancyhdr}
    \usepackage{graphicx}
    \pagestyle{fancy}
    \fancyhf{}
    \rhead{OOP WS 2020/21}
    \lhead{U00 | Template}
    \cfoot{\includegraphics[height=2cm]{docs/footer.png}}
    \fancypagestyle{plain}{
      \fancyhf{}
      \rhead{OOP WS 2020/21}
      \lhead{U00 | Template}
      \cfoot[C]{\includegraphics[height=2cm]{docs/footer.png}}}
---


# Zusatzübung Interface

## Wichtige Informationen zur Bearbeitung der Aufgabe 
 - [Link zu wichtiger Ressource](https://www.uni-regensburg.de/sprache-literatur-kultur/medieninformatik/)

## Starterpaket

Ein vorbereitetes Starterpaket zur selbständigen Implementierung der Aufgabe finden Sie [hier](https://github.com/OOP-Ubungen-WS2020-21/archive/Starterpaket.zip).

## RandomBouncingBalls

In dem Starterpaket finden Sie die Klasse `RandomBouncingBalls` und `RamdomBall`. Vervollständigen Sie die `RandomBouncingBall` Klasse, sodass sich 2 Bälle mit zufälliger Geschwindigkeit innerhalb der Canvas bewegen. Die Bälle sollen an der Wand abprallen.
Schreiben Sie ihren Code so, dass durch Verändern einer Konstante die Anzahl an Bällen beliebig angepasst werden kann.

Lagern Sie im Anschluss alle vorhanden Konstanten der RandomBouncingBall-Klasse in einem Interface aus. Testen Sie, ob das Programm weiterhin funktioniert.


## Vererbung
Im Ordner `Inheritance` finden sie die Klassen: `Animal`, `Dog` welches von Animal erbt und `Bulldog` welches von Dog erbt. 
Erstellen Sie die Klasse `Bird` welche von Animal erbt. Erstellen Sie eine weitere Klasse `Airplane`. Ein Flugzeug hat einen Namen und eine maximale Geschwindigkeit. 
Bird und Airplane sind flugfähig. Diese beiden Klassen sollen die Flugfähigkeit durch ein Interface implementieren.

## Horse Race
In der Klasse `HorseRaceApp` laufen eine beliebige Anzahl an Pferde (`Horse`) um die Wette. Die Pferde haben eine zufällige Geschwindigkeit,  weshalb im Vorhinein nicht abzuschätzen ist, welches der Pferde gewinnen wird. 
Die Klasse `HorseRaceApp` soll darauf lauschen, wann die Pferde das Ziel (der rechte Rand von der Anwendung) erreichen und im Fenster die Reihenfolge der Pferde darstellen. Verwenden Sie für die Darstellung die `setWinnerText`- Methode.

## Light - Zusatzaufgabe
In der Klasse `Light` wird überprüft, ob ein Lichtschalter (`Rectangle switcher`) mit der Maus gedrückt wurde. Eine Klasse `LightBulb` kann eine Glühbirne zwischen den Zuständen Licht an und Licht aus wechseln (`setColor`- Methode). 
Benutzten sie ein Interface damit das Drücken des Lichtschalters zum an und ausschalten der Glühbirne führt.
In Light und Lightbulb befinden sich einige Konstanten. Lagern Sie diese wie in der Aufgabe `RandomBouncingBalls` aus und testen Sie, ob das Programm weiterhin funktioniert.
