package p590o0oOooo0;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.WebFrom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p423o0OoO0OO.o000O000;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

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
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "?", false, 2, (Object) null)) {
            stringBuffer.append("?");
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&t=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?t=", false, 2, (Object) null)) {
            stringBuffer.append("&t=" + System.currentTimeMillis());
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&p=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?p=", false, 2, (Object) null)) {
            stringBuffer.append("&p=2");
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&v=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?v=", false, 2, (Object) null)) {
            stringBuffer.append("&v=" + oo0o0Oo.OooO0OO());
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&region=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?region=", false, 2, (Object) null)) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            stringBuffer.append("&region=" + o0O00oO0.OooOOO0().getValue());
        }
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&statusHeight=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?statusHeight=", false, 2, (Object) null)) {
            stringBuffer.append("&statusHeight=" + o000O000.OooO00o());
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
        if (!StringsKt__StringsKt.contains$default(stringBuffer, "&" + key + "=", false, 2, (Object) null)) {
            if (!StringsKt__StringsKt.contains$default(stringBuffer, "?" + key + "=", false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default(stringBuffer, "?", false, 2, (Object) null)) {
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
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            if (!StringsKt__StringsKt.contains$default(stringBuffer, "&userid=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?userid=", false, 2, (Object) null)) {
                stringBuffer.append("&userid=" + o0O00oO0.OooOOo0().getValue());
            }
            int i = webFrom == null ? -1 : OooO00o.$EnumSwitchMapping$0[webFrom.ordinal()];
            String str2 = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? (String) ((MutableLiveData) o0O00oO0.f47962OooOoo.getValue()).getValue() : (String) o0O00oO0.OooOOOO().getValue();
            if (!StringsKt__StringsKt.contains$default(stringBuffer, "&token=", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(stringBuffer, "?token=", false, 2, (Object) null)) {
                stringBuffer.append("&token=" + str2);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
