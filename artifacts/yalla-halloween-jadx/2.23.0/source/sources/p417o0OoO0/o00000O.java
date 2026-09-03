package p417o0OoO0;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.core.Observable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveEventBusObservableExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveEventBusObservableExt.kt\ncom/yalla/yalla/ext/LiveEventBusObservableExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,29:1\n76#2:30\n76#2:31\n*S KotlinDebug\n*F\n+ 1 LiveEventBusObservableExt.kt\ncom/yalla/yalla/ext/LiveEventBusObservableExtKt\n*L\n11#1:30\n22#1:31\n*E\n"})
public final class o00000O {

    @DebugMetadata(c = "com.yalla.yalla.ext.LiveEventBusObservableExtKt$effectObserve$1", f = "LiveEventBusObservableExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f45478OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f45479OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f45480OooO0o0;

        /* JADX INFO: renamed from: o0OoO0.o00000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0469OooO00o implements Observer<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Observer<T> f45481OooO0Oo;

            public C0469OooO00o(Observer<T> observer) {
                this.f45481OooO0Oo = observer;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserve");
                this.f45481OooO0Oo.onChanged((T) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Observable<Object> observable, LifecycleOwner lifecycleOwner, Observer<T> observer, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45478OooO0Oo = observable;
            this.f45480OooO0o0 = lifecycleOwner;
            this.f45479OooO0o = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45478OooO0Oo, this.f45480OooO0o0, this.f45479OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f45478OooO0Oo.observe(this.f45480OooO0o0, new C0469OooO00o(this.f45479OooO0o));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f45482OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f45483OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f45484OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Observable<Object> observable, Observer<T> observer, int i) {
            super(2);
            this.f45482OooO0Oo = observable;
            this.f45484OooO0o0 = observer;
            this.f45483OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f45483OooO0o | 1);
            o00000O.OooO00o(this.f45482OooO0Oo, this.f45484OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ext.LiveEventBusObservableExtKt$effectObserveSticky$1", f = "LiveEventBusObservableExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f45485OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f45486OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f45487OooO0o0;

        public static final class OooO00o implements Observer<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Observer<T> f45488OooO0Oo;

            public OooO00o(Observer<T> observer) {
                this.f45488OooO0Oo = observer;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of com.yalla.yalla.ext.LiveEventBusObservableExtKt.effectObserveSticky");
                this.f45488OooO0Oo.onChanged((T) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Observable<Object> observable, LifecycleOwner lifecycleOwner, Observer<T> observer, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f45485OooO0Oo = observable;
            this.f45487OooO0o0 = lifecycleOwner;
            this.f45486OooO0o = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f45485OooO0Oo, this.f45487OooO0o0, this.f45486OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f45485OooO0Oo.observeSticky(this.f45487OooO0o0, new OooO00o(this.f45486OooO0o));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f45489OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f45490OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f45491OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Observable<Object> observable, Observer<T> observer, int i) {
            super(2);
            this.f45489OooO0Oo = observable;
            this.f45491OooO0o0 = observer;
            this.f45490OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f45490OooO0o | 1);
            o00000O.OooO0O0(this.f45489OooO0Oo, this.f45491OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final <T> void OooO00o(@NotNull Observable<Object> observable, @NotNull Observer<T> observer, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Composer composerStartRestartGroup = composer.startRestartGroup(1377760164);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1377760164, i, -1, "com.yalla.yalla.ext.effectObserve (LiveEventBusObservableExt.kt:9)");
        }
        EffectsKt.LaunchedEffect((Object) null, new OooO00o(observable, (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), observer, null), composerStartRestartGroup, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(observable, observer, i));
    }

    @Composable
    public static final <T> void OooO0O0(@NotNull Observable<Object> observable, @NotNull Observer<T> observer, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1352020435);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1352020435, i, -1, "com.yalla.yalla.ext.effectObserveSticky (LiveEventBusObservableExt.kt:20)");
        }
        EffectsKt.LaunchedEffect((Object) null, new OooO0OO(observable, (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), observer, null), composerStartRestartGroup, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(observable, observer, i));
    }
}
