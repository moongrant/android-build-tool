package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.HashMap;
import java.util.WeakHashMap;
import o0O000.OooOOO;
import o0O000.OooOo00;
import p270o0O0000o.o000000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public HashMap f18228OooO;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public final void OooOo00(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f18228OooO = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.OooO0o) && (((CoordinatorLayout.OooO0o) childAt.getLayoutParams()).f5211OooO00o instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (z) {
                        this.f18228OooO.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                        ViewCompat.OooO0o.OooOOoo(childAt, 4);
                    } else {
                        HashMap map = this.f18228OooO;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f18228OooO.get(childAt)).intValue();
                            WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                            ViewCompat.OooO0o.OooOOoo(childAt, iIntValue);
                        }
                    }
                }
            }
            if (!z) {
                this.f18228OooO = null;
            }
        }
        super.OooOo00(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public final FabTransformationBehavior.OooO0O0 OooOoOO(Context context, boolean z) {
        int i = z ? o000000O.mtrl_fab_transformation_sheet_expand_spec : o000000O.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.OooO0O0 oooO0O0 = new FabTransformationBehavior.OooO0O0();
        oooO0O0.f18222OooO00o = OooOOO.OooO0O0(i, context);
        oooO0O0.f18223OooO0O0 = new OooOo00();
        return oooO0O0;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
