package p538o0o0Oo0;

import com.yalla.yalla.model.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo extends Lambda implements Function1<LockShopModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f43975Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f43975Oooo0o = purchaseLockRoomActivity;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockShopModel lockShopModel) {
        LockShopModel lockShopModel2 = lockShopModel;
        if (lockShopModel2 != null) {
            PurchaseLockRoomActivity purchaseLockRoomActivity = this.f43975Oooo0o;
            purchaseLockRoomActivity.f22509OooooO0.clear();
            purchaseLockRoomActivity.f22509OooooO0.addAll(lockShopModel2.getData());
            purchaseLockRoomActivity.OooOoo().setNewData(purchaseLockRoomActivity.f22509OooooO0);
        }
        return Unit.INSTANCE;
    }
}
