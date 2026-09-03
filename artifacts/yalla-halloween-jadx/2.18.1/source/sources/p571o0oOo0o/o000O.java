package p571o0oOo0o;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.lifecycle.LifecycleOwner;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
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
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p488o0o000oo.o0OO00O;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f45464OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ WebView f45465OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f45466OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.common.BaseWebViewKt$BaseWebView$4$1$1$1$1$memberRankToRoom$1", f = "BaseWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f45467Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f45468Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000O f45469Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f45470Oooo0oo;

        /* JADX INFO: renamed from: o0oOo0o.o000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0413OooO00o extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f45471Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ String f45472Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0413OooO00o(Function0<Unit> function0, String str) {
                super(0);
                this.f45471Oooo0o = function0;
                this.f45472Oooo0oO = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                this.f45471Oooo0o.invoke();
                String str = this.f45472Oooo0oO;
                if (str == null) {
                    return null;
                }
                RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, OooO.OooO0oO(str), (EnterRoomParentPage) null, 2, (Object) null);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, o000O o000o, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45468Oooo0o = str;
            this.f45469Oooo0oO = o000o;
            this.f45470Oooo0oo = lifecycleOwner;
            this.f45467Oooo = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45468Oooo0o, this.f45469Oooo0oO, this.f45470Oooo0oo, this.f45467Oooo, continuation);
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
            String str = this.f45468Oooo0o;
            long jOooO0oO = str != null ? OooO.OooO0oO(str) : 0L;
            Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
            if (value != null && jOooO0oO == value.longValue()) {
                this.f45469Oooo0oO.showToastMsg(o000O0O0.OooO0OO(R.string.you_are_already_in_the_room));
            } else {
                Object obj2 = this.f45470Oooo0oo;
                Activity activity = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity != null) {
                    Function0<Unit> function0 = this.f45467Oooo;
                    String str2 = this.f45468Oooo0o;
                    oo0oOO0 oo0ooo0 = new oo0oOO0(activity);
                    oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.live_room_member_rank_jump_to_the_room));
                    oo0ooo0.OooOoOO(true);
                    oo0ooo0.OooOo0o(new C0413OooO00o(function0, str2));
                    oo0ooo0.OooOOO0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public o000O(Function0<Unit> function0, WebView webView, LifecycleOwner lifecycleOwner) {
        this.f45464OooO00o = function0;
        this.f45465OooO0O0 = webView;
        this.f45466OooO0OO = lifecycleOwner;
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void closePage() {
        this.f45464OooO00o.invoke();
    }

    @JavascriptInterface
    public final void memberRankToRoom(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(str, this, this.f45466OooO0OO, this.f45464OooO00o, null), 3, null);
    }

    @Override // p488o0o000oo.o0OO00O
    @JavascriptInterface
    public void refreshUrl() {
        this.f45465OooO0O0.reload();
    }
}
