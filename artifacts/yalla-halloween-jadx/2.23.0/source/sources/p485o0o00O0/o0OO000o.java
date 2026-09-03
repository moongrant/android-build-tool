package p485o0o00O0;

import com.code.android.util.o00oO0o;
import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;
import p580o0oOoo0.o00;
import p580o0oOoo0.o0O0ooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f47986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LockShopModel.LockShopModelItem f47987OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(PurchaseLockRoomActivity purchaseLockRoomActivity, LockShopModel.LockShopModelItem lockShopModelItem) {
        super(0);
        this.f47986OooO0Oo = purchaseLockRoomActivity;
        this.f47987OooO0o0 = lockShopModelItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long shopId = this.f47987OooO0o0.getShopId();
        int i = PurchaseLockRoomActivity.f26240OooOo0o;
        PurchaseLockRoomActivity purchaseLockRoomActivity = this.f47986OooO0Oo;
        ((o0O0ooO) purchaseLockRoomActivity.f26243OooOo00.getValue()).getClass();
        o00oO0o.OooO00o(new o00(shopId, null)).observe(purchaseLockRoomActivity, new o0000OO0(new o0OO000(purchaseLockRoomActivity), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
