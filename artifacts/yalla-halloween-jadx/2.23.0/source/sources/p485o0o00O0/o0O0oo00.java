package p485o0o00O0;

import com.yalla.yalla.model.room.LockTimeModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function1<LockTimeModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f47980OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f47980OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockTimeModel lockTimeModel) {
        LockTimeModel lockTimeModel2 = lockTimeModel;
        if (lockTimeModel2 != null) {
            int i = PurchaseLockRoomActivity.f26240OooOo0o;
            this.f47980OooO0Oo.OooOo().f58128OooO0oO.setText(lockTimeModel2.getDayNum());
        }
        return Unit.INSTANCE;
    }
}
