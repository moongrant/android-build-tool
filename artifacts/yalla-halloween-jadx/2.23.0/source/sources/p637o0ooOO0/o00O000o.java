package p637o0ooOO0;

import com.google.common.util.concurrent.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p030OoooO.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000o extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO00o f57404OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(OooOO0O oooOO0O) {
        super(1);
        this.f57404OooO0Oo = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.f57404OooO0Oo.cancel(false);
        return Unit.INSTANCE;
    }
}
