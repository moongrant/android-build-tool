package p602o0oo0O0O;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
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
import p157o00OoOO0.o0OO00O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000OOo;
import p579o0oOoo.oO000O0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.util.yallachat.YallaChatSdk$Companion$doOnInstalled$2", f = "YallaChatSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f56874OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OO00O o0oo00o2) {
            super(0);
            this.f56874OooO0Oo = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String strOooO0o0;
            o0OO000.OooO00o("103003");
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaChatDownUrl);
            o0OO00O o0oo00o2 = this.f56874OooO0Oo;
            if (oO000O0O.OooO00o(o0oo00o2.f10133OooO00o, "com.android.vending")) {
                o000OOo o000oooOooO0o = o00Oo0.OooO0o();
                o000oooOooO0o.getClass();
                strOooO0o0 = o000oooOooO0o.OooO0o0(String.valueOf(-1003119012), "");
            } else {
                o000OOo o000oooOooO0o2 = o00Oo0.OooO0o();
                o000oooOooO0o2.getClass();
                strOooO0o0 = o000oooOooO0o2.OooO0o0(String.valueOf(-1170565566), "");
            }
            webPageInfo.OooO0o0(strOooO0o0);
            webPageInfo.OooO00o("region", String.valueOf(OooO.OooO0OO()));
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(o0oo00o2.f10133OooO00o, webPageInfo);
            return Unit.INSTANCE;
        }
    }

    public o0000O0O(Continuation<? super o0000O0O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O0O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0000O0O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0OO000.OooO00o("303001");
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.main_task_yalla_chat_content));
            o0oo00o2.OooOOOO(oO00OOo0.Install);
            o0oo00o2.OooOo0(new OooO00o(o0oo00o2));
            o0oo00o2.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
