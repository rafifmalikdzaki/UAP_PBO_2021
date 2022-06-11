package LatihanUAP;

public class Persik extends Tanaman implements Perawatan {

    Persik() {
        super.setMasaHidup(180);
        super.setBerbuah(250);
        super.setPerkembangan(0.15);
        super.setNama("Persik");
    }

    @Override
    public void treatment() {
        super.setPerkembangan(super.getPerkembangan() + 0.025);
    }

    @Override
    public void berkembang() {
        super.setProsesBerbuah(super.getProsesBerbuah() + super.getBerbuah() * super.getPerkembangan());
        super.setLamaHidup(super.getLamaHidup() + 1);
        if (super.getProsesBerbuah() >= super.getBerbuah()) {
            super.setBuah(super.getBuah() + 1);
            super.setProsesBerbuah(super.getProsesBerbuah() - super.getBerbuah());
        }
    }

}
