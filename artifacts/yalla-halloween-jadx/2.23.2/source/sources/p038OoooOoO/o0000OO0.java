package p038OoooOoO;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import java.util.UUID;
import p034OoooOO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0000OO0 implements o00Oo00.OooO00o<o0000O, o000, o0000OO0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOO00O f1597OooO00o;

    public o0000OO0(@NonNull oOO00O ooo00o) {
        Object objOooO0O0;
        this.f1597OooO00o = ooo00o;
        Object objOooO0O1 = null;
        try {
            objOooO0O0 = ooo00o.OooO0O0(o0Oo0oo.f1432OooO0OO);
        } catch (IllegalArgumentException unused) {
            objOooO0O0 = null;
        }
        Class cls = (Class) objOooO0O0;
        if (cls != null && !cls.equals(o0000O.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        OooO0o oooO0o = o0Oo0oo.f1432OooO0OO;
        oOO00O ooo00o2 = this.f1597OooO00o;
        ooo00o2.Oooo0oO(oooO0o, o0000O.class);
        try {
            objOooO0O1 = ooo00o2.OooO0O0(o0Oo0oo.f1431OooO0O0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objOooO0O1 == null) {
            ooo00o2.Oooo0oO(o0Oo0oo.f1431OooO0O0, o0000O.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // p028Oooo0oO.o00O000o
    @NonNull
    public final o00O00O OooO00o() {
        return this.f1597OooO00o;
    }

    @Override // androidx.camera.core.impl.o00Oo00.OooO00o
    @NonNull
    public final o00Oo00 OooO0O0() {
        return new o000(o00O0O00.Oooo0O0(this.f1597OooO00o));
    }
}
