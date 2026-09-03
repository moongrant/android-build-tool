package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.OooO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<View> f4515OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public MotionLayout f4516OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f4517OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4518OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4519OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f4520OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f4521OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f4522OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4523OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f4524OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f4525OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f4526OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f4527OooOoo0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Carousel carousel = Carousel.this;
            carousel.f4516OooOOo.setProgress(0.0f);
            carousel.getClass();
            carousel.getClass();
            int i = carousel.f4517OooOOo0;
            throw null;
        }
    }

    public interface OooO0O0 {
    }

    public Carousel(Context context) {
        super(context);
        this.f4515OooOOOo = new ArrayList<>();
        this.f4517OooOOo0 = 0;
        this.f4518OooOOoo = -1;
        this.f4521OooOo00 = false;
        this.f4520OooOo0 = -1;
        this.f4522OooOo0O = -1;
        this.f4523OooOo0o = -1;
        this.f4519OooOo = -1;
        this.f4525OooOoO0 = 0.9f;
        this.f4524OooOoO = 4;
        this.f4526OooOoOO = 1;
        this.f4527OooOoo0 = 2.0f;
        new OooO00o();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO00o(int i) {
        int i2 = this.f4517OooOOo0;
        if (i == this.f4519OooOo) {
            this.f4517OooOOo0 = i2 + 1;
        } else if (i == this.f4523OooOo0o) {
            this.f4517OooOOo0 = i2 - 1;
        }
        if (!this.f4521OooOo00) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO0OO() {
    }

    public final void OooOo0O(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.Carousel_carousel_firstView) {
                    this.f4518OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4518OooOOoo);
                } else if (index == OooO.Carousel_carousel_backwardTransition) {
                    this.f4520OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4520OooOo0);
                } else if (index == OooO.Carousel_carousel_forwardTransition) {
                    this.f4522OooOo0O = typedArrayObtainStyledAttributes.getResourceId(index, this.f4522OooOo0O);
                } else if (index == OooO.Carousel_carousel_emptyViewsBehavior) {
                    this.f4524OooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f4524OooOoO);
                } else if (index == OooO.Carousel_carousel_previousState) {
                    this.f4523OooOo0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f4523OooOo0o);
                } else if (index == OooO.Carousel_carousel_nextState) {
                    this.f4519OooOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4519OooOo);
                } else if (index == OooO.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f4525OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4525OooOoO0);
                } else if (index == OooO.Carousel_carousel_touchUpMode) {
                    this.f4526OooOoOO = typedArrayObtainStyledAttributes.getInt(index, this.f4526OooOoOO);
                } else if (index == OooO.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f4527OooOoo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4527OooOoo0);
                } else if (index == OooO.Carousel_carousel_infinite) {
                    this.f4521OooOo00 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4521OooOo00);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f4517OooOOo0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi(api = 17)
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f4917OooO0o0; i++) {
                this.f4515OooOOOo.add(motionLayout.getViewById(this.f4915OooO0Oo[i]));
            }
            this.f4516OooOOo = motionLayout;
            if (this.f4526OooOoOO == 2) {
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOO0 = motionLayout.OooOOO0(this.f4522OooOo0O);
                if (oooO0O0OooOOO0 != null && (oooO0O1 = oooO0O0OooOOO0.f4704OooOO0o) != null) {
                    oooO0O1.f4719OooO0OO = 5;
                }
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOO1 = this.f4516OooOOo.OooOOO0(this.f4520OooOo0);
                if (oooO0O0OooOOO1 == null || (oooO0O0 = oooO0O0OooOOO1.f4704OooOO0o) == null) {
                    return;
                }
                oooO0O0.f4719OooO0OO = 5;
            }
        }
    }

    public void setAdapter(OooO0O0 oooO0O0) {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4515OooOOOo = new ArrayList<>();
        this.f4517OooOOo0 = 0;
        this.f4518OooOOoo = -1;
        this.f4521OooOo00 = false;
        this.f4520OooOo0 = -1;
        this.f4522OooOo0O = -1;
        this.f4523OooOo0o = -1;
        this.f4519OooOo = -1;
        this.f4525OooOoO0 = 0.9f;
        this.f4524OooOoO = 4;
        this.f4526OooOoOO = 1;
        this.f4527OooOoo0 = 2.0f;
        new OooO00o();
        OooOo0O(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4515OooOOOo = new ArrayList<>();
        this.f4517OooOOo0 = 0;
        this.f4518OooOOoo = -1;
        this.f4521OooOo00 = false;
        this.f4520OooOo0 = -1;
        this.f4522OooOo0O = -1;
        this.f4523OooOo0o = -1;
        this.f4519OooOo = -1;
        this.f4525OooOoO0 = 0.9f;
        this.f4524OooOoO = 4;
        this.f4526OooOoOO = 1;
        this.f4527OooOoo0 = 2.0f;
        new OooO00o();
        OooOo0O(context, attributeSet);
    }
}
