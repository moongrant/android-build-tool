package p566o0oOo00O;

import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00O0000;
import p142o00OOooO.o0000O;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45181Oooo;

    public o0(UserInfoActivity userInfoActivity) {
        this.f45181Oooo = userInfoActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!o0000O.OooO00o(OooOOO.f41216OooO00o, this.f45181Oooo.f23456OooooO0) || this.f45181Oooo.f23457OooooOO == null) {
            return;
        }
        o0O00000.OooO0OO("Me_profile_background");
        UserInfoModel userInfoModel = this.f45181Oooo.f23457OooooOO;
        Intrinsics.checkNotNull(userInfoModel);
        if (userInfoModel.isPremium()) {
            UserInfoModel userInfoModel2 = this.f45181Oooo.f23457OooooOO;
            Intrinsics.checkNotNull(userInfoModel2);
            if (userInfoModel2.getPremiumLevel() >= PremiumLevel.Premium4.getValue()) {
                UserInfoActivity userInfoActivity = this.f45181Oooo;
                Objects.requireNonNull(userInfoActivity);
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel3 = userInfoActivity.f23457OooooOO;
                Intrinsics.checkNotNull(userInfoModel3);
                if (OooO0OO.OooO0O0(userInfoModel3.getBackground())) {
                    ImageSpan imageSpan = new ImageSpan(userInfoActivity, R.drawable.icon_userinfo_vip_change_bp);
                    SpannableString spannableString = new SpannableString(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Userinfo_upload_photo) + "  ");
                    spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
                    SelectDialogModel selectDialogModel = new SelectDialogModel();
                    selectDialogModel.setContent(spannableString);
                    arrayList.add(selectDialogModel);
                    SelectDialogModel selectDialogModel2 = new SelectDialogModel();
                    selectDialogModel2.setContent(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Userinfo_default_cover));
                    arrayList.add(selectDialogModel2);
                } else {
                    ImageSpan imageSpan2 = new ImageSpan(userInfoActivity, R.drawable.icon_userinfo_vip_change_bp);
                    SpannableString spannableString2 = new SpannableString(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Userinfo_upload_photo) + "  ");
                    spannableString2.setSpan(imageSpan2, spannableString2.length() - 1, spannableString2.length(), 33);
                    SelectDialogModel selectDialogModel3 = new SelectDialogModel();
                    selectDialogModel3.setContent(spannableString2);
                    arrayList.add(selectDialogModel3);
                }
                Intrinsics.checkNotNull(userInfoActivity, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
                userInfoActivity.showDialog((String) null, o00O0000.OooO0O0(209435593, true, new o0O00O0o(arrayList, userInfoActivity)));
                return;
            }
        }
        UserInfoActivity userInfoActivity2 = this.f45181Oooo;
        oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoActivity2);
        oo0ooo0.OooOo0(R.string.change_cover_not_vip_tip);
        oo0ooo0.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
        oo0ooo0.OooOo0o(new o0O0O0Oo(oo0ooo0, userInfoActivity2));
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOOO0();
    }
}
