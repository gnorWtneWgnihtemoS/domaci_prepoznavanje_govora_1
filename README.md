# domaci_prepoznavanje_govora_1

Aplikacije korisiti konzolni interface za unos podataka, i  
GUI za prikaz funkcije na ekran.  
-nije uradjeno citanje iz wav fajla.  

komande:  

//Dodaje novu sinusoidnu funkciju  
add amplitude:frequency:offset  

//Menja prozorsku funkciju, default vrednost je nema funkcije.  
function&nbsp;|type|  
|type| - jedno od none/hanning/hamming  

//Izvrsava dft algoritam nad svim sinusoidnim funckcijama sa zadatim parametrima  
//i trenutno izabranom prozorskom funkcijomi prikazuje to na ekran.  
makedft start:frame:frequency  

//Brise sve funkcije iz liste i resetuje vrednost prozorske  
//funkcije na "nema funkcije".  
reset  

//Zaustavlja rad programa  
exit  

