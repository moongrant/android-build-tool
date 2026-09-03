package p526o0o0OO0O;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 implements FacebookCallback<Sharer.Result> {
    @Override // com.facebook.FacebookCallback
    public final void onCancel() {
        p598o0oo00Oo.o0000O00.OooO0O0("Share FaceBook onCancel");
    }

    @Override // com.facebook.FacebookCallback
    public final void onError(@NotNull FacebookException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        p598o0oo00Oo.o0000O00.OooO0O0("Share FaceBook onError :" + error);
        String strOooO0OO = o0000.OooO0OO(o000000.Share_Failed_to_share);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
    }

    @Override // com.facebook.FacebookCallback
    public final void onSuccess(Sharer.Result result) {
        Sharer.Result result2 = result;
        Intrinsics.checkNotNullParameter(result2, "result");
        p598o0oo00Oo.o0000O00.OooO0O0("Share FaceBook onSuccess :" + result2);
        String strOooO0OO = o0000.OooO0OO(o000000.Share_Shared_successfully);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
        }
    }
}
