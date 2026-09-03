package p143o00OOooo;

import android.view.View;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0ooO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32032Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32033Oooo0oO;

    public /* synthetic */ o0O0ooO(Object obj, int i) {
        this.f32032Oooo0o = i;
        this.f32033Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32032Oooo0o) {
            case 0:
                RoomInfoMemberListFragment.m62initView$lambda9((RoomInfoMemberListFragment) this.f32033Oooo0oO, view);
                break;
            default:
                MomentDetailGiftGiverView this$0 = (MomentDetailGiftGiverView) this.f32033Oooo0oO;
                int i = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<? super Integer, Unit> function1 = this$0.f24885Oooo;
                if (function1 != null) {
                    function1.invoke(0);
                }
                break;
        }
    }
}
