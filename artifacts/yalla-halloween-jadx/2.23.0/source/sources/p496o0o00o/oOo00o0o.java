package p496o0o00o;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49186OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49186OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            int i = UserInfoEditActivity.f27283Oooo0oO;
            UserInfoEditActivity userInfoEditActivity = this.f49186OooO0Oo;
            userInfoEditActivity.getClass();
            BaseActivityK.OooOo0o(userInfoEditActivity, o0000.OooO0OO(oO00OOo0.uploading), 0L, 2);
            UserInfoEditVM.uploadAvatar$default((UserInfoEditVM) userInfoEditActivity.f27289OooOo0o.getValue(), uriOooO0O0, null, false, 6, null).observe(userInfoEditActivity, new UserInfoEditActivity.OooO00o(new oO0OO00o(userInfoEditActivity)));
        }
        return Unit.INSTANCE;
    }
}
