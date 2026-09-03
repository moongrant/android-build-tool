package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final int f7983Ooooo0o = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0O0 f7984Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C0049OooO00o f7985Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final AccelerateInterpolator f7986Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final View f7987Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f7988OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float[] f7989OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float[] f7990OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f7991OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float[] f7992OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float[] f7993OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f7994OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f7995OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f7996OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f7997OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f7998Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float[] f7999o000oOoO;

    /* JADX INFO: renamed from: androidx.core.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0049OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f8000OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8001OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8002OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f8003OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f8004OooO0Oo;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f8008OooO0oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f8006OooO0o0 = Long.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f8007OooO0oO = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f8005OooO0o = 0;

        public final float OooO00o(long j) {
            long j2 = this.f8006OooO0o0;
            if (j < j2) {
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            long j3 = this.f8007OooO0oO;
            if (j3 < 0 || j < j3) {
                return OooO00o.OooO0O0((j - j2) / this.f8001OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f) * 0.5f;
            }
            float f = this.f8008OooO0oo;
            return (OooO00o.OooO0O0((j - j3) / this.f8000OooO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f) * f) + (1.0f - f);
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f7997OoooOoo) {
                if (oooO00o.f7995OoooOo0) {
                    oooO00o.f7995OoooOo0 = false;
                    C0049OooO00o c0049OooO00o = oooO00o.f7985Oooo0o;
                    Objects.requireNonNull(c0049OooO00o);
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0049OooO00o.f8006OooO0o0 = jCurrentAnimationTimeMillis;
                    c0049OooO00o.f8007OooO0oO = -1L;
                    c0049OooO00o.f8005OooO0o = jCurrentAnimationTimeMillis;
                    c0049OooO00o.f8008OooO0oo = 0.5f;
                }
                C0049OooO00o c0049OooO00o2 = OooO00o.this.f7985Oooo0o;
                if ((c0049OooO00o2.f8007OooO0oO > 0 && AnimationUtils.currentAnimationTimeMillis() > c0049OooO00o2.f8007OooO0oO + ((long) c0049OooO00o2.f8000OooO)) || !OooO00o.this.OooO0o0()) {
                    OooO00o.this.f7997OoooOoo = false;
                    return;
                }
                OooO00o oooO00o2 = OooO00o.this;
                if (oooO00o2.f7996OoooOoO) {
                    oooO00o2.f7996OoooOoO = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                    oooO00o2.f7987Oooo0oo.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0049OooO00o2.f8005OooO0o == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fOooO00o = c0049OooO00o2.OooO00o(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - c0049OooO00o2.f8005OooO0o;
                c0049OooO00o2.f8005OooO0o = jCurrentAnimationTimeMillis2;
                OooOOO.OooO0O0(((OooOOO0) OooO00o.this).f8015OooooO0, (int) (j * ((fOooO00o * 4.0f) + ((-4.0f) * fOooO00o * fOooO00o)) * c0049OooO00o2.f8004OooO0Oo));
                View view = OooO00o.this.f7987Oooo0oo;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO0(view, this);
            }
        }
    }

    public OooO00o(@NonNull View view) {
        C0049OooO00o c0049OooO00o = new C0049OooO00o();
        this.f7985Oooo0o = c0049OooO00o;
        this.f7986Oooo0oO = new AccelerateInterpolator();
        this.f7990OoooO00 = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
        this.f7989OoooO0 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7992OoooOO0 = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
        this.f7999o000oOoO = new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE};
        this.f7993OoooOOO = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7987Oooo0oo = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f7993OoooOOO;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f7999o000oOoO;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f7991OoooO0O = 1;
        float[] fArr3 = this.f7989OoooO0;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f7990OoooO00;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f7992OoooOO0;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f7988OoooO = f7983Ooooo0o;
        c0049OooO00o.f8001OooO00o = 500;
        c0049OooO00o.f8002OooO0O0 = 500;
    }

    public static float OooO0O0(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    public final float OooO00o(int i, float f, float f2, float f3) {
        float fOooO0O0;
        float interpolation;
        float fOooO0O1 = OooO0O0(this.f7990OoooO00[i] * f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f7989OoooO0[i]);
        float fOooO0OO = OooO0OO(f2 - f, fOooO0O1) - OooO0OO(f, fOooO0O1);
        if (fOooO0OO >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (fOooO0OO > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                interpolation = this.f7986Oooo0oO.getInterpolation(fOooO0OO);
            } else {
                fOooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (fOooO0O0 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            float f4 = this.f7992OoooOO0[i];
            float f5 = this.f7999o000oOoO[i];
            float f6 = this.f7993OoooOOO[i];
            float f7 = f4 * f3;
            return fOooO0O0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? OooO0O0(fOooO0O0 * f7, f5, f6) : -OooO0O0((-fOooO0O0) * f7, f5, f6);
        }
        interpolation = -this.f7986Oooo0oO.getInterpolation(-fOooO0OO);
        fOooO0O0 = OooO0O0(interpolation, -1.0f, 1.0f);
        if (fOooO0O0 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f8 = this.f7992OoooOO0[i];
        float f9 = this.f7999o000oOoO[i];
        float f10 = this.f7993OoooOOO[i];
        float f11 = f8 * f3;
        if (fOooO0O0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
        }
    }

    public final float OooO0OO(float f, float f2) {
        if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        int i = this.f7991OoooO0O;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    return 1.0f - (f / f2);
                }
                if (this.f7997OoooOoo && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return f / (-f2);
        }
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final void OooO0Oo() {
        int i = 0;
        if (this.f7995OoooOo0) {
            this.f7997OoooOoo = false;
            return;
        }
        C0049OooO00o c0049OooO00o = this.f7985Oooo0o;
        Objects.requireNonNull(c0049OooO00o);
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c0049OooO00o.f8006OooO0o0);
        int i3 = c0049OooO00o.f8002OooO0O0;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0049OooO00o.f8000OooO = i;
        c0049OooO00o.f8008OooO0oo = c0049OooO00o.OooO00o(jCurrentAnimationTimeMillis);
        c0049OooO00o.f8007OooO0oO = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    public final boolean OooO0o0() {
        boolean z;
        C0049OooO00o c0049OooO00o = this.f7985Oooo0o;
        float f = c0049OooO00o.f8004OooO0Oo;
        int iAbs = (int) (f / Math.abs(f));
        float f2 = c0049OooO00o.f8003OooO0OO;
        if (iAbs != 0) {
            ListView listView = ((OooOOO0) this).f8015OooooO0;
            int count = listView.getCount();
            if (count == 0) {
                z = false;
            } else {
                int childCount = listView.getChildCount();
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int i = firstVisiblePosition + childCount;
                if (iAbs <= 0 ? iAbs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) : i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.f7998Ooooo00) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                OooO0Oo();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    OooO0Oo();
                }
            }
            return false;
        }
        this.f7996OoooOoO = true;
        this.f7994OoooOOo = false;
        float fOooO00o = OooO00o(0, motionEvent.getX(), view.getWidth(), this.f7987Oooo0oo.getWidth());
        float fOooO00o2 = OooO00o(1, motionEvent.getY(), view.getHeight(), this.f7987Oooo0oo.getHeight());
        C0049OooO00o c0049OooO00o = this.f7985Oooo0o;
        c0049OooO00o.f8003OooO0OO = fOooO00o;
        c0049OooO00o.f8004OooO0Oo = fOooO00o2;
        if (!this.f7997OoooOoo && OooO0o0()) {
            if (this.f7984Oooo == null) {
                this.f7984Oooo = new OooO0O0();
            }
            this.f7997OoooOoo = true;
            this.f7995OoooOo0 = true;
            if (this.f7994OoooOOo || (i = this.f7988OoooO) <= 0) {
                this.f7984Oooo.run();
            } else {
                View view2 = this.f7987Oooo0oo;
                OooO0O0 oooO0O0 = this.f7984Oooo;
                long j = i;
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO(view2, oooO0O0, j);
            }
            this.f7994OoooOOo = true;
        }
        return false;
    }
}
