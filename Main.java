public class Main 
{
    public static void main(String[] args) 
    {   
        System.out.println();

        Hospital h1 = new Hospital("AGHA KHAN");
        Patient p1 = new Patient("ALI", 20, "033445566", "O+", "LIVER INFECTION");
        Doctor d1 = new Doctor("RAHI", 40, "0138393933", "CHILD SPECIALIST");
        Patient p2 = new Patient("AHMED", 20, "033445566", "O+", "LIVER INFECTION");
        
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        try
        {
        h1.addWard(new Ward("ICU", h1));
        h1.wards.get(0).addPatient(p1);
        h1.wards.get(0).addPatient(p2);
        h1.wards.get(0).addDoctor(d1);
        }
        catch(Exception e)
        {   
            System.out.println();
            System.out.println(e.getMessage());
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println();

        BookAppointment t1 = new BookAppointment(h1, p2);
       
        try
        {   
            t1.start();
            t1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println(h1);

    }    
}
