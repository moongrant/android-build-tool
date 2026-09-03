package p539o0o0Oo00;

import java.io.File;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Pair<String, File> f44133Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO(Pair<String, ? extends File> pair) {
        super(0);
        this.f44133Oooo0o = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O.OooO00o(OooO0OO.f44116OooO00o, OooO0OO.OooO0O0(TuplesKt.to("data", this.f44133Oooo0o.getSecond().getAbsolutePath())));
        return Unit.INSTANCE;
    }
}
