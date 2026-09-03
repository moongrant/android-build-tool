package p526o0o0OO0O;

import android.content.Intent;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function3<Integer, Integer, Intent, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f53289OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o0000O0 o0000o1) {
        super(3);
        this.f53289OooO0Oo = o0000o1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Integer num, Integer num2, Intent intent) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        if (iIntValue == this.f53289OooO0Oo.f53274OooO0OO) {
            boolean z = true;
            if (iIntValue2 == -1) {
                String strOooO0OO = o0000.OooO0OO(o000000.Share_Shared_successfully);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (iIntValue2 != 0) {
                String strOooO0OO2 = o0000.OooO0OO(o000000.Share_Failed_to_share);
                if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            } else {
                o0000O00.OooO0O0("Share Instagram onCancel");
            }
        }
        return Unit.INSTANCE;
    }
}
