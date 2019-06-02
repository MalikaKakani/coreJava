public class Main {

    public static void main(String[] args) {

        ParentJava parentJava = new ParentJava();
        parentJava.printParentProperties();

        parentJava = new ChildJava();
        parentJava.printParentProperties();

        parentJava = new AnotherChild();
        parentJava.printParentProperties();

        ChildProperties childProperties = new ChildJava();
        childProperties.printChildProperties();

        System.out.println("Child Java instance of Child Propeties " + (childProperties instanceof ChildJava));

        childProperties = new AnotherChild();
        childProperties.printChildProperties();

        System.out.println("Child Java instance of Child Propeties " + (childProperties instanceof AnotherChild));

    }
}
