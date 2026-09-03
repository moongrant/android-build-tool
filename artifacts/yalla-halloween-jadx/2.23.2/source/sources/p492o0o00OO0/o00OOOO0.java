package p492o0o00OO0;

import com.yalla.yalla.model.PollConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p494o0o00OOo.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function1<PollConfig, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OOOO0 f49192OooO0Oo = new o00OOOO0();

    public o00OOOO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PollConfig pollConfig) {
        PollConfig pollConfig2 = pollConfig;
        o000oOoO.f49577OooO0Oo = pollConfig2 != null ? pollConfig2.getMaxOptionCount() : 4;
        return Unit.INSTANCE;
    }
}
