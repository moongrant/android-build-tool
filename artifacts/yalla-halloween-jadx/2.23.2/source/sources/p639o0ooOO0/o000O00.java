package p639o0ooOO0;

import com.google.common.util.concurrent.OooOO0O;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f57709OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(p030OoooO.OooOO0O oooOO0O) {
        super(1);
        this.f57709OooO0Oo = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.f57709OooO0Oo.cancel(false);
        return Unit.INSTANCE;
    }
}
