package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f18207OooO00o;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f18208OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O00O0o.OooO00o f18209OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f18210OooO0o0;

        public OooO00o(View view, int i, o0O00O0o.OooO00o oooO00o) {
            this.f18208OooO0Oo = view;
            this.f18210OooO0o0 = i;
            this.f18209OooO0o = oooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f18208OooO0Oo;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f18207OooO00o == this.f18210OooO0o0) {
                o0O00O0o.OooO00o oooO00o = this.f18209OooO0o;
                expandableBehavior.OooOo00((View) oooO00o, view, oooO00o.OooO00o(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f18207OooO00o = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean OooO0O0(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        o0O00O0o.OooO00o oooO00o = (o0O00O0o.OooO00o) view2;
        if (!(!oooO00o.OooO00o() ? this.f18207OooO00o != 1 : !((i = this.f18207OooO00o) == 0 || i == 2))) {
            return false;
        }
        this.f18207OooO00o = oooO00o.OooO00o() ? 1 : 2;
        OooOo00((View) oooO00o, view, oooO00o.OooO00o(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        o0O00O0o.OooO00o oooO00o;
        int i2;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(view)) {
            ArrayList arrayListOooO = coordinatorLayout.OooO(view);
            int size = arrayListOooO.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    oooO00o = null;
                    break;
                }
                View view2 = (View) arrayListOooO.get(i3);
                if (OooO0O0(view, view2)) {
                    oooO00o = (o0O00O0o.OooO00o) view2;
                    break;
                }
                i3++;
            }
            if (oooO00o != null) {
                if (!oooO00o.OooO00o() ? this.f18207OooO00o != 1 : !((i2 = this.f18207OooO00o) == 0 || i2 == 2)) {
                    int i4 = oooO00o.OooO00o() ? 1 : 2;
                    this.f18207OooO00o = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new OooO00o(view, i4, oooO00o));
                }
            }
        }
        return false;
    }

    public abstract void OooOo00(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18207OooO00o = 0;
    }
}
