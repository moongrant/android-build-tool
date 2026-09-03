package o00O000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p113o00O00Oo.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements OooO, Oooo000, OooOOOO, o00O000o.OooO00o.InterfaceC0420OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O000o.o0OoOo0 f36253OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f36254OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f36255OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f36256OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f36257OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f36258OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f36259OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O000o.OooO0o f36260OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O000o.OooO0o f36261OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f36262OooOO0;

    public o0OoOo0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, o00oO0o o00oo0o2) {
        this.f36256OooO0OO = lottieDrawable;
        this.f36257OooO0Oo = oooO00o;
        this.f36259OooO0o0 = o00oo0o2.f36366OooO00o;
        this.f36258OooO0o = o00oo0o2.f36370OooO0o0;
        o00O000o.OooO00o<Float, Float> OooO00o2 = o00oo0o2.f36367OooO0O0.OooO00o();
        this.f36260OooO0oO = (o00O000o.OooO0o) OooO00o2;
        oooO00o.OooO0oO(OooO00o2);
        OooO00o2.OooO00o(this);
        o00O000o.OooO00o<Float, Float> OooO00o3 = o00oo0o2.f36368OooO0OO.OooO00o();
        this.f36261OooO0oo = (o00O000o.OooO0o) OooO00o3;
        oooO00o.OooO0oO(OooO00o3);
        OooO00o3.OooO00o(this);
        o00O00OO.OooOo oooOo = o00oo0o2.f36369OooO0Oo;
        oooOo.getClass();
        o00O000o.o0OoOo0 o0oooo0 = new o00O000o.o0OoOo0(oooOo);
        this.f36253OooO = o0oooo0;
        o0oooo0.OooO00o(oooO00o);
        o0oooo0.OooO0O0(this);
    }

    @Override // o00O000.Oooo000
    public final Path OooO00o() {
        Path pathOooO00o = this.f36262OooOO0.OooO00o();
        Path path = this.f36255OooO0O0;
        path.reset();
        float fFloatValue = this.f36260OooO0oO.OooO0o().floatValue();
        float fFloatValue2 = this.f36261OooO0oo.OooO0o().floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.f36254OooO00o;
            matrix.set(this.f36253OooO.OooO0o0(i + fFloatValue2));
            path.addPath(pathOooO00o, matrix);
        }
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36256OooO0OO.invalidateSelf();
    }

    @Override // o00O000.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        this.f36262OooOO0.OooO0OO(list, list2);
    }

    @Override // oOO00O.OooO
    public final void OooO0Oo(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        o00O0.OooOOO.OooO0Oo(oooO0o, i, arrayList, oooO0o2, this);
    }

    @Override // o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f36262OooOO0.OooO0o(rectF, matrix, z);
    }

    @Override // oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        if (this.f36253OooO.OooO0OO(oooO0OO, obj)) {
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f8900OooOo0) {
            this.f36260OooO0oO.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f8902OooOo0O) {
            this.f36261OooO0oo.OooOO0O(oooO0OO);
        }
    }

    @Override // o00O000.OooOOOO
    public final void OooO0oO(ListIterator<OooO0OO> listIterator) {
        if (this.f36262OooOO0 != null) {
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
        this.f36262OooOO0 = new OooO0o(this.f36256OooO0OO, this.f36257OooO0Oo, "Repeater", this.f36258OooO0o, arrayList, null);
    }

    @Override // o00O000.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.f36260OooO0oO.OooO0o().floatValue();
        float fFloatValue2 = this.f36261OooO0oo.OooO0o().floatValue();
        o00O000o.o0OoOo0 o0oooo0 = this.f36253OooO;
        float fFloatValue3 = o0oooo0.f36328OooOOO0.OooO0o().floatValue() / 100.0f;
        float fFloatValue4 = o0oooo0.f36327OooOOO.OooO0o().floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.f36254OooO00o;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(o0oooo0.OooO0o0(f + fFloatValue2));
            PointF pointF = o00O0.OooOOO.f35980OooO00o;
            this.f36262OooOO0.OooO0oo(canvas, matrix2, (int) ((((fFloatValue4 - fFloatValue3) * (f / fFloatValue)) + fFloatValue3) * i));
        }
    }

    @Override // o00O000.OooO0OO
    public final String getName() {
        return this.f36259OooO0o0;
    }
}
