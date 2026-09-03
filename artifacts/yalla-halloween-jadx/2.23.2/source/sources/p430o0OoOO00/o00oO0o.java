package p430o0OoOO00;

import java.util.LinkedHashMap;
import java.util.Map;
import p428o0OoO0oo.o00OOOOo;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f46832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, String> f46833OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f46834OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f46835OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00O0o.OooO00o f46836OooO0o0;

    public o00oO0o(String str, Object obj, Map map, LinkedHashMap linkedHashMap) {
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        this.f46836OooO0o0 = oooO00o;
        this.f46832OooO00o = obj;
        this.f46833OooO0O0 = map;
        this.f46834OooO0OO = linkedHashMap;
        this.f46835OooO0Oo = 0;
        if (str == null) {
            throw new IllegalArgumentException(String.format("url can not be null.", new Object[0]));
        }
        oooO00o.OooOO0(str);
        oooO00o.OooO(Object.class, obj);
        o0O000.OooO00o oooO00o2 = new o0O000.OooO00o();
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        for (String str2 : linkedHashMap.keySet()) {
            oooO00o2.OooO00o(str2, (String) linkedHashMap.get(str2));
        }
        oooO00o.OooO0o0(oooO00o2.OooO0OO());
    }

    public abstract o0O00O0o OooO00o(o0oO0Ooo o0oo0ooo2);

    public abstract o0oO0Ooo OooO0O0();

    public o0oO0Ooo OooO0OO(o0oO0Ooo o0oo0ooo2, o00OOOOo o00ooooo2) {
        return o0oo0ooo2;
    }
}
