package p486o0o00O00;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.main.OooO00o;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineRecentlyFragment;
import kotlin.jvm.internal.Intrinsics;
import p412o0Oo0oOo.s0;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000000 implements BaseQuickAdapter.OooO0o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48247OooO0Oo;

    public /* synthetic */ o000000(Object obj) {
        this.f48247OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        MainRoomMineRecentlyFragment.initView$lambda$0((MainRoomMineRecentlyFragment) this.f48247OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ChangeRegionActivity this$0 = (ChangeRegionActivity) this.f48247OooO0Oo;
        int i2 = ChangeRegionActivity.f25377OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooO00o oooO00o = this$0.f25384OooOo0O;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO00o = null;
        }
        Object obj = oooO00o.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj);
        this$0.f25382OooOo0 = ((ChangeRegionActivity.OooO00o) obj).f25387OooO0O0;
        this$0.OooOo0();
        OooO00o oooO00o2 = this$0.f25384OooOo0O;
        if (oooO00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseAdapter");
            oooO00o2 = null;
        }
        oooO00o2.notifyDataSetChanged();
        s0.f45256OooO00o.postValue(null);
    }
}
