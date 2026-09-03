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

/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements OooOO0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f5184OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5185OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f5186OooO0oO;

    public ReactiveGuide(Context context) {
        super(context);
        this.f5183OooO0Oo = -1;
        this.f5185OooO0o0 = false;
        this.f5184OooO0o = 0;
        this.f5186OooO0oO = true;
        super.setVisibility(8);
        OooO00o(null);
    }

    public final void OooO00o(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f5183OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f5183OooO0Oo);
                } else if (index == OooO.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f5185OooO0o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5185OooO0o0);
                } else if (index == OooO.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f5184OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f5184OooO0o);
                } else if (index == OooO.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f5186OooO0oO = typedArrayObtainStyledAttributes.getBoolean(index, this.f5186OooO0oO);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f5183OooO0Oo != -1) {
            ConstraintLayout.getSharedValues().OooO00o(this.f5183OooO0Oo, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f5184OooO0o;
    }

    public int getAttributeId() {
        return this.f5183OooO0Oo;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f5185OooO0o0 = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f5184OooO0o = i;
    }

    public void setAttributeId(int i) {
        HashSet<WeakReference<OooOO0.OooO00o>> hashSet;
        OooOO0 sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f5183OooO0Oo;
        if (i2 != -1 && (hashSet = sharedValues.f5169OooO00o.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            for (WeakReference<OooOO0.OooO00o> weakReference : hashSet) {
                OooOO0.OooO00o oooO00o = weakReference.get();
                if (oooO00o == null || oooO00o == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f5183OooO0Oo = i;
        if (i != -1) {
            sharedValues.OooO00o(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f4929OooO00o = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f4930OooO0O0 = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f4931OooO0OO = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5183OooO0Oo = -1;
        this.f5185OooO0o0 = false;
        this.f5184OooO0o = 0;
        this.f5186OooO0oO = true;
        super.setVisibility(8);
        OooO00o(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5183OooO0Oo = -1;
        this.f5185OooO0o0 = false;
        this.f5184OooO0o = 0;
        this.f5186OooO0oO = true;
        super.setVisibility(8);
        OooO00o(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f5183OooO0Oo = -1;
        this.f5185OooO0o0 = false;
        this.f5184OooO0o = 0;
        this.f5186OooO0oO = true;
        super.setVisibility(8);
        OooO00o(attributeSet);
    }
}
