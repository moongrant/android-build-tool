package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
public final class OooOOO extends SpecialEffectsController {

    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f5915OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f5916OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public oo000o.OooO00o f5917OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull SpecialEffectsController.Operation operation, @NotNull p063o0000oO.o0OoOo0 signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f5915OooO0OO = z;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        /* JADX WARN: Code duplicated, block: B:75:0x00f8 A[Catch: RuntimeException -> 0x00fe, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00fe, blocks: (B:73:0x00f2, B:75:0x00f8), top: B:86:0x00f2 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Nullable
        public final oo000o.OooO00o OooO0OO(@NotNull Context context) {
            int enterAnim;
            oo000o.OooO00o oooO00o;
            oo000o.OooO00o oooO00o2;
            Animator animatorLoadAnimator;
            int iOooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f5916OooO0Oo) {
                return this.f5917OooO0o0;
            }
            SpecialEffectsController.Operation operation = this.f5918OooO00o;
            Fragment fragment = operation.f5954OooO0OO;
            boolean z = false;
            boolean z2 = operation.f5952OooO00o == SpecialEffectsController.Operation.State.VISIBLE;
            int nextTransition = fragment.getNextTransition();
            if (this.f5915OooO0OO) {
                enterAnim = z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
            } else {
                enterAnim = z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            }
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            if (viewGroup != null) {
                int i = p062o0000o0o.o000000O.visible_removing_fragment_view_tag;
                if (viewGroup.getTag(i) != null) {
                    fragment.mContainer.setTag(i, null);
                }
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, enterAnim);
                if (animationOnCreateAnimation != null) {
                    oooO00o2 = new oo000o.OooO00o(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        oooO00o2 = new oo000o.OooO00o(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iOooO00o = z2 ? p062o0000o0o.o000000.fragment_open_enter : p062o0000o0o.o000000.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iOooO00o = z2 ? p062o0000o0o.o000000.fragment_close_enter : p062o0000o0o.o000000.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iOooO00o = z2 ? oo000o.OooO00o(R.attr.activityCloseEnterAnimation, context) : oo000o.OooO00o(R.attr.activityCloseExitAnimation, context);
                            } else if (nextTransition == 4099) {
                                iOooO00o = z2 ? p062o0000o0o.o000000.fragment_fade_enter : p062o0000o0o.o000000.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iOooO00o = -1;
                            } else {
                                iOooO00o = z2 ? oo000o.OooO00o(R.attr.activityOpenEnterAnimation, context) : oo000o.OooO00o(R.attr.activityOpenExitAnimation, context);
                            }
                            enterAnim = iOooO00o;
                        }
                        if (enterAnim == 0) {
                            oooO00o2 = null;
                        } else {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                            if (zEquals) {
                                try {
                                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation != null) {
                                        oooO00o = new oo000o.OooO00o(animationLoadAnimation);
                                    } else {
                                        z = true;
                                        if (z) {
                                            oooO00o2 = null;
                                        } else {
                                            try {
                                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                                if (animatorLoadAnimator != null) {
                                                    oooO00o = new oo000o.OooO00o(animatorLoadAnimator);
                                                } else {
                                                    oooO00o2 = null;
                                                }
                                            } catch (RuntimeException e) {
                                                if (zEquals) {
                                                    throw e;
                                                }
                                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                                if (animationLoadAnimation2 != null) {
                                                    oooO00o2 = new oo000o.OooO00o(animationLoadAnimation2);
                                                }
                                                this.f5917OooO0o0 = oooO00o2;
                                                this.f5916OooO0Oo = true;
                                                return oooO00o2;
                                            }
                                        }
                                    }
                                } catch (Resources.NotFoundException e2) {
                                    throw e2;
                                } catch (RuntimeException unused) {
                                }
                                oooO00o2 = oooO00o;
                            } else if (z) {
                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                if (animatorLoadAnimator != null) {
                                    oooO00o = new oo000o.OooO00o(animatorLoadAnimator);
                                    oooO00o2 = oooO00o;
                                } else {
                                    oooO00o2 = null;
                                }
                            } else {
                                oooO00o2 = null;
                            }
                        }
                    }
                }
            } else {
                oooO00o2 = null;
            }
            this.f5917OooO0o0 = oooO00o2;
            this.f5916OooO0Oo = true;
            return oooO00o2;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final SpecialEffectsController.Operation f5918OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final p063o0000oO.o0OoOo0 f5919OooO0O0;

        public OooO0O0(@NotNull SpecialEffectsController.Operation operation, @NotNull p063o0000oO.o0OoOo0 signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f5918OooO00o = operation;
            this.f5919OooO0O0 = signal;
        }

        public final void OooO00o() {
            SpecialEffectsController.Operation operation = this.f5918OooO00o;
            operation.getClass();
            p063o0000oO.o0OoOo0 signal = this.f5919OooO0O0;
            Intrinsics.checkNotNullParameter(signal, "signal");
            LinkedHashSet linkedHashSet = operation.f5957OooO0o0;
            if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
                operation.OooO0O0();
            }
        }

        public final boolean OooO0O0() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            SpecialEffectsController.Operation operation = this.f5918OooO00o;
            View view = operation.f5954OooO0OO.mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            companion.getClass();
            SpecialEffectsController.Operation.State stateOooO00o = SpecialEffectsController.Operation.State.Companion.OooO00o(view);
            SpecialEffectsController.Operation.State state2 = operation.f5952OooO00o;
            return stateOooO00o == state2 || !(stateOooO00o == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state);
        }
    }

    public static final class OooO0OO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Object f5920OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f5921OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Object f5922OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(@NotNull SpecialEffectsController.Operation operation, @NotNull p063o0000oO.o0OoOo0 signal, boolean z, boolean z2) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            SpecialEffectsController.Operation.State state = operation.f5952OooO00o;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            Fragment fragment = operation.f5954OooO0OO;
            this.f5920OooO0OO = state == state2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f5921OooO0Oo = operation.f5952OooO00o == state2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f5922OooO0o0 = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        @Nullable
        public final o000O000 OooO0OO() {
            Object obj = this.f5920OooO0OO;
            o000O000 o000o000OooO0Oo = OooO0Oo(obj);
            Object obj2 = this.f5922OooO0o0;
            o000O000 o000o000OooO0Oo2 = OooO0Oo(obj2);
            if (o000o000OooO0Oo == null || o000o000OooO0Oo2 == null || o000o000OooO0Oo == o000o000OooO0Oo2) {
                return o000o000OooO0Oo == null ? o000o000OooO0Oo2 : o000o000OooO0Oo;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f5918OooO00o.f5954OooO0OO + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final o000O000 OooO0Oo(Object obj) {
            if (obj == null) {
                return null;
            }
            o000OO o000oo2 = o0000O0.f5988OooO00o;
            if (o000oo2 != null && (obj instanceof Transition)) {
                return o000oo2;
            }
            o000O000 o000o001 = o0000O0.f5989OooO0O0;
            if (o000o001 != null && o000o001.OooO0o0(obj)) {
                return o000o001;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f5918OooO00o.f5954OooO0OO + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static void OooOOO(p190o00o0O.OooO oooO, View view) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view);
        if (strOooOO0O != null) {
            oooO.put(strOooOO0O, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    OooOOO(oooO, child);
                }
            }
        }
    }

    public static void OooOOO0(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (androidx.core.view.o000O00O.OooO0O0(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                OooOOO0(child, arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x063e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0643  */
    /* JADX WARN: Code duplicated, block: B:209:0x0649  */
    /* JADX WARN: Code duplicated, block: B:212:0x0657  */
    /* JADX WARN: Code duplicated, block: B:213:0x065f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void OooO0o(@NotNull List<? extends SpecialEffectsController.Operation> operations, final boolean z) {
        int i;
        String str;
        Object next;
        SpecialEffectsController.Operation operationPrevious;
        String str2;
        ArrayList<OooO00o> arrayList;
        List list;
        LinkedHashMap linkedHashMap;
        SpecialEffectsController.Operation operation;
        String str3;
        SpecialEffectsController.Operation operation2;
        SpecialEffectsController.Operation operation3;
        boolean z2;
        SpecialEffectsController.Operation operation4;
        p190o00o0O.OooOo oooOo;
        SpecialEffectsController.Operation operation5;
        String str4;
        p190o00o0O.OooO oooO;
        View view;
        View view2;
        ArrayList arrayList2;
        String str5;
        LinkedHashMap linkedHashMap2;
        String str6;
        Rect rect;
        o000O000 o000o001;
        Object obj;
        View view3;
        View view4;
        final OooOOO oooOOO;
        final SpecialEffectsController.Operation operation6;
        SpecialEffectsController.Operation operation7;
        SpecialEffectsController.Operation.State stateOooO00o;
        SpecialEffectsController.Operation.State state;
        SpecialEffectsController.Operation operation8;
        SpecialEffectsController.Operation.State stateOooO00o2;
        SpecialEffectsController.Operation.State state2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator<T> it = operations.iterator();
        do {
            i = 0;
            str = "operation.fragment.mView";
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            operation8 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view5 = operation8.f5954OooO0OO.mView;
            Intrinsics.checkNotNullExpressionValue(view5, "operation.fragment.mView");
            companion.getClass();
            stateOooO00o2 = SpecialEffectsController.Operation.State.Companion.OooO00o(view5);
            state2 = SpecialEffectsController.Operation.State.VISIBLE;
        } while (!(stateOooO00o2 == state2 && operation8.f5952OooO00o != state2));
        final SpecialEffectsController.Operation operation9 = (SpecialEffectsController.Operation) next;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        do {
            if (!listIterator.hasPrevious()) {
                operationPrevious = null;
                break;
            }
            operationPrevious = listIterator.previous();
            operation7 = operationPrevious;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
            View view6 = operation7.f5954OooO0OO.mView;
            Intrinsics.checkNotNullExpressionValue(view6, "operation.fragment.mView");
            companion2.getClass();
            stateOooO00o = SpecialEffectsController.Operation.State.Companion.OooO00o(view6);
            state = SpecialEffectsController.Operation.State.VISIBLE;
        } while (!(stateOooO00o != state && operation7.f5952OooO00o == state));
        final SpecialEffectsController.Operation operation10 = operationPrevious;
        String str7 = "FragmentManager";
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation9 + " to " + operation10);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<OooO0OO> arrayList4 = new ArrayList();
        List mutableList = CollectionsKt.toMutableList((Collection) operations);
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) operations)).f5954OooO0OO;
        Iterator<? extends SpecialEffectsController.Operation> it2 = operations.iterator();
        while (it2.hasNext()) {
            Fragment.OooOOOO oooOOOO = it2.next().f5954OooO0OO.mAnimationInfo;
            Fragment.OooOOOO oooOOOO2 = fragment.mAnimationInfo;
            oooOOOO.f5791OooO0O0 = oooOOOO2.f5791OooO0O0;
            oooOOOO.f5792OooO0OO = oooOOOO2.f5792OooO0OO;
            oooOOOO.f5793OooO0Oo = oooOOOO2.f5793OooO0Oo;
            oooOOOO.f5795OooO0o0 = oooOOOO2.f5795OooO0o0;
        }
        Iterator<? extends SpecialEffectsController.Operation> it3 = operations.iterator();
        while (it3.hasNext()) {
            SpecialEffectsController.Operation next2 = it3.next();
            p063o0000oO.o0OoOo0 signal = new p063o0000oO.o0OoOo0();
            next2.getClass();
            Intrinsics.checkNotNullParameter(signal, "signal");
            next2.OooO0Oo();
            next2.f5957OooO0o0.add(signal);
            arrayList3.add(new OooO00o(next2, signal, z));
            p063o0000oO.o0OoOo0 signal2 = new p063o0000oO.o0OoOo0();
            Intrinsics.checkNotNullParameter(signal2, "signal");
            next2.OooO0Oo();
            next2.f5957OooO0o0.add(signal2);
            arrayList4.add(new OooO0OO(next2, signal2, z, !z ? next2 != operation10 : next2 != operation9));
            androidx.fragment.app.OooO0O0 listener = new androidx.fragment.app.OooO0O0(i, mutableList, next2, this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            next2.f5955OooO0Oo.add(listener);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (!((OooO0OO) obj2).OooO0O0()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList<OooO0OO> arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            if (((OooO0OO) obj3).OooO0OO() != null) {
                arrayList6.add(obj3);
            }
        }
        o000O000 o000o002 = null;
        for (OooO0OO oooO0OO : arrayList6) {
            o000O000 o000o000OooO0OO = oooO0OO.OooO0OO();
            if (!(o000o002 == null || o000o000OooO0OO == o000o002)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + oooO0OO.f5918OooO00o.f5954OooO0OO + " returned Transition " + oooO0OO.f5920OooO0OO + " which uses a different Transition type than other Fragments.").toString());
            }
            o000o002 = o000o000OooO0OO;
        }
        ViewGroup viewGroup = this.f5946OooO00o;
        if (o000o002 == null) {
            for (OooO0OO oooO0OO2 : arrayList4) {
                linkedHashMap3.put(oooO0OO2.f5918OooO00o, Boolean.FALSE);
                oooO0OO2.OooO00o();
            }
            arrayList = arrayList3;
            z2 = false;
            operation3 = operation9;
            operation2 = operation10;
            str2 = " to ";
            str3 = "FragmentManager";
            list = mutableList;
            linkedHashMap = linkedHashMap3;
        } else {
            View view7 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList7 = new ArrayList<>();
            str2 = " to ";
            ArrayList<View> arrayList8 = new ArrayList<>();
            p190o00o0O.OooO oooO2 = new p190o00o0O.OooO();
            Iterator it4 = arrayList4.iterator();
            boolean z3 = z;
            arrayList = arrayList3;
            View view8 = null;
            Object obj4 = null;
            boolean z4 = false;
            while (it4.hasNext()) {
                mutableList = mutableList;
                Object obj5 = ((OooO0OO) it4.next()).f5922OooO0o0;
                if (!(obj5 != null) || operation9 == null || operation10 == null) {
                    arrayList2 = arrayList4;
                    str5 = str;
                    linkedHashMap2 = linkedHashMap3;
                    str6 = str7;
                    rect = rect2;
                    o000o001 = o000o002;
                    obj = obj4;
                    view3 = view8;
                    view8 = view3;
                    obj4 = obj;
                    o000o002 = o000o001;
                    str = str5;
                    arrayList4 = arrayList2;
                    str7 = str6;
                    rect2 = rect;
                    linkedHashMap3 = linkedHashMap2;
                } else {
                    Object objOooOOo = o000o002.OooOOo(o000o002.OooO0o(obj5));
                    Fragment fragment2 = operation10.f5954OooO0OO;
                    str5 = str;
                    ArrayList<String> sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                    arrayList2 = arrayList4;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment fragment3 = operation9.f5954OooO0OO;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                    View view9 = view7;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    o000O000 o000o003 = o000o002;
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                        }
                        i2++;
                        size = i3;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z3 ? TuplesKt.to(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : TuplesKt.to(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                    o00000O.oo0o0Oo oo0o0oo = (o00000O.oo0o0Oo) pair.component1();
                    o00000O.oo0o0Oo oo0o0oo2 = (o00000O.oo0o0Oo) pair.component2();
                    int size2 = sharedElementSourceNames.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        oooO2.put(sharedElementSourceNames.get(i4), sharedElementTargetNames2.get(i4));
                        i4++;
                        size2 = size2;
                        viewGroup = viewGroup;
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str7, ">>> entering view names <<<");
                        for (Iterator<String> it5 = sharedElementTargetNames2.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v(str7, "Name: " + it5.next());
                        }
                        Log.v(str7, ">>> exiting view names <<<");
                        for (Iterator<String> it6 = sharedElementSourceNames.iterator(); it6.hasNext(); it6 = it6) {
                            Log.v(str7, "Name: " + it6.next());
                        }
                    }
                    p190o00o0O.OooO oooO3 = new p190o00o0O.OooO();
                    View view10 = fragment3.mView;
                    Intrinsics.checkNotNullExpressionValue(view10, "firstOut.fragment.mView");
                    OooOOO(oooO3, view10);
                    oooO3.OooOOO0(sharedElementSourceNames);
                    if (oo0o0oo != null) {
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v(str7, "Executing exit callback for operation " + operation9);
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i5 = size3 - 1;
                                String str8 = sharedElementSourceNames.get(size3);
                                View view11 = (View) oooO3.getOrDefault(str8, null);
                                if (view11 == null) {
                                    oooO2.remove(str8);
                                } else {
                                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                                    if (!Intrinsics.areEqual(str8, ViewCompat.OooOOO.OooOO0O(view11))) {
                                        oooO2.put(ViewCompat.OooOOO.OooOO0O(view11), (String) oooO2.remove(str8));
                                    }
                                }
                                if (i5 < 0) {
                                    break;
                                } else {
                                    size3 = i5;
                                }
                            }
                        }
                    } else {
                        oooO2.OooOOO0(oooO3.keySet());
                    }
                    final p190o00o0O.OooO namedViews = new p190o00o0O.OooO();
                    View view12 = fragment2.mView;
                    Intrinsics.checkNotNullExpressionValue(view12, "lastIn.fragment.mView");
                    OooOOO(namedViews, view12);
                    namedViews.OooOOO0(sharedElementTargetNames2);
                    namedViews.OooOOO0(oooO2.values());
                    if (oo0o0oo2 != null) {
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v(str7, "Executing enter callback for operation " + operation10);
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i6 = size4 - 1;
                                String name = sharedElementTargetNames2.get(size4);
                                View view13 = (View) namedViews.getOrDefault(name, null);
                                if (view13 == null) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String strOooO0O0 = o0000O0.OooO0O0(oooO2, name);
                                    if (strOooO0O0 != null) {
                                        oooO2.remove(strOooO0O0);
                                    }
                                    str6 = str7;
                                } else {
                                    WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                                    str6 = str7;
                                    if (!Intrinsics.areEqual(name, ViewCompat.OooOOO.OooOO0O(view13))) {
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        String strOooO0O1 = o0000O0.OooO0O0(oooO2, name);
                                        if (strOooO0O1 != null) {
                                            oooO2.put(strOooO0O1, ViewCompat.OooOOO.OooOO0O(view13));
                                        }
                                    }
                                }
                                if (i6 < 0) {
                                    break;
                                }
                                size4 = i6;
                                str7 = str6;
                            }
                        } else {
                            str6 = str7;
                        }
                    } else {
                        str6 = str7;
                        o000OO o000oo2 = o0000O0.f5988OooO00o;
                        Intrinsics.checkNotNullParameter(oooO2, "<this>");
                        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                        for (int i7 = oooO2.f38568OooO0o - 1; -1 < i7; i7--) {
                            if (!namedViews.containsKey((String) oooO2.OooOO0o(i7))) {
                                oooO2.OooOO0(i7);
                            }
                        }
                    }
                    Set setKeySet = oooO2.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                    Set entries = oooO3.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries, "entries");
                    CollectionsKt.retainAll(entries, new OooOOOO(setKeySet));
                    Collection collectionValues = oooO2.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                    Set entries2 = namedViews.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                    CollectionsKt.retainAll(entries2, new OooOOOO(collectionValues));
                    if (oooO2.isEmpty()) {
                        arrayList7.clear();
                        arrayList8.clear();
                        z3 = z;
                        str = str5;
                        arrayList4 = arrayList2;
                        linkedHashMap3 = linkedHashMap4;
                        view7 = view9;
                        rect2 = rect3;
                        o000o002 = o000o003;
                        viewGroup = viewGroup2;
                        str7 = str6;
                        obj4 = null;
                    } else {
                        o0000O0.OooO00o(fragment2, fragment3, z, oooO3);
                        viewGroup = viewGroup2;
                        androidx.core.view.o00000O.OooO00o(viewGroup, new Runnable() { // from class: androidx.fragment.app.OooO0OO
                            @Override // java.lang.Runnable
                            public final void run() {
                                p190o00o0O.OooO lastInViews = namedViews;
                                Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
                                o0000O0.OooO00o(operation10.f5954OooO0OO, operation9.f5954OooO0OO, z, lastInViews);
                            }
                        });
                        arrayList7.addAll(oooO3.values());
                        if (!sharedElementSourceNames.isEmpty()) {
                            view3 = (View) oooO3.getOrDefault(sharedElementSourceNames.get(0), null);
                            obj = objOooOOo;
                            o000o001 = o000o003;
                            o000o001.OooOOO0(view3, obj);
                        } else {
                            obj = objOooOOo;
                            o000o001 = o000o003;
                            view3 = view8;
                        }
                        arrayList8.addAll(namedViews.values());
                        if (!(!sharedElementTargetNames2.isEmpty()) || (view4 = (View) namedViews.getOrDefault(sharedElementTargetNames2.get(0), null)) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            androidx.core.view.o00000O.OooO00o(viewGroup, new OooO0o(0, o000o001, view4, rect));
                            z4 = true;
                        }
                        view7 = view9;
                        o000o001.OooOOOo(obj, view7, arrayList7);
                        o000o001.OooOO0o(obj, null, null, obj, arrayList8);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(operation9, bool);
                        linkedHashMap2.put(operation10, bool);
                        z3 = z;
                        view8 = view3;
                        obj4 = obj;
                        o000o002 = o000o001;
                        str = str5;
                        arrayList4 = arrayList2;
                        str7 = str6;
                        rect2 = rect;
                        linkedHashMap3 = linkedHashMap2;
                    }
                }
            }
            ArrayList arrayList9 = arrayList4;
            String str9 = str;
            String str10 = str7;
            list = mutableList;
            linkedHashMap = linkedHashMap3;
            Rect rect4 = rect2;
            o000O000 o000o004 = o000o002;
            ArrayList arrayList10 = new ArrayList();
            Iterator it7 = arrayList9.iterator();
            Object objOooOO0 = null;
            Object objOooOO1 = null;
            while (it7.hasNext()) {
                OooO0OO oooO0OO3 = (OooO0OO) it7.next();
                boolean zOooO0O0 = oooO0OO3.OooO0O0();
                it7 = it7;
                SpecialEffectsController.Operation operation11 = oooO0OO3.f5918OooO00o;
                if (zOooO0O0) {
                    oooO = oooO2;
                    linkedHashMap.put(operation11, Boolean.FALSE);
                    oooO0OO3.OooO00o();
                } else {
                    oooO = oooO2;
                    Object objOooO0o = o000o004.OooO0o(oooO0OO3.f5920OooO0OO);
                    boolean z5 = obj4 != null && (operation11 == operation9 || operation11 == operation10);
                    if (objOooO0o != null) {
                        SpecialEffectsController.Operation operation12 = operation10;
                        final ArrayList arrayList11 = new ArrayList();
                        Object obj6 = obj4;
                        View view14 = operation11.f5954OooO0OO.mView;
                        Object obj7 = objOooOO0;
                        str9 = str9;
                        Intrinsics.checkNotNullExpressionValue(view14, str9);
                        OooOOO0(view14, arrayList11);
                        if (z5) {
                            if (operation11 == operation9) {
                                arrayList11.removeAll(CollectionsKt.toSet(arrayList7));
                            } else {
                                arrayList11.removeAll(CollectionsKt.toSet(arrayList8));
                            }
                        }
                        if (arrayList11.isEmpty()) {
                            o000o004.OooO00o(view7, objOooO0o);
                            view = view7;
                        } else {
                            o000o004.OooO0O0(arrayList11, objOooO0o);
                            o000o004.OooOO0o(objOooO0o, objOooO0o, arrayList11, null, null);
                            view = view7;
                            if (operation11.f5952OooO00o == SpecialEffectsController.Operation.State.GONE) {
                                list.remove(operation11);
                                ArrayList<View> arrayList12 = new ArrayList<>(arrayList11);
                                Fragment fragment4 = operation11.f5954OooO0OO;
                                arrayList12.remove(fragment4.mView);
                                o000o004.OooOO0O(objOooO0o, fragment4.mView, arrayList12);
                                androidx.core.view.o00000O.OooO00o(viewGroup, new Runnable() { // from class: androidx.fragment.app.OooO
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ArrayList transitioningViews = arrayList11;
                                        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                                        o0000O0.OooO0OO(4, transitioningViews);
                                    }
                                });
                            }
                            if (operation11.f5952OooO00o == SpecialEffectsController.Operation.State.VISIBLE) {
                                arrayList10.addAll(arrayList11);
                                if (z4) {
                                    o000o004.OooOOO(objOooO0o, rect4);
                                }
                                view2 = view8;
                            } else {
                                view2 = view8;
                                o000o004.OooOOO0(view2, objOooO0o);
                            }
                            linkedHashMap.put(operation11, Boolean.TRUE);
                            if (oooO0OO3.f5921OooO0Oo) {
                                objOooOO1 = o000o004.OooOO0(objOooOO1, objOooO0o);
                                objOooOO0 = obj7;
                            } else {
                                objOooOO0 = o000o004.OooOO0(obj7, objOooO0o);
                            }
                            view8 = view2;
                            oooO2 = oooO;
                            view7 = view;
                            operation10 = operation12;
                            obj4 = obj6;
                        }
                        if (operation11.f5952OooO00o == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList10.addAll(arrayList11);
                            if (z4) {
                                o000o004.OooOOO(objOooO0o, rect4);
                            }
                            view2 = view8;
                        } else {
                            view2 = view8;
                            o000o004.OooOOO0(view2, objOooO0o);
                        }
                        linkedHashMap.put(operation11, Boolean.TRUE);
                        if (oooO0OO3.f5921OooO0Oo) {
                            objOooOO1 = o000o004.OooOO0(objOooOO1, objOooO0o);
                            objOooOO0 = obj7;
                        } else {
                            objOooOO0 = o000o004.OooOO0(obj7, objOooO0o);
                        }
                        view8 = view2;
                        oooO2 = oooO;
                        view7 = view;
                        operation10 = operation12;
                        obj4 = obj6;
                    } else if (!z5) {
                        linkedHashMap.put(operation11, Boolean.FALSE);
                        oooO0OO3.OooO00o();
                    }
                }
                oooO2 = oooO;
            }
            Object obj8 = obj4;
            p190o00o0O.OooOo oooOo2 = oooO2;
            SpecialEffectsController.Operation operation13 = operation10;
            Object objOooO = o000o004.OooO(objOooOO1, objOooOO0, obj8);
            if (objOooO == null) {
                operation = operation13;
                str3 = str10;
            } else {
                ArrayList<OooO0OO> arrayList13 = new ArrayList();
                for (Object obj9 : arrayList9) {
                    if (!((OooO0OO) obj9).OooO0O0()) {
                        arrayList13.add(obj9);
                    }
                }
                for (OooO0OO oooO0OO4 : arrayList13) {
                    Object obj10 = oooO0OO4.f5920OooO0OO;
                    SpecialEffectsController.Operation operation14 = oooO0OO4.f5918OooO00o;
                    SpecialEffectsController.Operation operation15 = operation13;
                    boolean z6 = obj8 != null && (operation14 == operation9 || operation14 == operation15);
                    if (obj10 != null || z6) {
                        WeakHashMap<View, o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
                        if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                            str4 = str10;
                            Fragment fragment5 = operation14.f5954OooO0OO;
                            o000o004.OooOOOO(objOooO, oooO0OO4.f5919OooO0O0, new OooOO0(oooO0OO4, operation14));
                        } else {
                            if (FragmentManager.Oooo0O0(2)) {
                                str4 = str10;
                                Log.v(str4, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation14);
                            } else {
                                str4 = str10;
                            }
                            oooO0OO4.OooO00o();
                        }
                    } else {
                        str4 = str10;
                    }
                    operation13 = operation15;
                    str10 = str4;
                }
                operation = operation13;
                str3 = str10;
                WeakHashMap<View, o000OOo0> weakHashMap4 = ViewCompat.f5341OooO00o;
                if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                    o0000O0.OooO0OO(4, arrayList10);
                    ArrayList arrayList14 = new ArrayList();
                    int size5 = arrayList8.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        View view15 = arrayList8.get(i8);
                        WeakHashMap<View, o000OOo0> weakHashMap5 = ViewCompat.f5341OooO00o;
                        arrayList14.add(ViewCompat.OooOOO.OooOO0O(view15));
                        ViewCompat.OooOOO.OooOo0O(view15, null);
                    }
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str3, ">>>>> Beginning transition <<<<<");
                        Log.v(str3, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator<View> it8 = arrayList7.iterator(); it8.hasNext(); it8 = it8) {
                            View sharedElementFirstOutViews = it8.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view16 = sharedElementFirstOutViews;
                            Log.v(str3, "View: " + view16 + " Name: " + ViewCompat.OooOOO.OooOO0O(view16));
                        }
                        Log.v(str3, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator<View> it9 = arrayList8.iterator(); it9.hasNext(); it9 = it9) {
                            View sharedElementLastInViews = it9.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                            View view17 = sharedElementLastInViews;
                            Log.v(str3, "View: " + view17 + " Name: " + ViewCompat.OooOOO.OooOO0O(view17));
                        }
                    }
                    o000o004.OooO0OO(viewGroup, objOooO);
                    int size6 = arrayList8.size();
                    ArrayList arrayList15 = new ArrayList();
                    int i9 = 0;
                    while (i9 < size6) {
                        View view18 = arrayList7.get(i9);
                        WeakHashMap<View, o000OOo0> weakHashMap6 = ViewCompat.f5341OooO00o;
                        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view18);
                        arrayList15.add(strOooOO0O);
                        if (strOooOO0O == null) {
                            operation4 = operation;
                            operation5 = operation9;
                            oooOo = oooOo2;
                        } else {
                            operation4 = operation;
                            ViewCompat.OooOOO.OooOo0O(view18, null);
                            p190o00o0O.OooOo oooOo3 = oooOo2;
                            String str11 = (String) oooOo3.getOrDefault(strOooOO0O, null);
                            oooOo = oooOo3;
                            int i10 = 0;
                            while (true) {
                                operation5 = operation9;
                                if (i10 >= size6) {
                                    break;
                                }
                                if (str11.equals(arrayList14.get(i10))) {
                                    ViewCompat.OooOOO.OooOo0O(arrayList8.get(i10), strOooOO0O);
                                    break;
                                } else {
                                    i10++;
                                    operation9 = operation5;
                                }
                            }
                        }
                        i9++;
                        oooOo2 = oooOo;
                        operation9 = operation5;
                        operation = operation4;
                    }
                    operation2 = operation;
                    operation3 = operation9;
                    androidx.core.view.o00000O.OooO00o(viewGroup, new o000(size6, arrayList8, arrayList14, arrayList7, arrayList15));
                    z2 = false;
                    o0000O0.OooO0OO(0, arrayList10);
                    o000o004.OooOOo0(obj8, arrayList7, arrayList8);
                }
            }
            operation2 = operation;
            operation3 = operation9;
            z2 = false;
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList<OooO00o> arrayList16 = new ArrayList();
        boolean z7 = z2;
        for (OooO00o oooO00o : arrayList) {
            if (oooO00o.OooO0O0()) {
                oooO00o.OooO00o();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oo000o.OooO00o oooO00oOooO0OO = oooO00o.OooO0OO(context);
                if (oooO00oOooO0OO == null) {
                    oooO00o.OooO00o();
                } else {
                    final Animator animator = oooO00oOooO0OO.f6059OooO0O0;
                    if (animator == null) {
                        arrayList16.add(oooO00o);
                    } else {
                        SpecialEffectsController.Operation operation16 = oooO00o.f5918OooO00o;
                        Fragment fragment6 = operation16.f5954OooO0OO;
                        if (Intrinsics.areEqual(linkedHashMap.get(operation16), Boolean.TRUE)) {
                            if (FragmentManager.Oooo0O0(2)) {
                                Log.v(str3, "Ignoring Animator set on " + fragment6 + " as this Fragment was involved in a Transition.");
                            }
                            oooO00o.OooO00o();
                        } else {
                            boolean z8 = operation16.f5952OooO00o == SpecialEffectsController.Operation.State.GONE ? true : z2;
                            List list2 = list;
                            if (z8) {
                                list2.remove(operation16);
                            }
                            View view19 = fragment6.mView;
                            viewGroup.startViewTransition(view19);
                            animator.addListener(new OooOo00(this, view19, z8, operation16, oooO00o));
                            animator.setTarget(view19);
                            animator.start();
                            if (FragmentManager.Oooo0O0(2)) {
                                StringBuilder sb = new StringBuilder("Animator from operation ");
                                operation6 = operation16;
                                sb.append(operation6);
                                sb.append(" has started.");
                                Log.v(str3, sb.toString());
                            } else {
                                operation6 = operation16;
                            }
                            oooO00o.f5919OooO0O0.OooO0O0(new o0000oO.o0OoOo0.OooO00o() { // from class: androidx.fragment.app.OooOO0O
                                @Override // o0000oO.o0OoOo0.OooO00o
                                public final void onCancel() {
                                    SpecialEffectsController.Operation operation17 = operation6;
                                    Intrinsics.checkNotNullParameter(operation17, "$operation");
                                    animator.end();
                                    if (FragmentManager.Oooo0O0(2)) {
                                        Log.v("FragmentManager", "Animator from operation " + operation17 + " has been canceled.");
                                    }
                                }
                            });
                            list = list2;
                            z7 = true;
                            z2 = false;
                        }
                    }
                }
            }
        }
        List<SpecialEffectsController.Operation> list3 = list;
        for (final OooO00o oooO00o2 : arrayList16) {
            final SpecialEffectsController.Operation operation17 = oooO00o2.f5918OooO00o;
            Fragment fragment7 = operation17.f5954OooO0OO;
            if (zContainsValue) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment7 + " as Animations cannot run alongside Transitions.");
                }
                oooO00o2.OooO00o();
            } else if (z7) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v(str3, "Ignoring Animation set on " + fragment7 + " as Animations cannot run alongside Animators.");
                }
                oooO00o2.OooO00o();
            } else {
                final View view20 = fragment7.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oo000o.OooO00o oooO00oOooO0OO2 = oooO00o2.OooO0OO(context);
                if (oooO00oOooO0OO2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation = oooO00oOooO0OO2.f6058OooO00o;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation17.f5952OooO00o != SpecialEffectsController.Operation.State.REMOVED) {
                    view20.startAnimation(animation);
                    oooO00o2.OooO00o();
                    oooOOO = this;
                } else {
                    viewGroup.startViewTransition(view20);
                    oo000o.OooO0O0 oooO0O0 = new oo000o.OooO0O0(animation, viewGroup, view20);
                    oooOOO = this;
                    oooO0O0.setAnimationListener(new Oooo000(view20, oooO00o2, oooOOO, operation17));
                    view20.startAnimation(oooO0O0);
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str3, "Animation from operation " + operation17 + " has started.");
                    }
                }
                oooO00o2.f5919OooO0O0.OooO0O0(new o0000oO.o0OoOo0.OooO00o() { // from class: androidx.fragment.app.OooOOO0
                    @Override // o0000oO.o0OoOo0.OooO00o
                    public final void onCancel() {
                        OooOOO this$0 = oooOOO;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        OooOOO.OooO00o animationInfo = oooO00o2;
                        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                        SpecialEffectsController.Operation operation18 = operation17;
                        Intrinsics.checkNotNullParameter(operation18, "$operation");
                        View view21 = view20;
                        view21.clearAnimation();
                        this$0.f5946OooO00o.endViewTransition(view21);
                        animationInfo.OooO00o();
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v("FragmentManager", "Animation from operation " + operation18 + " has been cancelled.");
                        }
                    }
                });
            }
        }
        for (SpecialEffectsController.Operation operation18 : list3) {
            View view21 = operation18.f5954OooO0OO.mView;
            SpecialEffectsController.Operation.State state3 = operation18.f5952OooO00o;
            Intrinsics.checkNotNullExpressionValue(view21, "view");
            state3.OooO00o(view21);
        }
        list3.clear();
        if (FragmentManager.Oooo0O0(2)) {
            Log.v(str3, "Completed executing operations from " + operation3 + str2 + operation2);
        }
    }
}
