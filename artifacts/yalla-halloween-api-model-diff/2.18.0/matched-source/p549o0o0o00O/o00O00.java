package p549o0o0o00O;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 {
    public static final StringBuilder OooO00o(int i) {
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            switch (i) {
                case 2:
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://roomapi.yalla.live", "https://roomapi.ylapi.cc"}).get(0));
                    break;
                case 3:
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://event.yalla.live", "https://event.ylapi.cc"}).get(0));
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
                    sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"}).get(0));
                    break;
            }
        } else {
            sb.append((String) CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"}).get(0));
        }
        return sb;
    }

    @NotNull
    public static final String OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0OO(str, 0);
    }

    @NotNull
    public static final String OooO0OO(@NotNull String str, int i) {
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt__StringsJVMKt.startsWith$default(str, "http://", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, "https://", false, 2, null)) {
            sb = new StringBuilder(str);
        } else if (StringsKt__StringsJVMKt.startsWith$default(str, "/", false, 2, null)) {
            sb = OooO00o(i);
            if (StringsKt__StringsKt.endsWith$default(sb, "/", false, 2, (Object) null)) {
                String strSubstring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
            } else {
                String strSubstring2 = str.substring(0);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring2);
            }
            Intrinsics.checkNotNullExpressionValue(sb, "{\n        // 配置的接口地址\n   …tring(0))\n        }\n    }");
        } else {
            if (StringsKt__StringsKt.endsWith$default(OooO00o(i), "/", false, 2, (Object) null)) {
                sb = OooO00o(i);
                sb.append(str);
            } else {
                sb = OooO00o(i);
                sb.append("/");
                sb.append(str);
            }
            Intrinsics.checkNotNullExpressionValue(sb, "{\n        // 配置的接口地址\n   …end(path)\n        }\n    }");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fullPath.toString()");
        return string;
    }

    @NotNull
    public static final String OooO0Oo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return OooO0OO(str, 4);
    }
}
