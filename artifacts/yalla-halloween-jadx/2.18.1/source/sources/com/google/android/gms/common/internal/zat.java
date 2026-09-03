package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new zau();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getSignInAccountHint", id = 4)
    public final GoogleSignInAccount f15643Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15644Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccount", id = 2)
    public final Account f15645Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    public final int f15646Oooo0oo;

    @SafeParcelable.Constructor
    public zat(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) int i2, @Nullable @SafeParcelable.Param(id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f15644Oooo0o = i;
        this.f15645Oooo0oO = account;
        this.f15646Oooo0oo = i2;
        this.f15643Oooo = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15644Oooo0o);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f15645Oooo0oO, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f15646Oooo0oo);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f15643Oooo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zat(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this.f15644Oooo0o = 2;
        this.f15645Oooo0oO = account;
        this.f15646Oooo0oo = i;
        this.f15643Oooo = googleSignInAccount;
    }
}
