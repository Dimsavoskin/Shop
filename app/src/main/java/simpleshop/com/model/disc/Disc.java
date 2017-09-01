package simpleshop.com.model.disc;

import android.os.Parcel;
import android.os.Parcelable;

import simpleshop.com.model.Product;

public class Disc extends Product {

    private DiscType discType;
    private DiscContent discContent;


    public enum DiscType {
        CD, DVD;
    }

    public enum DiscContent {
        MUSIC("Музыка"), SOFTWARE("Программное обеспечение"), VIDEO("Видео");

        private String realName;
        DiscContent(String realName) {
            this.realName = realName;
        }

        public String getRealName() {
            return realName;
        }
    }

    public Disc(String name, int price, int barcode, DiscType discType, DiscContent discContent) {
        super(name, price, barcode);
        this.discType = discType;
        this.discContent = discContent;
    }

    private Disc(final Parcel in) {
        super(in);
        this.discType = DiscType.valueOf(in.readString());
        this.discContent = DiscContent.valueOf(in.readString());
    }

    public DiscType getDiscType() {
        return discType;
    }

    public void setDiscType(DiscType discType) {
        this.discType = discType;
    }

    public DiscContent getDiscContent() {
        return discContent;
    }

    public void setDiscContent(DiscContent discContent) {
        this.discContent = discContent;
    }

    @Override
    public String getProductType() {
        return ProductType.DISC.getTypeName();
    }

    @Override
    public String getContentType() {
        return discContent.getRealName();
    }

    @Override
    public String getFirstParam() {
        return getDiscType().name();
    }

    @Override
    public String getSecondParam() {
        return null;
    }

    public static final Parcelable.Creator<Disc> CREATOR
            = new Parcelable.Creator<Disc>() {
        public Disc createFromParcel(final Parcel in) {
            return new Disc(in);
        }

        public Disc[] newArray(final int size) {
            return new Disc[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeString(discType.toString());
        dest.writeString(discContent.toString());
    }
}
