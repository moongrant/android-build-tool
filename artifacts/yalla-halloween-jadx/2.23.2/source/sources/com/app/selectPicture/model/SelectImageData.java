package com.app.selectPicture.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class SelectImageData implements Parcelable {
    public static final Parcelable.Creator<SelectImageData> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<Uri> f12876OooO0Oo;

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
        this.f12876OooO0Oo = null;
    }

    public final ArrayList<Uri> OooO00o() {
        if (this.f12876OooO0Oo == null) {
            this.f12876OooO0Oo = new ArrayList<>();
        }
        return this.f12876OooO0Oo;
    }

    public final Uri OooO0O0() {
        if (OooO00o().size() > 0) {
            return OooO00o().get(0);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SelectImageData{, selectUri=" + this.f12876OooO0Oo + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f12876OooO0Oo);
    }

    public SelectImageData(Parcel parcel) {
        this.f12876OooO0Oo = null;
        this.f12876OooO0Oo = parcel.createTypedArrayList(Uri.CREATOR);
    }
}
