import java.util.List;

public class PrintEmployeeInfo {
    IEmployee viewer; //조회하려는 자

    PrintEmployeeInfo(IEmployee viewer){
        this.viewer=viewer;
    }
    void printAllInfo(List<IEmployee> employees){
        employees.stream()
                .map(employee-> employee.getInfo(viewer))
                .forEach(System.out::println);
    }
}
