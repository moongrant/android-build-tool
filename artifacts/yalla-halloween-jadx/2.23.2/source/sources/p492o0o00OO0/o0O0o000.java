package p492o0o00OO0;

import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function1<LockShopModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f49303OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f49303OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockShopModel lockShopModel) {
        LockShopModel lockShopModel2 = lockShopModel;
        if (lockShopModel2 != null) {
            PurchaseLockRoomActivity purchaseLockRoomActivity = this.f49303OooO0Oo;
            purchaseLockRoomActivity.f25795OooOo0O.clear();
            ArrayList arrayList = purchaseLockRoomActivity.f25795OooOo0O;
            arrayList.addAll(lockShopModel2.getData());
            ((o0000oo) purchaseLockRoomActivity.f25793OooOo0.getValue()).OooOoO0(arrayList);
        }
        return Unit.INSTANCE;
    }
}
