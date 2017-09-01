package simpleshop.com.model;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class Product implements Parcelable{
    protected String name;
    protected int price;
    protected int barcode;

    public enum ProductType{
        BOOK("Книга"), DISC("Диск");
        private String objName;

        ProductType(String objName) {
            this.objName = objName;
        }

        public String getTypeName() {
            return objName;
        }
    }

    public Product(String name, int price, int barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    protected Product(final Parcel in) {
        this.name = in.readString();
        this.price = in.readInt();
        this.barcode = in.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(price);
        dest.writeInt(barcode);
    }

    public abstract String getProductType();
    public abstract String getContentType();
    public abstract String getFirstParam();
    public abstract String getSecondParam();

}
