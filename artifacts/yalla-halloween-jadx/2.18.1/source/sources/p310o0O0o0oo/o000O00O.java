package p310o0O0o0oo;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.OooO00o;
import com.google.android.exoplayer2.o000oOoO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000O00O implements o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<o00O00O.OooO0O0> f36268OooO00o = new ArrayList<>(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet<o00O00O.OooO0O0> f36269OooO0O0 = new HashSet<>(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O00.OooO00o f36270OooO0OO = new o00O0O00.OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o.C0097OooO00o f36271OooO0Oo = new OooO00o.C0097OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o000oOoO f36272OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Looper f36273OooO0o0;

    @Override // p310o0O0o0oo.o00O00O
    public /* synthetic */ boolean OooO() {
        return true;
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooO00o(o00O00O.OooO0O0 oooO0O0) {
        Objects.requireNonNull(this.f36273OooO0o0);
        boolean zIsEmpty = this.f36269OooO0O0.isEmpty();
        this.f36269OooO0O0.add(oooO0O0);
        if (zIsEmpty) {
            OooOOOO();
        }
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooO0O0(o00O00O.OooO0O0 oooO0O0) {
        this.f36268OooO00o.remove(oooO0O0);
        if (!this.f36268OooO00o.isEmpty()) {
            OooOO0o(oooO0O0);
            return;
        }
        this.f36273OooO0o0 = null;
        this.f36272OooO0o = null;
        this.f36269OooO0O0.clear();
        OooOOo();
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooO0OO(o00O0O00 o00o0o01) {
        o00O0O00.OooO00o oooO00o = this.f36270OooO0OO;
        for (o00O0O00.OooO00o.C0369OooO00o c0369OooO00o : oooO00o.f36345OooO0OO) {
            if (c0369OooO00o.f36348OooO0O0 == o00o0o01) {
                oooO00o.f36345OooO0OO.remove(c0369OooO00o);
            }
        }
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooO0o0(o00O00O.OooO0O0 oooO0O0, @Nullable p709oo0oOOo.o000oOoO o000oooo2) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f36273OooO0o0;
        o00000O0.OooO00o(looper == null || looper == looperMyLooper);
        o000oOoO o000oooo3 = this.f36272OooO0o;
        this.f36268OooO00o.add(oooO0O0);
        if (this.f36273OooO0o0 == null) {
            this.f36273OooO0o0 = looperMyLooper;
            this.f36269OooO0O0.add(oooO0O0);
            OooOOOo(o000oooo2);
        } else if (o000oooo3 != null) {
            OooO00o(oooO0O0);
            oooO0O0.OooO00o(this, o000oooo3);
        }
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooO0oO(Handler handler, OooO00o oooO00o) {
        OooO00o.C0097OooO00o c0097OooO00o = this.f36271OooO0Oo;
        Objects.requireNonNull(c0097OooO00o);
        c0097OooO00o.f13722OooO0OO.add(new OooO00o.C0097OooO00o.C0098OooO00o(handler, oooO00o));
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooOO0(Handler handler, o00O0O00 o00o0o01) {
        o00O0O00.OooO00o oooO00o = this.f36270OooO0OO;
        Objects.requireNonNull(oooO00o);
        oooO00o.f36345OooO0OO.add(new o00O0O00.OooO00o.C0369OooO00o(handler, o00o0o01));
    }

    @Override // p310o0O0o0oo.o00O00O
    public /* synthetic */ o000oOoO OooOO0O() {
        return null;
    }

    @Override // p310o0O0o0oo.o00O00O
    public final void OooOO0o(o00O00O.OooO0O0 oooO0O0) {
        boolean z = !this.f36269OooO0O0.isEmpty();
        this.f36269OooO0O0.remove(oooO0O0);
        if (z && this.f36269OooO0O0.isEmpty()) {
            OooOOO();
        }
    }

    public void OooOOO() {
    }

    public void OooOOOO() {
    }

    public abstract void OooOOOo(@Nullable p709oo0oOOo.o000oOoO o000oooo2);

    public abstract void OooOOo();

    public final void OooOOo0(o000oOoO o000oooo2) {
        this.f36272OooO0o = o000oooo2;
        Iterator<o00O00O.OooO0O0> it = this.f36268OooO00o.iterator();
        while (it.hasNext()) {
            it.next().OooO00o(this, o000oooo2);
        }
    }
}
