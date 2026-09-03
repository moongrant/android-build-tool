package p269o00ooooo;

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
public final class h extends g {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzet f41139OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f41140OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o0O0OOOo o0o0oooo, String str, int i, zzet zzetVar) {
        super(str, i);
        this.f41140OooO0oo = o0o0oooo;
        this.f41139OooO0oO = zzetVar;
    }

    @Override // p269o00ooooo.g
    public final int OooO00o() {
        return this.f41139OooO0oO.zza();
    }

    @Override // p269o00ooooo.g
    public final boolean OooO0O0() {
        return false;
    }

    @Override // p269o00ooooo.g
    public final boolean OooO0OO() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oO(Long l, Long l2, zzgm zzgmVar, boolean z) {
        zzoy.zzc();
        o0O0OOOo o0o0oooo = this.f41140OooO0oo;
        boolean zZzs = o0o0oooo.f41276OooO00o.zzf().zzs(this.f41133OooO00o, zzeg.zzW);
        zzet zzetVar = this.f41139OooO0oO;
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
        zzgd zzgdVar = o0o0oooo.f41276OooO00o;
        if (z && objArr != true) {
            zzgdVar.zzaA().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f41134OooO0O0), zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
            return true;
        }
        zzem zzemVarZzb = zzetVar.zzb();
        boolean zZzg2 = zzemVarZzb.zzg();
        if (zzgmVar.zzr()) {
            if (zzemVarZzb.zzi()) {
                try {
                    boolOooO0Oo2 = g.OooO0Oo(new BigDecimal(zzgmVar.zzb()), zzemVarZzb.zzc(), 0.0d);
                } catch (NumberFormatException unused) {
                }
                boolOooO0o = g.OooO0o(boolOooO0Oo2, zZzg2);
            } else {
                zzgdVar.zzaA().zzk().zzb("No number filter for long property. property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
            }
        } else if (zzgmVar.zzq()) {
            if (zzemVarZzb.zzi()) {
                double dZza = zzgmVar.zza();
                try {
                    boolOooO0Oo = g.OooO0Oo(new BigDecimal(dZza), zzemVarZzb.zzc(), Math.ulp(dZza));
                } catch (NumberFormatException unused2) {
                }
                boolOooO0o = g.OooO0o(boolOooO0Oo, zZzg2);
            } else {
                zzgdVar.zzaA().zzk().zzb("No number filter for double property. property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
            }
        } else if (!zzgmVar.zzt()) {
            zzgdVar.zzaA().zzk().zzb("User property has no value, property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
        } else if (zzemVarZzb.zzk()) {
            boolOooO0o = g.OooO0o(g.OooO0o0(zzgmVar.zzg(), zzemVarZzb.zzd(), zzgdVar.zzaA()), zZzg2);
        } else if (!zzemVarZzb.zzi()) {
            zzgdVar.zzaA().zzk().zzb("No string or number filter defined. property", zzgdVar.zzj().OooO0o(zzgmVar.zzf()));
        } else if (zzlj.OooOoOO(zzgmVar.zzg())) {
            String strZzg = zzgmVar.zzg();
            zzer zzerVarZzc = zzemVarZzb.zzc();
            if (zzlj.OooOoOO(strZzg)) {
                try {
                    boolOooO0Oo3 = g.OooO0Oo(new BigDecimal(strZzg), zzerVarZzc, 0.0d);
                } catch (NumberFormatException unused3) {
                }
            }
            boolOooO0o = g.OooO0o(boolOooO0Oo3, zZzg2);
        } else {
            zzgdVar.zzaA().zzk().zzc("Invalid user property value for Numeric number filter. property, value", zzgdVar.zzj().OooO0o(zzgmVar.zzf()), zzgmVar.zzg());
        }
        zzgdVar.zzaA().zzj().zzb("Property filter result", boolOooO0o == null ? "null" : boolOooO0o);
        if (boolOooO0o == null) {
            return false;
        }
        this.f41135OooO0OO = Boolean.TRUE;
        if (zZzi && !boolOooO0o.booleanValue()) {
            return true;
        }
        if (!z || zzetVar.zzg()) {
            this.f41136OooO0Oo = boolOooO0o;
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
                this.f41137OooO0o = Long.valueOf(jZzc);
            } else {
                this.f41138OooO0o0 = Long.valueOf(jZzc);
            }
        }
        return true;
    }
}
