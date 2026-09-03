package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class o000000O extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecyclerView f10824OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f10825OooO0O0;

    public static class OooO00o extends androidx.core.view.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000O f10826OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final WeakHashMap f10827OooO0O0 = new WeakHashMap();

        public OooO00o(@NonNull o000000O o000000o2) {
            this.f10826OooO00o = o000000o2;
        }

        @Override // androidx.core.view.OooO00o
        public final boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
            return oooO00o != null ? oooO00o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.OooO00o
        @Nullable
        public final o0000O.o000OOo getAccessibilityNodeProvider(@NonNull View view) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
            return oooO00o != null ? oooO00o.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) o0000O.o0O0O00 o0o0o00) {
            o000000O o000000o2 = this.f10826OooO00o;
            if (!o000000o2.f10824OooO00o.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = o000000o2.f10824OooO00o;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, o0o0o00);
                    androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
                    if (oooO00o != null) {
                        oooO00o.onInitializeAccessibilityNodeInfo(view, o0o0o00);
                        return;
                    } else {
                        super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
                        return;
                    }
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
        }

        @Override // androidx.core.view.OooO00o
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(viewGroup);
            return oooO00o != null ? oooO00o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            o000000O o000000o2 = this.f10826OooO00o;
            if (!o000000o2.f10824OooO00o.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = o000000o2.f10824OooO00o;
                if (recyclerView.getLayoutManager() != null) {
                    androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
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
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // androidx.core.view.OooO00o
        public final void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            androidx.core.view.OooO00o oooO00o = (androidx.core.view.OooO00o) this.f10827OooO0O0.get(view);
            if (oooO00o != null) {
                oooO00o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public o000000O(@NonNull RecyclerView recyclerView) {
        this.f10824OooO00o = recyclerView;
        OooO00o oooO00o = this.f10825OooO0O0;
        if (oooO00o != null) {
            this.f10825OooO0O0 = oooO00o;
        } else {
            this.f10825OooO0O0 = new OooO00o(this);
        }
    }

    @Override // androidx.core.view.OooO00o
    public final void onInitializeAccessibilityEvent(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f10824OooO00o.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.OooO00o
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) o0000O.o0O0O00 o0o0o00) {
        super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
        RecyclerView recyclerView = this.f10824OooO00o;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(o0o0o00);
    }

    @Override // androidx.core.view.OooO00o
    public final boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f10824OooO00o;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
