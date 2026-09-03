package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class o000000 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecyclerView f7759OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f7760OooO0O0;

    public static class OooO00o extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000 f7761OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakHashMap f7762OooO0O0 = new WeakHashMap();

        public OooO00o(@NonNull o000000 o000000Var) {
            this.f7761OooO00o = o000000Var;
        }

        @Override // androidx.core.view.OooO00o
        public final boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
            return oooO00o != null ? oooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.OooO00o
        @Nullable
        public final o0000O.o0OO00O getAccessibilityNodeProvider(@NonNull View view) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
            return oooO00o != null ? oooO00o.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) o0000O.o0Oo0oo o0oo0oo2) {
            o000000 o000000Var = this.f7761OooO00o;
            if (!o000000Var.f7759OooO00o.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = o000000Var.f7759OooO00o;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, o0oo0oo2);
                    androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
                    if (oooO00o != null) {
                        oooO00o.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
                        return;
                    } else {
                        super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
                        return;
                    }
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
        }

        @Override // androidx.core.view.OooO00o
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(viewGroup);
            return oooO00o != null ? oooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            o000000 o000000Var = this.f7761OooO00o;
            if (!o000000Var.f7759OooO00o.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = o000000Var.f7759OooO00o;
                if (recyclerView.getLayoutManager() != null) {
                    androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
                    if (oooO00o != null) {
                        if (oooO00o.performAccessibilityAction(view, i, bundle)) {
                            return true;
                        }
                    } else if (super.performAccessibilityAction(view, i, bundle)) {
                        return true;
                    }
                    return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // androidx.core.view.OooO00o
        public final void sendAccessibilityEvent(@NonNull View view, int i) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f7762OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public o000000(@NonNull RecyclerView recyclerView) {
        this.f7759OooO00o = recyclerView;
        OooO00o oooO00o = this.f7760OooO0O0;
        if (oooO00o != null) {
            this.f7760OooO0O0 = oooO00o;
        } else {
            this.f7760OooO0O0 = new OooO00o(this);
        }
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityEvent(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7759OooO00o.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.OooO00o
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) o0000O.o0Oo0oo o0oo0oo2) {
        super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
        RecyclerView recyclerView = this.f7759OooO00o;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(o0oo0oo2);
    }

    @Override // androidx.core.view.OooO00o
    public final boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7759OooO00o;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
