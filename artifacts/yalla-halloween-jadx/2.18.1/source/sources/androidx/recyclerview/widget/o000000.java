package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.WeakHashMap;
import p072o000O0o0.o000;
import p072o000O0o0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public class o000000 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RecyclerView f9141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f9142OooO0o0;

    public static class OooO00o extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000000 f9143OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Map<View, androidx.core.view.OooO00o> f9144OooO0o0 = new WeakHashMap();

        public OooO00o(@NonNull o000000 o000000Var) {
            this.f9143OooO0Oo = o000000Var;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final void OooO(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            if (oooO00o != null) {
                oooO00o.OooO(view, accessibilityEvent);
            } else {
                super.OooO(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final boolean OooO00o(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            return oooO00o != null ? oooO00o.OooO00o(view, accessibilityEvent) : super.OooO00o(view, accessibilityEvent);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        @Nullable
        public final o000 OooO0O0(@NonNull View view) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            return oooO00o != null ? oooO00o.OooO0O0(view) : super.OooO0O0(view);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final void OooO0OO(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            if (oooO00o != null) {
                oooO00o.OooO0OO(view, accessibilityEvent);
            } else {
                super.OooO0OO(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, o0000OO0 o0000oo1) {
            if (this.f9143OooO0Oo.OooOO0() || this.f9143OooO0Oo.f9141OooO0Oo.getLayoutManager() == null) {
                this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
                return;
            }
            this.f9143OooO0Oo.f9141OooO0Oo.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, o0000oo1);
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            if (oooO00o != null) {
                oooO00o.OooO0Oo(view, o0000oo1);
            } else {
                this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final boolean OooO0o(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(viewGroup);
            return oooO00o != null ? oooO00o.OooO0o(viewGroup, view, accessibilityEvent) : super.OooO0o(viewGroup, view, accessibilityEvent);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final void OooO0o0(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            if (oooO00o != null) {
                oooO00o.OooO0o0(view, accessibilityEvent);
            } else {
                super.OooO0o0(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final boolean OooO0oO(View view, int i, Bundle bundle) {
            if (this.f9143OooO0Oo.OooOO0() || this.f9143OooO0Oo.f9141OooO0Oo.getLayoutManager() == null) {
                return super.OooO0oO(view, i, bundle);
            }
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            if (oooO00o != null) {
                if (oooO00o.OooO0oO(view, i, bundle)) {
                    return true;
                }
            } else if (super.OooO0oO(view, i, bundle)) {
                return true;
            }
            return this.f9143OooO0Oo.f9141OooO0Oo.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, androidx.core.view.OooO00o>, java.util.WeakHashMap] */
        @Override // androidx.core.view.OooO00o
        public final void OooO0oo(@NonNull View view, int i) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f9144OooO0o0.get(view);
            if (oooO00o != null) {
                oooO00o.OooO0oo(view, i);
            } else {
                super.OooO0oo(view, i);
            }
        }
    }

    public o000000(@NonNull RecyclerView recyclerView) {
        this.f9141OooO0Oo = recyclerView;
        OooO00o oooO00o = this.f9142OooO0o0;
        if (oooO00o != null) {
            this.f9142OooO0o0 = oooO00o;
        } else {
            this.f9142OooO0o0 = new OooO00o(this);
        }
    }

    @Override // androidx.core.view.OooO00o
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0OO(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || OooOO0()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.OooO00o
    public void OooO0Oo(View view, o0000OO0 o0000oo1) {
        this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
        if (OooOO0() || this.f9141OooO0Oo.getLayoutManager() == null) {
            return;
        }
        this.f9141OooO0Oo.getLayoutManager().onInitializeAccessibilityNodeInfo(o0000oo1);
    }

    @Override // androidx.core.view.OooO00o
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        if (super.OooO0oO(view, i, bundle)) {
            return true;
        }
        if (OooOO0() || this.f9141OooO0Oo.getLayoutManager() == null) {
            return false;
        }
        return this.f9141OooO0Oo.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public final boolean OooOO0() {
        return this.f9141OooO0Oo.hasPendingAdapterUpdates();
    }
}
