package o00OO0O0;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p135o00OO0o0.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends OooO00o<p136o00OO0oO.OooOOOO, Path> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p136o00OO0oO.OooOOOO f37277OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f37278OooOO0;

    public Oooo000(List<o00OOO0O.OooO00o<p136o00OO0oO.OooOOOO>> list) {
        super(list);
        this.f37277OooO = new p136o00OO0oO.OooOOOO();
        this.f37278OooOO0 = new Path();
    }

    @Override // o00OO0O0.OooO00o
    public final Path OooO0oO(o00OOO0O.OooO00o<p136o00OO0oO.OooOOOO> oooO00o, float f) {
        p136o00OO0oO.OooOOOO oooOOOO = oooO00o.f37441OooO0O0;
        p136o00OO0oO.OooOOOO oooOOOO2 = oooO00o.f37442OooO0OO;
        p136o00OO0oO.OooOOOO oooOOOO3 = this.f37277OooO;
        if (oooOOOO3.f37368OooO0O0 == null) {
            oooOOOO3.f37368OooO0O0 = new PointF();
        }
        oooOOOO3.f37369OooO0OO = oooOOOO.f37369OooO0OO || oooOOOO2.f37369OooO0OO;
        ArrayList arrayList = oooOOOO.f37367OooO00o;
        int size = arrayList.size();
        int size2 = oooOOOO2.f37367OooO00o.size();
        ArrayList arrayList2 = oooOOOO2.f37367OooO00o;
        if (size != size2) {
            o00OOO0.OooOO0.OooO0O0("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = oooOOOO3.f37367OooO00o;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new o00Oo0());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = oooOOOO.f37368OooO0O0;
        PointF pointF2 = oooOOOO2.f37368OooO0O0;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = o00OOO0.OooOOO.f37431OooO00o;
        float fOooO00o = OooOo.OooO0o.OooO00o(f3, f2, f, f2);
        float f4 = pointF.y;
        float fOooO00o2 = OooOo.OooO0o.OooO00o(pointF2.y, f4, f, f4);
        if (oooOOOO3.f37368OooO0O0 == null) {
            oooOOOO3.f37368OooO0O0 = new PointF();
        }
        oooOOOO3.f37368OooO0O0.set(fOooO00o, fOooO00o2);
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            o00Oo0 o00oo1 = (o00Oo0) arrayList.get(size5);
            o00Oo0 o00oo2 = (o00Oo0) arrayList2.get(size5);
            PointF pointF4 = o00oo1.f37320OooO00o;
            PointF pointF5 = o00oo2.f37320OooO00o;
            o00Oo0 o00oo3 = (o00Oo0) arrayList3.get(size5);
            float f5 = pointF4.x;
            float fOooO00o3 = OooOo.OooO0o.OooO00o(pointF5.x, f5, f, f5);
            float f6 = pointF4.y;
            o00oo3.f37320OooO00o.set(fOooO00o3, OooOo.OooO0o.OooO00o(pointF5.y, f6, f, f6));
            o00Oo0 o00oo4 = (o00Oo0) arrayList3.get(size5);
            PointF pointF6 = o00oo1.f37321OooO0O0;
            float f7 = pointF6.x;
            PointF pointF7 = o00oo2.f37321OooO0O0;
            float fOooO00o4 = OooOo.OooO0o.OooO00o(pointF7.x, f7, f, f7);
            float f8 = pointF6.y;
            o00oo4.f37321OooO0O0.set(fOooO00o4, OooOo.OooO0o.OooO00o(pointF7.y, f8, f, f8));
            o00Oo0 o00oo5 = (o00Oo0) arrayList3.get(size5);
            PointF pointF8 = o00oo1.f37322OooO0OO;
            float f9 = pointF8.x;
            PointF pointF9 = o00oo2.f37322OooO0OO;
            float fOooO00o5 = OooOo.OooO0o.OooO00o(pointF9.x, f9, f, f9);
            float f10 = pointF8.y;
            o00oo5.f37322OooO0OO.set(fOooO00o5, OooOo.OooO0o.OooO00o(pointF9.y, f10, f, f10));
        }
        Path path = this.f37278OooOO0;
        path.reset();
        PointF pointF10 = oooOOOO3.f37368OooO0O0;
        path.moveTo(pointF10.x, pointF10.y);
        PointF pointF11 = o00OOO0.OooOOO.f37431OooO00o;
        pointF11.set(pointF10.x, pointF10.y);
        for (int i = 0; i < arrayList3.size(); i++) {
            o00Oo0 o00oo6 = (o00Oo0) arrayList3.get(i);
            PointF pointF12 = o00oo6.f37320OooO00o;
            boolean zEquals = pointF12.equals(pointF11);
            PointF pointF13 = o00oo6.f37321OooO0O0;
            PointF pointF14 = o00oo6.f37322OooO0OO;
            if (zEquals && pointF13.equals(pointF14)) {
                path.lineTo(pointF14.x, pointF14.y);
            } else {
                path.cubicTo(pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            pointF11.set(pointF14.x, pointF14.y);
        }
        if (oooOOOO3.f37369OooO0OO) {
            path.close();
        }
        return path;
    }
}
