package p144o00OOooo;

import android.view.View;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.TopDataFragment;
import kotlin.jvm.internal.Intrinsics;
import p187o00o00Oo.o0ooOOo;
import p410o0Oo0OOo.oO000Oo0;
import p420o0Oo0oOo.oO00O0oO;
import p565o0oOo0.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00 implements o0ooOOo, oO00O0oO, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32009Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32010OoooO00;

    public /* synthetic */ o00O00(Object obj, int i) {
        this.f32009Oooo = i;
        this.f32010OoooO00 = obj;
    }

    @Override // p420o0Oo0oOo.oO00O0oO
    public final void OooO0OO(oO000Oo0 it) {
        VoteHistoryActivity this$0 = (VoteHistoryActivity) this.f32010OoooO00;
        VoteHistoryActivity.OooO00o oooO00o = VoteHistoryActivity.f23102o0OoOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOooO(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f32009Oooo) {
            case 2:
                o0000O this$0 = (o0000O) this.f32010OoooO00;
                int i2 = o0000O.f45014OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = this$0.f45015OooO0OO;
                if (i3 != i) {
                    this$0.f45015OooO0OO = i;
                    if (i3 >= 0) {
                        baseQuickAdapter.notifyItemChanged(i3);
                    }
                    baseQuickAdapter.notifyItemChanged(this$0.f45015OooO0OO);
                } else {
                    this$0.f45015OooO0OO = -1;
                    baseQuickAdapter.notifyItemChanged(i3);
                }
                break;
            default:
                TopDataFragment.m399initView$lambda2((TopDataFragment) this.f32010OoooO00, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32009Oooo) {
            case 0:
                RoomInfoMemberListFragment.m47initData$lambda23((RoomInfoMemberListFragment) this.f32010OoooO00);
                break;
            default:
                MainExploreFragment.m339initView$lambda1$lambda0((MainExploreFragment) this.f32010OoooO00);
                break;
        }
    }
}
