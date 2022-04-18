public class lacta implements iFabrica {

    @Override
    public iOvos ovoDePascoa1() {
        return new aoLeite();
    }

    @Override
    public iOvos ovoDePascoa2() {
        return new oreo();
    }

    @Override
    public iOvos ovoDePascoa3() {
        return new sonhoDeValsa();
    }



    
}
