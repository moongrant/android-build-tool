package p259o00ooOOo;

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
import p393o0OOooOo.o0O00000;
import p503o0o00o.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f34642Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f34643OoooO00;

    public /* synthetic */ f(Object obj, int i) {
        this.f34642Oooo = i;
        this.f34643OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34642Oooo) {
            case 0:
                g this$0 = (g) this.f34643OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo();
                break;
            case 1:
                SmsCodeActivity this$1 = (SmsCodeActivity) this.f34643OoooO00;
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21864oo000o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0O00000.OooO0OO("Log_in_feedback");
                SharedUrlManager.INSTANCE.getFeedBackLoginUrl().observe(this$1, new o0000O(this$1, 1));
                break;
            case 2:
                PurchaseLockRoomActivity context = (PurchaseLockRoomActivity) this.f34643OoooO00;
                PurchaseLockRoomActivity.OooO00o oooO00o2 = PurchaseLockRoomActivity.f22524Oooooo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                Objects.requireNonNull(context);
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) CreateRoomActivity.class));
                context.finish();
                break;
            default:
                MomentDetailGiftGiverView this$2 = (MomentDetailGiftGiverView) this.f34643OoooO00;
                int i = MomentDetailGiftGiverView.f24903o000oOoO;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (!this$2.f24909OoooOO0) {
                    Function0<Unit> function0 = this$2.f24905OoooO;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    Function1<? super Integer, Unit> function1 = this$2.f24908OoooO0O;
                    if (function1 != null) {
                        function1.invoke(0);
                    }
                }
                break;
        }
    }
}
