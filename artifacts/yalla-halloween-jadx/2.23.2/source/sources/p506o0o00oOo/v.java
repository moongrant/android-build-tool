package p506o0o00oOo;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50594OooO0oO;

    public v(UserInfoEditActivity userInfoEditActivity) {
        this.f50594OooO0oO = userInfoEditActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f50594OooO0oO;
        userInfoEditActivity.OooOoo();
        ArrayList arrayList = new ArrayList();
        SelectDialogModel content = new SelectDialogModel().setSelect(false).setContent(1, userInfoEditActivity.getString(o000000.male));
        Intrinsics.checkNotNull(content, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
        arrayList.add(content);
        SelectDialogModel content2 = new SelectDialogModel().setSelect(false).setContent(0, userInfoEditActivity.getString(o000000.female));
        Intrinsics.checkNotNull(content2, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
        arrayList.add(content2);
        SelectDialogModel content3 = new SelectDialogModel().setSelect(false).setContent(2, userInfoEditActivity.getString(o000000.sex));
        Intrinsics.checkNotNull(content3, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
        arrayList.add(content3);
        Intrinsics.checkNotNull(userInfoEditActivity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        userInfoEditActivity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1329306182, true, new d(arrayList, userInfoEditActivity)));
    }
}
