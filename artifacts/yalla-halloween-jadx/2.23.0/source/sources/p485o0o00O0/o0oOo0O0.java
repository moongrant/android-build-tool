package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f48021OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f48021OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        int i = PurchaseLockRoomActivity.f26240OooOo0o;
        this.f48021OooO0Oo.OooOo().f58126OooO0o.setText(OooOOOO.OooO0OO(l));
        return Unit.INSTANCE;
    }
}
