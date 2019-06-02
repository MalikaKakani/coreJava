public class CallingEncapsulation {

    public static void main(String args[])
    {
        EncapsulationGetterSetter obj = new EncapsulationGetterSetter();

        obj.setAge(31);
        obj.setSsn(1234);
        obj.setName("Malika");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSsn());
    }
}
