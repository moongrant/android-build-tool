package p286o0O0O0oO;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o0O0O0Oo.OooO0O0;
import o0O0O0Oo.OooOO0;
import o0O0O0o0.OooO00o;
import o0O0OOO.OooOo;
import o0O0OOO.Oooo0;
import o0O0OOO.o000oOoO;
import o0O0OOO0.OooO;
import p289o0O0OOoO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
public final class o000000 implements o000OOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o00O0O f35465OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000Ooo f35466OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f35467OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f35468OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo f35469OooO0Oo;

    @Inject
    public o000000(@WallTime o0000Ooo o0000ooo, @Monotonic o0000Ooo o0000ooo2, OooO oooO, OooOo oooOo, o000oOoO o000oooo2) {
        this.f35466OooO00o = o0000ooo;
        this.f35467OooO0O0 = o0000ooo2;
        this.f35468OooO0OO = oooO;
        this.f35469OooO0Oo = oooOo;
        o000oooo2.f35602OooO00o.execute(new Oooo0(o000oooo2, 0));
    }

    public static o000000 OooO00o() {
        o00O0O o00o0o2 = f35465OooO0o0;
        if (o00o0o2 != null) {
            return o00o0o2.f35493OoooOo0.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void OooO0O0(Context context) {
        if (f35465OooO0o0 == null) {
            synchronized (o000000.class) {
                if (f35465OooO0o0 == null) {
                    Objects.requireNonNull(context);
                    f35465OooO0o0 = new o00O0O(context);
                }
            }
        }
    }

    public final OooOO0 OooO0OO(o00Oo0 o00oo1) {
        Set setSingleton;
        if (o00oo1 instanceof o00Oo0) {
            Objects.requireNonNull((OooO00o) o00oo1);
            setSingleton = Collections.unmodifiableSet(OooO00o.f35419OooO0Oo);
        } else {
            setSingleton = Collections.singleton(new OooO0O0("proto"));
        }
        o0OO00O.OooO00o OooO00o2 = o0OO00O.OooO00o();
        Objects.requireNonNull(o00oo1);
        o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) OooO00o2;
        oooO00o.f35508OooO00o = "cct";
        oooO00o.f35509OooO0O0 = ((OooO00o) o00oo1).OooO0O0();
        return new oo0o0Oo(setSingleton, oooO00o.OooO0O0(), this);
    }
}
