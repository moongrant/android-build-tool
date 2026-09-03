package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.LockBuyModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends Lambda implements Function1<LockBuyModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f49304OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f49304OooO0Oo = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockBuyModel lockBuyModel) {
        LockBuyModel lockBuyModel2 = lockBuyModel;
        if (lockBuyModel2 != null) {
            int i = o000000.Purchase_successful;
            PurchaseLockRoomActivity purchaseLockRoomActivity = this.f49304OooO0Oo;
            String string = purchaseLockRoomActivity.getString(i);
            if (!(string == null || StringsKt.isBlank(string))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().postValue(Long.valueOf(lockBuyModel2.getBalance()));
            purchaseLockRoomActivity.OooOo().f45250OooO0oO.setText(String.valueOf(lockBuyModel2.getDayNum()));
            purchaseLockRoomActivity.OooOo().f45248OooO0o.setText(o0O0O0Oo.OooO0Oo(String.valueOf(lockBuyModel2.getBalance())));
            OooO00o.f24516OooO0o0.f48458OooO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
