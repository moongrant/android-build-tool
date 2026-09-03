package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p023Oooo00O.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15742Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f15743Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    public final String f15744Oooo0oo;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.f15742Oooo0o = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = arrayList.get(i2);
            String str2 = zalVar.f15737Oooo0oO;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zalVar.f15738Oooo0oo)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = zalVar.f15738Oooo0oo.get(i3);
                map2.put(zamVar.f15740Oooo0oO, zamVar.f15741Oooo0oo);
            }
            map.put(str2, map2);
        }
        this.f15743Oooo0oO = map;
        this.f15744Oooo0oo = (String) Preconditions.checkNotNull(str);
        zad();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f15743Oooo0oO.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f15743Oooo0oO.get(str);
            for (String str2 : map.keySet()) {
                o00O0.OooO0OO(sb, "  ", str2, ": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15742Oooo0o);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f15743Oooo0oO.keySet()) {
            arrayList.add(new zal(str, this.f15743Oooo0oO.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.f15744Oooo0oo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zaa() {
        return this.f15744Oooo0oo;
    }

    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> zab(String str) {
        return this.f15743Oooo0oO.get(str);
    }

    public final void zac() {
        for (String str : this.f15743Oooo0oO.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f15743Oooo0oO.get(str);
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                map2.put(str2, map.get(str2).zab());
            }
            this.f15743Oooo0oO.put(str, map2);
        }
    }

    public final void zad() {
        Iterator<String> it = this.f15743Oooo0oO.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.f15743Oooo0oO.get(it.next());
            Iterator<String> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                map.get(it2.next()).zai(this);
            }
        }
    }

    public final void zae(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.f15743Oooo0oO.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(Class<? extends FastJsonResponse> cls) {
        return this.f15743Oooo0oO.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(Class<? extends FastJsonResponse> cls) {
        this.f15742Oooo0o = 1;
        this.f15743Oooo0oO = new HashMap<>();
        this.f15744Oooo0oo = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
