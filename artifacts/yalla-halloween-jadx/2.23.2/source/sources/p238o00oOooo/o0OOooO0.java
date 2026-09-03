package p238o00oOooo;

import android.content.Context;
import androidx.media3.session.o0000oo;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p233o00oOoOO.o0OoOoOo;
import p234o00oOoOo.o0O00O;
import p243o00oo0O.o0000OO0;
import p246o00oo0Oo.o000O00;
import p246o00oo0Oo.o000O000;
import p249o00oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class o0OOooO0 implements o0OO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o0O0o00O f40035OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo f40036OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0Oo f40037OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000OO0 f40038OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000 f40039OooO0Oo;

    @Inject
    public o0OOooO0(@WallTime o000O0Oo o000o0oo2, @Monotonic o000O0Oo o000o0oo3, o0000OO0 o0000oo1, o000O000 o000o001, o000O00 o000o01) {
        this.f40036OooO00o = o000o0oo2;
        this.f40037OooO0O0 = o000o0oo3;
        this.f40038OooO0OO = o0000oo1;
        this.f40039OooO0Oo = o000o001;
        o000o01.getClass();
        o000o01.f40138OooO00o.execute(new o0000oo(o000o01, 1));
    }

    public static o0OOooO0 OooO00o() {
        o0O0o00O o0o0o00o = f40035OooO0o0;
        if (o0o0o00o != null) {
            return o0o0o00o.f40011OooO.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void OooO0O0(Context context) {
        if (f40035OooO0o0 == null) {
            synchronized (o0OOooO0.class) {
                if (f40035OooO0o0 == null) {
                    context.getClass();
                    f40035OooO0o0 = new o0O0o00O(context);
                }
            }
        }
    }

    public final o0OO00o0 OooO0OO(o0O00O o0o00o2) {
        Set setSingleton;
        if (o0o00o2 instanceof o0O0o0) {
            o0o00o2.getClass();
            setSingleton = Collections.unmodifiableSet(o0O00O.f39907OooO0Oo);
        } else {
            setSingleton = Collections.singleton(new o0OoOoOo("proto"));
        }
        o0O0o000.OooO00o OooO00o2 = o0OO00OO.OooO00o();
        o0o00o2.getClass();
        OooO00o2.OooO0O0("cct");
        OooO00o2.f40009OooO0O0 = o0o00o2.OooO0O0();
        return new o0OO00o0(setSingleton, OooO00o2.OooO00o(), this);
    }
}
