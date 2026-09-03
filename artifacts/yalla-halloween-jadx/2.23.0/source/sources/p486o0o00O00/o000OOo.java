package p486o0o00O00;

import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BlackUserModel.DataBean f48291OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(BlackListActivity blackListActivity, BlackUserModel.DataBean dataBean) {
        super(0);
        this.f48290OooO0Oo = blackListActivity;
        this.f48291OooO0o0 = dataBean;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        int i = BlackListActivity.f25368OooOo;
        BlackListActivity blackListActivity = this.f48290OooO0Oo;
        blackListActivity.getClass();
        BlackUserModel.DataBean dataBean = this.f48291OooO0o0;
        String str = dataBean.userid;
        Intrinsics.checkNotNullExpressionValue(str, "data.userid");
        if (str.length() == 0) {
            return null;
        }
        UserBlackVM userBlackVM = blackListActivity.f25375OooOo0o;
        Intrinsics.checkNotNull(userBlackVM);
        userBlackVM.blockUser(o0OoOo0.OooO(0L, dataBean.userid), false).observe(blackListActivity, new oo000o(blackListActivity, dataBean));
        return null;
    }
}
