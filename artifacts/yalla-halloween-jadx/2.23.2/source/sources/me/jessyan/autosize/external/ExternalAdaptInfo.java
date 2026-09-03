package me.jessyan.autosize.external;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class ExternalAdaptInfo implements Parcelable {
    public static final Parcelable.Creator<ExternalAdaptInfo> CREATOR = new Parcelable.Creator<ExternalAdaptInfo>() { // from class: me.jessyan.autosize.external.ExternalAdaptInfo.1
        @Override // android.os.Parcelable.Creator
        public ExternalAdaptInfo createFromParcel(Parcel parcel) {
            return new ExternalAdaptInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ExternalAdaptInfo[] newArray(int i) {
            return new ExternalAdaptInfo[i];
        }
    };
    private boolean isBaseOnWidth;
    private float sizeInDp;

    public ExternalAdaptInfo(boolean z) {
        this.isBaseOnWidth = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getSizeInDp() {
        return this.sizeInDp;
    }

    public boolean isBaseOnWidth() {
        return this.isBaseOnWidth;
    }

    public void setBaseOnWidth(boolean z) {
        this.isBaseOnWidth = z;
    }

    public void setSizeInDp(float f) {
        this.sizeInDp = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalAdaptInfo{isBaseOnWidth=");
        sb.append(this.isBaseOnWidth);
        sb.append(", sizeInDp=");
        return OooO00o.OooO00o(sb, this.sizeInDp, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isBaseOnWidth ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.sizeInDp);
    }

    public ExternalAdaptInfo(boolean z, float f) {
        this.isBaseOnWidth = z;
        this.sizeInDp = f;
    }

    public ExternalAdaptInfo(Parcel parcel) {
        this.isBaseOnWidth = parcel.readByte() != 0;
        this.sizeInDp = parcel.readFloat();
    }
}
