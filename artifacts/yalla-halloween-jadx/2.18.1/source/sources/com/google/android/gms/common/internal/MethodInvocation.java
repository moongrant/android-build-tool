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

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    public final long f15592Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    public final int f15593Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    public final int f15594Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    public final int f15595Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO, getter = "getServiceId", id = 8)
    public final int f15596OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    public final String f15597OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    public final long f15598OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    public final String f15599OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    public final int f15600OoooOO0;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15593Oooo0o);
        SafeParcelWriter.writeInt(parcel, 2, this.f15594Oooo0oO);
        SafeParcelWriter.writeInt(parcel, 3, this.f15595Oooo0oo);
        SafeParcelWriter.writeLong(parcel, 4, this.f15592Oooo);
        SafeParcelWriter.writeLong(parcel, 5, this.f15598OoooO00);
        SafeParcelWriter.writeString(parcel, 6, this.f15597OoooO0, false);
        SafeParcelWriter.writeString(parcel, 7, this.f15599OoooO0O, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f15596OoooO);
        SafeParcelWriter.writeInt(parcel, 9, this.f15600OoooOO0);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) long j2, @Nullable @SafeParcelable.Param(id = 6) String str, @Nullable @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) int i4, @SafeParcelable.Param(id = 9) int i5) {
        this.f15593Oooo0o = i;
        this.f15594Oooo0oO = i2;
        this.f15595Oooo0oo = i3;
        this.f15592Oooo = j;
        this.f15598OoooO00 = j2;
        this.f15597OoooO0 = str;
        this.f15599OoooO0O = str2;
        this.f15596OoooO = i4;
        this.f15600OoooOO0 = i5;
    }
}
