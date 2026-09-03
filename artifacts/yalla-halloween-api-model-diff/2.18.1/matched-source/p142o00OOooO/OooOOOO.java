package p142o00OOooO;

import android.view.View;
import android.widget.PopupWindow;
import androidx.activity.result.OooO00o;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.RoomIndexModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.fragment.TopicPostLatestFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p406o0Oo0OOO.oO00000;
import p508o0o00oOo.o00O0000;
import p654o0ooo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements BaseQuickAdapter.OooOOOO, OooO0OO.OooO0O0, OooO00o, BaseQuickAdapter.OooOo, o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31900OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f31899OooO0Oo = i;
        this.f31900OooO0o0 = obj;
    }

    @Override // p654o0ooo.o0OoOo0
    public final void OooO00o(Object obj) {
        MainRoomPopularFragment.m477initView$lambda5$lambda3((MainRoomPopularFragment) this.f31900OooO0o0, (RoomIndexModel) obj);
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        OooOO0.OooO0O0 oooO0O0 = (OooOO0.OooO0O0) this.f31900OooO0o0;
        oooO00o.OooOOO(oooO0O0.f13238Oooo0o.f40556OooO00o, oooO0O0.f13242OoooO0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        TopicPostLatestFragment.m408initView$lambda11((TopicPostLatestFragment) this.f31900OooO0o0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31899OooO0Oo) {
            case 0:
                ((ContributionFragment) this.f31900OooO0o0).lambda$initView$0(baseQuickAdapter, view, i);
                break;
            default:
                o00O0000 this$0 = (o00O0000) this.f31900OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super Model, Unit> function1 = this$0.f41885OooO0oo;
                if (function1 != 0) {
                    function1.invoke((Object) baseQuickAdapter.getItem(i));
                }
                PopupWindow popupWindow = this$0.f41881OooO0Oo;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        oO00000 this$0 = (oO00000) this.f31900OooO0o0;
        int i = oO00000.f39104OoooOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0O0();
    }
}
