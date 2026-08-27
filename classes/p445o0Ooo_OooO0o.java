package p445o0Ooo;

import com.yalla.yalla.model.ReportFromData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface OooO0o {

    public static final class OooO00o {
        public static /* synthetic */ void OooO00o(OooO0o oooO0o, int i, long j, ArrayList arrayList, Long l, Boolean bool, Integer num, String str, Integer num2, int i2) {
            if ((i2 & 4) != 0) {
                arrayList = null;
            }
            if ((i2 & 8) != 0) {
                l = null;
            }
            if ((i2 & 16) != 0) {
                bool = null;
            }
            if ((i2 & 32) != 0) {
                num = null;
            }
            if ((i2 & 64) != 0) {
                str = null;
            }
            if ((i2 & 128) != 0) {
                num2 = null;
            }
            oooO0o.OooO00o(i, j, arrayList, l, bool, num, str, num2, (i2 & 256) == 0);
        }
    }

    void OooO00o(int i, long j, @Nullable List<ReportFromData> list, @Nullable Long l, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, boolean z);
}
