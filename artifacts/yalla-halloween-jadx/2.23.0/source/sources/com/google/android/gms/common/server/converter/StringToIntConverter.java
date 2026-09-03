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

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SparseArray<String> f15184OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, Integer> f15185OooO0o0;

    @KeepForSdk
    public StringToIntConverter() {
        this.f15183OooO0Oo = 1;
        this.f15185OooO0o0 = new HashMap<>();
        this.f15184OooO0o = new SparseArray<>();
    }

    @NonNull
    @KeepForSdk
    public StringToIntConverter add(@NonNull String str, int i) {
        this.f15185OooO0o0.put(str, Integer.valueOf(i));
        this.f15184OooO0o.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15183OooO0Oo);
        ArrayList arrayList = new ArrayList();
        HashMap<String, Integer> map = this.f15185OooO0o0;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, map.get(str).intValue()));
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
        HashMap<String, Integer> map = this.f15185OooO0o0;
        Integer num = map.get(str);
        return num == null ? map.get("gms_unknown") : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @NonNull
    public final /* bridge */ /* synthetic */ String zad(@NonNull Integer num) {
        String str = this.f15184OooO0o.get(num.intValue());
        return (str == null && this.f15185OooO0o0.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(id = 2) ArrayList arrayList, @SafeParcelable.Param(id = 1) int i) {
        this.f15183OooO0Oo = i;
        this.f15185OooO0o0 = new HashMap<>();
        this.f15184OooO0o = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            add(zacVar.f15190OooO0o0, zacVar.f15189OooO0o);
        }
    }
}
