package p623o0oo0oO0;

import com.code.android.util.ToastUtil;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O implements YCSDKCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<BaseResp, Unit> f48628OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000O(Function1<? super BaseResp, Unit> function1) {
        this.f48628OooO00o = function1;
    }

    @Override // com.yallatech.support.platform.callback.YCSDKCallback
    public final void onResult(@NotNull BaseResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        o00O00.OooO0O0("YallaChatSDK toGroupCreateisSuccess = " + result.isSuccess() + "code = " + result.getCode() + " message = " + result.getMsg());
        this.f48628OooO00o.invoke(result);
        if (result.isSuccess() || !o00O0.OooO0o0(result.getMsg())) {
            return;
        }
        ToastUtil.f12567OooO00o.OooO0O0(result.getMsg());
    }
}
