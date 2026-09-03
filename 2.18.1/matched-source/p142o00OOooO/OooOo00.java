package p142o00OOooO;

import androidx.activity.result.OooO00o;
import com.app.base.fragment.ContributionFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.fragment.MainMomentsTopicFollowingFragment;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;
import p406o0Oo0OOO.o0oo0000;
import p406o0Oo0OOO.oO00000;
import p406o0Oo0OOO.oO00000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements o0ooOOo, OooO0OO.OooO0O0, OooO00o, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31904OooO0o0;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f31903OooO0Oo = i;
        this.f31904OooO0o0 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OoooO(OooOO0.OooO0O0.OooO00o(((OooOO0.OooO0O0) this.f31904OooO0o0).f13238Oooo0o));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainRoomPopularFragment.m478initView$lambda5$lambda4((MainRoomPopularFragment) this.f31904OooO0o0);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31903OooO0Oo) {
            case 0:
                ((ContributionFragment) this.f31904OooO0o0).lambda$initView$1();
                break;
            case 3:
                MainMomentsTopicFollowingFragment.m351initView$lambda2((MainMomentsTopicFollowingFragment) this.f31904OooO0o0);
                break;
            default:
                TopicPostPopularFragment.m418initView$lambda10((TopicPostPopularFragment) this.f31904OooO0o0);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        oO00000 this$0 = (oO00000) this.f31904OooO0o0;
        int i = oO00000.f39104OoooOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.OooO00o()) {
            o0oo0000 o0oo0000Var = this$0.f39107Oooo0oO;
            oO00000o oo00000o = null;
            if (o0oo0000Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                o0oo0000Var = null;
            }
            oO00000o oo00000o2 = this$0.f39106Oooo0o;
            if (oo00000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000o = oo00000o2;
            }
            o0oo0000Var.OooO0OO(new ArrayList(oo00000o.f39123OooOO0O));
        }
    }
}
