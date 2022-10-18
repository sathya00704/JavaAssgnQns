import java.util.*;
public class MobilePhone {
    int m_no;//Model Number
    String mfg_name,color;//Manufacturer name, Colour
    float cost,size;//Cost,Size
    int mem_cap,cps;//MemoryCapacity, CameraPixelSize

    MobilePhone()//Default Constructor 
    {
        m_no=0;
        cost=0;
        size=0;
        mem_cap=0;
        cps=0;
    }

    MobilePhone(int no, int mc, int c)//3-arg constructor
    {
        m_no = no;
        mem_cap = mc;
        cps = c;
        System.out.println();
        System.out.println("Model number = " + m_no);
        System.out.println("Memory capacity = " + mem_cap + "GB");
        System.out.println("Camera pixel size = " + cps + "pixels");
    }

    MobilePhone(String mn, String clr, float amt, float sizevar)//4-arg constructor
    {
        mfg_name=mn;
        color=clr;
        cost=amt;
        size=sizevar;
        System.out.println("Manufacturer name = " + mfg_name);
        System.out.println("Color = " + color);
        System.out.println("Cost = Rs." + cost);
        System.out.println("Size = " + size + "inches");
    }

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        MobilePhone m = new MobilePhone();
        int no,mc,c;
        String mn,clr;
        float amt,sizevar;

        System.out.print("Enter model number = ");
        no = obj.nextInt();

        System.out.print("Enter Manufacturer name = ");
        mn = obj.next();

        System.out.print("Enter Color = ");
        clr = obj.next();

        System.out.print("Enter cost = ");
        amt = obj.nextFloat();

        System.out.print("Enter size = ");
        sizevar = obj.nextFloat();

        System.out.print("Enter memory capacity = ");
        mc = obj.nextInt();

        System.out.print("Enter camera pixel size = ");
        c = obj.nextInt();

        MobilePhone para3 = new MobilePhone(no, mc, c);
        MobilePhone para4 = new MobilePhone(mn, clr, amt, sizevar);
    }
}