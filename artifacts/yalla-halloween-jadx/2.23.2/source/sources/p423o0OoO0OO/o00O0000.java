package p423o0OoO0OO;

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
public final class o00O0000 {

    @DebugMetadata(c = "com.yalla.yalla.ext.LiveEventBusObservableExtKt$effectObserve$1", f = "LiveEventBusObservableExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f46685OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f46686OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f46687OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Observable<Object> observable, LifecycleOwner lifecycleOwner, Observer<T> observer, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46685OooO0Oo = observable;
            this.f46687OooO0o0 = lifecycleOwner;
            this.f46686OooO0o = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46685OooO0Oo, this.f46687OooO0o0, this.f46686OooO0o, continuation);
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
            this.f46685OooO0Oo.observe(this.f46687OooO0o0, new o00(this.f46686OooO0o, 0));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f46688OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46689OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f46690OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Observable<Object> observable, Observer<T> observer, int i) {
            super(2);
            this.f46688OooO0Oo = observable;
            this.f46690OooO0o0 = observer;
            this.f46689OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46689OooO0o | 1);
            o00O0000.OooO00o(this.f46688OooO0Oo, this.f46690OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ext.LiveEventBusObservableExtKt$effectObserveSticky$1", f = "LiveEventBusObservableExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f46691OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f46692OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f46693OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Observable<Object> observable, LifecycleOwner lifecycleOwner, Observer<T> observer, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f46691OooO0Oo = observable;
            this.f46693OooO0o0 = lifecycleOwner;
            this.f46692OooO0o = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f46691OooO0Oo, this.f46693OooO0o0, this.f46692OooO0o, continuation);
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
            this.f46691OooO0Oo.observeSticky(this.f46693OooO0o0, new o0O0ooO(this.f46692OooO0o, 0));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Observable<Object> f46694OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f46695OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Observer<T> f46696OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Observable<Object> observable, Observer<T> observer, int i) {
            super(2);
            this.f46694OooO0Oo = observable;
            this.f46696OooO0o0 = observer;
            this.f46695OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f46695OooO0o | 1);
            o00O0000.OooO0O0(this.f46694OooO0Oo, this.f46696OooO0o0, composer, iUpdateChangedFlags);
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
