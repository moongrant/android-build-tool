package p144o00OOooo;

import android.view.View;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32053Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32054OoooO00;

    public /* synthetic */ o0O0ooO(Object obj, int i) {
        this.f32053Oooo = i;
        this.f32054OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32053Oooo) {
            case 0:
                RoomInfoMemberListFragment.m62initView$lambda9((RoomInfoMemberListFragment) this.f32054OoooO00, view);
                break;
            default:
                MomentDetailGiftGiverView this$0 = (MomentDetailGiftGiverView) this.f32054OoooO00;
                int i = MomentDetailGiftGiverView.f24903o000oOoO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super Integer, Unit> function1 = this$0.f24908OoooO0O;
                if (function1 != null) {
                    function1.invoke(0);
                }
                break;
        }
    }
}
