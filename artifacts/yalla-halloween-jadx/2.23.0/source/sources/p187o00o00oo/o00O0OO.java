package p187o00o00oo;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.qiniu.android.storage.Configuration;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,551:1\n25#2:552\n25#2:559\n25#2:566\n36#2:573\n50#2:580\n49#2:581\n50#2:588\n49#2:589\n25#2:600\n36#2:611\n25#2:618\n25#2:625\n1114#3,6:553\n1114#3,6:560\n1114#3,6:567\n1114#3,6:574\n1114#3,6:582\n1114#3,6:590\n1114#3,3:601\n1117#3,3:607\n1114#3,6:612\n1114#3,6:619\n1114#3,6:626\n474#4,4:596\n478#4,2:604\n482#4:610\n474#5:606\n76#6:632\n102#6,2:633\n76#6:635\n*S KotlinDebug\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewKt\n*L\n81#1:552\n82#1:559\n85#1:566\n87#1:573\n91#1:580\n91#1:581\n95#1:588\n95#1:589\n485#1:600\n486#1:611\n517#1:618\n544#1:625\n81#1:553,6\n82#1:560,6\n85#1:567,6\n87#1:574,6\n91#1:582,6\n95#1:590,6\n485#1:601,3\n485#1:607,3\n486#1:612,6\n517#1:619,6\n544#1:626,6\n485#1:596,4\n485#1:604,2\n485#1:610\n485#1:606\n85#1:632\n85#1:633,2\n117#1:635\n*E\n"})
public final class o00O0OO {

    @DebugMetadata(c = "com.google.accompanist.web.WebViewKt$WebView$6$1", f = "WebView.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewKt$WebView$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38713OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<WebView> f38714OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00O f38715OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00O o00o2, MutableState<WebView> mutableState, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f38715OooO0o0 = o00o2;
            this.f38714OooO0o = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f38715OooO0o0, this.f38714OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38713OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebView value = this.f38714OooO0o.getValue();
                if (value == null) {
                    return Unit.INSTANCE;
                }
                this.f38713OooO0Oo = 1;
                if (this.f38715OooO0o0.OooO00o(value, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f38716OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f38717OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f38718OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f38719OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o00O f38720OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f38721OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o00O0O0 f38722OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f38723OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Context, WebView> f38724OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f38725OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f38726OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o00OO0O0 o00oo0o1, Modifier modifier, boolean z, o00O o00o2, Function1<? super WebView, Unit> function1, Function1<? super WebView, Unit> function2, o00O0O0 o00o0o0, o00O0O00 o00o0o01, Function1<? super Context, ? extends WebView> function3, int i, int i2) {
            super(2);
            this.f38717OooO0Oo = o00oo0o1;
            this.f38719OooO0o0 = modifier;
            this.f38718OooO0o = z;
            this.f38720OooO0oO = o00o2;
            this.f38721OooO0oo = function1;
            this.f38716OooO = function2;
            this.f38722OooOO0 = o00o0o0;
            this.f38723OooOO0O = o00o0o01;
            this.f38724OooOO0o = function3;
            this.f38726OooOOO0 = i;
            this.f38725OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O0OO.OooO00o(this.f38717OooO0Oo, this.f38719OooO0o0, this.f38718OooO0o, this.f38720OooO0oO, this.f38721OooO0oo, this.f38716OooO, this.f38722OooOO0, this.f38723OooOO0O, this.f38724OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38726OooOOO0 | 1), this.f38725OooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<WebView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f38727OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(WebView webView) {
            WebView it = webView;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<WebView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f38728OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(WebView webView) {
            WebView it = webView;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<WebView> f38729OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<WebView> mutableState) {
            super(0);
            this.f38729OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WebView value = this.f38729OooO0Oo.getValue();
            if (value != null) {
                value.goBack();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.google.accompanist.web.WebViewKt$WebView$7$1", f = "WebView.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38730OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f38731OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<WebView> f38732OooO0o0;

        public static final class OooO00o extends Lambda implements Function0<o00O0OO0> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o00OO0O0 f38733OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00OO0O0 o00oo0o1) {
                super(0);
                this.f38733OooO0Oo = o00oo0o1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final o00O0OO0 invoke() {
                return (o00O0OO0) this.f38733OooO0Oo.f38751OooO0O0.getValue();
            }
        }

        public static final class OooO0O0 implements FlowCollector<o00O0OO0> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MutableState<WebView> f38734OooO0Oo;

            public OooO0O0(MutableState<WebView> mutableState) {
                this.f38734OooO0Oo = mutableState;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(o00O0OO0 o00o0oo1, Continuation continuation) {
                WebView value;
                o00O0OO0 o00o0oo2 = o00o0oo1;
                boolean z = o00o0oo2 instanceof o00O0OO0.OooO0O0;
                MutableState<WebView> mutableState = this.f38734OooO0Oo;
                if (z) {
                    WebView value2 = mutableState.getValue();
                    if (value2 != null) {
                        o00O0OO0.OooO0O0 oooO0O0 = (o00O0OO0.OooO0O0) o00o0oo2;
                        value2.loadUrl(oooO0O0.f38742OooO00o, oooO0O0.f38743OooO0O0);
                    }
                } else if ((o00o0oo2 instanceof o00O0OO0.OooO00o) && (value = mutableState.getValue()) != null) {
                    ((o00O0OO0.OooO00o) o00o0oo2).getClass();
                    value.loadDataWithBaseURL(null, null, null, null, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MutableState<WebView> mutableState, o00OO0O0 o00oo0o1, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f38732OooO0o0 = mutableState;
            this.f38731OooO0o = o00oo0o1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f38732OooO0o0, this.f38731OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38730OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableState<WebView> mutableState = this.f38732OooO0o0;
                if (mutableState.getValue() == null) {
                    return Unit.INSTANCE;
                }
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new OooO00o(this.f38731OooO0o));
                OooO0O0 oooO0O0 = new OooO0O0(mutableState);
                this.f38730OooO0Oo = 1;
                if (flowSnapshotFlow.collect(oooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewKt$WebView$8$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,551:1\n62#2,5:552\n*S KotlinDebug\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewKt$WebView$8$1\n*L\n121#1:552,5\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebView f38735OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<WebView, Unit>> f38736OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(WebView webView, State<? extends Function1<? super WebView, Unit>> state) {
            super(1);
            this.f38735OooO0Oo = webView;
            this.f38736OooO0o0 = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o00O0OOO(this.f38735OooO0Oo, this.f38736OooO0o0);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Context, WebView> f38737OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f38738OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f38739OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O0 f38740OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<WebView> f38741OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO0(Function1<? super Context, ? extends WebView> function1, Function1<? super WebView, Unit> function2, o00O0O00 o00o0o01, o00O0O0 o00o0o0, MutableState<WebView> mutableState) {
            super(3);
            this.f38737OooO0Oo = function1;
            this.f38739OooO0o0 = function2;
            this.f38738OooO0o = o00o0o01;
            this.f38740OooO0oO = o00o0o0;
            this.f38741OooO0oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1606035789, iIntValue, -1, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:131)");
                }
                AndroidView_androidKt.AndroidView(new oo0oOO0(this.f38737OooO0Oo, Constraints.m3731getHasFixedWidthimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk()) ? -1 : -2, Constraints.m3730getHasFixedHeightimpl(BoxWithConstraints.mo414getConstraintsmsEJaDk()) ? -1 : -2, this.f38739OooO0o0, this.f38738OooO0o, this.f38740OooO0oO, this.f38741OooO0oo), null, null, composer2, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bb A[PHI: r3 r4 r5 r6 r7 r9 r12 r13
      0x01bb: PHI (r3v34 int) = (r3v24 int), (r3v37 int) binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r4v10 o00o00oo.o00O0O00) = (r4v2 o00o00oo.o00O0O00), (r4v11 o00o00oo.o00O0O00) binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r5v5 androidx.compose.ui.Modifier) = (r5v2 androidx.compose.ui.Modifier), (r5v6 androidx.compose.ui.Modifier) binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r6v25 boolean) = (r6v6 boolean), (r6v27 boolean) binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r7v11 o00o00oo.o00O) = (r7v7 o00o00oo.o00O), (r7v12 o00o00oo.o00O) binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r9v11 kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit>) = 
      (r9v8 kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit>)
      (r9v12 kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit>)
     binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r12v5 kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit>) = 
      (r12v2 kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit>)
      (r12v6 kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit>)
     binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r13v12 o00o00oo.o00O0O0) = (r13v5 o00o00oo.o00O0O0), (r13v13 o00o00oo.o00O0O0) binds: [B:133:0x01b7, B:104:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207  */
    /* JADX WARN: Code duplicated, block: B:151:0x021a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0220  */
    /* JADX WARN: Code duplicated, block: B:156:0x024d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0253  */
    /* JADX WARN: Code duplicated, block: B:161:0x028a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0290  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:170:0x0319  */
    /* JADX WARN: Code duplicated, block: B:175:0x032a  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00OO0O0 state, @Nullable Modifier modifier, boolean z, @Nullable o00O o00o2, @Nullable Function1<? super WebView, Unit> function1, @Nullable Function1<? super WebView, Unit> function2, @Nullable o00O0O0 o00o0o0, @Nullable o00O0O00 o00o0o01, @Nullable Function1<? super Context, ? extends WebView> function3, @Nullable Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        o00O o00o3;
        int i6;
        Function1<? super WebView, Unit> function4;
        int i7;
        int i8;
        Function1<? super WebView, Unit> function5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        boolean z2;
        o00O o00oOooO0O0;
        Function1<? super WebView, Unit> function6;
        Function1<? super WebView, Unit> function7;
        o00O0O0 o00o0o1;
        o00O0O00 o00o0o02;
        Function1<? super Context, ? extends WebView> function8;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer.Companion companion;
        MutableState mutableState;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue4;
        boolean zChanged2;
        Object objRememberedValue5;
        boolean zChanged3;
        Object objRememberedValue6;
        State stateRememberUpdatedState;
        WebView webView;
        boolean z4;
        Function1<? super Context, ? extends WebView> function9;
        o00O0O00 o00o0o03;
        o00O o00o4;
        Function1<? super WebView, Unit> function10;
        o00O0O0 o00o0o2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1473276617);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 7168) == 0) {
                    if ((i2 & 8) == 0) {
                        o00o3 = o00o2;
                        if (composerStartRestartGroup.changed(o00o3)) {
                            i14 = 2048;
                        }
                        i3 |= i14;
                    } else {
                        o00o3 = o00o2;
                    }
                    i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    i3 |= i14;
                } else {
                    o00o3 = o00o2;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        function4 = function1;
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((458752 & i) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 524288;
                        }
                        i11 = i2 & 128;
                        if (i11 != 0) {
                            i3 |= Configuration.BLOCK_SIZE;
                        }
                        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        if (i12 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i3 |= i13;
                        }
                        if ((i2 & 192) != 192 && (191739611 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z4 = z;
                            o00o0o2 = o00o0o0;
                            o00o0o03 = o00o0o01;
                            function9 = function3;
                            o00o4 = o00o3;
                            function6 = function4;
                            function10 = function5;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i15 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if ((i2 & 8) != 0) {
                                    o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                    i3 &= -7169;
                                } else {
                                    o00oOooO0O0 = o00o3;
                                }
                                if (i6 != 0) {
                                    function6 = OooO0O0.f38727OooO0Oo;
                                } else {
                                    function6 = function4;
                                }
                                if (i8 != 0) {
                                    function7 = OooO0OO.f38728OooO0Oo;
                                } else {
                                    function7 = function5;
                                }
                                if (i10 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new o00O0O0();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    o00o0o1 = (o00O0O0) objRememberedValue2;
                                    i3 &= -3670017;
                                } else {
                                    o00o0o1 = o00o0o0;
                                }
                                if (i11 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new o00O0O00();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    o00o0o02 = (o00O0O00) objRememberedValue;
                                    i3 &= -29360129;
                                } else {
                                    o00o0o02 = o00o0o01;
                                }
                                if (i12 != 0) {
                                    function8 = null;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                                    objRememberedValue3 = mutableStateMutableStateOf$default;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) objRememberedValue3;
                                if (z2 || !((Boolean) o00oOooO0O0.f38696OooO0OO.getValue()).booleanValue()) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(mutableState);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new OooO0o(mutableState);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                                WebView webView2 = (WebView) mutableState.getValue();
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(webView2, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                                WebView webView3 = (WebView) mutableState.getValue();
                                int i16 = (i3 << 3) & 112;
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(webView3, state, (Function2) objRememberedValue6, composerStartRestartGroup, i16 | 520);
                                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                                webView = (WebView) mutableState.getValue();
                                composerStartRestartGroup.startReplaceableGroup(1370703280);
                                if (webView != null) {
                                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1.getClass();
                                Intrinsics.checkNotNullParameter(state, "<set-?>");
                                o00o0o1.f38707OooO00o = state;
                                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                                o00o0o02.getClass();
                                Intrinsics.checkNotNullParameter(state, "<set-?>");
                                o00o0o02.f38709OooO00o = state;
                                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z2;
                                function9 = function8;
                                o00o0o03 = o00o0o02;
                                o00o4 = o00oOooO0O0;
                                function10 = function7;
                                o00o0o2 = o00o0o1;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if (i10 != 0) {
                                    i3 &= -3670017;
                                }
                                if (i11 != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                z2 = z;
                                o00o0o02 = o00o0o01;
                                o00oOooO0O0 = o00o3;
                                function6 = function4;
                                function7 = function5;
                                o00o0o1 = o00o0o0;
                            }
                            function8 = function3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue3 == companion.getEmpty()) {
                                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                                objRememberedValue3 = mutableStateMutableStateOf$default2;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue3;
                            if (z2) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue4 = new OooO0o(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0o(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                            WebView webView4 = (WebView) mutableState.getValue();
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            } else {
                                objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(webView4, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                            WebView webView5 = (WebView) mutableState.getValue();
                            int i17 = (i3 << 3) & 112;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue6 = new OooOO0(mutableState, state, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            } else {
                                objRememberedValue6 = new OooOO0(mutableState, state, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(webView5, state, (Function2) objRememberedValue6, composerStartRestartGroup, i17 | 520);
                            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                            webView = (WebView) mutableState.getValue();
                            composerStartRestartGroup.startReplaceableGroup(1370703280);
                            if (webView != null) {
                                EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1.getClass();
                            Intrinsics.checkNotNullParameter(state, "<set-?>");
                            o00o0o1.f38707OooO00o = state;
                            Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                            o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                            o00o0o02.getClass();
                            Intrinsics.checkNotNullParameter(state, "<set-?>");
                            o00o0o02.f38709OooO00o = state;
                            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z2;
                            function9 = function8;
                            o00o0o03 = o00o0o02;
                            o00o4 = o00oOooO0O0;
                            function10 = function7;
                            o00o0o2 = o00o0o1;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
                    }
                    i3 |= 196608;
                    function5 = function2;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 524288;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        i3 |= Configuration.BLOCK_SIZE;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i2 & 192) != 192) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                            objRememberedValue3 = mutableStateMutableStateOf$default3;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView6 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView6, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView7 = (WebView) mutableState.getValue();
                        int i18 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView7, state, (Function2) objRememberedValue6, composerStartRestartGroup, i18 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                            objRememberedValue3 = mutableStateMutableStateOf$default4;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView8 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView8, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView9 = (WebView) mutableState.getValue();
                        int i19 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView9, state, (Function2) objRememberedValue6, composerStartRestartGroup, i19 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
                }
                i3 |= 24576;
                function4 = function1;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 524288;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        i3 |= Configuration.BLOCK_SIZE;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i2 & 192) != 192) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                            objRememberedValue3 = mutableStateMutableStateOf$default5;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView10 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView10, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView11 = (WebView) mutableState.getValue();
                        int i110 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView11, state, (Function2) objRememberedValue6, composerStartRestartGroup, i110 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit5 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                            objRememberedValue3 = mutableStateMutableStateOf$default6;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView12 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView12, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView13 = (WebView) mutableState.getValue();
                        int i111 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView13, state, (Function2) objRememberedValue6, composerStartRestartGroup, i111 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit6 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
                }
                i3 |= 196608;
                function5 = function2;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 524288;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= Configuration.BLOCK_SIZE;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i2 & 192) != 192) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                        objRememberedValue3 = mutableStateMutableStateOf$default7;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView14 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView14, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView15 = (WebView) mutableState.getValue();
                    int i112 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView15, state, (Function2) objRememberedValue6, composerStartRestartGroup, i112 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit7 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default8);
                        objRememberedValue3 = mutableStateMutableStateOf$default8;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView16 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView16, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView17 = (WebView) mutableState.getValue();
                    int i113 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView17, state, (Function2) objRememberedValue6, composerStartRestartGroup, i113 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit8 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
            }
            i3 |= 384;
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    o00o3 = o00o2;
                    if (composerStartRestartGroup.changed(o00o3)) {
                        i14 = 2048;
                    }
                    i3 |= i14;
                } else {
                    o00o3 = o00o2;
                }
                i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i14;
            } else {
                o00o3 = o00o2;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 524288;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        i3 |= Configuration.BLOCK_SIZE;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i2 & 192) != 192) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default9);
                            objRememberedValue3 = mutableStateMutableStateOf$default9;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView18 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView18, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView19 = (WebView) mutableState.getValue();
                        int i114 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView19, state, (Function2) objRememberedValue6, composerStartRestartGroup, i114 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit9 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default10);
                            objRememberedValue3 = mutableStateMutableStateOf$default10;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView110 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView110, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView111 = (WebView) mutableState.getValue();
                        int i115 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView111, state, (Function2) objRememberedValue6, composerStartRestartGroup, i115 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit10 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
                }
                i3 |= 196608;
                function5 = function2;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 524288;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= Configuration.BLOCK_SIZE;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i2 & 192) != 192) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default11);
                        objRememberedValue3 = mutableStateMutableStateOf$default11;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView112 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView112, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView113 = (WebView) mutableState.getValue();
                    int i116 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView113, state, (Function2) objRememberedValue6, composerStartRestartGroup, i116 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit11 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default12);
                        objRememberedValue3 = mutableStateMutableStateOf$default12;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView114 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView114, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView115 = (WebView) mutableState.getValue();
                    int i117 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView115, state, (Function2) objRememberedValue6, composerStartRestartGroup, i117 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit12 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
            }
            i3 |= 24576;
            function4 = function1;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 524288;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= Configuration.BLOCK_SIZE;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i2 & 192) != 192) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default13);
                        objRememberedValue3 = mutableStateMutableStateOf$default13;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView116 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView116, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView117 = (WebView) mutableState.getValue();
                    int i118 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView117, state, (Function2) objRememberedValue6, composerStartRestartGroup, i118 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit13 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default14);
                        objRememberedValue3 = mutableStateMutableStateOf$default14;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView118 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView118, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView119 = (WebView) mutableState.getValue();
                    int i119 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView119, state, (Function2) objRememberedValue6, composerStartRestartGroup, i119 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit14 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
            }
            i3 |= 196608;
            function5 = function2;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 524288;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= Configuration.BLOCK_SIZE;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i2 & 192) != 192) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default15);
                    objRememberedValue3 = mutableStateMutableStateOf$default15;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView1110 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView1110, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView1111 = (WebView) mutableState.getValue();
                int i1110 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView1111, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1110 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit15 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default16);
                    objRememberedValue3 = mutableStateMutableStateOf$default16;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView1112 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView1112, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView1113 = (WebView) mutableState.getValue();
                int i1111 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView1113, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1111 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit16 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    o00o3 = o00o2;
                    if (composerStartRestartGroup.changed(o00o3)) {
                        i14 = 2048;
                    }
                    i3 |= i14;
                } else {
                    o00o3 = o00o2;
                }
                i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i14;
            } else {
                o00o3 = o00o2;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((458752 & i) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 524288;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        i3 |= Configuration.BLOCK_SIZE;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((i2 & 192) != 192) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default17);
                            objRememberedValue3 = mutableStateMutableStateOf$default17;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView1114 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView1114, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView1115 = (WebView) mutableState.getValue();
                        int i1112 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView1115, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1112 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit17 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        } else {
                            if (i15 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 8) != 0) {
                                o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                                i3 &= -7169;
                            } else {
                                o00oOooO0O0 = o00o3;
                            }
                            if (i6 != 0) {
                                function6 = OooO0O0.f38727OooO0Oo;
                            } else {
                                function6 = function4;
                            }
                            if (i8 != 0) {
                                function7 = OooO0OO.f38728OooO0Oo;
                            } else {
                                function7 = function5;
                            }
                            if (i10 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new o00O0O0();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o1 = (o00O0O0) objRememberedValue2;
                                i3 &= -3670017;
                            } else {
                                o00o0o1 = o00o0o0;
                            }
                            if (i11 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new o00O0O00();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                o00o0o02 = (o00O0O00) objRememberedValue;
                                i3 &= -29360129;
                            } else {
                                o00o0o02 = o00o0o01;
                            }
                            if (i12 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue3 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default18);
                            objRememberedValue3 = mutableStateMutableStateOf$default18;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        if (z2) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0o(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                        WebView webView1116 = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView1116, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                        WebView webView1117 = (WebView) mutableState.getValue();
                        int i1113 = (i3 << 3) & 112;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new OooOO0(mutableState, state, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(webView1117, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1113 | 520);
                        stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                        webView = (WebView) mutableState.getValue();
                        composerStartRestartGroup.startReplaceableGroup(1370703280);
                        if (webView != null) {
                            EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                            Unit unit18 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o1.f38707OooO00o = state;
                        Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                        o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                        o00o0o02.getClass();
                        Intrinsics.checkNotNullParameter(state, "<set-?>");
                        o00o0o02.f38709OooO00o = state;
                        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z2;
                        function9 = function8;
                        o00o0o03 = o00o0o02;
                        o00o4 = o00oOooO0O0;
                        function10 = function7;
                        o00o0o2 = o00o0o1;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
                }
                i3 |= 196608;
                function5 = function2;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 524288;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= Configuration.BLOCK_SIZE;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i2 & 192) != 192) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default19);
                        objRememberedValue3 = mutableStateMutableStateOf$default19;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView1118 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView1118, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView1119 = (WebView) mutableState.getValue();
                    int i1114 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView1119, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1114 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit19 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default110 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default110);
                        objRememberedValue3 = mutableStateMutableStateOf$default110;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView11110 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView11110, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView11111 = (WebView) mutableState.getValue();
                    int i1115 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView11111, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1115 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit110 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
            }
            i3 |= 24576;
            function4 = function1;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 524288;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= Configuration.BLOCK_SIZE;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i2 & 192) != 192) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default111 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default111);
                        objRememberedValue3 = mutableStateMutableStateOf$default111;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView11112 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView11112, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView11113 = (WebView) mutableState.getValue();
                    int i1116 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView11113, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1116 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit111 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default112 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default112);
                        objRememberedValue3 = mutableStateMutableStateOf$default112;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView11114 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView11114, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView11115 = (WebView) mutableState.getValue();
                    int i1117 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView11115, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1117 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit112 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
            }
            i3 |= 196608;
            function5 = function2;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 524288;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= Configuration.BLOCK_SIZE;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i2 & 192) != 192) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default113 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default113);
                    objRememberedValue3 = mutableStateMutableStateOf$default113;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView11116 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView11116, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView11117 = (WebView) mutableState.getValue();
                int i1118 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView11117, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1118 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit113 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default114 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default114);
                    objRememberedValue3 = mutableStateMutableStateOf$default114;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView11118 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView11118, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView11119 = (WebView) mutableState.getValue();
                int i1119 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView11119, state, (Function2) objRememberedValue6, composerStartRestartGroup, i1119 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit114 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
        }
        i3 |= 384;
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                o00o3 = o00o2;
                if (composerStartRestartGroup.changed(o00o3)) {
                    i14 = 2048;
                }
                i3 |= i14;
            } else {
                o00o3 = o00o2;
            }
            i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i14;
        } else {
            o00o3 = o00o2;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((458752 & i) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 524288;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i3 |= Configuration.BLOCK_SIZE;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((i2 & 192) != 192) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default115 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default115);
                        objRememberedValue3 = mutableStateMutableStateOf$default115;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView111110 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView111110, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView111111 = (WebView) mutableState.getValue();
                    int i11110 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView111111, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11110 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit115 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    } else {
                        if (i15 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                            i3 &= -7169;
                        } else {
                            o00oOooO0O0 = o00o3;
                        }
                        if (i6 != 0) {
                            function6 = OooO0O0.f38727OooO0Oo;
                        } else {
                            function6 = function4;
                        }
                        if (i8 != 0) {
                            function7 = OooO0OO.f38728OooO0Oo;
                        } else {
                            function7 = function5;
                        }
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new o00O0O0();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o1 = (o00O0O0) objRememberedValue2;
                            i3 &= -3670017;
                        } else {
                            o00o0o1 = o00o0o0;
                        }
                        if (i11 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new o00O0O00();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            o00o0o02 = (o00O0O00) objRememberedValue;
                            i3 &= -29360129;
                        } else {
                            o00o0o02 = o00o0o01;
                        }
                        if (i12 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue3 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default116 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default116);
                        objRememberedValue3 = mutableStateMutableStateOf$default116;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    if (z2) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0o(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                    WebView webView111112 = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView111112, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                    WebView webView111113 = (WebView) mutableState.getValue();
                    int i11111 = (i3 << 3) & 112;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new OooOO0(mutableState, state, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(webView111113, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11111 | 520);
                    stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                    webView = (WebView) mutableState.getValue();
                    composerStartRestartGroup.startReplaceableGroup(1370703280);
                    if (webView != null) {
                        EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                        Unit unit116 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o1.f38707OooO00o = state;
                    Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                    o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                    o00o0o02.getClass();
                    Intrinsics.checkNotNullParameter(state, "<set-?>");
                    o00o0o02.f38709OooO00o = state;
                    BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z2;
                    function9 = function8;
                    o00o0o03 = o00o0o02;
                    o00o4 = o00oOooO0O0;
                    function10 = function7;
                    o00o0o2 = o00o0o1;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
            }
            i3 |= 196608;
            function5 = function2;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 524288;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= Configuration.BLOCK_SIZE;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i2 & 192) != 192) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default117 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default117);
                    objRememberedValue3 = mutableStateMutableStateOf$default117;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView111114 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView111114, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView111115 = (WebView) mutableState.getValue();
                int i11112 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView111115, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11112 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit117 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default118 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default118);
                    objRememberedValue3 = mutableStateMutableStateOf$default118;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView111116 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView111116, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView111117 = (WebView) mutableState.getValue();
                int i11113 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView111117, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11113 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit118 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
        }
        i3 |= 24576;
        function4 = function1;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((458752 & i) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 524288;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i3 |= Configuration.BLOCK_SIZE;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((i2 & 192) != 192) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default119 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default119);
                    objRememberedValue3 = mutableStateMutableStateOf$default119;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView111118 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView111118, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView111119 = (WebView) mutableState.getValue();
                int i11114 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView111119, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11114 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit119 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                } else {
                    if (i15 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                        i3 &= -7169;
                    } else {
                        o00oOooO0O0 = o00o3;
                    }
                    if (i6 != 0) {
                        function6 = OooO0O0.f38727OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i8 != 0) {
                        function7 = OooO0OO.f38728OooO0Oo;
                    } else {
                        function7 = function5;
                    }
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new o00O0O0();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o1 = (o00O0O0) objRememberedValue2;
                        i3 &= -3670017;
                    } else {
                        o00o0o1 = o00o0o0;
                    }
                    if (i11 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new o00O0O00();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        o00o0o02 = (o00O0O00) objRememberedValue;
                        i3 &= -29360129;
                    } else {
                        o00o0o02 = o00o0o01;
                    }
                    if (i12 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue3 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default1110 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default1110);
                    objRememberedValue3 = mutableStateMutableStateOf$default1110;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                if (z2) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0o(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
                WebView webView1111110 = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView1111110, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
                WebView webView1111111 = (WebView) mutableState.getValue();
                int i11115 = (i3 << 3) & 112;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new OooOO0(mutableState, state, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(webView1111111, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11115 | 520);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
                webView = (WebView) mutableState.getValue();
                composerStartRestartGroup.startReplaceableGroup(1370703280);
                if (webView != null) {
                    EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                    Unit unit1110 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                o00o0o1.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o1.f38707OooO00o = state;
                Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
                o00o0o1.f38708OooO0O0 = o00oOooO0O0;
                o00o0o02.getClass();
                Intrinsics.checkNotNullParameter(state, "<set-?>");
                o00o0o02.f38709OooO00o = state;
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z2;
                function9 = function8;
                o00o0o03 = o00o0o02;
                o00o4 = o00oOooO0O0;
                function10 = function7;
                o00o0o2 = o00o0o1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
        }
        i3 |= 196608;
        function5 = function2;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 524288;
        }
        i11 = i2 & 128;
        if (i11 != 0) {
            i3 |= Configuration.BLOCK_SIZE;
        }
        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i12 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i3 |= i13;
        }
        if ((i2 & 192) != 192) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    o00oOooO0O0 = o00o3;
                }
                if (i6 != 0) {
                    function6 = OooO0O0.f38727OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i8 != 0) {
                    function7 = OooO0OO.f38728OooO0Oo;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new o00O0O0();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1 = (o00O0O0) objRememberedValue2;
                    i3 &= -3670017;
                } else {
                    o00o0o1 = o00o0o0;
                }
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new o00O0O00();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o02 = (o00O0O00) objRememberedValue;
                    i3 &= -29360129;
                } else {
                    o00o0o02 = o00o0o01;
                }
                if (i12 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    o00oOooO0O0 = o00o3;
                }
                if (i6 != 0) {
                    function6 = OooO0O0.f38727OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i8 != 0) {
                    function7 = OooO0OO.f38728OooO0Oo;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new o00O0O0();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1 = (o00O0O0) objRememberedValue2;
                    i3 &= -3670017;
                } else {
                    o00o0o1 = o00o0o0;
                }
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new o00O0O00();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o02 = (o00O0O00) objRememberedValue;
                    i3 &= -29360129;
                } else {
                    o00o0o02 = o00o0o01;
                }
                if (i12 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default1111 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default1111);
                objRememberedValue3 = mutableStateMutableStateOf$default1111;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue3;
            if (z2) {
                z3 = false;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(mutableState);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue4 = new OooO0o(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO0o(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
            WebView webView1111112 = (WebView) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(webView1111112, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
            WebView webView1111113 = (WebView) mutableState.getValue();
            int i11116 = (i3 << 3) & 112;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue6 = new OooOO0(mutableState, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooOO0(mutableState, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(webView1111113, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11116 | 520);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
            webView = (WebView) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1370703280);
            if (webView != null) {
                EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                Unit unit1111 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00o0o1.getClass();
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            o00o0o1.f38707OooO00o = state;
            Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
            o00o0o1.f38708OooO0O0 = o00oOooO0O0;
            o00o0o02.getClass();
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            o00o0o02.f38709OooO00o = state;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z2;
            function9 = function8;
            o00o0o03 = o00o0o02;
            o00o4 = o00oOooO0O0;
            function10 = function7;
            o00o0o2 = o00o0o1;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    o00oOooO0O0 = o00o3;
                }
                if (i6 != 0) {
                    function6 = OooO0O0.f38727OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i8 != 0) {
                    function7 = OooO0OO.f38728OooO0Oo;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new o00O0O0();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1 = (o00O0O0) objRememberedValue2;
                    i3 &= -3670017;
                } else {
                    o00o0o1 = o00o0o0;
                }
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new o00O0O00();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o02 = (o00O0O00) objRememberedValue;
                    i3 &= -29360129;
                } else {
                    o00o0o02 = o00o0o01;
                }
                if (i12 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
            } else {
                if (i15 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i4 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if ((i2 & 8) != 0) {
                    o00oOooO0O0 = OooO0O0(composerStartRestartGroup);
                    i3 &= -7169;
                } else {
                    o00oOooO0O0 = o00o3;
                }
                if (i6 != 0) {
                    function6 = OooO0O0.f38727OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i8 != 0) {
                    function7 = OooO0OO.f38728OooO0Oo;
                } else {
                    function7 = function5;
                }
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new o00O0O0();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o1 = (o00O0O0) objRememberedValue2;
                    i3 &= -3670017;
                } else {
                    o00o0o1 = o00o0o0;
                }
                if (i11 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new o00O0O00();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    o00o0o02 = (o00O0O00) objRememberedValue;
                    i3 &= -29360129;
                } else {
                    o00o0o02 = o00o0o01;
                }
                if (i12 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1473276617, i3, -1, "com.google.accompanist.web.WebView (WebView.kt:73)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default1112 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default1112);
                objRememberedValue3 = mutableStateMutableStateOf$default1112;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue3;
            if (z2) {
                z3 = false;
            } else {
                z3 = false;
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(mutableState);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue4 = new OooO0o(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO0o(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooOo.OooO00o(z3, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
            WebView webView1111114 = (WebView) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(o00oOooO0O0) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new OooO(o00oOooO0O0, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(webView1111114, o00oOooO0O0, (Function2) objRememberedValue5, composerStartRestartGroup, ((i3 >> 6) & 112) | 520);
            WebView webView1111115 = (WebView) mutableState.getValue();
            int i11117 = (i3 << 3) & 112;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(state);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue6 = new OooOO0(mutableState, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new OooOO0(mutableState, state, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(webView1111115, state, (Function2) objRememberedValue6, composerStartRestartGroup, i11117 | 520);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function7, composerStartRestartGroup, (i3 >> 15) & 14);
            webView = (WebView) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1370703280);
            if (webView != null) {
                EffectsKt.DisposableEffect(webView, new OooOO0O(webView, stateRememberUpdatedState), composerStartRestartGroup, 8);
                Unit unit1112 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00o0o1.getClass();
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            o00o0o1.f38707OooO00o = state;
            Intrinsics.checkNotNullParameter(o00oOooO0O0, "<set-?>");
            o00o0o1.f38708OooO0O0 = o00oOooO0O0;
            o00o0o02.getClass();
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            o00o0o02.f38709OooO00o = state;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1606035789, true, new OooOOO0(function8, function6, o00o0o02, o00o0o1, mutableState)), composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z2;
            function9 = function8;
            o00o0o03 = o00o0o02;
            o00o4 = o00oOooO0O0;
            function10 = function7;
            o00o0o2 = o00o0o1;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(state, modifier2, z4, o00o4, function6, function10, o00o0o2, o00o0o03, function9, i, i2));
    }

    @Composable
    @NotNull
    public static final o00O OooO0O0(@Nullable Composer composer) {
        composer.startReplaceableGroup(1602323198);
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1602323198, 0, -1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:483)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(coroutineScope);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new o00O(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        o00O o00o2 = (o00O) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o00o2;
    }

    @Composable
    @NotNull
    public static final o00OO0O0 OooO0OO(@NotNull String url, @Nullable Composer composer) {
        Intrinsics.checkNotNullParameter(url, "url");
        composer.startReplaceableGroup(1238013775);
        Map mapEmptyMap = MapsKt.emptyMap();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1238013775, 0, -1, "com.google.accompanist.web.rememberWebViewState (WebView.kt:510)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o00OO0O0(new o00O0OO0.OooO0O0(url, mapEmptyMap));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        o00OO0O0 o00oo0o1 = (o00OO0O0) objRememberedValue;
        o00O0OO0.OooO0O0 oooO0O0 = new o00O0OO0.OooO0O0(url, mapEmptyMap);
        o00oo0o1.getClass();
        Intrinsics.checkNotNullParameter(oooO0O0, "<set-?>");
        o00oo0o1.f38751OooO0O0.setValue(oooO0O0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o00oo0o1;
    }
}
