package p440o0OoOo0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.view.OooO00o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p030OoooO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ List f47189OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ CameraInfo f47190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f47191OooO0OO;

    public o00O0O(o0Oo0oo o0oo0oo2, OooO00o oooO00o, ArrayList arrayList) {
        this.f47191OooO0OO = oooO00o;
        this.f47189OooO00o = arrayList;
        this.f47190OooO0O0 = o0oo0oo2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        this.f47191OooO0OO.f4110OooO0o0 = null;
        List list = this.f47189OooO00o;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o0Oo0oo) this.f47190OooO0O0).OooOO0((o000oOoO) it.next());
        }
        list.clear();
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r2) {
        this.f47191OooO0OO.f4110OooO0o0 = null;
    }
}
