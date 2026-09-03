package p382o0OOoOo;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p627o0oo0ooo.x5;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o {
    public static final StringBuilder OooO00o(int i) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            switch (i) {
                case 2:
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://roomapi.yalla.live", "https://roomapi.ylapi.cc"}).get(0));
                    break;
                case 3:
                    sb.append(new x5().OooO00o().get(0));
                    break;
                case 4:
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://payv2.yalla.live", "https://payv2.ylapi.cc"}).get(0));
                    break;
                case 5:
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://search.yalla.live", "https://search.ylapi.cc"}).get(0));
                    break;
                case 6:
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://moment.yalla.live", "https://moment.ylapi.cc"}).get(0));
                    break;
                case 7:
                    sb.append((String) CollectionsKt.listOfNotNull("https://clog.yalla.live").get(0));
                    break;
                default:
                    sb.append(new x5().OooO0o0().get(0));
                    break;
            }
        } else {
            sb.append(new x5().OooO0o0().get(0));
        }
        return sb;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0o0(3, str);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0o0(0, str);
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0o0(6, str);
    }

    @NotNull
    public static final String OooO0o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0o0(2, str);
    }

    @NotNull
    public static final String OooO0o0(int i, @NotNull String str) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.Oooo00o(str, "http://") || StringsKt.Oooo00o(str, "https://")) {
            sb = new StringBuilder(str);
        } else if (StringsKt.Oooo00o(str, "/")) {
            sb = OooO00o(i);
            if (StringsKt__StringsKt.endsWith$default(sb, (CharSequence) "/", false, 2, (Object) null)) {
                String strSubstring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
            } else {
                String strSubstring2 = str.substring(0);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring2);
            }
            Intrinsics.checkNotNull(sb);
        } else {
            if (StringsKt__StringsKt.endsWith$default(OooO00o(i), (CharSequence) "/", false, 2, (Object) null)) {
                sb = OooO00o(i);
                sb.append(str);
            } else {
                sb = OooO00o(i);
                sb.append("/");
                sb.append(str);
            }
            Intrinsics.checkNotNull(sb);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final String OooO0oO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0o0(5, str);
    }
}
