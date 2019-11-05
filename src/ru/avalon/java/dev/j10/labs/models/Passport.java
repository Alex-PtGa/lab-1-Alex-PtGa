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
    public String surname, name, patronymic;
    private String secondName;
    private Calendar dateBirth, dateExtradite;
    private String nameOrganization;
        
    public Passport(String name, String surname, String patronymic, String secondName) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
     public Passport(String name, String surname, String patronymic, String secondName) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    } 
    
     public String getName() {  
        return name;   
    }
      public void setName(String name) {     
          this.name = name;    }
      
    public String getSurName() {     
        return surname;    
    }
      public void setSurName(String surname) {   
          this.surname = surname;    
      }
   
    public String getPatronymic() { 
        return patronymic;    
    }
      public void setPatronymic(String patronymic) {   
          this.patronymic = patronymic;    
      }
         
    public String getSecondName() {        
        return secondName;    
    }
      public void setSecondName(String secondName) {   
          this.secondName = secondName;   
      }
   /* // не используемые поля
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
   */       
   
/*      
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
*/
       @Override
    public String toString() {
        return "Имя: " + name + "Отчество: " + patronymic + "Фамилия: " + surname;
    }
}
