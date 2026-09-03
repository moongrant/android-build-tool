package p238o00oo0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlStyle;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OOO0o {
    @Nullable
    public static TtmlStyle OooO00o(@Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, Map<String, TtmlStyle> map) {
        int i = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i < length) {
                    ttmlStyle2.OooO00o(map.get(strArr[i]));
                    i++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ttmlStyle.OooO00o(map.get(strArr[0]));
                return ttmlStyle;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ttmlStyle.OooO00o(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ttmlStyle;
    }
}
