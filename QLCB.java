package bai1;
import java.util.ArrayList;
import java.util.List;

public  class QLCB{
    List<Canbo> dsCanbo = new ArrayList<Canbo>();
    public void add(Canbo canbo){
        this.dsCanbo.add(canbo);
    }
    public void searchOfficerByName(String name) {
        for(Canbo i:dsCanbo)
        {
            if(i.name.equals(name))
            {
                System.out.println(i.toString());
            }
        }
    }

    public void showListInforOfficer() {
        this.canbo.forEach(o -> System.out.println(o.toString()));
    }
}
    

