1. ordersAndUsers.json Dosyasında kullanıcılar ve herbir kullanıcının sipariş bilgisi yer almaktadır.
2. Kullanıcı Bilgileri ve kullanıcıların siprişleri json dosyasından okunarak aşağıdaki gibi
bir class yapısına sahip nesne içerisinde tutulacak.

class UserOrders{
	string userID,
	string userName,
	string passsword
	int totalFees;
	ArrayList<Order> orders
}

Not: Order class'ını sen tanımlarsın

3. Aşağıdaki yapı kullanılarak tüm kullanıcıların bilgileri siparişleri ile beraber bir Array List içerisinde tutulacak
	ArrayList<UserOrders> .......=............

4. Üçüncü Adımda oluşturduğun listedeki tüm kullanıcıları ve sipariş bilgilerinin aşağıdaki şekilde ekrana yazdırınız
(Main Method içerisinde parse method'u çalıştırılarak ekrana yazdırma işlemi yaptırılacak )

User ID--> 10
User Name--> ahmet
User Password-->5564
Orders:
	Order-1--> Order Id:88 Order Details:Asus, Order Fees:98 TL
	Order-2--> Order Id:99 Order Details:Lenova, Order Fees:50 TL
	--------
	--------
Totol Fees--> 148 TL
----
----
----
----
----


yol


//users collection

//user tipinde generic arraylist  ArrayList<userlist> userlist = new ArrayList<>();

//order tipinde generic arraylist olustur data2  ArrayList<Order> orderlist = new ArrayList<>();

//userlarin hepsini  userlist ya yolladim order null ama

//sonra tum orderlari  orderlist ye atip ==== ve orderlist olacak

//user listesindeki tum userlari okuyacaksin id sine bakacaksin sonrada order listesindeki id ye ait orderlari liste olarak alip userlistin orderlistine atayacaksin
