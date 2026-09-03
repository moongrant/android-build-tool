package p507o0o00ooo;

import android.content.Context;
import android.content.res.Configuration;
import android.webkit.WebView;
import androidx.activity.o0OoOo0;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.contentstate.ContentState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.o000oOoO;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o0000O0;
import p150o00Oo0oO.o0000Ooo;
import p187o00o00oo.o00O;
import p187o00o00oo.o00O0O0O;
import p187o00o00oo.o00O0OO;
import p187o00o00oo.o00O0OO0;
import p187o00o00oo.o00OO00O;
import p187o00o00oo.o00OO0O0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nBaseWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/composable/common/BaseWebViewKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,244:1\n25#2:245\n50#2:252\n49#2:253\n25#2:260\n456#2,8:284\n464#2,3:298\n36#2:302\n467#2,3:309\n25#2:314\n50#2:321\n49#2:322\n1097#3,6:246\n1097#3,6:254\n1097#3,6:261\n1097#3,6:303\n1097#3,6:315\n1097#3,6:323\n66#4,6:267\n72#4:301\n76#4:313\n78#5,11:273\n91#5:312\n4144#6,6:292\n81#7:329\n107#7,2:330\n81#7:332\n107#7,2:333\n81#7:335\n107#7,2:336\n81#7:338\n107#7,2:339\n*S KotlinDebug\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/composable/common/BaseWebViewKt\n*L\n60#1:245\n61#1:252\n61#1:253\n83#1:260\n84#1:284,8\n84#1:298,3\n92#1:302\n84#1:309,3\n184#1:314\n188#1:321\n188#1:322\n60#1:246,6\n61#1:254,6\n83#1:261,6\n92#1:303,6\n184#1:315,6\n188#1:323,6\n84#1:267,6\n84#1:301\n84#1:313\n84#1:273,11\n84#1:312\n84#1:292,6\n60#1:329\n60#1:330,2\n83#1:332\n83#1:333,2\n183#1:335\n183#1:336,2\n184#1:338\n184#1:339,2\n*E\n"})
public final class oOOO0O0o {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50111OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f50112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f50113OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00O f50114OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f50115OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f50116OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f50117OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f50118OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(o00OO0O0 o00oo0o1, o00O o00o2, Modifier modifier, long j, Function1<? super WebView, Unit> function1, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f50112OooO0Oo = o00oo0o1;
            this.f50114OooO0o0 = o00o2;
            this.f50113OooO0o = modifier;
            this.f50115OooO0oO = j;
            this.f50116OooO0oo = function1;
            this.f50111OooO = function0;
            this.f50117OooOO0 = i;
            this.f50118OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOOO0O0o.OooO00o(this.f50112OooO0Oo, this.f50114OooO0o0, this.f50113OooO0o, this.f50115OooO0oO, this.f50116OooO0oo, this.f50111OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50117OooOO0 | 1), this.f50118OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<WebView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f50119OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(WebView webView) {
            WebView it = webView;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.BaseWebViewKt$BaseWebView$2$1", f = "BaseWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f50120OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<ContentState> f50121OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState mutableState, o00OO0O0 o00oo0o1, Continuation continuation) {
            super(2, continuation);
            this.f50120OooO0Oo = o00oo0o1;
            this.f50121OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f50121OooO0o0, this.f50120OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00OO0O0 o00oo0o1 = this.f50120OooO0Oo;
            OooOOO0.OooO0OO("webViewState", " loadingState = " + o00oo0o1.OooO00o() + ", content = " + ((o00O0OO0) o00oo0o1.f38751OooO0O0.getValue()) + ", url = " + ((String) o00oo0o1.f38750OooO00o.getValue()));
            o00O0O0O o00o0o0oOooO00o = o00oo0o1.OooO00o();
            boolean z = o00o0o0oOooO00o instanceof o00O0O0O.OooO0O0;
            MutableState<ContentState> mutableState = this.f50121OooO0o0;
            if (z) {
                mutableState.setValue(ContentState.Loading);
            } else if (o00o0o0oOooO00o instanceof o00O0O0O.OooO0OO) {
                o00O0O0O o00o0o0oOooO00o2 = o00oo0o1.OooO00o();
                Intrinsics.checkNotNull(o00o0o0oOooO00o2, "null cannot be cast to non-null type com.google.accompanist.web.LoadingState.Loading");
                if (((o00O0O0O.OooO0OO) o00o0o0oOooO00o2).f38712OooO00o > 0.8d) {
                    mutableState.setValue(ContentState.Content);
                }
            } else if (o00o0o0oOooO00o instanceof o00O0O0O.OooO00o) {
                mutableState.setValue(o00oo0o1.f38754OooO0o.isEmpty() ? ContentState.Content : ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O f50122OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O o00o2) {
            super(0);
            this.f50122OooO0Oo = o00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O o00o2 = this.f50122OooO0Oo;
            BuildersKt__Builders_commonKt.launch$default(o00o2.f38694OooO00o, null, null, new o00OO00O(o00o2, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nBaseWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/composable/common/BaseWebViewKt$BaseWebView$3$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,244:1\n76#2:245\n76#2:246\n25#3:247\n1097#4,6:248\n*S KotlinDebug\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/composable/common/BaseWebViewKt$BaseWebView$3$2\n*L\n96#1:245\n97#1:246\n98#1:247\n98#1:248,6\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MutableState<Color> f50123OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f50124OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50125OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00O f50126OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f50127OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50128OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(o00OO0O0 o00oo0o1, o00O o00o2, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0, MutableState<Color> mutableState) {
            super(3);
            this.f50124OooO0Oo = o00oo0o1;
            this.f50126OooO0o0 = o00o2;
            this.f50125OooO0o = i;
            this.f50127OooO0oO = function1;
            this.f50128OooO0oo = function0;
            this.f50123OooO = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(704866596, iIntValue, -1, "com.yalla.yalla.ui.composable.common.BaseWebView.<anonymous>.<anonymous> (BaseWebView.kt:93)");
                }
                Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = context.createConfigurationContext(new Configuration());
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Context newContext = (Context) objRememberedValue;
                o0OoOo0 o0oooo0OooO00o = o000oOoO.OooO00o(composer2);
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                Intrinsics.checkNotNullExpressionValue(newContext, "newContext");
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContext.provides(newContext)}, ComposableLambdaKt.composableLambda(composer2, 1108139108, true, new oo000000(o0oooo0OooO00o, this.f50124OooO0Oo, this.f50126OooO0o0, this.f50125OooO0o, this.f50127OooO0oO, this.f50128OooO0oo, this.f50123OooO, lifecycleOwner)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x0168  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:109:0x018d  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0209  */
    /* JADX WARN: Code duplicated, block: B:121:0x0217  */
    /* JADX WARN: Code duplicated, block: B:124:0x024c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0252  */
    /* JADX WARN: Code duplicated, block: B:129:0x0295  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118 A[PHI: r1 r3 r4 r10
      0x0118: PHI (r1v38 int) = (r1v18 int), (r1v40 int) binds: [B:93:0x010d, B:83:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r3v8 o00o00oo.o00O) = (r3v3 o00o00oo.o00O), (r3v2 o00o00oo.o00O) binds: [B:93:0x010d, B:83:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r4v9 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v12 androidx.compose.ui.Modifier) binds: [B:93:0x010d, B:83:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r10v12 long) = (r10v2 long), (r10v1 long) binds: [B:93:0x010d, B:83:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o00OO0O0 webViewState, @Nullable o00O o00o2, @Nullable Modifier modifier, long j, @Nullable Function1<? super WebView, Unit> function1, @NotNull Function0<Unit> onClosePageRequest, @Nullable Composer composer, int i, int i2) {
        int i3;
        o00O o00oOooO0O0;
        Modifier modifier2;
        long j2;
        int i4;
        Function1<? super WebView, Unit> function2;
        int i5;
        int i6;
        Modifier modifier3;
        o00O o00o3;
        Modifier modifier4;
        Function1<? super WebView, Unit> function3;
        long j3;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        boolean zChanged2;
        Object objRememberedValue4;
        Composer composer2;
        o00O o00o4;
        Modifier modifier5;
        long j4;
        Function1<? super WebView, Unit> function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(webViewState, "webViewState");
        Intrinsics.checkNotNullParameter(onClosePageRequest, "onClosePageRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(-946529108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(webViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                o00oOooO0O0 = o00o2;
                int i9 = composerStartRestartGroup.changed(o00oOooO0O0) ? 32 : 16;
                i3 |= i9;
            } else {
                o00oOooO0O0 = o00o2;
            }
            i3 |= i9;
        } else {
            o00oOooO0O0 = o00o2;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 7168) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !composerStartRestartGroup.changed(j2)) {
                    i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                } else {
                    i8 = 2048;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i2 & 32) != 0) {
                    if ((458752 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(onClosePageRequest)) {
                            i6 = 131072;
                        } else {
                            i6 = 65536;
                        }
                    }
                    if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if ((i2 & 2) != 0) {
                                o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                                i3 &= -113;
                            }
                            if (i10 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 8) != 0) {
                                j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                o00o3 = o00oOooO0O0;
                                modifier4 = modifier3;
                                function3 = OooO00o.f50119OooO0Oo;
                                j3 = j2;
                            }
                            i7 = i3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            o00O0O0O o00o0o0oOooO00o = webViewState.OooO00o();
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(o00o0o0oOooO00o, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            MutableState mutableState2 = (MutableState) objRememberedValue3;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion2.then(modifier4), ((Color) mutableState2.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ContentState contentState = (ContentState) mutableState.getValue();
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(o00o3);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new OooO0OO(o00o3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function0 function0 = (Function0) objRememberedValue4;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState2));
                            Modifier modifier6 = modifier4;
                            o00O o00o5 = o00o3;
                            composer2 = composerStartRestartGroup;
                            o0000Ooo.OooO0o0(contentState, false, modifierFillMaxSize$default2, null, null, null, function0, composableLambda, composer2, 12583296, 58);
                            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            o00o4 = o00o5;
                            modifier5 = modifier6;
                            j4 = j3;
                            function4 = function3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier3 = modifier2;
                        }
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                        i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        o00O0O0O o00o0o0oOooO00o2 = webViewState.OooO00o();
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(o00o0o0oOooO00o2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MutableState mutableState3 = (MutableState) objRememberedValue3;
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion4.then(modifier4), ((Color) mutableState3.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ContentState contentState2 = (ContentState) mutableState.getValue();
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(o00o3);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue4 = new OooO0OO(o00o3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0OO(o00o3);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Function0 function5 = (Function0) objRememberedValue4;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState3));
                        Modifier modifier7 = modifier4;
                        o00O o00o6 = o00o3;
                        composer2 = composerStartRestartGroup;
                        o0000Ooo.OooO0o0(contentState2, false, modifierFillMaxSize$default4, null, null, null, function5, composableLambda2, composer2, 12583296, 58);
                        if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        o00o4 = o00o6;
                        modifier5 = modifier7;
                        j4 = j3;
                        function4 = function3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        o00o4 = o00oOooO0O0;
                        modifier5 = modifier2;
                        j4 = j2;
                        function4 = function2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
                }
                i6 = 196608;
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    }
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o00O0O0O o00o0o0oOooO00o3 = webViewState.OooO00o();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(o00o0o0oOooO00o3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState4 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion6.then(modifier4), ((Color) mutableState4.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ContentState contentState3 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o00o3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function6 = (Function0) objRememberedValue4;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState4));
                    Modifier modifier8 = modifier4;
                    o00O o00o7 = o00o3;
                    composer2 = composerStartRestartGroup;
                    o0000Ooo.OooO0o0(contentState3, false, modifierFillMaxSize$default6, null, null, null, function6, composableLambda3, composer2, 12583296, 58);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    o00o4 = o00o7;
                    modifier5 = modifier8;
                    j4 = j3;
                    function4 = function3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    }
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o00O0O0O o00o0o0oOooO00o4 = webViewState.OooO00o();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(o00o0o0oOooO00o4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState5 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion8.then(modifier4), ((Color) mutableState5.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o4 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    ContentState contentState4 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default8 = SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o00o3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function7 = (Function0) objRememberedValue4;
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState5));
                    Modifier modifier9 = modifier4;
                    o00O o00o8 = o00o3;
                    composer2 = composerStartRestartGroup;
                    o0000Ooo.OooO0o0(contentState4, false, modifierFillMaxSize$default8, null, null, null, function7, composableLambda4, composer2, 12583296, 58);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    o00o4 = o00o8;
                    modifier5 = modifier9;
                    j4 = j3;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
            }
            i3 |= 24576;
            function2 = function1;
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClosePageRequest)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    }
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o00O0O0O o00o0o0oOooO00o5 = webViewState.OooO00o();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(o00o0o0oOooO00o5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState6 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default9 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion10.then(modifier4), ((Color) mutableState6.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o5 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    ContentState contentState5 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default10 = SizeKt.fillMaxSize$default(companion10, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o00o3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function8 = (Function0) objRememberedValue4;
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState6));
                    Modifier modifier10 = modifier4;
                    o00O o00o9 = o00o3;
                    composer2 = composerStartRestartGroup;
                    o0000Ooo.OooO0o0(contentState5, false, modifierFillMaxSize$default10, null, null, null, function8, composableLambda5, composer2, 12583296, 58);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    o00o4 = o00o9;
                    modifier5 = modifier10;
                    j4 = j3;
                    function4 = function3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    }
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o00O0O0O o00o0o0oOooO00o6 = webViewState.OooO00o();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(o00o0o0oOooO00o6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState7 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default11 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion12.then(modifier4), ((Color) mutableState7.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o6 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap6);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    ContentState contentState6 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default12 = SizeKt.fillMaxSize$default(companion12, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o00o3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function9 = (Function0) objRememberedValue4;
                    ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState7));
                    Modifier modifier11 = modifier4;
                    o00O o00o10 = o00o3;
                    composer2 = composerStartRestartGroup;
                    o0000Ooo.OooO0o0(contentState6, false, modifierFillMaxSize$default12, null, null, null, function9, composableLambda6, composer2, 12583296, 58);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    o00o4 = o00o10;
                    modifier5 = modifier11;
                    j4 = j3;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
            }
            i6 = 196608;
            i3 |= i6;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                }
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o00O0O0O o00o0o0oOooO00o7 = webViewState.OooO00o();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState8 = (MutableState) objRememberedValue3;
                Modifier.Companion companion14 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default13 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion14.then(modifier4), ((Color) mutableState8.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o7 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                ContentState contentState7 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default14 = SizeKt.fillMaxSize$default(companion14, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o00o3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function10 = (Function0) objRememberedValue4;
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState8));
                Modifier modifier12 = modifier4;
                o00O o00o11 = o00o3;
                composer2 = composerStartRestartGroup;
                o0000Ooo.OooO0o0(contentState7, false, modifierFillMaxSize$default14, null, null, null, function10, composableLambda7, composer2, 12583296, 58);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                o00o4 = o00o11;
                modifier5 = modifier12;
                j4 = j3;
                function4 = function3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                }
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o00O0O0O o00o0o0oOooO00o8 = webViewState.OooO00o();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState9 = (MutableState) objRememberedValue3;
                Modifier.Companion companion16 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default15 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion16.then(modifier4), ((Color) mutableState9.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o8 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                constructor = companion17.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion17, composerM1309constructorimpl, measurePolicyOooO00o8, composerM1309constructorimpl, currentCompositionLocalMap8);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                ContentState contentState8 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default16 = SizeKt.fillMaxSize$default(companion16, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o00o3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function11 = (Function0) objRememberedValue4;
                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState9));
                Modifier modifier13 = modifier4;
                o00O o00o12 = o00o3;
                composer2 = composerStartRestartGroup;
                o0000Ooo.OooO0o0(contentState8, false, modifierFillMaxSize$default16, null, null, null, function11, composableLambda8, composer2, 12583296, 58);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                o00o4 = o00o12;
                modifier5 = modifier13;
                j4 = j3;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 7168) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else {
                i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i8;
        } else {
            j2 = j;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClosePageRequest)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                }
                if ((374491 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    }
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o00O0O0O o00o0o0oOooO00o9 = webViewState.OooO00o();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(o00o0o0oOooO00o9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState10 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion18 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default17 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion18.then(modifier4), ((Color) mutableState10.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o9 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default17);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1309constructorimpl, measurePolicyOooO00o9, composerM1309constructorimpl, currentCompositionLocalMap9);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    ContentState contentState9 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default18 = SizeKt.fillMaxSize$default(companion18, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o00o3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function12 = (Function0) objRememberedValue4;
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState10));
                    Modifier modifier14 = modifier4;
                    o00O o00o13 = o00o3;
                    composer2 = composerStartRestartGroup;
                    o0000Ooo.OooO0o0(contentState9, false, modifierFillMaxSize$default18, null, null, null, function12, composableLambda9, composer2, 12583296, 58);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    o00o4 = o00o13;
                    modifier5 = modifier14;
                    j4 = j3;
                    function4 = function3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 8) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            function3 = OooO00o.f50119OooO0Oo;
                            j3 = j2;
                        } else {
                            o00o3 = o00oOooO0O0;
                            modifier4 = modifier3;
                            j3 = j2;
                            function3 = function2;
                        }
                    }
                    i7 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    o00O0O0O o00o0o0oOooO00o10 = webViewState.OooO00o();
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(o00o0o0oOooO00o10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    MutableState mutableState11 = (MutableState) objRememberedValue3;
                    Modifier.Companion companion110 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default19 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion110.then(modifier4), ((Color) mutableState11.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o10 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1309constructorimpl, measurePolicyOooO00o10, composerM1309constructorimpl, currentCompositionLocalMap10);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    ContentState contentState10 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default110 = SizeKt.fillMaxSize$default(companion110, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(o00o3);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0OO(o00o3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Function0 function13 = (Function0) objRememberedValue4;
                    ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState11));
                    Modifier modifier15 = modifier4;
                    o00O o00o14 = o00o3;
                    composer2 = composerStartRestartGroup;
                    o0000Ooo.OooO0o0(contentState10, false, modifierFillMaxSize$default110, null, null, null, function13, composableLambda10, composer2, 12583296, 58);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    o00o4 = o00o14;
                    modifier5 = modifier15;
                    j4 = j3;
                    function4 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
            }
            i6 = 196608;
            i3 |= i6;
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                }
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o00O0O0O o00o0o0oOooO00o11 = webViewState.OooO00o();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState12 = (MutableState) objRememberedValue3;
                Modifier.Companion companion112 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default111 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion112.then(modifier4), ((Color) mutableState12.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o11 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default111);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1309constructorimpl, measurePolicyOooO00o11, composerM1309constructorimpl, currentCompositionLocalMap11);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                ContentState contentState11 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default112 = SizeKt.fillMaxSize$default(companion112, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o00o3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function14 = (Function0) objRememberedValue4;
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState12));
                Modifier modifier16 = modifier4;
                o00O o00o15 = o00o3;
                composer2 = composerStartRestartGroup;
                o0000Ooo.OooO0o0(contentState11, false, modifierFillMaxSize$default112, null, null, null, function14, composableLambda11, composer2, 12583296, 58);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                o00o4 = o00o15;
                modifier5 = modifier16;
                j4 = j3;
                function4 = function3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                }
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o00O0O0O o00o0o0oOooO00o12 = webViewState.OooO00o();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState13 = (MutableState) objRememberedValue3;
                Modifier.Companion companion114 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default113 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion114.then(modifier4), ((Color) mutableState13.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o12 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                constructor = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion115, composerM1309constructorimpl, measurePolicyOooO00o12, composerM1309constructorimpl, currentCompositionLocalMap12);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                ContentState contentState12 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default114 = SizeKt.fillMaxSize$default(companion114, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o00o3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function15 = (Function0) objRememberedValue4;
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState13));
                Modifier modifier17 = modifier4;
                o00O o00o16 = o00o3;
                composer2 = composerStartRestartGroup;
                o0000Ooo.OooO0o0(contentState12, false, modifierFillMaxSize$default114, null, null, null, function15, composableLambda12, composer2, 12583296, 58);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                o00o4 = o00o16;
                modifier5 = modifier17;
                j4 = j3;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
        }
        i3 |= 24576;
        function2 = function1;
        if ((i2 & 32) != 0) {
            if ((458752 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onClosePageRequest)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
            }
            if ((374491 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                }
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o00O0O0O o00o0o0oOooO00o13 = webViewState.OooO00o();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState14 = (MutableState) objRememberedValue3;
                Modifier.Companion companion116 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default115 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion116.then(modifier4), ((Color) mutableState14.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o13 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default115);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1309constructorimpl, measurePolicyOooO00o13, composerM1309constructorimpl, currentCompositionLocalMap13);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                ContentState contentState13 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default116 = SizeKt.fillMaxSize$default(companion116, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o00o3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function16 = (Function0) objRememberedValue4;
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState14));
                Modifier modifier18 = modifier4;
                o00O o00o17 = o00o3;
                composer2 = composerStartRestartGroup;
                o0000Ooo.OooO0o0(contentState13, false, modifierFillMaxSize$default116, null, null, null, function16, composableLambda13, composer2, 12583296, 58);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                o00o4 = o00o17;
                modifier5 = modifier18;
                j4 = j3;
                function4 = function3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        function3 = OooO00o.f50119OooO0Oo;
                        j3 = j2;
                    } else {
                        o00o3 = o00oOooO0O0;
                        modifier4 = modifier3;
                        j3 = j2;
                        function3 = function2;
                    }
                }
                i7 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                o00O0O0O o00o0o0oOooO00o14 = webViewState.OooO00o();
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(o00o0o0oOooO00o14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableState mutableState15 = (MutableState) objRememberedValue3;
                Modifier.Companion companion118 = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default117 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion118.then(modifier4), ((Color) mutableState15.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o14 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion119, composerM1309constructorimpl, measurePolicyOooO00o14, composerM1309constructorimpl, currentCompositionLocalMap14);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                ContentState contentState14 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default118 = SizeKt.fillMaxSize$default(companion118, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(o00o3);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0OO(o00o3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function17 = (Function0) objRememberedValue4;
                ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState15));
                Modifier modifier19 = modifier4;
                o00O o00o18 = o00o3;
                composer2 = composerStartRestartGroup;
                o0000Ooo.OooO0o0(contentState14, false, modifierFillMaxSize$default118, null, null, null, function17, composableLambda14, composer2, 12583296, 58);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                o00o4 = o00o18;
                modifier5 = modifier19;
                j4 = j3;
                function4 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
        }
        i6 = 196608;
        i3 |= i6;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                    i3 &= -113;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    function3 = OooO00o.f50119OooO0Oo;
                    j3 = j2;
                } else {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    j3 = j2;
                    function3 = function2;
                }
            } else {
                if ((i2 & 2) != 0) {
                    o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                    i3 &= -113;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    function3 = OooO00o.f50119OooO0Oo;
                    j3 = j2;
                } else {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    j3 = j2;
                    function3 = function2;
                }
            }
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            o00O0O0O o00o0o0oOooO00o15 = webViewState.OooO00o();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(o00o0o0oOooO00o15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState16 = (MutableState) objRememberedValue3;
            Modifier.Companion companion1110 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default119 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion1110.then(modifier4), ((Color) mutableState16.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o15 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default119);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1309constructorimpl, measurePolicyOooO00o15, composerM1309constructorimpl, currentCompositionLocalMap15);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            ContentState contentState15 = (ContentState) mutableState.getValue();
            Modifier modifierFillMaxSize$default1110 = SizeKt.fillMaxSize$default(companion1110, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(o00o3);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new OooO0OO(o00o3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO0OO(o00o3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function18 = (Function0) objRememberedValue4;
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState16));
            Modifier modifier110 = modifier4;
            o00O o00o19 = o00o3;
            composer2 = composerStartRestartGroup;
            o0000Ooo.OooO0o0(contentState15, false, modifierFillMaxSize$default1110, null, null, null, function18, composableLambda15, composer2, 12583296, 58);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            o00o4 = o00o19;
            modifier5 = modifier110;
            j4 = j3;
            function4 = function3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                    i3 &= -113;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    function3 = OooO00o.f50119OooO0Oo;
                    j3 = j2;
                } else {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    j3 = j2;
                    function3 = function2;
                }
            } else {
                if ((i2 & 2) != 0) {
                    o00oOooO0O0 = o00O0OO.OooO0O0(composerStartRestartGroup);
                    i3 &= -113;
                }
                if (i10 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0;
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    function3 = OooO00o.f50119OooO0Oo;
                    j3 = j2;
                } else {
                    o00o3 = o00oOooO0O0;
                    modifier4 = modifier3;
                    j3 = j2;
                    function3 = function2;
                }
            }
            i7 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-946529108, i7, -1, "com.yalla.yalla.ui.composable.common.BaseWebView (BaseWebView.kt:51)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Content, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            o00O0O0O o00o0o0oOooO00o16 = webViewState.OooO00o();
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(webViewState) | composerStartRestartGroup.changed(mutableState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooO0O0(mutableState, webViewState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(o00o0o0oOooO00o16, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 64);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m1660boximpl(j3), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState17 = (MutableState) objRememberedValue3;
            Modifier.Companion companion1112 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default1111 = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion1112.then(modifier4), ((Color) mutableState17.getValue()).m1680unboximpl(), null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o16 = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
            constructor = companion1113.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1113, composerM1309constructorimpl, measurePolicyOooO00o16, composerM1309constructorimpl, currentCompositionLocalMap16);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
            ContentState contentState16 = (ContentState) mutableState.getValue();
            Modifier modifierFillMaxSize$default1112 = SizeKt.fillMaxSize$default(companion1112, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(o00o3);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new OooO0OO(o00o3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO0OO(o00o3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function19 = (Function0) objRememberedValue4;
            ComposableLambda composableLambda16 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 704866596, true, new OooO0o(webViewState, o00o3, i7, function3, onClosePageRequest, mutableState17));
            Modifier modifier111 = modifier4;
            o00O o00o110 = o00o3;
            composer2 = composerStartRestartGroup;
            o0000Ooo.OooO0o0(contentState16, false, modifierFillMaxSize$default1112, null, null, null, function19, composableLambda16, composer2, 12583296, 58);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            o00o4 = o00o110;
            modifier5 = modifier111;
            j4 = j3;
            function4 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(webViewState, o00o4, modifier5, j4, function4, onClosePageRequest, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@Nullable Function1 function1, @Nullable Modifier modifier, @Nullable Function1 function2, @Nullable Composer composer, int i, int i2) {
        Function1 function3;
        int i3;
        Function1 function4;
        int i4;
        Modifier modifier2;
        int i5;
        Function1 function5;
        Function1 function6;
        Modifier modifier3;
        ContentState contentState;
        boolean zChanged;
        Object objRememberedValue;
        MutableState mutableState;
        Object objRememberedValue2;
        Composer.Companion companion;
        MutableState mutableState2;
        boolean zChanged2;
        Object objRememberedValue3;
        Function1 function7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1315538794);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            function3 = function1;
        } else if ((i & 14) == 0) {
            function3 = function1;
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            function3 = function1;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                function4 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        function5 = oo00.f50154OooO0Oo;
                    } else {
                        function5 = function3;
                    }
                    if (i7 != 0) {
                        function6 = O0000000.f49730OooO0Oo;
                    } else {
                        function6 = function4;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(899586268);
                    contentState = ContentState.Loading;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
                    }
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(contentState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new o0000O0(contentState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    ContentState contentState2 = (ContentState) mutableState.getValue();
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new O0O0(mutableState, mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
                    Modifier modifier4 = modifier3;
                    function7 = function6;
                    o0000Ooo.OooO0o0(contentState2, true, modifierFillMaxSize$default, null, null, null, (Function0) objRememberedValue3, composableLambda, composerStartRestartGroup, 12582960, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function5 = function3;
                    function7 = function4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(function5, modifier2, function7, i, i2));
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    function5 = oo00.f50154OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i7 != 0) {
                    function6 = O0000000.f49730OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(899586268);
                contentState = ContentState.Loading;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
                }
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(contentState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                ContentState contentState3 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
                Modifier modifier5 = modifier3;
                function7 = function6;
                o0000Ooo.OooO0o0(contentState3, true, modifierFillMaxSize$default2, null, null, null, (Function0) objRememberedValue3, composableLambda2, composerStartRestartGroup, 12582960, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
            } else {
                if (i6 != 0) {
                    function5 = oo00.f50154OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i7 != 0) {
                    function6 = O0000000.f49730OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(899586268);
                contentState = ContentState.Loading;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
                }
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(contentState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                ContentState contentState4 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
                Modifier modifier6 = modifier3;
                function7 = function6;
                o0000Ooo.OooO0o0(contentState4, true, modifierFillMaxSize$default3, null, null, null, (Function0) objRememberedValue3, composableLambda3, composerStartRestartGroup, 12582960, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(function5, modifier2, function7, i, i2));
        }
        i3 |= 48;
        function4 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 731) == 146) {
                if (i6 != 0) {
                    function5 = oo00.f50154OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i7 != 0) {
                    function6 = O0000000.f49730OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(899586268);
                contentState = ContentState.Loading;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
                }
                Object[] objArr4 = new Object[0];
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(contentState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                ContentState contentState5 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
                Modifier modifier7 = modifier3;
                function7 = function6;
                o0000Ooo.OooO0o0(contentState5, true, modifierFillMaxSize$default4, null, null, null, (Function0) objRememberedValue3, composableLambda4, composerStartRestartGroup, 12582960, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier7;
            } else {
                if (i6 != 0) {
                    function5 = oo00.f50154OooO0Oo;
                } else {
                    function5 = function3;
                }
                if (i7 != 0) {
                    function6 = O0000000.f49730OooO0Oo;
                } else {
                    function6 = function4;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
                }
                composerStartRestartGroup.startReplaceableGroup(899586268);
                contentState = ContentState.Loading;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
                }
                Object[] objArr5 = new Object[0];
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(contentState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new o0000O0(contentState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                ContentState contentState6 = (ContentState) mutableState.getValue();
                Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new O0O0(mutableState, mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
                Modifier modifier8 = modifier3;
                function7 = function6;
                o0000Ooo.OooO0o0(contentState6, true, modifierFillMaxSize$default5, null, null, null, (Function0) objRememberedValue3, composableLambda5, composerStartRestartGroup, 12582960, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(function5, modifier2, function7, i, i2));
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 731) == 146) {
            if (i6 != 0) {
                function5 = oo00.f50154OooO0Oo;
            } else {
                function5 = function3;
            }
            if (i7 != 0) {
                function6 = O0000000.f49730OooO0Oo;
            } else {
                function6 = function4;
            }
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(899586268);
            contentState = ContentState.Loading;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
            }
            Object[] objArr6 = new Object[0];
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(contentState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o0000O0(contentState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o0000O0(contentState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            ContentState contentState7 = (ContentState) mutableState.getValue();
            Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new O0O0(mutableState, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new O0O0(mutableState, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
            Modifier modifier9 = modifier3;
            function7 = function6;
            o0000Ooo.OooO0o0(contentState7, true, modifierFillMaxSize$default6, null, null, null, (Function0) objRememberedValue3, composableLambda6, composerStartRestartGroup, 12582960, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier9;
        } else {
            if (i6 != 0) {
                function5 = oo00.f50154OooO0Oo;
            } else {
                function5 = function3;
            }
            if (i7 != 0) {
                function6 = O0000000.f49730OooO0Oo;
            } else {
                function6 = function4;
            }
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315538794, i, -1, "com.yalla.yalla.ui.composable.common.BaseWebView2 (BaseWebView.kt:177)");
            }
            composerStartRestartGroup.startReplaceableGroup(899586268);
            contentState = ContentState.Loading;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(899586268, 0, -1, "com.code.android.uikit.contentstate.rememberContentState (ContentStatus.kt:56)");
            }
            Object[] objArr7 = new Object[0];
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(contentState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new o0000O0(contentState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new o0000O0(contentState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            ContentState contentState8 = (ContentState) mutableState.getValue();
            Modifier modifierFillMaxSize$default7 = SizeKt.fillMaxSize$default(Modifier.INSTANCE.then(modifier3), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(mutableState2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new O0O0(mutableState, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new O0O0(mutableState, mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 696020204, true, new a(mutableState2, mutableState, function6, function5));
            Modifier modifier10 = modifier3;
            function7 = function6;
            o0000Ooo.OooO0o0(contentState8, true, modifierFillMaxSize$default7, null, null, null, (Function0) objRememberedValue3, composableLambda7, composerStartRestartGroup, 12582960, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier10;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(function5, modifier2, function7, i, i2));
    }
}
