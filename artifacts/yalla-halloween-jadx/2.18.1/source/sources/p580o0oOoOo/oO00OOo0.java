package p580o0oOoOo;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import o0000O0O.o00Oo0;
import p028Oooo0o0.o00O0O0O;
import p028Oooo0o0.o0O0O0O;
import p031OoooO.o000O0O0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p507o0o00oOO.o0000O0;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOo0 extends Lambda implements Function3<o0O0O0O, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f46545Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46546Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOo0(long j, int i) {
        super(3);
        this.f46545Oooo0o = j;
        this.f46546Oooo0oO = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O0O0O o0o0o0o, oOO00O ooo00o, Integer num) {
        String strOooO00o;
        o0O0O0O TextButton = o0o0o0o;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (this.f46545Oooo0o > 0) {
                ooo00o2.OooO0o0(477928684);
                String strOooO00o2 = OooO0OO.OooO00o(R.string.Invite, ooo00o2);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                long j = o0000O0.f41693OooO0OO;
                o000O0O0.OooO0OO(strOooO00o2, null, j, o00Oo0.OooO0OO(16), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 3456, 0, 65522);
                StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
                long j2 = this.f46545Oooo0o;
                DecimalFormat decimalFormat = new DecimalFormat("00");
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                sbOooO00o.append(decimalFormat.format(timeUnit.toHours(j2)) + ':' + decimalFormat.format(timeUnit.toMinutes(j2 % ((long) 3600000))) + ':' + decimalFormat.format(timeUnit.toSeconds(j2 % ((long) 60000))));
                sbOooO00o.append(')');
                o000O0O0.OooO0OO(sbOooO00o.toString(), null, j, o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 3456, 0, 65522);
                ooo00o2.Oooo0o0();
            } else {
                ooo00o2.OooO0o0(477928929);
                o00O o00o2 = o00O.f43140OooO00o;
                int iIntValue2 = ((Number) o00O.f43172Oooo000.getValue()).intValue();
                if (this.f46546Oooo0oO > 0) {
                    ooo00o2.OooO0o0(477929102);
                    strOooO00o = OooOo.OooO00o(OooOo.OooO00o(OooO0OO.OooO00o(R.string.Invite_x_x, ooo00o2), String.valueOf(this.f46546Oooo0oO)), String.valueOf(iIntValue2));
                    ooo00o2.Oooo0o0();
                } else {
                    ooo00o2.OooO0o0(477929276);
                    strOooO00o = OooOo.OooO00o(OooO0OO.OooO00o(R.string.Invite_x, ooo00o2), String.valueOf(this.f46546Oooo0oO));
                    ooo00o2.Oooo0o0();
                }
                o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                o000O0O0.OooO0OO(strOooO00o, null, o0000O0.f41693OooO0OO, o00Oo0.OooO0OO(16), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 3456, 0, 65522);
                ooo00o2.Oooo0o0();
            }
        }
        return Unit.INSTANCE;
    }
}
