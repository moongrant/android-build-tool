package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    public final String f14612OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    public final int f14613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    public final int f14614OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    public final int f14615OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    public final long f14616OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    public final long f14617OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    public final String f14618OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO, getter = "getServiceId", id = 8)
    public final int f14619OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    public final int f14620OooOO0o;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14613OooO0Oo);
        SafeParcelWriter.writeInt(parcel, 2, this.f14615OooO0o0);
        SafeParcelWriter.writeInt(parcel, 3, this.f14614OooO0o);
        SafeParcelWriter.writeLong(parcel, 4, this.f14616OooO0oO);
        SafeParcelWriter.writeLong(parcel, 5, this.f14617OooO0oo);
        SafeParcelWriter.writeString(parcel, 6, this.f14612OooO, false);
        SafeParcelWriter.writeString(parcel, 7, this.f14618OooOO0, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f14619OooOO0O);
        SafeParcelWriter.writeInt(parcel, 9, this.f14620OooOO0o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) long j2, @Nullable @SafeParcelable.Param(id = 6) String str, @Nullable @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) int i4, @SafeParcelable.Param(id = 9) int i5) {
        this.f14613OooO0Oo = i;
        this.f14615OooO0o0 = i2;
        this.f14614OooO0o = i3;
        this.f14616OooO0oO = j;
        this.f14617OooO0oo = j2;
        this.f14612OooO = str;
        this.f14618OooOO0 = str2;
        this.f14619OooOO0O = i4;
        this.f14620OooOO0o = i5;
    }
}
