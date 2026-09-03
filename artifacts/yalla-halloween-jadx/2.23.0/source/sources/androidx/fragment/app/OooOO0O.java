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
import androidx.appcompat.widget.o000OO00;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
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
public final class OooOO0O extends SpecialEffectsController {

    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f5900OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f5901OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public o00Ooo.OooO00o f5902OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull SpecialEffectsController.Operation operation, @NotNull p063o0000oO.oo000o signal, boolean z) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f5900OooO0OO = z;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        /* JADX WARN: Code duplicated, block: B:75:0x00f8 A[Catch: RuntimeException -> 0x00fe, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00fe, blocks: (B:73:0x00f2, B:75:0x00f8), top: B:86:0x00f2 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Nullable
        public final o00Ooo.OooO00o OooO0OO(@NotNull Context context) {
            int enterAnim;
            o00Ooo.OooO00o oooO00o;
            o00Ooo.OooO00o oooO00o2;
            Animator animatorLoadAnimator;
            int iOooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.f5901OooO0Oo) {
                return this.f5902OooO0o0;
            }
            SpecialEffectsController.Operation operation = this.f5903OooO00o;
            Fragment fragment = operation.f5936OooO0OO;
            boolean z = false;
            boolean z2 = operation.f5934OooO00o == SpecialEffectsController.Operation.State.VISIBLE;
            int nextTransition = fragment.getNextTransition();
            if (this.f5900OooO0OO) {
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
                    oooO00o2 = new o00Ooo.OooO00o(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, enterAnim);
                    if (animatorOnCreateAnimator != null) {
                        oooO00o2 = new o00Ooo.OooO00o(animatorOnCreateAnimator);
                    } else {
                        if (enterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                iOooO00o = z2 ? p062o0000o0o.o000000.fragment_open_enter : p062o0000o0o.o000000.fragment_open_exit;
                            } else if (nextTransition == 8194) {
                                iOooO00o = z2 ? p062o0000o0o.o000000.fragment_close_enter : p062o0000o0o.o000000.fragment_close_exit;
                            } else if (nextTransition == 8197) {
                                iOooO00o = z2 ? o00Ooo.OooO00o(R.attr.activityCloseEnterAnimation, context) : o00Ooo.OooO00o(R.attr.activityCloseExitAnimation, context);
                            } else if (nextTransition == 4099) {
                                iOooO00o = z2 ? p062o0000o0o.o000000.fragment_fade_enter : p062o0000o0o.o000000.fragment_fade_exit;
                            } else if (nextTransition != 4100) {
                                iOooO00o = -1;
                            } else {
                                iOooO00o = z2 ? o00Ooo.OooO00o(R.attr.activityOpenEnterAnimation, context) : o00Ooo.OooO00o(R.attr.activityOpenExitAnimation, context);
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
                                        oooO00o = new o00Ooo.OooO00o(animationLoadAnimation);
                                    } else {
                                        z = true;
                                        if (z) {
                                            oooO00o2 = null;
                                        } else {
                                            try {
                                                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                                if (animatorLoadAnimator != null) {
                                                    oooO00o = new o00Ooo.OooO00o(animatorLoadAnimator);
                                                } else {
                                                    oooO00o2 = null;
                                                }
                                            } catch (RuntimeException e) {
                                                if (zEquals) {
                                                    throw e;
                                                }
                                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                                if (animationLoadAnimation2 != null) {
                                                    oooO00o2 = new o00Ooo.OooO00o(animationLoadAnimation2);
                                                }
                                                this.f5902OooO0o0 = oooO00o2;
                                                this.f5901OooO0Oo = true;
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
                                    oooO00o = new o00Ooo.OooO00o(animatorLoadAnimator);
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
            this.f5902OooO0o0 = oooO00o2;
            this.f5901OooO0Oo = true;
            return oooO00o2;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final SpecialEffectsController.Operation f5903OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final p063o0000oO.oo000o f5904OooO0O0;

        public OooO0O0(@NotNull SpecialEffectsController.Operation operation, @NotNull p063o0000oO.oo000o signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.f5903OooO00o = operation;
            this.f5904OooO0O0 = signal;
        }

        public final void OooO00o() {
            SpecialEffectsController.Operation operation = this.f5903OooO00o;
            operation.getClass();
            p063o0000oO.oo000o signal = this.f5904OooO0O0;
            Intrinsics.checkNotNullParameter(signal, "signal");
            LinkedHashSet linkedHashSet = operation.f5939OooO0o0;
            if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
                operation.OooO0O0();
            }
        }

        public final boolean OooO0O0() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            SpecialEffectsController.Operation operation = this.f5903OooO00o;
            View view = operation.f5936OooO0OO.mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            companion.getClass();
            SpecialEffectsController.Operation.State stateOooO00o = SpecialEffectsController.Operation.State.Companion.OooO00o(view);
            SpecialEffectsController.Operation.State state2 = operation.f5934OooO00o;
            return stateOooO00o == state2 || !(stateOooO00o == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state);
        }
    }

    public static final class OooO0OO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Object f5905OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f5906OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Object f5907OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(@NotNull SpecialEffectsController.Operation operation, @NotNull p063o0000oO.oo000o signal, boolean z, boolean z2) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            SpecialEffectsController.Operation.State state = operation.f5934OooO00o;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            Fragment fragment = operation.f5936OooO0OO;
            this.f5905OooO0OO = state == state2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f5906OooO0Oo = operation.f5934OooO00o == state2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f5907OooO0o0 = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        @Nullable
        public final o000 OooO0OO() {
            Object obj = this.f5905OooO0OO;
            o000 o000VarOooO0Oo = OooO0Oo(obj);
            Object obj2 = this.f5907OooO0o0;
            o000 o000VarOooO0Oo2 = OooO0Oo(obj2);
            if (o000VarOooO0Oo == null || o000VarOooO0Oo2 == null || o000VarOooO0Oo == o000VarOooO0Oo2) {
                return o000VarOooO0Oo == null ? o000VarOooO0Oo2 : o000VarOooO0Oo;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f5903OooO00o.f5936OooO0OO + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final o000 OooO0Oo(Object obj) {
            if (obj == null) {
                return null;
            }
            o0000O0O o0000o0o2 = o0000oo.f6000OooO00o;
            if (o0000o0o2 != null && (obj instanceof Transition)) {
                return o0000o0o2;
            }
            o000 o000Var = o0000oo.f6001OooO0O0;
            if (o000Var != null && o000Var.OooO0o0(obj)) {
                return o000Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f5903OooO00o.f5936OooO0OO + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(@NotNull ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public static void OooOOO(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (androidx.core.view.o000.OooO0O0(viewGroup)) {
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
                OooOOO(child, arrayList);
            }
        }
    }

    public static void OooOOOO(p188o00o0O.OooOO0 oooOO1, View view) {
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view);
        if (strOooOO0O != null) {
            oooOO1.put(strOooOO0O, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    OooOOOO(oooOO1, child);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x0631  */
    /* JADX WARN: Code duplicated, block: B:207:0x0636  */
    /* JADX WARN: Code duplicated, block: B:209:0x063c  */
    /* JADX WARN: Code duplicated, block: B:212:0x064a  */
    /* JADX WARN: Code duplicated, block: B:213:0x0652  */
    /* JADX WARN: Code duplicated, block: B:279:0x085a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0897  */
    /* JADX WARN: Code duplicated, block: B:296:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:297:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:300:0x08be  */
    /* JADX WARN: Code duplicated, block: B:303:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:304:0x0902  */
    /* JADX WARN: Code duplicated, block: B:309:0x0920  */
    /* JADX WARN: Code duplicated, block: B:313:0x0935  */
    /* JADX WARN: Code duplicated, block: B:318:0x0956  */
    /* JADX WARN: Code duplicated, block: B:322:0x097b  */
    /* JADX WARN: Code duplicated, block: B:324:0x097f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0985  */
    /* JADX WARN: Code duplicated, block: B:327:0x098e  */
    /* JADX WARN: Code duplicated, block: B:329:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:338:0x09ee A[LOOP:10: B:336:0x09e8->B:338:0x09ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:371:0x086b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x0878 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0874 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x0880 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x08b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x087c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0890 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x094d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x092e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x096e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x09d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x09ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x094f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:292:0x0897, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:313:0x0935, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:318:0x0956, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:329:0x09aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:341:0x0a0e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void OooO0oO(@NotNull List<? extends SpecialEffectsController.Operation> operations, final boolean z) {
        String str;
        Object next;
        SpecialEffectsController.Operation operationPrevious;
        String str2;
        ArrayList<OooO00o> arrayList;
        List list;
        SpecialEffectsController.Operation operation;
        SpecialEffectsController.Operation operation2;
        boolean z2;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        String str3;
        p188o00o0O.OooOO0 oooOO1;
        View view;
        View view2;
        ArrayList arrayList2;
        String str4;
        String str5;
        final Rect rect;
        final o000 o000Var;
        Object obj;
        View view3;
        final View view4;
        boolean zContainsValue;
        Context context;
        ArrayList<OooO00o> arrayList3;
        boolean z3;
        final SpecialEffectsController.Operation operation5;
        Fragment fragment;
        final View view5;
        o00Ooo.OooO00o oooO00oOooO0OO;
        Animation animation;
        final OooOO0O oooOO0O;
        o00Ooo.OooO00o oooO00oOooO0OO2;
        Animator animator;
        SpecialEffectsController.Operation operation6;
        Fragment fragment2;
        boolean z4;
        List list2;
        SpecialEffectsController.Operation operation7;
        SpecialEffectsController.Operation operation8;
        SpecialEffectsController.Operation.State stateOooO00o;
        SpecialEffectsController.Operation.State state;
        SpecialEffectsController.Operation operation9;
        SpecialEffectsController.Operation.State stateOooO00o2;
        SpecialEffectsController.Operation.State state2;
        Intrinsics.checkNotNullParameter(operations, "operations");
        Iterator<T> it = operations.iterator();
        do {
            str = "operation.fragment.mView";
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            operation9 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.INSTANCE;
            View view6 = operation9.f5936OooO0OO.mView;
            Intrinsics.checkNotNullExpressionValue(view6, "operation.fragment.mView");
            companion.getClass();
            stateOooO00o2 = SpecialEffectsController.Operation.State.Companion.OooO00o(view6);
            state2 = SpecialEffectsController.Operation.State.VISIBLE;
        } while (!(stateOooO00o2 == state2 && operation9.f5934OooO00o != state2));
        final SpecialEffectsController.Operation operation10 = (SpecialEffectsController.Operation) next;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        do {
            if (!listIterator.hasPrevious()) {
                operationPrevious = null;
                break;
            }
            operationPrevious = listIterator.previous();
            operation8 = operationPrevious;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.INSTANCE;
            View view7 = operation8.f5936OooO0OO.mView;
            Intrinsics.checkNotNullExpressionValue(view7, "operation.fragment.mView");
            companion2.getClass();
            stateOooO00o = SpecialEffectsController.Operation.State.Companion.OooO00o(view7);
            state = SpecialEffectsController.Operation.State.VISIBLE;
        } while (!(stateOooO00o != state && operation8.f5934OooO00o == state));
        final SpecialEffectsController.Operation operation11 = operationPrevious;
        String str6 = "FragmentManager";
        if (FragmentManager.Oooo0O0(2)) {
            Log.v("FragmentManager", "Executing operations from " + operation10 + " to " + operation11);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList<OooO0OO> arrayList5 = new ArrayList();
        final List mutableList = CollectionsKt.toMutableList((Collection) operations);
        Fragment fragment3 = ((SpecialEffectsController.Operation) CollectionsKt.last((List) operations)).f5936OooO0OO;
        Iterator<? extends SpecialEffectsController.Operation> it2 = operations.iterator();
        while (it2.hasNext()) {
            Fragment.OooOOOO oooOOOO = it2.next().f5936OooO0OO.mAnimationInfo;
            Fragment.OooOOOO oooOOOO2 = fragment3.mAnimationInfo;
            oooOOOO.f5777OooO0O0 = oooOOOO2.f5777OooO0O0;
            oooOOOO.f5778OooO0OO = oooOOOO2.f5778OooO0OO;
            oooOOOO.f5779OooO0Oo = oooOOOO2.f5779OooO0Oo;
            oooOOOO.f5781OooO0o0 = oooOOOO2.f5781OooO0o0;
        }
        Iterator<? extends SpecialEffectsController.Operation> it3 = operations.iterator();
        while (it3.hasNext()) {
            final SpecialEffectsController.Operation next2 = it3.next();
            p063o0000oO.oo000o signal = new p063o0000oO.oo000o();
            next2.getClass();
            Intrinsics.checkNotNullParameter(signal, "signal");
            next2.OooO0Oo();
            next2.f5939OooO0o0.add(signal);
            arrayList4.add(new OooO00o(next2, signal, z));
            p063o0000oO.oo000o signal2 = new p063o0000oO.oo000o();
            Intrinsics.checkNotNullParameter(signal2, "signal");
            next2.OooO0Oo();
            next2.f5939OooO0o0.add(signal2);
            arrayList5.add(new OooO0OO(next2, signal2, z, !z ? next2 != operation11 : next2 != operation10));
            Runnable listener = new Runnable() { // from class: androidx.fragment.app.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    List awaitingContainerChanges = mutableList;
                    Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                    SpecialEffectsController.Operation operation12 = next2;
                    Intrinsics.checkNotNullParameter(operation12, "$operation");
                    OooOO0O this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (awaitingContainerChanges.contains(operation12)) {
                        awaitingContainerChanges.remove(operation12);
                        this$0.getClass();
                        View view8 = operation12.f5936OooO0OO.mView;
                        SpecialEffectsController.Operation.State state3 = operation12.f5934OooO00o;
                        Intrinsics.checkNotNullExpressionValue(view8, "view");
                        state3.OooO00o(view8);
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            next2.f5937OooO0Oo.add(listener);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (!((OooO0OO) obj2).OooO0O0()) {
                arrayList6.add(obj2);
            }
        }
        ArrayList<OooO0OO> arrayList7 = new ArrayList();
        for (Object obj3 : arrayList6) {
            if (((OooO0OO) obj3).OooO0OO() != null) {
                arrayList7.add(obj3);
            }
        }
        o000 o000Var2 = null;
        for (OooO0OO oooO0OO : arrayList7) {
            o000 o000VarOooO0OO = oooO0OO.OooO0OO();
            if (!(o000Var2 == null || o000VarOooO0OO == o000Var2)) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + oooO0OO.f5903OooO00o.f5936OooO0OO + " returned Transition " + oooO0OO.f5905OooO0OO + " which uses a different Transition type than other Fragments.").toString());
            }
            o000Var2 = o000VarOooO0OO;
        }
        ViewGroup viewGroup = this.f5928OooO00o;
        if (o000Var2 != null) {
            View view8 = new View(viewGroup.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList8 = new ArrayList<>();
            str2 = " to ";
            ArrayList<View> arrayList9 = new ArrayList<>();
            p188o00o0O.OooOO0 oooOO2 = new p188o00o0O.OooOO0();
            Iterator it4 = arrayList5.iterator();
            boolean z5 = z;
            arrayList = arrayList4;
            View view9 = null;
            Object obj4 = null;
            boolean z6 = false;
            while (it4.hasNext()) {
                mutableList = mutableList;
                Object obj5 = ((OooO0OO) it4.next()).f5907OooO0o0;
                if (!(obj5 != null) || operation10 == null || operation11 == null) {
                    arrayList2 = arrayList5;
                    str4 = str;
                    str5 = str6;
                    rect = rect2;
                    o000Var = o000Var2;
                    obj = obj4;
                    view3 = view9;
                    view9 = view3;
                    obj4 = obj;
                    o000Var2 = o000Var;
                    arrayList5 = arrayList2;
                    str6 = str5;
                    rect2 = rect;
                    str = str4;
                } else {
                    Object objOooOOo = o000Var2.OooOOo(o000Var2.OooO0o(obj5));
                    Fragment fragment4 = operation11.f5936OooO0OO;
                    str4 = str;
                    ArrayList<String> sharedElementSourceNames = fragment4.getSharedElementSourceNames();
                    arrayList2 = arrayList5;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    Fragment fragment5 = operation10.f5936OooO0OO;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    ArrayList<String> sharedElementSourceNames2 = fragment5.getSharedElementSourceNames();
                    view8 = view8;
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = fragment5.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    o000 o000Var3 = o000Var2;
                    int i = 0;
                    while (i < size) {
                        int i2 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i));
                        }
                        i++;
                        size = i2;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment4.getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z5 ? TuplesKt.to(fragment5.getExitTransitionCallback(), fragment4.getEnterTransitionCallback()) : TuplesKt.to(fragment5.getEnterTransitionCallback(), fragment4.getExitTransitionCallback());
                    o00000O.oo0o0Oo oo0o0oo = (o00000O.oo0o0Oo) pair.component1();
                    o00000O.oo0o0Oo oo0o0oo2 = (o00000O.oo0o0Oo) pair.component2();
                    int size2 = sharedElementSourceNames.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        oooOO2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                        i3++;
                        size2 = size2;
                        viewGroup = viewGroup;
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str6, ">>> entering view names <<<");
                        for (Iterator<String> it5 = sharedElementTargetNames2.iterator(); it5.hasNext(); it5 = it5) {
                            Log.v(str6, "Name: " + it5.next());
                        }
                        Log.v(str6, ">>> exiting view names <<<");
                        for (Iterator<String> it6 = sharedElementSourceNames.iterator(); it6.hasNext(); it6 = it6) {
                            Log.v(str6, "Name: " + it6.next());
                        }
                    }
                    p188o00o0O.OooOO0 oooOO3 = new p188o00o0O.OooOO0();
                    View view10 = fragment5.mView;
                    Intrinsics.checkNotNullExpressionValue(view10, "firstOut.fragment.mView");
                    OooOOOO(oooOO3, view10);
                    oooOO3.OooOOO0(sharedElementSourceNames);
                    if (oo0o0oo != null) {
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v(str6, "Executing exit callback for operation " + operation10);
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                String str7 = sharedElementSourceNames.get(size3);
                                View view11 = (View) oooOO3.getOrDefault(str7, null);
                                if (view11 == null) {
                                    oooOO2.remove(str7);
                                } else {
                                    WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                                    if (!Intrinsics.areEqual(str7, ViewCompat.OooOOO.OooOO0O(view11))) {
                                        oooOO2.put(ViewCompat.OooOOO.OooOO0O(view11), (String) oooOO2.remove(str7));
                                    }
                                }
                                if (i4 < 0) {
                                    break;
                                } else {
                                    size3 = i4;
                                }
                            }
                        }
                    } else {
                        oooOO2.OooOOO0(oooOO3.keySet());
                    }
                    final p188o00o0O.OooOO0 namedViews = new p188o00o0O.OooOO0();
                    View view12 = fragment4.mView;
                    Intrinsics.checkNotNullExpressionValue(view12, "lastIn.fragment.mView");
                    OooOOOO(namedViews, view12);
                    namedViews.OooOOO0(sharedElementTargetNames2);
                    namedViews.OooOOO0(oooOO2.values());
                    if (oo0o0oo2 != null) {
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v(str6, "Executing enter callback for operation " + operation11);
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i5 = size4 - 1;
                                String name = sharedElementTargetNames2.get(size4);
                                View view13 = (View) namedViews.getOrDefault(name, null);
                                if (view13 == null) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String strOooO0O0 = o0000oo.OooO0O0(oooOO2, name);
                                    if (strOooO0O0 != null) {
                                        oooOO2.remove(strOooO0O0);
                                    }
                                    str5 = str6;
                                } else {
                                    WeakHashMap<View, o000O0Oo> weakHashMap2 = ViewCompat.f5334OooO00o;
                                    str5 = str6;
                                    if (!Intrinsics.areEqual(name, ViewCompat.OooOOO.OooOO0O(view13))) {
                                        Intrinsics.checkNotNullExpressionValue(name, "name");
                                        String strOooO0O1 = o0000oo.OooO0O0(oooOO2, name);
                                        if (strOooO0O1 != null) {
                                            oooOO2.put(strOooO0O1, ViewCompat.OooOOO.OooOO0O(view13));
                                        }
                                    }
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                size4 = i5;
                                str6 = str5;
                            }
                        } else {
                            str5 = str6;
                        }
                    } else {
                        str5 = str6;
                        o0000O0O o0000o0o2 = o0000oo.f6000OooO00o;
                        Intrinsics.checkNotNullParameter(oooOO2, "<this>");
                        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
                        for (int i6 = oooOO2.f38816OooO0o - 1; -1 < i6; i6--) {
                            if (!namedViews.containsKey((String) oooOO2.OooOO0o(i6))) {
                                oooOO2.OooOO0(i6);
                            }
                        }
                    }
                    Set setKeySet = oooOO2.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                    Set entries = oooOO3.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries, "entries");
                    CollectionsKt.retainAll(entries, new OooOOO0(setKeySet));
                    Collection collectionValues = oooOO2.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                    Set entries2 = namedViews.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entries2, "entries");
                    CollectionsKt.retainAll(entries2, new OooOOO0(collectionValues));
                    if (oooOO2.isEmpty()) {
                        arrayList8.clear();
                        arrayList9.clear();
                        z5 = z;
                        str = str4;
                        arrayList5 = arrayList2;
                        linkedHashMap = linkedHashMap2;
                        view8 = view8;
                        rect2 = rect3;
                        o000Var2 = o000Var3;
                        viewGroup = viewGroup2;
                        str6 = str5;
                        obj4 = null;
                    } else {
                        o0000oo.OooO00o(fragment4, fragment5, z, oooOO3);
                        viewGroup = viewGroup2;
                        androidx.core.view.o00000O.OooO00o(viewGroup, new Runnable() { // from class: androidx.fragment.app.OooO0OO
                            @Override // java.lang.Runnable
                            public final void run() {
                                p188o00o0O.OooOO0 lastInViews = namedViews;
                                Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
                                o0000oo.OooO00o(operation11.f5936OooO0OO, operation10.f5936OooO0OO, z, lastInViews);
                            }
                        });
                        arrayList8.addAll(oooOO3.values());
                        if (!sharedElementSourceNames.isEmpty()) {
                            view3 = (View) oooOO3.getOrDefault(sharedElementSourceNames.get(0), null);
                            obj = objOooOOo;
                            o000Var = o000Var3;
                            o000Var.OooOOO0(view3, obj);
                        } else {
                            obj = objOooOOo;
                            o000Var = o000Var3;
                            view3 = view9;
                        }
                        arrayList9.addAll(namedViews.values());
                        if (!(!sharedElementTargetNames2.isEmpty()) || (view4 = (View) namedViews.getOrDefault(sharedElementTargetNames2.get(0), null)) == null) {
                            rect = rect3;
                        } else {
                            rect = rect3;
                            androidx.core.view.o00000O.OooO00o(viewGroup, new Runnable() { // from class: androidx.fragment.app.OooO0o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    o000 impl = o000Var;
                                    Intrinsics.checkNotNullParameter(impl, "$impl");
                                    Rect lastInEpicenterRect = rect;
                                    Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                                    impl.getClass();
                                    o000.OooO0oO(view4, lastInEpicenterRect);
                                }
                            });
                            z6 = true;
                        }
                        o000Var.OooOOOo(obj, view8, arrayList8);
                        o000Var.OooOO0o(obj, null, null, obj, arrayList9);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap = linkedHashMap2;
                        linkedHashMap.put(operation10, bool);
                        linkedHashMap.put(operation11, bool);
                        z5 = z;
                        view9 = view3;
                        obj4 = obj;
                        o000Var2 = o000Var;
                        arrayList5 = arrayList2;
                        str6 = str5;
                        rect2 = rect;
                        str = str4;
                    }
                }
            }
            ArrayList arrayList10 = arrayList5;
            String str8 = str;
            String str9 = str6;
            list = mutableList;
            Rect rect4 = rect2;
            o000 o000Var4 = o000Var2;
            ArrayList arrayList11 = new ArrayList();
            Iterator it7 = arrayList10.iterator();
            Object objOooOO0 = null;
            Object objOooOO1 = null;
            while (it7.hasNext()) {
                OooO0OO oooO0OO2 = (OooO0OO) it7.next();
                boolean zOooO0O0 = oooO0OO2.OooO0O0();
                it7 = it7;
                SpecialEffectsController.Operation operation12 = oooO0OO2.f5903OooO00o;
                if (zOooO0O0) {
                    oooOO1 = oooOO2;
                    linkedHashMap.put(operation12, Boolean.FALSE);
                    oooO0OO2.OooO00o();
                } else {
                    oooOO1 = oooOO2;
                    Object objOooO0o = o000Var4.OooO0o(oooO0OO2.f5905OooO0OO);
                    boolean z7 = obj4 != null && (operation12 == operation10 || operation12 == operation11);
                    if (objOooO0o != null) {
                        SpecialEffectsController.Operation operation13 = operation11;
                        ArrayList arrayList12 = new ArrayList();
                        Object obj6 = obj4;
                        View view14 = operation12.f5936OooO0OO.mView;
                        Object obj7 = objOooOO0;
                        str8 = str8;
                        Intrinsics.checkNotNullExpressionValue(view14, str8);
                        OooOOO(view14, arrayList12);
                        if (z7) {
                            if (operation12 == operation10) {
                                arrayList12.removeAll(CollectionsKt.toSet(arrayList8));
                            } else {
                                arrayList12.removeAll(CollectionsKt.toSet(arrayList9));
                            }
                        }
                        if (arrayList12.isEmpty()) {
                            o000Var4.OooO00o(view8, objOooO0o);
                            view = view8;
                        } else {
                            o000Var4.OooO0O0(arrayList12, objOooO0o);
                            o000Var4.OooOO0o(objOooO0o, objOooO0o, arrayList12, null, null);
                            view = view8;
                            if (operation12.f5934OooO00o == SpecialEffectsController.Operation.State.GONE) {
                                list.remove(operation12);
                                ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                                Fragment fragment6 = operation12.f5936OooO0OO;
                                arrayList13.remove(fragment6.mView);
                                o000Var4.OooOO0O(objOooO0o, fragment6.mView, arrayList13);
                                androidx.core.view.o00000O.OooO00o(viewGroup, new o000OO00(arrayList12, 1));
                            }
                            if (operation12.f5934OooO00o == SpecialEffectsController.Operation.State.VISIBLE) {
                                arrayList11.addAll(arrayList12);
                                if (z6) {
                                    o000Var4.OooOOO(objOooO0o, rect4);
                                }
                                view2 = view9;
                            } else {
                                view2 = view9;
                                o000Var4.OooOOO0(view2, objOooO0o);
                            }
                            linkedHashMap.put(operation12, Boolean.TRUE);
                            if (oooO0OO2.f5906OooO0Oo) {
                                objOooOO1 = o000Var4.OooOO0(objOooOO1, objOooO0o);
                                objOooOO0 = obj7;
                            } else {
                                objOooOO0 = o000Var4.OooOO0(obj7, objOooO0o);
                            }
                            view9 = view2;
                            view8 = view;
                            oooOO2 = oooOO1;
                            operation11 = operation13;
                            obj4 = obj6;
                        }
                        if (operation12.f5934OooO00o == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList11.addAll(arrayList12);
                            if (z6) {
                                o000Var4.OooOOO(objOooO0o, rect4);
                            }
                            view2 = view9;
                        } else {
                            view2 = view9;
                            o000Var4.OooOOO0(view2, objOooO0o);
                        }
                        linkedHashMap.put(operation12, Boolean.TRUE);
                        if (oooO0OO2.f5906OooO0Oo) {
                            objOooOO1 = o000Var4.OooOO0(objOooOO1, objOooO0o);
                            objOooOO0 = obj7;
                        } else {
                            objOooOO0 = o000Var4.OooOO0(obj7, objOooO0o);
                        }
                        view9 = view2;
                        view8 = view;
                        oooOO2 = oooOO1;
                        operation11 = operation13;
                        obj4 = obj6;
                    } else if (!z7) {
                        linkedHashMap.put(operation12, Boolean.FALSE);
                        oooO0OO2.OooO00o();
                    }
                }
                oooOO2 = oooOO1;
            }
            Object obj8 = obj4;
            p188o00o0O.Oooo000 oooo000 = oooOO2;
            SpecialEffectsController.Operation operation14 = operation11;
            Object objOooO = o000Var4.OooO(objOooOO1, objOooOO0, obj8);
            if (objOooO == null) {
                operation11 = operation14;
                str6 = str9;
            } else {
                ArrayList<OooO0OO> arrayList14 = new ArrayList();
                for (Object obj9 : arrayList10) {
                    if (!((OooO0OO) obj9).OooO0O0()) {
                        arrayList14.add(obj9);
                    }
                }
                for (OooO0OO oooO0OO3 : arrayList14) {
                    Object obj10 = oooO0OO3.f5905OooO0OO;
                    SpecialEffectsController.Operation operation15 = oooO0OO3.f5903OooO00o;
                    operation14 = operation14;
                    boolean z8 = obj8 != null && (operation15 == operation10 || operation15 == operation14);
                    if (obj10 != null || z8) {
                        WeakHashMap<View, o000O0Oo> weakHashMap3 = ViewCompat.f5334OooO00o;
                        if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                            Fragment fragment7 = operation15.f5936OooO0OO;
                            o000Var4.OooOOOO(objOooO, oooO0OO3.f5904OooO0O0, new p045Oooooo.o0000oo(1, oooO0OO3, operation15));
                        } else {
                            if (FragmentManager.Oooo0O0(2)) {
                                str3 = str9;
                                Log.v(str3, "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + operation15);
                            } else {
                                str3 = str9;
                            }
                            oooO0OO3.OooO00o();
                        }
                    } else {
                        str3 = str9;
                    }
                    str9 = str3;
                }
                operation11 = operation14;
                str6 = str9;
                WeakHashMap<View, o000O0Oo> weakHashMap4 = ViewCompat.f5334OooO00o;
                if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                    o0000oo.OooO0OO(4, arrayList11);
                    ArrayList arrayList15 = new ArrayList();
                    int size5 = arrayList9.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        View view15 = arrayList9.get(i7);
                        WeakHashMap<View, o000O0Oo> weakHashMap5 = ViewCompat.f5334OooO00o;
                        arrayList15.add(ViewCompat.OooOOO.OooOO0O(view15));
                        ViewCompat.OooOOO.OooOo0O(view15, null);
                    }
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str6, ">>>>> Beginning transition <<<<<");
                        Log.v(str6, ">>>>> SharedElementFirstOutViews <<<<<");
                        for (Iterator<View> it8 = arrayList8.iterator(); it8.hasNext(); it8 = it8) {
                            View sharedElementFirstOutViews = it8.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                            View view16 = sharedElementFirstOutViews;
                            Log.v(str6, "View: " + view16 + " Name: " + ViewCompat.OooOOO.OooOO0O(view16));
                        }
                        Log.v(str6, ">>>>> SharedElementLastInViews <<<<<");
                        for (Iterator<View> it9 = arrayList9.iterator(); it9.hasNext(); it9 = it9) {
                            View sharedElementLastInViews = it9.next();
                            Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                            View view17 = sharedElementLastInViews;
                            Log.v(str6, "View: " + view17 + " Name: " + ViewCompat.OooOOO.OooOO0O(view17));
                        }
                    }
                    o000Var4.OooO0OO(viewGroup, objOooO);
                    int size6 = arrayList9.size();
                    ArrayList arrayList16 = new ArrayList();
                    int i8 = 0;
                    while (i8 < size6) {
                        View view18 = arrayList8.get(i8);
                        WeakHashMap<View, o000O0Oo> weakHashMap6 = ViewCompat.f5334OooO00o;
                        String strOooOO0O = ViewCompat.OooOOO.OooOO0O(view18);
                        arrayList16.add(strOooOO0O);
                        if (strOooOO0O == null) {
                            operation4 = operation10;
                            operation3 = operation11;
                        } else {
                            operation3 = operation11;
                            ViewCompat.OooOOO.OooOo0O(view18, null);
                            p188o00o0O.Oooo000 oooo001 = oooo000;
                            String str10 = (String) oooo001.getOrDefault(strOooOO0O, null);
                            oooo000 = oooo001;
                            int i9 = 0;
                            while (true) {
                                operation4 = operation10;
                                if (i9 >= size6) {
                                    break;
                                }
                                if (str10.equals(arrayList15.get(i9))) {
                                    ViewCompat.OooOOO.OooOo0O(arrayList9.get(i9), strOooOO0O);
                                    break;
                                } else {
                                    i9++;
                                    operation10 = operation4;
                                }
                            }
                        }
                        i8++;
                        operation10 = operation4;
                        operation11 = operation3;
                    }
                    operation = operation10;
                    operation2 = operation11;
                    androidx.core.view.o00000O.OooO00o(viewGroup, new o0000OO0(size6, arrayList9, arrayList15, arrayList8, arrayList16));
                    z2 = false;
                    o0000oo.OooO0OO(0, arrayList11);
                    o000Var4.OooOOo0(obj8, arrayList8, arrayList9);
                } else {
                    operation = operation10;
                    operation2 = operation11;
                    z2 = false;
                }
            }
            zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
            context = viewGroup.getContext();
            arrayList3 = new ArrayList();
            z3 = z2;
            for (OooO00o oooO00o : arrayList) {
                if (oooO00o.OooO0O0()) {
                    oooO00o.OooO00o();
                } else {
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    oooO00oOooO0OO2 = oooO00o.OooO0OO(context);
                    if (oooO00oOooO0OO2 == null) {
                        oooO00o.OooO00o();
                    } else {
                        animator = oooO00oOooO0OO2.f6022OooO0O0;
                        if (animator == null) {
                            arrayList3.add(oooO00o);
                        } else {
                            operation6 = oooO00o.f5903OooO00o;
                            fragment2 = operation6.f5936OooO0OO;
                            if (Intrinsics.areEqual(linkedHashMap.get(operation6), Boolean.TRUE)) {
                                if (FragmentManager.Oooo0O0(2)) {
                                    Log.v(str6, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                                }
                                oooO00o.OooO00o();
                            } else {
                                if (operation6.f5934OooO00o == SpecialEffectsController.Operation.State.GONE) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                list2 = list;
                                if (z4) {
                                    list2.remove(operation6);
                                }
                                View view19 = fragment2.mView;
                                viewGroup.startViewTransition(view19);
                                animator.addListener(new OooOOO(this, view19, z4, operation6, oooO00o));
                                animator.setTarget(view19);
                                animator.start();
                                if (FragmentManager.Oooo0O0(2)) {
                                    StringBuilder sb = new StringBuilder("Animator from operation ");
                                    operation7 = operation6;
                                    sb.append(operation7);
                                    sb.append(" has started.");
                                    Log.v(str6, sb.toString());
                                } else {
                                    operation7 = operation6;
                                }
                                oooO00o.f5904OooO0O0.OooO00o(new OooO(animator, operation7));
                                list = list2;
                                z3 = true;
                                z2 = false;
                            }
                        }
                    }
                }
            }
            List<SpecialEffectsController.Operation> list3 = list;
            for (final OooO00o oooO00o2 : arrayList3) {
                operation5 = oooO00o2.f5903OooO00o;
                fragment = operation5.f5936OooO0OO;
                if (zContainsValue) {
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str6, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                    }
                    oooO00o2.OooO00o();
                } else if (z3) {
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str6, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                    }
                    oooO00o2.OooO00o();
                } else {
                    view5 = fragment.mView;
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    oooO00oOooO0OO = oooO00o2.OooO0OO(context);
                    if (oooO00oOooO0OO != null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    animation = oooO00oOooO0OO.f6021OooO00o;
                    if (animation != null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    if (operation5.f5934OooO00o != SpecialEffectsController.Operation.State.REMOVED) {
                        view5.startAnimation(animation);
                        oooO00o2.OooO00o();
                        oooOO0O = this;
                    } else {
                        viewGroup.startViewTransition(view5);
                        o00Ooo.OooO0O0 oooO0O0 = new o00Ooo.OooO0O0(animation, viewGroup, view5);
                        oooOO0O = this;
                        oooO0O0.setAnimationListener(new OooOo00(view5, oooO00o2, oooOO0O, operation5));
                        view5.startAnimation(oooO0O0);
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v(str6, "Animation from operation " + operation5 + " has started.");
                        }
                    }
                    oooO00o2.f5904OooO0O0.OooO00o(new o0000oO.oo000o.OooO00o() { // from class: androidx.fragment.app.OooOO0
                        @Override // o0000oO.oo000o.OooO00o
                        public final void onCancel() {
                            OooOO0O this$0 = oooOO0O;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            OooOO0O.OooO00o animationInfo = oooO00o2;
                            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                            SpecialEffectsController.Operation operation16 = operation5;
                            Intrinsics.checkNotNullParameter(operation16, "$operation");
                            View view20 = view5;
                            view20.clearAnimation();
                            this$0.f5928OooO00o.endViewTransition(view20);
                            animationInfo.OooO00o();
                            if (FragmentManager.Oooo0O0(2)) {
                                Log.v("FragmentManager", "Animation from operation " + operation16 + " has been cancelled.");
                            }
                        }
                    });
                }
            }
            for (SpecialEffectsController.Operation operation16 : list3) {
                View view20 = operation16.f5936OooO0OO.mView;
                SpecialEffectsController.Operation.State state3 = operation16.f5934OooO00o;
                Intrinsics.checkNotNullExpressionValue(view20, "view");
                state3.OooO00o(view20);
            }
            list3.clear();
            if (FragmentManager.Oooo0O0(2)) {
                Log.v(str6, "Completed executing operations from " + operation + str2 + operation2);
            }
        }
        for (OooO0OO oooO0OO4 : arrayList5) {
            linkedHashMap.put(oooO0OO4.f5903OooO00o, Boolean.FALSE);
            oooO0OO4.OooO00o();
        }
        arrayList = arrayList4;
        str2 = " to ";
        list = mutableList;
        operation = operation10;
        operation2 = operation11;
        z2 = false;
        zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        context = viewGroup.getContext();
        arrayList3 = new ArrayList();
        z3 = z2;
        while (r12.hasNext()) {
            if (oooO00o.OooO0O0()) {
                oooO00o.OooO00o();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oooO00oOooO0OO2 = oooO00o.OooO0OO(context);
                if (oooO00oOooO0OO2 == null) {
                    oooO00o.OooO00o();
                } else {
                    animator = oooO00oOooO0OO2.f6022OooO0O0;
                    if (animator == null) {
                        arrayList3.add(oooO00o);
                    } else {
                        operation6 = oooO00o.f5903OooO00o;
                        fragment2 = operation6.f5936OooO0OO;
                        if (Intrinsics.areEqual(linkedHashMap.get(operation6), Boolean.TRUE)) {
                            if (FragmentManager.Oooo0O0(2)) {
                                Log.v(str6, "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                            }
                            oooO00o.OooO00o();
                        } else {
                            if (operation6.f5934OooO00o == SpecialEffectsController.Operation.State.GONE) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            list2 = list;
                            if (z4) {
                                list2.remove(operation6);
                            }
                            View view110 = fragment2.mView;
                            viewGroup.startViewTransition(view110);
                            animator.addListener(new OooOOO(this, view110, z4, operation6, oooO00o));
                            animator.setTarget(view110);
                            animator.start();
                            if (FragmentManager.Oooo0O0(2)) {
                                StringBuilder sb2 = new StringBuilder("Animator from operation ");
                                operation7 = operation6;
                                sb2.append(operation7);
                                sb2.append(" has started.");
                                Log.v(str6, sb2.toString());
                            } else {
                                operation7 = operation6;
                            }
                            oooO00o.f5904OooO0O0.OooO00o(new OooO(animator, operation7));
                            list = list2;
                            z3 = true;
                            z2 = false;
                        }
                    }
                }
            }
        }
        List<SpecialEffectsController.Operation> list4 = list;
        while (r0.hasNext()) {
            operation5 = oooO00o2.f5903OooO00o;
            fragment = operation5.f5936OooO0OO;
            if (zContainsValue) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v(str6, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Transitions.");
                }
                oooO00o2.OooO00o();
            } else if (z3) {
                if (FragmentManager.Oooo0O0(2)) {
                    Log.v(str6, "Ignoring Animation set on " + fragment + " as Animations cannot run alongside Animators.");
                }
                oooO00o2.OooO00o();
            } else {
                view5 = fragment.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                oooO00oOooO0OO = oooO00o2.OooO0OO(context);
                if (oooO00oOooO0OO != null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                animation = oooO00oOooO0OO.f6021OooO00o;
                if (animation != null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation5.f5934OooO00o != SpecialEffectsController.Operation.State.REMOVED) {
                    view5.startAnimation(animation);
                    oooO00o2.OooO00o();
                    oooOO0O = this;
                } else {
                    viewGroup.startViewTransition(view5);
                    o00Ooo.OooO0O0 oooO0O1 = new o00Ooo.OooO0O0(animation, viewGroup, view5);
                    oooOO0O = this;
                    oooO0O1.setAnimationListener(new OooOo00(view5, oooO00o2, oooOO0O, operation5));
                    view5.startAnimation(oooO0O1);
                    if (FragmentManager.Oooo0O0(2)) {
                        Log.v(str6, "Animation from operation " + operation5 + " has started.");
                    }
                }
                oooO00o2.f5904OooO0O0.OooO00o(new o0000oO.oo000o.OooO00o() { // from class: androidx.fragment.app.OooOO0
                    @Override // o0000oO.oo000o.OooO00o
                    public final void onCancel() {
                        OooOO0O this$0 = oooOO0O;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        OooOO0O.OooO00o animationInfo = oooO00o2;
                        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                        SpecialEffectsController.Operation operation17 = operation5;
                        Intrinsics.checkNotNullParameter(operation17, "$operation");
                        View view21 = view5;
                        view21.clearAnimation();
                        this$0.f5928OooO00o.endViewTransition(view21);
                        animationInfo.OooO00o();
                        if (FragmentManager.Oooo0O0(2)) {
                            Log.v("FragmentManager", "Animation from operation " + operation17 + " has been cancelled.");
                        }
                    }
                });
            }
        }
        while (r0.hasNext()) {
            View view21 = operation16.f5936OooO0OO.mView;
            SpecialEffectsController.Operation.State state4 = operation16.f5934OooO00o;
            Intrinsics.checkNotNullExpressionValue(view21, "view");
            state4.OooO00o(view21);
        }
        list4.clear();
        if (FragmentManager.Oooo0O0(2)) {
            Log.v(str6, "Completed executing operations from " + operation + str2 + operation2);
        }
    }
}
