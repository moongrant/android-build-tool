package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final Scope[] f14585OooOOo = new Scope[0];

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Feature[] f14586OooOOoo = new Feature[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    public Scope[] f14587OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final int f14589OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final int f14590OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f14591OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 5)
    public IBinder f14592OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    public Bundle f14593OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 8)
    public Account f14594OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    public Feature[] f14595OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public final boolean f14596OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    public Feature[] f14597OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO, id = 13)
    public final int f14598OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean f14599OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    public final String f14600OooOOo0;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) boolean z2, @Nullable @SafeParcelable.Param(id = 15) String str2) {
        scopeArr = scopeArr == null ? f14585OooOOo : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f14586OooOOoo;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f14588OooO0Oo = i;
        this.f14590OooO0o0 = i2;
        this.f14589OooO0o = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f14591OooO0oO = "com.google.android.gms";
        } else {
            this.f14591OooO0oO = str;
        }
        if (i < 2) {
            this.f14594OooOO0O = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f14592OooO0oo = iBinder;
            this.f14594OooOO0O = account;
        }
        this.f14587OooO = scopeArr;
        this.f14593OooOO0 = bundle;
        this.f14595OooOO0o = featureArr;
        this.f14597OooOOO0 = featureArr2;
        this.f14596OooOOO = z;
        this.f14598OooOOOO = i4;
        this.f14599OooOOOo = z2;
        this.f14600OooOOo0 = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.f14593OooOO0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzm.OooO00o(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f14600OooOOo0;
    }
}
