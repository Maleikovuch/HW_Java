import java.io.*;

class HW_2 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String str;
        String[] in_str;
        double[] a_b = new double[2];
        int numbers;
        int i = 0;
        while ((str = br.readLine()) != null) {           
            in_str = str.split("\\D+");
            numbers = Integer.parseInt(String.join("", in_str));
            a_b[i] = numbers;
            // i++;
        }
        br.close();
        
    
        double result = Math.pow(a_b[0], a_b[1]);
        System.out.println(result);
        newFile(result);

    }

    public static void newFile(double result) {
        try {
            PrintWriter printWriter = new PrintWriter("output.txt");
            printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException ex) {

        }
    }
}
