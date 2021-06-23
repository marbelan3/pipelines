import java.util.Objects;

public class SecAndDescribe {

    public SecAndDescribe(int sec, String describe) {
        this.sec = sec;
        this.describe = describe;
    }

    public SecAndDescribe() {
    }

    int sec;
    String describe;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "SecAndDescribe{" +
                "sec=" + sec +
                ", describe='" + describe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecAndDescribe that = (SecAndDescribe) o;
        return sec == that.sec &&
                Objects.equals(describe, that.describe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sec, describe);
    }
}
