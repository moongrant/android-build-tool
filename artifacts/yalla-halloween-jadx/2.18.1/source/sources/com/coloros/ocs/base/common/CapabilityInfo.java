package com.coloros.ocs.base.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CapabilityInfo implements Parcelable {
    public static final Parcelable.Creator<CapabilityInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public IBinder f12629Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<Feature> f12630Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12631Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public AuthResult f12632Oooo0oo;

    public static class OooO00o implements Parcelable.Creator<CapabilityInfo> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CapabilityInfo createFromParcel(Parcel parcel) {
            return new CapabilityInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CapabilityInfo[] newArray(int i) {
            return new CapabilityInfo[i];
        }
    }

    public CapabilityInfo(Parcel parcel) {
        this.f12630Oooo0o = parcel.readArrayList(Feature.class.getClassLoader());
        this.f12631Oooo0oO = parcel.readInt();
        this.f12632Oooo0oo = (AuthResult) parcel.readParcelable(AuthResult.class.getClassLoader());
        this.f12629Oooo = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f12630Oooo0o);
        parcel.writeInt(this.f12631Oooo0oO);
        parcel.writeParcelable(this.f12632Oooo0oo, 0);
        parcel.writeStrongBinder(this.f12629Oooo);
    }
}
