package p516o0o0O00o;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.OooO0o;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p231o00oOoO.o0000O00;
import p231o00oOoO.o0000oo;
import p429o0OoOO.o0Oo0oo;
import p562o0oOo000.o000000;
import p576o0oOoOOo.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends oO0o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f51156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f51157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ WebView f51158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f51159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51160OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.BaseWebViewKt$BaseWebView$3$2$1$1$2$1$memberRankToRoom$1", f = "BaseWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f51161OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f51162OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00000OO f51163OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f51164OooO0oO;

        /* JADX INFO: renamed from: o0o0O00o.o00000OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0471OooO00o extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f51165OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ String f51166OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0471OooO00o(String str, Function0 function0) {
                super(0);
                this.f51165OooO0Oo = function0;
                this.f51166OooO0o0 = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                this.f51165OooO0Oo.invoke();
                String str = this.f51166OooO0o0;
                if (str != null) {
                    long jOooO = o0OoOo0.OooO(0L, str);
                    MutableState mutableState = o0Oo0oo.f46817OooO00o;
                    o0Oo0oo.OooO0o0(jOooO, null);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, o00000OO o00000oo2, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f51161OooO0Oo = str;
            this.f51163OooO0o0 = o00000oo2;
            this.f51162OooO0o = lifecycleOwner;
            this.f51164OooO0oO = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f51161OooO0Oo, this.f51163OooO0o0, this.f51162OooO0o, this.f51164OooO0oO, continuation);
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
            String str = this.f51161OooO0Oo;
            long jOooO = str != null ? o0OoOo0.OooO(0L, str) : 0L;
            Long value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
            if (value != null && jOooO == value.longValue()) {
                this.f51163OooO0o0.showToastMsg(o0000.OooO0OO(o000000.you_are_already_in_the_room));
            } else {
                Object obj2 = this.f51162OooO0o;
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null) {
                    o000O o000o = new o000O(activity);
                    o000o.OooOo00(o0000.OooO0OO(o000000.live_room_member_rank_jump_to_the_room));
                    o000o.OooOo(true);
                    o000o.OooOo0(new C0471OooO00o(str, this.f51164OooO0oO));
                    o000o.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o00000OO(Function0<Unit> function0, o0000O00 o0000o00, WebView webView, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        this.f51156OooO00o = function0;
        this.f51157OooO0O0 = o0000o00;
        this.f51158OooO0OO = webView;
        this.f51159OooO0Oo = mutableState;
        this.f51160OooO0o0 = lifecycleOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void goBackLastPage() {
        o0000O00 o0000o00 = this.f51157OooO0O0;
        if (((Boolean) o0000o00.f39875OooO0OO.getValue()).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(o0000o00.f39873OooO00o, null, null, new o0000oo(o0000o00, null), 3, null);
        } else {
            this.f51156OooO00o.invoke();
        }
    }

    @Deprecated(message = "使用 roomPage")
    @JavascriptInterface
    public final void memberRankToRoom(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(str, this, this.f51160OooO0o0, this.f51156OooO00o, null), 3, null);
    }

    @Override // p576o0oOoOOo.oO0o0000
    public final void onClosePage() {
        this.f51156OooO00o.invoke();
    }

    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void refreshUrl() {
        this.f51158OooO0OO.reload();
    }

    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void webBgColor(@Nullable String str) {
        Color colorOooO00o;
        super.webBgColor(str);
        this.f51159OooO0Oo.setValue(Color.m1671boximpl((str == null || (colorOooO00o = OooO0o.OooO00o(str)) == null) ? Color.INSTANCE.m1716getTransparent0d7_KjU() : colorOooO00o.m1691unboximpl()));
    }
}
