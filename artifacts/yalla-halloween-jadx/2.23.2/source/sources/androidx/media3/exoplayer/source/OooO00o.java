package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o000O0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class OooO00o implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooOOOO.OooO0OO> f7872OooO00o = new ArrayList<>(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet<OooOOOO.OooO0OO> f7873OooO0O0 = new HashSet<>(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00.OooO00o f7874OooO0OO = new OooOo00.OooO00o(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.OooO0O0.OooO00o f7875OooO0Oo = new androidx.media3.exoplayer.drm.OooO0O0.OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.Oooo0 f7876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Looper f7877OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0oOO f7878OooO0oO;

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO(OooOOOO.OooO0OO oooO0OO) {
        this.f7877OooO0o0.getClass();
        HashSet<OooOOOO.OooO0OO> hashSet = this.f7873OooO0O0;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(oooO0OO);
        if (zIsEmpty) {
            OooOOOo();
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO00o(Handler handler, OooOo00 oooOo00) {
        OooOo00.OooO00o oooO00o = this.f7874OooO0OO;
        oooO00o.getClass();
        oooO00o.f7959OooO0OO.add(new OooOo00.OooO00o.C0151OooO00o(handler, oooOo00));
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0O0(OooOo00 oooOo00) {
        CopyOnWriteArrayList<OooOo00.OooO00o.C0151OooO00o> copyOnWriteArrayList = this.f7874OooO0OO.f7959OooO0OO;
        for (OooOo00.OooO00o.C0151OooO00o c0151OooO00o : copyOnWriteArrayList) {
            if (c0151OooO00o.f7961OooO0O0 == oooOo00) {
                copyOnWriteArrayList.remove(c0151OooO00o);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0o(androidx.media3.exoplayer.drm.OooO0O0 oooO0O0) {
        CopyOnWriteArrayList<androidx.media3.exoplayer.drm.OooO0O0.OooO00o.C0147OooO00o> copyOnWriteArrayList = this.f7875OooO0Oo.f7641OooO0OO;
        for (androidx.media3.exoplayer.drm.OooO0O0.OooO00o.C0147OooO00o c0147OooO00o : copyOnWriteArrayList) {
            if (c0147OooO00o.f7643OooO0O0 == oooO0O0) {
                copyOnWriteArrayList.remove(c0147OooO00o);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0o0(Handler handler, androidx.media3.exoplayer.drm.OooO0O0 oooO0O0) {
        androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f7875OooO0Oo;
        oooO00o.getClass();
        oooO00o.f7641OooO0OO.add(new androidx.media3.exoplayer.drm.OooO0O0.OooO00o.C0147OooO00o(handler, oooO0O0));
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oo(OooOOOO.OooO0OO oooO0OO, @Nullable o000O0O.OooOo oooOo, o0oOO o0ooo2) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f7877OooO0o0;
        p080o000OoO.o00Oo0.OooO00o(looper == null || looper == looperMyLooper);
        this.f7878OooO0oO = o0ooo2;
        androidx.media3.common.Oooo0 oooo0 = this.f7876OooO0o;
        this.f7872OooO00o.add(oooO0OO);
        if (this.f7877OooO0o0 == null) {
            this.f7877OooO0o0 = looperMyLooper;
            this.f7873OooO0O0.add(oooO0OO);
            OooOOo0(oooOo);
        } else if (oooo0 != null) {
            OooO(oooO0OO);
            oooO0OO.OooO00o(this, oooo0);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0(OooOOOO.OooO0OO oooO0OO) {
        ArrayList<OooOOOO.OooO0OO> arrayList = this.f7872OooO00o;
        arrayList.remove(oooO0OO);
        if (!arrayList.isEmpty()) {
            OooOO0O(oooO0OO);
            return;
        }
        this.f7877OooO0o0 = null;
        this.f7876OooO0o = null;
        this.f7878OooO0oO = null;
        this.f7873OooO0O0.clear();
        OooOOoo();
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0O(OooOOOO.OooO0OO oooO0OO) {
        HashSet<OooOOOO.OooO0OO> hashSet = this.f7873OooO0O0;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(oooO0OO);
        if (z && hashSet.isEmpty()) {
            OooOOOO();
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public /* synthetic */ androidx.media3.common.Oooo0 OooOOO() {
        return null;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public /* synthetic */ boolean OooOOO0() {
        return true;
    }

    public void OooOOOO() {
    }

    public void OooOOOo() {
    }

    public final void OooOOo(androidx.media3.common.Oooo0 oooo0) {
        this.f7876OooO0o = oooo0;
        Iterator<OooOOOO.OooO0OO> it = this.f7872OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this, oooo0);
        }
    }

    public abstract void OooOOo0(@Nullable o000O0O.OooOo oooOo);

    public abstract void OooOOoo();
}
