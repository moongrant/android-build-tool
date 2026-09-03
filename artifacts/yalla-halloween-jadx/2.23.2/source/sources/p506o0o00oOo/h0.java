package p506o0o00oOo;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50412OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50412OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = UserInfoEditActivity.f26818Oooo0oO;
            UserInfoEditActivity userInfoEditActivity = this.f50412OooO0Oo;
            userInfoEditActivity.getClass();
            BaseActivityK.OooOo0o(userInfoEditActivity, o0000.OooO0OO(o000000.uploading), 0L, 2);
            UserInfoEditVM.uploadAvatar$default((UserInfoEditVM) userInfoEditActivity.f26824OooOo0o.getValue(), uriOooO0O0, null, false, 6, null).observe(userInfoEditActivity, new UserInfoEditActivity.OooO00o(new j0(userInfoEditActivity)));
        }
        return Unit.INSTANCE;
    }
}
