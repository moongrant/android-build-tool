package o00O000o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p113o00O00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends OooO00o<o0ooOOo, Path> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0ooOOo f36312OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f36313OooOO0;

    public Oooo000(List<o00O0O00.OooO00o<o0ooOOo>> list) {
        super(list);
        this.f36312OooO = new o0ooOOo();
        this.f36313OooOO0 = new Path();
    }

    @Override // o00O000o.OooO00o
    public final Path OooO0oO(o00O0O00.OooO00o<o0ooOOo> oooO00o, float f) {
        o0ooOOo o0ooooo = oooO00o.f36503OooO0O0;
        o0ooOOo o0ooooo2 = oooO00o.f36504OooO0OO;
        o0ooOOo o0ooooo3 = this.f36312OooO;
        if (o0ooooo3.f36390OooO0O0 == null) {
            o0ooooo3.f36390OooO0O0 = new PointF();
        }
        o0ooooo3.f36391OooO0OO = o0ooooo.f36391OooO0OO || o0ooooo2.f36391OooO0OO;
        ArrayList arrayList = o0ooooo.f36389OooO00o;
        int size = arrayList.size();
        int size2 = o0ooooo2.f36389OooO00o.size();
        ArrayList arrayList2 = o0ooooo2.f36389OooO00o;
        if (size != size2) {
            o00O0.OooOO0.OooO0O0("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = o0ooooo3.f36389OooO00o;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new oOO00O.OooO00o());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = o0ooooo.f36390OooO0O0;
        PointF pointF2 = o0ooooo2.f36390OooO0O0;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = o00O0.OooOOO.f35980OooO00o;
        float fOooO00o = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
        float f4 = pointF.y;
        float fOooO00o2 = OooOo.OooO0o.OooO00o(pointF2.y, f4, f, f4);
        if (o0ooooo3.f36390OooO0O0 == null) {
            o0ooooo3.f36390OooO0O0 = new PointF();
        }
        o0ooooo3.f36390OooO0O0.set(fOooO00o, fOooO00o2);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            oOO00O.OooO00o oooO00o2 = (oOO00O.OooO00o) arrayList.get(size5);
            oOO00O.OooO00o oooO00o3 = (oOO00O.OooO00o) arrayList2.get(size5);
            PointF pointF4 = oooO00o2.f60830OooO00o;
            PointF pointF5 = oooO00o3.f60830OooO00o;
            oOO00O.OooO00o oooO00o4 = (oOO00O.OooO00o) arrayList3.get(size5);
            float f5 = pointF4.x;
            float fOooO00o3 = OooOo.OooO0o.OooO00o(pointF5.x, f5, f, f5);
            float f6 = pointF4.y;
            oooO00o4.f60830OooO00o.set(fOooO00o3, OooOo.OooO0o.OooO00o(pointF5.y, f6, f, f6));
            oOO00O.OooO00o oooO00o5 = (oOO00O.OooO00o) arrayList3.get(size5);
            PointF pointF6 = oooO00o2.f60831OooO0O0;
            float f7 = pointF6.x;
            PointF pointF7 = oooO00o3.f60831OooO0O0;
            float fOooO00o4 = OooOo.OooO0o.OooO00o(pointF7.x, f7, f, f7);
            float f8 = pointF6.y;
            oooO00o5.f60831OooO0O0.set(fOooO00o4, OooOo.OooO0o.OooO00o(pointF7.y, f8, f, f8));
            oOO00O.OooO00o oooO00o6 = (oOO00O.OooO00o) arrayList3.get(size5);
            PointF pointF8 = oooO00o2.f60832OooO0OO;
            float f9 = pointF8.x;
            PointF pointF9 = oooO00o3.f60832OooO0OO;
            float fOooO00o5 = OooOo.OooO0o.OooO00o(pointF9.x, f9, f, f9);
            float f10 = pointF8.y;
            oooO00o6.f60832OooO0OO.set(fOooO00o5, OooOo.OooO0o.OooO00o(pointF9.y, f10, f, f10));
        }
        Path path = this.f36313OooOO0;
        path.reset();
        PointF pointF10 = o0ooooo3.f36390OooO0O0;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = o00O0.OooOOO.f35980OooO00o;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i = 0; i < arrayList3.size(); i++) {
            oOO00O.OooO00o oooO00o7 = (oOO00O.OooO00o) arrayList3.get(i);
            PointF pointF12 = oooO00o7.f60830OooO00o;
            boolean zEquals = pointF12.equals(pointF11);
            PointF pointF13 = oooO00o7.f60831OooO0O0;
            PointF pointF14 = oooO00o7.f60832OooO0OO;
            if (zEquals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (o0ooooo3.f36391OooO0OO) {
            path.close();
        }
        return path;
    }
}
