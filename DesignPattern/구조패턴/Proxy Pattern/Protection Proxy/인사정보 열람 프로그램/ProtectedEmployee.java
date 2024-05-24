public class ProtectedEmployee implements IEmployee{

    private IEmployee employee;
    public ProtectedEmployee(IEmployee employee){
        this.employee=employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public RESPONSIBISITY getPosition() {
        return employee.getPosition();
    }

    @Override
    public String getInfo(IEmployee viewer) {
        RESPONSIBISITY position=this.employee.getPosition();

        switch (viewer.getPosition()) {
            case DIRECTOR:
                return this.employee.getInfo(viewer);
            case MANAGER:
                if (position != RESPONSIBISITY.DIRECTOR) {
                    return this.employee.getInfo(viewer);
                }
            case STAFF:
                if (position != RESPONSIBISITY.DIRECTOR && position != RESPONSIBISITY.MANAGER) {
                    return this.employee.getInfo(viewer);
                }
            default:
                return "다른 사람의 인사정보를 조회할 수 없습니다";
        }
    }
}
