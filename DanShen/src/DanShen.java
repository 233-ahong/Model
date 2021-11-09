public class DanShen {
    private static DanShen danShen;
    private DanShen(){

    }
    public static DanShen getDanShen(){
        if (danShen==null){
            danShen=new DanShen();
        }
        return danShen;
    }
}
