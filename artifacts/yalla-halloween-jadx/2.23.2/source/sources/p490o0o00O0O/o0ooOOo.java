package p490o0o00O0O;

import android.text.method.ReplacementTransformationMethod;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo extends ReplacementTransformationMethod {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final char[] f48928OooO00o = {'\n', '\r'};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final char[] f48929OooO0O0 = {' ', ' '};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static o0ooOOo f48930OooO0OO;

    public static final class OooO00o {
        @NotNull
        public static String OooO00o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String strReplace$default = StringsKt__StringsKt.contains$default(str, "\r", false, 2, (Object) null) ? StringsKt__StringsJVMKt.replace$default(str, "\r", ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 4, (Object) null) : str;
            if (StringsKt__StringsKt.contains$default(str, "\n", false, 2, (Object) null)) {
                strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default, "\n", ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 4, (Object) null);
            }
            return StringsKt__StringsKt.contains$default(str, "\nFEFF", false, 2, (Object) null) ? StringsKt__StringsJVMKt.replace$default(strReplace$default, "\nFEFF", ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 4, (Object) null) : strReplace$default;
        }
    }

    @Override // android.text.method.ReplacementTransformationMethod
    @NotNull
    public final char[] getOriginal() {
        return f48928OooO00o;
    }

    @Override // android.text.method.ReplacementTransformationMethod
    @NotNull
    public final char[] getReplacement() {
        return f48929OooO0O0;
    }
}
