package p587o0oOooO;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.WebFrom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p388o0OOooO.oo0o0Oo;
import p425o0OoO0OO.o000;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOOo0O {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebFrom.values().length];
            try {
                iArr[WebFrom.RoomActivity.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebFrom.ActivityNotice.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebFrom.RoomMainBanner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebFrom.PrivateChatShare.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebFrom.MomentActivityBanner.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String OooO00o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!StringsKt.OooO0o(stringBuffer, "?")) {
            stringBuffer.append("?");
        }
        if (!StringsKt.OooO0o(stringBuffer, "&t=") && !StringsKt.OooO0o(stringBuffer, "?t=")) {
            stringBuffer.append("&t=" + System.currentTimeMillis());
        }
        if (!StringsKt.OooO0o(stringBuffer, "&p=") && !StringsKt.OooO0o(stringBuffer, "?p=")) {
            stringBuffer.append("&p=2");
        }
        if (!StringsKt.OooO0o(stringBuffer, "&v=") && !StringsKt.OooO0o(stringBuffer, "?v=")) {
            stringBuffer.append("&v=" + oo0o0Oo.OooO0OO());
        }
        if (!StringsKt.OooO0o(stringBuffer, "&region=") && !StringsKt.OooO0o(stringBuffer, "?region=")) {
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            stringBuffer.append("&region=" + oo0oO0.OooOOO0().getValue());
        }
        if (!StringsKt.OooO0o(stringBuffer, "&statusHeight=") && !StringsKt.OooO0o(stringBuffer, "?statusHeight=")) {
            stringBuffer.append("&statusHeight=" + o000.OooO00o());
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str, @NotNull String key, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        StringBuffer stringBuffer = new StringBuffer(str);
        if (!StringsKt.OooO0o(stringBuffer, "&" + key + "=")) {
            if (!StringsKt.OooO0o(stringBuffer, "?" + key + "=")) {
                if (StringsKt.OooO0o(stringBuffer, "?")) {
                    stringBuffer.append("&" + key + "=" + str2);
                } else {
                    stringBuffer.append("?" + key + "=" + str2);
                }
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final String OooO0OO(@NotNull String str, @Nullable WebFrom webFrom) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuffer stringBuffer = new StringBuffer(str);
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            if (!StringsKt.OooO0o(stringBuffer, "&userid=") && !StringsKt.OooO0o(stringBuffer, "?userid=")) {
                stringBuffer.append("&userid=" + oo0oO0.OooOOo0().getValue());
            }
            int i = webFrom == null ? -1 : OooO00o.$EnumSwitchMapping$0[webFrom.ordinal()];
            String str2 = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? (String) ((MutableLiveData) oo0oO0.f47993OooOoo.getValue()).getValue() : (String) oo0oO0.OooOOOO().getValue();
            if (!StringsKt.OooO0o(stringBuffer, "&token=") && !StringsKt.OooO0o(stringBuffer, "?token=")) {
                stringBuffer.append("&token=" + str2);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
