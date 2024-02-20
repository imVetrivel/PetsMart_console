package resources;

public class Users {

    private String name;

    private String role;

    private int id;

    private String email;

    private String password;

    private String s_role;

    private long c_num;

    public String getname() {
        return name;
    }

    public long getc_num() {
        return c_num;
    }

    public String getrole() {
        return role;
    }

    public String getemail() {
        return email;
    }

    public String getpassword() {
        return password;
    }

    public String gets_role() {
        return s_role;
    }

    public int getid() {
        return id;
    }

    public void setname(String n) {
        name = n;
    }

    public void setc_num(long n) {
        c_num = n;
    }

    public void setrole(String r) {
        role = r;
    }

    public void setemail(String mail) {
        email = mail;
    }

    public void sets_role(String role) {
        s_role = role;
    }

    public void setpassword(String pass) {
        password = pass;
    }

    public void setid(int i) {
        id = i;
    }
}
