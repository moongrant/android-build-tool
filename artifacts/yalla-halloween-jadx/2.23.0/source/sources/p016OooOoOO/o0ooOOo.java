package p016OooOoOO;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.o000O0O0;
import androidx.core.view.o000O0Oo;
import androidx.core.view.o000OO0O;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Interpolator f345OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000OO0O f346OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f348OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f344OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f347OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<o000O0Oo> f343OooO00o = new ArrayList<>();

    public class OooO00o extends o000O0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f349OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f350OooO0O0 = 0;

        public OooO00o() {
        }

        @Override // androidx.core.view.o000OO0O
        public final void OooO00o() {
            int i = this.f350OooO0O0 + 1;
            this.f350OooO0O0 = i;
            o0ooOOo o0ooooo = o0ooOOo.this;
            if (i == o0ooooo.f343OooO00o.size()) {
                o000OO0O o000oo0o2 = o0ooooo.f346OooO0Oo;
                if (o000oo0o2 != null) {
                    o000oo0o2.OooO00o();
                }
                this.f350OooO0O0 = 0;
                this.f349OooO00o = false;
                o0ooooo.f348OooO0o0 = false;
            }
        }

        @Override // androidx.core.view.o000O0O0, androidx.core.view.o000OO0O
        public final void OooO0O0() {
            if (this.f349OooO00o) {
                return;
            }
            this.f349OooO00o = true;
            o000OO0O o000oo0o2 = o0ooOOo.this.f346OooO0Oo;
            if (o000oo0o2 != null) {
                o000oo0o2.OooO0O0();
            }
        }
    }

    public final void OooO00o() {
        if (this.f348OooO0o0) {
            Iterator<o000O0Oo> it = this.f343OooO00o.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
            this.f348OooO0o0 = false;
        }
    }

    public final void OooO0O0() {
        View view;
        if (this.f348OooO0o0) {
            return;
        }
        for (o000O0Oo o000o0oo2 : this.f343OooO00o) {
            long j = this.f344OooO0O0;
            if (j >= 0) {
                o000o0oo2.OooO0OO(j);
            }
            Interpolator interpolator = this.f345OooO0OO;
            if (interpolator != null && (view = o000o0oo2.f5432OooO00o.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f346OooO0Oo != null) {
                o000o0oo2.OooO0Oo(this.f347OooO0o);
            }
            View view2 = o000o0oo2.f5432OooO00o.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f348OooO0o0 = true;
    }
}
