package simpleshop.com.model.books;

import android.os.Parcel;

import simpleshop.com.model.Product;

public abstract class Book extends Product {
    private int pages;

    public Book(String name, int price, int barcode, int pages) {
        super(name, price, barcode);
        this.pages = pages;
    }

    protected Book(final Parcel in) {
        super(in);
        pages = in.readInt();
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeInt(pages);
    }

    public int getPageSize() {
        return this.pages;
    }

    @Override
    public String getFirstParam() {
        return String.valueOf(pages);
    }

    @Override
    public String getProductType() {
        return ProductType.BOOK.getTypeName();
    }
}
