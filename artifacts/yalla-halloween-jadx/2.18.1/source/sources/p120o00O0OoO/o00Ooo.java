package p120o00O0OoO;

import OooO00o.OooO00o;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p125o00O0o0O.o00000O;
import p129o00O0oOo.o000O0;
import p129o00O0oOo.o000Oo0;
import p131o00O0oo0.o000OOo;
import p225o00oOOo.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends OooOO0O<o00000O, Path> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000O f30795OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f30796OooOO0;

    public o00Ooo(List<o000OOo<o00000O>> list) {
        super(list);
        this.f30795OooO = new o00000O();
        this.f30796OooOO0 = new Path();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList, java.util.List<o00oOOo.o00O0OO0>] */
    @Override // p120o00O0OoO.OooOO0O
    public final Path OooO0oO(o000OOo<o00000O> o000ooo2, float f) {
        o00000O o00000o = o000ooo2.f31157OooO0O0;
        o00000O o00000o2 = o000ooo2.f31158OooO0OO;
        o00000O o00000o3 = this.f30795OooO;
        if (o00000o3.f31006OooO0O0 == null) {
            o00000o3.f31006OooO0O0 = new PointF();
        }
        o00000o3.f31007OooO0OO = o00000o.f31007OooO0OO || o00000o2.f31007OooO0OO;
        if (o00000o.f31005OooO00o.size() != o00000o2.f31005OooO00o.size()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Curves must have the same number of control points. Shape 1: ");
            sbOooO0o0.append(o00000o.f31005OooO00o.size());
            sbOooO0o0.append("\tShape 2: ");
            sbOooO0o0.append(o00000o2.f31005OooO00o.size());
            o000Oo0.OooO0OO(sbOooO0o0.toString());
        }
        int iMin = Math.min(o00000o.f31005OooO00o.size(), o00000o2.f31005OooO00o.size());
        if (o00000o3.f31005OooO00o.size() < iMin) {
            for (int size = o00000o3.f31005OooO00o.size(); size < iMin; size++) {
                o00000o3.f31005OooO00o.add(new o00O0OO0());
            }
        } else if (o00000o3.f31005OooO00o.size() > iMin) {
            for (int size2 = o00000o3.f31005OooO00o.size() - 1; size2 >= iMin; size2--) {
                ?? r5 = o00000o3.f31005OooO00o;
                r5.remove(r5.size() - 1);
            }
        }
        PointF pointF = o00000o.f31006OooO0O0;
        PointF pointF2 = o00000o2.f31006OooO0O0;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = o000O0.f31128OooO00o;
        float fOooO00o = Oooo000.OooO00o.OooO00o(f3, f2, f, f2);
        float f4 = pointF.y;
        float fOooO00o2 = Oooo000.OooO00o.OooO00o(pointF2.y, f4, f, f4);
        if (o00000o3.f31006OooO0O0 == null) {
            o00000o3.f31006OooO0O0 = new PointF();
        }
        o00000o3.f31006OooO0O0.set(fOooO00o, fOooO00o2);
        for (int size3 = o00000o3.f31005OooO00o.size() - 1; size3 >= 0; size3--) {
            o00O0OO0 o00o0oo1 = (o00O0OO0) o00000o.f31005OooO00o.get(size3);
            o00O0OO0 o00o0oo2 = (o00O0OO0) o00000o2.f31005OooO00o.get(size3);
            PointF pointF4 = o00o0oo1.f33861OooO00o;
            PointF pointF5 = o00o0oo1.f33862OooO0O0;
            PointF pointF6 = o00o0oo1.f33863OooO0OO;
            PointF pointF7 = o00o0oo2.f33861OooO00o;
            PointF pointF8 = o00o0oo2.f33862OooO0O0;
            PointF pointF9 = o00o0oo2.f33863OooO0OO;
            o00O0OO0 o00o0oo3 = (o00O0OO0) o00000o3.f31005OooO00o.get(size3);
            float f5 = pointF4.x;
            float fOooO00o3 = Oooo000.OooO00o.OooO00o(pointF7.x, f5, f, f5);
            float f6 = pointF4.y;
            o00o0oo3.f33861OooO00o.set(fOooO00o3, Oooo000.OooO00o.OooO00o(pointF7.y, f6, f, f6));
            o00O0OO0 o00o0oo4 = (o00O0OO0) o00000o3.f31005OooO00o.get(size3);
            float f7 = pointF5.x;
            float fOooO00o4 = Oooo000.OooO00o.OooO00o(pointF8.x, f7, f, f7);
            float f8 = pointF5.y;
            o00o0oo4.f33862OooO0O0.set(fOooO00o4, Oooo000.OooO00o.OooO00o(pointF8.y, f8, f, f8));
            o00O0OO0 o00o0oo5 = (o00O0OO0) o00000o3.f31005OooO00o.get(size3);
            float f9 = pointF6.x;
            float fOooO00o5 = Oooo000.OooO00o.OooO00o(pointF9.x, f9, f, f9);
            float f10 = pointF6.y;
            o00o0oo5.f33863OooO0OO.set(fOooO00o5, Oooo000.OooO00o.OooO00o(pointF9.y, f10, f, f10));
        }
        o00000O o00000o4 = this.f30795OooO;
        Path path = this.f30796OooOO0;
        path.reset();
        PointF pointF10 = o00000o4.f31006OooO0O0;
        path.moveTo(pointF10.x, pointF10.y);
        o000O0.f31128OooO00o.set(pointF10.x, pointF10.y);
        for (int i = 0; i < o00000o4.f31005OooO00o.size(); i++) {
            o00O0OO0 o00o0oo6 = (o00O0OO0) o00000o4.f31005OooO00o.get(i);
            PointF pointF11 = o00o0oo6.f33861OooO00o;
            PointF pointF12 = o00o0oo6.f33862OooO0O0;
            PointF pointF13 = o00o0oo6.f33863OooO0OO;
            PointF pointF14 = o000O0.f31128OooO00o;
            if (pointF11.equals(pointF14) && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF14.set(pointF13.x, pointF13.y);
        }
        if (o00000o4.f31007OooO0OO) {
            path.close();
        }
        return this.f30796OooOO0;
    }
}
