<?php

$N = trim(fgets(STDIN));
$line = trim(fgets(STDIN));
$A = explode(' ', $line);

for ($i = 1; $i < $N; $i++) {
	$key = $A[$i];
	$j = $i - 1;
    while ($j >= 0 && $A[$j] > $key) {
		$A[$j + 1] = $A[$j];
		$j--;
	}
	$A[$j + 1] = $key;
	echo implode(' ', $A), PHP_EOL;
}