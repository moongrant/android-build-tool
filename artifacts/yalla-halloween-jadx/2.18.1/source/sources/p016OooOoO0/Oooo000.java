package p016OooOoO0;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import o000O0O0.o00000O;
import o000O0O0.o00000OO;
import o000O0O0.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Interpolator f361OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00000OO f362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f364OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f360OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f363OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<o00000O> f359OooO00o = new ArrayList<>();

    public class OooO00o extends o0000Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f365OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f366OooO0O0 = 0;

        public OooO00o() {
        }

        @Override // o000O0O0.o00000OO
        public final void OooO00o() {
            int i = this.f366OooO0O0 + 1;
            this.f366OooO0O0 = i;
            if (i == Oooo000.this.f359OooO00o.size()) {
                o00000OO o00000oo2 = Oooo000.this.f362OooO0Oo;
                if (o00000oo2 != null) {
                    o00000oo2.OooO00o();
                }
                this.f366OooO0O0 = 0;
                this.f365OooO00o = false;
                Oooo000.this.f364OooO0o0 = false;
            }
        }

        @Override // o000O0O0.o0000Ooo, o000O0O0.o00000OO
        public final void OooO0O0() {
            if (this.f365OooO00o) {
                return;
            }
            this.f365OooO00o = true;
            o00000OO o00000oo2 = Oooo000.this.f362OooO0Oo;
            if (o00000oo2 != null) {
                o00000oo2.OooO0O0();
            }
        }
    }

    public final void OooO00o() {
        if (this.f364OooO0o0) {
            Iterator<o00000O> it = this.f359OooO00o.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
            this.f364OooO0o0 = false;
        }
    }

    public final Oooo000 OooO0O0(o00000O o00000o) {
        if (!this.f364OooO0o0) {
            this.f359OooO00o.add(o00000o);
        }
        return this;
    }

    public final void OooO0OO() {
        View view;
        if (this.f364OooO0o0) {
            return;
        }
        for (o00000O o00000o : this.f359OooO00o) {
            long j = this.f360OooO0O0;
            if (j >= 0) {
                o00000o.OooO0OO(j);
            }
            Interpolator interpolator = this.f361OooO0OO;
            if (interpolator != null && (view = o00000o.f28117OooO00o.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f362OooO0Oo != null) {
                o00000o.OooO0Oo(this.f363OooO0o);
            }
            View view2 = o00000o.f28117OooO00o.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f364OooO0o0 = true;
    }
}
