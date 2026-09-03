package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f9513OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f9514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f9515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f9516OooO0o0;

    public interface OooO00o {
    }

    public final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f9517OooO0Oo;

        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f9517OooO0Oo = false;
            int i = AspectRatioFrameLayout.f9513OooO0oO;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f9515OooO0o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f9516OooO0o0 <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f9516OooO0o0 / (f3 / f4)) - 1.0f;
        float fAbs = Math.abs(f5);
        OooO0O0 oooO0O0 = this.f9514OooO0Oo;
        if (fAbs <= 0.01f) {
            if (oooO0O0.f9517OooO0Oo) {
                return;
            }
            oooO0O0.f9517OooO0Oo = true;
            AspectRatioFrameLayout.this.post(oooO0O0);
            return;
        }
        int i3 = this.f9515OooO0o;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f9516OooO0o0;
                } else if (i3 == 4) {
                    if (f5 > 0.0f) {
                        f = this.f9516OooO0o0;
                    } else {
                        f2 = this.f9516OooO0o0;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f9516OooO0o0;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f5 > 0.0f) {
            f2 = this.f9516OooO0o0;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f9516OooO0o0;
            measuredWidth = (int) (f4 * f);
        }
        if (!oooO0O0.f9517OooO0Oo) {
            oooO0O0.f9517OooO0Oo = true;
            AspectRatioFrameLayout.this.post(oooO0O0);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(measuredHeight, Pow2.MAX_POW2));
    }

    public void setAspectRatio(float f) {
        if (this.f9516OooO0o0 != f) {
            this.f9516OooO0o0 = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable OooO00o oooO00o) {
    }

    public void setResizeMode(int i) {
        if (this.f9515OooO0o != i) {
            this.f9515OooO0o = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9515OooO0o = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o0000O0.AspectRatioFrameLayout, 0, 0);
            try {
                this.f9515OooO0o = typedArrayObtainStyledAttributes.getInt(o0000O0.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9514OooO0Oo = new OooO0O0();
    }
}
