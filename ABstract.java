//lang : java, using abstruct/interface, implement,override,object creation.
interface Lord {
void avathat1();

void avathat2();

void avathat3();

void avathat4();

void avathat5();

void avathat6();

void avathat7();

void avathat8();

void avathat9();

void avathat10();
}

class God implements Lord {

@Override
public void avathat1() {
// TODO Auto-generated method stub
System.out.println("1. The lord Matsya");
}

@Override
public void avathat2() {
// TODO Auto-generated method stub
System.out.println("2. The lord Kurma");
}

@Override
public void avathat3() {
// TODO Auto-generated method stub
System.out.println("3. The Lord Varaha");
}

@Override
public void avathat4() {
// TODO Auto-generated method stub
System.out.println("4. The Lord Narasimha");
}

@Override
public void avathat5() {
// TODO Auto-generated method stub
System.out.println("5. The Lord Vamana");
}

@Override
public void avathat6() {
// TODO Auto-generated method stub
System.out.println("6. The Lord Parashurama");
}

@Override
public void avathat7() {
// TODO Auto-generated method stub
System.out.println("7. The lord Ram");
}

@Override
public void avathat8() {
// TODO Auto-generated method stub
System.out.println("8. The lord Krishna");
}

@Override
public void avathat9() {
// TODO Auto-generated method stub
System.out.println("9. Lord bhuda");
}

@Override
public void avathat10() {
// TODO Auto-generated method stub
System.out.println("10. Lord Kalki");
}

}

public class Avathar {

public static void main(String[] args) {

Lord l = new God();
l.avathat1();
l.avathat2();
l.avathat3();
l.avathat4();
l.avathat5();
l.avathat6();
l.avathat7();
l.avathat8();
l.avathat9();
l.avathat10();

}

}

