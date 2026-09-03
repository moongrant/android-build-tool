package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f49299OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f49299OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        int i = PurchaseLockRoomActivity.f25791OooOo0o;
        this.f49299OooO0Oo.OooOo().f45248OooO0o.setText(o0O0O0Oo.OooO0OO(l));
        return Unit.INSTANCE;
    }
}
