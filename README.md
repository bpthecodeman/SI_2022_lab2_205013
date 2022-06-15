# Втора лабораториска вежба по Софтверско инженерство

## Бранислав Попоски, бр. на индекс 205013

###  Control Flow Graph

### Цикломатска комплексност
Цикломатска комплексност на овој код изнесува 9. Вредноста ја добив преку формулата `V(G) = P + 1` каде што **P** претставуваат предикатните јазли во кодот, а тоа се: A, C, F2, G, H, I, L, N

### Тест случаи според критериумот  Every statement
|C0|\[\]|\["0","#","0"\]|\["0","#","0","#","0","#","0","0","0"\]|
|:--:|:--:|:--:|:--:|
|A|\*|\*|\*|
|B|\*|  |  |
|C|  |\*|\*|
|D|  |\*|  |
|E|  |  |\*|
|F1| |  |\*|
|F2| |  |\*|
|F3| |  |\*|
|G|  |  |\*|
|H|  |  |\*|
|I|  |  |\*|
|J|  |  |\*|
|K|  |  |\*|
|L|  |  |\*|
|M|  |  |\*|
|N|  |  |\*|
|O|  |  |\*|
|P|  |  |\*|
|Q|  |  |\*|
|R|  |  |\*|

Избрани се три тест случаи:
 - Празна листа - Паѓа на проверката дали листата има барем еден елемент
 - Листа од три елементи - Паѓа на проверката дали листата е перфектен квадрат
 - Листа од девет елементи - Влегува во сите предикати затоа што има **0** кои што се обиколени и од едната и од двете страни со **#**. Исто така има **0** кои што се обиколени со **#** и од горе и од долу.

### Тест случаи според критериумот Every branch
.....