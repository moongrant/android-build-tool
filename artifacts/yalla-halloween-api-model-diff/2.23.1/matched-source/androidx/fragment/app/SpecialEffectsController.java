package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n288#2,2:711\n288#2,2:713\n533#2,6:715\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController\n*L\n69#1:711,2\n75#1:713,2\n166#1:715,6\n*E\n"})
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ViewGroup f5951OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f5952OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f5953OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f5954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f5955OooO0o0;

    public static final class OooO00o extends Operation {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public final o0000 f5956OooO0oo;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO00o(@NotNull Operation.State finalState, @NotNull Operation.LifecycleImpact lifecycleImpact, @NotNull o0000 fragmentStateManager, @NotNull p063o0000oO.o0OoOo0 cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Fragment fragment = fragmentStateManager.f5971OooO0OO;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragment, cancellationSignal);
            this.f5956OooO0oo = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void OooO0O0() {
            super.OooO0O0();
            this.f5956OooO0oo.OooOO0O();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void OooO0Oo() {
            Operation.LifecycleImpact lifecycleImpact = this.f5958OooO0O0;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.ADDING;
            o0000 o0000Var = this.f5956OooO0oo;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                    Fragment fragment = o0000Var.f5971OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                    View viewRequireView = fragment.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragment);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = o0000Var.f5971OooO0OO;
            Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment2);
                }
            }
            View viewRequireView2 = this.f5959OooO0OO.requireView();
            Intrinsics.checkNotNullExpressionValue(viewRequireView2, "this.fragment.requireView()");
            if (viewRequireView2.getParent() == null) {
                o0000Var.OooO0O0();
                viewRequireView2.setAlpha(0.0f);
            }
            if ((viewRequireView2.getAlpha() == 0.0f) && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,710:1\n1855#2,2:711\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n607#1:711,2\n*E\n"})
    public static class Operation {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public State f5957OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public LifecycleImpact f5958OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Fragment f5959OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final ArrayList f5960OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f5961OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f5962OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f5963OooO0oO;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0})
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "Companion", "OooO00o", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0})
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$Operation$State$OooO00o, reason: from kotlin metadata */
            public static final class Companion {
                @NotNull
                public static State OooO00o(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (((view.getAlpha() > 0.0f ? 1 : (view.getAlpha() == 0.0f ? 0 : -1)) == 0) && view.getVisibility() == 0) ? State.INVISIBLE : OooO0O0(view.getVisibility());
                }

                @JvmStatic
                @NotNull
                public static State OooO0O0(int i) {
                    if (i == 0) {
                        return State.VISIBLE;
                    }
                    if (i == 4) {
                        return State.INVISIBLE;
                    }
                    if (i == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown visibility ", i));
                }
            }

            public /* synthetic */ class OooO0O0 {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public final void OooO00o(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i = OooO0O0.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public Operation(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact, @NotNull Fragment fragment, @NotNull p063o0000oO.o0OoOo0 cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.f5957OooO00o = finalState;
            this.f5958OooO0O0 = lifecycleImpact;
            this.f5959OooO0OO = fragment;
            this.f5960OooO0Oo = new ArrayList();
            this.f5962OooO0o0 = new LinkedHashSet();
            cancellationSignal.OooO0O0(new o000O0Oo(this));
        }

        public final void OooO00o() {
            if (this.f5961OooO0o) {
                return;
            }
            this.f5961OooO0o = true;
            LinkedHashSet linkedHashSet = this.f5962OooO0o0;
            if (linkedHashSet.isEmpty()) {
                OooO0O0();
                return;
            }
            Iterator it = CollectionsKt.toMutableSet(linkedHashSet).iterator();
            while (it.hasNext()) {
                ((p063o0000oO.o0OoOo0) it.next()).OooO00o();
            }
        }

        @CallSuper
        public void OooO0O0() {
            if (this.f5963OooO0oO) {
                return;
            }
            if (FragmentManager.Oooo0O0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f5963OooO0oO = true;
            Iterator it = this.f5960OooO0Oo.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void OooO0OO(@NotNull State finalState, @NotNull LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i = OooO00o.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            Fragment fragment = this.f5959OooO0OO;
            if (i == 1) {
                if (this.f5957OooO00o == State.REMOVED) {
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f5958OooO0O0 + " to ADDING.");
                    }
                    this.f5957OooO00o = State.VISIBLE;
                    this.f5958OooO0O0 = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f5957OooO00o + " -> REMOVED. mLifecycleImpact  = " + this.f5958OooO0O0 + " to REMOVING.");
                }
                this.f5957OooO00o = State.REMOVED;
                this.f5958OooO0O0 = LifecycleImpact.REMOVING;
                return;
            }
            if (i == 3 && this.f5957OooO00o != State.REMOVED) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f5957OooO00o + " -> " + finalState + '.');
                }
                this.f5957OooO00o = finalState;
            }
        }

        public void OooO0Oo() {
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbOooO0O0.append(this.f5957OooO00o);
            sbOooO0O0.append(" lifecycleImpact = ");
            sbOooO0O0.append(this.f5958OooO0O0);
            sbOooO0O0.append(" fragment = ");
            sbOooO0O0.append(this.f5959OooO0OO);
            sbOooO0O0.append('}');
            return sbOooO0O0.toString();
        }
    }

    public SpecialEffectsController(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f5951OooO00o = container;
        this.f5952OooO0O0 = new ArrayList();
        this.f5953OooO0OO = new ArrayList();
    }

    @JvmStatic
    @NotNull
    public static final SpecialEffectsController OooOO0(@NotNull ViewGroup container, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        o000OO0O factory = fragmentManager.Oooo00o();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        int i = p062o0000o0o.o000000O.special_effects_controller_view_tag;
        Object tag = container.getTag(i);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        ((FragmentManager.OooO) factory).getClass();
        OooOOO oooOOO = new OooOOO(container);
        Intrinsics.checkNotNullExpressionValue(oooOOO, "factory.createController(container)");
        container.setTag(i, oooOOO);
        return oooOOO;
    }

    public final void OooO() {
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f5951OooO00o;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        boolean zOooO0O0 = ViewCompat.OooOO0O.OooO0O0(viewGroup);
        synchronized (this.f5952OooO0O0) {
            OooOO0o();
            Iterator it = this.f5952OooO0O0.iterator();
            while (it.hasNext()) {
                ((Operation) it.next()).OooO0Oo();
            }
            for (Operation operation : CollectionsKt.toMutableList((Collection) this.f5953OooO0OO)) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zOooO0O0 ? "" : "Container " + this.f5951OooO00o + " is not attached to window. ") + "Cancelling running operation " + operation);
                }
                operation.OooO00o();
            }
            for (Operation operation2 : CollectionsKt.toMutableList((Collection) this.f5952OooO0O0)) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + (zOooO0O0 ? "" : "Container " + this.f5951OooO00o + " is not attached to window. ") + "Cancelling pending operation " + operation2);
                }
                operation2.OooO00o();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void OooO00o(Operation.State state, Operation.LifecycleImpact lifecycleImpact, o0000 o0000Var) {
        synchronized (this.f5952OooO0O0) {
            p063o0000oO.o0OoOo0 o0oooo1 = new p063o0000oO.o0OoOo0();
            Fragment fragment = o0000Var.f5971OooO0OO;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            Operation operationOooO0oo = OooO0oo(fragment);
            if (operationOooO0oo != null) {
                operationOooO0oo.OooO0OO(state, lifecycleImpact);
                return;
            }
            final OooO00o oooO00o = new OooO00o(state, lifecycleImpact, o0000Var, o0oooo1);
            this.f5952OooO0O0.add(oooO00o);
            Runnable listener = new Runnable() { // from class: androidx.fragment.app.o000O00O
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController this$0 = this.f6034OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    SpecialEffectsController.OooO00o operation = oooO00o;
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    if (this$0.f5952OooO0O0.contains(operation)) {
                        SpecialEffectsController.Operation.State state2 = operation.f5957OooO00o;
                        View view = operation.f5959OooO0OO.mView;
                        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                        state2.OooO00o(view);
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            oooO00o.f5960OooO0Oo.add(listener);
            Runnable listener2 = new Runnable() { // from class: androidx.fragment.app.o000O0
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController this$0 = this.f6030OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    SpecialEffectsController.OooO00o operation = oooO00o;
                    Intrinsics.checkNotNullParameter(operation, "$operation");
                    this$0.f5952OooO0O0.remove(operation);
                    this$0.f5953OooO0OO.remove(operation);
                }
            };
            Intrinsics.checkNotNullParameter(listener2, "listener");
            oooO00o.f5960OooO0Oo.add(listener2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void OooO0O0(@NotNull Operation.State finalState, @NotNull o0000 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f5971OooO0OO);
        }
        OooO00o(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void OooO0OO(@NotNull o0000 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.f5971OooO0OO);
        }
        OooO00o(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void OooO0Oo(@NotNull o0000 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.f5971OooO0OO);
        }
        OooO00o(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    public abstract void OooO0o(@NotNull List<Operation> list, boolean z);

    public final void OooO0o0(@NotNull o0000 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.f5971OooO0OO);
        }
        OooO00o(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void OooO0oO() {
        if (this.f5955OooO0o0) {
            return;
        }
        ViewGroup viewGroup = this.f5951OooO00o;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        if (!ViewCompat.OooOO0O.OooO0O0(viewGroup)) {
            OooO();
            this.f5954OooO0Oo = false;
            return;
        }
        synchronized (this.f5952OooO0O0) {
            if (!this.f5952OooO0O0.isEmpty()) {
                List<Operation> mutableList = CollectionsKt.toMutableList((Collection) this.f5953OooO0OO);
                this.f5953OooO0OO.clear();
                for (Operation operation : mutableList) {
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + operation);
                    }
                    operation.OooO00o();
                    if (!operation.f5963OooO0oO) {
                        this.f5953OooO0OO.add(operation);
                    }
                }
                OooOO0o();
                List<Operation> mutableList2 = CollectionsKt.toMutableList((Collection) this.f5952OooO0O0);
                this.f5952OooO0O0.clear();
                this.f5953OooO0OO.addAll(mutableList2);
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator<Operation> it = mutableList2.iterator();
                while (it.hasNext()) {
                    it.next().OooO0Oo();
                }
                OooO0o(mutableList2, this.f5954OooO0Oo);
                this.f5954OooO0Oo = false;
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Operation OooO0oo(Fragment fragment) {
        Object next;
        Iterator it = this.f5952OooO0O0.iterator();
        while (it.hasNext()) {
            next = it.next();
            Operation operation = (Operation) next;
            if (Intrinsics.areEqual(operation.f5959OooO0OO, fragment) && !operation.f5961OooO0o) {
                return (Operation) next;
            }
        }
        next = null;
        return (Operation) next;
    }

    public final void OooOO0O() {
        Object objPrevious;
        Operation.State stateOooO00o;
        Operation.State state;
        Operation.State state2;
        synchronized (this.f5952OooO0O0) {
            OooOO0o();
            ArrayList arrayList = this.f5952OooO0O0;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                Operation operation = (Operation) objPrevious;
                Operation.State.Companion companion = Operation.State.INSTANCE;
                View view = operation.f5959OooO0OO.mView;
                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                companion.getClass();
                stateOooO00o = Operation.State.Companion.OooO00o(view);
                state = operation.f5957OooO00o;
                state2 = Operation.State.VISIBLE;
            } while (!(state == state2 && stateOooO00o != state2));
            Operation operation2 = (Operation) objPrevious;
            Fragment fragment = operation2 != null ? operation2.f5959OooO0OO : null;
            this.f5955OooO0o0 = fragment != null ? fragment.isPostponed() : false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void OooOO0o() {
        for (Operation operation : this.f5952OooO0O0) {
            if (operation.f5958OooO0O0 == Operation.LifecycleImpact.ADDING) {
                View viewRequireView = operation.f5959OooO0OO.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                Operation.State.Companion companion = Operation.State.INSTANCE;
                int visibility = viewRequireView.getVisibility();
                companion.getClass();
                operation.OooO0OO(Operation.State.Companion.OooO0O0(visibility), Operation.LifecycleImpact.NONE);
            }
        }
    }
}
