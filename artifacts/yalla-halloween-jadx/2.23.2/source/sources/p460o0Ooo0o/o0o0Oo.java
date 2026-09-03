package p460o0Ooo0o;

import OooO0O0.OooO0O0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<Byte, CharSequence> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0o0Oo f47805OooO0Oo = new o0o0Oo();

    public o0o0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b) {
        return OooO0O0.OooO00o(new Object[]{Byte.valueOf(b.byteValue())}, 1, "%02x", "format(this, *args)");
    }
}
