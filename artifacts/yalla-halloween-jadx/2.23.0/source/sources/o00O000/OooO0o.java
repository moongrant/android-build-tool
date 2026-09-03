package o00O000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import p113o00O00Oo.o0Oo0oo;
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO, Oooo000, o00O000o.OooO00o.InterfaceC0420OooO00o, oOO00O.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final LottieDrawable f36141OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f36142OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f36143OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f36144OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Path f36145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f36146OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f36147OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f36148OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<OooO0OO> f36149OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ArrayList f36150OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o00O000o.o0OoOo0 f36151OooOO0O;

    public OooO0o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, o0Oo0oo o0oo0oo2) {
        o00O00OO.OooOo oooOo;
        String str = o0oo0oo2.f36381OooO00o;
        boolean z = o0oo0oo2.f36383OooO0OO;
        List<p113o00O00Oo.o00O0O> list = o0oo0oo2.f36382OooO0O0;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            OooO0OO oooO0OOOooO00o = list.get(i).OooO00o(lottieDrawable, oooO00o);
            if (oooO0OOOooO00o != null) {
                arrayList.add(oooO0OOOooO00o);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            p113o00O00Oo.o00O0O o00o0o2 = list.get(i2);
            if (o00o0o2 instanceof o00O00OO.OooOo) {
                oooOo = (o00O00OO.OooOo) o00o0o2;
                this(lottieDrawable, oooO00o, str, z, arrayList, oooOo);
            }
        }
        oooOo = null;
        this(lottieDrawable, oooO00o, str, z, arrayList, oooOo);
    }

    @Override // o00O000.Oooo000
    public final Path OooO00o() {
        Matrix matrix = this.f36144OooO0OO;
        matrix.reset();
        o00O000o.o0OoOo0 o0oooo0 = this.f36151OooOO0O;
        if (o0oooo0 != null) {
            matrix.set(o0oooo0.OooO0Oo());
        }
        Path path = this.f36145OooO0Oo;
        path.reset();
        if (this.f36148OooO0oO) {
            return path;
        }
        List<OooO0OO> list = this.f36149OooO0oo;
        for (int size = list.size() - 1; size >= 0; size--) {
            OooO0OO oooO0OO = list.get(size);
            if (oooO0OO instanceof Oooo000) {
                path.addPath(((Oooo000) oooO0OO).OooO00o(), matrix);
            }
        }
        return path;
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36141OooO.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        int size = list.size();
        List<OooO0OO> list3 = this.f36149OooO0oo;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            OooO0OO oooO0OO = list3.get(size2);
            oooO0OO.OooO0OO(arrayList, list3.subList(0, size2));
            arrayList.add(oooO0OO);
        }
    }

    @Override // oOO00O.OooO
    public final void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        String str = this.f36146OooO0o;
        if (!oooO0o.OooO0OO(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            oooO0o2.getClass();
            oOO00O.OooO0o oooO0o3 = new oOO00O.OooO0o(oooO0o2);
            oooO0o3.f60842OooO00o.add(str);
            if (oooO0o.OooO00o(i, str)) {
                oOO00O.OooO0o oooO0o4 = new oOO00O.OooO0o(oooO0o3);
                oooO0o4.f60843OooO0O0 = this;
                arrayList.add(oooO0o4);
            }
            oooO0o2 = oooO0o3;
        }
        if (!oooO0o.OooO0Oo(i, str)) {
            return;
        }
        int iOooO0O0 = oooO0o.OooO0O0(i, str) + i;
        int i2 = 0;
        while (true) {
            List<OooO0OO> list = this.f36149OooO0oo;
            if (i2 >= list.size()) {
                return;
            }
            OooO0OO oooO0OO = list.get(i2);
            if (oooO0OO instanceof oOO00O.OooO) {
                ((oOO00O.OooO) oooO0OO).OooO0Oo(oooO0o, iOooO0O0, arrayList, oooO0o2);
            }
            i2++;
        }
    }

    @Override // o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f36144OooO0OO;
        matrix2.set(matrix);
        o00O000o.o0OoOo0 o0oooo0 = this.f36151OooOO0O;
        if (o0oooo0 != null) {
            matrix2.preConcat(o0oooo0.OooO0Oo());
        }
        RectF rectF2 = this.f36147OooO0o0;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List<OooO0OO> list = this.f36149OooO0oo;
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

    @Override // oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        o00O000o.o0OoOo0 o0oooo0 = this.f36151OooOO0O;
        if (o0oooo0 != null) {
            o0oooo0.OooO0OO(oooO0OO, obj);
        }
    }

    public final List<Oooo000> OooO0oO() {
        if (this.f36150OooOO0 == null) {
            this.f36150OooOO0 = new ArrayList();
            int i = 0;
            while (true) {
                List<OooO0OO> list = this.f36149OooO0oo;
                if (i >= list.size()) {
                    break;
                }
                OooO0OO oooO0OO = list.get(i);
                if (oooO0OO instanceof Oooo000) {
                    this.f36150OooOO0.add((Oooo000) oooO0OO);
                }
                i++;
            }
        }
        return this.f36150OooOO0;
    }

    @Override // o00O000.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.f36148OooO0oO) {
            return;
        }
        Matrix matrix2 = this.f36144OooO0OO;
        matrix2.set(matrix);
        o00O000o.o0OoOo0 o0oooo0 = this.f36151OooOO0O;
        if (o0oooo0 != null) {
            matrix2.preConcat(o0oooo0.OooO0Oo());
            o00O000o.OooO00o<Integer, Integer> oooO00o = o0oooo0.f36324OooOO0;
            i = (int) (((((oooO00o == null ? 100 : oooO00o.OooO0o().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = this.f36141OooO.f8687OooOo00;
        boolean z3 = false;
        List<OooO0OO> list = this.f36149OooO0oo;
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
            RectF rectF = this.f36143OooO0O0;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            OooO0o(rectF, matrix2, true);
            o0ooOOo o0ooooo = this.f36142OooO00o;
            o0ooooo.setAlpha(i);
            o00O0.OooOOOO.OooO00o oooO00o2 = o00O0.OooOOOO.f35982OooO00o;
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

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f36146OooO0o;
    }

    public OooO0o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, String str, boolean z, ArrayList arrayList, @Nullable o00O00OO.OooOo oooOo) {
        this.f36142OooO00o = new o0ooOOo();
        this.f36143OooO0O0 = new RectF();
        this.f36144OooO0OO = new Matrix();
        this.f36145OooO0Oo = new Path();
        this.f36147OooO0o0 = new RectF();
        this.f36146OooO0o = str;
        this.f36141OooO = lottieDrawable;
        this.f36148OooO0oO = z;
        this.f36149OooO0oo = arrayList;
        if (oooOo != null) {
            o00O000o.o0OoOo0 o0oooo0 = new o00O000o.o0OoOo0(oooOo);
            this.f36151OooOO0O = o0oooo0;
            o0oooo0.OooO00o(oooO00o);
            o0oooo0.OooO0O0(this);
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
