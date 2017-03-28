import java.io.*;

class Serialize implements Serializable {

    private int i;

    Serialize(int i) {
        this.i = i;
    }


    public int getI() {

        return i;
    }

    public void setI(int i) {

        this.i = i;
    }
}


public class Serialization {

    public static void main (String args []) throws ClassNotFoundException, IOException {

        Serialize objToSerialize = new Serialize(10);

        // Now serialize objToSerialize to a file on file system
        File file = new File("Serialization/src/SaveObjState.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(objToSerialize);
        objectOutputStream.close();
        fileOutputStream.close();

        // Now deserialize objToSerialize from the file and write to system.out.println
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Serialize objToDeserialize = (Serialize) objectInputStream.readObject();
        System.out.println("Value of i = " + (objToDeserialize.getI()));
        objectInputStream.close();
        fileInputStream.close();

    }

}