public class garoto implements iFabrica {

    @Override
    public iOvos ovoDePascoa1() {
        return new crocante();
    }

    @Override
    public iOvos ovoDePascoa2() {
        return new talento();
    }

    @Override
    public iOvos ovoDePascoa3() {
        return new batonAoLeite();
    }     




}
