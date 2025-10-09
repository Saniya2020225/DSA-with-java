public class String8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //chat at index
        System.out.println(sb.charAt(3));

        //set char at index
        sb.setCharAt(0 , 'p');
        System.out.println(sb);

        //insert index
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);
        sb.delete(2, 3);
        System.out.println(sb);
        
        //append the 's'
        sb.append("s");
        System.out.println(sb);
    }
}
