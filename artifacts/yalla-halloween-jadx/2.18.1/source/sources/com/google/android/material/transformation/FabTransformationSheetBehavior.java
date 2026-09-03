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
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p021OooOooo.o00O0O;
import p338o0OO0o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f18107OooO;

    public FabTransformationSheetBehavior() {
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public final void OooOo00(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f18107OooO = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.OooO0o) && (((CoordinatorLayout.OooO0o) childAt.getLayoutParams()).f7761OooO00o instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (z) {
                        this.f18107OooO.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                        ViewCompat.OooO0o.OooOOoo(childAt, 4);
                    } else {
                        ?? r5 = this.f18107OooO;
                        if (r5 != 0 && r5.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f18107OooO.get(childAt)).intValue();
                            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                            ViewCompat.OooO0o.OooOOoo(childAt, iIntValue);
                        }
                    }
                }
            }
            if (!z) {
                this.f18107OooO = null;
            }
        }
        super.OooOo00(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public final FabTransformationBehavior.OooO0O0 OooOoo0(Context context, boolean z) {
        int i = z ? p337o0OO0o0.OooO0OO.mtrl_fab_transformation_sheet_expand_spec : p337o0OO0o0.OooO0OO.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.OooO0O0 oooO0O0 = new FabTransformationBehavior.OooO0O0();
        oooO0O0.f18101OooO00o = OooOo00.OooO0O0(context, i);
        oooO0O0.f18102OooO0O0 = new o00O0O();
        return oooO0O0;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
