package androidx.navigation.compose;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.google.logging.type.LogSeverity;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o000O00.o00000O;
import o000O00.o00000O0;
import o000O00.o00000OO;
import o000O00.o0O0O00;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 5 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 8 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 9 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 10 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,373:1\n67#2,3:374\n66#2:377\n67#2,3:387\n66#2:390\n36#2:401\n36#2:414\n25#2:427\n67#2,3:434\n66#2:437\n67#2,3:444\n66#2:447\n1097#3,3:378\n1100#3,3:384\n1097#3,3:391\n1100#3,3:397\n1097#3,3:402\n1100#3,3:410\n1097#3,3:415\n1100#3,3:423\n1097#3,6:428\n1097#3,6:438\n1097#3,6:448\n2571#4:381\n2571#4:394\n57#5,2:382\n57#5,2:395\n76#6:400\n76#6:426\n47#7:405\n49#7:409\n47#7:418\n49#7:422\n50#8:406\n55#8:408\n50#8:419\n55#8:421\n106#9:407\n106#9:420\n150#10:413\n150#10:454\n81#11:455\n81#11:456\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n85#1:374,3\n85#1:377\n131#1:387,3\n131#1:390\n205#1:401\n234#1:414\n248#1:427\n251#1:434,3\n251#1:437\n265#1:444,3\n265#1:447\n85#1:378,3\n85#1:384,3\n131#1:391,3\n131#1:397,3\n205#1:402,3\n205#1:410,3\n234#1:415,3\n234#1:423,3\n248#1:428,6\n251#1:438,6\n265#1:448,6\n86#1:381\n132#1:394\n86#1:382,2\n132#1:395,2\n199#1:400\n242#1:426\n206#1:405\n206#1:409\n235#1:418\n235#1:422\n206#1:406\n206#1:408\n235#1:419\n235#1:421\n206#1:407\n235#1:420\n231#1:413\n335#1:454\n205#1:455\n234#1:456\n*E\n"})
public final class NavHostKt {

    @SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$14\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,373:1\n76#2:374\n533#3,6:375\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$14\n*L\n309#1:374\n314#1:375,6\n*E\n"})
    public static final class OooO extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.compose.OooO f6930OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<List<NavBackStackEntry>> f6931OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SaveableStateHolder f6932OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(androidx.navigation.compose.OooO oooO, SaveableStateHolder saveableStateHolder, State<? extends List<NavBackStackEntry>> state) {
            super(4);
            this.f6930OooO0Oo = oooO;
            this.f6932OooO0o0 = saveableStateHolder;
            this.f6931OooO0o = state;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            NavBackStackEntry navBackStackEntryPrevious;
            AnimatedContentScope animatedContentScope2 = animatedContentScope;
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1440061047, iIntValue, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:308)");
            }
            List<NavBackStackEntry> value = ((Boolean) composer2.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue() ? this.f6930OooO0Oo.OooO0O0().f34380OooO0o0.getValue() : this.f6931OooO0o.getValue();
            ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
            do {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntryPrevious = null;
                    break;
                }
                navBackStackEntryPrevious = listIterator.previous();
            } while (!Intrinsics.areEqual(navBackStackEntry2, navBackStackEntryPrevious));
            NavBackStackEntry navBackStackEntry3 = navBackStackEntryPrevious;
            if (navBackStackEntry3 != null) {
                androidx.navigation.compose.OooOo.OooO00o(navBackStackEntry3, this.f6932OooO0o0, ComposableLambdaKt.composableLambda(composer2, -1425390790, true, new o00Ooo(navBackStackEntry3, animatedContentScope2)), composer2, 456);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f6933OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000O o00000o) {
            super(0);
            this.f6933OooO0Oo = o00000o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f6933OooO0Oo.OooOO0O();
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$11\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,373:1\n63#2,5:374\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$11\n*L\n220#1:374,5\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f6934OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f6935OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00000O o00000o, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f6934OooO0Oo = o00000o;
            this.f6935OooO0o0 = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            Lifecycle lifecycle;
            o00000O o00000o = this.f6934OooO0Oo;
            o00000o.getClass();
            LifecycleOwner owner = this.f6935OooO0o0;
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!Intrinsics.areEqual(owner, o00000o.f6859OooOOOo)) {
                LifecycleOwner lifecycleOwner = o00000o.f6859OooOOOo;
                o000O00.OooOO0O oooOO0O = o00000o.f6865OooOo00;
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.removeObserver(oooOO0O);
                }
                o00000o.f6859OooOOOo = owner;
                owner.getLifecycle().addObserver(oooOO0O);
            }
            return new o00Oo0();
        }
    }

    @SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$12\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Map<String, Float> f6936OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6937OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.compose.OooO f6938OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6939OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ State<List<NavBackStackEntry>> f6940OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Map<String, Float> map, androidx.navigation.compose.OooO oooO, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, State<? extends List<NavBackStackEntry>> state) {
            super(1);
            this.f6936OooO0Oo = map;
            this.f6938OooO0o0 = oooO;
            this.f6937OooO0o = function1;
            this.f6939OooO0oO = function2;
            this.f6940OooO0oo = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            float fFloatValue;
            AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope2 = animatedContentTransitionScope;
            if (!this.f6940OooO0oo.getValue().contains(animatedContentTransitionScope2.getInitialState())) {
                return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
            }
            String id = animatedContentTransitionScope2.getInitialState().getId();
            Map<String, Float> map = this.f6936OooO0Oo;
            Float f = map.get(id);
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                map.put(animatedContentTransitionScope2.getInitialState().getId(), Float.valueOf(0.0f));
                fFloatValue = 0.0f;
            }
            if (!Intrinsics.areEqual(animatedContentTransitionScope2.getTargetState().getId(), animatedContentTransitionScope2.getInitialState().getId())) {
                fFloatValue = this.f6938OooO0o0.f6998OooO0OO.getValue().booleanValue() ? fFloatValue - 1.0f : fFloatValue + 1.0f;
            }
            float f2 = fFloatValue;
            map.put(animatedContentTransitionScope2.getTargetState().getId(), Float.valueOf(f2));
            return new ContentTransform(this.f6937OooO0o.invoke(animatedContentTransitionScope2), this.f6939OooO0oO.invoke(animatedContentTransitionScope2), f2, null, 8, null);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<NavBackStackEntry, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f6941OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(NavBackStackEntry navBackStackEntry) {
            return navBackStackEntry.getId();
        }
    }

    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$15\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,373:1\n1855#2,2:374\n515#3:376\n500#3,6:377\n215#4,2:383\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$15\n*L\n325#1:374,2\n329#1:376\n329#1:377,6\n330#1:383,2\n*E\n"})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Transition<NavBackStackEntry> f6942OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ State<List<NavBackStackEntry>> f6943OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Float> f6944OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.compose.OooO f6945OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Transition<NavBackStackEntry> transition, Map<String, Float> map, State<? extends List<NavBackStackEntry>> state, androidx.navigation.compose.OooO oooO, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f6942OooO0Oo = transition;
            this.f6944OooO0o0 = map;
            this.f6943OooO0o = state;
            this.f6945OooO0oO = oooO;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f6942OooO0Oo, this.f6944OooO0o0, this.f6943OooO0o, this.f6945OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Transition<NavBackStackEntry> transition = this.f6942OooO0Oo;
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                Iterator<T> it = this.f6943OooO0o.getValue().iterator();
                while (it.hasNext()) {
                    this.f6945OooO0oO.OooO0O0().OooO0O0((NavBackStackEntry) it.next());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Float> map = this.f6944OooO0o0;
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!Intrinsics.areEqual(entry.getKey(), transition.getTargetState().getId())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6946OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f6947OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f6948OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.OooO f6949OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f6950OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6951OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6952OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6953OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f6954OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f6955OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(o00000O o00000o, androidx.navigation.OooO oooO, Modifier modifier, Alignment alignment, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function4, int i, int i2) {
            super(2);
            this.f6947OooO0Oo = o00000o;
            this.f6949OooO0o0 = oooO;
            this.f6948OooO0o = modifier;
            this.f6950OooO0oO = alignment;
            this.f6951OooO0oo = function1;
            this.f6946OooO = function2;
            this.f6952OooOO0 = function3;
            this.f6953OooOO0O = function4;
            this.f6954OooOO0o = i;
            this.f6955OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavHostKt.OooO00o(this.f6947OooO0Oo, this.f6949OooO0o0, this.f6948OooO0o, this.f6950OooO0oO, this.f6951OooO0oo, this.f6946OooO, this.f6952OooOO0, this.f6953OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6954OooOO0o | 1), this.f6955OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f6956OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(LogSeverity.ALERT_VALUE, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f6957OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(LogSeverity.ALERT_VALUE, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6958OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f6959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f6960OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f6961OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f6962OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f6963OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6964OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6965OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6966OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f6967OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o00000O0, Unit> f6968OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f6969OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(o00000O o00000o, String str, Modifier modifier, Alignment alignment, String str2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function4, Function1<? super o00000O0, Unit> function5, int i, int i2) {
            super(2);
            this.f6959OooO0Oo = o00000o;
            this.f6961OooO0o0 = str;
            this.f6960OooO0o = modifier;
            this.f6962OooO0oO = alignment;
            this.f6963OooO0oo = str2;
            this.f6958OooO = function1;
            this.f6964OooOO0 = function2;
            this.f6965OooOO0O = function3;
            this.f6966OooOO0o = function4;
            this.f6968OooOOO0 = function5;
            this.f6967OooOOO = i;
            this.f6969OooOOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavHostKt.OooO0O0(this.f6959OooO0Oo, this.f6961OooO0o0, this.f6960OooO0o, this.f6962OooO0oO, this.f6963OooO0oo, this.f6958OooO, this.f6964OooOO0, this.f6965OooOO0O, this.f6966OooOO0o, this.f6968OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6967OooOOO | 1), this.f6969OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f6970OooO0Oo = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(LogSeverity.ALERT_VALUE, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f6971OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(LogSeverity.ALERT_VALUE, 0, null, 6, null), 0.0f, 2, null);
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6972OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f6973OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f6974OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.OooO f6975OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f6976OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6977OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6978OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6979OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f6980OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f6981OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo0(o00000O o00000o, androidx.navigation.OooO oooO, Modifier modifier, Alignment alignment, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function4, int i, int i2) {
            super(2);
            this.f6973OooO0Oo = o00000o;
            this.f6975OooO0o0 = oooO;
            this.f6974OooO0o = modifier;
            this.f6976OooO0oO = alignment;
            this.f6977OooO0oo = function1;
            this.f6972OooO = function2;
            this.f6978OooOO0 = function3;
            this.f6979OooOO0O = function4;
            this.f6980OooOO0o = i;
            this.f6981OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavHostKt.OooO00o(this.f6973OooO0Oo, this.f6975OooO0o0, this.f6974OooO0o, this.f6976OooO0oO, this.f6977OooO0oo, this.f6972OooO, this.f6978OooOO0, this.f6979OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6980OooOO0o | 1), this.f6981OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6982OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00000O f6983OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f6984OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.OooO f6985OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Alignment f6986OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6987OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6988OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6989OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f6990OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f6991OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(o00000O o00000o, androidx.navigation.OooO oooO, Modifier modifier, Alignment alignment, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function3, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function4, int i, int i2) {
            super(2);
            this.f6983OooO0Oo = o00000o;
            this.f6985OooO0o0 = oooO;
            this.f6984OooO0o = modifier;
            this.f6986OooO0oO = alignment;
            this.f6987OooO0oo = function1;
            this.f6982OooO = function2;
            this.f6988OooOO0 = function3;
            this.f6989OooOO0O = function4;
            this.f6990OooOO0o = i;
            this.f6991OooOOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            NavHostKt.OooO00o(this.f6983OooO0Oo, this.f6985OooO0o0, this.f6984OooO0o, this.f6986OooO0oO, this.f6987OooO0oo, this.f6982OooO, this.f6988OooOO0, this.f6989OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6990OooOO0o | 1), this.f6991OooOOO0);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.compose.OooO f6992OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6993OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> f6994OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o000oOoO(androidx.navigation.compose.OooO oooO, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function2) {
            super(1);
            this.f6992OooO0Oo = oooO;
            this.f6994OooO0o0 = function1;
            this.f6993OooO0o = function2;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0057 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:5:0x002e->B:41:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:1: B:21:0x006e->B:46:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            EnterTransition enterTransitionInvoke;
            EnterTransition enterTransitionInvoke2;
            AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope2 = animatedContentTransitionScope;
            NavDestination destination = animatedContentTransitionScope2.getTargetState().getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            androidx.navigation.compose.OooO.OooO00o oooO00o = (androidx.navigation.compose.OooO.OooO00o) destination;
            EnterTransition enterTransition = null;
            if (this.f6992OooO0Oo.f6998OooO0OO.getValue().booleanValue()) {
                int i = NavDestination.f6814OooOO0o;
                for (NavDestination navDestination : NavDestination.OooO00o.OooO0OO(oooO00o)) {
                    if (navDestination instanceof androidx.navigation.compose.OooO.OooO00o) {
                        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1 = ((androidx.navigation.compose.OooO.OooO00o) navDestination).f7002OooOOOo;
                        enterTransitionInvoke2 = function1 != null ? function1.invoke(animatedContentTransitionScope2) : null;
                        if (enterTransitionInvoke2 != null) {
                            enterTransition = enterTransitionInvoke2;
                            break;
                        }
                    } else if (navDestination instanceof androidx.navigation.compose.OooO0o.OooO00o) {
                        ((androidx.navigation.compose.OooO0o.OooO00o) navDestination).getClass();
                    }
                    if (enterTransitionInvoke2 != null) {
                        enterTransition = enterTransitionInvoke2;
                        break;
                    }
                }
                return enterTransition == null ? this.f6994OooO0o0.invoke(animatedContentTransitionScope2) : enterTransition;
            }
            int i2 = NavDestination.f6814OooOO0o;
            for (NavDestination navDestination2 : NavDestination.OooO00o.OooO0OO(oooO00o)) {
                if (navDestination2 instanceof androidx.navigation.compose.OooO.OooO00o) {
                    Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function2 = ((androidx.navigation.compose.OooO.OooO00o) navDestination2).f6999OooOOO;
                    enterTransitionInvoke = function2 != null ? function2.invoke(animatedContentTransitionScope2) : null;
                    if (enterTransitionInvoke != null) {
                        enterTransition = enterTransitionInvoke;
                        break;
                    }
                } else if (navDestination2 instanceof androidx.navigation.compose.OooO0o.OooO00o) {
                    ((androidx.navigation.compose.OooO0o.OooO00o) navDestination2).getClass();
                }
                if (enterTransitionInvoke != null) {
                    enterTransition = enterTransitionInvoke;
                    break;
                }
            }
            return enterTransition == null ? this.f6993OooO0o.invoke(animatedContentTransitionScope2) : enterTransition;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.compose.OooO f6995OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6996OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> f6997OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o0OoOo0(androidx.navigation.compose.OooO oooO, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2) {
            super(1);
            this.f6995OooO0Oo = oooO;
            this.f6997OooO0o0 = function1;
            this.f6996OooO0o = function2;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0057 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:5:0x002e->B:41:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:1: B:21:0x006e->B:46:?, LOOP_END, SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
            ExitTransition exitTransitionInvoke;
            ExitTransition exitTransitionInvoke2;
            AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope2 = animatedContentTransitionScope;
            NavDestination destination = animatedContentTransitionScope2.getInitialState().getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            androidx.navigation.compose.OooO.OooO00o oooO00o = (androidx.navigation.compose.OooO.OooO00o) destination;
            ExitTransition exitTransition = null;
            if (this.f6995OooO0Oo.f6998OooO0OO.getValue().booleanValue()) {
                int i = NavDestination.f6814OooOO0o;
                for (NavDestination navDestination : NavDestination.OooO00o.OooO0OO(oooO00o)) {
                    if (navDestination instanceof androidx.navigation.compose.OooO.OooO00o) {
                        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function1 = ((androidx.navigation.compose.OooO.OooO00o) navDestination).f7003OooOOo0;
                        exitTransitionInvoke2 = function1 != null ? function1.invoke(animatedContentTransitionScope2) : null;
                        if (exitTransitionInvoke2 != null) {
                            exitTransition = exitTransitionInvoke2;
                            break;
                        }
                    } else if (navDestination instanceof androidx.navigation.compose.OooO0o.OooO00o) {
                        ((androidx.navigation.compose.OooO0o.OooO00o) navDestination).getClass();
                    }
                    if (exitTransitionInvoke2 != null) {
                        exitTransition = exitTransitionInvoke2;
                        break;
                    }
                }
                return exitTransition == null ? this.f6997OooO0o0.invoke(animatedContentTransitionScope2) : exitTransition;
            }
            int i2 = NavDestination.f6814OooOO0o;
            for (NavDestination navDestination2 : NavDestination.OooO00o.OooO0OO(oooO00o)) {
                if (navDestination2 instanceof androidx.navigation.compose.OooO.OooO00o) {
                    Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function2 = ((androidx.navigation.compose.OooO.OooO00o) navDestination2).f7001OooOOOO;
                    exitTransitionInvoke = function2 != null ? function2.invoke(animatedContentTransitionScope2) : null;
                    if (exitTransitionInvoke != null) {
                        exitTransition = exitTransitionInvoke;
                        break;
                    }
                } else if (navDestination2 instanceof androidx.navigation.compose.OooO0o.OooO00o) {
                    ((androidx.navigation.compose.OooO0o.OooO00o) navDestination2).getClass();
                }
                if (exitTransitionInvoke != null) {
                    exitTransition = exitTransitionInvoke;
                    break;
                }
            }
            return exitTransition == null ? this.f6996OooO0o.invoke(animatedContentTransitionScope2) : exitTransition;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0360  */
    /* JADX WARN: Code duplicated, block: B:128:0x0367  */
    /* JADX WARN: Code duplicated, block: B:131:0x036f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0378  */
    /* JADX WARN: Code duplicated, block: B:134:0x037d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0382  */
    /* JADX WARN: Code duplicated, block: B:138:0x0385  */
    /* JADX WARN: Code duplicated, block: B:139:0x0387  */
    /* JADX WARN: Code duplicated, block: B:142:0x038b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0395  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:151:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0401 A[LOOP:14: B:158:0x03fb->B:160:0x0401, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x041d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0429  */
    /* JADX WARN: Code duplicated, block: B:169:0x0433  */
    /* JADX WARN: Code duplicated, block: B:171:0x0436  */
    /* JADX WARN: Code duplicated, block: B:172:0x0438  */
    /* JADX WARN: Code duplicated, block: B:175:0x043d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0443  */
    /* JADX WARN: Code duplicated, block: B:179:0x0447  */
    /* JADX WARN: Code duplicated, block: B:181:0x0450  */
    /* JADX WARN: Code duplicated, block: B:182:0x0453  */
    /* JADX WARN: Code duplicated, block: B:183:0x0455  */
    /* JADX WARN: Code duplicated, block: B:186:0x0466  */
    /* JADX WARN: Code duplicated, block: B:198:0x0494  */
    /* JADX WARN: Code duplicated, block: B:199:0x04af  */
    /* JADX WARN: Code duplicated, block: B:201:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:217:0x0516  */
    /* JADX WARN: Code duplicated, block: B:219:0x051a  */
    /* JADX WARN: Code duplicated, block: B:221:0x0520  */
    /* JADX WARN: Code duplicated, block: B:225:0x0530  */
    /* JADX WARN: Code duplicated, block: B:227:0x053c A[LOOP:10: B:223:0x052d->B:227:0x053c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x0566  */
    /* JADX WARN: Code duplicated, block: B:232:0x056c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0572  */
    /* JADX WARN: Code duplicated, block: B:235:0x0576  */
    /* JADX WARN: Code duplicated, block: B:237:0x0580  */
    /* JADX WARN: Code duplicated, block: B:239:0x0584  */
    /* JADX WARN: Code duplicated, block: B:241:0x0588  */
    /* JADX WARN: Code duplicated, block: B:244:0x0597 A[LOOP:12: B:242:0x058a->B:244:0x0597, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:258:0x0602  */
    /* JADX WARN: Code duplicated, block: B:259:0x060d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x045f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x054b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x05cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x05c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x05a2 A[EDGE_INSN: B:389:0x05a2->B:245:0x05a2 BREAK  A[LOOP:12: B:242:0x058a->B:244:0x0597], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x03ea A[ADDED_TO_REGION, EDGE_INSN: B:390:0x03ea->B:157:0x03ea BREAK  A[LOOP:13: B:146:0x03c7->B:165:0x0423], REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:198:0x0494, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"StateFlowValueCalledInComposition"})
    public static final void OooO00o(@NotNull o00000O o00000o, @NotNull androidx.navigation.OooO graph, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function3, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function4, @Nullable Composer composer, int i, int i2) {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function5;
        int i3;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function6;
        Modifier modifier2;
        Alignment alignment2;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function7;
        int i4;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function8;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function9;
        androidx.navigation.OooOOOO oooOOOO;
        androidx.navigation.compose.OooOo00 oooOo00;
        androidx.navigation.compose.OooO oooO;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function10;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function11;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13;
        int i5;
        androidx.navigation.compose.OooO oooO2;
        boolean z;
        Activity activity;
        int[] intArray;
        ArrayList parcelableArrayList;
        Bundle bundle;
        Bundle bundle2;
        NavDestination.OooO0O0 OooO0o1;
        ArrayDeque arrayDeque;
        NavDestination navDestination;
        androidx.navigation.OooO oooO3;
        ArrayList arrayList;
        Iterator it;
        Bundle bundleOooO0O0;
        ArrayList arrayList2;
        int[] iArr;
        boolean z2;
        androidx.navigation.OooO oooO4;
        int length;
        int i6;
        String strOooO0O0;
        int length2;
        Bundle[] bundleArr;
        int i7;
        int i8;
        androidx.navigation.OooO oooO5;
        int length3;
        int i9;
        int i10;
        Bundle bundle3;
        boolean z3;
        NavDestination navDestinationOooO0oo;
        androidx.navigation.OooO oooO6;
        int i11;
        int i12;
        int i13;
        Bundle bundle4;
        NavDestination navDestinationOooO0Oo;
        boolean z4;
        Bundle bundle5;
        int i14;
        NavDestination navDestinationOooO0oo2;
        androidx.navigation.OooO oooO7;
        boolean z5;
        Object obj;
        ArrayList<String> stringArrayList;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818191915);
        Modifier modifier3 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function14 = (i2 & 16) != 0 ? OooOo00.f6971OooO0Oo : function1;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function15 = (i2 & 32) != 0 ? OooOo.f6970OooO0Oo : function2;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            function5 = function14;
        } else {
            function5 = function3;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i3 &= -29360129;
            function6 = function15;
        } else {
            function6 = function4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1818191915, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:196)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
        }
        Object obj2 = o00000o.f6844OooO;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(obj2);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final StateFlow<List<NavBackStackEntry>> stateFlow = o00000o.f6844OooO;
            objRememberedValue = new Flow<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1

                /* JADX INFO: renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n207#3:224\n208#3:227\n766#4:225\n857#4:226\n858#4:228\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n207#1:225\n207#1:226\n207#1:228\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f6921OooO0Oo;

                    /* JADX INFO: renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2", f = "NavHost.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public /* synthetic */ Object f6922OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public int f6924OooO0o0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f6922OooO0Oo = obj;
                            this.f6924OooO0o0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f6921OooO0Oo = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f6924OooO0o0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f6924OooO0o0 = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f6922OooO0Oo;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f6924OooO0o0;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            ArrayList arrayList = new ArrayList();
                            for (T t : (List) obj) {
                                if (Intrinsics.areEqual(((NavBackStackEntry) t).getDestination().f6816OooO0Oo, "composable")) {
                                    arrayList.add(t);
                                }
                            }
                            anonymousClass1.f6924OooO0o0 = 1;
                            if (this.f6921OooO0Oo.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public final Object collect(@NotNull FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        p010OooOOoo.OooOo.OooO00o(((List) SnapshotStateKt.collectAsState((Flow) objRememberedValue, CollectionsKt.emptyList(), null, composerStartRestartGroup, 56, 2).getValue()).size() > 1, new OooO00o(o00000o), composerStartRestartGroup, 0, 0);
        EffectsKt.DisposableEffect(lifecycleOwner, new OooO0O0(o00000o, lifecycleOwner), composerStartRestartGroup, 8);
        ViewModelStore viewModelStore = current.getViewModelStore();
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        o000O00.o0OoOo0 o0oooo0 = o00000o.f6861OooOOo0;
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        o000O00.o0OoOo0.OooO00o oooO00o = o000O00.o0OoOo0.f34414OooO0O0;
        boolean zAreEqual = Intrinsics.areEqual(o0oooo0, (o000O00.o0OoOo0) new ViewModelProvider(viewModelStore, oooO00o, null, 4, null).get(o000O00.o0OoOo0.class));
        ArrayDeque<NavBackStackEntry> arrayDeque2 = o00000o.f6851OooO0oO;
        if (!zAreEqual) {
            if (!arrayDeque2.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            o00000o.f6861OooOOo0 = (o000O00.o0OoOo0) new ViewModelProvider(viewModelStore, oooO00o, null, 4, null).get(o000O00.o0OoOo0.class);
        }
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graph, "graph");
        boolean zAreEqual2 = Intrinsics.areEqual(o00000o.f6847OooO0OO, graph);
        androidx.navigation.OooOOOO oooOOOO2 = o00000o.f6867OooOo0o;
        if (zAreEqual2) {
            composerStartRestartGroup = composerStartRestartGroup;
            modifier2 = modifier3;
            alignment2 = center;
            function14 = function14;
            function7 = function15;
            i4 = i3;
            function8 = function5;
            function9 = function6;
            oooOOOO = oooOOOO2;
            oooOo00 = null;
            int iOooO = graph.f6836OooOOO0.OooO();
            for (int i15 = 0; i15 < iOooO; i15++) {
                NavDestination navDestinationOooOO0 = graph.f6836OooOOO0.OooOO0(i15);
                androidx.navigation.OooO oooO8 = o00000o.f6847OooO0OO;
                Intrinsics.checkNotNull(oooO8);
                int iOooO0oO = oooO8.f6836OooOOO0.OooO0oO(i15);
                androidx.navigation.OooO oooO9 = o00000o.f6847OooO0OO;
                Intrinsics.checkNotNull(oooO9);
                p188o00o0O.Oooo0<NavDestination> oooo0 = oooO9.f6836OooOOO0;
                if (oooo0.f38807OooO0Oo) {
                    oooo0.OooO0o0();
                }
                int iOooO0O0 = p188o00o0O.OooOOO.OooO0O0(oooo0.f38810OooO0oO, iOooO0oO, oooo0.f38809OooO0o0);
                if (iOooO0O0 >= 0) {
                    Object[] objArr = oooo0.f38808OooO0o;
                    Object obj3 = objArr[iOooO0O0];
                    objArr[iOooO0O0] = navDestinationOooOO0;
                }
            }
            for (NavBackStackEntry navBackStackEntry : arrayDeque2) {
                int i16 = NavDestination.f6814OooOO0o;
                List<NavDestination> listAsReversed = CollectionsKt.asReversed(SequencesKt.toList(NavDestination.OooO00o.OooO0OO(navBackStackEntry.getDestination())));
                NavDestination navDestinationOooO0oo3 = o00000o.f6847OooO0OO;
                Intrinsics.checkNotNull(navDestinationOooO0oo3);
                for (NavDestination navDestination2 : listAsReversed) {
                    if (!Intrinsics.areEqual(navDestination2, o00000o.f6847OooO0OO) || !Intrinsics.areEqual(navDestinationOooO0oo3, graph)) {
                        if (navDestinationOooO0oo3 instanceof androidx.navigation.OooO) {
                            navDestinationOooO0oo3 = ((androidx.navigation.OooO) navDestinationOooO0oo3).OooO0oo(navDestination2.f6821OooOO0, true);
                            Intrinsics.checkNotNull(navDestinationOooO0oo3);
                        }
                    }
                }
                navBackStackEntry.setDestination(navDestinationOooO0oo3);
            }
        } else {
            androidx.navigation.OooO oooO10 = o00000o.f6847OooO0OO;
            LinkedHashMap linkedHashMap = o00000o.f6863OooOo;
            if (oooO10 != null) {
                Iterator it2 = new ArrayList(o00000o.f6856OooOOO.keySet()).iterator();
                while (it2.hasNext()) {
                    Integer id = (Integer) it2.next();
                    Iterator it3 = it2;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    int iIntValue = id.intValue();
                    Iterator it4 = linkedHashMap.values().iterator();
                    while (it4.hasNext()) {
                        ((androidx.navigation.OooO0O0.OooO00o) it4.next()).f34378OooO0Oo = true;
                        it4 = it4;
                        i3 = i3;
                    }
                    int i17 = i3;
                    boolean zOooOOo0 = o00000o.OooOOo0(iIntValue, null, o00000OO.OooO00o(o000O00.OooOOO0.f34358OooO0Oo), null);
                    Iterator it5 = linkedHashMap.values().iterator();
                    while (it5.hasNext()) {
                        ((androidx.navigation.OooO0O0.OooO00o) it5.next()).f34378OooO0Oo = false;
                        it5 = it5;
                        function6 = function6;
                    }
                    Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function16 = function6;
                    if (zOooOOo0) {
                        o00000o.OooOOO0(iIntValue, true, false);
                    }
                    it2 = it3;
                    function6 = function16;
                    i3 = i17;
                }
                i4 = i3;
                function9 = function6;
                o00000o.OooOOO0(oooO10.f6821OooOO0, true, false);
            } else {
                i4 = i3;
                function9 = function6;
            }
            o00000o.f6847OooO0OO = graph;
            Bundle bundle6 = o00000o.f6848OooO0Oo;
            if (bundle6 != null && (stringArrayList = bundle6.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                for (String name : stringArrayList) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    oooOOOO2.OooO0O0(name);
                    Bundle savedState = bundle6.getBundle(name);
                    if (savedState != null) {
                        Intrinsics.checkNotNullParameter(savedState, "savedState");
                    }
                }
            }
            Parcelable[] parcelableArr = o00000o.f6850OooO0o0;
            Context context = o00000o.f6845OooO00o;
            if (parcelableArr != null) {
                int length4 = parcelableArr.length;
                int i18 = 0;
                while (i18 < length4) {
                    int i19 = length4;
                    Parcelable parcelable = parcelableArr[i18];
                    Parcelable[] parcelableArr2 = parcelableArr;
                    Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                    NavDestination navDestinationOooO0Oo2 = o00000o.OooO0Oo(navBackStackEntryState.f6812OooO0o0);
                    if (navDestinationOooO0Oo2 == null) {
                        int i20 = NavDestination.f6814OooOO0o;
                        StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("Restoring the Navigation back stack failed: destination ", NavDestination.OooO00o.OooO0O0(navBackStackEntryState.f6812OooO0o0, context), " cannot be found from the current destination ");
                        sbOooO00o.append(o00000o.OooO0o());
                        throw new IllegalStateException(sbOooO00o.toString());
                    }
                    Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function17 = function5;
                    Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function18 = function15;
                    NavBackStackEntry navBackStackEntryOooO00o = navBackStackEntryState.OooO00o(context, navDestinationOooO0Oo2, o00000o.OooO0oO(), o00000o.f6861OooOOo0);
                    Navigator navigatorOooO0O0 = oooOOOO2.OooO0O0(navDestinationOooO0Oo2.f6816OooO0Oo);
                    Object obj4 = linkedHashMap.get(navigatorOooO0O0);
                    if (obj4 == null) {
                        obj = obj4;
                        androidx.navigation.OooO0O0.OooO00o oooO00o2 = new androidx.navigation.OooO0O0.OooO00o(o00000o, navigatorOooO0O0);
                        linkedHashMap.put(navigatorOooO0O0, oooO00o2);
                        obj = oooO00o2;
                    }
                    obj = obj4;
                    arrayDeque2.add(navBackStackEntryOooO00o);
                    ((androidx.navigation.OooO0O0.OooO00o) obj).OooO0oO(navBackStackEntryOooO00o);
                    androidx.navigation.OooO oooO11 = navBackStackEntryOooO00o.getDestination().f6818OooO0o0;
                    if (oooO11 != null) {
                        o00000o.OooO(navBackStackEntryOooO00o, o00000o.OooO0o0(oooO11.f6821OooOO0));
                    }
                    i18++;
                    length4 = i19;
                    parcelableArr = parcelableArr2;
                    function5 = function17;
                    function15 = function18;
                }
                function7 = function15;
                function8 = function5;
                o00000o.OooOo00();
                o00000o.f6850OooO0o0 = null;
            } else {
                function7 = function15;
                function8 = function5;
            }
            Collection collectionValues = MapsKt.toMap(oooOOOO2.f6916OooO00o).values();
            ArrayList<Navigator> arrayList3 = new ArrayList();
            for (Object obj5 : collectionValues) {
                if (!((Navigator) obj5).f6832OooO0O0) {
                    arrayList3.add(obj5);
                }
            }
            for (Navigator navigator : arrayList3) {
                Object oooO00o3 = linkedHashMap.get(navigator);
                if (oooO00o3 == null) {
                    oooO00o3 = new androidx.navigation.OooO0O0.OooO00o(o00000o, navigator);
                    linkedHashMap.put(navigator, oooO00o3);
                }
                androidx.navigation.OooO0O0.OooO00o state = (androidx.navigation.OooO0O0.OooO00o) oooO00o3;
                navigator.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                navigator.f6831OooO00o = state;
                navigator.f6832OooO0O0 = true;
            }
            if (o00000o.f6847OooO0OO == null || !arrayDeque2.isEmpty()) {
                composerStartRestartGroup = composerStartRestartGroup;
                modifier2 = modifier3;
                alignment2 = center;
                function14 = function14;
                oooOOOO = oooOOOO2;
                oooOo00 = null;
                o00000o.OooO0O0();
            } else {
                if (o00000o.f6849OooO0o || (activity = o00000o.f6846OooO0O0) == null) {
                    composerStartRestartGroup = composerStartRestartGroup;
                    modifier2 = modifier3;
                    alignment2 = center;
                    function14 = function14;
                    oooOOOO = oooOOOO2;
                } else {
                    Intrinsics.checkNotNull(activity);
                    Intent intent = activity.getIntent();
                    if (intent == null) {
                        composerStartRestartGroup = composerStartRestartGroup;
                        modifier2 = modifier3;
                        alignment2 = center;
                        function14 = function14;
                        oooOOOO = oooOOOO2;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                function14 = function14;
                            } catch (Exception e) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                intArray = null;
                            }
                            if (extras != null) {
                                parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                            } else {
                                parcelableArrayList = null;
                            }
                            bundle = new Bundle();
                            if (extras != null) {
                                bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            } else {
                                bundle2 = null;
                            }
                            if (bundle2 != null) {
                                bundle.putAll(bundle2);
                            }
                            if (intArray == null) {
                                androidx.navigation.OooO oooO12 = o00000o.f6847OooO0OO;
                                Intrinsics.checkNotNull(oooO12);
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                alignment2 = center;
                                modifier2 = modifier3;
                                OooO0o1 = oooO12.OooO0o0(new o0O0O00(intent.getAction(), intent.getData(), intent.getType()));
                                if (OooO0o1 != null) {
                                    NavDestination navDestination3 = OooO0o1.f6825OooO0Oo;
                                    navDestination3.getClass();
                                    arrayDeque = new ArrayDeque();
                                    navDestination = navDestination3;
                                    while (true) {
                                        Intrinsics.checkNotNull(navDestination);
                                        oooO3 = navDestination.f6818OooO0o0;
                                        if (oooO3 != null) {
                                            oooOOOO = oooOOOO2;
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            if (oooO3.f6835OooOOO != navDestination.f6821OooOO0) {
                                            }
                                            if (!Intrinsics.areEqual(oooO3, (Object) null) || oooO3 == null) {
                                                break;
                                            }
                                            navDestination = oooO3;
                                            oooOOOO2 = oooOOOO;
                                            composerStartRestartGroup = composerStartRestartGroup;
                                        } else {
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            oooOOOO = oooOOOO2;
                                        }
                                        arrayDeque.addFirst(navDestination);
                                        if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                            break;
                                        }
                                        navDestination = oooO3;
                                        oooOOOO2 = oooOOOO;
                                        composerStartRestartGroup = composerStartRestartGroup;
                                    }
                                    List list = CollectionsKt.toList(arrayDeque);
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((NavDestination) it.next()).f6821OooOO0));
                                    }
                                    int[] intArray2 = CollectionsKt___CollectionsKt.toIntArray(arrayList);
                                    bundleOooO0O0 = navDestination3.OooO0O0(OooO0o1.f6827OooO0o0);
                                    if (bundleOooO0O0 != null) {
                                        bundle.putAll(bundleOooO0O0);
                                    }
                                    arrayList2 = null;
                                    iArr = intArray2;
                                } else {
                                    oooOOOO = oooOOOO2;
                                    arrayList2 = parcelableArrayList;
                                    iArr = intArray;
                                }
                            } else {
                                if (intArray.length == 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    androidx.navigation.OooO oooO13 = o00000o.f6847OooO0OO;
                                    Intrinsics.checkNotNull(oooO13);
                                    Intrinsics.checkNotNullParameter(intent, "intent");
                                    alignment2 = center;
                                    modifier2 = modifier3;
                                    OooO0o1 = oooO13.OooO0o0(new o0O0O00(intent.getAction(), intent.getData(), intent.getType()));
                                    if (OooO0o1 != null) {
                                        NavDestination navDestination4 = OooO0o1.f6825OooO0Oo;
                                        navDestination4.getClass();
                                        arrayDeque = new ArrayDeque();
                                        navDestination = navDestination4;
                                        while (true) {
                                            Intrinsics.checkNotNull(navDestination);
                                            oooO3 = navDestination.f6818OooO0o0;
                                            if (oooO3 != null) {
                                                oooOOOO = oooOOOO2;
                                                composerStartRestartGroup = composerStartRestartGroup;
                                                if (oooO3.f6835OooOOO != navDestination.f6821OooOO0) {
                                                }
                                                if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                                    break;
                                                    break;
                                                } else {
                                                    navDestination = oooO3;
                                                    oooOOOO2 = oooOOOO;
                                                    composerStartRestartGroup = composerStartRestartGroup;
                                                }
                                            } else {
                                                composerStartRestartGroup = composerStartRestartGroup;
                                                oooOOOO = oooOOOO2;
                                            }
                                            arrayDeque.addFirst(navDestination);
                                            if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                                break;
                                                break;
                                            } else {
                                                navDestination = oooO3;
                                                oooOOOO2 = oooOOOO;
                                                composerStartRestartGroup = composerStartRestartGroup;
                                            }
                                        }
                                        List list2 = CollectionsKt.toList(arrayDeque);
                                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(Integer.valueOf(((NavDestination) it.next()).f6821OooOO0));
                                        }
                                        int[] intArray3 = CollectionsKt___CollectionsKt.toIntArray(arrayList);
                                        bundleOooO0O0 = navDestination4.OooO0O0(OooO0o1.f6827OooO0o0);
                                        if (bundleOooO0O0 != null) {
                                            bundle.putAll(bundleOooO0O0);
                                        }
                                        arrayList2 = null;
                                        iArr = intArray3;
                                    }
                                } else {
                                    modifier2 = modifier3;
                                    alignment2 = center;
                                }
                                oooOOOO = oooOOOO2;
                                arrayList2 = parcelableArrayList;
                                iArr = intArray;
                            }
                            if (iArr == null) {
                                if (iArr.length == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    oooO4 = o00000o.f6847OooO0OO;
                                    length = iArr.length;
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            strOooO0O0 = null;
                                            break;
                                        }
                                        i14 = iArr[i6];
                                        if (i6 == 0) {
                                            oooO7 = o00000o.f6847OooO0OO;
                                            Intrinsics.checkNotNull(oooO7);
                                            if (oooO7.f6821OooOO0 == i14) {
                                                navDestinationOooO0oo2 = o00000o.f6847OooO0OO;
                                            } else {
                                                navDestinationOooO0oo2 = null;
                                            }
                                        } else {
                                            Intrinsics.checkNotNull(oooO4);
                                            navDestinationOooO0oo2 = oooO4.OooO0oo(i14, true);
                                        }
                                        if (navDestinationOooO0oo2 == null) {
                                            int i21 = NavDestination.f6814OooOO0o;
                                            strOooO0O0 = NavDestination.OooO00o.OooO0O0(i14, context);
                                            break;
                                        }
                                        if (i6 == iArr.length - 1 && (navDestinationOooO0oo2 instanceof androidx.navigation.OooO)) {
                                            androidx.navigation.OooO oooO14 = (androidx.navigation.OooO) navDestinationOooO0oo2;
                                            boolean z6 = true;
                                            while (true) {
                                                Intrinsics.checkNotNull(oooO14);
                                                if (!(oooO14.OooO0oo(oooO14.f6835OooOOO, z6) instanceof androidx.navigation.OooO)) {
                                                    break;
                                                }
                                                oooO14 = (androidx.navigation.OooO) oooO14.OooO0oo(oooO14.f6835OooOOO, z6);
                                                z6 = true;
                                            }
                                            oooO4 = oooO14;
                                        }
                                        i6++;
                                    }
                                    if (strOooO0O0 != null) {
                                        Log.i("NavController", "Could not find destination " + strOooO0O0 + " in the navigation graph, ignoring the deep link from " + intent);
                                    } else {
                                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                        length2 = iArr.length;
                                        bundleArr = new Bundle[length2];
                                        for (i7 = 0; i7 < length2; i7++) {
                                            Bundle bundle7 = new Bundle();
                                            bundle7.putAll(bundle);
                                            if (arrayList2 == null && (bundle5 = (Bundle) arrayList2.get(i7)) != null) {
                                                bundle7.putAll(bundle5);
                                            }
                                            bundleArr[i7] = bundle7;
                                        }
                                        int flags = intent.getFlags();
                                        i8 = 268435456 & flags;
                                        if (i8 == 0 && (flags & ShareRequest.THUMB_DATA_SIZE_LIMIT) == 0) {
                                            intent.addFlags(ShareRequest.THUMB_DATA_SIZE_LIMIT);
                                            o00000O.o0O0O00 o0o0o00 = new o00000O.o0O0O00(context);
                                            ComponentName component = intent.getComponent();
                                            if (component == null) {
                                                component = intent.resolveActivity(o0o0o00.f33967OooO0o0.getPackageManager());
                                            }
                                            if (component != null) {
                                                o0o0o00.OooO00o(component);
                                            }
                                            o0o0o00.f33966OooO0Oo.add(intent);
                                            Intrinsics.checkNotNullExpressionValue(o0o0o00, "create(context)\n        …ntWithParentStack(intent)");
                                            o0o0o00.OooO0O0();
                                            activity.finish();
                                            activity.overridePendingTransition(0, 0);
                                        } else if (i8 != 0) {
                                            if (!arrayDeque2.isEmpty()) {
                                                androidx.navigation.OooO oooO15 = o00000o.f6847OooO0OO;
                                                Intrinsics.checkNotNull(oooO15);
                                                o00000o.OooOOO0(oooO15.f6821OooOO0, true, false);
                                            }
                                            i11 = 0;
                                            while (i11 < iArr.length) {
                                                i12 = iArr[i11];
                                                i13 = i11 + 1;
                                                bundle4 = bundleArr[i11];
                                                navDestinationOooO0Oo = o00000o.OooO0Oo(i12);
                                                if (navDestinationOooO0Oo == null) {
                                                    int i22 = NavDestination.f6814OooOO0o;
                                                    StringBuilder sbOooO00o2 = p004OooO0oO.o0OoOo0.OooO00o("Deep Linking failed: destination ", NavDestination.OooO00o.OooO0O0(i12, context), " cannot be found from the current destination ");
                                                    sbOooO00o2.append(o00000o.OooO0o());
                                                    throw new IllegalStateException(sbOooO00o2.toString());
                                                }
                                                o00000o.OooOO0(navDestinationOooO0Oo, bundle4, o00000OO.OooO00o(new androidx.navigation.OooO0o(navDestinationOooO0Oo, o00000o)), null);
                                                i11 = i13;
                                            }
                                        } else {
                                            oooO5 = o00000o.f6847OooO0OO;
                                            length3 = iArr.length;
                                            for (i9 = 0; i9 < length3; i9++) {
                                                i10 = iArr[i9];
                                                bundle3 = bundleArr[i9];
                                                if (i9 == 0) {
                                                    navDestinationOooO0oo = o00000o.f6847OooO0OO;
                                                    z3 = true;
                                                } else {
                                                    Intrinsics.checkNotNull(oooO5);
                                                    z3 = true;
                                                    navDestinationOooO0oo = oooO5.OooO0oo(i10, true);
                                                }
                                                if (navDestinationOooO0oo == null) {
                                                    int i23 = NavDestination.f6814OooOO0o;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.OooO00o.OooO0O0(i10, context) + " cannot be found in graph " + oooO5);
                                                }
                                                if (i9 == iArr.length - (z3 ? 1 : 0)) {
                                                    androidx.navigation.OooO oooO16 = o00000o.f6847OooO0OO;
                                                    Intrinsics.checkNotNull(oooO16);
                                                    o00000o.OooOO0(navDestinationOooO0oo, bundle3, new androidx.navigation.OooOOO0(false, false, oooO16.f6821OooOO0, true, false, 0, 0, -1, -1), null);
                                                } else if (navDestinationOooO0oo instanceof androidx.navigation.OooO) {
                                                    oooO6 = (androidx.navigation.OooO) navDestinationOooO0oo;
                                                    while (true) {
                                                        Intrinsics.checkNotNull(oooO6);
                                                        if (!(oooO6.OooO0oo(oooO6.f6835OooOOO, z3) instanceof androidx.navigation.OooO)) {
                                                            break;
                                                        }
                                                        oooO6 = (androidx.navigation.OooO) oooO6.OooO0oo(oooO6.f6835OooOOO, z3);
                                                        z3 = true;
                                                    }
                                                    oooO5 = oooO6;
                                                }
                                            }
                                            o00000o.f6849OooO0o = true;
                                        }
                                        z4 = true;
                                    }
                                }
                            }
                            z = z4;
                            if (z) {
                                oooOo00 = null;
                            } else {
                                NavDestination navDestination5 = o00000o.f6847OooO0OO;
                                Intrinsics.checkNotNull(navDestination5);
                                oooOo00 = null;
                                o00000o.OooOO0(navDestination5, null, null, null);
                            }
                        }
                        intArray = null;
                        if (extras != null) {
                            parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        } else {
                            parcelableArrayList = null;
                        }
                        bundle = new Bundle();
                        if (extras != null) {
                            bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                        } else {
                            bundle2 = null;
                        }
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        if (intArray == null) {
                            androidx.navigation.OooO oooO17 = o00000o.f6847OooO0OO;
                            Intrinsics.checkNotNull(oooO17);
                            Intrinsics.checkNotNullParameter(intent, "intent");
                            alignment2 = center;
                            modifier2 = modifier3;
                            OooO0o1 = oooO17.OooO0o0(new o0O0O00(intent.getAction(), intent.getData(), intent.getType()));
                            if (OooO0o1 != null) {
                                NavDestination navDestination6 = OooO0o1.f6825OooO0Oo;
                                navDestination6.getClass();
                                arrayDeque = new ArrayDeque();
                                navDestination = navDestination6;
                                while (true) {
                                    Intrinsics.checkNotNull(navDestination);
                                    oooO3 = navDestination.f6818OooO0o0;
                                    if (oooO3 != null) {
                                        oooOOOO = oooOOOO2;
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        if (oooO3.f6835OooOOO != navDestination.f6821OooOO0) {
                                        }
                                        if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                            break;
                                            break;
                                        } else {
                                            navDestination = oooO3;
                                            oooOOOO2 = oooOOOO;
                                            composerStartRestartGroup = composerStartRestartGroup;
                                        }
                                    } else {
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        oooOOOO = oooOOOO2;
                                    }
                                    arrayDeque.addFirst(navDestination);
                                    if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                        break;
                                        break;
                                    } else {
                                        navDestination = oooO3;
                                        oooOOOO2 = oooOOOO;
                                        composerStartRestartGroup = composerStartRestartGroup;
                                    }
                                }
                                List list3 = CollectionsKt.toList(arrayDeque);
                                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((NavDestination) it.next()).f6821OooOO0));
                                }
                                int[] intArray4 = CollectionsKt___CollectionsKt.toIntArray(arrayList);
                                bundleOooO0O0 = navDestination6.OooO0O0(OooO0o1.f6827OooO0o0);
                                if (bundleOooO0O0 != null) {
                                    bundle.putAll(bundleOooO0O0);
                                }
                                arrayList2 = null;
                                iArr = intArray4;
                            } else {
                                oooOOOO = oooOOOO2;
                                arrayList2 = parcelableArrayList;
                                iArr = intArray;
                            }
                        } else {
                            if (intArray.length == 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                androidx.navigation.OooO oooO18 = o00000o.f6847OooO0OO;
                                Intrinsics.checkNotNull(oooO18);
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                alignment2 = center;
                                modifier2 = modifier3;
                                OooO0o1 = oooO18.OooO0o0(new o0O0O00(intent.getAction(), intent.getData(), intent.getType()));
                                if (OooO0o1 != null) {
                                    NavDestination navDestination7 = OooO0o1.f6825OooO0Oo;
                                    navDestination7.getClass();
                                    arrayDeque = new ArrayDeque();
                                    navDestination = navDestination7;
                                    while (true) {
                                        Intrinsics.checkNotNull(navDestination);
                                        oooO3 = navDestination.f6818OooO0o0;
                                        if (oooO3 != null) {
                                            oooOOOO = oooOOOO2;
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            if (oooO3.f6835OooOOO != navDestination.f6821OooOO0) {
                                            }
                                            if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                                break;
                                                break;
                                            } else {
                                                navDestination = oooO3;
                                                oooOOOO2 = oooOOOO;
                                                composerStartRestartGroup = composerStartRestartGroup;
                                            }
                                        } else {
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            oooOOOO = oooOOOO2;
                                        }
                                        arrayDeque.addFirst(navDestination);
                                        if (!Intrinsics.areEqual(oooO3, (Object) null)) {
                                            break;
                                            break;
                                        } else {
                                            navDestination = oooO3;
                                            oooOOOO2 = oooOOOO;
                                            composerStartRestartGroup = composerStartRestartGroup;
                                        }
                                    }
                                    List list4 = CollectionsKt.toList(arrayDeque);
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                    it = list4.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(Integer.valueOf(((NavDestination) it.next()).f6821OooOO0));
                                    }
                                    int[] intArray5 = CollectionsKt___CollectionsKt.toIntArray(arrayList);
                                    bundleOooO0O0 = navDestination7.OooO0O0(OooO0o1.f6827OooO0o0);
                                    if (bundleOooO0O0 != null) {
                                        bundle.putAll(bundleOooO0O0);
                                    }
                                    arrayList2 = null;
                                    iArr = intArray5;
                                }
                            } else {
                                modifier2 = modifier3;
                                alignment2 = center;
                            }
                            oooOOOO = oooOOOO2;
                            arrayList2 = parcelableArrayList;
                            iArr = intArray;
                        }
                        if (iArr == null) {
                            if (iArr.length == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                oooO4 = o00000o.f6847OooO0OO;
                                length = iArr.length;
                                i6 = 0;
                                while (true) {
                                    if (i6 < length) {
                                        strOooO0O0 = null;
                                        break;
                                    }
                                    i14 = iArr[i6];
                                    if (i6 == 0) {
                                        oooO7 = o00000o.f6847OooO0OO;
                                        Intrinsics.checkNotNull(oooO7);
                                        if (oooO7.f6821OooOO0 == i14) {
                                            navDestinationOooO0oo2 = o00000o.f6847OooO0OO;
                                        } else {
                                            navDestinationOooO0oo2 = null;
                                        }
                                    } else {
                                        Intrinsics.checkNotNull(oooO4);
                                        navDestinationOooO0oo2 = oooO4.OooO0oo(i14, true);
                                    }
                                    if (navDestinationOooO0oo2 == null) {
                                        int i24 = NavDestination.f6814OooOO0o;
                                        strOooO0O0 = NavDestination.OooO00o.OooO0O0(i14, context);
                                        break;
                                    } else {
                                        if (i6 == iArr.length - 1) {
                                        }
                                        i6++;
                                    }
                                }
                                if (strOooO0O0 != null) {
                                    Log.i("NavController", "Could not find destination " + strOooO0O0 + " in the navigation graph, ignoring the deep link from " + intent);
                                } else {
                                    bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    length2 = iArr.length;
                                    bundleArr = new Bundle[length2];
                                    while (i7 < length2) {
                                        Bundle bundle8 = new Bundle();
                                        bundle8.putAll(bundle);
                                        if (arrayList2 == null) {
                                        }
                                        bundleArr[i7] = bundle8;
                                    }
                                    int flags2 = intent.getFlags();
                                    i8 = 268435456 & flags2;
                                    if (i8 == 0) {
                                        if (i8 != 0) {
                                            if (!arrayDeque2.isEmpty()) {
                                                androidx.navigation.OooO oooO19 = o00000o.f6847OooO0OO;
                                                Intrinsics.checkNotNull(oooO19);
                                                o00000o.OooOOO0(oooO19.f6821OooOO0, true, false);
                                            }
                                            i11 = 0;
                                            while (i11 < iArr.length) {
                                                i12 = iArr[i11];
                                                i13 = i11 + 1;
                                                bundle4 = bundleArr[i11];
                                                navDestinationOooO0Oo = o00000o.OooO0Oo(i12);
                                                if (navDestinationOooO0Oo == null) {
                                                    int i25 = NavDestination.f6814OooOO0o;
                                                    StringBuilder sbOooO00o3 = p004OooO0oO.o0OoOo0.OooO00o("Deep Linking failed: destination ", NavDestination.OooO00o.OooO0O0(i12, context), " cannot be found from the current destination ");
                                                    sbOooO00o3.append(o00000o.OooO0o());
                                                    throw new IllegalStateException(sbOooO00o3.toString());
                                                }
                                                o00000o.OooOO0(navDestinationOooO0Oo, bundle4, o00000OO.OooO00o(new androidx.navigation.OooO0o(navDestinationOooO0Oo, o00000o)), null);
                                                i11 = i13;
                                            }
                                        } else {
                                            oooO5 = o00000o.f6847OooO0OO;
                                            length3 = iArr.length;
                                            while (i9 < length3) {
                                                i10 = iArr[i9];
                                                bundle3 = bundleArr[i9];
                                                if (i9 == 0) {
                                                    navDestinationOooO0oo = o00000o.f6847OooO0OO;
                                                    z3 = true;
                                                } else {
                                                    Intrinsics.checkNotNull(oooO5);
                                                    z3 = true;
                                                    navDestinationOooO0oo = oooO5.OooO0oo(i10, true);
                                                }
                                                if (navDestinationOooO0oo == null) {
                                                    int i26 = NavDestination.f6814OooOO0o;
                                                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.OooO00o.OooO0O0(i10, context) + " cannot be found in graph " + oooO5);
                                                }
                                                if (i9 == iArr.length - (z3 ? 1 : 0)) {
                                                    androidx.navigation.OooO oooO110 = o00000o.f6847OooO0OO;
                                                    Intrinsics.checkNotNull(oooO110);
                                                    o00000o.OooOO0(navDestinationOooO0oo, bundle3, new androidx.navigation.OooOOO0(false, false, oooO110.f6821OooOO0, true, false, 0, 0, -1, -1), null);
                                                } else if (navDestinationOooO0oo instanceof androidx.navigation.OooO) {
                                                    oooO6 = (androidx.navigation.OooO) navDestinationOooO0oo;
                                                    while (true) {
                                                        Intrinsics.checkNotNull(oooO6);
                                                        if (!(oooO6.OooO0oo(oooO6.f6835OooOOO, z3) instanceof androidx.navigation.OooO)) {
                                                            break;
                                                            break;
                                                        } else {
                                                            oooO6 = (androidx.navigation.OooO) oooO6.OooO0oo(oooO6.f6835OooOOO, z3);
                                                            z3 = true;
                                                        }
                                                    }
                                                    oooO5 = oooO6;
                                                }
                                            }
                                            o00000o.f6849OooO0o = true;
                                        }
                                    } else if (i8 != 0) {
                                        if (!arrayDeque2.isEmpty()) {
                                            androidx.navigation.OooO oooO111 = o00000o.f6847OooO0OO;
                                            Intrinsics.checkNotNull(oooO111);
                                            o00000o.OooOOO0(oooO111.f6821OooOO0, true, false);
                                        }
                                        i11 = 0;
                                        while (i11 < iArr.length) {
                                            i12 = iArr[i11];
                                            i13 = i11 + 1;
                                            bundle4 = bundleArr[i11];
                                            navDestinationOooO0Oo = o00000o.OooO0Oo(i12);
                                            if (navDestinationOooO0Oo == null) {
                                                int i27 = NavDestination.f6814OooOO0o;
                                                StringBuilder sbOooO00o4 = p004OooO0oO.o0OoOo0.OooO00o("Deep Linking failed: destination ", NavDestination.OooO00o.OooO0O0(i12, context), " cannot be found from the current destination ");
                                                sbOooO00o4.append(o00000o.OooO0o());
                                                throw new IllegalStateException(sbOooO00o4.toString());
                                            }
                                            o00000o.OooOO0(navDestinationOooO0Oo, bundle4, o00000OO.OooO00o(new androidx.navigation.OooO0o(navDestinationOooO0Oo, o00000o)), null);
                                            i11 = i13;
                                        }
                                    } else {
                                        oooO5 = o00000o.f6847OooO0OO;
                                        length3 = iArr.length;
                                        while (i9 < length3) {
                                            i10 = iArr[i9];
                                            bundle3 = bundleArr[i9];
                                            if (i9 == 0) {
                                                navDestinationOooO0oo = o00000o.f6847OooO0OO;
                                                z3 = true;
                                            } else {
                                                Intrinsics.checkNotNull(oooO5);
                                                z3 = true;
                                                navDestinationOooO0oo = oooO5.OooO0oo(i10, true);
                                            }
                                            if (navDestinationOooO0oo == null) {
                                                int i28 = NavDestination.f6814OooOO0o;
                                                throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.OooO00o.OooO0O0(i10, context) + " cannot be found in graph " + oooO5);
                                            }
                                            if (i9 == iArr.length - (z3 ? 1 : 0)) {
                                                androidx.navigation.OooO oooO112 = o00000o.f6847OooO0OO;
                                                Intrinsics.checkNotNull(oooO112);
                                                o00000o.OooOO0(navDestinationOooO0oo, bundle3, new androidx.navigation.OooOOO0(false, false, oooO112.f6821OooOO0, true, false, 0, 0, -1, -1), null);
                                            } else if (navDestinationOooO0oo instanceof androidx.navigation.OooO) {
                                                oooO6 = (androidx.navigation.OooO) navDestinationOooO0oo;
                                                while (true) {
                                                    Intrinsics.checkNotNull(oooO6);
                                                    if (!(oooO6.OooO0oo(oooO6.f6835OooOOO, z3) instanceof androidx.navigation.OooO)) {
                                                        break;
                                                        break;
                                                    } else {
                                                        oooO6 = (androidx.navigation.OooO) oooO6.OooO0oo(oooO6.f6835OooOOO, z3);
                                                        z3 = true;
                                                    }
                                                }
                                                oooO5 = oooO6;
                                            }
                                        }
                                        o00000o.f6849OooO0o = true;
                                    }
                                    z4 = true;
                                }
                            }
                        }
                        if (z4) {
                        }
                        if (z) {
                            NavDestination navDestination8 = o00000o.f6847OooO0OO;
                            Intrinsics.checkNotNull(navDestination8);
                            oooOo00 = null;
                            o00000o.OooOO0(navDestination8, null, null, null);
                        } else {
                            oooOo00 = null;
                        }
                    }
                    z4 = false;
                    if (z4) {
                    }
                    if (z) {
                        NavDestination navDestination9 = o00000o.f6847OooO0OO;
                        Intrinsics.checkNotNull(navDestination9);
                        oooOo00 = null;
                        o00000o.OooOO0(navDestination9, null, null, null);
                    } else {
                        oooOo00 = null;
                    }
                }
                if (z) {
                    NavDestination navDestination10 = o00000o.f6847OooO0OO;
                    Intrinsics.checkNotNull(navDestination10);
                    oooOo00 = null;
                    o00000o.OooOO0(navDestination10, null, null, null);
                } else {
                    oooOo00 = null;
                }
            }
        }
        Composer composer2 = composerStartRestartGroup;
        SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composer2, 0);
        androidx.navigation.OooOOOO oooOOOO3 = oooOOOO;
        Navigator navigatorOooO0O1 = oooOOOO3.OooO0O0("composable");
        if (navigatorOooO0O1 instanceof androidx.navigation.compose.OooO) {
            oooO2 = (androidx.navigation.compose.OooO) navigatorOooO0O1;
        } else {
            oooO = oooOo00;
        }
        if (oooO == 0) {
            if (ComposerKt.isTraceInProgress()) {
                oooO = oooO2;
                ComposerKt.traceEventEnd();
            }
            oooO = oooO2;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(o00000o, graph, modifier2, alignment2, function14, function7, function8, function9, i, i2));
            return;
        }
        composer2.startReplaceableGroup(1157296644);
        final StateFlow<List<NavBackStackEntry>> stateFlow2 = o00000o.f6854OooOO0O;
        boolean zChanged2 = composer2.changed(stateFlow2);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            oooO = oooO2;
            oooO = oooO2;
            objRememberedValue2 = new Flow<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1

                /* JADX INFO: renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n48#2:223\n236#3:224\n237#3:227\n766#4:225\n857#4:226\n858#4:228\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n236#1:225\n236#1:226\n236#1:228\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f6926OooO0Oo;

                    /* JADX INFO: renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2", f = "NavHost.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public /* synthetic */ Object f6927OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public int f6929OooO0o0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f6927OooO0Oo = obj;
                            this.f6929OooO0o0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f6926OooO0Oo = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f6929OooO0o0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f6929OooO0o0 = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f6927OooO0Oo;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f6929OooO0o0;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            ArrayList arrayList = new ArrayList();
                            for (T t : (List) obj) {
                                if (Intrinsics.areEqual(((NavBackStackEntry) t).getDestination().f6816OooO0Oo, "composable")) {
                                    arrayList.add(t);
                                }
                            }
                            anonymousClass1.f6929OooO0o0 = 1;
                            if (this.f6926OooO0Oo.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public final Object collect(@NotNull FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            composer2.updateRememberedValue(objRememberedValue2);
        }
        oooO = oooO2;
        composer2.endReplaceableGroup();
        State stateCollectAsState = SnapshotStateKt.collectAsState((Flow) objRememberedValue2, CollectionsKt.emptyList(), null, composer2, 56, 2);
        NavBackStackEntry navBackStackEntry2 = ((Boolean) composer2.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue() ? (NavBackStackEntry) CollectionsKt.lastOrNull((List) oooO.OooO0O0().f34380OooO0o0.getValue()) : (NavBackStackEntry) CollectionsKt.lastOrNull((List) stateCollectAsState.getValue());
        composer2.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer2.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new LinkedHashMap();
            composer2.updateRememberedValue(objRememberedValue3);
        }
        composer2.endReplaceableGroup();
        Map map = (Map) objRememberedValue3;
        composer2.startReplaceableGroup(1822178354);
        if (navBackStackEntry2 != null) {
            composer2.startReplaceableGroup(1618982084);
            Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function19 = function8;
            Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function20 = function14;
            boolean zChanged3 = composer2.changed(oooO) | composer2.changed(function19) | composer2.changed(function20);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new o000oOoO(oooO, function19, function20);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            Function1 function21 = (Function1) objRememberedValue4;
            composer2.startReplaceableGroup(1618982084);
            Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function22 = function9;
            Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function23 = function7;
            boolean zChanged4 = composer2.changed(oooO) | composer2.changed(function22) | composer2.changed(function23);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new o0OoOo0(oooO, function22, function23);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            composer2.endReplaceableGroup();
            Function1 function24 = (Function1) objRememberedValue5;
            i5 = 0;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(navBackStackEntry2, "entry", composer2, 56, 0);
            function12 = function23;
            function10 = function22;
            function13 = function20;
            function11 = function19;
            AnimatedContentKt.AnimatedContent(transitionUpdateTransition, modifier2, new OooO0OO(map, oooO, function21, function24, stateCollectAsState), alignment2, OooO0o.f6941OooO0Oo, ComposableLambdaKt.composableLambda(composer2, -1440061047, true, new OooO(oooO, saveableStateHolderRememberSaveableStateHolder, stateCollectAsState)), composer2, ((i4 >> 3) & 112) | 221184 | (i4 & 7168), 0);
            EffectsKt.LaunchedEffect(transitionUpdateTransition.getCurrentState(), transitionUpdateTransition.getTargetState(), new OooOO0(transitionUpdateTransition, map, stateCollectAsState, oooO, null), composer2, 584);
            oooOo00 = null;
        } else {
            function10 = function9;
            function11 = function8;
            function12 = function7;
            function13 = function14;
            i5 = 0;
        }
        composer2.endReplaceableGroup();
        Navigator navigatorOooO0O2 = oooOOOO3.OooO0O0("dialog");
        if (navigatorOooO0O2 instanceof androidx.navigation.compose.OooOo00) {
            oooOo00 = (androidx.navigation.compose.OooOo00) navigatorOooO0O2;
        }
        if (oooOo00 == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new Oooo0(o00000o, graph, modifier2, alignment2, function13, function12, function11, function10, i, i2));
            return;
        }
        androidx.navigation.compose.OooOO0.OooO00o(oooOo00, composer2, i5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooOO0O(o00000o, graph, modifier2, alignment2, function13, function12, function11, function10, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull o00000O o00000o, @NotNull String str, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable String str2, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function2, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function3, @Nullable Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function4, @NotNull Function1<? super o00000O0, Unit> function5, @Nullable Composer composer, int i, int i2) {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function6;
        int i3;
        int i4;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function7;
        String str3;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(410432995);
        Modifier modifier2 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        String str4 = (i2 & 16) != 0 ? null : str2;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function8 = (i2 & 32) != 0 ? OooOOO0.f6957OooO0Oo : function1;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function9 = (i2 & 64) != 0 ? OooOOO.f6956OooO0Oo : function2;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            function6 = function8;
        } else {
            function6 = function3;
            i3 = i;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            i4 = i3 & (-234881025);
            function7 = function9;
        } else {
            i4 = i3;
            function7 = function4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410432995, i4, -1, "androidx.navigation.compose.NavHost (NavHost.kt:127)");
        }
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged = composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(function5);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            o00000O0 o00000o1 = new o00000O0(o00000o.f6867OooOo0o, str, str4);
            function5.invoke(o00000o1);
            NavDestination navDestinationOooO00o = o00000o1.f34366OooO00o.OooO00o();
            navDestinationOooO00o.f6817OooO0o = null;
            for (Iterator it = o00000o1.f34369OooO0Oo.entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry entry = (Map.Entry) it.next();
                String argumentName = (String) entry.getKey();
                o000O00.OooO argument = (o000O00.OooO) entry.getValue();
                Intrinsics.checkNotNullParameter(argumentName, "argumentName");
                Intrinsics.checkNotNullParameter(argument, "argument");
                navDestinationOooO00o.f6815OooO.put(argumentName, argument);
            }
            Iterator it2 = o00000o1.f34371OooO0o0.iterator();
            while (it2.hasNext()) {
                navDestinationOooO00o.OooO00o((o000O00.o00O0O) it2.next());
            }
            Iterator it3 = o00000o1.f34370OooO0o.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    String str5 = o00000o1.f34368OooO0OO;
                    if (str5 != null) {
                        navDestinationOooO00o.OooO0o(str5);
                    }
                    int i5 = o00000o1.f34367OooO0O0;
                    if (i5 != -1) {
                        navDestinationOooO00o.f6821OooOO0 = i5;
                    }
                    androidx.navigation.OooO oooO = (androidx.navigation.OooO) navDestinationOooO00o;
                    ArrayList nodes = o00000o1.f34372OooO;
                    Intrinsics.checkNotNullParameter(nodes, "nodes");
                    Iterator it4 = nodes.iterator();
                    while (it4.hasNext()) {
                        NavDestination node = (NavDestination) it4.next();
                        if (node != null) {
                            Iterator it5 = it4;
                            Intrinsics.checkNotNullParameter(node, "node");
                            int i6 = node.f6821OooOO0;
                            String str6 = node.f6822OooOO0O;
                            if (!((i6 == 0 && str6 == null) ? false : true)) {
                                throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
                            }
                            String str7 = oooO.f6822OooOO0O;
                            String str8 = str4;
                            if (str7 != null && !(!Intrinsics.areEqual(str6, str7))) {
                                throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + oooO).toString());
                            }
                            if (!(i6 != oooO.f6821OooOO0)) {
                                throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + oooO).toString());
                            }
                            p188o00o0O.Oooo0<NavDestination> oooo0 = oooO.f6836OooOOO0;
                            NavDestination navDestination = (NavDestination) oooo0.OooO0o(i6, null);
                            if (navDestination != node) {
                                if (!(node.f6818OooO0o0 == null)) {
                                    throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                                }
                                if (navDestination != null) {
                                    navDestination.f6818OooO0o0 = null;
                                }
                                node.f6818OooO0o0 = oooO;
                                oooo0.OooO0oo(node.f6821OooOO0, node);
                            }
                            it4 = it5;
                            str4 = str8;
                        }
                    }
                    str3 = str4;
                    String startDestRoute = o00000o1.f34374OooO0oo;
                    if (startDestRoute == null) {
                        if (str5 == null) {
                            throw new IllegalStateException("You must set a start destination id");
                        }
                        throw new IllegalStateException("You must set a start destination route");
                    }
                    Intrinsics.checkNotNull(startDestRoute);
                    Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
                    if (!(!Intrinsics.areEqual(startDestRoute, oooO.f6822OooOO0O))) {
                        throw new IllegalArgumentException(("Start destination " + startDestRoute + " cannot use the same route as the graph " + oooO).toString());
                    }
                    if (!(!StringsKt.isBlank(startDestRoute))) {
                        throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
                    }
                    oooO.f6835OooOOO = "android-app://androidx.navigation/".concat(startDestRoute).hashCode();
                    oooO.f6838OooOOOo = startDestRoute;
                    composerStartRestartGroup.updateRememberedValue(oooO);
                    obj = oooO;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it3.next();
                int iIntValue = ((Number) entry2.getKey()).intValue();
                o000O00.OooO0o action = (o000O00.OooO0o) entry2.getValue();
                Iterator it6 = it3;
                Intrinsics.checkNotNullParameter(action, "action");
                if (!(!(navDestinationOooO00o instanceof androidx.navigation.OooO00o.C0143OooO00o))) {
                    throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + navDestinationOooO00o + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                }
                if (!(iIntValue != 0)) {
                    throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                }
                navDestinationOooO00o.f6820OooO0oo.OooO0oo(iIntValue, action);
                it3 = it6;
            }
        } else {
            str3 = str4;
            obj = objRememberedValue;
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i7 = i4 >> 3;
        OooO00o(o00000o, (androidx.navigation.OooO) obj, modifier2, center, function8, function9, function6, function7, composerStartRestartGroup, (i4 & 896) | 72 | (i4 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(o00000o, str, modifier2, center, str3, function8, function9, function6, function7, function5, i, i2));
    }
}
