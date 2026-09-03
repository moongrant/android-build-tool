package p024Oooo0O0;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p023Oooo00o.oO000o00;
import p023Oooo00o.oOo00o0o;
import p028Oooo0oO.o00O0O0;
import p032OoooO00.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o00000OO implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOo00o0o f1001OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<Size> f1002OooO0O0 = null;

    public o00000OO(@NonNull oO000o00 oo000o00) {
        this.f1001OooO00o = oo000o00.OooO0O0();
    }

    @Override // p032OoooO00.OooO0OO
    @NonNull
    public final ArrayList OooO00o() {
        if (this.f1002OooO0O0 == null) {
            Size[] sizeArrOooO00o = this.f1001OooO00o.OooO00o(34);
            this.f1002OooO0O0 = sizeArrOooO00o != null ? Arrays.asList((Size[]) sizeArrOooO00o.clone()) : Collections.emptyList();
            o00O0O0.OooO00o("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f1002OooO0O0);
        }
        return new ArrayList(this.f1002OooO0O0);
    }
}
