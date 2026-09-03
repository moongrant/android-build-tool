package p492o0o00OO0;

import com.code.android.util.o00oO0o;
import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;
import p585o0oOooO.o0OO00OO;
import p585o0oOooO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f49301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LockShopModel.LockShopModelItem f49302OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(PurchaseLockRoomActivity purchaseLockRoomActivity, LockShopModel.LockShopModelItem lockShopModelItem) {
        super(0);
        this.f49301OooO0Oo = purchaseLockRoomActivity;
        this.f49302OooO0o0 = lockShopModelItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long shopId = this.f49302OooO0o0.getShopId();
        int i = PurchaseLockRoomActivity.f25791OooOo0o;
        PurchaseLockRoomActivity purchaseLockRoomActivity = this.f49301OooO0Oo;
        ((o0OO00OO) purchaseLockRoomActivity.f25794OooOo00.getValue()).getClass();
        o00oO0o.OooO00o(new oo0oO0(shopId, null)).observe(purchaseLockRoomActivity, new o000oOoO(new o0O0o00O(purchaseLockRoomActivity), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
