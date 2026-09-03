package p144o00OOooo;

import android.view.View;
import android.widget.FrameLayout;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p177o00OoooO.oO000o00;
import p503o0o00o.o000O000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oOO00O implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32057Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32058OoooO00;

    public /* synthetic */ oOO00O(Object obj, int i) {
        this.f32057Oooo = i;
        this.f32058OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32057Oooo) {
            case 0:
                RoomInfoMemberListFragment.m61initView$lambda7((RoomInfoMemberListFragment) this.f32058OoooO00, view);
                break;
            case 1:
                oO000o00 this$0 = (oO000o00) this.f32058OoooO00;
                int i = oO000o00.f32824OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
            case 2:
                o000O000 this$1 = (o000O000) this.f32058OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                FrameLayout frameLayout = this$1.OooOo00().f50789OooOo0;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "mBinding.overrideGiftContainer");
                p255o00ooO0O.oOO00O.OooO00o(frameLayout);
                break;
            default:
                MomentDetailGiftGiverView this$2 = (MomentDetailGiftGiverView) this.f32058OoooO00;
                int i2 = MomentDetailGiftGiverView.f24903o000oOoO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Function1<? super Integer, Unit> function1 = this$2.f24908OoooO0O;
                if (function1 != null) {
                    function1.invoke(0);
                }
                break;
        }
    }
}
