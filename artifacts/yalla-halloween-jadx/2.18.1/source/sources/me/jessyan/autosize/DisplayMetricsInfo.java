package me.jessyan.autosize;

import OooO00o.OooO00o;
import android.os.Parcel;
import android.os.Parcelable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public class DisplayMetricsInfo implements Parcelable {
    public static final Parcelable.Creator<DisplayMetricsInfo> CREATOR = new Parcelable.Creator<DisplayMetricsInfo>() { // from class: me.jessyan.autosize.DisplayMetricsInfo.1
        @Override // android.os.Parcelable.Creator
        public DisplayMetricsInfo createFromParcel(Parcel parcel) {
            return new DisplayMetricsInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DisplayMetricsInfo[] newArray(int i) {
            return new DisplayMetricsInfo[i];
        }
    };
    private float density;
    private int densityDpi;
    private float scaledDensity;
    private int screenHeightDp;
    private int screenWidthDp;
    private float xdpi;

    public DisplayMetricsInfo(float f, int i, float f2, float f3) {
        this.density = f;
        this.densityDpi = i;
        this.scaledDensity = f2;
        this.xdpi = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDensity() {
        return this.density;
    }

    public int getDensityDpi() {
        return this.densityDpi;
    }

    public float getScaledDensity() {
        return this.scaledDensity;
    }

    public int getScreenHeightDp() {
        return this.screenHeightDp;
    }

    public int getScreenWidthDp() {
        return this.screenWidthDp;
    }

    public float getXdpi() {
        return this.xdpi;
    }

    public void setDensity(float f) {
        this.density = f;
    }

    public void setDensityDpi(int i) {
        this.densityDpi = i;
    }

    public void setScaledDensity(float f) {
        this.scaledDensity = f;
    }

    public void setScreenHeightDp(int i) {
        this.screenHeightDp = i;
    }

    public void setScreenWidthDp(int i) {
        this.screenWidthDp = i;
    }

    public void setXdpi(float f) {
        this.xdpi = f;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DisplayMetricsInfo{density=");
        sbOooO0o0.append(this.density);
        sbOooO0o0.append(", densityDpi=");
        sbOooO0o0.append(this.densityDpi);
        sbOooO0o0.append(", scaledDensity=");
        sbOooO0o0.append(this.scaledDensity);
        sbOooO0o0.append(", xdpi=");
        sbOooO0o0.append(this.xdpi);
        sbOooO0o0.append(", screenWidthDp=");
        sbOooO0o0.append(this.screenWidthDp);
        sbOooO0o0.append(", screenHeightDp=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.screenHeightDp, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.density);
        parcel.writeInt(this.densityDpi);
        parcel.writeFloat(this.scaledDensity);
        parcel.writeFloat(this.xdpi);
        parcel.writeInt(this.screenWidthDp);
        parcel.writeInt(this.screenHeightDp);
    }

    public DisplayMetricsInfo(float f, int i, float f2, float f3, int i2, int i3) {
        this.density = f;
        this.densityDpi = i;
        this.scaledDensity = f2;
        this.xdpi = f3;
        this.screenWidthDp = i2;
        this.screenHeightDp = i3;
    }

    public DisplayMetricsInfo(Parcel parcel) {
        this.density = parcel.readFloat();
        this.densityDpi = parcel.readInt();
        this.scaledDensity = parcel.readFloat();
        this.xdpi = parcel.readFloat();
        this.screenWidthDp = parcel.readInt();
        this.screenHeightDp = parcel.readInt();
    }
}
