package p496o0o00o;

import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.camera.core.impl.OooOOOO;
import androidx.camera.core.impl.o00OOO00;
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
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49084OooO0oO;

    public o0O0oo00(UserInfoActivity userInfoActivity) {
        this.f49084OooO0oO = userInfoActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoActivity userInfoActivity = this.f49084OooO0oO;
        String str = userInfoActivity.f27245OooOo0O;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (!o00OOO00.OooO0O0(str) || userInfoActivity.f27246OooOo0o == null) {
            return;
        }
        o0OO000.OooO00o("105070");
        UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        if (userInfoModel.isPremium()) {
            UserInfoModel userInfoModel2 = userInfoActivity.f27246OooOo0o;
            Intrinsics.checkNotNull(userInfoModel2);
            if (userInfoModel2.getPremiumLevel() >= PremiumLevel.Premium4.getValue()) {
                ArrayList arrayList = new ArrayList();
                UserInfoModel userInfoModel3 = userInfoActivity.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel3);
                if (OooOo00.OooO0O0(userInfoModel3.getBackground())) {
                    ImageSpan imageSpan = new ImageSpan(userInfoActivity, oOo00OO0.icon_userinfo_vip_change_bp);
                    SpannableString spannableString = new SpannableString(OooOOOO.OooO00o(o0000.OooO0OO(oO00OOo0.Userinfo_upload_photo), "  "));
                    spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
                    SelectDialogModel selectDialogModel = new SelectDialogModel();
                    selectDialogModel.setContent(spannableString);
                    arrayList.add(selectDialogModel);
                    SelectDialogModel selectDialogModel2 = new SelectDialogModel();
                    selectDialogModel2.setContent(o0000.OooO0OO(oO00OOo0.Userinfo_default_cover));
                    arrayList.add(selectDialogModel2);
                } else {
                    ImageSpan imageSpan2 = new ImageSpan(userInfoActivity, oOo00OO0.icon_userinfo_vip_change_bp);
                    SpannableString spannableString2 = new SpannableString(OooOOOO.OooO00o(o0000.OooO0OO(oO00OOo0.Userinfo_upload_photo), "  "));
                    spannableString2.setSpan(imageSpan2, spannableString2.length() - 1, spannableString2.length(), 33);
                    SelectDialogModel selectDialogModel3 = new SelectDialogModel();
                    selectDialogModel3.setContent(spannableString2);
                    arrayList.add(selectDialogModel3);
                }
                Intrinsics.checkNotNull(userInfoActivity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
                userInfoActivity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(209435593, true, new o0OOooO0(arrayList, userInfoActivity)));
                return;
            }
        }
        o0OO00O o0oo00o2 = new o0OO00O(userInfoActivity);
        o0oo00o2.OooOOoo(oO00OOo0.change_cover_not_vip_tip);
        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
        o0oo00o2.OooOo0(new Oooo000(o0oo00o2, userInfoActivity));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOO0o();
    }
}
