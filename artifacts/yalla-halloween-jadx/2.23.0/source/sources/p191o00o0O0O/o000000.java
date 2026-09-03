package p191o00o0O0O;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p029Oooo0oo.oo0oO0;
import p176o00o0.OooOo;
import p190o00o0O00.OooO;
import p196o00o0Oo.o00O000;
import p196o00o0Oo.o00O0000;
import p197o00o0Oo0.oo0o0Oo;
import p201o00o0o00.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class o000000 implements o000OOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o000oOoO f38923OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f38924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f38925OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo0o0Oo f38926OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0000 f38927OooO0Oo;

    @Inject
    public o000000(@WallTime OooOOO0 oooOOO0, @Monotonic OooOOO0 oooOOO1, oo0o0Oo oo0o0oo, o00O0000 o00o0001, final o00O000 o00o001) {
        this.f38924OooO00o = oooOOO0;
        this.f38925OooO0O0 = oooOOO1;
        this.f38926OooO0OO = oo0o0oo;
        this.f38927OooO0Oo = o00o0001;
        o00o001.getClass();
        o00o001.f39016OooO00o.execute(new Runnable() { // from class: o00o0Oo.o00oOoo
            @Override // java.lang.Runnable
            public final void run() {
                o00O000 o00o002 = o00o001;
                o00o002.getClass();
                o00o002.f39019OooO0Oo.OooO0OO(new oo0oO0(o00o002, 2));
            }
        });
    }

    public static o000000 OooO00o() {
        o000oOoO o000oooo2 = f38923OooO0o0;
        if (o000oooo2 != null) {
            return o000oooo2.f38928OooO.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void OooO0O0(Context context) {
        if (f38923OooO0o0 == null) {
            synchronized (o000000.class) {
                if (f38923OooO0o0 == null) {
                    context.getClass();
                    f38923OooO0o0 = new o000oOoO(context);
                }
            }
        }
    }

    public final o0OO00O OooO0OO(OooO oooO) {
        Set setSingleton;
        if (oooO instanceof o0OoOo0) {
            oooO.getClass();
            setSingleton = Collections.unmodifiableSet(OooO.f38856OooO0Oo);
        } else {
            setSingleton = Collections.singleton(new OooOo("proto"));
        }
        Oooo0.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
        oooO.getClass();
        OooO00o2.OooO0O0("cct");
        OooO00o2.f38911OooO0O0 = oooO.OooO0O0();
        return new o0OO00O(setSingleton, OooO00o2.OooO00o(), this);
    }
}
