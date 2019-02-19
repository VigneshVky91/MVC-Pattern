public class StudentModel 
{
    String user;
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public boolean checkValues(StudentModel sm)
    {
        if(sm.getUser().equals("Ratanak"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
