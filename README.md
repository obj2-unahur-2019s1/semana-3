# Figuras


Se solicita modelar un conjunto de figuras geométricas a las cuales se les puede preguntar su:

* area() : Double

Todas las figuras geométricas tienen un color definido. Las figuras permiten ser pintadas y así cambia de color.

* pintar(Color: color)

## Figuras Básicas :

#### Circulo
Tiene como atributo `radio` de tipo `Integer`. Se calculan:

* area: Pi * Radio ^ 2

#### Semicirculo
Tiene los mismos atributos que circulo pero su `area` y perímetro` se calculan distinto:

* area: es la mitad de la superficie del circulo

#### Triángulo
Tiene como atributos la base y la altura y su area se calcula de la siguiente forma:

* area: base * altura / 2

#### Rectángulo
Tambien tiene como atributos la base y la altura y su area se calcula de la siguiente forma:

* area: base * altura


## Figuras agujereadas

Mas allá de las figuras básicas es posible tener figuras `agujereadas`. Tienen básicamente los mismos atributos que las figuras básicas pero cambia la forma en la que se calcula el area.
El area de una figura agujereada es un tercio del area de la figura original, por ejemplo:

* Area del Rectángulo agujereado = base * altura / 3

Se solicita poder tener una figura agujereada  por cada figura básica existente.


