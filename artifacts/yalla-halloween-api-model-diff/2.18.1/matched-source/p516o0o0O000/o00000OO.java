package p516o0o0O000;

import com.yalla.yalla.common.model.WebFrom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0OOO0o;
import p498o0o00Oo0.OooOOO;

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
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "?", false, 2, (Object) null)) {
            stringBuffer.append("?");
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&t=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?t=", false, 2, (Object) null)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("&t=");
            sbOooO0o0.append(System.currentTimeMillis());
            stringBuffer.append(sbOooO0o0.toString());
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&p=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?p=", false, 2, (Object) null)) {
            stringBuffer.append("&p=2");
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&v=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?v=", false, 2, (Object) null)) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("&v=");
            o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
            sbOooO0o1.append(o0OOO0o.OooO00o());
            stringBuffer.append(sbOooO0o1.toString());
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&region=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?region=", false, 2, (Object) null)) {
            StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("&region=");
            sbOooO0o2.append(OooOOO.f41216OooO00o.OooOOO().getValue());
            stringBuffer.append(sbOooO0o2.toString());
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
        if (!StringsKt__StringsKt.contains$default(stringBuffer, Typography.amp + key + '=', false, 2, (Object) null)) {
            if (!StringsKt__StringsKt.contains$default(stringBuffer, '?' + key + '=', false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default(stringBuffer, "?", false, 2, (Object) null)) {
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
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
            if (!StringsKt__StringsKt.contains$default(stringBuffer, "&userid=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?userid=", false, 2, (Object) null)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("&userid=");
                sbOooO0o0.append(oooOOO.OooOo().getValue());
                stringBuffer.append(sbOooO0o0.toString());
            }
            int i = webFrom == null ? -1 : OooO00o.$EnumSwitchMapping$0[webFrom.ordinal()];
            String value = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? oooOOO.OooOo0().getValue() : oooOOO.OooOo00().getValue();
            if (!StringsKt__StringsKt.contains$default(stringBuffer, "&token=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?token=", false, 2, (Object) null)) {
                stringBuffer.append("&token=" + value);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "urlBuffer.toString()");
        return string;
    }
}
