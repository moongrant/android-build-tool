package p507o0o00ooo;

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
import p157o00OoOO0.o0OO00O;
import p187o00o00oo.o00O;
import p187o00o00oo.o00OO000;
import p427o0OoOO00.o0OOO0o;
import p572o0oOoOO0.oO000O0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OOO extends oO000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f50129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O f50130OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ WebView f50131OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Color> f50132OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f50133OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.BaseWebViewKt$BaseWebView$3$2$1$1$2$1$memberRankToRoom$1", f = "BaseWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f50134OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f50135OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oOOO0OOO f50136OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50137OooO0oO;

        /* JADX INFO: renamed from: o0o00ooo.oOOO0OOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0491OooO00o extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f50138OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ String f50139OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0491OooO00o(String str, Function0 function0) {
                super(0);
                this.f50138OooO0Oo = function0;
                this.f50139OooO0o0 = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                this.f50138OooO0Oo.invoke();
                String str = this.f50139OooO0o0;
                if (str != null) {
                    long jOooO = o0OoOo0.OooO(0L, str);
                    MutableState mutableState = o0OOO0o.f45698OooO00o;
                    o0OOO0o.OooO0o0(jOooO, null);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, oOOO0OOO oooo0ooo, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50134OooO0Oo = str;
            this.f50136OooO0o0 = oooo0ooo;
            this.f50135OooO0o = lifecycleOwner;
            this.f50137OooO0oO = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50134OooO0Oo, this.f50136OooO0o0, this.f50135OooO0o, this.f50137OooO0oO, continuation);
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
            String str = this.f50134OooO0Oo;
            long jOooO = str != null ? o0OoOo0.OooO(0L, str) : 0L;
            Long value = OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
            if (value != null && jOooO == value.longValue()) {
                this.f50136OooO0o0.showToastMsg(o0000.OooO0OO(oO00OOo0.you_are_already_in_the_room));
            } else {
                Object obj2 = this.f50135OooO0o;
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null) {
                    o0OO00O o0oo00o2 = new o0OO00O(activity);
                    o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.live_room_member_rank_jump_to_the_room));
                    o0oo00o2.OooOo(true);
                    o0oo00o2.OooOo0(new C0491OooO00o(str, this.f50137OooO0oO));
                    o0oo00o2.OooOO0o();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public oOOO0OOO(Function0<Unit> function0, o00O o00o2, WebView webView, MutableState<Color> mutableState, LifecycleOwner lifecycleOwner) {
        this.f50129OooO00o = function0;
        this.f50130OooO0O0 = o00o2;
        this.f50131OooO0OO = webView;
        this.f50132OooO0Oo = mutableState;
        this.f50133OooO0o0 = lifecycleOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void goBackLastPage() {
        o00O o00o2 = this.f50130OooO0O0;
        if (((Boolean) o00o2.f38696OooO0OO.getValue()).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(o00o2.f38694OooO00o, null, null, new o00OO000(o00o2, null), 3, null);
        } else {
            this.f50129OooO00o.invoke();
        }
    }

    @Deprecated(message = "使用 roomPage")
    @JavascriptInterface
    public final void memberRankToRoom(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(str, this, this.f50133OooO0o0, this.f50129OooO00o, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO000O0
    public final void onClosePage() {
        this.f50129OooO00o.invoke();
    }

    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void refreshUrl() {
        this.f50131OooO0OO.reload();
    }

    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void webBgColor(@Nullable String str) {
        Color colorOooO00o;
        super.webBgColor(str);
        this.f50132OooO0Oo.setValue(Color.m1660boximpl((str == null || (colorOooO00o = OooO0o.OooO00o(str)) == null) ? Color.INSTANCE.m1705getTransparent0d7_KjU() : colorOooO00o.m1680unboximpl()));
    }
}
