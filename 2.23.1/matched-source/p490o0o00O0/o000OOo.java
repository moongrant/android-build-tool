package p490o0o00O0;

import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p425o0OoO0OO.o00O0O0;
import p474o0OoooOO.oo0oO0;
import p513o0o0O.OooOOO;
import p565o0oOo000.o0ooOOo;
import p575o0oOoOO.o0OOOO0o;
import p595o0oo0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000OOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f48773OooO0o0;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f48772OooO0Oo = i;
        this.f48773OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f48772OooO0Oo;
        boolean z = true;
        Object obj2 = this.f48773OooO0o0;
        switch (i) {
            case 0:
                DeleteAccountSubmitActivity this$0 = (DeleteAccountSubmitActivity) obj2;
                Response response = (Response) obj;
                int i2 = DeleteAccountSubmitActivity.f24727OooOo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (response.getIsSuccess() && response.getData() != null) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    AccountConfirmInfo accountConfirmInfo = (AccountConfirmInfo) data;
                    this$0.getClass();
                    if (accountConfirmInfo.getFriendsNum() > 0) {
                        this$0.OooOo().f44247OooOOOO.setText(String.valueOf(accountConfirmInfo.getFriendsNum()));
                    } else {
                        LinearLayout llFriends = this$0.OooOo().f44238OooO0o;
                        Intrinsics.checkNotNullExpressionValue(llFriends, "llFriends");
                        o000O.OooO0O0(llFriends);
                    }
                    if (accountConfirmInfo.getFansNum() > 0) {
                        this$0.OooOo().f44245OooOOO.setText(String.valueOf(accountConfirmInfo.getFansNum()));
                    } else {
                        LinearLayout llFans = this$0.OooOo().f44239OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(llFans, "llFans");
                        o000O.OooO0O0(llFans);
                    }
                    if (accountConfirmInfo.getUserLevel() > 0) {
                        this$0.OooOo().f44248OooOOOo.setText(String.valueOf(accountConfirmInfo.getUserLevel()));
                    } else {
                        LinearLayout llLevel = this$0.OooOo().f44240OooO0oO;
                        Intrinsics.checkNotNullExpressionValue(llLevel, "llLevel");
                        o000O.OooO0O0(llLevel);
                    }
                    if (accountConfirmInfo.getCoinNum() > 0) {
                        this$0.OooOo().f44242OooOO0.setText(OooOo00.OooO0Oo(String.valueOf(accountConfirmInfo.getCoinNum())));
                    } else {
                        LinearLayout llCoin = this$0.OooOo().f44236OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(llCoin, "llCoin");
                        o000O.OooO0O0(llCoin);
                    }
                    if (accountConfirmInfo.getCrystalNum() > 0) {
                        this$0.OooOo().f44244OooOO0o.setText(OooOo00.OooO0Oo(String.valueOf(accountConfirmInfo.getCrystalNum())));
                    } else {
                        LinearLayout llCrystal = this$0.OooOo().f44237OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(llCrystal, "llCrystal");
                        o000O.OooO0O0(llCrystal);
                    }
                    if (accountConfirmInfo.getMedalNum() > 0) {
                        this$0.OooOo().f44241OooO0oo.setText(String.valueOf(accountConfirmInfo.getMedalNum()));
                    } else {
                        LinearLayout llBadge = this$0.OooOo().f44235OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(llBadge, "llBadge");
                        o000O.OooO0O0(llBadge);
                    }
                    TextView textView = this$0.OooOo().f44246OooOOO0;
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    String strValueOf = String.valueOf(oo0oO0.OooOOoo().getValue());
                    textView.setText(o0000O.OooO00o(o0000.OooO0OO(p565o0oOo000.o000OOo.delete_your_account_prompt_content4), strValueOf));
                    Intrinsics.checkNotNull(textView);
                    o00O0O0.OooO0Oo(textView, o0000.OooO00o(o0ooOOo.app_color_), strValueOf);
                }
                this$0.OooOo0();
                break;
            case 1:
                OooOOO oooOOO = (OooOOO) obj2;
                int i3 = OooOOO.f50919OooOo0;
                oooOOO.getClass();
                if (((Boolean) obj).booleanValue()) {
                    String strOooO0OO = o0000.OooO0OO(p565o0oOo000.o000OOo.Success);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                }
                oooOOO.OooO0oo(0);
                break;
            default:
                BaseWebView this$1 = (BaseWebView) obj2;
                String str = (String) obj;
                int i4 = BaseWebView.f30849OooOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (!z) {
                    o0OOOO0o.OooO0O0(this$1, str);
                } else {
                    o0OOOO0o.OooO0O0(this$1, null);
                }
                break;
        }
    }
}
