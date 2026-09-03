package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f20100OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f20107OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f20108OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f20109OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ToNumberPolicy f20110OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ToNumberPolicy f20111OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Excluder f20101OooO00o = Excluder.DEFAULT;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LongSerializationPolicy f20102OooO0O0 = LongSerializationPolicy.DEFAULT;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final FieldNamingPolicy f20103OooO0OO = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f20104OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f20106OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f20105OooO0o = new ArrayList();

    public OooOOO() {
        FieldNamingPolicy fieldNamingPolicy = OooOOO0.f20112OooOOO;
        this.f20107OooO0oO = 2;
        this.f20108OooO0oo = 2;
        this.f20100OooO = true;
        this.f20109OooOO0 = true;
        this.f20110OooOO0O = OooOOO0.f20113OooOOOO;
        this.f20111OooOO0o = OooOOO0.f20114OooOOOo;
    }

    public final OooOOO0 OooO00o() {
        int i;
        o0Oo0oo o0oo0ooOooO00o;
        o0Oo0oo o0oo0ooOooO00o2;
        ArrayList arrayList = this.f20106OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20105OooO0o;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = com.google.gson.internal.sql.OooO00o.f20234OooO00o;
        com.google.gson.internal.bind.OooO00o.OooO0O0.C0260OooO00o c0260OooO00o = com.google.gson.internal.bind.OooO00o.OooO0O0.f20174OooO0O0;
        int i2 = this.f20107OooO0oO;
        if (i2 != 2 && (i = this.f20108OooO0oo) != 2) {
            o0Oo0oo o0oo0ooOooO00o3 = c0260OooO00o.OooO00o(i2, i);
            if (z) {
                o0oo0ooOooO00o = com.google.gson.internal.sql.OooO00o.f20236OooO0OO.OooO00o(i2, i);
                o0oo0ooOooO00o2 = com.google.gson.internal.sql.OooO00o.f20235OooO0O0.OooO00o(i2, i);
            } else {
                o0oo0ooOooO00o = null;
                o0oo0ooOooO00o2 = null;
            }
            arrayList3.add(o0oo0ooOooO00o3);
            if (z) {
                arrayList3.add(o0oo0ooOooO00o);
                arrayList3.add(o0oo0ooOooO00o2);
            }
        }
        return new OooOOO0(this.f20101OooO00o, this.f20103OooO0OO, this.f20104OooO0Oo, this.f20100OooO, this.f20109OooOO0, this.f20102OooO0O0, arrayList, arrayList2, arrayList3, this.f20110OooOO0O, this.f20111OooOO0o);
    }

    public final void OooO0O0(Object obj, Type type) {
        boolean z = obj instanceof o00oO0o;
        com.google.gson.internal.OooO00o.OooO00o(z || (obj instanceof Oooo000) || (obj instanceof OooOOOO) || (obj instanceof o0OOO0o));
        if (obj instanceof OooOOOO) {
            this.f20104OooO0Oo.put(type, (OooOOOO) obj);
        }
        ArrayList arrayList = this.f20106OooO0o0;
        if (z || (obj instanceof Oooo000)) {
            arrayList.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof o0OOO0o) {
            arrayList.add(TypeAdapters.OooO00o(TypeToken.get(type), (o0OOO0o) obj));
        }
    }

    public final void OooO0OO(o0Oo0oo o0oo0oo2) {
        this.f20106OooO0o0.add(o0oo0oo2);
    }
}
