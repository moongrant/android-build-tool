package p016OooOoOO;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.o00;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0000;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Interpolator f344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00 f345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f347OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f343OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f346OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList<o000OOo0> f342OooO00o = new ArrayList<>();

    public class OooO00o extends o00O0000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f348OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f349OooO0O0 = 0;

        public OooO00o() {
        }

        @Override // androidx.core.view.o00
        public final void OooO00o() {
            int i = this.f349OooO0O0 + 1;
            this.f349OooO0O0 = i;
            o0ooOOo o0ooooo = o0ooOOo.this;
            if (i == o0ooooo.f342OooO00o.size()) {
                o00 o00Var = o0ooooo.f345OooO0Oo;
                if (o00Var != null) {
                    o00Var.OooO00o();
                }
                this.f349OooO0O0 = 0;
                this.f348OooO00o = false;
                o0ooooo.f347OooO0o0 = false;
            }
        }

        @Override // androidx.core.view.o00O0000, androidx.core.view.o00
        public final void OooO0O0() {
            if (this.f348OooO00o) {
                return;
            }
            this.f348OooO00o = true;
            o00 o00Var = o0ooOOo.this.f345OooO0Oo;
            if (o00Var != null) {
                o00Var.OooO0O0();
            }
        }
    }

    public final void OooO00o() {
        if (this.f347OooO0o0) {
            Iterator<o000OOo0> it = this.f342OooO00o.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
            this.f347OooO0o0 = false;
        }
    }

    public final void OooO0O0() {
        View view;
        if (this.f347OooO0o0) {
            return;
        }
        for (o000OOo0 o000ooo1 : this.f342OooO00o) {
            long j = this.f343OooO0O0;
            if (j >= 0) {
                o000ooo1.OooO0OO(j);
            }
            Interpolator interpolator = this.f344OooO0OO;
            if (interpolator != null && (view = o000ooo1.f5454OooO00o.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f345OooO0Oo != null) {
                o000ooo1.OooO0Oo(this.f346OooO0o);
            }
            View view2 = o000ooo1.f5454OooO00o.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f347OooO0o0 = true;
    }
}
