package p238o00oOooo;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p233o00oOoOO.o0O000Oo;
import p234o00oOoOo.o0O00OO;
import p238o00oOooo.o0OO00o0;
import p243o00oo0O.o0000OO0;
import p246o00oo0Oo.o000O00;
import p246o00oo0Oo.o000O000;
import p249o00oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class o0OO0o00 implements o0OOooO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o0O0o0 f40017OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo f40018OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0Oo f40019OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000OO0 f40020OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O000 f40021OooO0Oo;

    @Inject
    public o0OO0o00(@WallTime o000O0Oo o000o0oo2, @Monotonic o000O0Oo o000o0oo3, o0000OO0 o0000oo1, o000O000 o000o001, final o000O00 o000o01) {
        this.f40018OooO00o = o000o0oo2;
        this.f40019OooO0O0 = o000o0oo3;
        this.f40020OooO0OO = o0000oo1;
        this.f40021OooO0Oo = o000o001;
        o000o01.getClass();
        final int i = 1;
        o000o01.f40134OooO00o.execute(new Runnable() { // from class: androidx.media3.session.o0000
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                Object obj = o000o01;
                switch (i2) {
                    case 0:
                        ((Oooo0) obj).release();
                        break;
                    default:
                        final p246o00oo0Oo.o000O00 o000o02 = (p246o00oo0Oo.o000O00) obj;
                        o000o02.getClass();
                        o000o02.f40137OooO0Oo.OooO0OO(new o00oo0o.o000O00.OooO00o() { // from class: o00oo0Oo.o000Oo0
                            @Override // o00oo0o.o000O00.OooO00o
                            public final Object OooO0OO() {
                                o000O00 o000o03 = o000o02;
                                Iterator it = o000o03.f40135OooO0O0.OooOo().iterator();
                                while (it.hasNext()) {
                                    o000o03.f40136OooO0OO.OooO00o((o0OO00o0) it.next(), 1);
                                }
                                return null;
                            }
                        });
                        break;
                }
            }
        });
    }

    public static o0OO0o00 OooO00o() {
        o0O0o0 o0o0o0 = f40017OooO0o0;
        if (o0o0o0 != null) {
            return o0o0o0.f39987OooO.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void OooO0O0(Context context) {
        if (f40017OooO0o0 == null) {
            synchronized (o0OO0o00.class) {
                if (f40017OooO0o0 == null) {
                    context.getClass();
                    f40017OooO0o0 = new o0O0o0(context);
                }
            }
        }
    }

    public final o0OO0 OooO0OO(o0O00OO o0o00oo2) {
        Set setSingleton;
        if (o0o00oo2 instanceof o0oOo0O0) {
            o0o00oo2.getClass();
            setSingleton = Collections.unmodifiableSet(o0O00OO.f39903OooO0Oo);
        } else {
            setSingleton = Collections.singleton(new o0O000Oo("proto"));
        }
        o0O0o00O.OooO00o OooO00o2 = o0OO00o0.OooO00o();
        o0o00oo2.getClass();
        OooO00o2.OooO0O0("cct");
        OooO00o2.f40002OooO0O0 = o0o00oo2.OooO0O0();
        return new o0OO0(setSingleton, OooO00o2.OooO00o(), this);
    }
}
