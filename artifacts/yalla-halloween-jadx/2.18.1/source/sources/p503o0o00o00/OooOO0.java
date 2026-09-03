package p503o0o00o00;

import android.text.method.ReplacementTransformationMethod;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0 extends ReplacementTransformationMethod {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public static OooOO0 f41605Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f41606Oooo0o = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final char[] f41607Oooo0oO = {'\n', '\r'};

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final char[] f41608Oooo0oo = {' ', ' '};

    public static final class OooO00o {
        @NotNull
        public final String OooO00o(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            String strOooOo00 = StringsKt__StringsKt.contains$default(str, "\r", false, 2, (Object) null) ? StringsKt.OooOo00(str, "\r", ZegoConstants.ZegoVideoDataAuxPublishingStream) : str;
            if (StringsKt__StringsKt.contains$default(str, "\n", false, 2, (Object) null)) {
                strOooOo00 = StringsKt.OooOo00(strOooOo00, "\n", ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
            return StringsKt__StringsKt.contains$default(str, "\nFEFF", false, 2, (Object) null) ? StringsKt.OooOo00(strOooOo00, "\nFEFF", ZegoConstants.ZegoVideoDataAuxPublishingStream) : strOooOo00;
        }
    }

    @Override // android.text.method.ReplacementTransformationMethod
    @NotNull
    public final char[] getOriginal() {
        return f41607Oooo0oO;
    }

    @Override // android.text.method.ReplacementTransformationMethod
    @NotNull
    public final char[] getReplacement() {
        return f41608Oooo0oo;
    }
}
