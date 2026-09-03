package p614o0oo0o;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p414o0Oo0oO.oO000Oo0;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO0O000;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.util.yallachat.YallaChatSdk$Companion$doOnInstalled$2", f = "YallaChatSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O f57511OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O o000o) {
            super(0);
            this.f57511OooO0Oo = o000o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String strOooO0o0;
            o0oo0000.OooO00o.OooO0O0("103003");
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaChatDownUrl);
            o000O o000o = this.f57511OooO0Oo;
            if (oOO0O000.OooO0O0(o000o.f38487OooO00o, "com.android.vending")) {
                oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
                oo000oo0OooO0o.getClass();
                strOooO0o0 = oo000oo0OooO0o.OooO0o0(String.valueOf(-1003119012), "");
            } else {
                oO000Oo0 oo000oo0OooO0o2 = o00Ooo.OooO0o();
                oo000oo0OooO0o2.getClass();
                strOooO0o0 = oo000oo0OooO0o2.OooO0o0(String.valueOf(-1170565566), "");
            }
            webPageInfo.OooO0o0(strOooO0o0);
            webPageInfo.OooO00o("region", String.valueOf(OooOo00.OooO0OO()));
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(o000o.f38487OooO00o, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public Oooo0(Continuation<? super Oooo0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new Oooo0(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0oo0000.OooO00o.OooO0O0("303001");
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o000O o000o = new o000O(activityOooO0O0);
            o000o.OooOo(true);
            o000o.OooOo00(o0000.OooO0OO(o000000.main_task_yalla_chat_content));
            o000o.OooOOOO(o000000.Install);
            o000o.OooOo0(new OooO00o(o000o));
            o000o.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
