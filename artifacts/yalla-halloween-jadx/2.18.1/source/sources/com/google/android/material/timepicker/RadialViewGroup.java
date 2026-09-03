package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.OooOOOO;
import p337o0OO0o0.Oooo0;
import p347o0OOO0o0.o000000;

/* JADX INFO: loaded from: classes2.dex */
class RadialViewGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f18073Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f18074Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public MaterialShapeDrawable f18075Oooo0oo;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RadialViewGroup.this.OooO0O0();
        }
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void OooO0O0() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        androidx.constraintlayout.widget.OooO00o oooO00o = new androidx.constraintlayout.widget.OooO00o();
        oooO00o.OooO0o0(this);
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = OooOOO0.circle_center;
            if (id != i4 && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i5 = this.f18074Oooo0oO;
                androidx.constraintlayout.widget.OooO00o.OooO0O0 oooO0O0 = oooO00o.OooO0oo(id2).f7620OooO0o0;
                oooO0O0.f7662OooOoOO = i4;
                oooO0O0.f7664OooOoo0 = i5;
                oooO0O0.f7663OooOoo = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        oooO00o.OooO0O0(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            view.setId(ViewCompat.OooO.OooO00o());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f18073Oooo0o);
            handler.post(this.f18073Oooo0o);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        OooO0O0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f18073Oooo0o);
            handler.post(this.f18073Oooo0o);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(@ColorInt int i) {
        this.f18075Oooo0oo.OooOOOo(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(OooOOOO.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f18075Oooo0oo = materialShapeDrawable;
        o000000 o000000Var = new o000000(0.5f);
        com.google.android.material.shape.OooO00o oooO00o = materialShapeDrawable.f17510Oooo0o.f17534OooO00o;
        Objects.requireNonNull(oooO00o);
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
        c0110OooO00o.f17573OooO0o0 = o000000Var;
        c0110OooO00o.f17572OooO0o = o000000Var;
        c0110OooO00o.f17574OooO0oO = o000000Var;
        c0110OooO00o.f17575OooO0oo = o000000Var;
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO00o(c0110OooO00o));
        this.f18075Oooo0oo.OooOOOo(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.f18075Oooo0oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.RadialViewGroup, i, 0);
        this.f18074Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.RadialViewGroup_materialCircleRadius, 0);
        this.f18073Oooo0o = new OooO00o();
        typedArrayObtainStyledAttributes.recycle();
    }
}
