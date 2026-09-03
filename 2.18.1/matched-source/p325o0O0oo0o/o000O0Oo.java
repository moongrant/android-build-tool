package p325o0O0oo0o;

import android.webkit.WebView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f36958OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<OooO00o> f36959OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f36960OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f36961OooO0Oo;

    public enum OooO00o {
        BACK,
        FORWARD,
        RELOAD,
        STOP_LOADING
    }

    @DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator", f = "WebView.kt", i = {}, l = {345}, m = "handleNavigationEvents$web_release", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f36962Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f36964Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36962Oooo0o = obj;
            this.f36964Oooo0oo |= Integer.MIN_VALUE;
            return o000O0Oo.this.OooO00o(null, this);
        }
    }

    @DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2", f = "WebView.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f36965Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ WebView f36967Oooo0oo;

        public static final class OooO00o implements FlowCollector<OooO00o> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ WebView f36968Oooo0o;

            /* JADX INFO: renamed from: o0O0oo0o.o000O0Oo$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            public /* synthetic */ class C0372OooO00o {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OooO00o.values().length];
                    iArr[OooO00o.BACK.ordinal()] = 1;
                    iArr[OooO00o.FORWARD.ordinal()] = 2;
                    iArr[OooO00o.RELOAD.ordinal()] = 3;
                    iArr[OooO00o.STOP_LOADING.ordinal()] = 4;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public OooO00o(WebView webView) {
                this.f36968Oooo0o = webView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(OooO00o oooO00o, Continuation continuation) {
                int i = C0372OooO00o.$EnumSwitchMapping$0[oooO00o.ordinal()];
                if (i == 1) {
                    this.f36968Oooo0o.goBack();
                } else if (i == 2) {
                    this.f36968Oooo0o.goForward();
                } else if (i == 3) {
                    this.f36968Oooo0o.reload();
                } else if (i == 4) {
                    this.f36968Oooo0o.stopLoading();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(WebView webView, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f36967Oooo0oo = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o000O0Oo.this.new OooO0OO(this.f36967Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f36965Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<OooO00o> mutableSharedFlow = o000O0Oo.this.f36959OooO0O0;
                OooO00o oooO00o = new OooO00o(this.f36967Oooo0oo);
                this.f36965Oooo0o = 1;
                if (mutableSharedFlow.collect(oooO00o, this) == coroutine_suspended) {
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

    public o000O0Oo(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36958OooO00o = coroutineScope;
        this.f36959OooO0O0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        Boolean bool = Boolean.FALSE;
        this.f36960OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f36961OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull WebView webView, @NotNull Continuation<?> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f36964Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f36964Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f36962Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f36964Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO0OO oooO0OO = new OooO0OO(webView, null);
            oooO0O0.f36964Oooo0oo = 1;
            if (BuildersKt.withContext(main, oooO0OO, oooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
