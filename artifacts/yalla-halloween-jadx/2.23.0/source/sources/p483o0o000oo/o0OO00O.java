package p483o0o000oo;

import android.text.method.ReplacementTransformationMethod;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O extends ReplacementTransformationMethod {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final char[] f47706OooO00o = {'\n', '\r'};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final char[] f47707OooO0O0 = {' ', ' '};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static o0OO00O f47708OooO0OO;

    public static final class OooO00o {
        @NotNull
        public static String OooO00o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String strOooOoO = StringsKt.OooO0o(str, "\r") ? StringsKt.OooOoO(str, "\r", ZegoConstants.ZegoVideoDataAuxPublishingStream) : str;
            if (StringsKt.OooO0o(str, "\n")) {
                strOooOoO = StringsKt.OooOoO(strOooOoO, "\n", ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            return StringsKt.OooO0o(str, "\nFEFF") ? StringsKt.OooOoO(strOooOoO, "\nFEFF", ZegoConstants.ZegoVideoDataAuxPublishingStream) : strOooOoO;
        }
    }

    @Override // android.text.method.ReplacementTransformationMethod
    @NotNull
    public final char[] getOriginal() {
        return f47706OooO00o;
    }

    @Override // android.text.method.ReplacementTransformationMethod
    @NotNull
    public final char[] getReplacement() {
        return f47707OooO0O0;
    }
}
