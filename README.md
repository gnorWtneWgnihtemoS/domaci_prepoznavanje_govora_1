# domaci_prepoznavanje_govora_1

Aplikacije korisiti konzolni interface za unos podataka, i
GUI za prikaz funkcije na ekran.
-nije uradjeno citanje iz wav fajla.

komande:

//dodaje novu sinusoidnu funkciju
add amplitude:frequency:offset 

//menja prozorsku funkciju, default vrednost je nema funkcije.
function <type>
<type> - jedno od none/hanning/hamming

//izvrsava dft algoritam nad svim sinusoidnim funckcijama sa zadatim parametrima
//i trenutno izabranom prozorskom funkcijomi prikazuje to na ekran.
makedft start:frame:frequency

//brise sve funkcije iz liste i resetuje vrednost prozorske
//funkcije na "nema funkcije".
reset

//Zaustavlja rad programa
exit

