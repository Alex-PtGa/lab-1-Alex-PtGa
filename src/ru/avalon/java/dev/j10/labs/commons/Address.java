/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    private String country, city, street;
    private int house, apartment;
    
public Address(String country, String city, String street, int house, int apartment)   {
    this.country = country; 
    this.city = city;
    this.street = street;
    this.house = house;
    this.apartment = apartment;
}

// удалил лишний конструктор 

public String getCountry() {     
    return country;    
}
      public void setCountry(String country) {       
          this.country=country;   
      }

public String getCity() {    
    return city;    
}
      public void setCity(String city) {    
          this.city=city;    
      }

public String getStreet() {  
      return street;    
}
      public void setStreet(String street) {  
          this.street = street;   
      }
      
public int getHouse() {
       return house;    
}
      public void setHouse(int house) { 
          this.house = house;   
      }

public int getApartment() {      
    return apartment;    
}
      public void setAppartment(int  apartment) {    
          this.apartment = apartment;   
      }
 // переопределение метода toString() для вывода в основном методе в консоль данных
 @Override
    public String toString() {
     return "Страна: " + country + " Город: " + city + " улица: " + street + " дом: " + house + " квартира: " + apartment;
    }
}