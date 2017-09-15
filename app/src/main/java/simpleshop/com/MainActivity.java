package simpleshop.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import simpleshop.com.model.Product;
import simpleshop.com.model.section.SectionItem;
import simpleshop.com.utils.MockData;

public class MainActivity extends AppCompatActivity {

    public static final String BOOKS_SECTION = "Книги";
    public static final String DISCS_SECTION = "Диски";

    private List<Product> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        ListView listOfProducts = (ListView) findViewById(R.id.listOfBooks);

        ProductAdapter booksAdapter = new ProductAdapter(this, products);

        listOfProducts.setAdapter(booksAdapter);

        listOfProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Product p = products.get(i);
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
        products.add(new SectionItem(BOOKS_SECTION, 0, 0));
        products.addAll(MockData.getBooks());
        products.add(new SectionItem(DISCS_SECTION, 0, 0));
        products.addAll(MockData.getDisc());
    }
}
