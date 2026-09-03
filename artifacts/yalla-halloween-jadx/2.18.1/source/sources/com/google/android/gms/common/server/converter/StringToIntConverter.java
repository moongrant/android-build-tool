package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15690Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final HashMap<String, Integer> f15691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final SparseArray<String> f15692Oooo0oo;

    @KeepForSdk
    public StringToIntConverter() {
        this.f15690Oooo0o = 1;
        this.f15691Oooo0oO = new HashMap<>();
        this.f15692Oooo0oo = new SparseArray<>();
    }

    @NonNull
    @KeepForSdk
    public StringToIntConverter add(@NonNull String str, int i) {
        this.f15691Oooo0oO.put(str, Integer.valueOf(i));
        this.f15692Oooo0oo.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15690Oooo0o);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15691Oooo0oO.keySet()) {
            arrayList.add(new zac(str, this.f15691Oooo0oO.get(str).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @Nullable
    public final /* bridge */ /* synthetic */ Integer zac(@NonNull String str) {
        Integer num = this.f15691Oooo0oO.get(str);
        return num == null ? this.f15691Oooo0oO.get("gms_unknown") : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @NonNull
    public final /* bridge */ /* synthetic */ String zad(@NonNull Integer num) {
        String str = this.f15692Oooo0oo.get(num.intValue());
        return (str == null && this.f15691Oooo0oO.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zac> arrayList) {
        this.f15690Oooo0o = i;
        this.f15691Oooo0oO = new HashMap<>();
        this.f15692Oooo0oo = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = arrayList.get(i2);
            add(zacVar.f15696Oooo0oO, zacVar.f15697Oooo0oo);
        }
    }
}
