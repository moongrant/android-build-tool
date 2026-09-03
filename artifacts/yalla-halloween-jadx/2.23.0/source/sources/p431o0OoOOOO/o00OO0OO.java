package p431o0OoOOOO;

import OooO0O0.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.qiniu.android.http.ResponseInfo;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OO0OO {
    @NotNull
    public static String OooO00o(long j, @NotNull String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strValueOf = String.valueOf((j / ((long) ResponseInfo.UnknownError)) / 100.0d);
        StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null);
        strValueOf.getClass();
        return o0OoOo0.OooO00o(priceCurrencyCode, ZegoConstants.ZegoVideoDataAuxPublishingStream, OooO0O0.OooO00o(new Object[]{Double.valueOf(com.code.android.util.o0OoOo0.OooO0OO(strValueOf, 0.0d))}, 1, "%.2f", "format(format, *args)"));
    }
}
