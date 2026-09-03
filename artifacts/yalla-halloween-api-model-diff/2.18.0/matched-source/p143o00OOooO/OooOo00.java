package p143o00OOooO;

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
import p187o00o00Oo.o0ooOOo;
import p409o0Oo0OOO.o;
import p409o0Oo0OOO.oO00000;
import p409o0Oo0OOO.oO0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements o0ooOOo, OooO0OO.OooO0O0, OooO00o, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31924Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31925OoooO00;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f31924Oooo = i;
        this.f31925OoooO00 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OoooO(OooOO0.OooO0O0.OooO00o(((OooOO0.OooO0O0) this.f31925OoooO00).f13254Oooo));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainRoomPopularFragment.m478initView$lambda5$lambda4((MainRoomPopularFragment) this.f31925OoooO00);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31924Oooo) {
            case 0:
                ((ContributionFragment) this.f31925OoooO00).lambda$initView$1();
                break;
            case 3:
                MainMomentsTopicFollowingFragment.m351initView$lambda2((MainMomentsTopicFollowingFragment) this.f31925OoooO00);
                break;
            default:
                TopicPostPopularFragment.m418initView$lambda10((TopicPostPopularFragment) this.f31925OoooO00);
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o this$0 = (o) this.f31925OoooO00;
        int i = o.f39123OoooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.OooO00o()) {
            oO0Oo oo0oo = this$0.f39127OoooO00;
            oO00000 oo00000 = null;
            if (oo0oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                oo0oo = null;
            }
            oO00000 oo00001 = this$0.f39124Oooo;
            if (oo00001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo00000 = oo00001;
            }
            oo0oo.OooO0OO(new ArrayList(oo00000.f39147OooOO0O));
        }
    }
}
