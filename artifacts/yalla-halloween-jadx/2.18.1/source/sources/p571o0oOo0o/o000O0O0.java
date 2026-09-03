package p571o0oOo0o;

import android.content.Context;
import android.content.res.Configuration;
import android.webkit.WebView;
import androidx.activity.OooOOOO;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import come.code.android.easyrefreshcontentstatus.ContentState;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p259o00ooOo.o0O0o;
import p325o0O0oo0o.o000O00O;
import p325o0O0oo0o.o000O0Oo;
import p325o0O0oo0o.o000O0o;
import p325o0O0oo0o.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 {

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f45475Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p325o0O0oo0o.o000O0O0 f45476Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45477Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f45478Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f45479OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f45480OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(p325o0O0oo0o.o000O0O0 o000o0o1, o00OOOO0 o00oooo1, Function1<? super WebView, Unit> function1, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f45476Oooo0o = o000o0o1;
            this.f45477Oooo0oO = o00oooo1;
            this.f45478Oooo0oo = function1;
            this.f45475Oooo = function0;
            this.f45480OoooO00 = i;
            this.f45479OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o000O0O0.OooO00o(this.f45476Oooo0o, this.f45477Oooo0oO, this.f45478Oooo0oo, this.f45475Oooo, ooo00o, this.f45480OoooO00 | 1, this.f45479OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<WebView, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f45481Oooo0o = new OooO00o();

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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p325o0O0oo0o.o000O0O0 f45482Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<ContentState> f45483Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p325o0O0oo0o.o000O0O0 o000o0o1, o0O00OO<ContentState> o0o00oo2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f45482Oooo0o = o000o0o1;
            this.f45483Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f45482Oooo0o, this.f45483Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000O0o o000o0oOooO0O0 = this.f45482Oooo0o.OooO0O0();
            if (o000o0oOooO0O0 instanceof o000O0o.OooO0O0) {
                this.f45483Oooo0oO.setValue(ContentState.Loading);
            } else if (o000o0oOooO0O0 instanceof o000O0o.OooO0OO) {
                o000O0o o000o0oOooO0O1 = this.f45482Oooo0o.OooO0O0();
                Intrinsics.checkNotNull(o000o0oOooO0O1, "null cannot be cast to non-null type com.google.accompanist.web.LoadingState.Loading");
                if (((o000O0o.OooO0OO) o000o0oOooO0O1).f36971OooO00o > 0.8d) {
                    this.f45483Oooo0oO.setValue(ContentState.Content);
                }
            } else if (o000o0oOooO0O0 instanceof o000O0o.OooO00o) {
                this.f45483Oooo0oO.setValue(this.f45482Oooo0o.f36957OooO0o0.isEmpty() ? ContentState.Content : ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O0Oo f45484Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O0Oo o000o0oo2) {
            super(0);
            this.f45484Oooo0o = o000o0oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000O0Oo o000o0oo2 = this.f45484Oooo0o;
            BuildersKt__Builders_commonKt.launch$default(o000o0oo2.f36958OooO00o, null, null, new o000OO0O(o000o0oo2, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<WebView, Unit> f45485Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p325o0O0oo0o.o000O0O0 f45486Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f45487Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f45488Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f45489OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(p325o0O0oo0o.o000O0O0 o000o0o1, o00OOOO0 o00oooo1, int i, Function1<? super WebView, Unit> function1, Function0<Unit> function0) {
            super(3);
            this.f45486Oooo0o = o000o0o1;
            this.f45487Oooo0oO = o00oooo1;
            this.f45488Oooo0oo = i;
            this.f45485Oooo = function1;
            this.f45489OoooO00 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
            o00O00o0 ContentStatus = o00o00o1;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0O0O0o0<Context> o0o0o0o0 = o0O0O00.f6591OooO0O0;
                Context context = (Context) ooo00o2.OooOO0o(o0o0o0o0);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) ooo00o2.OooOO0o(o0O0O00.f6593OooO0Oo);
                ooo00o2.OooO0o0(-492369756);
                Object objOooO0o = ooo00o2.OooO0o();
                if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = context.createConfigurationContext(new Configuration());
                    ooo00o2.Oooo00o(objOooO0o);
                }
                ooo00o2.Oooo0o0();
                Context newContext = (Context) objOooO0o;
                OooOOOO oooOOOOOooO00o = p010OooOOo0.OooO.f182OooO00o.OooO00o(ooo00o2);
                Intrinsics.checkNotNullExpressionValue(newContext, "newContext");
                o00OO0O0.OooO00o(new o0O0OO0[]{o0o0o0o0.OooO0O0(newContext)}, o00O0000.OooO00o(ooo00o2, 267354422, new o0O0ooO(oooOOOOOooO00o, this.f45486Oooo0o, this.f45487Oooo0oO, this.f45488Oooo0oo, this.f45485Oooo, this.f45489OoooO00, lifecycleOwner)), ooo00o2, 56);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull p325o0O0oo0o.o000O0O0 webViewState, @Nullable o00OOOO0 o00oooo1, @Nullable Function1<? super WebView, Unit> function1, @NotNull Function0<Unit> onClosePageRequest, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        o00OOOO0 o00oooo2;
        int i4;
        Function1<? super WebView, Unit> function2;
        int i5;
        int i6;
        int i7;
        o00OOOO0 o00oooo3;
        Function1<? super WebView, Unit> function3;
        Object objOooO0o;
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o;
        o0O00OO o0o00oo2;
        o000O0Oo o000o0ooOooO0OO;
        boolean zOooo0oo;
        Object objOooO0o2;
        boolean zOooo0oo2;
        Object objOooO0o3;
        oOO00O ooo00o2;
        Function1<? super WebView, Unit> function4;
        oo0ooO oo0oooOooOo;
        Intrinsics.checkNotNullParameter(webViewState, "webViewState");
        Intrinsics.checkNotNullParameter(onClosePageRequest, "onClosePageRequest");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-437897261);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(webViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                o00oooo2 = o00oooo1;
                i3 |= ooo00oOooOOo.Oooo0oo(o00oooo2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function2 = function1;
                    if (ooo00oOooOOo.Oooo0oo(function2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (ooo00oOooOOo.Oooo0oo(onClosePageRequest)) {
                        i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) == 1170 || !ooo00oOooOOo.OooOo0()) {
                    if (i8 != 0) {
                        o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                    } else {
                        o00oooo3 = o00oooo2;
                    }
                    if (i4 != 0) {
                        function3 = OooO00o.f45481Oooo0o;
                    } else {
                        function3 = function2;
                    }
                    Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function5 = oo0o0O0.f29705OooO00o;
                    ooo00oOooOOo.OooO0o0(-492369756);
                    objOooO0o = ooo00oOooOOo.OooO0o();
                    c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                    if (objOooO0o == c0323OooO00o) {
                        objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                        ooo00oOooOOo.Oooo00o(objOooO0o);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o0o00oo2 = (o0O00OO) objOooO0o;
                    o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
                    o000O0o o000o0oOooO0O0 = webViewState.OooO0O0();
                    ooo00oOooOOo.OooO0o0(511388516);
                    zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
                    objOooO0o2 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                        objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                        ooo00oOooOOo.Oooo00o(objOooO0o2);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    o00Oo00.OooO0o0(o000o0oOooO0O0, (Function2) objOooO0o2, ooo00oOooOOo);
                    ContentState contentState = (ContentState) o0o00oo2.getValue();
                    ooo00oOooOOo.OooO0o0(1157296644);
                    zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
                    objOooO0o3 = ooo00oOooOOo.OooO0o();
                    if (zOooo0oo2 || objOooO0o3 == c0323OooO00o) {
                        objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                        ooo00oOooOOo.Oooo00o(objOooO0o3);
                    }
                    ooo00oOooOOo.Oooo0o0();
                    Function0 function0 = (Function0) objOooO0o3;
                    o00oooo2 = o00oooo3;
                    ooo00o2 = ooo00oOooOOo;
                    o0O0o.OooO0o0(contentState, null, null, null, null, function0, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
                    function4 = function3;
                } else {
                    ooo00oOooOOo.OooOoo0();
                    function4 = function2;
                    ooo00o2 = ooo00oOooOOo;
                }
                oo0oooOooOo = ooo00o2.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(webViewState, o00oooo2, function4, onClosePageRequest, i, i2));
            }
            i3 |= 384;
            function2 = function1;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (ooo00oOooOOo.Oooo0oo(onClosePageRequest)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = OooO00o.f45481Oooo0o;
                } else {
                    function3 = function2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function6 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
                o000O0o o000o0oOooO0O1 = webViewState.OooO0O0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o00Oo00.OooO0o0(o000o0oOooO0O1, (Function2) objOooO0o2, ooo00oOooOOo);
                ContentState contentState2 = (ContentState) o0o00oo2.getValue();
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                Function0 function7 = (Function0) objOooO0o3;
                o00oooo2 = o00oooo3;
                ooo00o2 = ooo00oOooOOo;
                o0O0o.OooO0o0(contentState2, null, null, null, null, function7, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
                function4 = function3;
            } else {
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = OooO00o.f45481Oooo0o;
                } else {
                    function3 = function2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function8 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
                o000O0o o000o0oOooO0O2 = webViewState.OooO0O0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o00Oo00.OooO0o0(o000o0oOooO0O2, (Function2) objOooO0o2, ooo00oOooOOo);
                ContentState contentState3 = (ContentState) o0o00oo2.getValue();
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                Function0 function9 = (Function0) objOooO0o3;
                o00oooo2 = o00oooo3;
                ooo00o2 = ooo00oOooOOo;
                o0O0o.OooO0o0(contentState3, null, null, null, null, function9, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
                function4 = function3;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(webViewState, o00oooo2, function4, onClosePageRequest, i, i2));
        }
        i3 |= 48;
        o00oooo2 = o00oooo1;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                function2 = function1;
                if (ooo00oOooOOo.Oooo0oo(function2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (ooo00oOooOOo.Oooo0oo(onClosePageRequest)) {
                    i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = OooO00o.f45481Oooo0o;
                } else {
                    function3 = function2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function10 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
                o000O0o o000o0oOooO0O3 = webViewState.OooO0O0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o00Oo00.OooO0o0(o000o0oOooO0O3, (Function2) objOooO0o2, ooo00oOooOOo);
                ContentState contentState4 = (ContentState) o0o00oo2.getValue();
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                Function0 function11 = (Function0) objOooO0o3;
                o00oooo2 = o00oooo3;
                ooo00o2 = ooo00oOooOOo;
                o0O0o.OooO0o0(contentState4, null, null, null, null, function11, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
                function4 = function3;
            } else {
                if (i8 != 0) {
                    o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
                } else {
                    o00oooo3 = o00oooo2;
                }
                if (i4 != 0) {
                    function3 = OooO00o.f45481Oooo0o;
                } else {
                    function3 = function2;
                }
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function12 = oo0o0O0.f29705OooO00o;
                ooo00oOooOOo.OooO0o0(-492369756);
                objOooO0o = ooo00oOooOOo.OooO0o();
                c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                    ooo00oOooOOo.Oooo00o(objOooO0o);
                }
                ooo00oOooOOo.Oooo0o0();
                o0o00oo2 = (o0O00OO) objOooO0o;
                o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
                o000O0o o000o0oOooO0O4 = webViewState.OooO0O0();
                ooo00oOooOOo.OooO0o0(511388516);
                zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
                objOooO0o2 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo) {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                } else {
                    objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                    ooo00oOooOOo.Oooo00o(objOooO0o2);
                }
                ooo00oOooOOo.Oooo0o0();
                o00Oo00.OooO0o0(o000o0oOooO0O4, (Function2) objOooO0o2, ooo00oOooOOo);
                ContentState contentState5 = (ContentState) o0o00oo2.getValue();
                ooo00oOooOOo.OooO0o0(1157296644);
                zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
                objOooO0o3 = ooo00oOooOOo.OooO0o();
                if (zOooo0oo2) {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                } else {
                    objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                    ooo00oOooOOo.Oooo00o(objOooO0o3);
                }
                ooo00oOooOOo.Oooo0o0();
                Function0 function13 = (Function0) objOooO0o3;
                o00oooo2 = o00oooo3;
                ooo00o2 = ooo00oOooOOo;
                o0O0o.OooO0o0(contentState5, null, null, null, null, function13, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
                function4 = function3;
            }
            oo0oooOooOo = ooo00o2.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooO(webViewState, o00oooo2, function4, onClosePageRequest, i, i2));
        }
        i3 |= 384;
        function2 = function1;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (ooo00oOooOOo.Oooo0oo(onClosePageRequest)) {
                i6 = RecyclerView.oo0o0Oo.FLAG_MOVED;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) == 1170) {
            if (i8 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                function3 = OooO00o.f45481Oooo0o;
            } else {
                function3 = function2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function14 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o = ooo00oOooOOo.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
            o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
            o000O0o o000o0oOooO0O5 = webViewState.OooO0O0();
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
            objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            } else {
                objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0o0(o000o0oOooO0O5, (Function2) objOooO0o2, ooo00oOooOOo);
            ContentState contentState6 = (ContentState) o0o00oo2.getValue();
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
            objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2) {
                objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            } else {
                objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            Function0 function15 = (Function0) objOooO0o3;
            o00oooo2 = o00oooo3;
            ooo00o2 = ooo00oOooOOo;
            o0O0o.OooO0o0(contentState6, null, null, null, null, function15, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
            function4 = function3;
        } else {
            if (i8 != 0) {
                o00oooo3 = o00OOOO0.OooO00o.f4198Oooo0o;
            } else {
                o00oooo3 = o00oooo2;
            }
            if (i4 != 0) {
                function3 = OooO00o.f45481Oooo0o;
            } else {
                function3 = function2;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function16 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(-492369756);
            objOooO0o = ooo00oOooOOo.OooO0o();
            c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(ContentState.Content);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0o00oo2 = (o0O00OO) objOooO0o;
            o000o0ooOooO0OO = o000O00O.OooO0OO(ooo00oOooOOo);
            o000O0o o000o0oOooO0O6 = webViewState.OooO0O0();
            ooo00oOooOOo.OooO0o0(511388516);
            zOooo0oo = ooo00oOooOOo.Oooo0oo(webViewState) | ooo00oOooOOo.Oooo0oo(o0o00oo2);
            objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo) {
                objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            } else {
                objOooO0o2 = new OooO0O0(webViewState, o0o00oo2, null);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0o0(o000o0oOooO0O6, (Function2) objOooO0o2, ooo00oOooOOo);
            ContentState contentState7 = (ContentState) o0o00oo2.getValue();
            ooo00oOooOOo.OooO0o0(1157296644);
            zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o000o0ooOooO0OO);
            objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2) {
                objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            } else {
                objOooO0o3 = new OooO0OO(o000o0ooOooO0OO);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            Function0 function17 = (Function0) objOooO0o3;
            o00oooo2 = o00oooo3;
            ooo00o2 = ooo00oOooOOo;
            o0O0o.OooO0o0(contentState7, null, null, null, null, function17, o00O0000.OooO00o(ooo00oOooOOo, -12714890, new OooO0o(webViewState, o00oooo2, i7, function3, onClosePageRequest)), ooo00o2, 1572864, 30);
            function4 = function3;
        }
        oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(webViewState, o00oooo2, function4, onClosePageRequest, i, i2));
    }
}
