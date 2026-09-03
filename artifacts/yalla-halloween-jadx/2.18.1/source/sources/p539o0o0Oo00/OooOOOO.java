package p539o0o0Oo00;

import androidx.compose.foundation.layout.PaddingKt;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p031OoooO.o000O0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Pair<String, File> f44141Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(Pair<String, ? extends File> pair) {
        super(2);
        this.f44141Oooo0o = pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            String first = this.f44141Oooo0o.getFirst();
            int i = o00OOOO0.f4197OooO00o;
            o000O0O0.OooO0OO(first, PaddingKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o, 10), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ooo00o2, 48, 0, 65532);
        }
        return Unit.INSTANCE;
    }
}
