package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getColorScheme", id = 3)
    public final int f15146OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getButtonSize", id = 2)
    public final int f15147OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getScopes", id = 4)
    @Deprecated
    public final Scope[] f15148OooO0oO;

    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @Nullable @SafeParcelable.Param(id = 4) Scope[] scopeArr) {
        this.f15145OooO0Oo = i;
        this.f15147OooO0o0 = i2;
        this.f15146OooO0o = i3;
        this.f15148OooO0oO = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15145OooO0Oo);
        SafeParcelWriter.writeInt(parcel, 2, this.f15147OooO0o0);
        SafeParcelWriter.writeInt(parcel, 3, this.f15146OooO0o);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f15148OooO0oO, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
