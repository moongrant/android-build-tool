package p533o0o0OOOo;

import androidx.appcompat.widget.o00000O0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public interface oO00000 {

    public static final class OooO00o {
        @NotNull
        public static String OooO00o(@NotNull oO00000 oo00000) {
            String simpleName = oo00000.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this.javaClass.simpleName");
            return simpleName;
        }

        public static void OooO0O0(@NotNull oO00000 oo00000, int i, @Nullable byte[] bArr) {
            String strOooO00o = oo00000.OooO00o();
            StringBuilder sbOooO00o = o00000O0.OooO00o("type = ", i, ", data = ");
            sbOooO00o.append(bArr != null ? new String(bArr, Charsets.UTF_8) : "");
            o00O00.OooO0OO(strOooO00o, sbOooO00o.toString());
        }
    }

    @NotNull
    String OooO00o();
}
