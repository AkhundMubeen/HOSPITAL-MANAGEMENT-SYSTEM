import java.util.ArrayList;
public class Hospital 
{
    private String name;
    public ArrayList<Ward> wards;
    
    public Hospital(String name)
    {
        this.name = name;
        wards = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void addWard(Ward ward) throws Exception
    {   
        boolean wardFound = false;
        for(int i=0; i<wards.size(); i++)
        {
            if(ward.getName().equals(wards.get(i).getName()))
            {   
                wardFound = true;
            }
        }
            if(wardFound)
            {
                throw new Exception("WARD: "+ward.getName()+" ALREADY EXITS IN "+this.getName());
            }
            else
            {
                System.out.println("WARD: "+ward.getName()+" ADDED SUCCESSFULLY IN "+this.getName());
                wards.add(ward);
            }
    }

    public void removeWard(Ward ward) throws Exception
    {   
        boolean wardFound = false;
        int k = 0;

        for(int i=0; i<wards.size(); i++)
        {
            if(ward.getName().equals(wards.get(i).getName()))
            {   
                wardFound = true;
                k=i;
            }
        }
            if(wardFound)
            {
                wards.remove(k);
                System.out.println("WARDS: "+ward.getName()+" REMOVED SUCCESSFULLY FROM "+this.getName());
            }
            else
            {
                throw new Exception("WARD: "+ward.getName()+" DOES NOT EXIST AT ALL IN "+this.getName());
            }
    }

    public void printWards()
    {
        for(Ward w: wards)
        {
            System.out.println(w);
        }
    }

    public String toString()
    {   
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.print("HOSPITAL NAME: "+getName()+"\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println();
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.print("WARDS IN "+getName()+":\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        printWards();
        
        return "";
    }
}
