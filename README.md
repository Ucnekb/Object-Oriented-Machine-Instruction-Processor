# Object-Oriented-Machine-Instruction-Processor

1. Sistemdeki tüm bileşenler (IR Register’ı, 16 satırlık RAM, 3x8 decoder, 4x16 decoder, SC (Sequence Counter),
Kontrol Sinyalleri) nesneye yönelik programlama tekniğine uygun şekilde tasarlanmalıdır. Yalnız decoder’ler,
iç yapıları da dikkate alınarak tasarlanmalıdır. Decoder’lerin iç yapısı için Mantıksal Devre Tasarımı dersindeki
7. Hafta sunumuna bakabilirsiniz. (Projenizde belirli sayıda ve uygun şekilde sınıflar ve metotlar
tanımlanmalıdır.)
2. SC (Sequence Counter), yani 4-bitlik sıra sayacı, 0000 ile 1111 arasında değerleri sırasıyla üretmektedir.
3. Uygulama çalıştığında ilk olarak RAM.txt isimli dosyayı okuyup dosyadaki kodları 16 satırlık RAM nesnesine
yüklemelidir. RAM.txt dosyasında 16 tane buyruğun makine kodu yer almaktadır. Örnek bir RAM.txt
dosyasının ekran görüntüsü aşağıda verilmiştir. Ödevle birlikte örnek bir dosya sisteme yüklenecektir.
Kendinizin de formata uygun farklı dosyalar oluşturup uygulamanızı test etmenizde yarar vardır.
4. Program, her 1 saniyede, yani her bir farklı T zamanında, 16 satırlık RAM’in ilgili satırındaki makine kodunu IR
register’ına yüklemeli, kodu çözmeli, yani ilgili kontrol sinyallerinin değerlerini belirlemeli ve sonuçları ekrana
yazmalıdır. Sonuçlarda ayrıca kodu çözülmüş olan buyruğun hangi buyruk olduğu da yazılmalıdır. Bunun için,
aşağıda verilmiş olan buyruk kod tablosunu kodunuza uygun şekilde gömerek kullanabilirsiniz. (Hatırlatma:
buyruk kod tablosundaki kodlar hexadesimal formattadır. Binary formata dönüştürerek kodunuza gömünüz.
) Örnek bir ekran görüntüsü aşağıda verilmiştir. Sonuçlar, örnek ekran görüntüsündeki formata uygun şekilde
ekrana yazılmalıdır.
5. Mesajlar doğru saniyede ekrana yazdırılmalıdır. Örneğin, “T0 zamanında I = 0 D1 aktif IR(11-0) =
111111111111 buyruk = ADD” mesajından 1 saniye sonra “T1 zamanında I = 1 D7 aktif IR(11-0) =
100000000000 buyruk = INP” mesajı ekrana yazdırılmalıdır. Süreleri ayarlamak için timer veya thread.sleep()
benzeri yapıları kullanabilirsiniz.

Örnek bir ekran görüntüsü aşağıda verilmiştir:

RAM.txt dosyası okundu.
T0 zamanında I = 0 D1 aktif IR(11-0) = 111111111111 buyruk = ADD
T1 zamanında I = 1 D7 aktif IR(11-0) = 100000000000 buyruk = INP
T2 zamanında I = 0 D7 aktif IR(11-0) = 100000000000 buyruk = CLA
⁝

![mimari1](https://github.com/user-attachments/assets/f34ec2ed-f31f-4a96-8a68-3d23789b032b)

![mimari2](https://github.com/user-attachments/assets/c1626fd6-fc8f-48be-acb8-40bbf2031ea3)

