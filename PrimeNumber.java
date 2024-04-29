
class PrimeNumber {
    // 2 //3 //5 //7 //11  //13. //17 

    public static void main(String[] args) {


        
        for (int i = 2; i <= 100; i++) {  // 5  // 23
            
            // 97   // 55  // 30  // 55

            // 2..96  // 2..54  // 2..29

            boolean kaivan = false;


            for (int j = 2; j < i; j++) { // 2..54  // 2..22

                if (i % j == 0) {
                    kaivan = true;
                    break;
                }

            }

            if (!kaivan) {
                System.out.println(i+" ");
            }

        }

    }

}