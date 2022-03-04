/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdbaexample;
import java.util.*;
public class PersonList {
    
    //utility method to create a list
        public static List<Person> getList()
    {
      List<Person> pList=new ArrayList<>();
      pList.add(new Person("Nandini","Shamdasani",40));
      pList.add(new Person("Padam","Shamdasani",40));
      pList.add(new Person("Delisha","Shamdasani",16));
        System.out.println("Person List as follows");
        System.out.println(pList);
        return pList;
    }
}
