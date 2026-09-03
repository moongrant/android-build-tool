package p474o0o00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.LoginOnRoomDialogActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O implements Observer<ApiResult<LoginListModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginOnRoomDialogActivity f47252OooO0Oo;

    public o000OO0O(LoginOnRoomDialogActivity loginOnRoomDialogActivity) {
        this.f47252OooO0Oo = loginOnRoomDialogActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<LoginListModel> apiResult) {
        this.f47252OooO0Oo.finish();
    }
}
