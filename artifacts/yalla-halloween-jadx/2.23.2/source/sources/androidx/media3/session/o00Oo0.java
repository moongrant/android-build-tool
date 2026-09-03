package androidx.media3.session;

import android.view.View;
import androidx.media3.common.Player;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.fragment.UserInfoLeftFragment;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.l;
import p473o0OoooOo.o0OOO0;
import p650o0ooo.oOO0Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Oo0 implements o000OoO.o00000O0.OooO00o, p338o0OO0oOo.Oooo000, BaseQuickAdapter.OooO0o, o0OOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9477OooO0Oo;

    public /* synthetic */ o00Oo0(Object obj) {
        this.f9477OooO0Oo = obj;
    }

    @Override // p338o0OO0oOo.Oooo000
    public final void OooO00o(o0OO0oO0.OooOOO0 it) {
        VoteHistoryActivity this$0 = (VoteHistoryActivity) this.f9477OooO0Oo;
        int i = VoteHistoryActivity.f26312OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOoO0(false);
    }

    @Override // p473o0OoooOo.o0OOO0
    public final void OooO0O0() {
        ((UserInfoLeftFragment) this.f9477OooO0Oo).lambda$showAddPowerSeeroomFriend$6();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        oOO0Oo00 this$0 = (oOO0Oo00) this.f9477OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f58977OooOO0o == i) {
            return;
        }
        this$0.f58977OooOO0o = i;
        l lVar = this$0.f58976OooOO0O;
        RecyclerView.Adapter adapter = lVar.f44103OooO0O0.getAdapter();
        boolean z = false;
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i2 = this$0.f58977OooOO0o;
        if (i2 >= 0 && i2 < itemCount) {
            z = true;
        }
        if (z) {
            lVar.f44103OooO0O0.scrollToPosition(i2);
            oOO0Oo00.OooO0O0 oooO0O0 = this$0.f58979OooOOO0;
            if (oooO0O0 != null) {
                oooO0O0.notifyDataSetChanged();
            }
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onTrackSelectionParametersChanged(((o00O00O) this.f9477OooO0Oo).f9396Oooo00o);
    }
}
