package p648o0ooo;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O implements FacebookCallback<Sharer.Result> {
    @Override // com.facebook.FacebookCallback
    public final void onCancel() {
        OooOOO0.OooO0O0("Share FaceBook onCancel");
    }

    @Override // com.facebook.FacebookCallback
    public final void onError(@NotNull FacebookException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        OooOOO0.OooO0O0("Share FaceBook onError :" + error);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Share_Failed_to_share);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }

    @Override // com.facebook.FacebookCallback
    public final void onSuccess(Sharer.Result result) {
        Sharer.Result result2 = result;
        Intrinsics.checkNotNullParameter(result2, "result");
        OooOOO0.OooO0O0("Share FaceBook onSuccess :" + result2);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Share_Shared_successfully);
        if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }
}
