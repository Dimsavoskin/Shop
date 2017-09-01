package simpleshop.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import simpleshop.com.model.books.Book;
import simpleshop.com.model.disc.Disc;
import simpleshop.com.model.Product;
import simpleshop.com.utils.MockData;

public class MainActivity extends AppCompatActivity {

    private List<Book> books = new ArrayList<>();
    private List<Disc> discs = new ArrayList<>();

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
                Product p = books.get(i);
                showProductInfo(p);
            }
        });

        listOfDiscs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product p = discs.get(i);
                showProductInfo(p);
            }
        });
    }

    private void showProductInfo(Product p) {
        Intent intent = new Intent(MainActivity.this, ProductInfoActivity.class);
        intent.putExtra(ProductInfoActivity.PRF_PRODUCT, p);
        startActivity(intent);
    }

    void init() {
        books.addAll(MockData.getBooks());
        discs.addAll(MockData.getDisc());
    }
}
