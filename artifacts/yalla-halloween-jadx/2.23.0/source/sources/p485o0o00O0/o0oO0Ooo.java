package p485o0o00O0;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p579o0oOoo.oO0O0O00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f48016OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivityVM f48017OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f48018OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(MutableState<Boolean> mutableState, oO0O0O00 oo0o0o00, MomentDetailActivityVM momentDetailActivityVM) {
        super(0);
        this.f48016OooO0Oo = mutableState;
        this.f48018OooO0o0 = oo0o0o00;
        this.f48017OooO0o = momentDetailActivityVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f48016OooO0Oo.getValue().booleanValue()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.gift_cannot_send_to_yourself);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            oO0O0O00 oo0o0o00 = this.f48018OooO0o0;
            if (oo0o0o00 != null) {
                oo0o0o00.OooO00o(this.f48017OooO0o.getMPostDetailModel().getValue());
            }
        }
        return Unit.INSTANCE;
    }
}
