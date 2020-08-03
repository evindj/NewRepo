class ForLoops {
    public static  void main(String[] args) {// begin
        for( int i = 5; i <= 5; i++ ) { // i++ <===> i = i +1
            System.out.println("one");
        }

        int arr[]={2,9,45,11};
        //         0  1  2 3 
        for(int i = 0; i < arr.length; i++) {// for(int i = 0; i < 4; i++)
            System.out.println(arr[i]);
        }

        System.out.println(" second method ");

        for (int num : arr) {
           System.out.println(num);
        }

        System.out.println(" While loop trial.");
        int j = 0;
        while( j < arr.length) {
            System.out.println(arr[j]);
            j++;
        }
        // j == 4 here
        j = 0;
        System.out.println(" Do while trial");
        
        do { //begin
            System.out.println(arr[j]);
            j++;
        } while(j < arr.length);// end

        System.out.println("value of j " + j);
    }// end
}