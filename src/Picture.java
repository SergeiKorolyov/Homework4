import java.util.ArrayList;
import java.util.List;

public class Picture {
    private List<Figures> list = new ArrayList<>();


    public List<Figures> getList() {
        return list;
    }

    public void setList(List<Figures> list) {
        this.list = list;
    }

    public Picture(List<Figures> list) {
    }
}

