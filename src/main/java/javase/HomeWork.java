package javase;

public class HomeWork {


     /*******
      *
      *
      *     27 Mart 2022 (1.DERS)
      *     interpreter nedir ?, compiler nedir ?
      *     JVM nedir ?
      *     JAR nedir  ? WAR nedir ?
      *     class nedir ? package nedir ?
      *     unicode character nedir ?
      *     Ascii character nedir ?
      *     Heap Memory , Stack Memory nedir ?
      *     Runtime (Çalışma zamanı) , compile(derleme zamanı)
      *
      *
              *
              *     //////////////////////////////////////////////////////////////
              *     //MATH
              *     // //Kullanıcıdan alınan 2 sayı için; Scanner
              * //    Toplama
              * //    Çıkarma
              * //    Çarpma
              * //    Bölme
              * //    1.sayı alt 2.sayı üst olacak üslü sayı pow
              * //    1.sayı mutlak değeri abs
              * //    2.sayınını karekökö  çıkan sayıyı yuvarlama sqrt , round
              *
              *     //Random Math , Random object nedir ?
              *
              *     //cast: valueOf ==>toString veya parseInt
              *     //Stringbuilder ile StringBuffer arasındaki farklar ?
              *
              *     //java By pass value ? ==> memory
              *
              *     //inheritance abstarct interface polymorphism
              *
              *     //Software Prensible
              *     //Spaggetti code nedir?
              *     //clean code nedir?
              *     //monad nedir?
              *     //solid nedir?
              *     //KISS nedir?
              *     //CCP nedir ?
              *     //YAGNI nedir?
              *     //DRY nedir?
              *
              *
              *      //Stringbuilder ile StringBuffer arasındaki farklar ?
              *
              *
       *
       *       StringBuilder Nedir?
       *       StringBuilder sınıfı en kısa tanımla bize “mutable” yani değiştirilebilir string elde etmemize olanak tanır.
       *       Böylece hafızada her seferinde yeni bir alan açılmadan var olan alan üzerinde değişiklik yapılabilir.
       *       Bu da StringBuilder sınıfını hafıza kullanımı olarak String sınıfının önüne geçirir.
       *       StringBuilder thread-safe değildir. Yani synchronized değildir.
       *       Thread’li bir işlem kullanılacaksa StringBuilder kullanılması güvenli değildir.
       *       Basit bir şekilde durumu açıklayacak olursak:
       *       Aynı anda birden fazla thread, oluşturduğunuz StringBuilder nesnesini değiştirmeye çalıştığında StringBuilder bunu engelleyemez.
       *       Bu durumda da threadler arasında yapılan değişiklikler aslında bizim istemediğimiz değer değişikliğine neden olur.
       *       Bir mail göndermek için StringBuilder ile metin oluşturduğunuzu düşünün.
       *       Bu işlemi de aynı zamanda 2 farklı thread çalıştırıyor olsun.
       *       İlk thread işlemine başlayıp StringBuilder nesnenizi değiştiriyor ve mail içeriğini ayarlıyor.
       *       Aynı zamanda diğer thread de aynı StringBuilder nesnesi üzerinde değişiklik yapmak istiyor.
       *       Farklı bir kişiye gönderilecek mail için içerik hazırlıyor.
       *       Ancak bunu yaparken ilk thread’imizin atadığı değeri ezmiş oluyor. Bunun önüne geçmek için StringBuffer kullanılmalıdır.
       *
       *       StringBuffer Nedir?
       *       StringBuffer ile StringBuilder aynı metodlara sahiptir.
       *       Aynı mantıkla ilerler. Aralarındaki tek fark ise StringBuffer thread-safe yani synchronized ‘tır.
       *       Bu durum da StringBuffer’ı thread’li işlemlerde kullanılmasını güvenli yapar.
       *       Thread’li işlemlerde güvenli olmasının getirdiği bir dezavantaj da mevcuttur.
       *       Bu durum StringBuffer’ın StringBuilder’dan daha yavaş çalışmasına neden olur.
       *
       *       Özet
       *       String nesneleri değiştirilemez.
       *       Bundan dolayı sürekli üzerinde değişiklik/ekleme yapılacak stringlerimiz varsa hafıza konusunda sıkıntı çıkartması mümkün.
       *       Bunun önüne geçmek için StringBuilder ve StringBuffer sınıfları mevcut.
       *       Bu iki sınıf değiştirilebilir stringler kullanmamızı sağlıyor.
       *       StringBuffer’ın StringBuilder’dan farkı ise çok thread’li ortamlarda çalışırken nesnelerin değişmeyeceği garantisini vermesi.
       *       Bu durum da StringBuffer’ın, StringBuilder’dan daha yavaş olmasına neden olmakta.
       *
       *
              *
              *      //java By pass value ? ==> memory
              *
              *      /*****
       *       Java’da yeni bir nesne oluşturmak için new anahtar kelimesini kullanırız.
       *       Oluşturduğumuz nesneler hafızada tiplerine göre Stack’te veya Heap’te tutulur.
       *       Value type (değer tipli) nesnener Stack’te tutulur.
       *       Java’da Primitive tipler dediğimiz byte, char, int, long, double, boolean… gibi tiplere karşılık gelmektedir.
       *       Reference type (referans tipli) nesnelerin değerleri Heap’te referansları ise Stack’te tutulur.
       *       Java’da Wrapper tipler dediğimiz Integer, Long, Double, Boolean, Object, Person (kendi özel tipimiz) tiplerine karşılık gelmektedir.
       *
       *       Kısaca Stack
       *       LIFO (Last in First out) son giren ilk çıkar mantığında çalışır.
       *       Veri depolama alanı çok geniş olmadığından kullanımı kolay ve hızlıdır.
       *       Veriler Big and Little Endian (artan ya da azalan) adres mantığında tutulur.
       *       Derleme zamanında oluşturulur.
       *       Life time (yaşam süresi) kısa olan değişkenler tutulur. Ör; local variables (yerel değişkenler).
       *       Static allocation (Kullanılacak depolama alanının boyutu biliniyorsa stack işe yarayacaktır.)
       *       Bir Java uygulamasında sadece tek bir stack yoktur. Her bir thread’in kendi stack’i vardır.
       *       Bir stack üzerindeki veriye kendi thread’inden başka bir thread erişemez.
       *       Doğru kullanılmadığında java.lang.StackOverFlowError hatası alınır.
       *
       *       Kısaca Heap
       *       Heap stack’e göre daha büyük boyuta sahiptir.
       *       Stack’e göre daha fazla alana sahip olduğundan stack’e göre daha yavaştır.
       *       Heap’teki veriler karışık şekilde sıralanır.
       *       Çalışma zamanında oluşturulur.
       *       Dynamic allocation (Kullanılacak depolama alanının boyutu bilinmiyorsa ya da sürekli değişken olacak ise heap kullanmak doğru olacaktır.)
       *       Bir Java uygulamasında tüm thread’ler için sadece bir tane heap bulunmaktadır.
       *       Doğru kullanılmadığında java.lang.OutOfMemoryError hatası alınır.
       *
       *       Autoboxing and Unboxing
       *       Java 5 ile gelen bu özellik sayesinde java compiler primitive tip ile wrapper tip arasındaki dönüşümü yapabilmektedir.
       *
       *       Autobaxing primitive tiplere karşılık gelen referans tipler arasındaki dönüşümdür.
       *       Örneğin : int → Integer , double → Double
       *       Unboxing Yukarıdaki işlemin tersi yönünde bir dönüşüm işlemine denir.
       *       Örneğin : Integer → int , Double → double
       *
       *       Java’da Parametre Geçirme
       *       pass by value
       *       Metoda gönderilen parametrenin bir kopyasının tutularak gönderildiği parametre aktarım şeklidir.
       *       Yani metot içinde parametrenin değeri değiştiğinde ilk değeri değişmez. Değişiklik sadece metot scope içinde görülür.
       *       pass by reference
       *       Metoda gönderilen parametrenin referansının gönderildiği parametre aktarım şeklidir.
       *       Metot içinde parametrenin değeri değiştiğinde ilk değeride değişir.
       *
       *
              *
              *     // 1==> //Software Prensible:
              *     /*** SOLID Nedir ? Solid Yazılım Prensipleri Nelerdir ?
       *     Her yazılımcının bilmesi gereken S.O.L.I.D. yazılım geliştirmenin temel prensipleri olarak kabul edilmektedir.
       *     SOLID yazılım prensipleri; geliştirilen yazılımın esnek, yeniden kullanılabilir, sürdürülebilir ve anlaşılır olmasını sağlayan,
       *      kod tekrarını önleyen ve Robert C. Martin tarafından öne sürülen prensipler bütünüdür.
       *      Kısaltması Michael Feathers tarafından tanımlanan bu prensiplerin amacı;
              *
              *
              *    /*** Geliştirdiğimiz yazılımın gelecekte gereksinimlere kolayca adapte olması,
       *              Yeni özellikleri kodda bir değişikliğe gerek kalmadan kolayca ekleyebileceğimiz
       *              Yeni gereksinimlere karşın kodun üzerinde en az değişimi sağlaması,
       *              Kod üzerinde sürekli düzeltme hatta yeniden yazma gibi sorunların yol açtığı zaman kaybını da minimuma indirmektir.
       *              Bu prensipler uygulanarak uygulamalarımızın büyürken, karmaşıklığın da büyümesinin önüne geçmiş oluruz. “İyi kod” yazmak için bu prensiplere uygun yazılım geliştirmelisiniz.
       *        Biraz açalım;
              *
              *
              *    /***** S — Single-responsibility principle
       *         Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur,
       *          yani bir sınıfın(fonksiyona da indirgenebilir) yapması gereken yalnızca bir işi olması gerekir.
              *
              *
              *     /*** O — Open-closed principle
       *     Bir sınıf ya da fonksiyon halihazırda var olan özellikleri korumalı ve değişikliğe izin vermemelidir.
       *      Yani davranışını değiştirmiyor olmalı ve yeni özellikler kazanabiliyor olmalıdır.
              *
              *
              *         L — Liskov substitution principle
       *     Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları,
       *      türedikleri(üst) sınıfların yerine kullanabilmeliyiz.
              *    I — Interface segregation principle
       *       Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.
              *
              *
              *     D — Dependency Inversion Principle
       *     Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
              *
              *
              *      2 ==> Spaggetti code nedir?
              **
       *      Spagetti kodu , yapılandırılmamış ve bakımı zor kaynak kodu için aşağılayıcı bir ifadedir .
       *      Spagetti kodu, değişken proje gereksinimleri,programlama stili kurallarının eksikliği
       *      ve yetersiz yetenek veya deneyime sahip yazılım mühendisleri gibi çeşitli faktörlerden kaynaklanabilir .
       *
       *      Yapılandırılmış programlama yapıları yerine GOTO deyimlerini aşırı kullanan
       *      karmaşık ve sürdürülemez programlarla sonuçlanan koda genellikle spagetti kodu denir.
       *      Bu tür kodun karmaşık ve karışık bir kontrol yapısı vardır, bu da kavramsal olarak bir kase spagetti gibi , bükülmüş
       *      ve karışık bir program akışına neden olur .
       *      Amerika Birleşik Devletleri Ulusal Standartlar Bürosu tarafından 1980 yılında yayınlanan bir yayında ,
       *      spagetti programı ifadesi "parçalara ayrılmış ve dağılmış dosyalara" sahip eski programları tanımlamak için kullanılmıştır.
       *      Spagetti kodu aynı zamanda bir anti-desen tanımlayabilir.nesne yönelimli kod , yöntemleri aşırı uzun ve dağınık olan sınıflar oluşturarak
       *      veya polimorfizm gibi nesne yönelimli kavramları terk ederek yordamsal bir tarzda yazılır .
       *      Bu tür spagetti kodunun varlığı, bir sistemin anlaşılırlığını önemli ölçüde azaltabilir.
       *
       *      Mantı kodu || Ravioli code
       *      Ravioli kodu, nesne yönelimli programlamaya özgü bir terimdir .
       *      Ayrı ayrı anlaşılması kolay, ancak bir bütün olarak anlaşılması zor, iyi yapılandırılmış sınıflardan oluşan kodu açıklar .
       *
       *      Lazanya kodu || Lasagna code
       *
       *      Lazanya kodu, katmanları çok karmaşık ve iç içe geçmiş,
       *      bir katmanda değişiklik yapmanın diğer tüm katmanlarda değişiklik yapılmasını gerektirecek kadar karmaşık olan kodu ifade eder.
       *
       *
      *
      *      3 ==> clean code nedir?
      *
       *
       *      -- Clean Code (Temiz Kod) kavramı Robert C. Martin Clean Code kitabıyla özdeşlemiş durumda.
       *      Kodun temiz olması, kodu yazan geliştirici dışında ekiptekilerin kodu kolay şekilde anlayabilmesi ve geliştirme yapabilmesidir. Burada kolay kelimesini vurgulamak istiyorum. Kolay için olması gerekenler
       *      --readability, (Basitçe okunup anlaşılıyor ise)
       *      --changeability, (Basitçe değiştirilebiliyor ise)
       *      --extensibility (Basitçe genişletilebiliyor ise)
       *     -- maintainability. (Basitçe bakım yapılabiliyor ise)
       *
       *      A. CLEAN CODE (TEMİZ KOD)
       *      A.1 Genel Kurallar
       *      Standart yaklaşımları uygula
       *      Kodu basit tutmaya çalış, Olabildiğince kompleks yapılardan uzak dur
       *      Kodu bulduğunuzdan daha temiz halde bırakın.
       *      Her zaman sorunun kaynağına odaklanın. Problemin ana kaynağını bulmaya çalışın
       *
       *      A.2 Tasarım Kuralları
       *      Konfigüre edilen veriyi kodun içerisinde derinlerinde değilde rahat erişilebilen değiştirilebilen kısımda bulundur.
       *      if/else veya switch/case koşulları yazmak yerine polymorphism tercih et.
       *      multi-threading kodları ayrıştır.
       *      Her kod yapısını konfigürasyonlu ve dinamik hale getirmekten kaçının.
       *      Dependency Injection (Bağımlılık Enjekte Etmeyi) kullanın.
       *      Bir sınıf doğrudan sadece bağımlılıklarını bilmelidir yasasını takip et.
       *
       *      A.3 Anlaşılabilirlik İpuçları
       *      Tutarlı ol. Bir işi bir yöntemle yapıyorsan, her yerde aynı yöntemi kullan.
       *      Açıklayıcı değişken isimleri kullan.
       *      Kod içerisindeki değişkenlerin tuttuğu (primitif ve object) türemiş verilerin veya kod akışının sınıf koşullarını kapsayacak şekilde encapsulate edin. Sınır koşullarını takip etmek zor olduğundan bu tarz işlemleri tek bir yerden gerçekleştirin.
       *      Object Türler yerine Primitif Türleri tercih edin. (Immutable)
       *      Mantıksal bağımlılıklardan kaçının. Aynı sınıf içerisinde başka bir takım şeylere bağımlılığı olan metodlar yazmayın.
       *      Negative koşullardan sakının.
       *      A.4 İsimlendirme Kuralları
       *      Açıklayıcı ve kafa karışıklığına neden olmayacak isimlendirmeler kullanın
       *      İsimlendirmeler ile anlamlı ayrımlar oluşturun (Soyutlama için önemli)
       *      Telefazu kolay isimlendirmeler bulun
       *      Aradığınızda kolay şekilde bulunabilecek ve erişebilecek isimlendirmeler seçin
       *      Kodun içerisinde gizli rakamlar ve sabitlerden kaçının
       *      Encoding ve değişkenlerin önüne bir takım başlangıç tag takmayın.
       *      Not: Eskiden Code Editorleri zayıfken C gibi dillerde i, s …. Javada Interface I gibi ön takılar olurdu. Şimdi editörlerin görsel gösterimleri ve arama kabiliyetleri sayesinde bu tarz isimlendirmelere gerek yok
       *      A.5 Fonksiyon Kuralları
       *      Küçük olmalı.
       *      Bir tek iş yapmalı
       *      İsmi açıklayıcı olmalı
       *      Olabildiğince az argüman almalı
       *      Side Effect içermemeli
       *      Flag (true/false) argümanlarını parametre olarak koda geçirilip bu method içerieisinde farklı metod çağrımları yapılmamalı.
       *      A.6 Yorum Satırı Kuralları
       *      Olabildiğince kendinizi kod içerisinde anlatmaya çalışın,
       *      Gereksiz yorum ekleme
       *      Başlangıç bitiş kodu ayırma amaçlı yorum satırları eklemeyin.
       *      Kodu yorum satırı haline getirip bekletmeyin. Gereksiz kodları silin.
       *      Yorumu yazma nedeninizi açıklayın.
       *      Kodun açıklaması olarak kullanın.
       *      Sonuçların uyarısı olarak kullanın.
       *      A.7 Source Kod Yapısı
       *      Kavramları dikey olarak ayır.
       *      Birbiri ile ilişkili kodlar dikey yoğunlukta görüntülenmeli
       *      Değişkenleri kullanım alanlarına yakın tanımla
       *      Birbirine yakın fonksiyonları birbirine yakın tanımla
       *      Benzer işleri yapan fonksiyonlar birbirine yakın olmalı
       *      Fonksiyonları aşağı yönlü akacak şekilde yerleştirin.
       *      Kod satırlarını kısa tutun.
       *      Yatay hizalama yapmayın. (üstteki, alttaki satır ile hizalama)
       *      Boşluk kullanarak ilişkili şeyleri birbirine yakın , ilişkisizleri uzaklaştır.
       *      Kodun oluşturduğu girintileri bozmayın
       *      A.8 Objeler ve Veri Yapıları
       *      Kodun iç yapısını gizleyin.
       *      Veri yapılarını, dillerin hazır Collection yapılarını tercih edin
       *      Hibrid yapılardan kaçının.
       *      Olabildiğince küçük olun.
       *      Bir sey yapın.
       *      Küçük sayıdaki değişkenlerle çalışın.
       *      Temel sınıf, kendisinden türeyenler hakkında hiçbir şey bilmemelidir.
       *      Fonksiyona bir takım parametreler geçirerek bunların istenen davranışa göre şekillenmesindense, birçok sade fonksiyona sahip olmak daha iyidir.
       *      Static metodları tercih etme.
       *      A.9 Tests
       *      Her test için bir assert
       *      Test okunabilir olmalı
       *      Test hızlı çalışabilir olmalı
       *      Test bağımsız olmalı
       *      Test tekrar edebilir olmalı
       *      B. CODE SMELLS (Kodun Kötü Kokması)
       *      Yukarıda temiz kodun tanımını ve özelliklerini verdik. Bazen bir takım nedenlerden dolayı. Örneğin;
       *      zamanın azlığı,
       *      takımın deneyim eksikliği,
       *      yönetimsel hatalar,
       *      yanlış 3rd party ürün ve kütüphane seçimleri,
       *      müşteriyi iyi analiz edememe,
       *      yanlış bir geliştirme modelini kullanma,
       *      yanlış önceliklerde kod geliştirme,
       *      design system kullanmamak,
       *
       *      Rigidity (Sertlik): Yazılımı değiştirmeniz çok zor hale gelmiş, bir değişiklik bir çok yeri etkiliyor ise.
       *      Fragility (Kırılganlık): Yazılımda ufak bir değişiklik uygulamanın bir çok yerini bozuyor ise.
       *      Immobility (Hareketsizlik): Kodunuzun bir takım tekrar eden kısımlarını diğer projelerde kullanabiliyorsanız.
       *      Needless Complexity: Gereksiz kompleks ise
       *      Needless Repetition: Gereksiz tekrar var ise
       *      Opacity (Saydamlık): Okunabilirliği zor ise.
       *      Kod ile ilgili bir tarz sinyaller alıyorsanız, kodunuzda bir takım düzenlemeler ve düzeltmeler yapma zamanı gelmiştir.
       *
       *
       *      4 ==> monad nedir?
       *      A. Monad Ne İşimize Yarıyor ?
       *      Monad yapmak istediğiniz işlemler ve hesaplamalar daki tuhaflık ve karmaşıklıklardan bizi soyutlayan katmandır. Bu sayede geliştirici bu işlemlerde esas odağını kaybetmemiş olur. Örneğin;
       *      1. Promise/Future Monad
       *      Sonucu işlem yaptığınız sırada henüz belli olmayan işlemlerin sonucunu tutan kap
       *
       *      2. Maybe Monad
       *      Yine bir fonksiyon sonucunda bir değer veya değer üretmediğinden emin olamadığımız durumlarda
       *      (undefined veya null) olmasından kaynaklı uygulamamızın crash (çökmemesini) sağlayacak kap
       *
       *      3. List Monad
       *      Rastgele sayıda sonuç döndürebilen kesin olmayan hesaplamarı soyutlamak için kullanılan kap
       *      4. I/O Monad
       *      I/O Network işlemi yaparken sonucu kesin olmayan dönüşleri soyutlamak için kullanılan kap
       *
       *      B. Monad Nedir?
       *      Monad fonksiyonları kapsamanın farklı bir yöntemidir. Bu yöntemde bir context ve işletim, dallanma ve I/O işlemleri
       *      Fonksiyonel Programlamanın Side Effect kısmına giriyor.
       *      Bu kısımda nasıl bir kap örüntüsü oluşturmalıyız ki bu SideEffect etkilerini azaltabilelim.
       *
       *      Saf (Pure) Fonksiyon Nedir?
       *      JS kullanılan Monad Operasyonlarından bazılarını listelersek;
       *      lift: Tipi normal değerden array dönüştürmek ilerde yapacağımız işlemlerde
       *      bir çok kolaylık ve Array High Order Function özelliklerini kullanma imkanı sunacaktır.
       *      Bu konuda daha detaylı bilgi için High Order Functions yazımı okuyabilirsiniz.
       *
       *
       *      flatten: Array yapısında hiyerarşik yapıları tek bir array içerisinde düzleştiren operasyonları içerir.
       *
       *      map: Array içerisindeki her bir değeri bir işleme tabi tutup bunun sonucunu başka benzer bir yapı içerisinde oluşturur.
       *
       *
       *      context: Monadın hesaplama detayıdır.
       *      Functor / Monad API ve çalışmaları, monad ı uygulamanın geri kalanıyla oluşturmanıza olanak tanıyan bağlamı sağlar.
       *      Functors ve monad amacı, bu bağlamı soyutlamaktır, böylece bir şeyler oluştururken onun için endişelenmemize gerek kalmaz
       *
       *
       *     5 ==> KISS nedir?
       *
       *      KISS – Keep It Simple, Stupid
       *      KISS, basitlik ve sadeliğin altını çizen yazılım geliştirme prensibi, ve bence bu prensiplerin en önemlisi.
       *      Basitlik, kulağa olumsuz bir durummuş gibi gelse de,
       *      karmaşık problemleri çözmek adına çoğu zaman çok kritik bir ihtiyaç haline gelebiliyor.
       *      Basit düşünmek, düşünebilmek problemin temel sebebini görebilmek adına oldukça önemli.
       *      Kolay bir yol ile çözülebilecek problemleri ya da başka bir ifade ile,
       *      bir kaç satır kod ile geliştirilebilecek bir metodu, gereksiz ifadeler ile karmaşık hale sakın getirmeyin der KISS.
       *      Bunu derken, ihtiyacı en basit şekilde düşünerek, gerçekten ihtiyaca yönelik özellikleri öne çıkarmanın da altını çizer.
       *      Bir sistem ne kadar karmaşık olursa, onun sürdürebilirliğini sağlamak o kadar zor olur.
       *      Tabi, bu prensibi ele alırken, kalite özelliklerini mutlaka dikkate almak gerek.
       *      Basit olacak diye kalite özelliklerini görmezden gelirseniz sonuçta ortaya çıkan şey “basit” değil “sığ” olur.
       *
       *
       *      6==> YAGNI Nedir?
       *      YAGNI – You Ain’t Gonna Need It
       *      YAGNI, ihtiyacımız olmayacak şeyleri sisteme dahil etmemeyi söyleyen bir prensip.
       *      KISS’e oldukça benziyor belli noktalardan aslında. Geliştirme aşamasında, b
       *      azen öngörülü(?) davranıp ileride lazım olabileceğini düşündüğümüz sınıfları,metodları yazarız.
       *      Bu, hem ileride lazım olabilir(?) öngörüsü, hem de yaptığımız geliştirmeyi daha büyük görmek istememizden kaynaklanıyor aslında.
       *      E-mail atabilmemizi sağlayan bir sınıf ihtiyacımız olduğu zaman “Öyle bir sınıf yazdım ki, hem SMS atıyor, hem e-mail,
       *      hem de Push Notification gönderiyor” diye havalara girdiğimizde, zamanı geldiğinde gerçekler tokatı yapıştırır.
       *      YAGNI, bu tokatın gelmemesini sağlayan en önemli prensip.
       *      Yazılımlara, sanatsal yönümüzü de kullanarak geliştirdiğimiz/eklediğimiz her özellik,
       *      temelinde ekstra maliyet olarak karşımıza çıkacaktır.
       *      Talep edilmemiş olmasına rağmen, geliştirdiğimiz bu özellikler
       *      ek test eforu, dökümantasyon ve sonrasında da bakım kavramlarını da dikkate almamızı gerektirecektir.
       *      Ek özellikler ile alengirli bir yazılım yapalım derken, aslında daha karmaşık ve daha da karmaşıklığa giden bir yazılım
       *      geliştirme ihtimalimiz o kadar artar.
       *      O yüzden, ihtiyaç olarak belirtilmemiş geliştirmelerden kaçınmakta her zaman fayda olacaktır.
       *
       *      7==> DRY nedir?
       *      DRY (Don’t Repeat Yourself)
       *      Don’t repeat yourself (DRY), yazılım kalıplarının tekrarlanmasını (code duplication) ve buna bağlı olarak ortaya çıkabilecek fazlalıkların
       *      / karmaşanın önlenmesini amaçlayan bir yazılım geliştirme ilkesidir1.
       *      DRY prensibi, “Her bilginin bir sistem içinde tek, kesin ve yetkili bir temsili ile var olması” gerektiğini vurgular.
       *      Prensip Andy Hunt2 ve Dave Thomas3 tarafından Pragmatic Programmer4 5 kitabında formüle edilmiştir.
       *
       *      Dave Thomas, “Çoğu kişi DRY’i kodun tekrarından kaçınmak ile sınırlandırsa da,
       *      prensibin ardındaki fikir bunun çok daha ötesindedir” der.
       *      Tüm bu bilgiler göz önüne alındığında, neden her özelliği temsil eden bir yol bulmaya çalışmayalım?
       *      İlk akla gelen cevap, eğer aynı amaca hizmet eden birden fazla yol söz konusu ise büyük ihtimalle her yol bir diğeri ile çelişecektir.
       *      Çelişmeseler dahi, bir değişiklik gerçekleştirildiğinde yine bir sorun yaşanmayacağının garantisi yoktur.
       *
       *      DRY prensibinin başarıyla uygulanması,
       *      sistemde herhangi bir değişiklik söz konusu olduğunda diğer mantıksal elemanların
       *      bu değişiklikten etkileyip etkilemeyeceğini düşünmememiz anlamına gelir.
       *      Ek olarak, ilişkili mantıksal elemanlarda da etkiler tahmin edilebilir olacağı için
       *      düzgün bir şekilde süreç ele alınacak ve değişiklikler güncel olarak yönetilebilecektir.
       *
       *      */

     }