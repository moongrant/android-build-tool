package p566o0oOo00O;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o0000;
import p534o0o0OOo0.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45284Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(UserInfoActivity userInfoActivity) {
        super(1);
        this.f45284Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            UserInfoActivity userInfoActivity = this.f45284Oooo0o;
            int i = userInfoActivity.f23471oo000o;
            if (i == 0) {
                BaseActivityK.OooOoo0(userInfoActivity, OooOOO.OooO0OO(R.string.uploading), 0L, 2, null);
                userInfoActivity.Oooo0().uploadAvatar(uriOooO0O0).observe(userInfoActivity, new o0000(userInfoActivity, 4));
            } else if (i == 1) {
                BaseActivityK.OooOoo0(userInfoActivity, OooOOO.OooO0OO(R.string.uploading), 0L, 2, null);
                userInfoActivity.Oooo0().uploadCover(uriOooO0O0).observe(userInfoActivity, new o0OoOoOo(userInfoActivity, 3));
            }
        }
        return Unit.INSTANCE;
    }
}
