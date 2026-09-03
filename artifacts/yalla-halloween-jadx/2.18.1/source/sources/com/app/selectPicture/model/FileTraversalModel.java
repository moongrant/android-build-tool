package com.app.selectPicture.model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ParcelCreator"})
public class FileTraversalModel implements Parcelable {
    public static final Parcelable.Creator<FileTraversalModel> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f12311Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<ImageModel> f12312Oooo0oO = new ArrayList();

    public class OooO00o implements Parcelable.Creator<FileTraversalModel> {
        @Override // android.os.Parcelable.Creator
        public final FileTraversalModel createFromParcel(Parcel parcel) {
            FileTraversalModel fileTraversalModel = new FileTraversalModel();
            fileTraversalModel.f12311Oooo0o = parcel.readString();
            fileTraversalModel.f12312Oooo0oO = parcel.createTypedArrayList(ImageModel.CREATOR);
            return fileTraversalModel;
        }

        @Override // android.os.Parcelable.Creator
        public final FileTraversalModel[] newArray(int i) {
            return new FileTraversalModel[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FileTraversalModel{fileName='");
        sbOooO0o0.append(this.f12311Oooo0o);
        sbOooO0o0.append("fileContent.size='");
        sbOooO0o0.append(this.f12312Oooo0oO.size());
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12311Oooo0o);
        parcel.writeTypedList(this.f12312Oooo0oO);
    }
}
