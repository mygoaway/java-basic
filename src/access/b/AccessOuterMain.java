package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default(package-private) 호출 불가 => 같은 패키지가 아님  AccessData => access.a, AccessOuterMain = access.b
        //data.defaultField = 2;
        //data.defaultMethod();

        // private 호출 불가

        // public 호출 가능
        data.innerAccess();

    }
}
