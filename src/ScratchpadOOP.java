public class ScratchpadOOP {
    class Student {
        public String name;
        public String cohort;

////////////////////////////////////////////////
// Can do this to create constructor, or..... //
////////////////////////////////////////////////
//        public Student(String name) {             //////////////////////////
//            this.name = name;           ///// FIRST CONSTRUCTOR: METHOD ONE
//            cohort = "Unassigned";                //////////////////////////
//        }
        
////////////////////////////////////////////////////
// .....call on the 2nd constructor's properties  //
////////////////////////////////////////////////////
        public Student(String name) {                       //////////////////////////
            this(name, "Unassigned");      ///// FIRST CONSTRUCTOR: METHOD TWO
        }                                                   //////////////////////////

        public Student(String name, String cohort) {    //////////////////
            this.name = name;               ///// SECOND CONSTRUCTOR /////
            this.cohort = cohort;                       //////////////////
        }

        public String sayHello() {
            return "Hello from " + this.name + "!";
        }
    }
}
