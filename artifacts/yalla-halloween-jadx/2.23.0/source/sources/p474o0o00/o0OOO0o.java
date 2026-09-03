package p474o0o00;

import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o implements Observer<Response<String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f47333OooO0Oo;

    public o0OOO0o(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        this.f47333OooO0Oo = deleteAccountCheckActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<String> response) {
        Response<String> response2 = response;
        DeleteAccountCheckActivity activity = this.f47333OooO0Oo;
        activity.OooOo0();
        boolean z = true;
        if (!response2.getIsSuccess() || !Intrinsics.areEqual(response2.getData(), "1")) {
            String string = activity.getResources().getString(oO00OOo0.account_averification_failed);
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        String string2 = activity.getResources().getString(oO00OOo0.account_verification_success);
        if (string2 != null && !StringsKt.isBlank(string2)) {
            z = false;
        }
        if (!z) {
            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(string2, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o2.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
            }
        }
        DeleteAccountParamsModel deleteAccountParamsModel = (DeleteAccountParamsModel) activity.getIntent().getParcelableExtra("DELETE_REASON_TYPE");
        int i = DeleteAccountSubmitActivity.f25179OooOo0;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) DeleteAccountSubmitActivity.class);
        intent.putExtra("DELETE_REASON_TYPE", deleteAccountParamsModel);
        activity.startActivity(intent);
        activity.finish();
    }
}
