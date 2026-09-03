package p144o00OOooo;

import android.content.Intent;
import android.view.View;
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p259o00ooOOo.g;
import p524o0o0O0o.oOO00O;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32015Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32016OoooO00;

    public /* synthetic */ o00O00OO(Object obj, int i) {
        this.f32015Oooo = i;
        this.f32016OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32015Oooo) {
            case 0:
                RoomInfoMemberListFragment.m57initView$lambda2((RoomInfoMemberListFragment) this.f32016OoooO00, view);
                break;
            case 1:
                g this$0 = (g) this.f32016OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3 = this$0.f34650OooOOO0;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(this$0.f34647OooOO0), Integer.valueOf(this$0.f34648OooOO0O), Integer.valueOf(this$0.f34649OooOO0o));
                }
                break;
            case 2:
                PurchaseLockRoomActivity context = (PurchaseLockRoomActivity) this.f32016OoooO00;
                PurchaseLockRoomActivity.OooO00o oooO00o = PurchaseLockRoomActivity.f22524Oooooo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Objects.requireNonNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
                OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", "PurchaseLockRoomActivity")));
                intent.putExtra("FromInfo", "PurchaseLockRoomActivity");
                context.startActivity(intent);
                break;
            default:
                MomentDetailGiftGiverView this$1 = (MomentDetailGiftGiverView) this.f32016OoooO00;
                int i = MomentDetailGiftGiverView.f24903o000oOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MomentDetailModel momentDetailModel = this$1.f24907OoooO00;
                if (!oOO00O.OooO0OO(momentDetailModel != null ? Boolean.valueOf(momentDetailModel.isMySelf()) : null)) {
                    Function0<Unit> function0 = this$1.f24905OoooO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    Function1<? super Integer, Unit> function1 = this$1.f24908OoooO0O;
                    if (function1 != null) {
                        function1.invoke(1);
                    }
                }
                break;
        }
    }
}
