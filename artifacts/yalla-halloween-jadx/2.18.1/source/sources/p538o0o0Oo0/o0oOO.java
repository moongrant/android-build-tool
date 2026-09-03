package p538o0o0Oo0;

import com.yalla.yalla.model.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import p254o00ooO0O.o0000O0O;
import p608o0oo0O0O.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f44068Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ LockShopModel.LockShopModelItem f44069Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(PurchaseLockRoomActivity purchaseLockRoomActivity, LockShopModel.LockShopModelItem lockShopModelItem) {
        super(0);
        this.f44068Oooo0o = purchaseLockRoomActivity;
        this.f44069Oooo0oO = lockShopModelItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PurchaseLockRoomActivity purchaseLockRoomActivity = this.f44068Oooo0o;
        long shopId = this.f44069Oooo0oO.getShopId();
        PurchaseLockRoomActivity.OooO00o oooO00o = PurchaseLockRoomActivity.f22505OooooOO;
        Objects.requireNonNull(purchaseLockRoomActivity.OooOooo());
        o0000O0O.OooO00o(new o00(shopId, null)).observe(purchaseLockRoomActivity, new OooOo(new o00Oo00(purchaseLockRoomActivity), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
