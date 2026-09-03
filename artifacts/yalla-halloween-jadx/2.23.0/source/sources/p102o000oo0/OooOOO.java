package p102o000oo0;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function1<IOException, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f35643OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOO0O oooOO0O) {
        super(1);
        this.f35643OooO0Oo = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IOException iOException) {
        this.f35643OooO0Oo.f35619OooOOO = true;
        return Unit.INSTANCE;
    }
}
