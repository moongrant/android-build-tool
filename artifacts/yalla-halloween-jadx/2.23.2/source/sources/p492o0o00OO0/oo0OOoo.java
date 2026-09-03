package p492o0o00OO0;

import com.yalla.yalla.model.room.LockTimeModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends Lambda implements Function1<LockTimeModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f49543OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f49543OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockTimeModel lockTimeModel) {
        LockTimeModel lockTimeModel2 = lockTimeModel;
        if (lockTimeModel2 != null) {
            int i = PurchaseLockRoomActivity.f25791OooOo0o;
            this.f49543OooO0Oo.OooOo().f45250OooO0oO.setText(lockTimeModel2.getDayNum());
        }
        return Unit.INSTANCE;
    }
}
