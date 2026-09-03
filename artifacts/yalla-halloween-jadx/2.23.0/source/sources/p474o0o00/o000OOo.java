package p474o0o00;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.jvm.internal.Intrinsics;
import p417o0OoO0.o000O0o;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo implements Observer<Response<AccountConfirmInfo>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f47253OooO0Oo;

    public o000OOo(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        this.f47253OooO0Oo = deleteAccountSubmitActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<AccountConfirmInfo> response) {
        Response<AccountConfirmInfo> response2 = response;
        boolean isSuccess = response2.getIsSuccess();
        DeleteAccountSubmitActivity deleteAccountSubmitActivity = this.f47253OooO0Oo;
        if (isSuccess && response2.getData() != null) {
            AccountConfirmInfo data = response2.getData();
            Intrinsics.checkNotNull(data);
            AccountConfirmInfo accountConfirmInfo = data;
            int i = DeleteAccountSubmitActivity.f25179OooOo0;
            deleteAccountSubmitActivity.getClass();
            if (accountConfirmInfo.getFriendsNum() > 0) {
                deleteAccountSubmitActivity.OooOo().f59020OooOOOO.setText(String.valueOf(accountConfirmInfo.getFriendsNum()));
            } else {
                LinearLayout linearLayout = deleteAccountSubmitActivity.OooOo().f59011OooO0o;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llFriends");
                o000OO00.OooO0O0(linearLayout);
            }
            if (accountConfirmInfo.getFansNum() > 0) {
                deleteAccountSubmitActivity.OooOo().f59018OooOOO.setText(String.valueOf(accountConfirmInfo.getFansNum()));
            } else {
                LinearLayout linearLayout2 = deleteAccountSubmitActivity.OooOo().f59012OooO0o0;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llFans");
                o000OO00.OooO0O0(linearLayout2);
            }
            if (accountConfirmInfo.getUserLevel() > 0) {
                deleteAccountSubmitActivity.OooOo().f59021OooOOOo.setText(String.valueOf(accountConfirmInfo.getUserLevel()));
            } else {
                LinearLayout linearLayout3 = deleteAccountSubmitActivity.OooOo().f59013OooO0oO;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llLevel");
                o000OO00.OooO0O0(linearLayout3);
            }
            if (accountConfirmInfo.getCoinNum() > 0) {
                deleteAccountSubmitActivity.OooOo().f59015OooOO0.setText(OooOOOO.OooO0Oo(String.valueOf(accountConfirmInfo.getCoinNum())));
            } else {
                LinearLayout linearLayout4 = deleteAccountSubmitActivity.OooOo().f59009OooO0OO;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "binding.llCoin");
                o000OO00.OooO0O0(linearLayout4);
            }
            if (accountConfirmInfo.getCrystalNum() > 0) {
                deleteAccountSubmitActivity.OooOo().f59017OooOO0o.setText(OooOOOO.OooO0Oo(String.valueOf(accountConfirmInfo.getCrystalNum())));
            } else {
                LinearLayout linearLayout5 = deleteAccountSubmitActivity.OooOo().f59010OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "binding.llCrystal");
                o000OO00.OooO0O0(linearLayout5);
            }
            if (accountConfirmInfo.getMedalNum() > 0) {
                deleteAccountSubmitActivity.OooOo().f59014OooO0oo.setText(String.valueOf(accountConfirmInfo.getMedalNum()));
            } else {
                LinearLayout linearLayout6 = deleteAccountSubmitActivity.OooOo().f59008OooO0O0;
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "binding.llBadge");
                o000OO00.OooO0O0(linearLayout6);
            }
            TextView loadConfirmInfo$lambda$1 = deleteAccountSubmitActivity.OooOo().f59019OooOOO0;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String strValueOf = String.valueOf(o000000O.OooOOoo().getValue());
            loadConfirmInfo$lambda$1.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.delete_your_account_prompt_content4), strValueOf));
            Intrinsics.checkNotNullExpressionValue(loadConfirmInfo$lambda$1, "loadConfirmInfo$lambda$1");
            o000O0o.OooO0Oo(loadConfirmInfo$lambda$1, o0000.OooO00o(oO00O0o.app_color_), strValueOf);
        }
        deleteAccountSubmitActivity.OooOo0();
    }
}
