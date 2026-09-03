package p143o00OOooO;

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
import p409o0Oo0OOO.o;
import p510o0o00oOo.o00O0000;
import p656o0ooo.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements BaseQuickAdapter.OooOOOO, OooO0OO.OooO0O0, OooO00o, BaseQuickAdapter.OooOo, o0OoOo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31920Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31921OoooO00;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f31920Oooo = i;
        this.f31921OoooO00 = obj;
    }

    @Override // p656o0ooo.o0OoOo0
    public final void OooO00o(Object obj) {
        MainRoomPopularFragment.m477initView$lambda5$lambda3((MainRoomPopularFragment) this.f31921OoooO00, (RoomIndexModel) obj);
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        OooOO0.OooO0O0 oooO0O0 = (OooOO0.OooO0O0) this.f31921OoooO00;
        oooO00o.OooOOO(oooO0O0.f13254Oooo.f40575OooO00o, oooO0O0.f13259OoooOO0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        TopicPostLatestFragment.m408initView$lambda11((TopicPostLatestFragment) this.f31921OoooO00);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f31920Oooo) {
            case 0:
                ((ContributionFragment) this.f31921OoooO00).lambda$initView$0(baseQuickAdapter, view, i);
                break;
            default:
                o00O0000 this$0 = (o00O0000) this.f31921OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super Model, Unit> function1 = this$0.f41904OooO0oo;
                if (function1 != 0) {
                    function1.invoke((Object) baseQuickAdapter.getItem(i));
                }
                PopupWindow popupWindow = this$0.f41900OooO0Oo;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                break;
        }
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o this$0 = (o) this.f31921OoooO00;
        int i = o.f39123OoooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooO0O0();
    }
}
