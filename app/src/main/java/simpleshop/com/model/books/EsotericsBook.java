package simpleshop.com.model.books;

import android.os.Parcel;
import android.os.Parcelable;

public class EsotericsBook extends Book {
    public static final String CONTENTTYPE = "Кулинария";

    private int minAge;

    public EsotericsBook(String name, int price, int barcode, int pages, int minAge) {
        super(name, price, barcode, pages);
        this.minAge = minAge;
    }

    private EsotericsBook(final Parcel in) {
        super(in);
        minAge = in.readInt();
    }

    public static final Parcelable.Creator<EsotericsBook> CREATOR
            = new Parcelable.Creator<EsotericsBook>() {
        public EsotericsBook createFromParcel(final Parcel in) {
            return new EsotericsBook(in);
        }

        public EsotericsBook[] newArray(final int size) {
            return new EsotericsBook[size];
        }
    };

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public String getSecondParam() {
        return String.valueOf(minAge);
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
        dest.writeInt(minAge);
    }
}
