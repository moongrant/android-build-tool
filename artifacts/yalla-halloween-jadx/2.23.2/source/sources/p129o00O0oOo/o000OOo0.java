package p129o00O0oOo;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p641o0ooOO0o.o0O000Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 extends Lambda implements Function0<o0O000Oo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00 f36745OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o00 o00Var) {
        super(0);
        this.f36745OooO0Oo = o00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0O000Oo invoke() {
        String strOooO00o = this.f36745OooO0Oo.f36742OooO0o.OooO00o("Content-Type");
        if (strOooO00o == null) {
            return null;
        }
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        return o0O000Oo.OooO00o.OooO0O0(strOooO00o);
    }
}
