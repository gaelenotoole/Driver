import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("john");
        student1.setAge("20");
        student1.setID("13532086");
        student1.setDOB("07-05-1996");

        Student student2 = new Student();
        student2.setName("Mick");
        student2.setAge("22");
        student2.setID("1234566");
        student2.setDOB("04-03-1994");

        Student student3 = new Student();
        student3.setName("Tim");
        student3.setAge("24");
        student3.setID("1432966");
        student3.setDOB("06-04-1993");

        Student student4 = new Student();
        student4.setName("Mary");
        student4.setAge("23");
        student4.setID("35127836");
        student4.setDOB("09-12-1988");


        Module module1 = new Module();
        module1.setModuleName("Biology");
        module1.setModuleID("BI123");

        Module module2 = new Module();
        module2.setModuleName("French");
        module2.setModuleID("FR456");

        Module module3 = new Module();
        module3.setModuleName("Mathematics");
        module3.setModuleID("MA789");

        Module module4 = new Module();
        module4.setModuleName("Digital Systems");
        module4.setModuleID("DS135");

        Module module5 = new Module();
        module5.setModuleName("English");
        module5.setModuleID("EN246");


        ProgrammeClasses Course1 = new ProgrammeClasses();
        Course1.setCourse("Arts");


        ProgrammeClasses Course2 = new ProgrammeClasses();
        Course2.setCourse("Engineering");

        Course1.listOfModules.add(module2);
        Course1.listOfModules.add(module5);
        Course2.listOfModules.add(module1);
        Course2.listOfModules.add(module3);
        Course2.listOfModules.add(module4);

        module1.Students.add(student1);
        module1.Students.add(student4);

        module2.Students.add(student3);
        module2.Students.add(student4);

        module3.Students.add(student2);
        module3.Students.add(student1);

        module4.Students.add(student3);
        module4.Students.add(student2);

        module5.Students.add(student3);
        module5.Students.add(student1);



        ArrayList<Module> ARTSmods = Course1.getListOfModules();
        ArrayList<Module> ENGmods = Course2.getListOfModules();

        ArrayList<Student> BIOStuds = module1.getStudents();
        ArrayList<Student> FREStuds = module2.getStudents();
        ArrayList<Student> MATStuds = module3.getStudents();
        ArrayList<Student> DIGStuds = module4.getStudents();
        ArrayList<Student> ENGStuds = module5.getStudents();

        System.out.println("\n\n* * * * * Arts Modules * * * * ");
        for(int i = 0 ; i < ARTSmods.size() ; i++){
            System.out.println(ARTSmods.get(i).getModuleName());
        }

        System.out.println("\n\n* * * * * Engineering Modules * * * * ");
        for(int i = 0 ; i < ENGmods.size() ; i++){
            System.out.println(ENGmods.get(i).getModuleName());
        }

        System.out.println("\n\n* * * * * Biology Students * * * * ");
        for(int i = 0 ; i < BIOStuds.size() ; i++){
            System.out.println(BIOStuds.get(i).getName()+ "- - " + BIOStuds.get(i).getUsername());
        }

        System.out.println("\n\n* * * * * French Students * * * * ");
        for(int i = 0 ; i < FREStuds.size() ; i++){
            System.out.println(FREStuds.get(i).getName()+ "- - " + FREStuds.get(i).getUsername());
        }

        System.out.println("\n\n* * * * * Mathematics Students * * * * ");
        for(int i = 0 ; i < MATStuds.size() ; i++){
            System.out.println(MATStuds.get(i).getName()+ "- - " + MATStuds.get(i).getUsername());
        }

        System.out.println("\n\n* * * * * Digital Systems Students * * * * ");
        for(int i = 0 ; i < DIGStuds.size() ; i++){
            System.out.println(DIGStuds.get(i).getName()+ "- - " + DIGStuds.get(i).getUsername());
        }

        System.out.println("\n\n* * * * * English Students * * * * ");
        for(int i = 0 ; i < DIGStuds.size() ; i++){
            System.out.println(DIGStuds.get(i).getName()+ "- - " + DIGStuds.get(i).getUsername());
        }

    }
}