package p518o0o0O000;

import com.yalla.yalla.common.model.WebFrom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p489o0o000oO.o0ooOOo;
import p500o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebFrom.values().length];
            iArr[WebFrom.RoomActivity.ordinal()] = 1;
            iArr[WebFrom.ActivityNotice.ordinal()] = 2;
            iArr[WebFrom.RoomMainBanner.ordinal()] = 3;
            iArr[WebFrom.PrivateChatShare.ordinal()] = 4;
            iArr[WebFrom.MomentActivityBanner.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String OooO00o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!StringsKt.OooO0OO(stringBuffer, "?")) {
            stringBuffer.append("?");
        }
        if (!StringsKt.OooO0OO(stringBuffer, "&t=") && !StringsKt.OooO0OO(stringBuffer, "?t=")) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("&t=");
            sbOooO0O0.append(System.currentTimeMillis());
            stringBuffer.append(sbOooO0O0.toString());
        }
        if (!StringsKt.OooO0OO(stringBuffer, "&p=") && !StringsKt.OooO0OO(stringBuffer, "?p=")) {
            stringBuffer.append("&p=2");
        }
        if (!StringsKt.OooO0OO(stringBuffer, "&v=") && !StringsKt.OooO0OO(stringBuffer, "?v=")) {
            StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("&v=");
            o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
            sbOooO0O1.append(o0ooOOo.OooO00o());
            stringBuffer.append(sbOooO0O1.toString());
        }
        if (!StringsKt.OooO0OO(stringBuffer, "&region=") && !StringsKt.OooO0OO(stringBuffer, "?region=")) {
            StringBuilder sbOooO0O2 = OooO00o.OooO00o.OooO0O0("&region=");
            sbOooO0O2.append(OooOOO.f41235OooO00o.OooOOO().getValue());
            stringBuffer.append(sbOooO0O2.toString());
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "urlBuffer.toString()");
        return string;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull String key, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!StringsKt.OooO0OO(stringBuffer, Typography.amp + key + '=')) {
            if (!StringsKt.OooO0OO(stringBuffer, '?' + key + '=')) {
                if (StringsKt.OooO0OO(stringBuffer, "?")) {
                    stringBuffer.append(Typography.amp + key + '=' + str2);
                } else {
                    stringBuffer.append('?' + key + '=' + str2);
                }
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "urlBuffer.toString()");
        return string;
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, @Nullable WebFrom webFrom) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuffer stringBuffer = new StringBuffer(str);
        OooOOO oooOOO = OooOOO.f41235OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
            if (!StringsKt.OooO0OO(stringBuffer, "&userid=") && !StringsKt.OooO0OO(stringBuffer, "?userid=")) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("&userid=");
                sbOooO0O0.append(oooOOO.OooOo().getValue());
                stringBuffer.append(sbOooO0O0.toString());
            }
            int i = webFrom == null ? -1 : OooO00o.$EnumSwitchMapping$0[webFrom.ordinal()];
            String value = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? oooOOO.OooOo0().getValue() : oooOOO.OooOo00().getValue();
            if (!StringsKt.OooO0OO(stringBuffer, "&token=") && !StringsKt.OooO0OO(stringBuffer, "?token=")) {
                stringBuffer.append("&token=" + value);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "urlBuffer.toString()");
        return string;
    }
}
