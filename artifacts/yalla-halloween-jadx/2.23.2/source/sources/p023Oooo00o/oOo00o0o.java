package p023Oooo00o;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import p025Oooo0OO.o0000;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oOo00o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOo00ooO f995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f996OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f997OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f998OooO0Oo = new HashMap();

    public oOo00o0o(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull o0000 o0000Var) {
        new HashMap();
        this.f995OooO00o = new oOo00ooO(streamConfigurationMap);
        this.f996OooO0O0 = o0000Var;
    }

    @Nullable
    public final Size[] OooO00o(int i) {
        HashMap map = this.f997OooO0OO;
        if (map.containsKey(Integer.valueOf(i))) {
            if (((Size[]) map.get(Integer.valueOf(i))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        Size[] outputSizes = this.f995OooO00o.f971OooO00o.getOutputSizes(i);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] sizeArrOooO00o = this.f996OooO0O0.OooO00o(outputSizes, i);
            map.put(Integer.valueOf(i), sizeArrOooO00o);
            return (Size[]) sizeArrOooO00o.clone();
        }
        o00O0O0.OooO0oo("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i);
        return outputSizes;
    }
}
