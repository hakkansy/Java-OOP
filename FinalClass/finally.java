class finally{
    public static void main(String[] args) {
        try{
            int x = 7498894;
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}