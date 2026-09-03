package p566o0oOo00O;

import android.view.View;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.o00O0;
import p255o00ooO0o.o00O00o0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00OO extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45323Oooo;

    public o0OO00OO(UserInfoEditActivity userInfoEditActivity) {
        this.f45323Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f45323Oooo.Oooo00o();
        UserInfoEditActivity userInfoEditActivity = this.f45323Oooo;
        ArrayList<SelectDialogModel<String>> arrayList = userInfoEditActivity.f23512o0ooOO0;
        arrayList.clear();
        SelectDialogModel<String> selectDialogModel = new SelectDialogModel<>();
        selectDialogModel.setContent(1, userInfoEditActivity.getString(R.string.user_info_header_change_header));
        arrayList.add(selectDialogModel);
        SelectDialogModel<String> selectDialogModel2 = new SelectDialogModel<>();
        selectDialogModel2.setContent(3, userInfoEditActivity.getString(R.string.user_info_header_url_change_type_default_url));
        arrayList.add(selectDialogModel2);
        o00O0 o00o1 = new o00O0(userInfoEditActivity);
        o00o1.OooOOO(OooOOO.OooO0OO(R.string.user_info_header_change_header));
        o00o1.OooOOO(OooOOO.OooO0OO(R.string.user_info_header_url_change_type_default_url));
        o0OOOO0o onItemClick = new o0OOOO0o(userInfoEditActivity);
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        o00o1.f34358OooO.setOnItemClickListener(new o00O00o0(o00o1, onItemClick));
        o00o1.OooOOO0();
    }
}
