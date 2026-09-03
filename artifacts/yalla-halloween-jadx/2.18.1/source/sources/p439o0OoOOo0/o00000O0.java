package p439o0OoOOo0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.TopicBlackUserModel;
import com.yalla.yalla.ui.activity.moment.TopicBlackListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yalla.yalla.ui.view.MomentDetailText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p174o00OooOO.o0O00OOO;
import p186o00o00Oo.o0ooOOo;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements o000O000, BaseQuickAdapter.OooOOOO, o0ooOOo, BaseQuickAdapter.OooOo, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f40119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f40120OooO0o0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f40119OooO0Oo = i;
        this.f40120OooO0o0 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailText this$0 = (MomentDetailText) this.f40120OooO0o0;
        int i = MomentDetailText.f24912OoooO00;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.f24916Oooo0oo;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainRoomMineFollowingFragment.m459initView$lambda3((MainRoomMineFollowingFragment) this.f40120OooO0o0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicBlackListActivity this$0 = (TopicBlackListActivity) this.f40120OooO0o0;
        int i2 = TopicBlackListActivity.f22539OooooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        OooO0OO<TopicBlackUserModel> oooO0OO = this$0.f22542Ooooo0o;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO0OO = null;
        }
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, this$0, String.valueOf(oooO0OO.getData().get(i).getUserId()), false, 12);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f40119OooO0Oo) {
            case 2:
                UserRoomsActivity this$0 = (UserRoomsActivity) this.f40120OooO0o0;
                UserRoomsActivity.OooO00o oooO00o = UserRoomsActivity.f23561Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo();
                break;
            default:
                RoomMemberConveneListDialog this$1 = (RoomMemberConveneListDialog) this.f40120OooO0o0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (!(!StringsKt.isBlank(this$1.f24164OoooOoO))) {
                    this$1.OooOOOo(false);
                } else {
                    this$1.OooOOo(this$1.f24164OoooOoO, false);
                }
                break;
        }
    }
}
