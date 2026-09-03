package p025Oooo0OO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o00O0OO0;
import java.util.Iterator;
import java.util.List;
import p024Oooo0O0.o00;
import p024Oooo0O0.o0000O0O;
import p024Oooo0O0.o00O000o;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f1045OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f1046OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1047OooO0OO;

    public o00000O0(@NonNull o00O0OO0 o00o0oo1, @NonNull o00O0OO0 o00o0oo2) {
        this.f1045OooO00o = o00o0oo2.OooO00o(o00O000o.class);
        this.f1046OooO0O0 = o00o0oo1.OooO00o(o00.class);
        this.f1047OooO0OO = o00o0oo1.OooO00o(o0000O0O.class);
    }

    public final void OooO00o(@Nullable List<DeferrableSurface> list) {
        if (!(this.f1045OooO00o || this.f1046OooO0O0 || this.f1047OooO0OO) || list == null) {
            return;
        }
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
        o00O0O0.OooO00o("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }
}
