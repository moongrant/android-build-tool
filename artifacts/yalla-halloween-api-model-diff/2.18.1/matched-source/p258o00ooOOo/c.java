package p258o00ooOOo;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.view.MomentDetailGiftGiverView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p391o0OOooOo.o0O00000;
import p501o0o00o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f34620Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f34621Oooo0oO;

    public /* synthetic */ c(Object obj, int i) {
        this.f34620Oooo0o = i;
        this.f34621Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34620Oooo0o) {
            case 0:
                d this$0 = (d) this.f34621Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                break;
            case 1:
                SmsCodeActivity this$1 = (SmsCodeActivity) this.f34621Oooo0oO;
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0O00000.OooO0OO("Log_in_feedback");
                SharedUrlManager.INSTANCE.getFeedBackLoginUrl().observe(this$1, new o000OO(this$1, 1));
                break;
            case 2:
                PurchaseLockRoomActivity context = (PurchaseLockRoomActivity) this.f34621Oooo0oO;
                PurchaseLockRoomActivity.OooO00o oooO00o2 = PurchaseLockRoomActivity.f22505OooooOO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Objects.requireNonNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                context.finish();
                break;
            default:
                MomentDetailGiftGiverView this$2 = (MomentDetailGiftGiverView) this.f34621Oooo0oO;
                int i = MomentDetailGiftGiverView.f24884OoooO0O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (!this$2.f24889OoooO0) {
                    Function0<Unit> function0 = this$2.f24890OoooO00;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    Function1<? super Integer, Unit> function1 = this$2.f24885Oooo;
                    if (function1 != null) {
                        function1.invoke(0);
                    }
                }
                break;
        }
    }
}
