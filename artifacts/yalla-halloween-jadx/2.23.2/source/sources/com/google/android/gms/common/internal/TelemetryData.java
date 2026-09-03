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

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
public class TelemetryData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    public final int f14641OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    public List<MethodInvocation> f14642OooO0o0;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @Nullable List<MethodInvocation> list) {
        this.f14641OooO0Oo = i;
        this.f14642OooO0o0 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14641OooO0Oo);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f14642OooO0o0, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zaa() {
        return this.f14641OooO0Oo;
    }

    @androidx.annotation.Nullable
    public final List<MethodInvocation> zab() {
        return this.f14642OooO0o0;
    }

    public final void zac(@NonNull MethodInvocation methodInvocation) {
        if (this.f14642OooO0o0 == null) {
            this.f14642OooO0o0 = new ArrayList();
        }
        this.f14642OooO0o0.add(methodInvocation);
    }
}
