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
    public static final Scope[] f15061OooOOo = new Scope[0];

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Feature[] f15062OooOOoo = new Feature[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    public Scope[] f15063OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15064OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final int f15065OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final int f15066OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f15067OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 5)
    public IBinder f15068OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    public Bundle f15069OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 8)
    public Account f15070OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    public Feature[] f15071OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public final boolean f15072OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    public Feature[] f15073OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO, id = 13)
    public final int f15074OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean f15075OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    public final String f15076OooOOo0;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) boolean z2, @Nullable @SafeParcelable.Param(id = 15) String str2) {
        scopeArr = scopeArr == null ? f15061OooOOo : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        Feature[] featureArr3 = f15062OooOOoo;
        featureArr = featureArr == null ? featureArr3 : featureArr;
        featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
        this.f15064OooO0Oo = i;
        this.f15066OooO0o0 = i2;
        this.f15065OooO0o = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f15067OooO0oO = "com.google.android.gms";
        } else {
            this.f15067OooO0oO = str;
        }
        if (i < 2) {
            this.f15070OooOO0O = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f15068OooO0oo = iBinder;
            this.f15070OooOO0O = account;
        }
        this.f15063OooO = scopeArr;
        this.f15069OooOO0 = bundle;
        this.f15071OooOO0o = featureArr;
        this.f15073OooOOO0 = featureArr2;
        this.f15072OooOOO = z;
        this.f15074OooOOOO = i4;
        this.f15075OooOOOo = z2;
        this.f15076OooOOo0 = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.f15069OooOO0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzm.OooO00o(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f15076OooOOo0;
    }
}
