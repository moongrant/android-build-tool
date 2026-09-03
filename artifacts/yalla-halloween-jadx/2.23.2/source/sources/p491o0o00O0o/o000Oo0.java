package p491o0o00O0o;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p525o0o0OO0.o0o0Oo;
import p562o0oOo000.o000000;
import p576o0oOoOOo.oOO00O0;
import p590o0oOooo0.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48967OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f48966OooO0Oo = i;
        this.f48967OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48966OooO0Oo;
        boolean z = true;
        Object obj2 = this.f48967OooO0o0;
        switch (i) {
            case 0:
                DeleteAccountSubmitActivity this$0 = (DeleteAccountSubmitActivity) obj2;
                Response response = (Response) obj;
                int i2 = DeleteAccountSubmitActivity.f24720OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess() && response.getData() != null && Intrinsics.areEqual(response.getData(), "1")) {
                    String strOooO0OO = o0000.OooO0OO(o000000.account_delete_account_success);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    O0000000.OooO0O0(this$0);
                }
                this$0.OooOo0();
                break;
            case 1:
                o0o0Oo o0o0oo = (o0o0Oo) obj2;
                int i3 = o0o0Oo.f53251OooOo0;
                o0o0oo.getClass();
                if (((Boolean) obj).booleanValue()) {
                    String strOooO0OO2 = o0000.OooO0OO(o000000.Success);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                }
                o0o0oo.OooO0oo(0);
                break;
            default:
                BaseWebView this$1 = (BaseWebView) obj2;
                String str = (String) obj;
                int i4 = BaseWebView.f30843OooOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    oOO00O0.OooO0O0(this$1, str);
                } else {
                    oOO00O0.OooO0O0(this$1, null);
                }
                break;
        }
    }
}
