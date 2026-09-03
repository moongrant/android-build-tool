package p032OoooO0;

import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OOO0o;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f3314OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Oooo000 f3315OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Oooo000 f3316OooO0OO;

    public o0O000(@NotNull o0OOO0o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3314OooO00o = value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    public final long OooO00o(long j) {
        OooOO0O oooOO0OOooo;
        Oooo000 oooo000 = this.f3315OooO0O0;
        if (oooo000 != null) {
            oooOO0OOooo = null;
            if (oooo000.OooOoO()) {
                Oooo000 oooo001 = this.f3316OooO0OO;
                if (oooo001 != null) {
                    oooOO0OOooo = oooo001.Oooo(oooo000, true);
                }
            } else {
                oooOO0OOooo = OooOO0O.f30402OooO0o;
            }
            if (oooOO0OOooo == null) {
                oooOO0OOooo = OooOO0O.f30402OooO0o;
            }
        } else {
            oooOO0OOooo = OooOO0O.f30402OooO0o;
        }
        float fOooO0OO = OooO.OooO0OO(j);
        float fOooO0OO2 = oooOO0OOooo.f30404OooO00o;
        if (fOooO0OO >= fOooO0OO2) {
            float fOooO0OO3 = OooO.OooO0OO(j);
            fOooO0OO2 = oooOO0OOooo.f30406OooO0OO;
            if (fOooO0OO3 <= fOooO0OO2) {
                fOooO0OO2 = OooO.OooO0OO(j);
            }
        }
        float fOooO0Oo = OooO.OooO0Oo(j);
        float fOooO0Oo2 = oooOO0OOooo.f30405OooO0O0;
        if (fOooO0Oo >= fOooO0Oo2) {
            float fOooO0Oo3 = OooO.OooO0Oo(j);
            fOooO0Oo2 = oooOO0OOooo.f30407OooO0Oo;
            if (fOooO0Oo3 <= fOooO0Oo2) {
                fOooO0Oo2 = OooO.OooO0Oo(j);
            }
        }
        return OooOO0.OooO00o(fOooO0OO2, fOooO0Oo2);
    }

    public final int OooO0O0(long j, boolean z) {
        if (z) {
            j = OooO00o(j);
        }
        return this.f3314OooO00o.OooOOO0(OooO0OO(j));
    }

    public final long OooO0OO(long j) {
        OooO oooO;
        Oooo000 oooo000 = this.f3315OooO0O0;
        if (oooo000 == null) {
            return j;
        }
        Oooo000 oooo001 = this.f3316OooO0OO;
        if (oooo001 != null) {
            oooO = new OooO((oooo000.OooOoO() && oooo001.OooOoO()) ? oooo000.OoooO0(oooo001, j) : j);
        } else {
            oooO = null;
        }
        return oooO != null ? oooO.f30395OooO00o : j;
    }
}
