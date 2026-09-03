package p605o0oo0O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0oo0o {
    @JvmStatic
    @NotNull
    public static final String OooO00o(@Nullable String str) {
        if (str == null || !StringsKt__StringsKt.contains$default(str, "\u3000", false, 2, (Object) null)) {
            return str == null ? "" : str;
        }
        return StringsKt__StringsJVMKt.replace$default(str, "\u3000", ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 4, (Object) null);
    }
}
