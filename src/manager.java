public class manager extends Employee {
    private int bonus;
    public manager(String name, int salary,int bonus) {
        super(name, salary);
        this.bonus=bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void manageWay(){
        System.out.println(name+"的管理方法是摸鱼");
    }

    public int getAnnual() {
        return super.getAnnual()+bonus;
    }
}
