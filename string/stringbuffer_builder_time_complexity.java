public class stringbuffer_builder_time_complexity {

    public static void main(String[] args) {
        

        // Maulik Parikh
        
        // StringBuilder sBuilder = new StringBuilder("Maulik");

        double startTime = (double)System.currentTimeMillis();

        System.out.println(startTime);
        
        StringBuffer sBuffer = new StringBuffer("Maulik");
        sBuffer.append(" Parikh");

        double endTime = (double) System.currentTimeMillis();

        System.out.println(endTime);

        System.out.println(endTime - startTime);
        
        System.out.println(sBuffer.insert(0, "Bhai", 0, 4));

        System.out.println(sBuffer.subSequence(3, 10));

        System.out.println(sBuffer.replace(0, 5, "Arpit"));

        // System.out.println(str.);
    }
    
}
