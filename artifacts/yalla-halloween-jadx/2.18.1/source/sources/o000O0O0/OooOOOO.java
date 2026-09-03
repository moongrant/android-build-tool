package o000O0O0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Runnable f28111OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooOo> f28112OooO0O0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<OooOo, OooO00o> f28113OooO0OO = new HashMap();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Lifecycle f28114OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public LifecycleEventObserver f28115OooO0O0;

        public OooO00o(@NonNull Lifecycle lifecycle, @NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.f28114OooO00o = lifecycle;
            this.f28115OooO0O0 = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }

        public final void OooO00o() {
            this.f28114OooO00o.removeObserver(this.f28115OooO0O0);
            this.f28115OooO0O0 = null;
        }
    }

    public OooOOOO(@NonNull Runnable runnable) {
        this.f28111OooO00o = runnable;
    }

    public final void OooO00o(@NonNull OooOo oooOo) {
        this.f28112OooO0O0.add(oooOo);
        this.f28111OooO00o.run();
    }

    public final void OooO0O0(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<OooOo> it = this.f28112OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0OO(menu, menuInflater);
        }
    }

    public final boolean OooO0OO(@NonNull MenuItem menuItem) {
        Iterator<OooOo> it = this.f28112OooO0O0.iterator();
        while (it.hasNext()) {
            if (it.next().OooO00o(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0Oo(@NonNull Menu menu) {
        Iterator<OooOo> it = this.f28112OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().OooO0Oo(menu);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<o000O0O0.OooOo, o000O0O0.OooOOOO$OooO00o>] */
    public final void OooO0o0(@NonNull OooOo oooOo) {
        this.f28112OooO0O0.remove(oooOo);
        OooO00o oooO00o = (OooO00o) this.f28113OooO0OO.remove(oooOo);
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        this.f28111OooO00o.run();
    }
}
