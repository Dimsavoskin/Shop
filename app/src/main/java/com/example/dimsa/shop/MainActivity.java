package com.example.dimsa.shop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

import static com.example.dimsa.shop.Disc.DiscType.CD;
import static com.example.dimsa.shop.Disc.DiscType.DVD;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Disc> discs = new ArrayList<>();

    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ListView listOfBooks = (ListView) findViewById(R.id.listOfBooks);
        ListView listOfDiscs = (ListView) findViewById(R.id.listOfDiscs);

        ProductAdapter booksAdapter = new ProductAdapter(this, books);
        ProductAdapter discsAdapter = new ProductAdapter(this, discs);

        listOfBooks.setAdapter(booksAdapter);
        listOfDiscs.setAdapter(discsAdapter);

        listOfBooks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product p = (Product) books.get(i);
                showProductInfo(p);
            }
        });

        listOfDiscs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product p = (Product) discs.get(i);
                showProductInfo(p);
            }
        });
    }

    private void showProductInfo(Product p) {
        String productType = "";
        String name = "";
        String contentType = "";
        String specialInfo = "";
        String pages = "";
        int price = p.getPrice();
        int barcode = p.getBarcode();

        if (p.getClass() == ProgrammingBook.class) {
            productType = "Книга";
            ProgrammingBook book = (ProgrammingBook) p;
            name = book.getName();
            contentType = book.CONTENTTYPE;
            specialInfo = "Язык программирования " + book.getLanguage();
            pages = book.getPages() + " страниц";

        } else if (p.getClass() == CookeryBook.class) {
            productType = "Книга";
            CookeryBook book = (CookeryBook) p;
            name = book.getName();
            contentType = book.CONTENTTYPE;
            specialInfo = "Главный ингридиент " + book.getIngredient();
            pages = book.getPages() + " страниц";
        } else if (p.getClass() == EsotericsBook.class) {
            productType = "Книга";
            EsotericsBook book = (EsotericsBook) p;
            name = book.getName();
            contentType = book.CONTENTTYPE;
            specialInfo = "Минимальный возраст " + book.getMinAge();
            pages = book.getPages() + " страниц";
        } else if (p.getClass() == ProgrammingDisc.class) {
            productType = "Диск";
            ProgrammingDisc disc = (ProgrammingDisc) p;
            name = disc.getName();
            contentType = disc.CONTENTTYPE;
            specialInfo = "Тип диска " + disc.getDiscType().name();

        } else if (p.getClass() == MusicDisc.class) {
            productType = "Диск";
            MusicDisc disc = (MusicDisc) p;
            name = disc.getName();
            contentType = disc.CONTENTTYPE;
            specialInfo = "Тип диска " + disc.getDiscType().name();
        } else if (p.getClass() == VideoDisc.class) {
            productType = "Диск";
            VideoDisc disc = (VideoDisc) p;
            name = disc.getName();
            contentType = disc.CONTENTTYPE;
            specialInfo = "Тип диска " + disc.getDiscType().name();
        }

        Intent intent = new Intent(MainActivity.this, ProductInfoActivity.class);
        intent.putExtra("productType", productType);
        intent.putExtra("name", name);
        intent.putExtra("type", contentType);
        intent.putExtra("specialInfo", specialInfo);
        intent.putExtra("pages", pages);
        intent.putExtra("price", price);
        intent.putExtra("barcode", barcode);

        startActivity(intent);
    }

    void init() {
        books.add(new EsotericsBook("Трансерфинг реальности", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new ProgrammingBook("Язык программирования C", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "C"));
        books.add(new CookeryBook("Гастрономическая энциклопедия", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Картошка"));
        books.add(new EsotericsBook("Энергия жизни", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new ProgrammingBook("CLR via C#", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "C#"));
        books.add(new CookeryBook("Казан, мангал и другие мужские удовольствия", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Рис"));
        books.add(new CookeryBook("О еде: строго конфиденциально", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Лук"));
        books.add(new EsotericsBook("Принципы управления реальностью", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new ProgrammingBook("Ruby Hacking Guide", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Ruby"));
        books.add(new CookeryBook("Хиты советской кухни. По ГОСТу и не только", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Тушенка"));
        books.add(new CookeryBook("Еда без правил. Простые принципы хорошей кухни", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Говядина"));
        books.add(new EsotericsBook("Расписание школы жизни", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new ProgrammingBook("Microservices for Java Developers", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Java"));
        books.add(new CookeryBook("О чем Эйнштейн рассказал своему повару", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Вермишель"));
        books.add(new EsotericsBook("Роза Мира", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, random.nextInt(21)));
        books.add(new CookeryBook("Пир льда и огня", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Сосиски"));
        books.add(new CookeryBook("Пироговедение для начинающих", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, random.nextInt(500) + 10, "Мука"));


        discs.add(new MusicDisc("The Beatles", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new ProgrammingDisc("Windows 8", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new VideoDisc("Pink Floyd: Momentary Lapses", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new MusicDisc("Led Zeppelin", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new MusicDisc("Guns N’Roses", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new VideoDisc("B.B. King: Live At Montreux", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new ProgrammingDisc("Nero 2017 Platinum Suite", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new ProgrammingDisc("Android studio", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new MusicDisc("The Rolling Stones", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new ProgrammingDisc("Microsoft Office 365", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new VideoDisc("Shakira: En Vivo Desde Paris", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new ProgrammingDisc("Visual studio 2015", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new MusicDisc("ABBA", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new MusicDisc("Queen", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new VideoDisc("Pink Floyd: The Dark Side Of The Moon ", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new MusicDisc("Boney M", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));
        discs.add(new ProgrammingDisc("IntelliJ IDEA", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, DVD));
        discs.add(new ProgrammingDisc("Kaspersky Internet Security", random.nextInt(2000) + 100, random.nextInt(900000) + 10000, CD));


//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                discs.add(new ProgrammingDisc("ProgrammingDisc " + i, i * 100 + 100, i * 37 + 92, DVD));
//                books.add(new ProgrammingBook("ProgrammingBook " + i, i * 100 + 100, i * 37 + 92, i * 50 + 30, "Java"));
//            } else {
//                discs.add(new VideoDisc("VideoDisc " + i, i * 100 + 100, i * 37 + 92, CD));
//                books.add(new CookeryBook("CookeryBook" + i, i * 100 + 100, i * 37 + 92, i * 50 + 30, "Apple"));
//            }
//
//        }
    }
}
