//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
        public static void main(String[] args) {
                getEveryoneSalary getEveryoneSalary = new getEveryoneSalary();
                Employee employee = new worker("朱皓月",15000);
                Employee employee1=new manager("胡强",15000,3000);
                getEveryoneSalary.showEmpAnnual(employee);
                getEveryoneSalary.testWork(employee);
                getEveryoneSalary.showEmpAnnual(employee1);
                getEveryoneSalary.testWork(employee1);
        }
        }

