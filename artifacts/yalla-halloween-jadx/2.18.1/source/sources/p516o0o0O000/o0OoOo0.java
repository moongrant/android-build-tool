package p516o0o0O000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apollo.Apollo;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p487o0o000oO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 {
    @JvmStatic
    @NotNull
    public static final String OooO00o() {
        return OooO0OO("IV");
    }

    @JvmStatic
    @NotNull
    public static final String OooO0O0() {
        return OooO0OO("K3");
    }

    public static final String OooO0OO(String str) {
        String strQ = Apollo.f12658OooO00o.q(str);
        if (!StringsKt.isBlank(strQ)) {
            return strQ;
        }
        if (!o0OOO0o.OooO0OO()) {
            throw new NullPointerException("Apollo not init");
        }
        System.exit(1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @JvmStatic
    @NotNull
    public static final String OooO0Oo() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt.OooOo00(string, "-", "");
    }
}
