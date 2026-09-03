package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0o0o.o0O000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O implements Observer<MomentChangeUserIsInRoomModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47816OooO0Oo;

    public o000O00O(MomentDetailActivity momentDetailActivity) {
        this.f47816OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentChangeUserIsInRoomModel momentChangeUserIsInRoomModel) {
        MomentChangeUserIsInRoomModel result = momentChangeUserIsInRoomModel;
        Intrinsics.checkNotNullParameter(result, "result");
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(this.f47816OooO0Oo);
        if (momentDetailModel == null || momentDetailModel.getUserId() != Long.parseLong(result.getUserId())) {
            return;
        }
        momentDetailModel.setInRoom(result.getIsInRoom());
    }
}
