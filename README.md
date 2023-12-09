# Button Kontrol Paneli Uygulaması

Bu uygulama, bir GraphQL sunucu üzerinde belirli mutation'ları tetiklemek için kullanılan bir kontrol panelidir.

## Uygulamayı Çalıştırma

1. Bu programı çalıştırmak için bilgisayarınızda Java'nın yüklü olması gerekiyor. Java'yı [Oracle'nin resmi web sitesinden](https://www.oracle.com/java/technologies/javase-downloads.html) veya [OpenJDK](https://openjdk.java.net/) üzerinden indirebilirsiniz.

2. Bu repo dosyasını bilgisayarınıza indirin. Bunun için "Download ZIP" seçeneğini kullanabilirsiniz.

3. İndirdiğiniz ZIP dosyasını açın ve içindeki "kod" klasörünü ZIP'in içine çıkartın.

4. Uygulamanın düzgün çalışabilmesi için gerekli kütüphaneleri edinin.

5. Uygulamada kullanılan aktif ve pasif resimleri hazırlayarak proje klasörünün içine atın.

6. Java derleyicisini çalıştırın ve açılan terminal penceresinde `open` komutu ile indirdiğiniz klasörü seçin. Daha sonra kodu çalıştırmak için "run" tuşuna basın.

7. Her bir butonu tıklayarak uygulamayı test edin. Butonlara tıkladıktan sonra görsel geri bildirimi ve GraphQL mutation'ının çalıştığına dair konsol çıktısını gözlemleyin.

## GraphQL Nedir?

GraphQL, REST tabanlı web servis sorgulama dili olup veri çekme, sorgulama ve üzerinde işlem yapma amacıyla kullanılır. Avantajları arasında tek bir istekle birden fazla REST çağrısı yapabilme, özel sorgular yazabilme ve otomatik dokümantasyon oluşturabilme bulunur.

## GraphQL'in Avantajları

- Tek bir istekle birden fazla REST çağrısı yapabilme
- Özel sorgular yazabilme
- Otomatik dokümantasyon oluşturabilme
- Veri miktarını azaltarak uygulama performansını artırabilme
- Geriye dönük uyumluluğu etkilemeden değişikliklere izin verebilme

## GraphQL'i Ne Zaman Kullanmalısınız?

- Performansı optimize etmek ve veri miktarını azaltmak istediğinizde
- Daha fazla esneklik istediğinizde
- API'yi geliştirmek ve iyileştirmek istediğinizde

## GraphQL Bağlantısı

Kod örneğinde "https://example.com/graphql" şeklinde sabit bir GraphQL şema adresi kullanılmasının nedeni, örnek bir adres sağlamaktır. Bu, projenin çalıştığı ortamda gerçek bir GraphQL API veya sunucu olmaması durumunda, kullanıcıların kendi projeleriyle entegre etmek için bir temel örnek sunmaktır.

Bu örnek adres, genellikle dökümantasyon veya başlangıç düzeyinde öğrenme materyallerinde kullanılır. Gerçek bir projede, bu adresin kendi GraphQL sunucu adresinizle değiştirilmesi gerekecektir.

Not: Bu kod, belirli bir GraphQL şema adresi üzerinde bir mutation çalıştırmayı simüle eder. Gerçek bir mutation yapmak için uygun bir GraphQL sunucusuna ve şemaya ihtiyaç duyarsınız.

Bu örnekte, sadece konsola çıktı bastırılır, gerçek bir mutation yapma işlemi simüle edilir.
