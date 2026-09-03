package p143o00OOooo;

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
import p258o00ooOOo.d;
import p522o0o0O0o.oOO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31994Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f31995Oooo0oO;

    public /* synthetic */ o00O00OO(Object obj, int i) {
        this.f31994Oooo0o = i;
        this.f31995Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f31994Oooo0o) {
            case 0:
                RoomInfoMemberListFragment.m57initView$lambda2((RoomInfoMemberListFragment) this.f31995Oooo0oO, view);
                break;
            case 1:
                d this$0 = (d) this.f31995Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3 = this$0.f34628OooOOO0;
                if (function3 != null) {
                    function3.invoke(Integer.valueOf(this$0.f34625OooOO0), Integer.valueOf(this$0.f34626OooOO0O), Integer.valueOf(this$0.f34627OooOO0o));
                }
                break;
            case 2:
                PurchaseLockRoomActivity context = (PurchaseLockRoomActivity) this.f31995Oooo0oO;
                PurchaseLockRoomActivity.OooO00o oooO00o = PurchaseLockRoomActivity.f22505OooooOO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Objects.requireNonNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
                OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", "PurchaseLockRoomActivity")));
                intent.putExtra("FromInfo", "PurchaseLockRoomActivity");
                context.startActivity(intent);
                break;
            default:
                MomentDetailGiftGiverView this$1 = (MomentDetailGiftGiverView) this.f31995Oooo0oO;
                int i = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                MomentDetailModel momentDetailModel = this$1.f24887Oooo0oO;
                if (!oOO00O.OooO0OO(momentDetailModel != null ? Boolean.valueOf(momentDetailModel.isMySelf()) : null)) {
                    Function0<Unit> function0 = this$1.f24890OoooO00;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    Function1<? super Integer, Unit> function1 = this$1.f24885Oooo;
                    if (function1 != null) {
                        function1.invoke(1);
                    }
                }
                break;
        }
    }
}
