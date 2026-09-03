package o00O0O00;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public class OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f36501OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooOO0 f36502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final T f36503OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public T f36504OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Interpolator f36505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Interpolator f36506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Interpolator f36507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f36508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Float f36509OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f36510OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f36511OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f36512OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f36513OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f36514OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public PointF f36515OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public PointF f36516OooOOOo;

    public OooO00o(OooOO0 oooOO1, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f36501OooO = -3987645.8f;
        this.f36510OooOO0 = -3987645.8f;
        this.f36511OooOO0O = 784923401;
        this.f36512OooOO0o = 784923401;
        this.f36514OooOOO0 = Float.MIN_VALUE;
        this.f36513OooOOO = Float.MIN_VALUE;
        this.f36515OooOOOO = null;
        this.f36516OooOOOo = null;
        this.f36502OooO00o = oooOO1;
        this.f36503OooO0O0 = t;
        this.f36504OooO0OO = t2;
        this.f36505OooO0Oo = interpolator;
        this.f36507OooO0o0 = null;
        this.f36506OooO0o = null;
        this.f36508OooO0oO = f;
        this.f36509OooO0oo = f2;
    }

    public final float OooO00o() {
        OooOO0 oooOO1 = this.f36502OooO00o;
        if (oooOO1 == null) {
            return 1.0f;
        }
        if (this.f36513OooOOO == Float.MIN_VALUE) {
            if (this.f36509OooO0oo == null) {
                this.f36513OooOOO = 1.0f;
            } else {
                this.f36513OooOOO = ((this.f36509OooO0oo.floatValue() - this.f36508OooO0oO) / (oooOO1.f8733OooOO0o - oooOO1.f8732OooOO0O)) + OooO0O0();
            }
        }
        return this.f36513OooOOO;
    }

    public final float OooO0O0() {
        OooOO0 oooOO1 = this.f36502OooO00o;
        if (oooOO1 == null) {
            return 0.0f;
        }
        if (this.f36514OooOOO0 == Float.MIN_VALUE) {
            float f = oooOO1.f8732OooOO0O;
            this.f36514OooOOO0 = (this.f36508OooO0oO - f) / (oooOO1.f8733OooOO0o - f);
        }
        return this.f36514OooOOO0;
    }

    public final boolean OooO0OO() {
        return this.f36505OooO0Oo == null && this.f36507OooO0o0 == null && this.f36506OooO0o == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f36503OooO0O0 + ", endValue=" + this.f36504OooO0OO + ", startFrame=" + this.f36508OooO0oO + ", endFrame=" + this.f36509OooO0oo + ", interpolator=" + this.f36505OooO0Oo + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(OooOO0 oooOO1, @Nullable Object obj, @Nullable Object obj2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f) {
        this.f36501OooO = -3987645.8f;
        this.f36510OooOO0 = -3987645.8f;
        this.f36511OooOO0O = 784923401;
        this.f36512OooOO0o = 784923401;
        this.f36514OooOOO0 = Float.MIN_VALUE;
        this.f36513OooOOO = Float.MIN_VALUE;
        this.f36515OooOOOO = null;
        this.f36516OooOOOo = null;
        this.f36502OooO00o = oooOO1;
        this.f36503OooO0O0 = obj;
        this.f36504OooO0OO = obj2;
        this.f36505OooO0Oo = null;
        this.f36507OooO0o0 = interpolator;
        this.f36506OooO0o = interpolator2;
        this.f36508OooO0oO = f;
        this.f36509OooO0oo = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(OooOO0 oooOO1, @Nullable PointF pointF, @Nullable PointF pointF2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.f36501OooO = -3987645.8f;
        this.f36510OooOO0 = -3987645.8f;
        this.f36511OooOO0O = 784923401;
        this.f36512OooOO0o = 784923401;
        this.f36514OooOOO0 = Float.MIN_VALUE;
        this.f36513OooOOO = Float.MIN_VALUE;
        this.f36515OooOOOO = null;
        this.f36516OooOOOo = null;
        this.f36502OooO00o = oooOO1;
        this.f36503OooO0O0 = pointF;
        this.f36504OooO0OO = pointF2;
        this.f36505OooO0Oo = interpolator;
        this.f36507OooO0o0 = interpolator2;
        this.f36506OooO0o = interpolator3;
        this.f36508OooO0oO = f;
        this.f36509OooO0oo = f2;
    }

    public OooO00o(T t) {
        this.f36501OooO = -3987645.8f;
        this.f36510OooOO0 = -3987645.8f;
        this.f36511OooOO0O = 784923401;
        this.f36512OooOO0o = 784923401;
        this.f36514OooOOO0 = Float.MIN_VALUE;
        this.f36513OooOOO = Float.MIN_VALUE;
        this.f36515OooOOOO = null;
        this.f36516OooOOOo = null;
        this.f36502OooO00o = null;
        this.f36503OooO0O0 = t;
        this.f36504OooO0OO = t;
        this.f36505OooO0Oo = null;
        this.f36507OooO0o0 = null;
        this.f36506OooO0o = null;
        this.f36508OooO0oO = Float.MIN_VALUE;
        this.f36509OooO0oo = Float.valueOf(Float.MAX_VALUE);
    }
}
