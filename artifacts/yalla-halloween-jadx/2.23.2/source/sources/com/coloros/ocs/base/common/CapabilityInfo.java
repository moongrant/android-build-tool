package com.coloros.ocs.base.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CapabilityInfo implements Parcelable {
    public static final Parcelable.Creator<CapabilityInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f13557OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AuthResult f13558OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f13559OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final IBinder f13560OooO0oO;

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
        this.f13557OooO0Oo = parcel.readArrayList(Feature.class.getClassLoader());
        this.f13559OooO0o0 = parcel.readInt();
        this.f13558OooO0o = (AuthResult) parcel.readParcelable(AuthResult.class.getClassLoader());
        this.f13560OooO0oO = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f13557OooO0Oo);
        parcel.writeInt(this.f13559OooO0o0);
        parcel.writeParcelable(this.f13558OooO0o, 0);
        parcel.writeStrongBinder(this.f13560OooO0oO);
    }
}
