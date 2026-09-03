package p131o00O0oo0;

import OooO00o.OooO00o;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public class o000OOo<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f31155OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooOO0O f31156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final T f31157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public T f31158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Interpolator f31159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Interpolator f31160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Interpolator f31161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f31162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Float f31163OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f31164OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f31165OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f31166OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f31167OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f31168OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public PointF f31169OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public PointF f31170OooOOOo;

    public o000OOo(OooOO0O oooOO0O, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f, @Nullable Float f2) {
        this.f31155OooO = -3987645.8f;
        this.f31164OooOO0 = -3987645.8f;
        this.f31165OooOO0O = 784923401;
        this.f31166OooOO0o = 784923401;
        this.f31168OooOOO0 = Float.MIN_VALUE;
        this.f31167OooOOO = Float.MIN_VALUE;
        this.f31169OooOOOO = null;
        this.f31170OooOOOo = null;
        this.f31156OooO00o = oooOO0O;
        this.f31157OooO0O0 = t;
        this.f31158OooO0OO = t2;
        this.f31159OooO0Oo = interpolator;
        this.f31161OooO0o0 = null;
        this.f31160OooO0o = null;
        this.f31162OooO0oO = f;
        this.f31163OooO0oo = f2;
    }

    public final float OooO00o() {
        if (this.f31156OooO00o == null) {
            return 1.0f;
        }
        if (this.f31167OooOOO == Float.MIN_VALUE) {
            if (this.f31163OooO0oo == null) {
                this.f31167OooOOO = 1.0f;
            } else {
                float fOooO0O0 = OooO0O0();
                float fFloatValue = this.f31163OooO0oo.floatValue() - this.f31162OooO0oO;
                OooOO0O oooOO0O = this.f31156OooO00o;
                this.f31167OooOOO = (fFloatValue / (oooOO0O.f10051OooOO0o - oooOO0O.f10050OooOO0O)) + fOooO0O0;
            }
        }
        return this.f31167OooOOO;
    }

    public final float OooO0O0() {
        OooOO0O oooOO0O = this.f31156OooO00o;
        if (oooOO0O == null) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (this.f31168OooOOO0 == Float.MIN_VALUE) {
            float f = this.f31162OooO0oO;
            float f2 = oooOO0O.f10050OooOO0O;
            this.f31168OooOOO0 = (f - f2) / (oooOO0O.f10051OooOO0o - f2);
        }
        return this.f31168OooOOO0;
    }

    public final boolean OooO0OO() {
        return this.f31159OooO0Oo == null && this.f31161OooO0o0 == null && this.f31160OooO0o == null;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Keyframe{startValue=");
        sbOooO0o0.append(this.f31157OooO0O0);
        sbOooO0o0.append(", endValue=");
        sbOooO0o0.append(this.f31158OooO0OO);
        sbOooO0o0.append(", startFrame=");
        sbOooO0o0.append(this.f31162OooO0oO);
        sbOooO0o0.append(", endFrame=");
        sbOooO0o0.append(this.f31163OooO0oo);
        sbOooO0o0.append(", interpolator=");
        sbOooO0o0.append(this.f31159OooO0Oo);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000OOo(OooOO0O oooOO0O, @Nullable Object obj, @Nullable Object obj2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, float f) {
        this.f31155OooO = -3987645.8f;
        this.f31164OooOO0 = -3987645.8f;
        this.f31165OooOO0O = 784923401;
        this.f31166OooOO0o = 784923401;
        this.f31168OooOOO0 = Float.MIN_VALUE;
        this.f31167OooOOO = Float.MIN_VALUE;
        this.f31169OooOOOO = null;
        this.f31170OooOOOo = null;
        this.f31156OooO00o = oooOO0O;
        this.f31157OooO0O0 = obj;
        this.f31158OooO0OO = obj2;
        this.f31159OooO0Oo = null;
        this.f31161OooO0o0 = interpolator;
        this.f31160OooO0o = interpolator2;
        this.f31162OooO0oO = f;
        this.f31163OooO0oo = null;
    }

    public o000OOo(OooOO0O oooOO0O, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, @Nullable Interpolator interpolator2, @Nullable Interpolator interpolator3, float f, @Nullable Float f2) {
        this.f31155OooO = -3987645.8f;
        this.f31164OooOO0 = -3987645.8f;
        this.f31165OooOO0O = 784923401;
        this.f31166OooOO0o = 784923401;
        this.f31168OooOOO0 = Float.MIN_VALUE;
        this.f31167OooOOO = Float.MIN_VALUE;
        this.f31169OooOOOO = null;
        this.f31170OooOOOo = null;
        this.f31156OooO00o = oooOO0O;
        this.f31157OooO0O0 = t;
        this.f31158OooO0OO = t2;
        this.f31159OooO0Oo = interpolator;
        this.f31161OooO0o0 = interpolator2;
        this.f31160OooO0o = interpolator3;
        this.f31162OooO0oO = f;
        this.f31163OooO0oo = f2;
    }

    public o000OOo(T t) {
        this.f31155OooO = -3987645.8f;
        this.f31164OooOO0 = -3987645.8f;
        this.f31165OooOO0O = 784923401;
        this.f31166OooOO0o = 784923401;
        this.f31168OooOOO0 = Float.MIN_VALUE;
        this.f31167OooOOO = Float.MIN_VALUE;
        this.f31169OooOOOO = null;
        this.f31170OooOOOo = null;
        this.f31156OooO00o = null;
        this.f31157OooO0O0 = t;
        this.f31158OooO0OO = t;
        this.f31159OooO0Oo = null;
        this.f31161OooO0o0 = null;
        this.f31160OooO0o = null;
        this.f31162OooO0oO = Float.MIN_VALUE;
        this.f31163OooO0oo = Float.valueOf(Float.MAX_VALUE);
    }
}
