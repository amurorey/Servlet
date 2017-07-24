package javademo.module;

/**
 * Created by amuro on 2017-07-23.
 * TODO关于数据库orm映射等研究后再用
 */
public class Administrator {

    private String userName;
    private String passWord;
    private String Name;
    private String KSCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getKSCode() {
        return KSCode;
    }

    public void setKSCode(String KSCode) {
        this.KSCode = KSCode;
    }
}
