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

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final Scope[] f15565OoooOoo = new Scope[0];

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final Feature[] f15566Ooooo00 = new Feature[0];

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f15567Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15568Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final int f15569Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public int f15570Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 8)
    public Account f15571OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    public Scope[] f15572OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 5)
    public IBinder f15573OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    public Bundle f15574OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    public Feature[] f15575OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public boolean f15576OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO, id = 13)
    public int f15577OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    public boolean f15578OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    public String f15579OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    public Feature[] f15580o000oOoO;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i4, @SafeParcelable.Param(id = 14) boolean z2, @Nullable @SafeParcelable.Param(id = 15) String str2) {
        scopeArr = scopeArr == null ? f15565OoooOoo : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f15566Ooooo00 : featureArr;
        featureArr2 = featureArr2 == null ? f15566Ooooo00 : featureArr2;
        this.f15568Oooo0o = i;
        this.f15569Oooo0oO = i2;
        this.f15570Oooo0oo = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f15567Oooo = "com.google.android.gms";
        } else {
            this.f15567Oooo = str;
        }
        if (i < 2) {
            this.f15571OoooO = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f15573OoooO00 = iBinder;
            this.f15571OoooO = account;
        }
        this.f15572OoooO0 = scopeArr;
        this.f15574OoooO0O = bundle;
        this.f15575OoooOO0 = featureArr;
        this.f15580o000oOoO = featureArr2;
        this.f15576OoooOOO = z;
        this.f15577OoooOOo = i4;
        this.f15578OoooOo0 = z2;
        this.f15579OoooOoO = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.f15574OoooO0O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzm.OooO00o(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f15579OoooOoO;
    }
}
