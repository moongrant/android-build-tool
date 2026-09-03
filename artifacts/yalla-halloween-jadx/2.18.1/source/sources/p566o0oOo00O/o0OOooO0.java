package p566o0oOo00O;

import android.view.View;
import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00O0000;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOooO0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45335Oooo;

    public o0OOooO0(UserInfoEditActivity userInfoEditActivity) {
        this.f45335Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f45335Oooo.Oooo00o();
        UserInfoEditActivity userInfoEditActivity = this.f45335Oooo;
        Objects.requireNonNull(userInfoEditActivity);
        ArrayList arrayList = new ArrayList();
        SelectDialogModel content = new SelectDialogModel().setSelect(false).setContent(1, userInfoEditActivity.getString(R.string.male));
        Intrinsics.checkNotNull(content, "null cannot be cast to non-null type com.app.base.dialog.baseDialog.SelectDialogModel<kotlin.String>");
        arrayList.add(content);
        SelectDialogModel content2 = new SelectDialogModel().setSelect(false).setContent(0, userInfoEditActivity.getString(R.string.female));
        Intrinsics.checkNotNull(content2, "null cannot be cast to non-null type com.app.base.dialog.baseDialog.SelectDialogModel<kotlin.String>");
        arrayList.add(content2);
        SelectDialogModel content3 = new SelectDialogModel().setSelect(false).setContent(2, userInfoEditActivity.getString(R.string.sex));
        Intrinsics.checkNotNull(content3, "null cannot be cast to non-null type com.app.base.dialog.baseDialog.SelectDialogModel<kotlin.String>");
        arrayList.add(content3);
        Intrinsics.checkNotNull(userInfoEditActivity, "null cannot be cast to non-null type com.app.base.base.activity.IComposeDialog");
        userInfoEditActivity.showDialog((String) null, o00O0000.OooO0O0(1329306182, true, new o0O0o0(arrayList, userInfoEditActivity)));
    }
}
