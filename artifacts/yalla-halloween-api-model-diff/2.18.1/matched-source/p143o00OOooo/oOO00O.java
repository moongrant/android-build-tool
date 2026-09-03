package p143o00OOooo;

import android.view.View;
import android.widget.FrameLayout;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p176o00OoooO.oO0OOo0o;
import p501o0o00o.o000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOO00O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32036Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32037Oooo0oO;

    public /* synthetic */ oOO00O(Object obj, int i) {
        this.f32036Oooo0o = i;
        this.f32037Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32036Oooo0o) {
            case 0:
                RoomInfoMemberListFragment.m61initView$lambda7((RoomInfoMemberListFragment) this.f32037Oooo0oO, view);
                break;
            case 1:
                oO0OOo0o this$0 = (oO0OOo0o) this.f32037Oooo0oO;
                int i = oO0OOo0o.f32870Ooooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
            case 2:
                o000 this$1 = (o000) this.f32037Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                FrameLayout frameLayout = this$1.OooOo00().f50852OooOo0;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
                p254o00ooO0O.oOO00O.OooO00o(frameLayout);
                break;
            default:
                MomentDetailGiftGiverView this$2 = (MomentDetailGiftGiverView) this.f32037Oooo0oO;
                int i2 = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Function1<? super Integer, Unit> function1 = this$2.f24885Oooo;
                if (function1 != null) {
                    function1.invoke(0);
                }
                break;
        }
    }
}
