import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

public class ButonKontrolPaneli extends JButton {

    private static ButonKontrolPaneli aktifButon = null;
    private static List<ButonKontrolPaneli> butonListesi = new ArrayList<>();

    private String graphQLSchemaAdresi;
    private Image aktifIcon;
    private Image pasifIcon;
    private Color aktifRenk;
    private Color pasifRenk;
    private boolean aktifDurum;

    public ButonKontrolPaneli(String metin, String graphQLSchemaAdresi, Image aktifIcon, Image pasifIcon,Color aktifRenk, Color pasifRenk) {
        super(metin);
        this.graphQLSchemaAdresi = graphQLSchemaAdresi;
        this.aktifIcon = resmiOlcekleme(aktifIcon, 50, 50);
        this.pasifIcon = resmiOlcekleme(pasifIcon, 50, 50);
        this.aktifRenk = aktifRenk;
        this.pasifRenk = pasifRenk;
        this.aktifDurum = false;

        butonuIlklendir();
        butonListesi.add(this);
    }

    private void butonuIlklendir() {
        setForeground(pasifRenk);
        setIcon(new ImageIcon(pasifIcon));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                butonDurumunuDegistir();
                graphQLMutationCalistir();
            }
        });
    }

    private void butonDurumunuDegistir() {
        if (aktifDurum) {
            // Eğer bu buton daha önce aktifse, tüm butonları pasif yap
            for (ButonKontrolPaneli buton : butonListesi) {
                buton.aktifDurum = false;
                buton.setForeground(buton.pasifRenk);
                buton.setIcon(new ImageIcon(buton.pasifIcon));
            }
            aktifButon = null;
        } else {
            // Eğer bu buton daha önce aktif değilse, önceki aktif butonu bununla birlikte aktif yap
            if (aktifButon != null && aktifButon != ButonKontrolPaneli.this) {
                aktifButon.aktifDurum = true;
                aktifButon.setForeground(aktifButon.aktifRenk);
                aktifButon.setIcon(new ImageIcon(aktifButon.aktifIcon));
            }
            // Bu butonu aktif yap
            setForeground(aktifRenk);
            setIcon(new ImageIcon(aktifIcon));
            aktifButon = ButonKontrolPaneli.this;
        }

    }

    private void graphQLMutationCalistir() {

        System.out.println("GraphQL mutation şu adreste çalıştırılıyor: " + graphQLSchemaAdresi);
        // Sadece aktif buton için GraphQL mutation'ını burada çalıştırın
        if (aktifDurum) {
            System.out.println("GraphQL mutation şu adreste çalıştırılıyor: " + graphQLSchemaAdresi);
            // Burada belirtilen GraphQL şema adresine mutation isteği yapılabilir.
        }
    }


    private Image resmiOlcekleme(Image image, int genislik, int yukseklik) {
        return image.getScaledInstance(genislik, yukseklik, Image.SCALE_SMOOTH);
    }

    public static void main(String[] args) {
        ImageIcon aktifIcon = new ImageIcon("resim.png");
        ImageIcon pasifIcon = new ImageIcon("resim2.png");

        JFrame frame = new JFrame("Buton Kontrol Paneli");
        frame.setLayout(new GridLayout(4, 4));


        //örnek adres
        for (int i = 0; i < 16; i++) {
            ButonKontrolPaneli buton = new ButonKontrolPaneli("Buton " + (i + 1),
                    "https://example.com/graphql", aktifIcon.getImage(), pasifIcon.getImage(),
                    Color.blue, Color.GRAY);
            frame.add(buton);
        }

        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}