package p566o0oOo00O;

import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.unsigned.OooO00o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p498o0o00Oo0.OooOOO;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoO00O extends Lambda implements Function2<Integer, SelectDialogModel<?>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45336Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(UserInfoActivity userInfoActivity) {
        super(2);
        this.f45336Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<?> selectDialogModel) {
        int iIntValue = num.intValue();
        SelectDialogModel<?> item = selectDialogModel;
        Intrinsics.checkNotNullParameter(item, "item");
        if (iIntValue == 0) {
            UserInfoActivity userInfoActivity = this.f45336Oooo0o;
            userInfoActivity.f23471oo000o = 1;
            o0O0O00.OooO0OO(userInfoActivity, oo0o0Oo.f48607OooO0O0, null, new o0oOO(userInfoActivity));
        } else {
            UserInfoActivity userInfoActivity2 = this.f45336Oooo0o;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            Objects.requireNonNull(userInfoActivity2);
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            o00000OO.f32212OooO0o0.OooO00o(CloudFileType.USER_BACKGROUND, OooO00o.OooO0O0(OooOOO.f41216OooO00o), 1, "", new o0O00o0(userInfoActivity2));
        }
        return Unit.INSTANCE;
    }
}
