public class arraysop {
    public static void main(String[] args) {
        // float [] marks = {12.5f,15.5f,87,85,87};
        // String [] marks = {"Aniket", "Ganesh", "Sanket", "Pravin", "Vaibhav"};

        int[] marks = {12, 15, 87, 85, 87};
        // System.out.println(marks.length);

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // print using for loop
        // for(int i=0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        // display array element in reverse order
        // for(int i=marks.length-1; i>=0; i--){
        //     System.out.println(marks[i]);
        // }

        // display array element using for each loop
        for(int element: marks){
            System.out.println(element);
        }

    }
}