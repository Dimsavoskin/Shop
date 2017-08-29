package com.example.dimsa.shop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Disc> discs = new ArrayList<>();

    ListView listOfBooks;
    ListView listOfDiscs;

    ProductAdapter booksAdapter;
    ProductAdapter discsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        listOfBooks = (ListView) findViewById(R.id.listOfBooks);
        listOfDiscs = (ListView) findViewById(R.id.listOfDiscs);

        booksAdapter = new ProductAdapter(this, books);
        discsAdapter = new ProductAdapter(this, discs);

        listOfBooks.setAdapter(booksAdapter);
        listOfDiscs.setAdapter(discsAdapter);

        listOfBooks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String productType = "Книга";
                String name = "";
                String bookType = "";
                String specialInfo = "";

                Product p = (Product) books.get(i);

                if (p.getClass() == ProgrammingBook.class) {
                    ProgrammingBook book = (ProgrammingBook) p;
                    name = book.getName();
                    bookType = book.TYPE;
                    specialInfo = "Язык программирования " + book.getLanguage();

                } else if (p.getClass() == CookeryBook.class) {
                    CookeryBook book = (CookeryBook) p;
                    name = book.getName();
                    bookType = book.TYPE;
                    specialInfo = "Главный ингридиент " + book.getIngredient();
                } else if (p.getClass() == EsotericsBook.class) {
                    EsotericsBook book = (EsotericsBook) p;
                    name = book.getName();
                    bookType = book.TYPE;
                    specialInfo = "Минимальный возраст " + book.getMinAge();
                }


                Intent intent = new Intent(MainActivity.this, ProductInfoActivity.class);
                intent.putExtra("productType", productType);
                intent.putExtra("name", name);
                intent.putExtra("type", bookType);
                intent.putExtra("specialInfo", specialInfo);

                startActivity(intent);
            }
        });


    }

    void init() {
        books.add(new EsotericsBook("Book esoteric", 200, 620, 895412634, 12));


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                discs.add(new ProgrammingDisc("ProgrammingDisc " + i, i * 100 + 100, i * 37 + 92));
                books.add(new ProgrammingBook("Book " + i, i * 100 + 100, i * 37 + 92, i * 50 + 30, "Java"));
            } else {
                discs.add(new VideoDisc("VideoDisc " + i, i * 100 + 100, i * 37 + 92));
                books.add(new CookeryBook("Book " + i, i * 100 + 100, i * 37 + 92, i * 50 + 30, "Apple"));
            }

        }
    }
}
