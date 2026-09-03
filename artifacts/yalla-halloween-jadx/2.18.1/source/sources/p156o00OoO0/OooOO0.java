package p156o00OoO0;

import java.util.Map;
import p144o00Oo.OooO0o;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f32348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Map<String, String> f32349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Map<String, String> f32350OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f32351OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00OOO00.OooO00o f32352OooO0o0;

    public OooOO0(String str, Object obj, Map map, Map map2) {
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
        this.f32352OooO0o0 = oooO00o;
        this.f32348OooO00o = obj;
        this.f32349OooO0O0 = map;
        this.f32350OooO0OO = map2;
        this.f32351OooO0Oo = 0;
        if (str == null) {
            throw new IllegalArgumentException(String.format("url can not be null.", new Object[0]));
        }
        oooO00o.OooOO0o(str);
        oooO00o.OooOO0O(this.f32348OooO00o);
        o00O.OooO00o oooO00o2 = new o00O.OooO00o();
        Map<String, String> map3 = this.f32350OooO0OO;
        if (map3 == null || map3.isEmpty()) {
            return;
        }
        for (String str2 : this.f32350OooO0OO.keySet()) {
            oooO00o2.OooO00o(str2, this.f32350OooO0OO.get(str2));
        }
        this.f32352OooO0o0.OooO0o(oooO00o2.OooO0Oo());
    }

    public abstract o00OOO00 OooO00o(o0o0Oo o0o0oo);

    public abstract o0o0Oo OooO0O0();

    public o0o0Oo OooO0OO(o0o0Oo o0o0oo, OooO0o oooO0o) {
        return o0o0oo;
    }
}
