package com.example.dimsa.shop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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

            }
        });


    }

    void init() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                books.add(new ProgrammingBook("Book " + i, i * 100 + 100, i * 37 + 92, i * 50 + 30, "Java"));
            } else {
                books.add(new CookeryBook("Book " + i, i * 100 + 100, i * 37 + 92, i * 50 + 30, "Apple"));
            }
            discs.add(new Disc("Disc " + i, i * 100 + 100, i * 37 + 92));
        }
    }
}
