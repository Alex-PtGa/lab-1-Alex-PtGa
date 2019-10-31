package ru.avalon.java.dev.j10.labs.models;

import java.util.Calendar;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /**
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
   
    private int pasSer, pasNum;   // серия и номер документа
    private Person surname, name, patronymic, secondName;
    private Calendar dateBirth, dateExtradite;
    private String nameOrganization;
        
    public Passport(Person name, Person surname, Person patronymic)    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
    
    public Passport(int pasSer, int pasNum, Person name, Person surname, Person patronymic, Person secondName, 
                      Calendar dateBirth, Calendar dateExtradite, String nameOrganization)    {
        this.pasSer = pasSer;
        this.pasNum = pasNum;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.secondName = secondName;
        this.dateBirth = dateBirth;
        this.dateExtradite = dateExtradite;
        this.nameOrganization = nameOrganization;
    }
        
    public int getPasSer() {   
        return pasSer;    
    }
      public void setPasSer(int pasSer) {    
         this.pasSer=pasSer;    
      }

    public int getPasNum() {     
        return pasNum;    
    }
      public void setPasNum(int pasNum) {       
         this.pasNum=pasNum;    
      }
          
    public Person getName() {  
        return name;   
    }
      public void setName(Person name) {     
          this.name=name;    }
      
    public Person getSurName() {     
        return surname;    
    }
      public void setSurName(Person surname) {   
          this.surname = surname;    
      }
   
    public Person getPatronymic() { 
        return patronymic;    
    }
      public void setPatronymic(Person patronymic) {   
          this.patronymic=patronymic;    
      }
         
    public Person getSecondName() {        
        return secondName;    
    }
      public void setSecondName(Person secondName) {   
          this.secondName=secondName;   
      }
      
    public Calendar getDateBirth() {    
        return dateBirth;    
    }
      public void setDateBirth(Calendar dateBirth) {   
          this.dateBirth=dateBirth;
      }
      
    public Calendar getDateExtradite() {        
        return dateExtradite;    
    }
      public void setDateExtradite(Calendar dateExtradite) {        
          this.dateExtradite = dateExtradite;    
      }
    
    public String getNameOrganization() {     
        return nameOrganization;    
    }
      public void setNameOrganization(String nameOrganization) {    
          this.nameOrganization = nameOrganization;   
      }
}
