package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f7727Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f7728Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f7729Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f7730Oooo0oo;

    public ReactiveGuide(Context context) {
        super(context);
        this.f7728Oooo0o = -1;
        this.f7729Oooo0oO = false;
        this.f7730Oooo0oo = 0;
        this.f7727Oooo = true;
        super.setVisibility(8);
        OooO00o(null);
    }

    public final void OooO00o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f7728Oooo0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f7728Oooo0o);
                } else if (index == o000O00.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f7729Oooo0oO = typedArrayObtainStyledAttributes.getBoolean(index, this.f7729Oooo0oO);
                } else if (index == o000O00.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f7730Oooo0oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f7730Oooo0oo);
                } else if (index == o000O00.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f7727Oooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f7727Oooo);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f7728Oooo0o != -1) {
            ConstraintLayout.getSharedValues().OooO00o(this.f7728Oooo0o, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f7730Oooo0oo;
    }

    public int getAttributeId() {
        return this.f7728Oooo0o;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f7729Oooo0oO = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f7730Oooo0oo = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference<OooO0O0.OooO00o>> hashSet;
        OooO0O0 sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f7728Oooo0o;
        if (i2 != -1 && (hashSet = sharedValues.f7723OooO00o.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<OooO0O0.OooO00o> weakReference : hashSet) {
                OooO0O0.OooO00o oooO00o = weakReference.get();
                if (oooO00o == null || oooO00o == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f7728Oooo0o = i;
        if (i != -1) {
            sharedValues.OooO00o(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f7498OooO00o = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f7499OooO0O0 = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f7500OooO0OO = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7728Oooo0o = -1;
        this.f7729Oooo0oO = false;
        this.f7730Oooo0oo = 0;
        this.f7727Oooo = true;
        super.setVisibility(8);
        OooO00o(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7728Oooo0o = -1;
        this.f7729Oooo0oO = false;
        this.f7730Oooo0oo = 0;
        this.f7727Oooo = true;
        super.setVisibility(8);
        OooO00o(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f7728Oooo0o = -1;
        this.f7729Oooo0oO = false;
        this.f7730Oooo0oo = 0;
        this.f7727Oooo = true;
        super.setVisibility(8);
        OooO00o(attributeSet);
    }
}
