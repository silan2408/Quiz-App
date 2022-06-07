package com.ders.appquiz;

import java.util.ArrayList;
import java.util.List;

public class Sorular {
    private static List<QuestionsList> javaQuestion(){
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList questions1 = new QuestionsList("Java’da “Merhaba Dünya” çıktısını almak için doğru sözdizimi nedir?","print(“Merhaba Dünya”);","Console.WriteLine(“Merhaba Dünya”);","System.out.println(“Merhaba Dünya”);","echo “Merhaba Dünya”;","System.out.println(“Merhaba Dünya","");
        final QuestionsList questions2 = new QuestionsList("Hangisi bir boş anahtarın ve boş değerlerin depolanmasına izin verir?","Hashtable","HashMap","HashSet","Hiçbiri","HashMap","");
        final QuestionsList questions3 = new QuestionsList("Java koduna YORUMLARI nasıl eklersiniz?","#Bu bir yorum","<!– Bu bir yorum –>","/* Bu bir yorum","// Bu bir yorum","// Bu bir yorum","");
        final QuestionsList questions4 = new QuestionsList("Metni depolamak için aşağıdaki veri türlerinden hangisini kullanılması gerekir?","Var","Chars","String","Int","String","");
        final QuestionsList questions5 = new QuestionsList("Statik bağlama, bağlama için hangi bilgileri kullanır?","tpe.","object","Yukarıdakilerin her ikisi.","Yukarıdakilerin hiçbiri.","tpe.","");
        final QuestionsList questions6 = new QuestionsList("Bir java sınıfının main metodu için doğru sözdizimi nedir?","public static int main(String[] args)","public int main(String[] args)","public static void main(String[] args)","None of the above.","public static void main(String[] args)","");
        final QuestionsList questions7 = new QuestionsList("Çok biçimlilik nedir?","Çok biçimlilik, aynı türden farklı nesneleri tanımlama tekniğidir.","Çok biçimlilik, bir nesnenin birçok form alma yeteneğidir.","Çok biçimlilik, aynı türden farklı yöntemleri tanımlamak için kullanılan bir tekniktir.","Yukarıdakilerin hiçbiri.","Çok biçimlilik, bir nesnenin birçok form alma yeteneğidir.","");
        final QuestionsList questions8 = new QuestionsList("final sınıfla ilgili doğru olan nedir?"," final olarak tanımlanmış bir sınıftır.","final sınıflar oluşturulur, böylece bu sınıf tarafından uygulanan yöntemler geçersiz kılınamaz.","Miras alınamaz.","Yukarıdakilerin hepsi.","Yukarıdakilerin hepsi.","");
        final QuestionsList questions9 = new QuestionsList("Ondalıklı sayı oluşturmak için aşağıdakilerden hangisi kullanılır?"," float x =2.8f;","float x = 2,8f;","float x = 2.8;","float x =2,8;","float x =2.8f;","");
        final QuestionsList questions10 = new QuestionsList("private access değiştirici hakkında aşağıdakilerden hangisi doğrudur?","Özel olarak bildirilen değişkenlere, metodlara ve kuruculara yalnızca aynı sınıfın üyeleri tarafından erişilebilir.","Özel olarak bildirilen değişkenlere, metodlarave kuruculara aynı pakette yer alan herhangi bir sınıf tarafından erişilebilir.","Üst sınıfta özel olarak bildirilen değişkenlere, yöntemlere ve kuruculara yalnızca alt sınıfı tarafından erişilebilir.","Yukarıdakilerin hiçbiri.","Özel olarak bildirilen değişkenlere, metodlara ve kuruculara yalnızca aynı sınıfın üyeleri tarafından erişilebilir.","");


        questionsList.add(questions1);
        questionsList.add(questions2);
        questionsList.add(questions3);
        questionsList.add(questions4);
        questionsList.add(questions5);
        questionsList.add(questions6);
        questionsList.add(questions7);
        questionsList.add(questions8);
        questionsList.add(questions9);
        questionsList.add(questions10);

        return questionsList;
    }
    private static List<QuestionsList> fireQuestion(){
        final List<QuestionsList> questionsList = new ArrayList<>();
        final QuestionsList questions1 = new QuestionsList("Aşağıdaki değişken isimlerinden hangisi hatalıdır?","ogrenciNo"," ogrenci sinif","OgrenciAd","ogrenci_soyad","ogrenci sinif","");
        final QuestionsList questions2 = new QuestionsList("Mod alma işlemini aşağıdaki karakterleden hangisi gerçekleştirir?",">","!","&","%","%","");
        final QuestionsList questions3 = new QuestionsList("Aşağıdakilerden hangisi veri tiplerinden değildir?","string","int","slong","byte","slong","");
        final QuestionsList questions4 = new QuestionsList("Aşağıdakilerden hangisi ilişkisel operatörler arasında yer almaz?","||","<=","!=",">","||","");
        final QuestionsList questions5 = new QuestionsList("8 bit işaretsiz tam sayı tipi aşağıdakilerden hangisidir?","byte","int","long","short","byte","");
        final QuestionsList questions6 = new QuestionsList("Koşul ifadelerinin karşılaştırılmasında kullanılan öperatörlere ne denir?","ilişkisel","mantıksal ","Döngüler","Integer","mantıksal ","");
        final QuestionsList questions7 = new QuestionsList("Aşağıdaki yerel değişken tanımlamalardan hangisi doğru yapılmıştır?","float 12","int16 sayi","metinad","byte yas","byte yas","");
        final QuestionsList questions8 = new QuestionsList("Bir metin ifadesi ekrana yazdırmak için hangi metod kullanılır?","Console.Write","Readkey()","Readln()","Switch","Console.Write","");
        final QuestionsList questions9 = new QuestionsList("Aşağıdaki kullanımlardan hangisi ile önce arttırma işlemi yapıp daha \n" +
                "sonra atama işlemi yapılır?","a++"," ++a","+a","a+"," ++a","");
        final QuestionsList questions10 = new QuestionsList("Program boyunva sabit kalacak veriyi hangi kelime ile tanımlarız?","float","double","bool","const","const","");

        questionsList.add(questions1);
        questionsList.add(questions2);
        questionsList.add(questions3);
        questionsList.add(questions4);
        questionsList.add(questions5);
        questionsList.add(questions6);
        questionsList.add(questions7);
        questionsList.add(questions8);
        questionsList.add(questions9);
        questionsList.add(questions10);

        return questionsList;
    }

    public static List<QuestionsList> getQuestions(String  selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestion();

            default:
                return fireQuestion();

        }
    }
}
