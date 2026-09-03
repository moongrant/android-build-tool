package p538o0o0Oo0;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.LockBuyModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 extends Lambda implements Function1<LockBuyModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PurchaseLockRoomActivity f43979Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(PurchaseLockRoomActivity purchaseLockRoomActivity) {
        super(1);
        this.f43979Oooo0o = purchaseLockRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LockBuyModel lockBuyModel) {
        LockBuyModel lockBuyModel2 = lockBuyModel;
        if (lockBuyModel2 != null) {
            PurchaseLockRoomActivity purchaseLockRoomActivity = this.f43979Oooo0o;
            String string = purchaseLockRoomActivity.getString(R.string.Purchase_successful);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(string == null || StringsKt.isBlank(string))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(lockBuyModel2.getBalance()));
            purchaseLockRoomActivity.OooOooO().f50605OooO0oO.setText(String.valueOf(lockBuyModel2.getDayNum()));
            purchaseLockRoomActivity.OooOooO().f50603OooO0o.setText(o0O0O00.OooO0Oo(String.valueOf(lockBuyModel2.getBalance())));
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43185OoooOO0.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
