package simpleshop.com.model.section;

import android.os.Parcel;
import android.os.Parcelable;

import simpleshop.com.model.Product;


public class SectionItem extends Product {

    public SectionItem(String name, int price, int barcode) {
        super(name, price, barcode);
    }

    private SectionItem(Parcel in) {
        super(in);
    }


    public static final Parcelable.Creator<SectionItem> CREATOR
            = new Parcelable.Creator<SectionItem>() {
        public SectionItem createFromParcel(final Parcel in) {
            return new SectionItem(in);
        }

        public SectionItem[] newArray(final int size) {
            return new SectionItem[size];
        }
    };

    @Override
    public boolean isSection() {
        return true;
    }


    @Override
    public String getProductType() {
        return null;
    }

    @Override
    public String getContentType() {
        return null;
    }

    @Override
    public String getFirstParam() {
        return null;
    }

    @Override
    public String getSecondParam() {
        return null;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }
}
