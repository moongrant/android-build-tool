package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f5007OooO0Oo;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public OooO0O0 getConstraintSet() {
        if (this.f5007OooO0Oo == null) {
            this.f5007OooO0Oo = new OooO0O0();
        }
        OooO0O0 oooO0O0 = this.f5007OooO0Oo;
        oooO0O0.getClass();
        int childCount = getChildCount();
        HashMap<Integer, OooO0O0.OooO00o> map = oooO0O0.f5044OooO0o;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO0O0.f5045OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new OooO0O0.OooO00o());
            }
            OooO0O0.OooO00o oooO00o = map.get(Integer.valueOf(id));
            if (oooO00o != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    oooO00o.OooO0Oo(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        OooO0O0.C0119OooO0O0 c0119OooO0O0 = oooO00o.f5066OooO0o0;
                        c0119OooO0O0.f5141OoooooO = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        c0119OooO0O0.f5140Oooooo0 = barrier.getType();
                        c0119OooO0O0.f5142Ooooooo = barrier.getReferencedIds();
                        c0119OooO0O0.f5139Oooooo = barrier.getMargin();
                    }
                }
                oooO00o.OooO0Oo(id, layoutParams);
            }
        }
        return this.f5007OooO0Oo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* JADX INFO: renamed from: o000000, reason: collision with root package name */
        public final float f5008o000000;

        /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
        public final float f5009o000OOo;

        /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
        public final float f5010o00oO0O;

        /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
        public final boolean f5011o00oO0o;

        /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
        public final float f5012o0O0O00;

        /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
        public final float f5013o0OO00O;

        /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
        public final float f5014o0OOO0o;

        /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
        public final float f5015o0Oo0oo;

        /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
        public final float f5016o0ooOO0;

        /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
        public final float f5017o0ooOOo;

        /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
        public final float f5018o0ooOoO;

        /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
        public final float f5019oo000o;

        /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
        public final float f5020oo0o0Oo;

        public LayoutParams() {
            this.f5019oo000o = 1.0f;
            this.f5011o00oO0o = false;
            this.f5010o00oO0O = 0.0f;
            this.f5016o0ooOO0 = 0.0f;
            this.f5017o0ooOOo = 0.0f;
            this.f5018o0ooOoO = 0.0f;
            this.f5014o0OOO0o = 1.0f;
            this.f5015o0Oo0oo = 1.0f;
            this.f5013o0OO00O = 0.0f;
            this.f5020oo0o0Oo = 0.0f;
            this.f5012o0O0O00 = 0.0f;
            this.f5009o000OOo = 0.0f;
            this.f5008o000000 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5019oo000o = 1.0f;
            this.f5011o00oO0o = false;
            this.f5010o00oO0O = 0.0f;
            this.f5016o0ooOO0 = 0.0f;
            this.f5017o0ooOOo = 0.0f;
            this.f5018o0ooOoO = 0.0f;
            this.f5014o0OOO0o = 1.0f;
            this.f5015o0Oo0oo = 1.0f;
            this.f5013o0OO00O = 0.0f;
            this.f5020oo0o0Oo = 0.0f;
            this.f5012o0O0O00 = 0.0f;
            this.f5009o000OOo = 0.0f;
            this.f5008o000000 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintSet_android_alpha) {
                    this.f5019oo000o = typedArrayObtainStyledAttributes.getFloat(index, this.f5019oo000o);
                } else if (index == OooO.ConstraintSet_android_elevation) {
                    this.f5010o00oO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f5010o00oO0O);
                    this.f5011o00oO0o = true;
                } else if (index == OooO.ConstraintSet_android_rotationX) {
                    this.f5017o0ooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f5017o0ooOOo);
                } else if (index == OooO.ConstraintSet_android_rotationY) {
                    this.f5018o0ooOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f5018o0ooOoO);
                } else if (index == OooO.ConstraintSet_android_rotation) {
                    this.f5016o0ooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f5016o0ooOO0);
                } else if (index == OooO.ConstraintSet_android_scaleX) {
                    this.f5014o0OOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f5014o0OOO0o);
                } else if (index == OooO.ConstraintSet_android_scaleY) {
                    this.f5015o0Oo0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5015o0Oo0oo);
                } else if (index == OooO.ConstraintSet_android_transformPivotX) {
                    this.f5013o0OO00O = typedArrayObtainStyledAttributes.getFloat(index, this.f5013o0OO00O);
                } else if (index == OooO.ConstraintSet_android_transformPivotY) {
                    this.f5020oo0o0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f5020oo0o0Oo);
                } else if (index == OooO.ConstraintSet_android_translationX) {
                    this.f5012o0O0O00 = typedArrayObtainStyledAttributes.getFloat(index, this.f5012o0O0O00);
                } else if (index == OooO.ConstraintSet_android_translationY) {
                    this.f5009o000OOo = typedArrayObtainStyledAttributes.getFloat(index, this.f5009o000OOo);
                } else if (index == OooO.ConstraintSet_android_translationZ) {
                    this.f5008o000000 = typedArrayObtainStyledAttributes.getFloat(index, this.f5008o000000);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
