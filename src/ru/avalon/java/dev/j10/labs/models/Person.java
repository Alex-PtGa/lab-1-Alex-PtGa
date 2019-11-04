package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
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
    // поменял поле Passport на String_
    // не получилось передать переменные класса Passport в объект Person...
    // можно в последующем их сравнить при необходимости 
    
    private String surname, name, patronymic; 
    private String secondname;
    private Passport passport;
    private Address address;
   
/**
 * Основной конструктор класса {@link Person}.
 *
 * @param surname   Фамилия человека
 * @param name      имя человека
 * @param patronymic   отчество человека
 */
   
   public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    //-/--/-/-/-/-/-Вариант передачи параметров Passport/-/-/-/-/-/-/-/-/-/-/-/-/-/-//-/-/- 
    public Person(Passport passport) { 
     this.passport = passport;
    }
    
      public String getSurName() {  
          return surname;    
      }
      
      public void setSurName(String surname) {       
          this.surname = surname;    
      }
      
      public String getName() {        
          return name;    
      }
      public void setName(String name) {      
          this.name = name;    
      }
      
      public String getPatronymic() {        
          return patronymic;
      }
      public void setPatronymic(String patronymic) {
          this.patronymic = patronymic;    
      }
      
      public String getSecondName() {      
          return secondname;    
      }
      public void setSecondName(String secondname) {     
          this.secondname = secondname;    }

      public Passport getPassport() {     
          return passport;   
      }
      public void setPassport(Passport passport) {     
          this.passport = passport;    
      }

      public Address getAddress() {     
          return address;
      }
      public void setAddress(Address address) {   
          this.address=address;    
      }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
           
      String getfullName (String surname, String name, String patronymic, String secondname) {
       if(secondname == null) {
           System.out.println(name + " " + surname + " " + patronymic);
       }
       else if(patronymic == null) { 
           System.out.println(name + " " + secondname.charAt(0) + ". " + surname);
       }
      else if(secondname == null && patronymic == null) { 
           System.out.println(name + " " + surname);
       }
          /*
           * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
           */
        return surname + name + patronymic + secondname;
      }
    
// переопределение метода toString() для вывода в основном методе в консоль данных   
    @Override
    public String toString() {
        return "Имя: " + name + "Отчество: " + patronymic + "Фамилия: " + surname;
    }
    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @param address
     * @return адрес регистрации в виде строки.
     */
    public Address getAddress(Address address) {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        
        return address;
    }
}