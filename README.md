# calculo-11-digito



Módulo 11:

Conforme o esquema abaixo, cada dígito do número, começando da direita para a esquerda (menos significativo para o mais significativo) é multiplicado, na ordem, por 2, depois 3, depois 4 e assim sucessivamente, até o das posições. Aí novamente multiplica-se o número por 2, 3, etc.

Ao receber o número, é removido o último elemento e somado mais 1 ao número restante, conforme o exemplo:

Número exemplo: 261532-9

Número exemplo + 1 = 261533 - 9
```sh
+---+---+---+---+---+---+   +---+
| 2 | 6 | 1 | 5 | 3 | 3 | - | 9 |
+---+---+---+---+---+---+   +---+
  |   |   |   |   |   |
 x7  x6  x5  x4  x3  x2
  |   |   |   |   |   |
=14 =36  =5 =20  =9  =6
  +---+---+---+---+---+-> =90 x10, /11 =81, resto 9 => DV = 9
  ```
 
A somatória dessas multiplicações é multiplicada por 10 e dividida por 11. O resto desta divisão (módulo 11) é o dígito verificador que será acrescentado ao número no lugar do dígito removido.

Em outro método de cálculo a somatória das multiplicações não é multiplicada por 10. Simplesmente é dividida por 11. Só que neste caso o resto pode ser 10. Se isso acontece o dígito será "0".
