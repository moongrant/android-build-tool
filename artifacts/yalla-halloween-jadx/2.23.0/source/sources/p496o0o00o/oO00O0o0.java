package p496o0o00o;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o00O0O;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49139OooO0oO;

    public oO00O0o0(UserInfoEditActivity userInfoEditActivity) {
        this.f49139OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f49139OooO0oO;
        userInfoEditActivity.OooOoo();
        ArrayList<SelectDialogModel<String>> arrayList = userInfoEditActivity.f27303Oooo0o;
        arrayList.clear();
        SelectDialogModel<String> selectDialogModel = new SelectDialogModel<>();
        int i = oO00OOo0.user_info_header_change_header;
        selectDialogModel.setContent(1, userInfoEditActivity.getString(i));
        arrayList.add(selectDialogModel);
        SelectDialogModel<String> selectDialogModel2 = new SelectDialogModel<>();
        int i2 = oO00OOo0.user_info_header_url_change_type_default_url;
        selectDialogModel2.setContent(3, userInfoEditActivity.getString(i2));
        arrayList.add(selectDialogModel2);
        o00O0O o00o0o2 = new o00O0O(userInfoEditActivity, null);
        o00o0o2.OooOOO0(o0000.OooO0OO(i));
        o00o0o2.OooOOO0(o0000.OooO0OO(i2));
        o00o0o2.OooOOOo(new oO00o00O(userInfoEditActivity));
        o00o0o2.OooOO0o();
    }
}
