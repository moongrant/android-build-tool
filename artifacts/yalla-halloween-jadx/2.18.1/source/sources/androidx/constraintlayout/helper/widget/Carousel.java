package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import p062o0000o0O.o0ooOOo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooO0O0 f7081OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final ArrayList<View> f7082OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f7083OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f7084Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public MotionLayout f7085Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f7086OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f7087OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f7088OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f7089Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f7090Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f7091OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float f7092Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f7093o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public float f7094o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f7095o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public int f7096o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public OooO00o f7097o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f7098o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f7099ooOO;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: androidx.constraintlayout.helper.widget.Carousel$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0040OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ float f7101Oooo0o;

            public RunnableC0040OooO00o(float f) {
                this.f7101Oooo0o = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Carousel.this.f7085Ooooo0o.OooOo0o(5, 1.0f, this.f7101Oooo0o);
            }
        }

        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Carousel.this.f7085Ooooo0o.setProgress(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Carousel.this.OooOo();
            Carousel.this.f7081OoooOo0.OooO0O0();
            float velocity = Carousel.this.f7085Ooooo0o.getVelocity();
            Carousel carousel = Carousel.this;
            if (carousel.f7093o00O0O != 2 || velocity <= carousel.f7094o00Oo0 || carousel.f7084Ooooo00 >= carousel.f7081OoooOo0.count() - 1) {
                return;
            }
            Carousel carousel2 = Carousel.this;
            float f = velocity * carousel2.f7092Ooooooo;
            int i = carousel2.f7084Ooooo00;
            if (i != 0 || carousel2.f7083OoooOoo <= i) {
                if (i == carousel2.f7081OoooOo0.count() - 1) {
                    Carousel carousel3 = Carousel.this;
                    if (carousel3.f7083OoooOoo < carousel3.f7084Ooooo00) {
                        return;
                    }
                }
                Carousel.this.f7085Ooooo0o.post(new RunnableC0040OooO00o(f));
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0();

        int count();
    }

    public Carousel(Context context) {
        super(context);
        this.f7081OoooOo0 = null;
        this.f7082OoooOoO = new ArrayList<>();
        this.f7083OoooOoo = 0;
        this.f7084Ooooo00 = 0;
        this.f7086OooooO0 = -1;
        this.f7087OooooOO = false;
        this.f7088OooooOo = -1;
        this.f7090Oooooo0 = -1;
        this.f7089Oooooo = -1;
        this.f7091OoooooO = -1;
        this.f7092Ooooooo = 0.9f;
        this.f7098o0OoOo0 = 0;
        this.f7099ooOO = 4;
        this.f7093o00O0O = 1;
        this.f7094o00Oo0 = 2.0f;
        this.f7095o00Ooo = -1;
        this.f7096o00o0O = 200;
        this.f7097o00ooo = new OooO00o();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO00o(int i) {
        int i2 = this.f7084Ooooo00;
        this.f7083OoooOoo = i2;
        if (i == this.f7091OoooooO) {
            this.f7084Ooooo00 = i2 + 1;
        } else if (i == this.f7089Oooooo) {
            this.f7084Ooooo00 = i2 - 1;
        }
        if (this.f7087OooooOO) {
            if (this.f7084Ooooo00 >= this.f7081OoooOo0.count()) {
                this.f7084Ooooo00 = 0;
            }
            if (this.f7084Ooooo00 < 0) {
                this.f7084Ooooo00 = this.f7081OoooOo0.count() - 1;
            }
        } else {
            if (this.f7084Ooooo00 >= this.f7081OoooOo0.count()) {
                this.f7084Ooooo00 = this.f7081OoooOo0.count() - 1;
            }
            if (this.f7084Ooooo00 < 0) {
                this.f7084Ooooo00 = 0;
            }
        }
        if (this.f7083OoooOoo != this.f7084Ooooo00) {
            this.f7085Ooooo0o.post(this.f7097o00ooo);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO0O0() {
    }

    public final void OooOo() {
        OooO0O0 oooO0O0 = this.f7081OoooOo0;
        if (oooO0O0 == null || this.f7085Ooooo0o == null || oooO0O0.count() == 0) {
            return;
        }
        int size = this.f7082OoooOoO.size();
        for (int i = 0; i < size; i++) {
            View view = this.f7082OoooOoO.get(i);
            int i2 = (this.f7084Ooooo00 + i) - this.f7098o0OoOo0;
            if (this.f7087OooooOO) {
                if (i2 < 0) {
                    int i3 = this.f7099ooOO;
                    if (i3 != 4) {
                        OooOoO0(view, i3);
                    } else {
                        OooOoO0(view, 0);
                    }
                    if (i2 % this.f7081OoooOo0.count() == 0) {
                        this.f7081OoooOo0.OooO00o();
                    } else {
                        OooO0O0 oooO0O1 = this.f7081OoooOo0;
                        oooO0O1.count();
                        int iCount = i2 % this.f7081OoooOo0.count();
                        oooO0O1.OooO00o();
                    }
                } else if (i2 >= this.f7081OoooOo0.count()) {
                    if (i2 != this.f7081OoooOo0.count() && i2 > this.f7081OoooOo0.count()) {
                        int iCount2 = i2 % this.f7081OoooOo0.count();
                    }
                    int i4 = this.f7099ooOO;
                    if (i4 != 4) {
                        OooOoO0(view, i4);
                    } else {
                        OooOoO0(view, 0);
                    }
                    this.f7081OoooOo0.OooO00o();
                } else {
                    OooOoO0(view, 0);
                    this.f7081OoooOo0.OooO00o();
                }
            } else if (i2 < 0) {
                OooOoO0(view, this.f7099ooOO);
            } else if (i2 >= this.f7081OoooOo0.count()) {
                OooOoO0(view, this.f7099ooOO);
            } else {
                OooOoO0(view, 0);
                this.f7081OoooOo0.OooO00o();
            }
        }
        int i5 = this.f7095o00Ooo;
        if (i5 != -1 && i5 != this.f7084Ooooo00) {
            this.f7085Ooooo0o.post(new o0ooOOo(this, 0));
        } else if (i5 == this.f7084Ooooo00) {
            this.f7095o00Ooo = -1;
        }
        if (this.f7088OooooOo == -1 || this.f7090Oooooo0 == -1) {
            Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.f7087OooooOO) {
            return;
        }
        int iCount3 = this.f7081OoooOo0.count();
        if (this.f7084Ooooo00 == 0) {
            OooOo0O(this.f7088OooooOo, false);
        } else {
            OooOo0O(this.f7088OooooOo, true);
            this.f7085Ooooo0o.setTransition(this.f7088OooooOo);
        }
        if (this.f7084Ooooo00 == iCount3 - 1) {
            OooOo0O(this.f7090Oooooo0, false);
        } else {
            OooOo0O(this.f7090Oooooo0, true);
            this.f7085Ooooo0o.setTransition(this.f7090Oooooo0);
        }
    }

    public final boolean OooOo0O(int i, boolean z) {
        MotionLayout motionLayout;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOOo;
        if (i == -1 || (motionLayout = this.f7085Ooooo0o) == null || (oooO0O0OooOOOo = motionLayout.OooOOOo(i)) == null || z == (!oooO0O0OooOOOo.f7282OooOOOO)) {
            return false;
        }
        oooO0O0OooOOOo.f7282OooOOOO = !z;
        return true;
    }

    public final void OooOo0o(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.Carousel_carousel_firstView) {
                    this.f7086OooooO0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7086OooooO0);
                } else if (index == o000O00.Carousel_carousel_backwardTransition) {
                    this.f7088OooooOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7088OooooOo);
                } else if (index == o000O00.Carousel_carousel_forwardTransition) {
                    this.f7090Oooooo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f7090Oooooo0);
                } else if (index == o000O00.Carousel_carousel_emptyViewsBehavior) {
                    this.f7099ooOO = typedArrayObtainStyledAttributes.getInt(index, this.f7099ooOO);
                } else if (index == o000O00.Carousel_carousel_previousState) {
                    this.f7089Oooooo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7089Oooooo);
                } else if (index == o000O00.Carousel_carousel_nextState) {
                    this.f7091OoooooO = typedArrayObtainStyledAttributes.getResourceId(index, this.f7091OoooooO);
                } else if (index == o000O00.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f7092Ooooooo = typedArrayObtainStyledAttributes.getFloat(index, this.f7092Ooooooo);
                } else if (index == o000O00.Carousel_carousel_touchUpMode) {
                    this.f7093o00O0O = typedArrayObtainStyledAttributes.getInt(index, this.f7093o00O0O);
                } else if (index == o000O00.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f7094o00Oo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7094o00Oo0);
                } else if (index == o000O00.Carousel_carousel_infinite) {
                    this.f7087OooooOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f7087OooooOO);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean OooOoO0(View view, int i) {
        androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00oOooO;
        MotionLayout motionLayout = this.f7085Ooooo0o;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            androidx.constraintlayout.widget.OooO00o oooO00oOooO = this.f7085Ooooo0o.OooO(i2);
            boolean z2 = true;
            if (oooO00oOooO == null || (c0043OooO00oOooO = oooO00oOooO.OooO(view.getId())) == null) {
                z2 = false;
            } else {
                c0043OooO00oOooO.f7617OooO0OO.f7720OooO0OO = 1;
                view.setVisibility(i);
            }
            z |= z2;
        }
        return z;
    }

    public int getCount() {
        OooO0O0 oooO0O0 = this.f7081OoooOo0;
        if (oooO0O0 != null) {
            return oooO0O0.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f7084Ooooo00;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi(api = 17)
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f7491Oooo0oO; i++) {
                int i2 = this.f7490Oooo0o[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.f7086OooooO0 == i2) {
                    this.f7098o0OoOo0 = i;
                }
                this.f7082OoooOoO.add(viewById);
            }
            this.f7085Ooooo0o = motionLayout;
            if (this.f7093o00O0O == 2) {
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOOo = motionLayout.OooOOOo(this.f7090Oooooo0);
                if (oooO0O0OooOOOo != null && (oooO0O1 = oooO0O0OooOOOo.f7279OooOO0o) != null) {
                    oooO0O1.f7294OooO0OO = 5;
                }
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOOo2 = this.f7085Ooooo0o.OooOOOo(this.f7088OooooOo);
                if (oooO0O0OooOOOo2 != null && (oooO0O0 = oooO0O0OooOOOo2.f7279OooOO0o) != null) {
                    oooO0O0.f7294OooO0OO = 5;
                }
            }
            OooOo();
        }
    }

    public void setAdapter(OooO0O0 oooO0O0) {
        this.f7081OoooOo0 = oooO0O0;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7081OoooOo0 = null;
        this.f7082OoooOoO = new ArrayList<>();
        this.f7083OoooOoo = 0;
        this.f7084Ooooo00 = 0;
        this.f7086OooooO0 = -1;
        this.f7087OooooOO = false;
        this.f7088OooooOo = -1;
        this.f7090Oooooo0 = -1;
        this.f7089Oooooo = -1;
        this.f7091OoooooO = -1;
        this.f7092Ooooooo = 0.9f;
        this.f7098o0OoOo0 = 0;
        this.f7099ooOO = 4;
        this.f7093o00O0O = 1;
        this.f7094o00Oo0 = 2.0f;
        this.f7095o00Ooo = -1;
        this.f7096o00o0O = 200;
        this.f7097o00ooo = new OooO00o();
        OooOo0o(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7081OoooOo0 = null;
        this.f7082OoooOoO = new ArrayList<>();
        this.f7083OoooOoo = 0;
        this.f7084Ooooo00 = 0;
        this.f7086OooooO0 = -1;
        this.f7087OooooOO = false;
        this.f7088OooooOo = -1;
        this.f7090Oooooo0 = -1;
        this.f7089Oooooo = -1;
        this.f7091OoooooO = -1;
        this.f7092Ooooooo = 0.9f;
        this.f7098o0OoOo0 = 0;
        this.f7099ooOO = 4;
        this.f7093o00O0O = 1;
        this.f7094o00Oo0 = 2.0f;
        this.f7095o00Ooo = -1;
        this.f7096o00o0O = 200;
        this.f7097o00ooo = new OooO00o();
        OooOo0o(context, attributeSet);
    }
}
