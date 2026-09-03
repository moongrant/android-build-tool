package p024Oooo0O0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p023Oooo00o.oO00O0o0;
import p023Oooo00o.oO0OO00o;
import p028Oooo0oO.o00O0O0;
import p032OoooO00.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o0000Ooo implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0OO00o f1018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<Size> f1019OooO0O0 = null;

    public o0000Ooo(@NonNull oO00O0o0 oo00o0o0) {
        this.f1018OooO00o = oo00o0o0.OooO0O0();
    }

    @Override // p032OoooO00.OooO0OO
    @NonNull
    public final ArrayList OooO00o() {
        if (this.f1019OooO0O0 == null) {
            Size[] sizeArrOooO00o = this.f1018OooO00o.OooO00o(34);
            this.f1019OooO0O0 = sizeArrOooO00o != null ? Arrays.asList((Size[]) sizeArrOooO00o.clone()) : Collections.emptyList();
            o00O0O0.OooO00o("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f1019OooO0O0);
        }
        return new ArrayList(this.f1019OooO0O0);
    }
}
