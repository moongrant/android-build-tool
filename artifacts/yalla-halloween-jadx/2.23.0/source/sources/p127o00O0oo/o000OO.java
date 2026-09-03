package p127o00O0oo;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO;
import com.bumptech.glide.load.data.OooO0o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o00O.OooO00o;
import o00OO00O.o0OoOo0;
import p126o00O0oOo.o000OOo;
import p126o00O0oOo.o0O0O00;
import p532o0o0Oo.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements o0ooOOo, o0ooOOo.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile o0OoOo0.OooO00o<?> f36781OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o<?> f36782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile int f36783OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOOo.OooO00o f36784OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile o00Ooo f36785OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f36786OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile oo000o f36787OooOO0;

    public o000OO(o0OOO0o<?> o0ooo0o2, o0ooOOo.OooO00o oooO00o) {
        this.f36782OooO0Oo = o0ooo0o2;
        this.f36784OooO0o0 = oooO00o;
    }

    @Override // o00O0oo.o0ooOOo.OooO00o
    public final void OooO00o(o000OOo o000ooo2, Object obj, OooO0o<?> oooO0o, DataSource dataSource, o000OOo o000ooo3) {
        this.f36784OooO0o0.OooO00o(o000ooo2, obj, oooO0o, this.f36781OooO.f37152OooO0OO.getDataSource(), o000ooo2);
    }

    @Override // o00O0oo.o0ooOOo.OooO00o
    public final void OooO0O0(o000OOo o000ooo2, Exception exc, OooO0o<?> oooO0o, DataSource dataSource) {
        this.f36784OooO0o0.OooO0O0(o000ooo2, exc, oooO0o, this.f36781OooO.f37152OooO0OO.getDataSource());
    }

    public final boolean OooO0OO(Object obj) throws Throwable {
        int i = o00000O.f54564OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            OooO oooOOooO0oo = this.f36782OooO0Oo.f36877OooO0OO.OooO0O0().OooO0oo(obj);
            Object objOooO00o = oooOOooO0oo.OooO00o();
            o0O0O00<X> o0o0o00OooO0o0 = this.f36782OooO0Oo.OooO0o0(objOooO00o);
            o00oO0o o00oo0o2 = new o00oO0o(o0o0o00OooO0o0, objOooO00o, this.f36782OooO0Oo.f36874OooO);
            o000OOo o000ooo2 = this.f36781OooO.f37150OooO00o;
            o0OOO0o<?> o0ooo0o2 = this.f36782OooO0Oo;
            oo000o oo000oVar = new oo000o(o000ooo2, o0ooo0o2.f36886OooOOO);
            OooO00o OooO00o2 = ((o0O0O00.OooO0OO) o0ooo0o2.f36882OooO0oo).OooO00o();
            OooO00o2.OooO0O0(oo000oVar, o00oo0o2);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + oo000oVar + ", data: " + obj + ", encoder: " + o0o0o00OooO0o0 + ", duration: " + o00000O.OooO00o(jElapsedRealtimeNanos));
            }
            if (OooO00o2.OooO00o(oo000oVar) != null) {
                this.f36787OooOO0 = oo000oVar;
                this.f36785OooO0oO = new o00Ooo(Collections.singletonList(this.f36781OooO.f37150OooO00o), this.f36782OooO0Oo, this);
                this.f36781OooO.f37152OooO0OO.OooO0O0();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f36787OooOO0 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f36784OooO0o0.OooO00o(this.f36781OooO.f37150OooO00o, oooOOooO0oo.OooO00o(), this.f36781OooO.f37152OooO0OO, this.f36781OooO.f37152OooO0OO.getDataSource(), this.f36781OooO.f37150OooO00o);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f36781OooO.f37152OooO0OO.OooO0O0();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p127o00O0oo.o0ooOOo
    public final boolean OooO0Oo() {
        if (this.f36786OooO0oo != null) {
            Object obj = this.f36786OooO0oo;
            this.f36786OooO0oo = null;
            try {
                if (!OooO0OO(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f36785OooO0oO != null && this.f36785OooO0oO.OooO0Oo()) {
            return true;
        }
        this.f36785OooO0oO = null;
        this.f36781OooO = null;
        boolean z = false;
        while (!z) {
            if (!(this.f36783OooO0o < this.f36782OooO0Oo.OooO0O0().size())) {
                break;
            }
            ArrayList arrayListOooO0O0 = this.f36782OooO0Oo.OooO0O0();
            int i = this.f36783OooO0o;
            this.f36783OooO0o = i + 1;
            this.f36781OooO = (o0OoOo0.OooO00o) arrayListOooO0O0.get(i);
            if (this.f36781OooO != null) {
                if (!this.f36782OooO0Oo.f36889OooOOOo.OooO0OO(this.f36781OooO.f37152OooO0OO.getDataSource())) {
                    if (this.f36782OooO0Oo.OooO0OO(this.f36781OooO.f37152OooO0OO.OooO00o()) != null) {
                    }
                }
                this.f36781OooO.f37152OooO0OO.OooO0Oo(this.f36782OooO0Oo.f36888OooOOOO, new o0000O0O(this, this.f36781OooO));
                z = true;
            }
        }
        return z;
    }

    @Override // o00O0oo.o0ooOOo.OooO00o
    public final void OooO0o0() {
        throw new UnsupportedOperationException();
    }

    @Override // p127o00O0oo.o0ooOOo
    public final void cancel() {
        o0OoOo0.OooO00o<?> oooO00o = this.f36781OooO;
        if (oooO00o != null) {
            oooO00o.f37152OooO0OO.cancel();
        }
    }
}
