package LatihanUAP;

public class Tomat extends Tanaman implements Perawatan {

    Tomat() {
        super.setMasaHidup(100);
        super.setBerbuah(100);
        super.setPerkembangan(0.25);
        super.setNama("Tomat");
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
