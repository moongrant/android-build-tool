package p276o0O000o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0O000O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p449o0OoOoOo.o0OOo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0<IN> implements OooOO0O<IN> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0<IN, ?> f35083OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<Integer> f35084OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0OOo000 f35085OooO0OO;

    public OooOOO0(@NotNull OooOO0<IN, ?> protocol, @NotNull Function0<Integer> state) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f35083OooO00o = protocol;
        this.f35084OooO0O0 = state;
    }

    @Override // p276o0O000o.OooOO0O
    public final int OooO00o(IN in) {
        byte[] message = this.f35083OooO00o.OooO0O0(in);
        Intrinsics.checkNotNullParameter(message, "message");
        int iIntValue = this.f35084OooO0O0.invoke().intValue();
        if (iIntValue != 4) {
            if (iIntValue != 2) {
                return 2;
            }
            o0OOo000 o0ooo001 = this.f35085OooO0OO;
            if (o0ooo001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connection");
                o0ooo001 = null;
            }
            if (o0ooo001.OooOO0(message)) {
                return 0;
            }
        }
        return 1;
    }
}
