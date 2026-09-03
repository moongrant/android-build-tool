package p474o0o00;

import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p579o0oOoo.oO00o0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O implements Observer<Response<String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f47328OooO0Oo;

    public o0OO00O(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        this.f47328OooO0Oo = deleteAccountSubmitActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<String> response) {
        Response<String> response2 = response;
        boolean isSuccess = response2.getIsSuccess();
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f47328OooO0Oo;
        if (isSuccess && response2.getData() != null && Intrinsics.areEqual(response2.getData(), "1")) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.account_delete_account_success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            oO00o0.OooO0O0(deleteAccountSubmitActivity);
        }
        deleteAccountSubmitActivity.OooOo0();
    }
}
