import java.util.Scanner;
public class BookAppointment extends Thread
{
    private Hospital h1;
    private Patient p;
    private boolean doctorfound = false;
    
    public BookAppointment(Hospital h1, Patient p)
    {
        this.h1=h1;
        this.p = p;
    }

    public void run()
    {
        Scanner sc = new Scanner(System.in);
        int h = 0;
        System.out.println("ENTER THE SPECIALISATION OF DOC:");
        String special = sc.nextLine();
        System.out.println();

        for(int i=0; i<h1.wards.size(); i++)
        {
            for(int j=0; j<h1.wards.get(i).doctors.size(); j++)
            {
                if(h1.wards.get(j).doctors.get(j).getSpecialisation().equals(special))
                {
                    if(h1.wards.get(j).doctors.get(j).isAvailable)
                    {
                        doctorfound = true;
                        h = j;
                    }
                }
            }
        }

        if(doctorfound)
        {
            h1.wards.get(h).doctors.get(h).assignPatient(p);
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("PATIENT: "+this.p.getName()+"'s APPOINTMENT SUCCESFFULLY BOOKED WITH DOCTOR: "+h1.wards.get(h).doctors.get(h).getName());
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            p.appointDoc(h1.wards.get(h).doctors.get(h));
        }
        else
        {
            System.out.println("DOCTOR NOT AVAILABLE !");
        }

    }
}
