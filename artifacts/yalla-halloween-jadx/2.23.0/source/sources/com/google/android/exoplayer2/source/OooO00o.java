package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p200o00o0o.o0O0OOO0;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class OooO00o implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<OooOOOO.OooO0OO> f12973OooO00o = new ArrayList<>(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet<OooOOOO.OooO0OO> f12974OooO0O0 = new HashSet<>(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo00.OooO00o f12975OooO0OO = new OooOo00.OooO00o(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0O0.OooO00o f12976OooO0Oo = new com.google.android.exoplayer2.drm.OooO0O0.OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f12977OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Looper f12978OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0O0OOO0 f12979OooO0oO;

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO(OooOOOO.OooO0OO oooO0OO) {
        HashSet<OooOOOO.OooO0OO> hashSet = this.f12974OooO0O0;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(oooO0OO);
        if (z && hashSet.isEmpty()) {
            OooOOOO();
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO00o(OooOOOO.OooO0OO oooO0OO) {
        ArrayList<OooOOOO.OooO0OO> arrayList = this.f12973OooO00o;
        arrayList.remove(oooO0OO);
        if (!arrayList.isEmpty()) {
            OooO(oooO0OO);
            return;
        }
        this.f12978OooO0o0 = null;
        this.f12977OooO0o = null;
        this.f12979OooO0oO = null;
        this.f12974OooO0O0.clear();
        OooOOoo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0O0(Handler handler, OooOo00 oooOo00) {
        OooOo00.OooO00o oooO00o = this.f12975OooO0OO;
        oooO00o.getClass();
        oooO00o.f13060OooO0OO.add(new OooOo00.OooO00o.C0209OooO00o(handler, oooOo00));
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0OO(OooOo00 oooOo00) {
        CopyOnWriteArrayList<OooOo00.OooO00o.C0209OooO00o> copyOnWriteArrayList = this.f12975OooO0OO.f13060OooO0OO;
        for (OooOo00.OooO00o.C0209OooO00o c0209OooO00o : copyOnWriteArrayList) {
            if (c0209OooO00o.f13062OooO0O0 == oooOo00) {
                copyOnWriteArrayList.remove(c0209OooO00o);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o(OooOOOO.OooO0OO oooO0OO, @Nullable o00O0OO0 o00o0oo1, o0O0OOO0 o0o0ooo0) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f12978OooO0o0;
        o00O000o.OooO00o(looper == null || looper == looperMyLooper);
        this.f12979OooO0oO = o0o0ooo0;
        oo0o0Oo oo0o0oo = this.f12977OooO0o;
        this.f12973OooO00o.add(oooO0OO);
        if (this.f12978OooO0o0 == null) {
            this.f12978OooO0o0 = looperMyLooper;
            this.f12974OooO0O0.add(oooO0OO);
            OooOOo0(o00o0oo1);
        } else if (oo0o0oo != null) {
            OooO0oO(oooO0OO);
            oooO0OO.OooO00o(this, oo0o0oo);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0oO(OooOOOO.OooO0OO oooO0OO) {
        this.f12978OooO0o0.getClass();
        HashSet<OooOOOO.OooO0OO> hashSet = this.f12974OooO0O0;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(oooO0OO);
        if (zIsEmpty) {
            OooOOOo();
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0(Handler handler, com.google.android.exoplayer2.drm.OooO0O0 oooO0O0) {
        com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o = this.f12976OooO0Oo;
        oooO00o.getClass();
        oooO00o.f11771OooO0OO.add(new com.google.android.exoplayer2.drm.OooO0O0.OooO00o.C0201OooO00o(handler, oooO0O0));
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0O(com.google.android.exoplayer2.drm.OooO0O0 oooO0O0) {
        CopyOnWriteArrayList<com.google.android.exoplayer2.drm.OooO0O0.OooO00o.C0201OooO00o> copyOnWriteArrayList = this.f12976OooO0Oo.f11771OooO0OO;
        for (com.google.android.exoplayer2.drm.OooO0O0.OooO00o.C0201OooO00o c0201OooO00o : copyOnWriteArrayList) {
            if (c0201OooO00o.f11773OooO0O0 == oooO0O0) {
                copyOnWriteArrayList.remove(c0201OooO00o);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public /* synthetic */ oo0o0Oo OooOOO() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public /* synthetic */ boolean OooOOO0() {
        return true;
    }

    public void OooOOOO() {
    }

    public void OooOOOo() {
    }

    public final void OooOOo(oo0o0Oo oo0o0oo) {
        this.f12977OooO0o = oo0o0oo;
        Iterator<OooOOOO.OooO0OO> it = this.f12973OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this, oo0o0oo);
        }
    }

    public abstract void OooOOo0(@Nullable o00O0OO0 o00o0oo1);

    public abstract void OooOOoo();
}
