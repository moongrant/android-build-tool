package p579o0oOoo;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.WebFrom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo0o.o00Ooo;
import p417o0OoO0.o0ooOOo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
public final class oOo0o00 {

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
            stringBuffer.append("&v=" + o00Ooo.OooO0OO());
        }
        if (!StringsKt.OooO0o(stringBuffer, "&region=") && !StringsKt.OooO0o(stringBuffer, "?region=")) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            stringBuffer.append("&region=" + o000000O.OooOOO0().getValue());
        }
        if (!StringsKt.OooO0o(stringBuffer, "&statusHeight=") && !StringsKt.OooO0o(stringBuffer, "?statusHeight=")) {
            stringBuffer.append("&statusHeight=" + o0ooOOo.OooO00o());
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
        Intrinsics.checkNotNullExpressionValue(string, "urlBuffer.toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final String OooO0OO(@NotNull String str, @Nullable WebFrom webFrom) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuffer stringBuffer = new StringBuffer(str);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            if (!StringsKt.OooO0o(stringBuffer, "&userid=") && !StringsKt.OooO0o(stringBuffer, "?userid=")) {
                stringBuffer.append("&userid=" + o000000O.OooOOo0().getValue());
            }
            int i = webFrom == null ? -1 : OooO00o.$EnumSwitchMapping$0[webFrom.ordinal()];
            String str2 = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? (String) ((MutableLiveData) o000000O.f46700OooOoo.getValue()).getValue() : (String) o000000O.OooOOOO().getValue();
            if (!StringsKt.OooO0o(stringBuffer, "&token=") && !StringsKt.OooO0o(stringBuffer, "?token=")) {
                stringBuffer.append("&token=" + str2);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "urlBuffer.toString()");
        return string;
    }
}
