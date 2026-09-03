package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p344o0OO0ooo.o0OOo000;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f18086OooO00o;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f18088Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f18089Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0OOo000 f18090Oooo0oo;

        public OooO00o(View view, int i, o0OOo000 o0ooo001) {
            this.f18088Oooo0o = view;
            this.f18089Oooo0oO = i;
            this.f18090Oooo0oo = o0ooo001;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f18088Oooo0o.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f18086OooO00o == this.f18089Oooo0oO) {
                o0OOo000 o0ooo001 = this.f18090Oooo0oo;
                expandableBehavior.OooOo00((View) o0ooo001, this.f18088Oooo0o, o0ooo001.OooO00o(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f18086OooO00o = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean OooO0O0(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        o0OOo000 o0ooo001 = (o0OOo000) view2;
        if (!(!o0ooo001.OooO00o() ? this.f18086OooO00o != 1 : !((i = this.f18086OooO00o) == 0 || i == 2))) {
            return false;
        }
        this.f18086OooO00o = o0ooo001.OooO00o() ? 1 : 2;
        OooOo00((View) o0ooo001, view, o0ooo001.OooO00o(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean OooO0oo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        o0OOo000 o0ooo001;
        int i2;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(view)) {
            ArrayList arrayList = (ArrayList) coordinatorLayout.OooO(view);
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    o0ooo001 = null;
                    break;
                }
                View view2 = (View) arrayList.get(i3);
                if (OooO0O0(view, view2)) {
                    o0ooo001 = (o0OOo000) view2;
                    break;
                }
                i3++;
            }
            if (o0ooo001 != null) {
                if (!o0ooo001.OooO00o() ? this.f18086OooO00o != 1 : !((i2 = this.f18086OooO00o) == 0 || i2 == 2)) {
                    int i4 = o0ooo001.OooO00o() ? 1 : 2;
                    this.f18086OooO00o = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new OooO00o(view, i4, o0ooo001));
                }
            }
        }
        return false;
    }

    public abstract void OooOo00(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18086OooO00o = 0;
    }
}
