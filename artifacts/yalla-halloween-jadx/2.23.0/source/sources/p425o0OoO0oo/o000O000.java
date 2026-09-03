package p425o0OoO0oo;

import java.util.LinkedHashMap;
import java.util.Map;
import p423o0OoO0o0.o000oOoO;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f45582OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, String> f45583OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f45584OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f45585OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00OOOOo.OooO00o f45586OooO0o0;

    public o000O000(String str, Object obj, Map map, LinkedHashMap linkedHashMap) {
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        this.f45586OooO0o0 = oooO00o;
        this.f45582OooO00o = obj;
        this.f45583OooO0O0 = map;
        this.f45584OooO0OO = linkedHashMap;
        this.f45585OooO0Oo = 0;
        if (str == null) {
            throw new IllegalArgumentException(String.format("url can not be null.", new Object[0]));
        }
        oooO00o.OooOO0(str);
        oooO00o.OooO(Object.class, obj);
        oo0O.OooO00o oooO00o2 = new oo0O.OooO00o();
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        for (String str2 : linkedHashMap.keySet()) {
            oooO00o2.OooO00o(str2, (String) linkedHashMap.get(str2));
        }
        oooO00o.OooO0o0(oooO00o2.OooO0OO());
    }

    public abstract o00OOOOo OooO00o(oo00oO oo00oo);

    public abstract oo00oO OooO0O0();

    public oo00oO OooO0OO(oo00oO oo00oo, o000oOoO o000oooo2) {
        return oo00oo;
    }
}
