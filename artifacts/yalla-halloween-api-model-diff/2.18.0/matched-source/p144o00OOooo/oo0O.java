package p144o00OOooo;

import android.content.Intent;
import android.view.View;
import androidx.activity.result.OooO00o;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicAddMoreFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineRecentlyFragment;
import com.yalla.yalla.ui.view.MomentDetailView;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import p175o00OooOO.o0O00OOO;
import p187o00o00Oo.o0ooOOo;
import p409o0Oo0OOO.o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0O implements o0ooOOo, OooO00o, BaseQuickAdapter.OooOOOO, BaseQuickAdapter.OooOOO0, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32060Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32061OoooO00;

    public /* synthetic */ oo0O(Object obj, int i) {
        this.f32060Oooo = i;
        this.f32061OoooO00 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailView this$0 = (MomentDetailView) this.f32061OoooO00;
        int i = MomentDetailView.f24956ooOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo00();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentPowerSelectModel>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MomentPowerSelectActivity this$0 = (MomentPowerSelectActivity) this.f32061OoooO00;
        MomentPowerSelectActivity.OooO00o oooO00o = MomentPowerSelectActivity.f22379OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra("Data", (Serializable) this$0.f22380OooooO0.get(i));
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32060Oooo) {
            case 0:
                RoomInfoMomentFragment.m73initView$lambda9((RoomInfoMomentFragment) this.f32061OoooO00);
                break;
            case 3:
                BanEnterRoomListActivity this$0 = (BanEnterRoomListActivity) this.f32061OoooO00;
                int i = BanEnterRoomListActivity.f22764o00o0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.f22778ooOO) {
                    this$0.OooOoOO(false);
                } else {
                    this$0.OooOoo(this$0.f22775o00Oo0, false);
                }
                break;
            default:
                MainRoomMineRecentlyFragment.m475initView$lambda0((MainRoomMineRecentlyFragment) this.f32061OoooO00);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MainMomentsTopicAddMoreFragment.m348initView$lambda6((MainMomentsTopicAddMoreFragment) this.f32061OoooO00, baseQuickAdapter, view, i);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o this$0 = (o) this.f32061OoooO00;
        int i = o.f39123OoooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0Oo();
    }
}
