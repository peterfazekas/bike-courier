# Bike Courier - Futár
<p>A nagyvárosokon belül, ha csomagot gyorsan kell eljuttatni egyik helyről a másikra, akkor sokszor a legjobb választás egy kerékpáros futárszolgálat igénybevétele. A futárszolgálat a futárjainak a megtett utak alapján ad fizetést. Az egyik futár egy héten át feljegyezte fuvarjai legfontosabb adatait, és azokat eltárolta egy állományban. Az állományban az adatok rögzítése nem mindig követi az időrendi sorrendet. Azokra a napokra, amikor nem dolgozott, nincsenek adatok bejegyezve az állományba.</p>
<p>A fájlban legalább 10 sor van, és minden sor egy-egy út adatait tartalmazza egymástól szóközzel elválasztva. Az első adat a nap sorszáma, ami 1 és 7 közötti érték lehet. A második szám a napon belüli fuvarszám, ami 1 és 40 közötti érték lehet. Ez minden nap 1-től kezdődik, és az aznapi utolsó fuvarig egyesével növekszik. A harmadik szám az adott fuvar során megtett utat jelenti kilométerben, egészre kerekítve. Ez az érték nem lehet 30-nál nagyobb.</p>
<p>Például:</p>
<pre>
1 1 5
1 2 9
3 2 12
1 4 3
3 1 7
…
</pre>
<p>A 3. sor például azt mutatja, hogy a hét harmadik napján a második fuvar 12 kilométeres távolságot jelentett.</p>
<p>Készítsen programot, amely a <i>tavok.txt</i> állomány adatait felhasználva az alábbi kérdésekre válaszol! A program forráskódját mentse <i><b>futar</b></i> néven! (A program megírásakor a felhasználó által megadott adatok helyességét, érvényességét nem kell ellenőriznie, feltételezheti, hogy a rendelkezésre álló adatok a leírtaknak megfelelnek.)</p>
<p>A képernyőre írást igénylő részfeladatok eredményének megjelenítése előtt írja a képernyőre a feladat sorszámát (például: <i><b>3. feladat:</b></i>)! Ha a felhasználótól kér be adatot, jelenítse meg a képernyőn, hogy milyen értéket vár! Az ékezetmentes kiírás is elfogadott.</p>
<ol>
<li>Olvassa be a <i>tavok.txt</i> állományban talált adatokat, s annak felhasználásával oldja meg a következő feladatokat!</li> 
<li>Írja ki a képernyőre, hogy mekkora volt a hét legelső útja kilométerben! Figyeljen arra, hogy olyan állomány esetén is helyes értéket adjon, amiben például a hét első napján a futár nem dolgozott!</li>
<li>Írja ki a képernyőre, hogy mekkora volt a hét utolsó útja kilométerben!</li>
<li>Tudjuk, hogy a futár minden héten tart legalább egy szabadnapot. Írja ki a képernyőre, hogy a hét hányadik napjain nem dolgozott a futár!</li>
<li>Írja ki a képernyőre, hogy a hét melyik napján volt a legtöbb fuvar! Amennyiben több nap is azonos, maximális számú fuvar volt, elegendő ezek egyikét kiírnia.</li>
<li>Számítsa ki és írja a képernyőre a mintának megfelelően, hogy az egyes napokon hány kilométert kellett tekerni! <br>
<pre>
1. nap: 124 km
2. nap: 0 km
3. nap: 75 km
…
</pre></li>
<li>A futár az egyes utakra az út hosszától függően kap fizetést az alábbi táblázatnak megfelelően:
<table>
<tr><td align="right">1 – 2 km</td><td align="right">500 Ft</td></tr>
<tr><td align="right">3 – 5 km</td><td align="right">700 Ft</td></tr>
<tr><td align="right">6 – 10 km</td><td align="right">900 Ft</td></tr>
<tr><td align="right">11 – 20 km</td><td align="right">1400 Ft</td></tr>
<tr><td align="right">21 – 30 km</td><td align="right">2000 Ft</td></tr>
</table>
Kérjen be a felhasználótól egy tetszőleges távolságot, és határozza meg, hogy mekkora díjazás jár érte! Ezt írja a képernyőre!
</li>
<li>Határozza meg az összes rögzített út ellenértékét! Ezeket az értékeket írja ki a <i>dijazas.txt</i> állományba nap szerint, azon belül pedig az út sorszáma szerinti növekvő sorrendben az alábbi formátumban: <br />
<pre>
1. nap 1. út: 700 Ft
1. nap 2. út: 900 Ft
1. nap 3. út: 2000 Ft
…
</pre></li>
<li>Határozza meg, és írja ki a képernyőre, hogy a futár mekkora összeget kap a heti munkájáért!</li>
</ol>
<hr>
<h3>Források:</h3>
<li><a href="https://www.oktatas.hu/bin/content/dload/erettsegi/feladatok_2014osz_emelt/e_inf_14okt_fl.pdf">Feladatlap</a>
<li><a href="https://www.oktatas.hu/bin/content/dload/erettsegi/feladatok_2014osz_emelt/e_inffor_14okt_fl.zip">Forrásállományok</a>