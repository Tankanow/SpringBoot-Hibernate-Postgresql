# SpringBoot-Hibernate-Postgresql

<h3>Spring Boot Learning</h3>
In an effort to learn and explore Spring Boot, I have built a simple Spring-Boot [REST] app built with Spring-Data-JPA, Hibernate, Postgresql and geo data. 
The app queries a postgresql db with some geo data**, namely:

    1. Places:   U.S. zip code data from geonames [http://download.geonames.org/export/dump/] 
    2. AddrFeat: US Census TIGER/Line AddrFeat table 

Query the places tables:

    http://localhost:8080/api/places/getPlaceByZip?zipcode=10707
    {"zip":"10707","place":"Tuckahoe","name1":"New York","id":29000}
    
Query AddrFeat tables:
    
    http://localhost:8080/api/addrfeats/featByName?name=CAPUTO%20DR
    {"gid":811529,"fullname":"CAPUTO DR","lfromhn":"1","ltohn":"99","rfromhn":"2","rtohn":"98","zipl":"11949","zipr":"11949","geom":"01050000000100000001020000000E000000CB7EDDE9CE3252C0575EF23FF96D4440B43C0FEECE3252C072BED87BF16D4440A2EBC20FCE3252C070D1C952EB6D444026FE28EACC3252C06CB07092E66D4440118C834BC73252C0B1868BDCD36D4440232BBF0CC63252C078245E9ECE6D444053C90050C53252C098D9E731CA6D44402A1C412AC53252C035B05582C56D4440F38C7DC9C63252C0E07F2BD9B16D4440412AC58EC63252C0CABF9657AE6D4440890AD5CDC53252C07E8AE3C0AB6D44409BA9108FC43252C0971AA19FA96D4440F6285C8FC23252C0EBA86A82A86D44403C6A4C88B93252C0E61F7D93A66D4440","name":"CAPUTO","predirabrv":null,"pretypabrv":null,"suftypabrv":"DR"}
     

The AddrFeat.geom column data needs to be converted - Need to find either a geo data conversion library or make one myself. 


** The geo data/PostgreSQL DB mentioned is from a differenct project of mine. Will post DB build scripts soon!
