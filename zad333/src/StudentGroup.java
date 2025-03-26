import java.util.ArrayList;
import java.util.List;

public class studentgroup {
    public String nazwa;
    public List <String> sklad = new ArrayList<String>();

    public void addtogroup (String index){
        if(sklad.size()>15){
            throw new RuntimeException("max liczba studentow w grupie to 15");
        }
        if(sklad.contains(index)){
            throw new RuntimeException("ten student juz jest w grupie");
        }
        sklad.add(index);
    }
}
