//BUTON KONTROL PANELİ UYGULAMASI
  /*
   Buton kontrol paneli uygulaması özelleştirilmiş butonlar oluşturur ve her bir butona tıklandığında durumlarını değiştirir.
   Butonların renkleri ve simgeleri, aktif ve pasif durumları temsil etmek üzere farklı şekilde ayarlanabilir.
   Ayrıca her buton, kullanıcı belirlediği hayali bir GraphQL şemasında bir mutation çalıştırabilir.
  */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomButton extends JButton {
    private Icon pasifIkon;
    private Icon aktifIkon;
    private boolean isAktif = false;
    private String graphqlSchema;

    public CustomButton(String text, String graphqlSchema, String pasifRenk, String aktifRenk, String passiveIconPath, String activeIconPath) {
        super(text);
        this.graphqlSchema = graphqlSchema;

        // İkonları oluşturduk.
        passiveIconPath = "resimler/pasif.png";
        activeIconPath = "resimler/aktif.png";
        this.pasifIkon = createResizedIcon(passiveIconPath, 100, 100);
        this.aktifIkon = createResizedIcon(activeIconPath, 100, 100);

        // Butonun rengini ve başlangıç ikonunu belirledik
        setPasifStyle(pasifRenk);

        // ActionListener ekleyerek buton tıklama durumunu inceledik
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButonaBasmaState(); // Düğmeye tıklandığında durumu değiştirdik
                GraphQLMutationiUygulama();
            }
        });
    }

    private ImageIcon createResizedIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(path);
        Image resizedImage = originalIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        return new ImageIcon(resizedImage);
    } // Iconların boyutunu ayarladık.

    private void setPasifStyle(String renk) {
        setBackground(Color.decode(renk));

        setIcon(pasifIkon);
        isAktif = false;
    } // Buton pasif haldeyken bulunduğu durumunu yazdık

    private void setAktifStyle(String renk) {
        setBackground(Color.decode(renk));
        setIcon(aktifIkon);
        isAktif = true;
    } // Buton aktif haldeyken bulunduğu durumunu yazdık

    private void ButonaBasmaState() {
        if (isAktif) {
            setPasifStyle("#CCCCCC"); // Pasif renk
            ButonPasifYap(); // Diğer düğmeleri pasif hale getirdik
        } else {
            setAktifStyle("#FFC0CB"); // Aktif renk
        }
    }

    private void ButonPasifYap() {
        if (isAktif) {
            // Eğer aktif düğmeye tekrar basıldıysa sadece kendi düğmesini pasif hale getir
            setPasifStyle("#CCCCCC");
        } else {
            // Eğer daha önce bir düğme aktifse, onu pasif hale getir
            Container parent = getParent();
            for (Component component : parent.getComponents()) {
                if (component instanceof CustomButton && component != this) {
                    CustomButton otherButton = (CustomButton) component;
                    if (otherButton.isAktif) {
                        otherButton.setPasifStyle("#CCCCCC"); // Diğer aktif düğmeleri pasif hale getir
                    }
                }
            }

            setAktifStyle("#FFC0CB"); // Aktif renk
        }
    }

    private void GraphQLMutationiUygulama() {
        // Gerçek GraphQL mutasyonunu çalıştırmak için kod buraya eklenebilir.Biz hayali yapmayı tercih ettik.
        System.out.println("Buton için GraphQL mutasyonu çalıştırılıyor. Schema: " + graphqlSchema);
    }
    // executeGraphQLMutation yöntemi, bir GraphQL mutasyonunu simüle etmek için eklenmiştir.
    // Bu yöntem, bir GraphQL istemci kitaplığı kullanarak bir GraphQL mutasyonunu gerçekleştirmek için gerçek mantık ile değiştirilebilir. graphqlSchema alanı,
    // her buton ile ilişkilendirilmiş olan GraphQL şemasını depolamak için kullanılır.

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { //belirli bir kod bloğunu Swing'in ana iş parçacığı üzerinde güvenli bir şekilde çalıştırmak için kullanılmıştır.
            JFrame frame = new JFrame("Button Panel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kullanıcı pencereyi kapatma işlemi gerçekleştirdiğinde, uygulamanın sonlandırılmasını ifade eder.
            frame.setLayout(new GridLayout(4, 4));

            for (int i = 1; i <= 16; i++) {
                CustomButton buton = new CustomButton("Buton " + i, "http://ornek.com/graphql" + i, "#CCCCCC", "#FFC0CB", "pasif.png", "aktif.png");
                frame.add(buton);
            }

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}