public class worker extends Employee{
    public worker(String name, int salary) {
        super(name, salary);
    }
    public void workWay(){
        System.out.println(name+"的工作方法是只要干不死，就往死里干");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual()+1;
    }
}
