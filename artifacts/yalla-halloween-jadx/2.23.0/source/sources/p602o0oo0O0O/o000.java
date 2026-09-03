package p602o0oo0O0O;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p417o0OoO0.o0000O0O;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000 implements YCSDKCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f56871OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o000(Function1<? super BaseResp, Unit> function1) {
        this.f56871OooO00o = function1;
    }

    @Override // com.yallatech.support.platform.callback.YCSDKCallback
    public final void onResult(@NotNull BaseResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        OooOOO0.OooO0O0("YallaChatSDK toGroupCreateisSuccess = " + result.isSuccess() + "code = " + result.getCode() + " message = " + result.getMsg());
        this.f56871OooO00o.invoke(result);
        if (result.isSuccess() || !o0000O0O.OooO0o(result.getMsg())) {
            return;
        }
        String msg = result.getMsg();
        if (msg == null || StringsKt.isBlank(msg)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(msg, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }
}
