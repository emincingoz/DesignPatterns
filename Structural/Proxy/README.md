### Proxy Pattern

  - Ulaşılmak istenen orijinal nesneye doğrudan erişimi kontrol ederek, istek orijinal nesneye ulaşmadan önce veya sonra bir şeyler gerçekleştirilebilmesini sağlar.
  - Aşağıdaki durumlarda **proxy** pattern kullanılabilir:
    - Nesne çok sık değişiyor olabilir. Bu durumda istemcileri bu değişimden korumak gerekebilir.
    - Nesne oluşturma zaman alıyor olabilir ve nesne oluşturma maliyeti yüksek olabilir.
    - Nesne remote object olabilir. Bu durumda nesne dışarıdan yalıtılmış olabilir ve uzaktan erişilerek nesne oluşturmak gerekebilir.
    - Nesne erişimi kısıtlı olabilir.
  - Nesneye erişimin kontrol edilmesi gereken durumları nesne üzerinden gidermek nesnenin birlikteliğini düşürür.
  - **Proxy** nesne istemciyi asıl nesneden yalıtır. Bu sayede asıl nesneye olan bağımlılığı ortadan kaldırır.
  - **Proxy** pattern ile **Adapter** pattern arasındaki temel fark, **proxy**'de proxy nesnesi ile asıl nesne aynı arayüzü implement ederken **adapter** pattern'da nesneler farklı arayüzleri implement ederler.
  - **Proxy** ile **Facade** arasındaki temel fark ise, **proxy**'de nesneler aynı arayüzü implement ederlerken **facade** pattern'da farklı arayüzler basitleştirilerek aynı yerde toplanmaktadır.
  ![image](https://user-images.githubusercontent.com/49842813/221957771-2161b1fe-575e-4785-87ff-1a9cba168fcd.png)
  - Yukarıdaki gibi istemci doğrudan arayüz üzerinden proxy'ye ulaşabildiği gibi arayüz ve istemci arasına aşağıdaki gibi bir **factory** nesnesi de eklenebilir.
  ![image](https://user-images.githubusercontent.com/49842813/221963131-240a1f24-3540-4708-97ec-15dae076239d.png)
