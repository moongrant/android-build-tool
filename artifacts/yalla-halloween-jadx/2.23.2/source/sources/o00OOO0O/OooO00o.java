package o00OOO0O;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public class OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f37439OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooOO0 f37440OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final T f37441OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public T f37442OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Interpolator f37443OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Interpolator f37444OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Interpolator f37445OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f37446OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Float f37447OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f37448OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f37449OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f37450OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f37451OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f37452OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public PointF f37453OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public PointF f37454OooOOOo;

    public OooO00o(OooOO0 oooOO1, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f37439OooO = -3987645.8f;
        this.f37448OooOO0 = -3987645.8f;
        this.f37449OooOO0O = 784923401;
        this.f37450OooOO0o = 784923401;
        this.f37452OooOOO0 = Float.MIN_VALUE;
        this.f37451OooOOO = Float.MIN_VALUE;
        this.f37453OooOOOO = null;
        this.f37454OooOOOo = null;
        this.f37440OooO00o = oooOO1;
        this.f37441OooO0O0 = t;
        this.f37442OooO0OO = t2;
        this.f37443OooO0Oo = interpolator;
        this.f37445OooO0o0 = null;
        this.f37444OooO0o = null;
        this.f37446OooO0oO = f;
        this.f37447OooO0oo = f2;
    }

    public final float OooO00o() {
        OooOO0 oooOO1 = this.f37440OooO00o;
        if (oooOO1 == null) {
            return 1.0f;
        }
        if (this.f37451OooOOO == Float.MIN_VALUE) {
            if (this.f37447OooO0oo == null) {
                this.f37451OooOOO = 1.0f;
            } else {
                this.f37451OooOOO = ((this.f37447OooO0oo.floatValue() - this.f37446OooO0oO) / (oooOO1.f11823OooOO0o - oooOO1.f11822OooOO0O)) + OooO0O0();
            }
        }
        return this.f37451OooOOO;
    }

    public final float OooO0O0() {
        OooOO0 oooOO1 = this.f37440OooO00o;
        if (oooOO1 == null) {
            return 0.0f;
        }
        if (this.f37452OooOOO0 == Float.MIN_VALUE) {
            float f = oooOO1.f11822OooOO0O;
            this.f37452OooOOO0 = (this.f37446OooO0oO - f) / (oooOO1.f11823OooOO0o - f);
        }
        return this.f37452OooOOO0;
    }

    public final boolean OooO0OO() {
        return this.f37443OooO0Oo == null && this.f37445OooO0o0 == null && this.f37444OooO0o == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f37441OooO0O0 + ", endValue=" + this.f37442OooO0OO + ", startFrame=" + this.f37446OooO0oO + ", endFrame=" + this.f37447OooO0oo + ", interpolator=" + this.f37443OooO0Oo + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(OooOO0 oooOO1, @Nullable Object obj, @Nullable Object obj2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f) {
        this.f37439OooO = -3987645.8f;
        this.f37448OooOO0 = -3987645.8f;
        this.f37449OooOO0O = 784923401;
        this.f37450OooOO0o = 784923401;
        this.f37452OooOOO0 = Float.MIN_VALUE;
        this.f37451OooOOO = Float.MIN_VALUE;
        this.f37453OooOOOO = null;
        this.f37454OooOOOo = null;
        this.f37440OooO00o = oooOO1;
        this.f37441OooO0O0 = obj;
        this.f37442OooO0OO = obj2;
        this.f37443OooO0Oo = null;
        this.f37445OooO0o0 = interpolator;
        this.f37444OooO0o = interpolator2;
        this.f37446OooO0oO = f;
        this.f37447OooO0oo = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(OooOO0 oooOO1, @Nullable PointF pointF, @Nullable PointF pointF2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.f37439OooO = -3987645.8f;
        this.f37448OooOO0 = -3987645.8f;
        this.f37449OooOO0O = 784923401;
        this.f37450OooOO0o = 784923401;
        this.f37452OooOOO0 = Float.MIN_VALUE;
        this.f37451OooOOO = Float.MIN_VALUE;
        this.f37453OooOOOO = null;
        this.f37454OooOOOo = null;
        this.f37440OooO00o = oooOO1;
        this.f37441OooO0O0 = pointF;
        this.f37442OooO0OO = pointF2;
        this.f37443OooO0Oo = interpolator;
        this.f37445OooO0o0 = interpolator2;
        this.f37444OooO0o = interpolator3;
        this.f37446OooO0oO = f;
        this.f37447OooO0oo = f2;
    }

    public OooO00o(T t) {
        this.f37439OooO = -3987645.8f;
        this.f37448OooOO0 = -3987645.8f;
        this.f37449OooOO0O = 784923401;
        this.f37450OooOO0o = 784923401;
        this.f37452OooOOO0 = Float.MIN_VALUE;
        this.f37451OooOOO = Float.MIN_VALUE;
        this.f37453OooOOOO = null;
        this.f37454OooOOOo = null;
        this.f37440OooO00o = null;
        this.f37441OooO0O0 = t;
        this.f37442OooO0OO = t;
        this.f37443OooO0Oo = null;
        this.f37445OooO0o0 = null;
        this.f37444OooO0o = null;
        this.f37446OooO0oO = Float.MIN_VALUE;
        this.f37447OooO0oo = Float.valueOf(Float.MAX_VALUE);
    }
}
