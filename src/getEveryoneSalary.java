public class getEveryoneSalary {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.name + "的薪水是:" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof worker) {
            worker worker1 = (worker) e;
            worker1.workWay();
        } else {
            manager manager1 = (manager) e;
            manager1.manageWay();
        }
    }
}
