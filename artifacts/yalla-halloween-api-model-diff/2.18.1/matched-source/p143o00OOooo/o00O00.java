package p143o00OOooo;

import android.view.View;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.TopDataFragment;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p563o0oOo0.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00 implements o0ooOOo, oO00OO0O, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31989OooO0o0;

    public /* synthetic */ o00O00(Object obj, int i) {
        this.f31988OooO0Oo = i;
        this.f31989OooO0o0 = obj;
    }

    @Override // p417o0Oo0oOo.oO00OO0O
    public final void OooO0OO(oO000Oo it) {
        VoteHistoryActivity this$0 = (VoteHistoryActivity) this.f31989OooO0o0;
        VoteHistoryActivity.OooO00o oooO00o = VoteHistoryActivity.f23083Oooooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOooO(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31988OooO0Oo) {
            case 2:
                o0000O this$0 = (o0000O) this.f31989OooO0o0;
                int i2 = o0000O.f44998OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = this$0.f44999OooO0OO;
                if (i3 != i) {
                    this$0.f44999OooO0OO = i;
                    if (i3 >= 0) {
                        baseQuickAdapter.notifyItemChanged(i3);
                    }
                    baseQuickAdapter.notifyItemChanged(this$0.f44999OooO0OO);
                } else {
                    this$0.f44999OooO0OO = -1;
                    baseQuickAdapter.notifyItemChanged(i3);
                }
                break;
            default:
                TopDataFragment.m399initView$lambda2((TopDataFragment) this.f31989OooO0o0, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31988OooO0Oo) {
            case 0:
                RoomInfoMemberListFragment.m47initData$lambda23((RoomInfoMemberListFragment) this.f31989OooO0o0);
                break;
            default:
                MainExploreFragment.m339initView$lambda1$lambda0((MainExploreFragment) this.f31989OooO0o0);
                break;
        }
    }
}
