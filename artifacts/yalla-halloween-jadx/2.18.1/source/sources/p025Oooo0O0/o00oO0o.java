package p025Oooo0O0;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.SendChannel;
import o00O0O.OooO;
import o0OO00O.OooO0O0;
import o0OO00O.OooO0OO;
import p418o0Oo0oo.o00Ooo;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function1<o0Oo0oo, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f1685Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f1686Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Orientation f1687Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ SendChannel<OooOo00> f1688Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00oO0o(OooO0O0 oooO0O0, Orientation orientation, SendChannel<? super OooOo00> sendChannel, boolean z) {
        super(1);
        this.f1686Oooo0o = oooO0O0;
        this.f1687Oooo0oO = orientation;
        this.f1688Oooo0oo = sendChannel;
        this.f1685Oooo = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0Oo0oo o0oo0oo2) {
        o0Oo0oo event = o0oo0oo2;
        Intrinsics.checkNotNullParameter(event, "event");
        OooO0OO.OooO0O0(this.f1686Oooo0o, event);
        long jOooO0oO = o00Ooo.OooO0oO(event);
        float fOooO0Oo = this.f1687Oooo0oO == Orientation.Vertical ? OooO.OooO0Oo(jOooO0oO) : OooO.OooO0OO(jOooO0oO);
        event.OooO00o();
        SendChannel<OooOo00> sendChannel = this.f1688Oooo0oo;
        if (this.f1685Oooo) {
            fOooO0Oo *= -1;
        }
        sendChannel.mo2017trySendJP2dKIU(new OooOo00.OooO0O0(fOooO0Oo, event.f39744OooO0OO));
        return Unit.INSTANCE;
    }
}
