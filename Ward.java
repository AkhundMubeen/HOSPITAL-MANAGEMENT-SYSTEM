import java.util.ArrayList;

public class Ward 
{
    private String name;
    private Hospital hospital;
    public ArrayList<Patient> patients;
    public ArrayList<Doctor> doctors;

    public Ward(String name, Hospital hospital)
    {
        this.name = name;
        this.hospital = hospital;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void addPatient(Patient patient) throws Exception
    {   
        boolean patientFound = false;
        for(int i=0; i<patients.size(); i++)
        {
            if(patient.getName().equals(patients.get(i).getName()))
            {   
                patientFound = true;
            }
        }
            if(patientFound)
            {
                throw new Exception("PATIENT ALREADY ADMITTED !");
            }
            else
            {
                System.out.println("PATIENT: "+patient.getName()+" ADMITTED SUCCESSFULLY IN "+this.getName());
                patient.setHospital(this.hospital);
                patients.add(patient);
            }
    }

    public void addDoctor(Doctor doctor) throws Exception
    {   
        boolean docFound = false;
        for(int i=0; i<doctors.size(); i++)
        {
            if(doctor.getName().equals(doctors.get(i).getName()))
            {   
                docFound = true;
            }
        }

            if(docFound)
            {
                throw new Exception("DOCTOR ALREADY THERE IN "+this.getName());
            }
            else
            {
                System.out.println("DOCTOR: "+doctor.getName()+" ASSIGNED "+this.getName()+" WARD"+" SUCCESSFULLY");
                doctor.setHospital(this.hospital);
                doctors.add(doctor);
            }
    }

    public void removeDoctor(Doctor doctor) throws Exception
    {
        boolean docFound = false;
        int k = 0;
        for(int i=0; i<doctors.size(); i++)
        {
            if(doctor.getName().equals(doctors.get(i).getName()))
            {   
                docFound = true;
                k=i;
            }
        }
            if(docFound)
            {
                doctors.remove(k);
                System.out.println("DOCTOR: "+doctor.getName()+" REMOVED SUCCESSFULLY FROM "+this.getName());
            }
            else
            {
                throw new Exception("DOCTOR: "+doctor.getName()+" DONT EXIST AT ALL IN "+this.getName());
            }
    }

    public void removePatient(Patient patient) throws Exception
    {
        boolean patientFound = false;
        int k = 0;
        for(int i=0; i<patients.size(); i++)
        {
            if(patient.getName().equals(patients.get(i).getName()))
            {   
                patientFound = true;
                k=i;
            }
        }
            if(patientFound)
            {
                patients.remove(k);
                System.out.println("PATIENT: "+patient.getName()+" REMOVED SUCCESSFULLY !");
            }
            else
            {
                throw new Exception("PATIENT: "+patient.getName()+" DONT EXIST AT ALL IN HOSPITAL: "+this.name);
            }
    }

    public void getPateints()
    {
        for(int i=0; i<patients.size(); i++)
        {
            System.out.println(patients.get(i));
        }
    }

    public void getDocs()
    {
        for(Doctor d: doctors)
        {
            System.out.println(d);
        }
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {   
        System.out.println();
        System.out.print("WARD NAME: "+this.getName()+"\n");
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.print("PATIENTS IN "+this.getName()+"\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println();
        getPateints();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.print("DOCTORS WORKING IN "+this.getName()+":\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println();
        getDocs();
      
        return "";
    }
}
