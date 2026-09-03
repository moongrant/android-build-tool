package p214o00oO0;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p217o00oO00o.o000000;
import p217o00oO00o.o000OOo;
import p221o00oOO.o00000O0;
import p243o00oo00O.o0000O0O;

/* JADX INFO: loaded from: classes.dex */
public final class oo00oO implements o00O0O0O, o00O0O0O.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00O0 f33542Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00O0OO0<?> f33543Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O0O0O.OooO00o f33544Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f33545Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public volatile o00000O0.OooO00o<?> f33546OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Object f33547OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public o00O0O00 f33548OoooO0O;

    public oo00oO(o00O0OO0<?> o00o0oo1, o00O0O0O.OooO00o oooO00o) {
        this.f33543Oooo0o = o00o0oo1;
        this.f33544Oooo0oO = oooO00o;
    }

    @Override // o00oO0.o00O0O0O.OooO00o
    public final void OooO00o(o000000 o000000Var, Object obj, OooO0o<?> oooO0o, DataSource dataSource, o000000 o000000Var2) {
        this.f33544Oooo0oO.OooO00o(o000000Var, obj, oooO0o, this.f33546OoooO0.f33698OooO0OO.OooO0Oo(), o000000Var);
    }

    @Override // p214o00oO0.o00O0O0O
    public final boolean OooO0O0() {
        Object obj = this.f33547OoooO00;
        if (obj != null) {
            this.f33547OoooO00 = null;
            int i = o0000O0O.f34164OooO0O0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                o000OOo<X> o000oooOooO0o0 = this.f33543Oooo0o.OooO0o0(obj);
                o00O0O0 o00o0o0 = new o00O0O0(o000oooOooO0o0, obj, this.f33543Oooo0o.f33415OooO);
                o000000 o000000Var = this.f33546OoooO0.f33696OooO00o;
                o00O0OO0<?> o00o0oo1 = this.f33543Oooo0o;
                this.f33548OoooO0O = new o00O0O00(o000000Var, o00o0oo1.f33427OooOOO);
                o00o0oo1.OooO0O0().OooO00o(this.f33548OoooO0O, o00o0o0);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f33548OoooO0O + ", data: " + obj + ", encoder: " + o000oooOooO0o0 + ", duration: " + o0000O0O.OooO00o(jElapsedRealtimeNanos));
                }
                this.f33546OoooO0.f33698OooO0OO.OooO0O0();
                this.f33542Oooo = new o00O0(Collections.singletonList(this.f33546OoooO0.f33696OooO00o), this.f33543Oooo0o, this);
            } catch (Throwable th) {
                this.f33546OoooO0.f33698OooO0OO.OooO0O0();
                throw th;
            }
        }
        o00O0 o00o1 = this.f33542Oooo;
        if (o00o1 != null && o00o1.OooO0O0()) {
            return true;
        }
        this.f33542Oooo = null;
        this.f33546OoooO0 = null;
        boolean z = false;
        while (!z) {
            if (!(this.f33545Oooo0oo < ((ArrayList) this.f33543Oooo0o.OooO0OO()).size())) {
                break;
            }
            List<o00000O0.OooO00o<?>> listOooO0OO = this.f33543Oooo0o.OooO0OO();
            int i2 = this.f33545Oooo0oo;
            this.f33545Oooo0oo = i2 + 1;
            this.f33546OoooO0 = (o00000O0.OooO00o) ((ArrayList) listOooO0OO).get(i2);
            if (this.f33546OoooO0 != null && (this.f33543Oooo0o.f33430OooOOOo.OooO0OO(this.f33546OoooO0.f33698OooO0OO.OooO0Oo()) || this.f33543Oooo0o.OooO0oO(this.f33546OoooO0.f33698OooO0OO.OooO00o()))) {
                this.f33546OoooO0.f33698OooO0OO.OooO0o0(this.f33543Oooo0o.f33429OooOOOO, new o0O00o0(this, this.f33546OoooO0));
                z = true;
            }
        }
        return z;
    }

    @Override // o00oO0.o00O0O0O.OooO00o
    public final void OooO0Oo(o000000 o000000Var, Exception exc, OooO0o<?> oooO0o, DataSource dataSource) {
        this.f33544Oooo0oO.OooO0Oo(o000000Var, exc, oooO0o, this.f33546OoooO0.f33698OooO0OO.OooO0Oo());
    }

    @Override // o00oO0.o00O0O0O.OooO00o
    public final void OooO0o0() {
        throw new UnsupportedOperationException();
    }

    @Override // p214o00oO0.o00O0O0O
    public final void cancel() {
        o00000O0.OooO00o<?> oooO00o = this.f33546OoooO0;
        if (oooO00o != null) {
            oooO00o.f33698OooO0OO.cancel();
        }
    }
}
