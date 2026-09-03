package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class Oooo0 extends RecyclerView.OooOo implements RecyclerView.o0OoOo0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f7586OooOoo = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f7587OooOooO = new int[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f7588OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f7589OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f7590OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StateListDrawable f7591OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Drawable f7592OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f7593OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f7594OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final StateListDrawable f7595OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f7596OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f7597OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public int f7598OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @VisibleForTesting
    public int f7599OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @VisibleForTesting
    public int f7600OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @VisibleForTesting
    public float f7601OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @VisibleForTesting
    public int f7602OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @VisibleForTesting
    public float f7603OooOOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f7606OooOOoo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ValueAnimator f7612OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f7614OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f7615OooOoo0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f7605OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f7604OooOOo = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f7609OooOo00 = false;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f7608OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f7610OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f7611OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int[] f7607OooOo = new int[2];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int[] f7613OooOoO0 = new int[2];

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Oooo0 oooo0 = Oooo0.this;
            int i = oooo0.f7614OooOoOO;
            ValueAnimator valueAnimator = oooo0.f7612OooOoO;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            oooo0.f7614OooOoOO = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    public class OooO0O0 extends RecyclerView.o00O0O {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            Oooo0 oooo0 = Oooo0.this;
            int iComputeVerticalScrollRange = oooo0.f7606OooOOoo.computeVerticalScrollRange();
            int i3 = oooo0.f7604OooOOo;
            int i4 = iComputeVerticalScrollRange - i3;
            int i5 = oooo0.f7589OooO00o;
            oooo0.f7609OooOo00 = i4 > 0 && i3 >= i5;
            int iComputeHorizontalScrollRange = oooo0.f7606OooOOoo.computeHorizontalScrollRange();
            int i6 = oooo0.f7605OooOOo0;
            boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
            oooo0.f7608OooOo0 = z;
            boolean z2 = oooo0.f7609OooOo00;
            if (!z2 && !z) {
                if (oooo0.f7610OooOo0O != 0) {
                    oooo0.OooO0o(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                oooo0.f7599OooOO0o = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                oooo0.f7598OooOO0O = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (oooo0.f7608OooOo0) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i6;
                oooo0.f7602OooOOOO = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                oooo0.f7600OooOOO = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
            }
            int i7 = oooo0.f7610OooOo0O;
            if (i7 == 0 || i7 == 1) {
                oooo0.OooO0o(1);
            }
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7618OooO0Oo = false;

        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f7618OooO0Oo = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f7618OooO0Oo) {
                this.f7618OooO0Oo = false;
                return;
            }
            Oooo0 oooo0 = Oooo0.this;
            if (((Float) oooo0.f7612OooOoO.getAnimatedValue()).floatValue() == 0.0f) {
                oooo0.f7614OooOoOO = 0;
                oooo0.OooO0o(0);
            } else {
                oooo0.f7614OooOoOO = 2;
                oooo0.f7606OooOOoo.invalidate();
            }
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            Oooo0 oooo0 = Oooo0.this;
            oooo0.f7591OooO0OO.setAlpha(iFloatValue);
            oooo0.f7592OooO0Oo.setAlpha(iFloatValue);
            oooo0.f7606OooOOoo.invalidate();
        }
    }

    public Oooo0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7612OooOoO = valueAnimatorOfFloat;
        this.f7614OooOoOO = 0;
        OooO00o oooO00o = new OooO00o();
        this.f7615OooOoo0 = oooO00o;
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f7591OooO0OO = stateListDrawable;
        this.f7592OooO0Oo = drawable;
        this.f7595OooO0oO = stateListDrawable2;
        this.f7596OooO0oo = drawable2;
        this.f7594OooO0o0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f7593OooO0o = Math.max(i, drawable.getIntrinsicWidth());
        this.f7588OooO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f7597OooOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f7589OooO00o = i2;
        this.f7590OooO0O0 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new OooO0OO());
        valueAnimatorOfFloat.addUpdateListener(new OooO0o());
        RecyclerView recyclerView2 = this.f7606OooOOoo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f7606OooOOoo.removeOnItemTouchListener(this);
            this.f7606OooOOoo.removeOnScrollListener(oooO0O0);
            this.f7606OooOOoo.removeCallbacks(oooO00o);
        }
        this.f7606OooOOoo = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f7606OooOOoo.addOnItemTouchListener(this);
            this.f7606OooOOoo.addOnScrollListener(oooO0O0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final void OooO00o(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final void OooO0O0(@NonNull MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.f7610OooOo0O == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zOooO0o0 = OooO0o0(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0Oo = OooO0Oo(motionEvent.getX(), motionEvent.getY());
            if (zOooO0o0 || zOooO0Oo) {
                if (zOooO0Oo) {
                    this.f7611OooOo0o = 1;
                    this.f7603OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0o0) {
                    this.f7611OooOo0o = 2;
                    this.f7601OooOOO0 = (int) motionEvent.getY();
                }
                OooO0o(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f7610OooOo0O == 2) {
            this.f7601OooOOO0 = 0.0f;
            this.f7603OooOOOo = 0.0f;
            OooO0o(1);
            this.f7611OooOo0o = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f7610OooOo0O == 2) {
            OooO0oO();
            int i3 = this.f7611OooOo0o;
            int i4 = this.f7590OooO0O0;
            if (i3 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f7613OooOoO0;
                iArr[0] = i4;
                int i5 = this.f7605OooOOo0 - i4;
                iArr[1] = i5;
                float fMax = Math.max(i4, Math.min(i5, x));
                if (Math.abs(this.f7602OooOOOO - fMax) >= 2.0f) {
                    float f = this.f7603OooOOOo;
                    int iComputeHorizontalScrollRange = this.f7606OooOOoo.computeHorizontalScrollRange();
                    int iComputeHorizontalScrollOffset = this.f7606OooOOoo.computeHorizontalScrollOffset();
                    int i6 = this.f7605OooOOo0;
                    int i7 = iArr[1] - iArr[0];
                    if (i7 == 0) {
                        i2 = 0;
                    } else {
                        int i8 = iComputeHorizontalScrollRange - i6;
                        i2 = (int) (((fMax - f) / i7) * i8);
                        int i9 = iComputeHorizontalScrollOffset + i2;
                        if (i9 >= i8 || i9 < 0) {
                            i2 = 0;
                        }
                    }
                    if (i2 != 0) {
                        this.f7606OooOOoo.scrollBy(i2, 0);
                    }
                    this.f7603OooOOOo = fMax;
                }
            }
            if (this.f7611OooOo0o == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f7607OooOo;
                iArr2[0] = i4;
                int i10 = this.f7604OooOOo - i4;
                iArr2[1] = i10;
                float fMax2 = Math.max(i4, Math.min(i10, y));
                if (Math.abs(this.f7599OooOO0o - fMax2) < 2.0f) {
                    return;
                }
                float f2 = this.f7601OooOOO0;
                int iComputeVerticalScrollRange = this.f7606OooOOoo.computeVerticalScrollRange();
                int iComputeVerticalScrollOffset = this.f7606OooOOoo.computeVerticalScrollOffset();
                int i11 = this.f7604OooOOo;
                int i12 = iArr2[1] - iArr2[0];
                if (i12 == 0) {
                    i = 0;
                } else {
                    int i13 = iComputeVerticalScrollRange - i11;
                    i = (int) (((fMax2 - f2) / i12) * i13);
                    int i14 = iComputeVerticalScrollOffset + i;
                    if (i14 >= i13 || i14 < 0) {
                        i = 0;
                    }
                }
                if (i != 0) {
                    this.f7606OooOOoo.scrollBy(0, i);
                }
                this.f7601OooOOO0 = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final boolean OooO0OO(@NonNull MotionEvent motionEvent) {
        int i = this.f7610OooOo0O;
        if (i == 1) {
            boolean zOooO0o0 = OooO0o0(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0Oo = OooO0Oo(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zOooO0o0 || zOooO0Oo)) {
                if (zOooO0Oo) {
                    this.f7611OooOo0o = 1;
                    this.f7603OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0o0) {
                    this.f7611OooOo0o = 2;
                    this.f7601OooOOO0 = (int) motionEvent.getY();
                }
                OooO0o(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public final boolean OooO0Oo(float f, float f2) {
        if (f2 >= this.f7604OooOOo - this.f7588OooO) {
            int i = this.f7602OooOOOO;
            int i2 = this.f7600OooOOO;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0o(int i) {
        OooO00o oooO00o = this.f7615OooOoo0;
        StateListDrawable stateListDrawable = this.f7591OooO0OO;
        if (i == 2 && this.f7610OooOo0O != 2) {
            stateListDrawable.setState(f7586OooOoo);
            this.f7606OooOOoo.removeCallbacks(oooO00o);
        }
        if (i == 0) {
            this.f7606OooOOoo.invalidate();
        } else {
            OooO0oO();
        }
        if (this.f7610OooOo0O == 2 && i != 2) {
            stateListDrawable.setState(f7587OooOooO);
            this.f7606OooOOoo.removeCallbacks(oooO00o);
            this.f7606OooOOoo.postDelayed(oooO00o, 1200);
        } else if (i == 1) {
            this.f7606OooOOoo.removeCallbacks(oooO00o);
            this.f7606OooOOoo.postDelayed(oooO00o, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f7610OooOo0O = i;
    }

    @VisibleForTesting
    public final boolean OooO0o0(float f, float f2) {
        RecyclerView recyclerView = this.f7606OooOOoo;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(recyclerView) == 1;
        int i = this.f7594OooO0o0;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f7605OooOOo0 - i) {
            return false;
        }
        int i2 = this.f7599OooOO0o;
        int i3 = this.f7598OooOO0O / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void OooO0oO() {
        int i = this.f7614OooOoOO;
        ValueAnimator valueAnimator = this.f7612OooOoO;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7614OooOoOO = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.f7605OooOOo0 != this.f7606OooOOoo.getWidth() || this.f7604OooOOo != this.f7606OooOOoo.getHeight()) {
            this.f7605OooOOo0 = this.f7606OooOOoo.getWidth();
            this.f7604OooOOo = this.f7606OooOOoo.getHeight();
            OooO0o(0);
            return;
        }
        if (this.f7614OooOoOO != 0) {
            if (this.f7609OooOo00) {
                int i = this.f7605OooOOo0;
                int i2 = this.f7594OooO0o0;
                int i3 = i - i2;
                int i4 = this.f7599OooOO0o;
                int i5 = this.f7598OooOO0O;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.f7591OooO0OO;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f7604OooOOo;
                int i8 = this.f7593OooO0o;
                Drawable drawable = this.f7592OooO0Oo;
                drawable.setBounds(0, 0, i8, i7);
                RecyclerView recyclerView2 = this.f7606OooOOoo;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                if (ViewCompat.OooO.OooO0Oo(recyclerView2) == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f7608OooOo0) {
                int i9 = this.f7604OooOOo;
                int i10 = this.f7588OooO;
                int i11 = i9 - i10;
                int i12 = this.f7602OooOOOO;
                int i13 = this.f7600OooOOO;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.f7595OooO0oO;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.f7605OooOOo0;
                int i16 = this.f7597OooOO0;
                Drawable drawable2 = this.f7596OooO0oo;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }
}
