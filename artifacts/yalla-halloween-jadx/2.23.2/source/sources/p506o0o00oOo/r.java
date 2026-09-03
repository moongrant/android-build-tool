package p506o0o00oOo;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O0o;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50587OooO0oO;

    public r(UserInfoEditActivity userInfoEditActivity) {
        this.f50587OooO0oO = userInfoEditActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f50587OooO0oO;
        userInfoEditActivity.OooOoo();
        ArrayList<SelectDialogModel<String>> arrayList = userInfoEditActivity.f26838Oooo0o;
        arrayList.clear();
        SelectDialogModel<String> selectDialogModel = new SelectDialogModel<>();
        int i = o000000.user_info_header_change_header;
        selectDialogModel.setContent(1, userInfoEditActivity.getString(i));
        arrayList.add(selectDialogModel);
        SelectDialogModel<String> selectDialogModel2 = new SelectDialogModel<>();
        int i2 = o000000.user_info_header_url_change_type_default_url;
        selectDialogModel2.setContent(3, userInfoEditActivity.getString(i2));
        arrayList.add(selectDialogModel2);
        o000O0o o000o0o2 = new o000O0o(userInfoEditActivity, null);
        o000o0o2.OooOOO0(o0000.OooO0OO(i));
        o000o0o2.OooOOO0(o0000.OooO0OO(i2));
        o000o0o2.OooOOOo(new f0(userInfoEditActivity));
        o000o0o2.OooOO0o();
    }
}
