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

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f15235OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    public final String f15236OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f15237OooO0o0;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 2) ArrayList arrayList) {
        this.f15235OooO0Oo = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.f15231OooO0o0;
            HashMap map2 = new HashMap();
            ArrayList<zam> arrayList2 = zalVar.f15230OooO0o;
            int size2 = ((ArrayList) Preconditions.checkNotNull(arrayList2)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = arrayList2.get(i3);
                map2.put(zamVar.f15234OooO0o0, zamVar.f15233OooO0o);
            }
            map.put(str2, map2);
        }
        this.f15237OooO0o0 = map;
        this.f15236OooO0o = (String) Preconditions.checkNotNull(str);
        zad();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = this.f15237OooO0o0;
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map2 = map.get(str);
            for (String str2 : map2.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map2.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f15235OooO0Oo);
        ArrayList arrayList = new ArrayList();
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = this.f15237OooO0o0;
        for (String str : map.keySet()) {
            arrayList.add(new zal(str, map.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.f15236OooO0o, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zaa() {
        return this.f15236OooO0o;
    }

    @Nullable
    public final Map<String, FastJsonResponse.Field<?, ?>> zab(String str) {
        return this.f15237OooO0o0.get(str);
    }

    public final void zac() {
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = this.f15237OooO0o0;
        for (String str : map.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map2 = map.get(str);
            HashMap map3 = new HashMap();
            for (String str2 : map2.keySet()) {
                map3.put(str2, map2.get(str2).zab());
            }
            map.put(str, map3);
        }
    }

    public final void zad() {
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> map = this.f15237OooO0o0;
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            Map<String, FastJsonResponse.Field<?, ?>> map2 = map.get(it.next());
            Iterator<String> it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                map2.get(it2.next()).zai(this);
            }
        }
    }

    public final void zae(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.f15237OooO0o0.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(Class<? extends FastJsonResponse> cls) {
        return this.f15237OooO0o0.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(Class<? extends FastJsonResponse> cls) {
        this.f15235OooO0Oo = 1;
        this.f15237OooO0o0 = new HashMap<>();
        this.f15236OooO0o = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
