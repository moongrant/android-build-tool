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
    public final boolean f20573OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f20580OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f20581OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f20582OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ToNumberPolicy f20583OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ToNumberPolicy f20584OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Excluder f20574OooO00o = Excluder.DEFAULT;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LongSerializationPolicy f20575OooO0O0 = LongSerializationPolicy.DEFAULT;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final FieldNamingPolicy f20576OooO0OO = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f20577OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f20579OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f20578OooO0o = new ArrayList();

    public OooOOO() {
        FieldNamingPolicy fieldNamingPolicy = OooOOO0.f20585OooOOO;
        this.f20580OooO0oO = 2;
        this.f20581OooO0oo = 2;
        this.f20573OooO = true;
        this.f20582OooOO0 = true;
        this.f20583OooOO0O = OooOOO0.f20586OooOOOO;
        this.f20584OooOO0o = OooOOO0.f20587OooOOOo;
    }

    public final OooOOO0 OooO00o() {
        int i;
        o0OOO0o o0ooo0oOooO00o;
        o0OOO0o o0ooo0oOooO00o2;
        ArrayList arrayList = this.f20579OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f20578OooO0o;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = com.google.gson.internal.sql.OooO00o.f20707OooO00o;
        com.google.gson.internal.bind.OooO00o.OooO0O0.C0261OooO00o c0261OooO00o = com.google.gson.internal.bind.OooO00o.OooO0O0.f20647OooO0O0;
        int i2 = this.f20580OooO0oO;
        if (i2 != 2 && (i = this.f20581OooO0oo) != 2) {
            o0OOO0o o0ooo0oOooO00o3 = c0261OooO00o.OooO00o(i2, i);
            if (z) {
                o0ooo0oOooO00o = com.google.gson.internal.sql.OooO00o.f20709OooO0OO.OooO00o(i2, i);
                o0ooo0oOooO00o2 = com.google.gson.internal.sql.OooO00o.f20708OooO0O0.OooO00o(i2, i);
            } else {
                o0ooo0oOooO00o = null;
                o0ooo0oOooO00o2 = null;
            }
            arrayList3.add(o0ooo0oOooO00o3);
            if (z) {
                arrayList3.add(o0ooo0oOooO00o);
                arrayList3.add(o0ooo0oOooO00o2);
            }
        }
        return new OooOOO0(this.f20574OooO00o, this.f20576OooO0OO, this.f20577OooO0Oo, this.f20573OooO, this.f20582OooOO0, this.f20575OooO0O0, arrayList, arrayList2, arrayList3, this.f20583OooOO0O, this.f20584OooOO0o);
    }

    public final void OooO0O0(Object obj, Type type) {
        boolean z = obj instanceof oo000o;
        com.google.gson.internal.OooO00o.OooO00o(z || (obj instanceof Oooo000) || (obj instanceof OooOOOO) || (obj instanceof o0ooOOo));
        if (obj instanceof OooOOOO) {
            this.f20577OooO0Oo.put(type, (OooOOOO) obj);
        }
        ArrayList arrayList = this.f20579OooO0o0;
        if (z || (obj instanceof Oooo000)) {
            arrayList.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof o0ooOOo) {
            arrayList.add(TypeAdapters.OooO00o(TypeToken.get(type), (o0ooOOo) obj));
        }
    }

    public final void OooO0OO(o0OOO0o o0ooo0o2) {
        this.f20579OooO0o0.add(o0ooo0o2);
    }
}
