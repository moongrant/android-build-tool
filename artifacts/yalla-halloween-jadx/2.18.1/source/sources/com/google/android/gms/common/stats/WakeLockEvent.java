package com.google.android.gms.common.stats;

import OooO0O0.OooO0O0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    public final String f15748Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15749Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    public final long f15750Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEventType", id = 11)
    public int f15751Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    public final List f15752OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    public final String f15753OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    public final String f15754OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    public final int f15755OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    public final String f15756OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    public int f15757OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    public final String f15758OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    public final float f15759OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    public final long f15760OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    public final boolean f15761OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f15762Ooooo00 = -1;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    public final long f15763o000oOoO;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) @Nullable List list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j2, @SafeParcelable.Param(id = 14) int i4, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j3, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f15749Oooo0o = i;
        this.f15750Oooo0oO = j;
        this.f15751Oooo0oo = i2;
        this.f15748Oooo = str;
        this.f15754OoooO00 = str3;
        this.f15753OoooO0 = str5;
        this.f15755OoooO0O = i3;
        this.f15752OoooO = list;
        this.f15756OoooOO0 = str2;
        this.f15763o000oOoO = j2;
        this.f15757OoooOOO = i4;
        this.f15758OoooOOo = str4;
        this.f15759OoooOo0 = f;
        this.f15760OoooOoO = j3;
        this.f15761OoooOoo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15749Oooo0o);
        SafeParcelWriter.writeLong(parcel, 2, this.f15750Oooo0oO);
        SafeParcelWriter.writeString(parcel, 4, this.f15748Oooo, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f15755OoooO0O);
        SafeParcelWriter.writeStringList(parcel, 6, this.f15752OoooO, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f15763o000oOoO);
        SafeParcelWriter.writeString(parcel, 10, this.f15754OoooO00, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f15751Oooo0oo);
        SafeParcelWriter.writeString(parcel, 12, this.f15756OoooOO0, false);
        SafeParcelWriter.writeString(parcel, 13, this.f15758OoooOOo, false);
        SafeParcelWriter.writeInt(parcel, 14, this.f15757OoooOOO);
        SafeParcelWriter.writeFloat(parcel, 15, this.f15759OoooOo0);
        SafeParcelWriter.writeLong(parcel, 16, this.f15760OoooOoO);
        SafeParcelWriter.writeString(parcel, 17, this.f15753OoooO0, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f15761OoooOoo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.f15751Oooo0oo;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.f15762Ooooo00;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
        return this.f15750Oooo0oO;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzd() {
        List list = this.f15752OoooO;
        String str = this.f15748Oooo;
        int i = this.f15755OoooO0O;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i2 = this.f15757OoooOOO;
        String str2 = this.f15754OoooO00;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f15758OoooOOo;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.f15759OoooOo0;
        String str4 = this.f15753OoooO0;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.f15761OoooOoo;
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        OooO0O0.OooO00o(sb, str2, "\t", str3, "\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
