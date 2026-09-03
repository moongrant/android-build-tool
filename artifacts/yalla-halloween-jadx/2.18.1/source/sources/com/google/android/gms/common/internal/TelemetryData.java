package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    public final int f15622Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    public List<MethodInvocation> f15623Oooo0oO;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @Nullable List<MethodInvocation> list) {
        this.f15622Oooo0o = i;
        this.f15623Oooo0oO = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15622Oooo0o);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f15623Oooo0oO, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zaa() {
        return this.f15622Oooo0o;
    }

    @androidx.annotation.Nullable
    public final List<MethodInvocation> zab() {
        return this.f15623Oooo0oO;
    }

    public final void zac(@NonNull MethodInvocation methodInvocation) {
        if (this.f15623Oooo0oO == null) {
            this.f15623Oooo0oO = new ArrayList();
        }
        this.f15623Oooo0oO.add(methodInvocation);
    }
}
