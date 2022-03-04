/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamdbaexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class LamdbaExample {

   
    public static void main(String[] args) {
//     // Implemetation of Anonymous class -- Messy code
//        Anonymous obj=new Anonymous() {
//            @Override
//            public void show() {
//                System.out.println("Hello welcome");
//            }
//        };
//        
//        obj.show();

// Using lamdba expression -- Clear and Concise code

/*Anonymous obj=()->System.out.println("Implementing Anonymous");
obj.show();

Anonymous lambda =() -> System.out.println("Welcome lamdba");
lambda.show();
// Implementing Runnable using anonymous class (Old way)
    Runnable runnable1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
      }
    };
    Thread thread1 = new Thread(runnable1);

    // Implementing Runnable using Lambda expression
    Runnable runnable2 = () -> {
      System.out.println("Thread name : " + Thread.currentThread().getName());
    };
    Thread thread2 = new Thread(runnable2);

    // Start Threads
    thread1.start();
    thread2.start();

List<Person> pList=PersonList.getList();

//comparator implementation as Anonymous class

Collections.sort(pList,new Comparator<Person>()
{
    @Override
    public int compare(Person o1, Person o2) {
      return o1.getFirstName().compareTo(o2.getFirstName());
    }
    
});
//Displaying Sorted elements
     Iterator it=pList.iterator();
     while(it.hasNext())
     {


         System.out.println(it.next());
     }
     
  // comparator FI compare method as Lambda expression
     Collections.sort(pList, (Person a, Person b)-> a.getFirstName().compareTo(b.getFirstName()));
   
   pList.forEach((per)->System.out.println(per.getFirstName())); */
  // List of Integer - unique values
   
  
 /* List<Integer> arList=Arrays.asList(1,2,3,4,2,1,4,5);
   
   
        System.out.println("the distinct elements are");
        
    
     
     arList.stream().distinct().forEach(System.out::println);
   
     System.out.println("============ List of Unique elements===========");      
       comp.stream().sorted().forEach(System.out::println);
     List<Integer> u=
     arList.stream()
             .distinct()
             .collect(Collectors.toList());
        System.out.println(u); 
 
 
        System.out.println("====== Sorting Elements using Collections =======");
        
        List<String> comp=new ArrayList<String>();
       comp.add("Wireless Printer");
        comp.add("Dell");
        comp.add("Wireless Mouse");
        comp.add("Keyboard");
  
  // obtain a stream of an existing Array
  
  Stream.of(comp);
        
        Comparator<String> com=(String o1, String o2)->o1.compareTo(o2);
        Collections.sort(comp,com);
        for(String name : comp)
        {
            System.out.println(name);
        }
              
        
        System.out.println("========= Sorting Elements using Stream API=======");
      
        comp.stream().sorted().forEach(System.out::println); 
 
 
 Stream<String> names = Stream.of("Jitendra","Apoorva","Tejas","Siddhant","Madhuri","Chenna","Saurabh","Ayesha");
 
 List<String> sorted=names.sorted().
         collect(Collectors.toList());
 
        System.out.println(sorted);
 
                        
        
        System.out.println(StringDemo.isCharactersOnly("Welcome"));
        System.out.println(StringDemo.isCharactersOnly("Welcome2")); */
        System.out.println("======== of Max length 4 Characters without Lambda======");
        List<String> strList=Arrays.asList("Nandini","", "Padam","Delisha","", "Nand","RAj","Bhavi","Palak","Kimaya");
        StringDemo.countLetters(strList);
        
        System.out.println("==== of Max 5 Elements using Lambda=====");
        
    
        StringLengthLambda sLambda=()-> {
            strList.stream().limit(5).forEach(System.out::println);
                };
        
        sLambda.printData();
        
        System.out.println("====== String of Length greater than 6 characters using Lambda======");
        
       
        
        
        Stream<String> lenSix= strList.stream()
                .filter(str->str.length()>=4 && str.length()<=6 );
                
        lenSix.forEach(System.out::println); 
        
        System.out.println("====== Square of Distinct Integers====");
        List<Integer> arList=Arrays.asList(1,2,3,4,2,1,4,5);
        
        List<Integer> sqList=arList.stream()
                .distinct()
                .map(sq->sq*sq)
                .collect(Collectors.toList());
        System.out.println(sqList);
        
        System.out.println("======= Even numbers");
        
        arList.stream()
                .filter(n-> n %2 ==0)
                .forEach(System.out::println);  
        
        
        // filter
        System.out.println("====== Starts with N =========");
        long count=strList.stream()
                .filter(x->x.startsWith("N")).count();
        
        System.out.println(count);
        
        
        // Empty strings
        System.out.println("====== Removing Empty=======");
       List<String> elist= strList.stream().
                filter(x->!x.isEmpty()).
                collect(Collectors.toList());
        System.out.println(elist);
        
    
        }
    
    
    
    
    
    
}
 