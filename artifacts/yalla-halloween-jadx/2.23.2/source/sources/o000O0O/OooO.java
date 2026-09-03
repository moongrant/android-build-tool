package o000O0O;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO {
    public static void OooO00o(@Nullable androidx.media3.datasource.OooO00o oooO00o) {
        if (oooO00o != null) {
            try {
                oooO00o.close();
            } catch (IOException unused) {
            }
        }
    }
}
