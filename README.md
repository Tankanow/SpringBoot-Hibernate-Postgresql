# SpringBoot-Hibernate-Postgresql

<h3>Spring Boot practice project </h3>
App built on Spring-Boot, Spring-Data-JPA, Hibernate, Postgresql 
This app uses U.S. zip code data from geonames [http://download.geonames.org/export/dump/] loaded into Postgresql DB.

The app takes query strings and returns results:

    http://localhost:8080/api/places/getPlaceByZip?zipcode=10707
    {"zip":"10707","place":"Tuckahoe","name1":"New York","id":29000}
    

    


