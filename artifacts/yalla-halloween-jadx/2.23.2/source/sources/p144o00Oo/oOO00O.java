package p144o00Oo;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO;
import com.bumptech.glide.load.data.OooO0o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o00OoO.o0OoOo0;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.o0ooOOo;
import p155o00OoO0.OooOo00;
import p174o00OooOo.o00O0OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O implements o000O000, o000O000.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile o0OoOo0.OooO00o<?> f37733OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0o<?> f37734OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile int f37735OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000O000.OooO00o f37736OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile o0000O f37737OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Object f37738OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile o0000OO0 f37739OooOO0;

    public oOO00O(o000O0o<?> o000o0o2, o000O000.OooO00o oooO00o) {
        this.f37734OooO0Oo = o000o0o2;
        this.f37736OooO0o0 = oooO00o;
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO00o(o0OOO0o o0ooo0o2, Object obj, OooO0o<?> oooO0o, DataSource dataSource, o0OOO0o o0ooo0o3) {
        this.f37736OooO0o0.OooO00o(o0ooo0o2, obj, oooO0o, this.f37733OooO.f37914OooO0OO.getDataSource(), o0ooo0o2);
    }

    @Override // p144o00Oo.o000O000
    public final boolean OooO0O0() {
        if (this.f37738OooO0oo != null) {
            Object obj = this.f37738OooO0oo;
            this.f37738OooO0oo = null;
            try {
                if (!OooO0o0(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.f37737OooO0oO != null && this.f37737OooO0oO.OooO0O0()) {
            return true;
        }
        this.f37737OooO0oO = null;
        this.f37733OooO = null;
        boolean z = false;
        while (!z) {
            if (!(this.f37735OooO0o < this.f37734OooO0Oo.OooO0O0().size())) {
                break;
            }
            ArrayList arrayListOooO0O0 = this.f37734OooO0Oo.OooO0O0();
            int i = this.f37735OooO0o;
            this.f37735OooO0o = i + 1;
            this.f37733OooO = (o0OoOo0.OooO00o) arrayListOooO0O0.get(i);
            if (this.f37733OooO != null) {
                if (!this.f37734OooO0Oo.f37649OooOOOo.OooO0OO(this.f37733OooO.f37914OooO0OO.getDataSource())) {
                    if (this.f37734OooO0Oo.OooO0OO(this.f37733OooO.f37914OooO0OO.OooO00o()) != null) {
                    }
                }
                this.f37733OooO.f37914OooO0OO.OooO0Oo(this.f37734OooO0Oo.f37648OooOOOO, new o00O00O(this, this.f37733OooO));
                z = true;
            }
        }
        return z;
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO0OO() {
        throw new UnsupportedOperationException();
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO0Oo(o0OOO0o o0ooo0o2, Exception exc, OooO0o<?> oooO0o, DataSource dataSource) {
        this.f37736OooO0o0.OooO0Oo(o0ooo0o2, exc, oooO0o, this.f37733OooO.f37914OooO0OO.getDataSource());
    }

    public final boolean OooO0o0(Object obj) throws Throwable {
        int i = o00O0OOO.f38347OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            OooO oooOOooO0oo = this.f37734OooO0Oo.f37637OooO0OO.OooO0O0().OooO0oo(obj);
            Object objOooO00o = oooOOooO0oo.OooO00o();
            o0ooOOo<X> o0oooooOooO0o0 = this.f37734OooO0Oo.OooO0o0(objOooO00o);
            o000 o000Var = new o000(o0oooooOooO0o0, objOooO00o, this.f37734OooO0Oo.f37634OooO);
            o0OOO0o o0ooo0o2 = this.f37733OooO.f37912OooO00o;
            o000O0o<?> o000o0o2 = this.f37734OooO0Oo;
            o0000OO0 o0000oo1 = new o0000OO0(o0ooo0o2, o000o0o2.f37646OooOOO);
            OooOo00 oooOo00OooO00o = ((o000O0.OooO0OO) o000o0o2.f37642OooO0oo).OooO00o();
            oooOo00OooO00o.OooO0O0(o0000oo1, o000Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + o0000oo1 + ", data: " + obj + ", encoder: " + o0oooooOooO0o0 + ", duration: " + o00O0OOO.OooO00o(jElapsedRealtimeNanos));
            }
            if (oooOo00OooO00o.OooO0OO(o0000oo1) != null) {
                this.f37739OooOO0 = o0000oo1;
                this.f37737OooO0oO = new o0000O(Collections.singletonList(this.f37733OooO.f37912OooO00o), this.f37734OooO0Oo, this);
                this.f37733OooO.f37914OooO0OO.OooO0O0();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f37739OooOO0 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f37736OooO0o0.OooO00o(this.f37733OooO.f37912OooO00o, oooOOooO0oo.OooO00o(), this.f37733OooO.f37914OooO0OO, this.f37733OooO.f37914OooO0OO.getDataSource(), this.f37733OooO.f37912OooO00o);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.f37733OooO.f37914OooO0OO.OooO0O0();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p144o00Oo.o000O000
    public final void cancel() {
        o0OoOo0.OooO00o<?> oooO00o = this.f37733OooO;
        if (oooO00o != null) {
            oooO00o.f37914OooO0OO.cancel();
        }
    }
}
