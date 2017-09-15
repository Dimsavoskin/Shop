package simpleshop.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import simpleshop.com.model.Product;
import simpleshop.com.utils.MockData;

public class ProductInfoActivity extends AppCompatActivity {
    public static final String PRF_PRODUCT = "simpleshop_product";

    TextView name;
    TextView price;
    TextView barcode;
    TextView productType;
    TextView contentInfo;
    TextView specialInfo;
    TextView pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        findViews();
        initValues();
    }

    private void findViews() {
        productType = (TextView) findViewById(R.id.productTV);
        name = (TextView) findViewById(R.id.nameTV);
        contentInfo = (TextView) findViewById(R.id.typeTV);
        specialInfo = (TextView) findViewById(R.id.specialInfoTV);
        pages = (TextView) findViewById(R.id.pagesTV);
        price = (TextView) findViewById(R.id.priceTV);
        barcode = (TextView) findViewById(R.id.barcodeTV);
    }

    private void initValues() {
        Intent intent = getIntent();
        Product product = intent.getExtras().getParcelable(PRF_PRODUCT);
        assert product != null;

        name.setText(product.getName());
        price.setText(String.valueOf(product.getPrice()));
        barcode.setText(String.valueOf(product.getBarcode()));

        productType.setText(product.getProductType());
        contentInfo.setText(product.getContentType());
        pages.setText(product.getFirstParam() != null ? product.getFirstParam() : MockData.EMPTY_STRING);
        specialInfo.setText(product.getSecondParam());
    }
}
