package p506o0o00oOo;

import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.Oooo000;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50528OooO0oO;

    public oOO0O0O0(UserInfoActivity userInfoActivity) {
        this.f50528OooO0oO = userInfoActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity userInfoActivity = this.f50528OooO0oO;
        String str = userInfoActivity.f26780OooOo0O;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (!oOOO0O0o.OooO00o(str) || userInfoActivity.f26781OooOo0o == null) {
            return;
        }
        OooO00o.OooO0O0("105070");
        UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        if (userInfoModel.isPremium()) {
            UserInfoModel userInfoModel2 = userInfoActivity.f26781OooOo0o;
            Intrinsics.checkNotNull(userInfoModel2);
            if (userInfoModel2.getPremiumLevel() >= PremiumLevel.Premium4.getValue()) {
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel3 = userInfoActivity.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel3);
                if (OooOo00.OooO0O0(userInfoModel3.getBackground())) {
                    ImageSpan imageSpan = new ImageSpan(userInfoActivity, o0Oo0oo.icon_userinfo_vip_change_bp);
                    SpannableString spannableString = new SpannableString(OooOOOO.OooO00o(o0000.OooO0OO(o000000.Userinfo_upload_photo), "  "));
                    spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
                    SelectDialogModel selectDialogModel = new SelectDialogModel();
                    selectDialogModel.setContent(spannableString);
                    arrayList.add(selectDialogModel);
                    SelectDialogModel selectDialogModel2 = new SelectDialogModel();
                    selectDialogModel2.setContent(o0000.OooO0OO(o000000.Userinfo_default_cover));
                    arrayList.add(selectDialogModel2);
                } else {
                    ImageSpan imageSpan2 = new ImageSpan(userInfoActivity, o0Oo0oo.icon_userinfo_vip_change_bp);
                    SpannableString spannableString2 = new SpannableString(OooOOOO.OooO00o(o0000.OooO0OO(o000000.Userinfo_upload_photo), "  "));
                    spannableString2.setSpan(imageSpan2, spannableString2.length() - 1, spannableString2.length(), 33);
                    SelectDialogModel selectDialogModel3 = new SelectDialogModel();
                    selectDialogModel3.setContent(spannableString2);
                    arrayList.add(selectDialogModel3);
                }
                Intrinsics.checkNotNull(userInfoActivity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
                userInfoActivity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(209435593, true, new oOOO00(arrayList, userInfoActivity)));
                return;
            }
        }
        o000O o000o = new o000O(userInfoActivity);
        o000o.OooOOoo(o000000.change_cover_not_vip_tip);
        o000o.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
        o000o.OooOo0(new Oooo000(o000o, userInfoActivity));
        o000o.OooOo(true);
        o000o.OooOO0o();
    }
}
