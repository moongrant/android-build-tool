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
    public final ArrayList<View> f4521OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public MotionLayout f4522OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f4523OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4524OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4525OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f4526OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f4527OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f4528OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f4529OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f4530OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f4531OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f4532OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f4533OooOoo0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Carousel carousel = Carousel.this;
            carousel.f4522OooOOo.setProgress(0.0f);
            carousel.getClass();
            carousel.getClass();
            int i = carousel.f4523OooOOo0;
            throw null;
        }
    }

    public interface OooO0O0 {
    }

    public Carousel(Context context) {
        super(context);
        this.f4521OooOOOo = new ArrayList<>();
        this.f4523OooOOo0 = 0;
        this.f4524OooOOoo = -1;
        this.f4527OooOo00 = false;
        this.f4526OooOo0 = -1;
        this.f4528OooOo0O = -1;
        this.f4529OooOo0o = -1;
        this.f4525OooOo = -1;
        this.f4531OooOoO0 = 0.9f;
        this.f4530OooOoO = 4;
        this.f4532OooOoOO = 1;
        this.f4533OooOoo0 = 2.0f;
        new OooO00o();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO00o(int i) {
        int i2 = this.f4523OooOOo0;
        if (i == this.f4525OooOo) {
            this.f4523OooOOo0 = i2 + 1;
        } else if (i == this.f4529OooOo0o) {
            this.f4523OooOOo0 = i2 - 1;
        }
        if (!this.f4527OooOo00) {
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
                    this.f4524OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4524OooOOoo);
                } else if (index == OooO.Carousel_carousel_backwardTransition) {
                    this.f4526OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4526OooOo0);
                } else if (index == OooO.Carousel_carousel_forwardTransition) {
                    this.f4528OooOo0O = typedArrayObtainStyledAttributes.getResourceId(index, this.f4528OooOo0O);
                } else if (index == OooO.Carousel_carousel_emptyViewsBehavior) {
                    this.f4530OooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f4530OooOoO);
                } else if (index == OooO.Carousel_carousel_previousState) {
                    this.f4529OooOo0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f4529OooOo0o);
                } else if (index == OooO.Carousel_carousel_nextState) {
                    this.f4525OooOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f4525OooOo);
                } else if (index == OooO.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f4531OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4531OooOoO0);
                } else if (index == OooO.Carousel_carousel_touchUpMode) {
                    this.f4532OooOoOO = typedArrayObtainStyledAttributes.getInt(index, this.f4532OooOoOO);
                } else if (index == OooO.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f4533OooOoo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4533OooOoo0);
                } else if (index == OooO.Carousel_carousel_infinite) {
                    this.f4527OooOo00 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4527OooOo00);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f4523OooOOo0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi(api = 17)
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f4923OooO0o0; i++) {
                this.f4521OooOOOo.add(motionLayout.getViewById(this.f4921OooO0Oo[i]));
            }
            this.f4522OooOOo = motionLayout;
            if (this.f4532OooOoOO == 2) {
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOO0 = motionLayout.OooOOO0(this.f4528OooOo0O);
                if (oooO0O0OooOOO0 != null && (oooO0O1 = oooO0O0OooOOO0.f4710OooOO0o) != null) {
                    oooO0O1.f4725OooO0OO = 5;
                }
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOO1 = this.f4522OooOOo.OooOOO0(this.f4526OooOo0);
                if (oooO0O0OooOOO1 == null || (oooO0O0 = oooO0O0OooOOO1.f4710OooOO0o) == null) {
                    return;
                }
                oooO0O0.f4725OooO0OO = 5;
            }
        }
    }

    public void setAdapter(OooO0O0 oooO0O0) {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4521OooOOOo = new ArrayList<>();
        this.f4523OooOOo0 = 0;
        this.f4524OooOOoo = -1;
        this.f4527OooOo00 = false;
        this.f4526OooOo0 = -1;
        this.f4528OooOo0O = -1;
        this.f4529OooOo0o = -1;
        this.f4525OooOo = -1;
        this.f4531OooOoO0 = 0.9f;
        this.f4530OooOoO = 4;
        this.f4532OooOoOO = 1;
        this.f4533OooOoo0 = 2.0f;
        new OooO00o();
        OooOo0O(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4521OooOOOo = new ArrayList<>();
        this.f4523OooOOo0 = 0;
        this.f4524OooOOoo = -1;
        this.f4527OooOo00 = false;
        this.f4526OooOo0 = -1;
        this.f4528OooOo0O = -1;
        this.f4529OooOo0o = -1;
        this.f4525OooOo = -1;
        this.f4531OooOoO0 = 0.9f;
        this.f4530OooOoO = 4;
        this.f4532OooOoOO = 1;
        this.f4533OooOoo0 = 2.0f;
        new OooO00o();
        OooOo0O(context, attributeSet);
    }
}
