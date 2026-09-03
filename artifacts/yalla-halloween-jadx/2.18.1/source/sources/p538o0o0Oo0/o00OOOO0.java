package p538o0o0Oo0;

import com.yalla.yalla.model.LockTimeModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOO0 extends Lambda implements Function1<LockTimeModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f43974Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f43974Oooo0o = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockTimeModel lockTimeModel) {
        LockTimeModel lockTimeModel2 = lockTimeModel;
        if (lockTimeModel2 != null) {
            PurchaseLockRoomActivity purchaseLockRoomActivity = this.f43974Oooo0o;
            PurchaseLockRoomActivity.OooO00o oooO00o = PurchaseLockRoomActivity.f22505OooooOO;
            purchaseLockRoomActivity.OooOooO().f50605OooO0oO.setText(lockTimeModel2.getDayNum());
        }
        return Unit.INSTANCE;
    }
}
