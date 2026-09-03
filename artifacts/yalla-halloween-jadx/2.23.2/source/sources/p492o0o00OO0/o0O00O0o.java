package p492o0o00OO0;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f49255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivityVM f49256OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ l f49257OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(MutableState<Boolean> mutableState, l lVar, MomentDetailActivityVM momentDetailActivityVM) {
        super(0);
        this.f49255OooO0Oo = mutableState;
        this.f49257OooO0o0 = lVar;
        this.f49256OooO0o = momentDetailActivityVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f49255OooO0Oo.getValue().booleanValue()) {
            String strOooO0OO = o0000.OooO0OO(o000000.gift_cannot_send_to_yourself);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            l lVar = this.f49257OooO0o0;
            if (lVar != null) {
                lVar.OooO00o(this.f49256OooO0o.getMPostDetailModel().getValue());
            }
        }
        return Unit.INSTANCE;
    }
}
