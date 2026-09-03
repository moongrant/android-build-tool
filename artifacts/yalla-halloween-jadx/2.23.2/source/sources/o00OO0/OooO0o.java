package o00OO0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p134o00OO0o.o000000O;
import p135o00OO0o0.o00oO0o;
import p135o00OO0o0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO, Oooo000, o00OO0O0.OooO00o.InterfaceC0423OooO00o, o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final LottieDrawable f36941OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p133o00OO00o.o0ooOOo f36942OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f36943OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f36944OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Path f36945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f36946OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f36947OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f36948OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<OooO0OO> f36949OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ArrayList f36950OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.o0OoOo0 f36951OooOO0O;

    public OooO0o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.OooOo oooOo) {
        o000000O o000000o2;
        String str = oooOo.f37370OooO00o;
        boolean z = oooOo.f37372OooO0OO;
        List<p136o00OO0oO.OooO> list = oooOo.f37371OooO0O0;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            OooO0OO oooO0OOOooO00o = list.get(i).OooO00o(lottieDrawable, oooO00o);
            if (oooO0OOOooO00o != null) {
                arrayList.add(oooO0OOOooO00o);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            p136o00OO0oO.OooO oooO = list.get(i2);
            if (oooO instanceof o000000O) {
                o000000o2 = (o000000O) oooO;
                this(lottieDrawable, oooO00o, str, z, arrayList, o000000o2);
            }
        }
        o000000o2 = null;
        this(lottieDrawable, oooO00o, str, z, arrayList, o000000o2);
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        Matrix matrix = this.f36944OooO0OO;
        matrix.reset();
        o00OO0O0.o0OoOo0 o0oooo1 = this.f36951OooOO0O;
        if (o0oooo1 != null) {
            matrix.set(o0oooo1.OooO0Oo());
        }
        Path path = this.f36945OooO0Oo;
        path.reset();
        if (this.f36948OooO0oO) {
            return path;
        }
        List<OooO0OO> list = this.f36949OooO0oo;
        for (int size = list.size() - 1; size >= 0; size--) {
            OooO0OO oooO0OO = list.get(size);
            if (oooO0OO instanceof Oooo000) {
                path.addPath(((Oooo000) oooO0OO).OooO00o(), matrix);
            }
        }
        return path;
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f36941OooO.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        int size = list.size();
        List<OooO0OO> list3 = this.f36949OooO0oo;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            OooO0OO oooO0OO = list3.get(size2);
            oooO0OO.OooO0OO(arrayList, list3.subList(0, size2));
            arrayList.add(oooO0OO);
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        o00OO0O0.o0OoOo0 o0oooo1 = this.f36951OooOO0O;
        if (o0oooo1 != null) {
            o0oooo1.OooO0OO(oooO0OO, obj);
        }
    }

    @Override // o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f36944OooO0OO;
        matrix2.set(matrix);
        o00OO0O0.o0OoOo0 o0oooo1 = this.f36951OooOO0O;
        if (o0oooo1 != null) {
            matrix2.preConcat(o0oooo1.OooO0Oo());
        }
        RectF rectF2 = this.f36947OooO0o0;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<OooO0OO> list = this.f36949OooO0oo;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            OooO0OO oooO0OO = list.get(size);
            if (oooO0OO instanceof OooO) {
                ((OooO) oooO0OO).OooO0o(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        String str = this.f36946OooO0o;
        if (!o00oo0o2.OooO0OO(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            o00oo0o3.getClass();
            o00oO0o o00oo0o4 = new o00oO0o(o00oo0o3);
            o00oo0o4.f37327OooO00o.add(str);
            if (o00oo0o2.OooO00o(i, str)) {
                o00oO0o o00oo0o5 = new o00oO0o(o00oo0o4);
                o00oo0o5.f37328OooO0O0 = this;
                arrayList.add(o00oo0o5);
            }
            o00oo0o3 = o00oo0o4;
        }
        if (!o00oo0o2.OooO0Oo(i, str)) {
            return;
        }
        int iOooO0O0 = o00oo0o2.OooO0O0(i, str) + i;
        int i2 = 0;
        while (true) {
            List<OooO0OO> list = this.f36949OooO0oo;
            if (i2 >= list.size()) {
                return;
            }
            OooO0OO oooO0OO = list.get(i2);
            if (oooO0OO instanceof o0ooOOo) {
                ((o0ooOOo) oooO0OO).OooO0o0(o00oo0o2, iOooO0O0, arrayList, o00oo0o3);
            }
            i2++;
        }
    }

    public final List<Oooo000> OooO0oO() {
        if (this.f36950OooOO0 == null) {
            this.f36950OooOO0 = new ArrayList();
            int i = 0;
            while (true) {
                List<OooO0OO> list = this.f36949OooO0oo;
                if (i >= list.size()) {
                    break;
                }
                OooO0OO oooO0OO = list.get(i);
                if (oooO0OO instanceof Oooo000) {
                    this.f36950OooOO0.add((Oooo000) oooO0OO);
                }
                i++;
            }
        }
        return this.f36950OooOO0;
    }

    @Override // o00OO0.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.f36948OooO0oO) {
            return;
        }
        Matrix matrix2 = this.f36944OooO0OO;
        matrix2.set(matrix);
        o00OO0O0.o0OoOo0 o0oooo1 = this.f36951OooOO0O;
        if (o0oooo1 != null) {
            matrix2.preConcat(o0oooo1.OooO0Oo());
            o00OO0O0.OooO00o<Integer, Integer> oooO00o = o0oooo1.f37289OooOO0;
            i = (int) (((((oooO00o == null ? 100 : oooO00o.OooO0o().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = this.f36941OooO.f11777OooOo00;
        boolean z3 = false;
        List<OooO0OO> list = this.f36949OooO0oo;
        if (z2) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    z = false;
                    break;
                } else {
                    if ((list.get(i2) instanceof OooO) && (i3 = i3 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (z && i != 255) {
                z3 = true;
            }
        }
        if (z3) {
            RectF rectF = this.f36943OooO0O0;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            OooO0o(rectF, matrix2, true);
            p133o00OO00o.o0ooOOo o0ooooo = this.f36942OooO00o;
            o0ooooo.setAlpha(i);
            o00OOO0.OooOOOO.OooO00o oooO00o2 = o00OOO0.OooOOOO.f37433OooO00o;
            canvas.saveLayer(rectF, o0ooooo);
            com.airbnb.lottie.OooO0OO.OooO00o();
        }
        if (z3) {
            i = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            OooO0OO oooO0OO = list.get(size);
            if (oooO0OO instanceof OooO) {
                ((OooO) oooO0OO).OooO0oo(canvas, matrix2, i);
            }
        }
        if (z3) {
            canvas.restore();
        }
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f36946OooO0o;
    }

    public OooO0o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, String str, boolean z, ArrayList arrayList, @Nullable o000000O o000000o2) {
        this.f36942OooO00o = new p133o00OO00o.o0ooOOo();
        this.f36943OooO0O0 = new RectF();
        this.f36944OooO0OO = new Matrix();
        this.f36945OooO0Oo = new Path();
        this.f36947OooO0o0 = new RectF();
        this.f36946OooO0o = str;
        this.f36941OooO = lottieDrawable;
        this.f36948OooO0oO = z;
        this.f36949OooO0oo = arrayList;
        if (o000000o2 != null) {
            o00OO0O0.o0OoOo0 o0oooo1 = new o00OO0O0.o0OoOo0(o000000o2);
            this.f36951OooOO0O = o0oooo1;
            o0oooo1.OooO00o(oooO00o);
            o0oooo1.OooO0O0(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            OooO0OO oooO0OO = (OooO0OO) arrayList.get(size);
            if (oooO0OO instanceof OooOOOO) {
                arrayList2.add((OooOOOO) oooO0OO);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((OooOOOO) arrayList2.get(size2)).OooO0oO(arrayList.listIterator(arrayList.size()));
            }
        }
    }
}
