package p546o0o0Ooo0;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00Oo0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oO00Oo0 f44429Oooo0o = new oO00Oo0();

    public oO00Oo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Objects.requireNonNull(o00O000.OooO());
        o00 o00Var = o00O000.f32468OooO00o;
        if (o00Var != null) {
            o00Var.OooO0o(10047, "{\"type\":" + iIntValue + "}");
        }
        return Unit.INSTANCE;
    }
}
