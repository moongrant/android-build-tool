package o00OO0;

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
import p134o00OO0o.o000000O;
import p135o00OO0o0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements OooO, Oooo000, OooOOOO, o00OO0O0.OooO00o.InterfaceC0423OooO00o, OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00OO0O0.o0OoOo0 f37053OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f37054OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f37055OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f37056OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO00o f37057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f37058OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f37059OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37060OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00OO0O0.OooO0o f37061OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f37062OooOO0;

    public o0OoOo0(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o, p136o00OO0oO.OooOOO oooOOO) {
        this.f37056OooO0OO = lottieDrawable;
        this.f37057OooO0Oo = oooO00o;
        this.f37059OooO0o0 = oooOOO.f37357OooO00o;
        this.f37058OooO0o = oooOOO.f37361OooO0o0;
        o00OO0O0.OooO00o<Float, Float> OooO00o2 = oooOOO.f37358OooO0O0.OooO00o();
        this.f37060OooO0oO = (o00OO0O0.OooO0o) OooO00o2;
        oooO00o.OooO0oO(OooO00o2);
        OooO00o2.OooO00o(this);
        o00OO0O0.OooO00o<Float, Float> OooO00o3 = oooOOO.f37359OooO0OO.OooO00o();
        this.f37061OooO0oo = (o00OO0O0.OooO0o) OooO00o3;
        oooO00o.OooO0oO(OooO00o3);
        OooO00o3.OooO00o(this);
        o000000O o000000o2 = oooOOO.f37360OooO0Oo;
        o000000o2.getClass();
        o00OO0O0.o0OoOo0 o0oooo1 = new o00OO0O0.o0OoOo0(o000000o2);
        this.f37053OooO = o0oooo1;
        o0oooo1.OooO00o(oooO00o);
        o0oooo1.OooO0O0(this);
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        Path pathOooO00o = this.f37062OooOO0.OooO00o();
        Path path = this.f37055OooO0O0;
        path.reset();
        float fFloatValue = this.f37060OooO0oO.OooO0o().floatValue();
        float fFloatValue2 = this.f37061OooO0oo.OooO0o().floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.f37054OooO00o;
            matrix.set(this.f37053OooO.OooO0o0(i + fFloatValue2));
            path.addPath(pathOooO00o, matrix);
        }
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f37056OooO0OO.invalidateSelf();
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        this.f37062OooOO0.OooO0OO(list, list2);
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable o00OOO0O.OooO0OO oooO0OO, Object obj) {
        if (this.f37053OooO.OooO0OO(oooO0OO, obj)) {
            return;
        }
        if (obj == com.airbnb.lottie.o00Oo0.f11990OooOo0) {
            this.f37060OooO0oO.OooOO0O(oooO0OO);
        } else if (obj == com.airbnb.lottie.o00Oo0.f11992OooOo0O) {
            this.f37061OooO0oo.OooOO0O(oooO0OO);
        }
    }

    @Override // o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        this.f37062OooOO0.OooO0o(rectF, matrix, z);
    }

    @Override // p135o00OO0o0.o0ooOOo
    public final void OooO0o0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        o00OOO0.OooOOO.OooO0Oo(o00oo0o2, i, arrayList, o00oo0o3, this);
    }

    @Override // o00OO0.OooOOOO
    public final void OooO0oO(ListIterator<OooO0OO> listIterator) {
        if (this.f37062OooOO0 != null) {
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
        this.f37062OooOO0 = new OooO0o(this.f37056OooO0OO, this.f37057OooO0Oo, "Repeater", this.f37058OooO0o, arrayList, null);
    }

    @Override // o00OO0.OooO
    public final void OooO0oo(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.f37060OooO0oO.OooO0o().floatValue();
        float fFloatValue2 = this.f37061OooO0oo.OooO0o().floatValue();
        o00OO0O0.o0OoOo0 o0oooo1 = this.f37053OooO;
        float fFloatValue3 = o0oooo1.f37293OooOOO0.OooO0o().floatValue() / 100.0f;
        float fFloatValue4 = o0oooo1.f37292OooOOO.OooO0o().floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.f37054OooO00o;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(o0oooo1.OooO0o0(f + fFloatValue2));
            PointF pointF = o00OOO0.OooOOO.f37431OooO00o;
            this.f37062OooOO0.OooO0oo(canvas, matrix2, (int) ((((fFloatValue4 - fFloatValue3) * (f / fFloatValue)) + fFloatValue3) * i));
        }
    }

    @Override // o00OO0.OooO0OO
    public final String getName() {
        return this.f37059OooO0o0;
    }
}
