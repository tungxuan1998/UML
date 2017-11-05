public class Method extends UMLComponent {
    private String attributeTypes;

    public Method(String declaration) {
        String[] prototype = Parser.getMethodDeclaration(declaration);

        String[] parts = prototype[0].split("\\s+");
        int len = parts.length;

        name = parts[len - 1];

        for (int i = len - 2; i >= 0; --i) {
            String cur = parts[i];
            if (cur.equals("static"))
                isStatic = true;
            else if (cur.equals("abstract"))
                isAbstract = true;
            else if (cur.equals("final"))
                isFinal = true;
            else if (modifiers.contains(cur))
                accessModifier = cur;
            else
                type = cur;
        }

        parts = prototype[1].split(" ");
        len = parts.length;
        attributeTypes = parts[0];
        for (int i = 2; i < len; i += 2)
            attributeTypes += ", " + parts[i];
    }

    /**
    * @return a string representation of Method for printing
    */
    @Override
    public String toString() {

        String s = "";
        if (accessModifier != null) s += accessModifier + " ";
        if (isAbstract) s += "abstract ";
        if (isStatic)   s += "static ";
        if (isFinal)    s += "final ";
        if (type != null) s += type + " ";

        return s  + name + "(" + attributeTypes + ")";
    }

    public static void main(String[] args) {

        String s = "public static void main(String[] args)";
        Method test = new Method(s);
        System.out.println(test);
    }
}
