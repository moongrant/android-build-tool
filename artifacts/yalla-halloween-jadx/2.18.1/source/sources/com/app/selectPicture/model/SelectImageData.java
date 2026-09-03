package com.app.selectPicture.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SelectImageData implements Parcelable {
    public static final Parcelable.Creator<SelectImageData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ArrayList<Uri> f12327Oooo0o;

    public class OooO00o implements Parcelable.Creator<SelectImageData> {
        @Override // android.os.Parcelable.Creator
        public final SelectImageData createFromParcel(Parcel parcel) {
            return new SelectImageData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectImageData[] newArray(int i) {
            return new SelectImageData[i];
        }
    }

    public SelectImageData() {
        this.f12327Oooo0o = null;
    }

    public final ArrayList<Uri> OooO00o() {
        if (this.f12327Oooo0o == null) {
            this.f12327Oooo0o = new ArrayList<>();
        }
        return this.f12327Oooo0o;
    }

    public final Uri OooO0O0() {
        if (OooO00o().size() > 0) {
            return OooO00o().get(0);
        }
        return null;
    }

    public final SelectImageData OooO0OO(Uri uri) {
        OooO00o().clear();
        OooO00o().add(uri);
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SelectImageData{, selectUri=");
        sbOooO0o0.append(this.f12327Oooo0o);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f12327Oooo0o);
    }

    public SelectImageData(Parcel parcel) {
        this.f12327Oooo0o = null;
        this.f12327Oooo0o = parcel.createTypedArrayList(Uri.CREATOR);
    }
}
