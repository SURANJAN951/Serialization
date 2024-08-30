import java.io.*;

class Cricketer implements Serializable
{
// Hum is data ko serialize karna chahte hain taaki agar koi isey hack bhi
// kar le to usay hamara data samajh na aaye

    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}



public class SerializationEx {
    public static void main(String[] args) throws Exception {
        Cricketer c=new Cricketer("Sachin",44,3000);
        FileOutputStream fos=new FileOutputStream("my.txt");
        BufferedOutputStream bos= new BufferedOutputStream(fos);
        ObjectOutput oos=new ObjectOutputStream(bos);

        oos.writeObject(c);
        oos.flush();
        oos.close();

    }
}
