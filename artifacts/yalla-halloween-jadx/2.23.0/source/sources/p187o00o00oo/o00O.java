package p187o00o00oo;

import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Stable
@SourceDebugExtension({"SMAP\nWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewNavigator\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,551:1\n76#2:552\n102#2,2:553\n76#2:555\n102#2,2:556\n*S KotlinDebug\n*F\n+ 1 WebView.kt\ncom/google/accompanist/web/WebViewNavigator\n*L\n410#1:552\n410#1:553,2\n416#1:555\n416#1:556,2\n*E\n"})
public final class o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f38694OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<OooO00o> f38695OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f38696OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f38697OooO0Oo;

    public interface OooO00o {

        /* JADX INFO: renamed from: o00o00oo.o00O$OooO00o$OooO00o, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public static final class C0442OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public static final C0442OooO00o f38698OooO00o = new C0442OooO00o();
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0O0 implements OooO00o {
            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0O0)) {
                    return false;
                }
                ((OooO0O0) obj).getClass();
                return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "LoadHtml(html=null, baseUrl=null, mimeType=null, encoding=null, historyUrl=null)";
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0OO implements OooO00o {
            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0OO)) {
                    return false;
                }
                ((OooO0OO) obj).getClass();
                return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "LoadUrl(url=null, additionalHttpHeaders=null)";
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0o implements OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public static final OooO0o f38699OooO00o = new OooO0o();
        }
    }

    @DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator", f = "WebView.kt", i = {}, l = {385}, m = "handleNavigationEvents$web_release", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f38700OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f38701OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38700OooO0Oo = obj;
            this.f38701OooO0o |= Integer.MIN_VALUE;
            return o00O.this.OooO00o(null, this);
        }
    }

    @DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2", f = "WebView.kt", i = {}, l = {386}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f38703OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ WebView f38704OooO0o;

        public static final class OooO00o implements FlowCollector<OooO00o> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ WebView f38706OooO0Oo;

            public OooO00o(WebView webView) {
                this.f38706OooO0Oo = webView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(OooO00o oooO00o, Continuation continuation) {
                OooO00o oooO00o2 = oooO00o;
                boolean z = oooO00o2 instanceof OooO00o.C0442OooO00o;
                WebView webView = this.f38706OooO0Oo;
                if (z) {
                    webView.goBack();
                } else if (oooO00o2 instanceof OooO00o.OooO0o) {
                    webView.reload();
                } else if (oooO00o2 instanceof OooO00o.OooO0O0) {
                    ((OooO00o.OooO0O0) oooO00o2).getClass();
                    webView.loadDataWithBaseURL(null, null, null, null, null);
                } else if (oooO00o2 instanceof OooO00o.OooO0OO) {
                    ((OooO00o.OooO0OO) oooO00o2).getClass();
                    webView.loadUrl(null, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(WebView webView, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f38704OooO0o = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00O.this.new OooO0OO(this.f38704OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f38703OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<OooO00o> mutableSharedFlow = o00O.this.f38695OooO0O0;
                OooO00o oooO00o = new OooO00o(this.f38704OooO0o);
                this.f38703OooO0Oo = 1;
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

    public o00O(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f38694OooO00o = coroutineScope;
        this.f38695OooO0O0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        Boolean bool = Boolean.FALSE;
        this.f38696OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f38697OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull WebView webView, @NotNull Continuation<?> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f38701OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f38701OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f38700OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f38701OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO0OO oooO0OO = new OooO0OO(webView, null);
            oooO0O0.f38701OooO0o = 1;
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
