package p535o0o0OOoO;

import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O00O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainActivity f43654Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(MainActivity mainActivity) {
        super(2);
        this.f43654Oooo0o = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            MainActivity mainActivity = this.f43654Oooo0o;
            MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
            oO0O0O00.OooO0O0(mainActivity.OooOoo().f49535OooO0OO, this.f43654Oooo0o.Oooo000(), ooo00o2, 72);
        }
        return Unit.INSTANCE;
    }
}
