package p143o00OOooo;

import android.view.View;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32009Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f32010Oooo0oO;

    public /* synthetic */ o00OO(Object obj, int i) {
        this.f32009Oooo0o = i;
        this.f32010Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32009Oooo0o) {
            case 0:
                RoomInfoProfileFragment.m83initView$lambda4((RoomInfoProfileFragment) this.f32010Oooo0oO, view);
                break;
            default:
                PremiumActivity this$0 = (PremiumActivity) this.f32010Oooo0oO;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Objects.requireNonNull(this$0);
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOo0(R.string.vip3vip4_to_vip2vip1);
                oo0ooo0.OooOOO0();
                break;
        }
    }
}
