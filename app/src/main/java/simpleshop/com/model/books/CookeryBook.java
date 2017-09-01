package simpleshop.com.model.books;

import android.os.Parcel;
import android.os.Parcelable;

public class CookeryBook extends Book {
    public static final String CONTENTTYPE = "Кулинария";
    private String ingredient;

    public CookeryBook(String name, int price, int barcode, int pages, String ingredient) {
        super(name, price, barcode, pages);
        this.ingredient = ingredient;
    }

    private CookeryBook(final Parcel in) {
        super(in);
        ingredient = in.readString();
    }

    public static final Parcelable.Creator<CookeryBook> CREATOR
            = new Parcelable.Creator<CookeryBook>() {
        public CookeryBook createFromParcel(final Parcel in) {
            return new CookeryBook(in);
        }

        public CookeryBook[] newArray(final int size) {
            return new CookeryBook[size];
        }
    };

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String getSecondParam() {
        return ingredient;
    }

    @Override
    public String getContentType() {
        return CONTENTTYPE;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(ingredient);
    }
}
