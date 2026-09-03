package p110o000ooo0;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p634o0ooO0oO.o00OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 extends Lambda implements Function0<o00OOO0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000O f35911OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o000000O o000000o2) {
        super(0);
        this.f35911OooO0Oo = o000000o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o00OOO0 invoke() {
        String strOooO00o = this.f35911OooO0Oo.f35916OooO0o.OooO00o("Content-Type");
        if (strOooO00o == null) {
            return null;
        }
        Pattern pattern = o00OOO0.f57234OooO0o0;
        return o00OOO0.OooO00o.OooO0O0(strOooO00o);
    }
}
