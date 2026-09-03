package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f4270Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f4271Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f4272Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f4273Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f4274OoooO00;

    public static class OooO00o implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f4271Oooo0o = parcel.readInt();
        this.f4273Oooo0oo = parcel.readInt();
        this.f4270Oooo = parcel.readInt();
        this.f4274OoooO00 = parcel.readInt();
        this.f4272Oooo0oO = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4271Oooo0o);
        parcel.writeInt(this.f4273Oooo0oo);
        parcel.writeInt(this.f4270Oooo);
        parcel.writeInt(this.f4274OoooO00);
        parcel.writeInt(this.f4272Oooo0oO);
    }
}
