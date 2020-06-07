class printMyName{
    public static void main(String args[]) {
        // System.out.println(5/2);
        // int m = 0;
        // if (m++ >0) {
        //     System.out.println(1);
        // } else {
        //     System.out.println("hello");
        // }
        int m = 0;
        char ch = 'A';
        switch(ch) {
            case 9 :
            case 'a': m = m+1;;
            break;
            case 'A': m = m+1;
            case 66: m = m+1;
            default: m = m+3;
        }

        System.out.println(m);
    }
}
