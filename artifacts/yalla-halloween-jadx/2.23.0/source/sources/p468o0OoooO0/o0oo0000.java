package p468o0OoooO0;

import OooO0O0.OooO0O0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<Byte, CharSequence> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0oo0000 f46940OooO0Oo = new o0oo0000();

    public o0oo0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b) {
        return OooO0O0.OooO00o(new Object[]{Byte.valueOf(b.byteValue())}, 1, "%02x", "format(this, *args)");
    }
}
