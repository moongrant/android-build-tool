package p614o0oo0o;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p423o0OoO0OO.o00O00OO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 implements YCSDKCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f57524OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o00Oo0(Function1<? super BaseResp, Unit> function1) {
        this.f57524OooO00o = function1;
    }

    @Override // com.yallatech.support.platform.callback.YCSDKCallback
    public final void onResult(@NotNull BaseResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        o0000O00.OooO0O0("YallaChatSDK toGroupCreateisSuccess = " + result.isSuccess() + "code = " + result.getCode() + " message = " + result.getMsg());
        this.f57524OooO00o.invoke(result);
        if (result.isSuccess() || !o00O00OO.OooO0o(result.getMsg())) {
            return;
        }
        String msg = result.getMsg();
        if (msg == null || StringsKt.isBlank(msg)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(msg, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
    }
}
