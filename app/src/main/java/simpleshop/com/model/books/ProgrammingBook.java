package simpleshop.com.model.books;

import android.os.Parcel;
import android.os.Parcelable;

public class ProgrammingBook extends Book {
    public static final String CONTENTTYPE = "Программирование";
    private static final String PREFIX_STR = "Язык программирования ";

    private String language;

    public ProgrammingBook(String name, int price, int barcode, int pages, String language) {
        super(name, price, barcode, pages);
        this.language = language;
    }

    private ProgrammingBook(final Parcel in) {
        super(in);
        language = in.readString();
    }

    public static final Parcelable.Creator<ProgrammingBook> CREATOR
            = new Parcelable.Creator<ProgrammingBook>() {
        public ProgrammingBook createFromParcel(final Parcel in) {
            return new ProgrammingBook(in);
        }

        public ProgrammingBook[] newArray(final int size) {
            return new ProgrammingBook[size];
        }
    };

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getSecondParam() {
        return PREFIX_STR + language;
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
        dest.writeString(language);
    }
}
