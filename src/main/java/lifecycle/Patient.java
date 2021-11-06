package lifecycle;

public class Patient {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void init(){
        System.out.println("Properties set on Patient");
    }

    public void destroy(){
        System.out.println("Destroying Patient");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
