package p023Oooo00o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class oO0OO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final StreamConfigurationMap f971OooO00o;

    @RequiresApi(23)
    public static class OooO00o {
        @DoNotInline
        public static Size[] OooO00o(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    public oO0OO00o(@NonNull StreamConfigurationMap streamConfigurationMap) {
        this.f971OooO00o = streamConfigurationMap;
    }
}
