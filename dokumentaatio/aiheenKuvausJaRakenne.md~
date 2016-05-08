## Ohjelmoinnin harjoitustyö kevät 2016
_Sonja Mäkipaja, 014589009_

![Ensimmäinen luonnos: napakarvaeläin](/dokumentaatio/napakarvaelain.png)

**Aihe:** 

Peli nimeltään Silly Naked Furry Bellybutton Pets. Kyseessä on lemmikkisimulaattori, jossa pelaajalla on hassu lemmikki. Lemmikin hoitamisesta saa pisteitä, joiden avulla on mahdollista saada lemmikki ikääntymään. Lemmikki syö, juo ja nukkuu ja sen tarpeista tulee huolehtia. Jotkin asiat tekee lemmikin surulliseksi ja jotkut iloiseksi. Lemmikin mieliala ilmaistaan tekstimuodossa tarpeiden yhteydessä. Pelissä on myös tallennustoiminto.

**Graafinen käyttöliittymä:**

Käyttöliittymä koostuu neljästä paneelista. Oikealla on kuva hoidokista sekä alhaalla tummalla taustalla päivittyvä statistiikka. Vasemmalla on tilaa tekstimuotoiselle esitykselle ja alavasemmalla toiminnallinen nurkkaus, jossa on nappuloita eri toimintojen käynnistämiseen.

**Käyttäjät:** Pelaaja.

**_lemmikin_**  
	- nimeäminen  
	- ruokinta  
	- juottaminen  
	- leikittäminen  
	- pissattaminen  
	- nukuttaminen  
**_tallentaminen_**  
	- tallennuksen nimeäminen  
	- tallennuksen lataus 

**Rakennekuvaus:** 

![alustava luokkakaavio](/dokumentaatio/luokkakaavio.png)

Ohjelmaan kuuluu logiikka-, utility- ja uiluokkia. Pet luokassa tapahtuu kaikki lemmikkiin liittyvät toiminnot. Ui-luokkaan liittyy aina yksi Pet-luokan ilmentymä ja toisin päin. Ui näyttää pelin käyttäjälle. Ui-luokkaan liittyy lisäksi aina yksi TxtReader, MoodMaker, Saver sekä SaveLoader luokkien ilmentymät. TxtReader ei välttämättä aina liity Ui-luokkaan, sillä myös MoodMaker-luokalla on oma TxtReader. MoodMaker vastaa lemmikin olotilojen satunnaisgeneroimisesta txt-tiedostojen avulla. SaveLoader ja Saver -luokkia hyödynnetään tallennusten hallinnassa.


