import java.util.*;
import java.io.*;
public class CustomerDatabase {

    ArrayList<Customer> list = new ArrayList<Customer>();
    ArrayList<Integer> l;
    

    public void addCustomer() throws IOException {
        
        BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\jakec\\Desktop\\ATM\\ATM-\\Text.in.txt"));
        
        Queue<Integer> q = new LinkedList<Integer>();
        l = new ArrayList<Integer>();

     

        int temp;
        String[] initValues;
        int count = 0;
        try {
            String contentLine = r.readLine();
            while (contentLine != null) {

                initValues = contentLine.split(" ");

                for (int i = 0; i < initValues.length; i++) {
                    temp = Integer.valueOf(initValues[i]);
                    l.add(temp);
                }
                contentLine = r.readLine();
                count++;
            }


        } catch (IOException ioe) {

            ioe.printStackTrace();
        } finally {
            try {
                if (r != null) {
                    r.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error");
            }
        }
        for (int i = 0; i < l.size(); i++) {
            q.add(l.get(i));
        }

        Customer c;
        int temp1, temp2, temp3;
        int len = count-3;
        
        for (int i = 0; i < q.size()+len; i++) {
            temp1 = q.element();
            q.remove();
            temp2 = q.element();
            q.remove();
            temp3 = q.element();
            q.remove();
            c = new Customer(temp1, temp2, temp3);
            list.add(c);
        }

    }

        
    
    public ArrayList<Customer> getList() {
        return list;
    }
  
}