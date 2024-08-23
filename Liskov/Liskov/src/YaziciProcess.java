public class YaziciProcess {

    private Yazdir yazdir;
    private Tara tara;

    public YaziciProcess(Yazdir yazdir) {
        this.yazdir=yazdir;
    }

    public YaziciProcess(Tara tara) {
        this.tara=tara;
    }
    public void yazdir() {
        yazdir.yazdir();
    }
    public void tara() {
        tara.tara();
    }
}
