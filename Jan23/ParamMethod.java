class ParamMethod {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        ParamMethod obj = new ParamMethod();

        if (args.length == 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            obj.add(a, b);
        } else {
            obj.add(10, 20);
        }
    }
}
