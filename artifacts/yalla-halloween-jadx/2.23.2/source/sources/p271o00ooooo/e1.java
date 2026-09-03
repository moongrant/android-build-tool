package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzlj;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends d1 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzet f40494OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oO000Oo f40495OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(oO000Oo oo000oo, String str, int i, zzet zzetVar) {
        super(str, i);
        this.f40495OooO0oo = oo000oo;
        this.f40494OooO0oO = zzetVar;
    }

    @Override // p271o00ooooo.d1
    public final int OooO00o() {
        return this.f40494OooO0oO.zza();
    }

    @Override // p271o00ooooo.d1
    public final boolean OooO0O0() {
        return false;
    }

    @Override // p271o00ooooo.d1
    public final boolean OooO0OO() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oO(Long l, Long l2, zzgm zzgmVar, boolean z) {
        zzoy.zzc();
        oO000Oo oo000oo = this.f40495OooO0oo;
        boolean zZzs = oo000oo.f40788OooO00o.zzf().zzs(this.f40482OooO00o, zzeg.zzW);
        zzet zzetVar = this.f40494OooO0oO;
        boolean zZzg = zzetVar.zzg();
        boolean zZzh = zzetVar.zzh();
        boolean zZzi = zzetVar.zzi();
        Object[] objArr = zZzg || zZzh || zZzi;
        Boolean boolOooO0o = null;
        boolOooO0Oo = null;
        Boolean boolOooO0Oo = null;
        Boolean boolOooO0Oo2 = null;
        boolOooO0o = null;
        boolOooO0o = null;
        boolOooO0o = null;
        Boolean boolOooO0Oo3 = null;
        boolOooO0o = null;
        zzgd zzgdVar = oo000oo.f40788OooO00o;
        if (z && objArr != true) {
            zzgdVar.zzaA().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f40483OooO0O0), zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
            return true;
        }
        zzem zzemVarZzb = zzetVar.zzb();
        boolean zZzg2 = zzemVarZzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzemVarZzb.zzi()) {
                try {
                    boolOooO0Oo2 = d1.OooO0Oo(new BigDecimal(zzgmVar.zzb()), zzemVarZzb.zzc(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                boolOooO0o = d1.OooO0o(boolOooO0Oo2, zZzg2);
            } else {
                zzgdVar.zzaA().zzk().zzb("No number filter for long property. property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
            }
        } else if (zzgmVar.zzq()) {
            if (zzemVarZzb.zzi()) {
                double dZza = zzgmVar.zza();
                try {
                    boolOooO0Oo = d1.OooO0Oo(new BigDecimal(dZza), zzemVarZzb.zzc(), Math.ulp(dZza));
                } catch (NumberFormatException unused2) {
                }
                boolOooO0o = d1.OooO0o(boolOooO0Oo, zZzg2);
            } else {
                zzgdVar.zzaA().zzk().zzb("No number filter for double property. property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
            }
        } else if (!zzgmVar.zzt()) {
            zzgdVar.zzaA().zzk().zzb("User property has no value, property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
        } else if (zzemVarZzb.zzk()) {
            boolOooO0o = d1.OooO0o(d1.OooO0o0(zzgmVar.zzg(), zzemVarZzb.zzd(), zzgdVar.zzaA()), zZzg2);
        } else if (!zzemVarZzb.zzi()) {
            zzgdVar.zzaA().zzk().zzb("No string or number filter defined. property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
        } else if (zzlj.OooOoOO(zzgmVar.zzg())) {
            String strZzg = zzgmVar.zzg();
            zzer zzerVarZzc = zzemVarZzb.zzc();
            if (zzlj.OooOoOO(strZzg)) {
                try {
                    boolOooO0Oo3 = d1.OooO0Oo(new BigDecimal(strZzg), zzerVarZzc, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            boolOooO0o = d1.OooO0o(boolOooO0Oo3, zZzg2);
        } else {
            zzgdVar.zzaA().zzk().zzc("Invalid user property value for Numeric number filter. property, value", zzgdVar.zzj().OooO0o(zzgmVar.zzf()), zzgmVar.zzg());
        }
        zzgdVar.zzaA().zzj().zzb("Property filter result", boolOooO0o == null ? "null" : boolOooO0o);
        if (boolOooO0o == null) {
            return false;
        }
        this.f40484OooO0OO = Boolean.TRUE;
        if (zZzi && !boolOooO0o.booleanValue()) {
            return true;
        }
        if (!z || zzetVar.zzg()) {
            this.f40485OooO0Oo = boolOooO0o;
        }
        if (boolOooO0o.booleanValue() && objArr != false && zzgmVar.zzs()) {
            long jZzc = zzgmVar.zzc();
            if (l != null) {
                jZzc = l.longValue();
            }
            if (zZzs && zzetVar.zzg() && !zzetVar.zzh() && l2 != null) {
                jZzc = l2.longValue();
            }
            if (zzetVar.zzh()) {
                this.f40486OooO0o = Long.valueOf(jZzc);
            } else {
                this.f40487OooO0o0 = Long.valueOf(jZzc);
            }
        }
        return true;
    }
}
