package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.OooO;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Path f4846OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f4847OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f4848OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ViewOutlineProvider f4849OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public RectF f4850OooOO0O;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            int width = motionButton.getWidth();
            int height = motionButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionButton.f4847OooO0oO) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            MotionButton motionButton = MotionButton.this;
            outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.f4848OooO0oo);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f4847OooO0oO = 0.0f;
        this.f4848OooO0oo = Float.NaN;
        OooO00o(context, null);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == OooO.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f4848OooO0oo;
    }

    public float getRoundPercent() {
        return this.f4847OooO0oO;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f4848OooO0oo = f;
            float f2 = this.f4847OooO0oO;
            this.f4847OooO0oO = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f4848OooO0oo != f;
        this.f4848OooO0oo = f;
        if (f != 0.0f) {
            if (this.f4846OooO == null) {
                this.f4846OooO = new Path();
            }
            if (this.f4850OooOO0O == null) {
                this.f4850OooOO0O = new RectF();
            }
            if (this.f4849OooOO0 == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f4849OooOO0 = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f4850OooOO0O.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f4846OooO.reset();
            Path path = this.f4846OooO;
            RectF rectF = this.f4850OooOO0O;
            float f3 = this.f4848OooO0oo;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.f4847OooO0oO != f;
        this.f4847OooO0oO = f;
        if (f != 0.0f) {
            if (this.f4846OooO == null) {
                this.f4846OooO = new Path();
            }
            if (this.f4850OooOO0O == null) {
                this.f4850OooOO0O = new RectF();
            }
            if (this.f4849OooOO0 == null) {
                OooO00o oooO00o = new OooO00o();
                this.f4849OooOO0 = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f4847OooO0oO) / 2.0f;
            this.f4850OooOO0O.set(0.0f, 0.0f, width, height);
            this.f4846OooO.reset();
            this.f4846OooO.addRoundRect(this.f4850OooOO0O, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4847OooO0oO = 0.0f;
        this.f4848OooO0oo = Float.NaN;
        OooO00o(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4847OooO0oO = 0.0f;
        this.f4848OooO0oo = Float.NaN;
        OooO00o(context, attributeSet);
    }
}
