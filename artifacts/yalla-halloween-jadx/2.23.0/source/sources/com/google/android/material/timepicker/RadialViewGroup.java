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
import androidx.core.view.o000O0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o0O00o00.OooOo00;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
class RadialViewGroup extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f18197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public MaterialShapeDrawable f18198OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f18199OooO0o0;

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void OooO0O0() {
        androidx.constraintlayout.widget.OooO0O0 oooO0O0 = new androidx.constraintlayout.widget.OooO0O0();
        oooO0O0.OooO0o0(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != o0000Ooo.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(o0000Ooo.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f18199OooO0o0 * 0.66f) : this.f18199OooO0o0;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = o0000Ooo.circle_center;
                androidx.constraintlayout.widget.OooO0O0.C0117OooO0O0 c0117OooO0O0 = oooO0O0.OooO0oo(id).f5060OooO0o0;
                c0117OooO0O0.f5102OooOoOO = i3;
                c0117OooO0O0.f5104OooOoo0 = iRound;
                c0117OooO0O0.f5103OooOoo = size;
                size += 360.0f / list.size();
            }
        }
        oooO0O0.OooO0O0(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            view.setId(ViewCompat.OooO.OooO00o());
        }
        Handler handler = getHandler();
        if (handler != null) {
            OooO0O0 oooO0O0 = this.f18197OooO0Oo;
            handler.removeCallbacks(oooO0O0);
            handler.post(oooO0O0);
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
            OooO0O0 oooO0O0 = this.f18197OooO0Oo;
            handler.removeCallbacks(oooO0O0);
            handler.post(oooO0O0);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(@ColorInt int i) {
        this.f18198OooO0o.OooOOO(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.material.timepicker.OooO0O0] */
    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(o0000O00.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f18198OooO0o = materialShapeDrawable;
        OooOo00 oooOo00 = new OooOo00(0.5f);
        com.google.android.material.shape.OooO0O0 oooO0O0 = materialShapeDrawable.f17582OooO0Oo.f17605OooO00o;
        oooO0O0.getClass();
        com.google.android.material.shape.OooO0O0.OooO00o oooO00o = new com.google.android.material.shape.OooO0O0.OooO00o(oooO0O0);
        oooO00o.f17645OooO0o0 = oooOo00;
        oooO00o.f17644OooO0o = oooOo00;
        oooO00o.f17646OooO0oO = oooOo00;
        oooO00o.f17647OooO0oo = oooOo00;
        materialShapeDrawable.setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(oooO00o));
        this.f18198OooO0o.OooOOO(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.f18198OooO0o;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOo0(this, materialShapeDrawable2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.RadialViewGroup, i, 0);
        this.f18199OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.RadialViewGroup_materialCircleRadius, 0);
        this.f18197OooO0Oo = new Runnable() { // from class: com.google.android.material.timepicker.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18194OooO0Oo.OooO0O0();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
