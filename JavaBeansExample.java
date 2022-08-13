package baris.kaplan;

public class JavaBeansExample implements java.io.Serializable{
       private String name;
       private boolean deceased;

       public JavaBeansExample() { //no argument constructor

       }

       public String getName() {

           return this.name;
       }




       public void setName(final String name) {
           this.name = name;
       }


       public boolean isDeceased(){
           return this.deceased;
       }

       public void setDeceased(final boolean deceased) {
           this.deceased = deceased;
       }
}
