class FinallyReturn{
    
    public static short checkIfFinallyReturnOverrides() {
        try{
            
            return 1;
        }catch(Exception e){
            
            return 2;
        }finally{
            //throw new RuntimeException("lakj");
            return 3;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(checkIfFinallyReturnOverrides());
    }
}