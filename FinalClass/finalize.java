class finalize{
    public void FinallizeEx(){
        System.out.println("Finallize Called");
    }

    public static void main(String[] args) {
        FinallizeEx f1 = new FinallizeEx();
        FinallizeEx f2 = new FinallizeEx();
        f1 = null;
        f2 = null;
        System.gc();
    }
}