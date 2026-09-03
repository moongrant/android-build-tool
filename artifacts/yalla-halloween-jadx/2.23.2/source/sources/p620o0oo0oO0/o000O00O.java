package p620o0oo0oO0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import oo0o0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f57582OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O00O f57581OooO00o = new o000O00O();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, Boolean> f57583OooO0OO = new HashMap<>();

    public static void OooO0O0() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            int i = 0;
            while (true) {
                HashMap<String, Boolean> map = f57583OooO0OO;
                if (i >= codecCount) {
                    String msg = "supportType=" + map.keySet();
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MediaUtil", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    return;
                }
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    for (String str : codecInfoAt.getSupportedTypes()) {
                        Intrinsics.checkNotNullExpressionValue(str, "types[j]");
                        String lowerCase = str.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                        map.put(lowerCase, Boolean.TRUE);
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            String msg2 = "getSupportType " + th;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.MediaUtil", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg2, "msg");
        }
    }

    public static int OooO0OO(@NotNull MediaExtractor extractor) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "extractor.getTrackFormat(i)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (StringsKt__StringsJVMKt.startsWith$default(string, "video/", false, 2, null)) {
                StringBuilder sbOooO00o = OooO0O0.OooO00o("Extractor selected track ", i, " (", string, "): ");
                sbOooO00o.append(trackFormat);
                String msg = sbOooO00o.toString();
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MediaUtil", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter(msg, "msg");
                return i;
            }
        }
        return -1;
    }

    public final synchronized boolean OooO00o(@NotNull String mimeType) {
        HashMap<String, Boolean> map;
        String lowerCase;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (!f57582OooO0O0) {
            f57582OooO0O0 = true;
            OooO0O0();
        }
        map = f57583OooO0OO;
        lowerCase = mimeType.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return map.containsKey(lowerCase);
    }
}
