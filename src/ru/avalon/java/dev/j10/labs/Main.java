package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    
    public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так,
           чтобы он стал точкой входа в приложение.
         */
       Person ivanov = new Person("Иванов ", " Иван ", "Иванович ");
       Person smith = new Person("John ", "Edvard ", " Smith ");               
 
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
       
       /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
    String fullNameIv;
    String fullNameSm;
    
    Address addressIv = new Address("Россия", " Пятигорск", " Энтузиастов", 5, 23);
    Address addressSm = new Address("USA", " Monte Caplo", " FirstAvenyu", 68, 1);
    
    String ivAddress;
    String smAddress;
    
    ivAddress = "Страна: " + addressIv.getCountry() + " Город: "+addressIv.getCity() + " Улица: "+ addressIv.getStreet()
                + " Дом: "+ addressIv.getHouse() + " Квартира: "+ addressIv.getApartment();        
    smAddress = "Country: " +addressSm.getCountry() + " City: "+ addressSm.getCity() + " Street: "+ addressSm.getStreet()
                + " House: "+ addressSm.getHouse() + " Apartment: "+ addressSm.getApartment();
        
    fullNameIv = ivanov.getName() + ivanov.getPatronymic() + ivanov.getSurName();
    fullNameSm = smith.getName() + smith.getPatronymic() + smith.getSurName();
    
    
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */

// вывод полного имени через строчную переменную    
    System.out.println(fullNameIv);
    System.out.println(fullNameSm);
    
// вывод полного имени и адресса проживания через строчную переменную
    System.out.println(fullNameIv + "проживает по адрессу: "+  ivAddress);
    System.out.println(fullNameSm + "проживает по адрессу: "+  smAddress);
    
    // так же можно вывести другим способом, выввести сразу ссылочные переменные клаассов
    // пример вывода полного имени с адресом проживания
    System.out.println(ivanov + "проживает по адрессу: "+  addressIv);
    System.out.println(smith + "проживает по адрессу: "+  addressSm);       
    }
}
//
// для получения строчных значений был переопределен метод toString() в классе Person и Address