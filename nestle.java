public class nestle implements iFabrica {

    @Override
    public iOvos ovoDePascoa1() {
        // TODO Auto-generated method stub
        return new alpino();
    }

    @Override
    public iOvos ovoDePascoa2() {
        // TODO Auto-generated method stub
        return new classic();
    }

    @Override
    public iOvos ovoDePascoa3() {
        // TODO Auto-generated method stub
        return new kitkat();
    }



}
