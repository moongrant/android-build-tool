package p600o0oo00OO;

import androidx.compose.foundation.layout.SizeKt;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o0O00O;
import p029Oooo0oO.o000O0Oo;
import p029Oooo0oO.o000OO00;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ HeadFrameViewModel f48039Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(HeadFrameViewModel headFrameViewModel) {
        super(2);
        this.f48039Oooo0o = headFrameViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            float f = 14;
            o000OO00.OooO00o(new o000O0Oo.OooO00o(4), SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), null, new o0O00O(f, 0, f, 53), false, null, null, null, false, new o000O00(this.f48039Oooo0o), ooo00o2, 3120, 500);
        }
        return Unit.INSTANCE;
    }
}
