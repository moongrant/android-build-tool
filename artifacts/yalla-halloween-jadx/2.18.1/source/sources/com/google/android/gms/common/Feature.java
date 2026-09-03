package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzc();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getName", id = 1)
    public final String f15115Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    public final int f15116Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    public final long f15117Oooo0oo;

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) long j) {
        this.f15115Oooo0o = str;
        this.f15116Oooo0oO = i;
        this.f15117Oooo0oo = j;
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j) {
        this.f15115Oooo0o = str;
        this.f15117Oooo0oo = j;
        this.f15116Oooo0oO = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((getName() != null && getName().equals(feature.getName())) || (getName() == null && feature.getName() == null)) && getVersion() == feature.getVersion()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.f15115Oooo0o;
    }

    @KeepForSdk
    public long getVersion() {
        long j = this.f15117Oooo0oo;
        return j == -1 ? this.f15116Oooo0oO : j;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Long.valueOf(getVersion()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.f15116Oooo0oO);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
