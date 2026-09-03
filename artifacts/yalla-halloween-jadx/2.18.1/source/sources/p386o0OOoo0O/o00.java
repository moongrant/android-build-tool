package p386o0OOoo0O;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.OooO00o;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p387o0OOoo0o.o00O0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f38855OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38862OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38863OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f38864OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ToNumberPolicy f38865OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ToNumberPolicy f38866OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Excluder f38856OooO00o = Excluder.DEFAULT;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LongSerializationPolicy f38857OooO0O0 = LongSerializationPolicy.DEFAULT;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public FieldNamingPolicy f38858OooO0OO = FieldNamingPolicy.IDENTITY;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Type, o00O0000<?>> f38859OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o00O0O00> f38861OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o00O0O00> f38860OooO0o = new ArrayList();

    public o00() {
        FieldNamingPolicy fieldNamingPolicy = o000OOo0.f38867OooOOO;
        this.f38862OooO0oO = 2;
        this.f38863OooO0oo = 2;
        this.f38855OooO = true;
        this.f38864OooOO0 = true;
        this.f38865OooOO0O = o000OOo0.f38868OooOOOO;
        this.f38866OooOO0o = o000OOo0.f38869OooOOOo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O0O00>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O0O00>] */
    public final o000OOo0 OooO00o() {
        o00O0O00 o00o0o00OooO00o;
        ArrayList arrayList = new ArrayList(this.f38860OooO0o.size() + this.f38861OooO0o0.size() + 3);
        arrayList.addAll(this.f38861OooO0o0);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f38860OooO0o);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.f38862OooO0oO;
        int i2 = this.f38863OooO0oo;
        boolean z = OooO00o.f19316OooO00o;
        if (i != 2 && i2 != 2) {
            o00O0O00 o00o0o00OooO00o2 = com.google.gson.internal.bind.OooO00o.OooO0O0.f19247OooO0O0.OooO00o(i, i2);
            o00O0O00 o00o0o00OooO00o3 = null;
            if (z) {
                o00o0o00OooO00o3 = OooO00o.f19318OooO0OO.OooO00o(i, i2);
                o00o0o00OooO00o = OooO00o.f19317OooO0O0.OooO00o(i, i2);
            } else {
                o00o0o00OooO00o = null;
            }
            arrayList.add(o00o0o00OooO00o2);
            if (z) {
                arrayList.add(o00o0o00OooO00o3);
                arrayList.add(o00o0o00OooO00o);
            }
        }
        return new o000OOo0(this.f38856OooO00o, this.f38858OooO0OO, this.f38859OooO0Oo, this.f38855OooO, this.f38864OooOO0, this.f38857OooO0O0, this.f38861OooO0o0, this.f38860OooO0o, arrayList, this.f38865OooOO0O, this.f38866OooOO0o);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final o00 OooO0O0(Type type, Object obj) {
        boolean z = obj instanceof o00O00o0;
        o00O0O0.OooO00o(z || (obj instanceof o00O000) || (obj instanceof o00O0000) || (obj instanceof o00O0));
        if (obj instanceof o00O0000) {
            this.f38859OooO0Oo.put(type, (o00O0000) obj);
        }
        if (z || (obj instanceof o00O000)) {
            this.f38861OooO0o0.add(TreeTypeAdapter.newFactoryWithMatchRawType(o00000O0.get(type), obj));
        }
        if (obj instanceof o00O0) {
            this.f38861OooO0o0.add(TypeAdapters.OooO0OO(o00000O0.get(type), (o00O0) obj));
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0OOoo0O.o00O0O00>] */
    public final o00 OooO0OO(o00O0O00 o00o0o01) {
        this.f38861OooO0o0.add(o00o0o01);
        return this;
    }
}
