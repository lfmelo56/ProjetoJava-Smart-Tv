public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(17);
        
        System.out.println("Canal atual?:" + smartTv.canal);

        System.out.println("Volume atual:" + smartTv.volume);
        
        System.out.println("Tv Ligada?" + smartTv.ligada);
        System.out.println("Volume atual:" + smartTv.volume);

    }

}