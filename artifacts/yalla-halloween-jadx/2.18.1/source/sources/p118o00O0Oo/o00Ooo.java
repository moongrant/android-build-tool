package p118o00O0Oo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOOO;
import p120o00O0OoO.o0ooOOo;
import p123o00O0o0.o00O0O;
import p125o00O0o0O.o00000O0;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements OooOOO0, o0OoOo0, Oooo000, OooOO0O.OooO00o, Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0ooOOo f30722OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f30723OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f30724OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f30725OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f30726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f30727OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f30728OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30729OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30730OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOO0O f30731OooOO0;

    public o00Ooo(LottieDrawable lottieDrawable, OooO00o oooO00o, o00000O0 o00000o1) {
        this.f30725OooO0OO = lottieDrawable;
        this.f30726OooO0Oo = oooO00o;
        this.f30728OooO0o0 = o00000o1.f31008OooO00o;
        this.f30727OooO0o = o00000o1.f31012OooO0o0;
        OooOO0O<Float, Float> oooOO0OOooO00o = o00000o1.f31009OooO0O0.OooO00o();
        this.f30729OooO0oO = (OooOOOO) oooOO0OOooO00o;
        oooO00o.OooO0oO(oooOO0OOooO00o);
        oooOO0OOooO00o.OooO00o(this);
        OooOO0O<Float, Float> oooOO0OOooO00o2 = o00000o1.f31010OooO0OO.OooO00o();
        this.f30730OooO0oo = (OooOOOO) oooOO0OOooO00o2;
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        oooOO0OOooO00o2.OooO00o(this);
        o00O0O o00o0o2 = o00000o1.f31011OooO0Oo;
        Objects.requireNonNull(o00o0o2);
        o0ooOOo o0ooooo2 = new o0ooOOo(o00o0o2);
        this.f30722OooO = o0ooooo2;
        o0ooooo2.OooO00o(oooO00o);
        o0ooooo2.OooO0O0(this);
    }

    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        Path pathOooO00o = this.f30731OooOO0.OooO00o();
        this.f30724OooO0O0.reset();
        float fFloatValue = this.f30729OooO0oO.OooO0o().floatValue();
        float fFloatValue2 = this.f30730OooO0oo.OooO0o().floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return this.f30724OooO0O0;
            }
            this.f30723OooO00o.set(this.f30722OooO.OooO0o(i + fFloatValue2));
            this.f30724OooO0O0.addPath(pathOooO00o, this.f30723OooO00o);
        }
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30725OooO0OO.invalidateSelf();
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        this.f30731OooOO0.OooO0OO(list, list2);
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        o000O0.OooO0o0(o00o0ooo2, i, list, o00o0ooo3, this);
    }

    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f30731OooOO0.OooO0o(rectF, matrix, z);
    }

    @Override // p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        if (this.f30722OooO.OooO0OO(t, o000000o2)) {
            return;
        }
        if (t == o000oOoO.f10218OooOo0) {
            this.f30729OooO0oO.OooOO0O(o000000o2);
        } else if (t == o000oOoO.f10220OooOo0O) {
            this.f30730OooO0oo.OooOO0O(o000000o2);
        }
    }

    @Override // p118o00O0Oo.Oooo000
    public final void OooO0oO(ListIterator<OooOO0> listIterator) {
        if (this.f30731OooOO0 != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f30731OooOO0 = new OooOO0O(this.f30725OooO0OO, this.f30726OooO0Oo, "Repeater", this.f30727OooO0o, arrayList, null);
    }

    @Override // p118o00O0Oo.OooOOO0
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.f30729OooO0oO.OooO0o().floatValue();
        float fFloatValue2 = this.f30730OooO0oo.OooO0o().floatValue();
        float fFloatValue3 = this.f30722OooO.f30815OooOOO0.OooO0o().floatValue() / 100.0f;
        float fFloatValue4 = this.f30722OooO.f30814OooOOO.OooO0o().floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            this.f30723OooO00o.set(matrix);
            float f = i2;
            this.f30723OooO00o.preConcat(this.f30722OooO.OooO0o(f + fFloatValue2));
            PointF pointF = o000O0.f31128OooO00o;
            this.f30731OooOO0.OooO0oo(canvas, this.f30723OooO00o, (int) ((((fFloatValue4 - fFloatValue3) * (f / fFloatValue)) + fFloatValue3) * i));
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30728OooO0o0;
    }
}
