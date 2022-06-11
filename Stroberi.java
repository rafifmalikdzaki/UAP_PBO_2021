package LatihanUAP;

public class Stroberi extends Tanaman implements Perawatan {

    Stroberi() {
        super.setMasaHidup(60);
        super.setBerbuah(150);
        super.setPerkembangan(0.35);
        super.setNama("Stroberi");
    }

    @Override
    public void treatment() {
        super.setPerkembangan(super.getPerkembangan() + 0.05);
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
