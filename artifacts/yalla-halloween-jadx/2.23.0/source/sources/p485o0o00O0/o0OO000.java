package p485o0o00O0;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.LockBuyModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000 extends Lambda implements Function1<LockBuyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f47985OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f47985OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockBuyModel lockBuyModel) {
        LockBuyModel lockBuyModel2 = lockBuyModel;
        if (lockBuyModel2 != null) {
            int i = oO00OOo0.Purchase_successful;
            PurchaseLockRoomActivity purchaseLockRoomActivity = this.f47985OooO0Oo;
            String string = purchaseLockRoomActivity.getString(i);
            if (!(string == null || StringsKt.isBlank(string))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().postValue(Long.valueOf(lockBuyModel2.getBalance()));
            purchaseLockRoomActivity.OooOo().f58128OooO0oO.setText(String.valueOf(lockBuyModel2.getDayNum()));
            purchaseLockRoomActivity.OooOo().f58126OooO0o.setText(OooOOOO.OooO0Oo(String.valueOf(lockBuyModel2.getBalance())));
            OooO00o.f24978OooO0o0.f47485OooO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
