package o00O000o;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends OooOO0O<o00O0O00.OooO0o> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0O00.OooO0o f36304OooO;

    public OooOo(List<o00O0O00.OooO00o<o00O0O00.OooO0o>> list) {
        super(list);
        this.f36304OooO = new o00O0O00.OooO0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00O000o.OooO00o
    public final Object OooO0oO(o00O0O00.OooO00o oooO00o, float f) {
        T t;
        T t2 = oooO00o.f36503OooO0O0;
        if (t2 == 0 || (t = oooO00o.f36504OooO0OO) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        o00O0O00.OooO0o oooO0o = (o00O0O00.OooO0o) t2;
        o00O0O00.OooO0o oooO0o2 = (o00O0O00.OooO0o) t;
        o00O0O00.OooO0OO<A> oooO0OO = this.f36278OooO0o0;
        if (oooO0OO != 0) {
            oooO00o.f36509OooO0oo.floatValue();
            OooO0o0();
            o00O0O00.OooO0o oooO0o3 = (o00O0O00.OooO0o) oooO0OO.OooO0O0(oooO0o, oooO0o2);
            if (oooO0o3 != null) {
                return oooO0o3;
            }
        }
        float f2 = oooO0o.f36521OooO00o;
        float f3 = oooO0o2.f36521OooO00o;
        PointF pointF = o00O0.OooOOO.f35980OooO00o;
        float fOooO00o = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
        float f4 = oooO0o.f36522OooO0O0;
        float fOooO00o2 = OooOo.OooO0o.OooO00o(oooO0o2.f36522OooO0O0, f4, f, f4);
        o00O0O00.OooO0o oooO0o4 = this.f36304OooO;
        oooO0o4.f36521OooO00o = fOooO00o;
        oooO0o4.f36522OooO0O0 = fOooO00o2;
        return oooO0o4;
    }
}
