public class Strings5 {
    public static void main(String[] args) {
        //concatenation
        String firstName = "Saniya";
        String lastName = "Kushwaha";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());
        //charat
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
