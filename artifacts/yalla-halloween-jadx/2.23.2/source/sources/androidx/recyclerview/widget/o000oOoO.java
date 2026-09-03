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
import androidx.core.view.o000OOo0;
import com.google.android.gms.common.ConnectionResult;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class o000oOoO extends RecyclerView.OooOo implements RecyclerView.o0OoOo0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f10846OooOoo = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f10847OooOooO = new int[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f10848OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f10849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f10850OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StateListDrawable f10851OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Drawable f10852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f10853OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f10854OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final StateListDrawable f10855OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f10856OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f10857OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public int f10858OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @VisibleForTesting
    public int f10859OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @VisibleForTesting
    public int f10860OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @VisibleForTesting
    public float f10861OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @VisibleForTesting
    public int f10862OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @VisibleForTesting
    public float f10863OooOOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f10866OooOOoo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ValueAnimator f10872OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f10874OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f10875OooOoo0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f10865OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f10864OooOOo = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f10869OooOo00 = false;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f10868OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f10870OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f10871OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int[] f10867OooOo = new int[2];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int[] f10873OooOoO0 = new int[2];

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o000oOoO o000oooo2 = o000oOoO.this;
            int i = o000oooo2.f10874OooOoOO;
            ValueAnimator valueAnimator = o000oooo2.f10872OooOoO;
            if (i == 1) {
                valueAnimator.cancel();
            } else if (i != 2) {
                return;
            }
            o000oooo2.f10874OooOoOO = 3;
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
            o000oOoO o000oooo2 = o000oOoO.this;
            int iComputeVerticalScrollRange = o000oooo2.f10866OooOOoo.computeVerticalScrollRange();
            int i3 = o000oooo2.f10864OooOOo;
            int i4 = iComputeVerticalScrollRange - i3;
            int i5 = o000oooo2.f10849OooO00o;
            o000oooo2.f10869OooOo00 = i4 > 0 && i3 >= i5;
            int iComputeHorizontalScrollRange = o000oooo2.f10866OooOOoo.computeHorizontalScrollRange();
            int i6 = o000oooo2.f10865OooOOo0;
            boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
            o000oooo2.f10868OooOo0 = z;
            boolean z2 = o000oooo2.f10869OooOo00;
            if (!z2 && !z) {
                if (o000oooo2.f10870OooOo0O != 0) {
                    o000oooo2.OooO0o(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                o000oooo2.f10859OooOO0o = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                o000oooo2.f10858OooOO0O = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (o000oooo2.f10868OooOo0) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i6;
                o000oooo2.f10862OooOOOO = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                o000oooo2.f10860OooOOO = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
            }
            int i7 = o000oooo2.f10870OooOo0O;
            if (i7 == 0 || i7 == 1) {
                o000oooo2.OooO0o(1);
            }
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f10878OooO0Oo = false;

        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f10878OooO0Oo = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f10878OooO0Oo) {
                this.f10878OooO0Oo = false;
                return;
            }
            o000oOoO o000oooo2 = o000oOoO.this;
            if (((Float) o000oooo2.f10872OooOoO.getAnimatedValue()).floatValue() == 0.0f) {
                o000oooo2.f10874OooOoOO = 0;
                o000oooo2.OooO0o(0);
            } else {
                o000oooo2.f10874OooOoOO = 2;
                o000oooo2.f10866OooOOoo.invalidate();
            }
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            o000oOoO o000oooo2 = o000oOoO.this;
            o000oooo2.f10851OooO0OO.setAlpha(iFloatValue);
            o000oooo2.f10852OooO0Oo.setAlpha(iFloatValue);
            o000oooo2.f10866OooOOoo.invalidate();
        }
    }

    public o000oOoO(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10872OooOoO = valueAnimatorOfFloat;
        this.f10874OooOoOO = 0;
        OooO00o oooO00o = new OooO00o();
        this.f10875OooOoo0 = oooO00o;
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f10851OooO0OO = stateListDrawable;
        this.f10852OooO0Oo = drawable;
        this.f10855OooO0oO = stateListDrawable2;
        this.f10856OooO0oo = drawable2;
        this.f10854OooO0o0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10853OooO0o = Math.max(i, drawable.getIntrinsicWidth());
        this.f10848OooO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10857OooOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10849OooO00o = i2;
        this.f10850OooO0O0 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new OooO0OO());
        valueAnimatorOfFloat.addUpdateListener(new OooO0o());
        RecyclerView recyclerView2 = this.f10866OooOOoo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f10866OooOOoo.removeOnItemTouchListener(this);
            this.f10866OooOOoo.removeOnScrollListener(oooO0O0);
            this.f10866OooOOoo.removeCallbacks(oooO00o);
        }
        this.f10866OooOOoo = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f10866OooOOoo.addOnItemTouchListener(this);
            this.f10866OooOOoo.addOnScrollListener(oooO0O0);
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
        if (this.f10870OooOo0O == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zOooO0o0 = OooO0o0(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0Oo = OooO0Oo(motionEvent.getX(), motionEvent.getY());
            if (zOooO0o0 || zOooO0Oo) {
                if (zOooO0Oo) {
                    this.f10871OooOo0o = 1;
                    this.f10863OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0o0) {
                    this.f10871OooOo0o = 2;
                    this.f10861OooOOO0 = (int) motionEvent.getY();
                }
                OooO0o(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f10870OooOo0O == 2) {
            this.f10861OooOOO0 = 0.0f;
            this.f10863OooOOOo = 0.0f;
            OooO0o(1);
            this.f10871OooOo0o = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f10870OooOo0O == 2) {
            OooO0oO();
            int i3 = this.f10871OooOo0o;
            int i4 = this.f10850OooO0O0;
            if (i3 == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f10873OooOoO0;
                iArr[0] = i4;
                int i5 = this.f10865OooOOo0 - i4;
                iArr[1] = i5;
                float fMax = Math.max(i4, Math.min(i5, x));
                if (Math.abs(this.f10862OooOOOO - fMax) >= 2.0f) {
                    float f = this.f10863OooOOOo;
                    int iComputeHorizontalScrollRange = this.f10866OooOOoo.computeHorizontalScrollRange();
                    int iComputeHorizontalScrollOffset = this.f10866OooOOoo.computeHorizontalScrollOffset();
                    int i6 = this.f10865OooOOo0;
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
                        this.f10866OooOOoo.scrollBy(i2, 0);
                    }
                    this.f10863OooOOOo = fMax;
                }
            }
            if (this.f10871OooOo0o == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f10867OooOo;
                iArr2[0] = i4;
                int i10 = this.f10864OooOOo - i4;
                iArr2[1] = i10;
                float fMax2 = Math.max(i4, Math.min(i10, y));
                if (Math.abs(this.f10859OooOO0o - fMax2) < 2.0f) {
                    return;
                }
                float f2 = this.f10861OooOOO0;
                int iComputeVerticalScrollRange = this.f10866OooOOoo.computeVerticalScrollRange();
                int iComputeVerticalScrollOffset = this.f10866OooOOoo.computeVerticalScrollOffset();
                int i11 = this.f10864OooOOo;
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
                    this.f10866OooOOoo.scrollBy(0, i);
                }
                this.f10861OooOOO0 = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final boolean OooO0OO(@NonNull MotionEvent motionEvent) {
        int i = this.f10870OooOo0O;
        if (i == 1) {
            boolean zOooO0o0 = OooO0o0(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0Oo = OooO0Oo(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zOooO0o0 || zOooO0Oo)) {
                if (zOooO0Oo) {
                    this.f10871OooOo0o = 1;
                    this.f10863OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0o0) {
                    this.f10871OooOo0o = 2;
                    this.f10861OooOOO0 = (int) motionEvent.getY();
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
        if (f2 >= this.f10864OooOOo - this.f10848OooO) {
            int i = this.f10862OooOOOO;
            int i2 = this.f10860OooOOO;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0o(int i) {
        OooO00o oooO00o = this.f10875OooOoo0;
        StateListDrawable stateListDrawable = this.f10851OooO0OO;
        if (i == 2 && this.f10870OooOo0O != 2) {
            stateListDrawable.setState(f10846OooOoo);
            this.f10866OooOOoo.removeCallbacks(oooO00o);
        }
        if (i == 0) {
            this.f10866OooOOoo.invalidate();
        } else {
            OooO0oO();
        }
        if (this.f10870OooOo0O == 2 && i != 2) {
            stateListDrawable.setState(f10847OooOooO);
            this.f10866OooOOoo.removeCallbacks(oooO00o);
            this.f10866OooOOoo.postDelayed(oooO00o, 1200);
        } else if (i == 1) {
            this.f10866OooOOoo.removeCallbacks(oooO00o);
            this.f10866OooOOoo.postDelayed(oooO00o, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f10870OooOo0O = i;
    }

    @VisibleForTesting
    public final boolean OooO0o0(float f, float f2) {
        RecyclerView recyclerView = this.f10866OooOOoo;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        boolean z = ViewCompat.OooO.OooO0Oo(recyclerView) == 1;
        int i = this.f10854OooO0o0;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f10865OooOOo0 - i) {
            return false;
        }
        int i2 = this.f10859OooOO0o;
        int i3 = this.f10858OooOO0O / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void OooO0oO() {
        int i = this.f10874OooOoOO;
        ValueAnimator valueAnimator = this.f10872OooOoO;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f10874OooOoOO = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.f10865OooOOo0 != this.f10866OooOOoo.getWidth() || this.f10864OooOOo != this.f10866OooOOoo.getHeight()) {
            this.f10865OooOOo0 = this.f10866OooOOoo.getWidth();
            this.f10864OooOOo = this.f10866OooOOoo.getHeight();
            OooO0o(0);
            return;
        }
        if (this.f10874OooOoOO != 0) {
            if (this.f10869OooOo00) {
                int i = this.f10865OooOOo0;
                int i2 = this.f10854OooO0o0;
                int i3 = i - i2;
                int i4 = this.f10859OooOO0o;
                int i5 = this.f10858OooOO0O;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.f10851OooO0OO;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f10864OooOOo;
                int i8 = this.f10853OooO0o;
                Drawable drawable = this.f10852OooO0Oo;
                drawable.setBounds(0, 0, i8, i7);
                RecyclerView recyclerView2 = this.f10866OooOOoo;
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
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
            if (this.f10868OooOo0) {
                int i9 = this.f10864OooOOo;
                int i10 = this.f10848OooO;
                int i11 = i9 - i10;
                int i12 = this.f10862OooOOOO;
                int i13 = this.f10860OooOOO;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.f10855OooO0oO;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.f10865OooOOo0;
                int i16 = this.f10857OooOO0;
                Drawable drawable2 = this.f10856OooO0oo;
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
