<?php

echo "Introduzca un numero";
$numero1 = stream_get_line(STDIN, 1024, PHP_EOL);
echo "Introduzca otro numero";
$numero2 = stream_get_line(STDIN, 1024, PHP_EOL);
echo "La division es: " . $numero1 . "/" . $numero2 . "=" . ($numero1/$numero2);
?>