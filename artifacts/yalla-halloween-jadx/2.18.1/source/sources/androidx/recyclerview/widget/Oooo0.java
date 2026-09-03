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
import com.google.android.gms.common.ConnectionResult;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class Oooo0 extends RecyclerView.OooOo implements RecyclerView.o0OoOo0 {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f8968OooOooO = {R.attr.state_pressed};

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f8969OooOooo = new int[0];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f8970OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8971OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8972OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StateListDrawable f8973OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Drawable f8974OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f8975OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f8976OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final StateListDrawable f8977OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Drawable f8978OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f8979OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @VisibleForTesting
    public int f8980OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @VisibleForTesting
    public int f8981OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @VisibleForTesting
    public int f8982OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @VisibleForTesting
    public float f8983OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @VisibleForTesting
    public int f8984OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @VisibleForTesting
    public float f8985OooOOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f8988OooOOoo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ValueAnimator f8994OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f8996OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO0O0 f8997OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o f8998OooOoo0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8987OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f8986OooOOo = 0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f8991OooOo00 = false;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f8990OooOo0 = false;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f8992OooOo0O = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f8993OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int[] f8989OooOo = new int[2];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int[] f8995OooOoO0 = new int[2];

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Oooo0 oooo0 = Oooo0.this;
            int i = oooo0.f8996OooOoOO;
            if (i == 1) {
                oooo0.f8994OooOoO.cancel();
            } else if (i != 2) {
                return;
            }
            oooo0.f8996OooOoOO = 3;
            ValueAnimator valueAnimator = oooo0.f8994OooOoO;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            oooo0.f8994OooOoO.setDuration(500);
            oooo0.f8994OooOoO.start();
        }
    }

    public class OooO0O0 extends RecyclerView.o00O0O {
        public OooO0O0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Oooo0 oooo0 = Oooo0.this;
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int iComputeVerticalScrollRange = oooo0.f8988OooOOoo.computeVerticalScrollRange();
            int i3 = oooo0.f8986OooOOo;
            oooo0.f8991OooOo00 = iComputeVerticalScrollRange - i3 > 0 && i3 >= oooo0.f8971OooO00o;
            int iComputeHorizontalScrollRange = oooo0.f8988OooOOoo.computeHorizontalScrollRange();
            int i4 = oooo0.f8987OooOOo0;
            boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= oooo0.f8971OooO00o;
            oooo0.f8990OooOo0 = z;
            boolean z2 = oooo0.f8991OooOo00;
            if (!z2 && !z) {
                if (oooo0.f8992OooOo0O != 0) {
                    oooo0.OooO(0);
                    return;
                }
                return;
            }
            if (z2) {
                float f = i3;
                oooo0.f8981OooOO0o = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                oooo0.f8980OooOO0O = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
            }
            if (oooo0.f8990OooOo0) {
                float f2 = iComputeHorizontalScrollOffset;
                float f3 = i4;
                oooo0.f8984OooOOOO = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                oooo0.f8982OooOOO = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
            }
            int i5 = oooo0.f8992OooOo0O;
            if (i5 == 0 || i5 == 1) {
                oooo0.OooO(1);
            }
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f9001Oooo0o = false;

        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f9001Oooo0o = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f9001Oooo0o) {
                this.f9001Oooo0o = false;
                return;
            }
            if (((Float) Oooo0.this.f8994OooOoO.getAnimatedValue()).floatValue() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                Oooo0 oooo0 = Oooo0.this;
                oooo0.f8996OooOoOO = 0;
                oooo0.OooO(0);
            } else {
                Oooo0 oooo1 = Oooo0.this;
                oooo1.f8996OooOoOO = 2;
                oooo1.OooO0oO();
            }
        }
    }

    public class OooO0o implements ValueAnimator.AnimatorUpdateListener {
        public OooO0o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            Oooo0.this.f8973OooO0OO.setAlpha(iFloatValue);
            Oooo0.this.f8974OooO0Oo.setAlpha(iFloatValue);
            Oooo0.this.OooO0oO();
        }
    }

    public Oooo0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        this.f8994OooOoO = valueAnimatorOfFloat;
        this.f8996OooOoOO = 0;
        this.f8998OooOoo0 = new OooO00o();
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f8997OooOoo = oooO0O0;
        this.f8973OooO0OO = stateListDrawable;
        this.f8974OooO0Oo = drawable;
        this.f8977OooO0oO = stateListDrawable2;
        this.f8978OooO0oo = drawable2;
        this.f8976OooO0o0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f8975OooO0o = Math.max(i, drawable.getIntrinsicWidth());
        this.f8970OooO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f8979OooOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f8971OooO00o = i2;
        this.f8972OooO0O0 = i3;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        valueAnimatorOfFloat.addListener(new OooO0OO());
        valueAnimatorOfFloat.addUpdateListener(new OooO0o());
        RecyclerView recyclerView2 = this.f8988OooOOoo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f8988OooOOoo.removeOnItemTouchListener(this);
            this.f8988OooOOoo.removeOnScrollListener(oooO0O0);
            OooO0Oo();
        }
        this.f8988OooOOoo = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f8988OooOOoo.addOnItemTouchListener(this);
            this.f8988OooOOoo.addOnScrollListener(oooO0O0);
        }
    }

    public final void OooO(int i) {
        if (i == 2 && this.f8992OooOo0O != 2) {
            this.f8973OooO0OO.setState(f8968OooOooO);
            OooO0Oo();
        }
        if (i == 0) {
            OooO0oO();
        } else {
            OooOO0();
        }
        if (this.f8992OooOo0O == 2 && i != 2) {
            this.f8973OooO0OO.setState(f8969OooOooo);
            OooO0Oo();
            this.f8988OooOOoo.postDelayed(this.f8998OooOoo0, 1200);
        } else if (i == 1) {
            OooO0Oo();
            this.f8988OooOOoo.postDelayed(this.f8998OooOoo0, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f8992OooOo0O = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final void OooO00o(@NonNull MotionEvent motionEvent) {
        if (this.f8992OooOo0O == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zOooO0o = OooO0o(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0o0 = OooO0o0(motionEvent.getX(), motionEvent.getY());
            if (zOooO0o || zOooO0o0) {
                if (zOooO0o0) {
                    this.f8993OooOo0o = 1;
                    this.f8985OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0o) {
                    this.f8993OooOo0o = 2;
                    this.f8983OooOOO0 = (int) motionEvent.getY();
                }
                OooO(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f8992OooOo0O == 2) {
            this.f8983OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f8985OooOOOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            OooO(1);
            this.f8993OooOo0o = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f8992OooOo0O == 2) {
            OooOO0();
            if (this.f8993OooOo0o == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f8995OooOoO0;
                int i = this.f8972OooO0O0;
                iArr[0] = i;
                iArr[1] = this.f8987OooOOo0 - i;
                float fMax = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.f8984OooOOOO - fMax) >= 2.0f) {
                    int iOooO0oo = OooO0oo(this.f8985OooOOOo, fMax, iArr, this.f8988OooOOoo.computeHorizontalScrollRange(), this.f8988OooOOoo.computeHorizontalScrollOffset(), this.f8987OooOOo0);
                    if (iOooO0oo != 0) {
                        this.f8988OooOOoo.scrollBy(iOooO0oo, 0);
                    }
                    this.f8985OooOOOo = fMax;
                }
            }
            if (this.f8993OooOo0o == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f8989OooOo;
                int i2 = this.f8972OooO0O0;
                iArr2[0] = i2;
                iArr2[1] = this.f8986OooOOo - i2;
                float fMax2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
                if (Math.abs(this.f8981OooOO0o - fMax2) < 2.0f) {
                    return;
                }
                int iOooO0oo2 = OooO0oo(this.f8983OooOOO0, fMax2, iArr2, this.f8988OooOOoo.computeVerticalScrollRange(), this.f8988OooOOoo.computeVerticalScrollOffset(), this.f8986OooOOo);
                if (iOooO0oo2 != 0) {
                    this.f8988OooOOoo.scrollBy(0, iOooO0oo2);
                }
                this.f8983OooOOO0 = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final boolean OooO0O0(@NonNull MotionEvent motionEvent) {
        int i = this.f8992OooOo0O;
        if (i == 1) {
            boolean zOooO0o = OooO0o(motionEvent.getX(), motionEvent.getY());
            boolean zOooO0o0 = OooO0o0(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (zOooO0o || zOooO0o0)) {
                if (zOooO0o0) {
                    this.f8993OooOo0o = 1;
                    this.f8985OooOOOo = (int) motionEvent.getX();
                } else if (zOooO0o) {
                    this.f8993OooOo0o = 2;
                    this.f8983OooOOO0 = (int) motionEvent.getY();
                }
                OooO(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o0OoOo0
    public final void OooO0OO(boolean z) {
    }

    public final void OooO0Oo() {
        this.f8988OooOOoo.removeCallbacks(this.f8998OooOoo0);
    }

    @VisibleForTesting
    public final boolean OooO0o(float f, float f2) {
        RecyclerView recyclerView = this.f8988OooOOoo;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO.OooO0Oo(recyclerView) == 1) {
            if (f > this.f8976OooO0o0) {
                return false;
            }
        } else if (f < this.f8987OooOOo0 - this.f8976OooO0o0) {
            return false;
        }
        int i = this.f8981OooOO0o;
        int i2 = this.f8980OooOO0O;
        return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) ((i2 / 2) + i));
    }

    @VisibleForTesting
    public final boolean OooO0o0(float f, float f2) {
        if (f2 >= this.f8986OooOOo - this.f8970OooO) {
            int i = this.f8984OooOOOO;
            int i2 = this.f8982OooOOO;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oO() {
        this.f8988OooOOoo.invalidate();
    }

    public final int OooO0oo(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public final void OooOO0() {
        int i = this.f8996OooOoOO;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f8994OooOoO.cancel();
            }
        }
        this.f8996OooOoOO = 1;
        ValueAnimator valueAnimator = this.f8994OooOoO;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f8994OooOoO.setDuration(500L);
        this.f8994OooOoO.setStartDelay(0L);
        this.f8994OooOoO.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        if (this.f8987OooOOo0 != this.f8988OooOOoo.getWidth() || this.f8986OooOOo != this.f8988OooOOoo.getHeight()) {
            this.f8987OooOOo0 = this.f8988OooOOoo.getWidth();
            this.f8986OooOOo = this.f8988OooOOoo.getHeight();
            OooO(0);
            return;
        }
        if (this.f8996OooOoOO != 0) {
            if (this.f8991OooOo00) {
                int i = this.f8987OooOOo0;
                int i2 = this.f8976OooO0o0;
                int i3 = i - i2;
                int i4 = this.f8981OooOO0o;
                int i5 = this.f8980OooOO0O;
                int i6 = i4 - (i5 / 2);
                this.f8973OooO0OO.setBounds(0, 0, i2, i5);
                this.f8974OooO0Oo.setBounds(0, 0, this.f8975OooO0o, this.f8986OooOOo);
                RecyclerView recyclerView2 = this.f8988OooOOoo;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooO.OooO0Oo(recyclerView2) == 1) {
                    this.f8974OooO0Oo.draw(canvas);
                    canvas.translate(this.f8976OooO0o0, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f8973OooO0OO.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.f8976OooO0o0, -i6);
                } else {
                    canvas.translate(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    this.f8974OooO0Oo.draw(canvas);
                    canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i6);
                    this.f8973OooO0OO.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f8990OooOo0) {
                int i7 = this.f8986OooOOo;
                int i8 = this.f8970OooO;
                int i9 = i7 - i8;
                int i10 = this.f8984OooOOOO;
                int i11 = this.f8982OooOOO;
                int i12 = i10 - (i11 / 2);
                this.f8977OooO0oO.setBounds(0, 0, i11, i8);
                this.f8978OooO0oo.setBounds(0, 0, this.f8987OooOOo0, this.f8979OooOO0);
                canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i9);
                this.f8978OooO0oo.draw(canvas);
                canvas.translate(i12, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                this.f8977OooO0oO.draw(canvas);
                canvas.translate(-i12, -i9);
            }
        }
    }
}
