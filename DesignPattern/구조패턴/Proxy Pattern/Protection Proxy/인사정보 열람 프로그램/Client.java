import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Client {
    public static void main(String[] args) {
        // 직원별 개인 객체 생성
        Employee CTO = new Employee("홍길동", RESPONSIBISITY.DIRECTOR.DIRECTOR);
        Employee devManager = new Employee("이순신", RESPONSIBISITY.MANAGER.MANAGER);
        Employee financeManager = new Employee("김영희", RESPONSIBISITY.MANAGER.MANAGER);
        Employee devStaff = new Employee("김철수", RESPONSIBISITY.STAFF.STAFF);
        Employee financeStaff = new Employee("아무개", RESPONSIBISITY.STAFF.STAFF);

        // 직원들을 리스트로 가공
        List<Employee> employees = Arrays.asList(CTO, devManager, financeManager, devStaff, financeStaff);

        //동적으로 Employee객체를 프록시 객체로
        List<IEmployee> protectedEmployees=new ArrayList<>();
        for(Employee e : employees){
            protectedEmployees.add(new ProtectedEmployee((IEmployee)e));
        }
        //나 : 신입사원 직책
        Employee me=new Employee("jiyun",RESPONSIBISITY.STAFF);
        System.out.println("\n======================================");
        System.out.println("시나리오1. 신입 사원인 내가 회사 인원 인사 정보 조회");
        System.out.println("========================================");
        PrintEmployeeInfo view=new PrintEmployeeInfo(me);
        view.printAllInfo(protectedEmployees);
        //view.printAllInfo(employees);
        //보안 문제!
        // 직위에 따른 정보 열람 접근 제한을 두도록 수정
        System.out.println("\n======================================");
        System.out.println("시나리오2. 과장이 회사 인원 인사 정보 조회");
        System.out.println("========================================");
        PrintEmployeeInfo view2=new PrintEmployeeInfo(devManager);
        view2.printAllInfo(protectedEmployees);

        System.out.println("\n======================================");
        System.out.println("시나리오3. 상무가 내가 회사 인원 인사 정보 조회");
        System.out.println("========================================");
        PrintEmployeeInfo view3=new PrintEmployeeInfo(CTO);
        view3.printAllInfo(protectedEmployees);

    }
}
