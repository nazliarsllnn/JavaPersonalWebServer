# Java Kişisel Web Sunucusu

Bu proje, Java programlama dili ve Socket programlama kullanılarak geliştirilmiş basit bir kişisel web sunucusudur.

Proje, herhangi bir üçüncü taraf kütüphane veya framework kullanılmadan, yalnızca Java'nın standart kütüphaneleri ile oluşturulmuştur.

## Proje Hakkında

Java Kişisel Web Sunucusu, 1989 portu üzerinden gelen istemci bağlantılarını kabul eden ve HTTP protokolü aracılığıyla tarayıcılara HTML sayfası sunan bir uygulamadır.

Kullanıcı herhangi bir web tarayıcısı üzerinden sunucuya bağlandığında kişisel bilgilerimi içeren bir web sayfası görüntülenir.

Web sayfasında aşağıdaki bilgiler bulunmaktadır:

- Ad ve soyad
- Öğrenci numarası
- Kısa biyografi
- HTML ve CSS ile hazırlanmış kişisel tasarım

## Kullanılan Teknolojiler

- Java
- Java Socket Programlama
- HTTP Protokolü
- HTML5
- CSS3
- IntelliJ IDEA

**Not:** Projede herhangi bir üçüncü taraf kütüphane veya framework kullanılmamıştır.

## Proje Dosya Yapısı

```text
JavaPersonalWebServer/
│
├── src/
│   └── com/
│       └── personalserver/
│           ├── Main.java
│           ├── WebServer.java
│           ├── ClientHandler.java
│           ├── HttpResponse.java
│           ├── HtmlPage.java
│           ├── PageProvider.java
│           └── ResponseBuilder.java
│
├── .gitignore
└── README.md
```

## Sınıfların Görevleri

| Sınıf | Açıklama |
|---|---|
| Main | Uygulamanın başlangıç noktasıdır. |
| WebServer | Sunucuyu başlatır ve 1989 portunda bağlantıları dinler. |
| ClientHandler | İstemcilerden gelen bağlantıları ve HTTP isteklerini yönetir. |
| HttpResponse | Tarayıcıya gönderilecek HTTP yanıtını oluşturur. |
| HtmlPage | Kişisel web sayfasının HTML içeriğini oluşturur. |
| PageProvider | HTML sayfası oluşturma işlemini tanımlayan arayüzdür. |
| ResponseBuilder | HTTP yanıtı oluşturma işlemini tanımlayan arayüzdür. |

## Projenin Özellikleri

- 1989 portu üzerinden bağlantı kabul eder.
- ServerSocket kullanarak istemci bağlantılarını dinler.
- Socket üzerinden istemci ve sunucu iletişimini sağlar.
- HTTP isteklerini okur.
- HTTP yanıtlarını tarayıcıya gönderir.
- Birden fazla istemci bağlantısını Java Thread yapısıyla yönetir.
- UTF-8 karakter kodlamasını destekler.
- HTML ve CSS kullanılarak tasarlanmış kişisel web sayfası sunar.
- Nesne yönelimli programlama prensiplerinden yararlanır.
- SOLID prensiplerine uygun bir yazılım mimarisi hedefler.

## SOLID Prensiplerinin Uygulanması

### 1. Single Responsibility Principle (Tek Sorumluluk Prensibi)

Her sınıfın belirli bir görevi bulunmaktadır.

- WebServer sunucu yönetiminden sorumludur.
- ClientHandler istemci bağlantılarını yönetir.
- HtmlPage HTML içeriğini oluşturur.
- HttpResponse HTTP yanıtını hazırlar.

Bu sayede sınıfların sorumlulukları birbirinden ayrılmıştır.

### 2. Open/Closed Principle (Açık/Kapalı Prensibi)

PageProvider ve ResponseBuilder arayüzleri sayesinde mevcut kodları değiştirmeden yeni sayfa ve yanıt oluşturma uygulamaları eklenebilir.

### 3. Liskov Substitution Principle (Liskov Yerine Geçme Prensibi)

PageProvider ve ResponseBuilder arayüzlerini uygulayan sınıflar, beklenen davranışları korudukları sürece ilgili arayüzlerin yerine kullanılabilir.

### 4. Interface Segregation Principle (Arayüz Ayırma Prensibi)

Birbirinden farklı görevler için küçük ve amaca yönelik iki ayrı arayüz oluşturulmuştur. Böylece sınıfların ihtiyaç duymadıkları metotlara bağımlı olması önlenmiştir.

### 5. Dependency Inversion Principle (Bağımlılıkların Tersine Çevrilmesi Prensibi)

ClientHandler sınıfı doğrudan somut sınıflara bağımlı değildir. Bunun yerine PageProvider ve ResponseBuilder arayüzleri üzerinden çalışır. Bağımlılıklar yapıcı metot aracılığıyla aktarılır.

## Kurulum ve Çalıştırma

### Gereksinimler

- JDK 17 veya üzeri
- IntelliJ IDEA veya başka bir Java geliştirme ortamı
- İnternet tarayıcısı

### Çalıştırma Adımları

1. GitHub deposunu bilgisayarınıza indirin veya klonlayın.
2. Projeyi IntelliJ IDEA ile açın.
3. JDK yapılandırmasının doğru olduğunu kontrol edin.
4. `Main.java` dosyasını açın.
5. Main metodunu çalıştırın.

Sunucu otomatik olarak 1989 portunda çalışmaya başlayacaktır.

## Tarayıcı Üzerinden Erişim

Sunucu çalıştırıldıktan sonra herhangi bir web tarayıcısının adres çubuğuna aşağıdaki adres yazılmalıdır:

```text
http://localhost:1989
```

Bağlantı kurulduğunda kişisel web sayfası görüntülenecektir.

## Sunucu Yapılandırması

| Özellik | Değer |
|---|---|
| Sunucu Portu | 1989 |
| İletişim Protokolü | HTTP/1.1 |
| Karakter Kodlaması | UTF-8 |
| Programlama Dili | Java |
| Bağlantı Yönetimi | Çok iş parçacıklı (Multi-threaded) |

## Geliştirici Bilgileri

**Ad Soyad:** Nazlı Arslan

**Bölüm:** Yazılım Mühendisliği

**Öğrenci Numarası:** 1250505081

**Proje Adı:** Java Kişisel Web Sunucusu

## Projenin Amacı

Bu proje, Java programlama dili kullanılarak ağ iletişiminin temel prensiplerini öğrenmek, Socket programlamanın çalışma mantığını anlamak, istemci-sunucu iletişimini uygulamak ve SOLID prensiplerinin yazılım geliştirme sürecindeki önemini kavramak amacıyla geliştirilmiştir.
