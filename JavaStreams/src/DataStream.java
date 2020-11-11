
import java.io.*;


public class DataStream {

    public static void main(String[] args) {
        // DataInputStream - read java primitives
        // DataOutputStream - write java primitives
        File file = new File("fichier3.txt");

        if (file.exists()) {

            System.out.println("File already exists! " + file.getName());
            // The file absolute path created here
            System.out.println("File path: " + file.getAbsolutePath());

        }else {
            try {

                if(file.createNewFile()) {

                    System.out.println("File was created. ");

                    // The file absolute path created here
                    System.out.println("File path: " + file.getAbsolutePath());

                }else {

                    System.out.println("File cannot be created. ");
                }

            }catch(Exception e) {
                System.out.println(e.toString());
            }
        }


        // Read or write data from this file using DataStream
        try {

            // Write data from this file using DataStream
            DataOutputStream output = new DataOutputStream(new FileOutputStream(file.getName()));
            output.writeInt(72);
            output.writeDouble(678.00);
            output.writeFloat(123.45F);

            // Read data from this file using DataStream
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
            int var1 = in.readInt();
            double var2 = in.readDouble();
            float var3 = in.readFloat();

            System.out.println("Integer value: " + var1);
            System.out.println("Double value: " + var2);
            System.out.println("Float value: " + var3);

            output.close();

            // Optionally written
            in.close();

        }catch(Exception e) {
            System.out.println(e.toString());

        }

    }

}
