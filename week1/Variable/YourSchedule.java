public class YourSchedule{

    public static void main (String[] args){
        
        /**
         * Courses
         */
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";

        String[] courses = {course1,course2,course3,course4,course5,course6,course7,course8};

        /**
         * Teachers
         */
        String teacher1 = "Ms. Lapan ";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = " Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        String[] teachers = {teacher1,teacher2,teacher3,teacher4,teacher5,teacher6,teacher7,teacher8};

        String rightAlignFormat = "| %1d | %38s | %15s |%n";
        System.out.format("+--------------------------------------------------------------+%n");

        for(int i = 0;i < 8; i++){
            System.out.format(rightAlignFormat, i+1,  courses[i], teachers[i]);

        } 

        System.out.format("+--------------------------------------------------------------+%n");
    }
}