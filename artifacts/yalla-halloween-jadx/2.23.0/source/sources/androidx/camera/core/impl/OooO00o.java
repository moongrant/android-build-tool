package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class OooO00o {
    @NonNull
    public abstract List<UseCaseConfigFactory.CaptureType> OooO00o();

    @NonNull
    public abstract DynamicRange OooO0O0();

    public abstract int OooO0OO();

    @Nullable
    public abstract Config OooO0Oo();

    @NonNull
    public abstract SurfaceConfig OooO0o();

    @NonNull
    public abstract Size OooO0o0();

    @Nullable
    public abstract Range<Integer> OooO0oO();

    @NonNull
    public final OooOo OooO0oo(@NonNull Oooo000.OooO00o oooO00o) {
        Size sizeOooO0o0 = OooO0o0();
        Range<Integer> range = o00OO0O0.f3743OooO00o;
        OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
        if (sizeOooO0o0 == null) {
            throw new NullPointerException("Null resolution");
        }
        oooO00o2.f3591OooO00o = sizeOooO0o0;
        oooO00o2.OooO0O0(o00OO0O0.f3743OooO00o);
        oooO00o2.f3592OooO0O0 = DynamicRange.f3400OooO0Oo;
        DynamicRange dynamicRangeOooO0O0 = OooO0O0();
        if (dynamicRangeOooO0O0 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        oooO00o2.f3592OooO0O0 = dynamicRangeOooO0O0;
        oooO00o2.f3594OooO0Oo = oooO00o;
        if (OooO0oO() != null) {
            oooO00o2.OooO0O0(OooO0oO());
        }
        return oooO00o2.OooO00o();
    }
}
