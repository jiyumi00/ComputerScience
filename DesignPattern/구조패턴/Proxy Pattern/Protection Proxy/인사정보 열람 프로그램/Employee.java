public class Employee implements IEmployee{
    private String name;
    private RESPONSIBISITY position;

    public Employee(String name,RESPONSIBISITY position){
        this.name=name;
        this.position=position;
    }
    public String getName(){
        return name;
    }
    public RESPONSIBISITY getPosition(){
        return position;
    }
    @Override
    public String getInfo(IEmployee viewer){
        return "조회 "+getPosition().name()+" '"+getName()+"' 개인 정보";
    }
}
