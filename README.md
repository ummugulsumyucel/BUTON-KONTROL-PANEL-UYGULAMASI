
**BUTON KONTROL PANELİ UYGULAMASI**

**NEDİR VE NE İŞE YARAR**

Buton kontrol paneli uygulaması özelleştirilmiş bir buton sınıfı oluşturur. Her buton farklı durumları temsil etmek için renk ve simgeler ile  tasarlanmıştır. Tıklanabilirlik özelliği eklenmiş olup butonlara tıklandığında durumları değişir.
Daha basit olarak anlatırsak bu uygulama özel tuşlar yapmak için kullanılır. Tuşlara tıklandığında farklı renkler ve simgeler gösterirler. Örnek vericek olursak aktifken bir rengi ve simgeyi, pasifken farklı bir rengi ve simgeyi gösterebilirler. Bu uygulama basit bir arayüz içinde bu özel butonlardan oluşan bir panel oluşturur ve bu panelden farklı durumları temsil eden butonlarla birlikte bir örnek yaratır.

**KODU NASIL KULLANABİLİRİZ VE NASIL TEST EDEBİLİRİZ**

1)CustomButton sınıfı özelleştirilmiş butonları temsil eder. Butonların özelliklerini dinamik olarak değiştirmek ve butonlara tıklama olaylarını yönetmek için kullanılır
Kodu çalıştırmak için, main metodu olan CustomButton sınıfını çalıştırabiliriz.

2)Butonların Özellikleri
Bu kod, özel butonlar oluşturur. Her bir butonun üzerinde belirli bir metin bulunur ve bu butonlara tıklandığında renkleri ve simgeleri değişir.
Butonları oluştururken kullanabileceğiniz bazı özellikler vardır:
         a)Metin: Butonun üzerinde göstermek istediğiniz yazı.
         b)Pasif Rengi: Butonun pasif durumda olduğunda göstereceği renk.
         c)Aktif Rengi: Butonun aktif durumda olduğunda göstereceği renk.
         d)Pasif Simgesi: Buton pasif durumdayken göstereceği simge.
         e)Aktif Simgesi: Buton aktif durumdayken göstereceği simge.
         f) GraphQL Schema: Butona tıklandığında çalıştırılacak olan hayali GraphQL şeması.


Butonların Özelliklerini Değiştirme:
Butonların metin değerlerini, renklerini ve simgelerini değiştirmek için setButtonText, setButtonColors ve setButtonIcons gibi metodları kullanabiliriz. Bu metodlar, butonların görünümünü ayarlamanıza sağlar.

3)Kodu Test Etme
Kodu çalıştırdıktan sonra, oluşturulan butonların görünüşünü ve davranışını gözlemleriz.
Butonlara tıklayarak durumlarının nasıl değiştiğini görebilir ve renk/simge değişimini test edebiliriz.
Butonları farklı şekillerde oluşturarak nasıl çalıştığını gözlemleyebiliriz. Örneğin, farklı renkler veya farklı simgelerle deneyebiliriz.







**UYGULAMAYA AİT EKRAN GÖRÜNTÜLERİ**
![image](https://github.com/ummugulsumyucel/BUTON-KONTROL-PANEL-UYGULAMASI/assets/123782291/a54919c4-6bb8-4d7b-804e-9683572b4abd)

![image](https://github.com/ummugulsumyucel/BUTON-KONTROL-PANEL-UYGULAMASI/assets/123782291/5ba168cf-6cea-45e8-829f-59fe33bd5f69)
 
![image](https://github.com/ummugulsumyucel/BUTON-KONTROL-PANEL-UYGULAMASI/assets/123782291/399fdcae-39cb-4db4-b98c-cbb17e085837)


https://github.com/ummugulsumyucel/BUTON-KONTROL-PANEL-UYGULAMASI/assets/123782291/2a34b0f3-29e4-4fbf-9d6b-9dafda0cfa94



 





 


**GRAPQL ŞEMASI**

Buton kontrol paneli uygulamasında kullandığımız GraphQL şeması, bir tür veri organize etme ve erişme yapısıdır.
Örnek vericek olursak, bir uygulama kullanıcılar gönderiler veya ürünler gibi farklı veri türlerine sahip olabilir. GraphQL şeması, bu veri türlerini ve bunlarla yapılabilecek işlemleri(örneğin, yeni bir kullanıcı oluşturma veya bir gönderiyi güncelleme gibi) tanımlar. Uygulamamızdaki hayali  graphqlSchema ise her bir butonun ilişkilendirildiği bu yapısal şemayı temsil eder. Bu şema o butonun hangi veriyi veya işlemi temsil ettiğini belirtir. Bu şekilde, butonlara tıklama işlemi, belirtilen GraphQL şemasında tanımlanan bir işlemi gerçekleştirir.

 
![image](https://github.com/ummugulsumyucel/BUTON-KONTROL-PANEL-UYGULAMASI/assets/123782291/fbca27ad-ba69-4ac4-8bec-00901315d9ff)



**GrapQl Şemasının Kullanım Örnekleri:**

1)Sosyal Medya Uygulamaları: Kullanıcı profilleri, paylaşılan gönderiler veya yorumlar gibi içerikler, kullanıcılar arasındaki etkileşimleri temsil eden GraphQL şemaları üzerinden yönetilebilir. Örneğin, bir "beğeni" butonu veya "yorum yap" butonu, ilgili gönderiye yapılan bir GraphQL mutasyonuyla ilişkilendirilmiş olabilirler.
2)E-Ticaret Siteleri: Ürünler, kategoriler, sepet işlemleri gibi e-ticaret işlevleri GraphQL şemaları aracılığıyla temsil edilebilir. Bir "sepete ekle" butonu, ilgili ürünün eklenmesini temsil eden bir GraphQL mutasyonuyla ilişkilendirilebilir.

3)Hava Durumu Uygulamaları: Hava durumu verileri, şehirler veya koordinatlar aracılığıyla alınabilir. Kullanıcılar, belirli bir şehir için hava durumu verilerini almak için bir butona tıkladıklarında, bu buton ilgili GraphQL sorgusunu tetikleyebilir.

4)Oyunlar: Oyunlarda, kullanıcıların puanlarını saklama, başarıları veya seviye geçişlerini yönetme gibi işlemler için GraphQL şemaları kullanılabilir. Örneğin, bir "skor gönder" butonu, kullanıcının oyun skorunu sunucuya göndermek için bir GraphQL mutasyonu tetikleyebilir.

5)Mobil Uygulamalar: Kullanıcı oturum açma, profil güncelleme, fotoğraf yükleme gibi temel işlemler GraphQL şemaları üzerinden yönetilebilir. Bir "profil fotoğrafı değiştir" butonu, ilgili işlemi gerçekleştiren bir GraphQL mutasyonunu tetikleyebilir.


Yukarıdakı örnekler günlük hayatta GraphQL şemalarının çeşitli kullanım alanlarını bizlere gösterir.Her biri, kullanıcıların etkileşimde bulunduğu farklı işlevleri temsil eden butonlar veya işlevlerle ilişkilendirilebilir. Bu butonlar, kullanıcı etkileşimleriyle belirli bir işlemi gerçekleştirmek için GraphQL şemasını kullanabilir.

Özetle graphqlSchema alanı, her bir butonun tıklama işlemiyle bağlantılı olduğu GraphQL yapısını temsil eder. Bu yapı, butonun hangi veriyi işlediğini veya hangi işlemi gerçekleştirdiğini belirtir.


