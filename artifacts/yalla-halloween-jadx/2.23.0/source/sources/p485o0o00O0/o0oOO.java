package p485o0o00O0;

import com.yalla.yalla.model.PollConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p488o0o00O0o.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function1<PollConfig, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0oOO f48019OooO0Oo = new o0oOO();

    public o0oOO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PollConfig pollConfig) {
        PollConfig pollConfig2 = pollConfig;
        o0OOO0o.f48465OooO0Oo = pollConfig2 != null ? pollConfig2.getMaxOptionCount() : 4;
        return Unit.INSTANCE;
    }
}
