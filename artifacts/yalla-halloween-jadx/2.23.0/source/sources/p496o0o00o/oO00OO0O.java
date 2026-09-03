package p496o0o00o;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49141OooO0oO;

    public oO00OO0O(UserInfoEditActivity userInfoEditActivity) {
        this.f49141OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserInfoEditActivity userInfoEditActivity = this.f49141OooO0oO;
        userInfoEditActivity.OooOoo();
        ArrayList arrayList = new ArrayList();
        SelectDialogModel content = new SelectDialogModel().setSelect(false).setContent(1, userInfoEditActivity.getString(oO00OOo0.male));
        Intrinsics.checkNotNull(content, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
        arrayList.add(content);
        SelectDialogModel content2 = new SelectDialogModel().setSelect(false).setContent(0, userInfoEditActivity.getString(oO00OOo0.female));
        Intrinsics.checkNotNull(content2, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
        arrayList.add(content2);
        SelectDialogModel content3 = new SelectDialogModel().setSelect(false).setContent(2, userInfoEditActivity.getString(oO00OOo0.sex));
        Intrinsics.checkNotNull(content3, "null cannot be cast to non-null type com.yalla.yalla.model.SelectDialogModel<kotlin.String>");
        arrayList.add(content3);
        Intrinsics.checkNotNull(userInfoEditActivity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        userInfoEditActivity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1329306182, true, new oO0000o0(arrayList, userInfoEditActivity)));
    }
}
