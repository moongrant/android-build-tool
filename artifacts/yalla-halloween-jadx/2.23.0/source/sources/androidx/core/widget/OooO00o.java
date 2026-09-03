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
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o implements View.OnTouchListener {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final int f5496OooOo00 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f5497OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C0126OooO00o f5498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final View f5499OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AccelerateInterpolator f5500OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0O0 f5501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f5502OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f5503OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f5504OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float[] f5505OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float[] f5506OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float[] f5507OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f5508OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f5509OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f5510OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f5511OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f5512OooOOoo;

    /* JADX INFO: renamed from: androidx.core.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0126OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f5513OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f5514OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5515OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f5516OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f5517OooO0Oo;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f5521OooO0oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f5519OooO0o0 = Long.MIN_VALUE;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f5520OooO0oO = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f5518OooO0o = 0;

        public final float OooO00o(long j) {
            long j2 = this.f5519OooO0o0;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f5520OooO0oO;
            if (j3 < 0 || j < j3) {
                return OooO00o.OooO0O0((j - j2) / this.f5514OooO00o, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f5521OooO0oo;
            return (OooO00o.OooO0O0((j - j3) / this.f5513OooO, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f5510OooOOo) {
                boolean z = oooO00o.f5509OooOOOo;
                C0126OooO00o c0126OooO00o = oooO00o.f5498OooO0Oo;
                if (z) {
                    oooO00o.f5509OooOOOo = false;
                    c0126OooO00o.getClass();
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0126OooO00o.f5519OooO0o0 = jCurrentAnimationTimeMillis;
                    c0126OooO00o.f5520OooO0oO = -1L;
                    c0126OooO00o.f5518OooO0o = jCurrentAnimationTimeMillis;
                    c0126OooO00o.f5521OooO0oo = 0.5f;
                }
                if ((c0126OooO00o.f5520OooO0oO > 0 && AnimationUtils.currentAnimationTimeMillis() > c0126OooO00o.f5520OooO0oO + ((long) c0126OooO00o.f5513OooO)) || !oooO00o.OooO0o0()) {
                    oooO00o.f5510OooOOo = false;
                    return;
                }
                boolean z2 = oooO00o.f5511OooOOo0;
                View view = oooO00o.f5499OooO0o;
                if (z2) {
                    oooO00o.f5511OooOOo0 = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0126OooO00o.f5518OooO0o == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fOooO00o = c0126OooO00o.OooO00o(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - c0126OooO00o.f5518OooO0o;
                c0126OooO00o.f5518OooO0o = jCurrentAnimationTimeMillis2;
                OooOOO0.OooO0O0(((OooOO0O) oooO00o).f5524OooOo0, (int) (j * ((fOooO00o * 4.0f) + ((-4.0f) * fOooO00o * fOooO00o)) * c0126OooO00o.f5517OooO0Oo));
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO0o.OooOOO0(view, this);
            }
        }
    }

    public OooO00o(@NonNull View view) {
        C0126OooO00o c0126OooO00o = new C0126OooO00o();
        this.f5498OooO0Oo = c0126OooO00o;
        this.f5500OooO0o0 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5502OooO0oo = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5497OooO = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5505OooOO0o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5507OooOOO0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5506OooOOO = fArr5;
        this.f5499OooO0o = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f5503OooOO0 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f5504OooOO0O = f5496OooOo00;
        c0126OooO00o.f5514OooO00o = 500;
        c0126OooO00o.f5515OooO0O0 = 500;
    }

    public static float OooO0O0(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float OooO00o(float f, int i, float f2, float f3) {
        float fOooO0O0;
        float interpolation;
        float fOooO0O1 = OooO0O0(this.f5502OooO0oo[i] * f2, 0.0f, this.f5497OooO[i]);
        float fOooO0OO = OooO0OO(f2 - f, fOooO0O1) - OooO0OO(f, fOooO0O1);
        AccelerateInterpolator accelerateInterpolator = this.f5500OooO0o0;
        if (fOooO0OO >= 0.0f) {
            if (fOooO0OO > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fOooO0OO);
            } else {
                fOooO0O0 = 0.0f;
            }
            if (fOooO0O0 == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f5505OooOO0o[i];
            float f5 = this.f5507OooOOO0[i];
            float f6 = this.f5506OooOOO[i];
            float f7 = f4 * f3;
            return fOooO0O0 > 0.0f ? OooO0O0(fOooO0O0 * f7, f5, f6) : -OooO0O0((-fOooO0O0) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fOooO0OO);
        fOooO0O0 = OooO0O0(interpolation, -1.0f, 1.0f);
        if (fOooO0O0 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f5505OooOO0o[i];
        float f9 = this.f5507OooOOO0[i];
        float f10 = this.f5506OooOOO[i];
        float f11 = f8 * f3;
        if (fOooO0O0 > 0.0f) {
        }
    }

    public final float OooO0OO(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f5503OooOO0;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f5510OooOOo && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public final void OooO0Oo() {
        int i = 0;
        if (this.f5509OooOOOo) {
            this.f5510OooOOo = false;
            return;
        }
        C0126OooO00o c0126OooO00o = this.f5498OooO0Oo;
        c0126OooO00o.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c0126OooO00o.f5519OooO0o0);
        int i3 = c0126OooO00o.f5515OooO0O0;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0126OooO00o.f5513OooO = i;
        c0126OooO00o.f5521OooO0oo = c0126OooO00o.OooO00o(jCurrentAnimationTimeMillis);
        c0126OooO00o.f5520OooO0oO = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    public final boolean OooO0o0() {
        boolean z;
        C0126OooO00o c0126OooO00o = this.f5498OooO0Oo;
        float f = c0126OooO00o.f5517OooO0Oo;
        int iAbs = (int) (f / Math.abs(f));
        float f2 = c0126OooO00o.f5516OooO0OO;
        if (iAbs == 0) {
            return false;
        }
        ListView listView = ((OooOO0O) this).f5524OooOo0;
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
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.f5512OooOOoo) {
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
        this.f5511OooOOo0 = true;
        this.f5508OooOOOO = false;
        float x = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f5499OooO0o;
        float fOooO00o = OooO00o(x, 0, width, view2.getWidth());
        float fOooO00o2 = OooO00o(motionEvent.getY(), 1, view.getHeight(), view2.getHeight());
        C0126OooO00o c0126OooO00o = this.f5498OooO0Oo;
        c0126OooO00o.f5516OooO0OO = fOooO00o;
        c0126OooO00o.f5517OooO0Oo = fOooO00o2;
        if (!this.f5510OooOOo && OooO0o0()) {
            if (this.f5501OooO0oO == null) {
                this.f5501OooO0oO = new OooO0O0();
            }
            this.f5510OooOOo = true;
            this.f5509OooOOOo = true;
            if (this.f5508OooOOOO || (i = this.f5504OooOO0O) <= 0) {
                this.f5501OooO0oO.run();
            } else {
                OooO0O0 oooO0O0 = this.f5501OooO0oO;
                long j = i;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooO0o.OooOOO(view2, oooO0O0, j);
            }
            this.f5508OooOOOO = true;
        }
        return false;
    }
}
