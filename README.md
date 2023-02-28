# DesignPatterns

Design pattern implementations are mostly based on ***Akın Kaldıroğlu***'s examples. Therefore, it is better to follow his courses.

### Creational Design Patterns

- Singleton
- Factory Method
- Builder

### Behavioral Design Patterns

- Observer

### Structural Design Patterns

- **Proxy**
  - Ulaşılmak istenen orijinal nesneye doğrudan erişimi kontrol ederek, istek orijinal nesneye ulaşmadan önce veya sonra bir şeyler gerçekleştirilebilmesini sağlar.
  - Aşağıdaki durumlarda **proxy** pattern kullanılabilir:
    - Nesne çok sık değişiyor olabilir. Bu durumda istemcileri bu değişimden korumak gerekebilir.
    - Nesne oluşturma zaman alıyor olabilir ve nesne oluşturma maliyeti yüksek olabilir.
    - Nesne remote object olabilir. Bu durumda nesne dışarıdan yalıtılmış olabilir ve uzaktan erişilerek nesne oluşturmak gerekebilir.
    - Nesne erişimi kısıtlı olabilir.
  - Yukarıda bahsedilen durumlarda proxy pattern kullanılabilir.
  - Nesneye erişimin kontrol edilmesi gereken durumları nesne üzerinden gidermek nesnenin birlikteliğini düşürür.
  - **Proxy** nesne istemciyi asıl nesneden yalıtır. Bu sayede asıl nesneye olan bağımlılığı ortadan kaldırır.
