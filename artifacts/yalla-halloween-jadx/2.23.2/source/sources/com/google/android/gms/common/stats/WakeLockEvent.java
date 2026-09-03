package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    public final String f14765OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14766OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEventType", id = 11)
    public final int f14767OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    public final long f14768OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    public final String f14769OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    public final String f14770OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    public final int f14771OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    public final List f14772OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    public final String f14773OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    public final int f14774OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    public final long f14775OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    public final String f14776OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    public final float f14777OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    public final boolean f14778OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    public final long f14779OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final long f14780OooOOoo = -1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) @Nullable ArrayList arrayList, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 14) int i4, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j3, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f14766OooO0Oo = i;
        this.f14768OooO0o0 = j;
        this.f14767OooO0o = i2;
        this.f14769OooO0oO = str;
        this.f14770OooO0oo = str3;
        this.f14765OooO = str5;
        this.f14771OooOO0 = i3;
        this.f14772OooOO0O = arrayList;
        this.f14773OooOO0o = str2;
        this.f14775OooOOO0 = j2;
        this.f14774OooOOO = i4;
        this.f14776OooOOOO = str4;
        this.f14777OooOOOo = f;
        this.f14779OooOOo0 = j3;
        this.f14778OooOOo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14766OooO0Oo);
        SafeParcelWriter.writeLong(parcel, 2, this.f14768OooO0o0);
        SafeParcelWriter.writeString(parcel, 4, this.f14769OooO0oO, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f14771OooOO0);
        SafeParcelWriter.writeStringList(parcel, 6, this.f14772OooOO0O, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f14775OooOOO0);
        SafeParcelWriter.writeString(parcel, 10, this.f14770OooO0oo, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f14767OooO0o);
        SafeParcelWriter.writeString(parcel, 12, this.f14773OooOO0o, false);
        SafeParcelWriter.writeString(parcel, 13, this.f14776OooOOOO, false);
        SafeParcelWriter.writeInt(parcel, 14, this.f14774OooOOO);
        SafeParcelWriter.writeFloat(parcel, 15, this.f14777OooOOOo);
        SafeParcelWriter.writeLong(parcel, 16, this.f14779OooOOo0);
        SafeParcelWriter.writeString(parcel, 17, this.f14765OooO, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f14778OooOOo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f14767OooO0o;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f14780OooOOoo;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
        return this.f14768OooO0o0;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzd() {
        List list = this.f14772OooOO0O;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        String str = this.f14770OooO0oo;
        if (str == null) {
            str = "";
        }
        String str2 = this.f14776OooOOOO;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f14765OooO;
        return "\t" + this.f14769OooO0oO + "\t" + this.f14771OooOO0 + "\t" + strJoin + "\t" + this.f14774OooOOO + "\t" + str + "\t" + str2 + "\t" + this.f14777OooOOOo + "\t" + (str3 != null ? str3 : "") + "\t" + this.f14778OooOOo;
    }
}
