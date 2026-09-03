package p579o0oOoo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apollo.Apollo;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p382o0OOoo0o.o00Ooo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oO000Oo {
    @JvmStatic
    @NotNull
    public static final String OooO00o() {
        return OooO0O0("K3");
    }

    public static String OooO0O0(String str) {
        String strQ = Apollo.INSTANCE.q(str);
        if (!StringsKt.isBlank(strQ)) {
            return strQ;
        }
        if (!o00Ooo.OooO0o0()) {
            throw new NullPointerException("Apollo not init");
        }
        System.exit(1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @JvmStatic
    @NotNull
    public static final String OooO0OO() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt.OooOoO(string, "-", "");
    }
}
