package p506o0o00oO0;

import com.code.android.util.ToastUtil;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0O0 implements FacebookCallback<Sharer.Result> {
    @Override // com.facebook.FacebookCallback
    public final void onCancel() {
        o00O00.OooO0O0("Share FaceBook onCancel");
    }

    @Override // com.facebook.FacebookCallback
    public final void onError(@NotNull FacebookException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        o00O00.OooO0O0("Share FaceBook onError :" + error);
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Share_Failed_to_share));
    }

    @Override // com.facebook.FacebookCallback
    public final void onSuccess(Sharer.Result result) {
        Sharer.Result result2 = result;
        Intrinsics.checkNotNullParameter(result2, "result");
        o00O00.OooO0O0("Share FaceBook onSuccess :" + result2);
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Share_Shared_successfully));
    }
}
