package p025Oooo0OO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.oo0o0O0;
import java.util.Iterator;
import java.util.List;
import p024Oooo0O0.o0000O0;
import p024Oooo0O0.o000OOo0;
import p024Oooo0O0.o00O000;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f1034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f1035OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1036OooO0OO;

    public o00000O0(@NonNull oo0o0O0 oo0o0o0, @NonNull oo0o0O0 oo0o0o1) {
        this.f1034OooO00o = oo0o0o1.OooO00o(o00O000.class);
        this.f1035OooO0O0 = oo0o0o0.OooO00o(o000OOo0.class);
        this.f1036OooO0OO = oo0o0o0.OooO00o(o0000O0.class);
    }

    public final void OooO00o(@Nullable List<DeferrableSurface> list) {
        if (!(this.f1034OooO00o || this.f1035OooO0O0 || this.f1036OooO0OO) || list == null) {
            return;
        }
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
        o00O0O0.OooO00o("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }
}
