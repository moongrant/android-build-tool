package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzlb;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO extends o0OO0oO0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzes f37809OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f37810OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(OooO0OO oooO0OO, String str, int i, zzes zzesVar) {
        super(str, i);
        this.f37810OooO0oo = oooO0OO;
        this.f37809OooO0oO = zzesVar;
    }

    public final boolean OooO(Long l, Long l2, zzgl zzglVar, boolean z) {
        zzny.zzc();
        boolean zZzs = this.f37810OooO0oo.f37615OooO00o.zzf().zzs(this.f37835OooO00o, zzeb.zzU);
        boolean zZzg = this.f37809OooO0oO.zzg();
        boolean zZzh = this.f37809OooO0oO.zzh();
        boolean zZzi = this.f37809OooO0oO.zzi();
        boolean z2 = zZzg || zZzh || zZzi;
        Boolean boolOooO0oo = null;
        Boolean boolOooO0Oo = null;
        boolOooO0oo = null;
        boolOooO0oo = null;
        boolOooO0oo = null;
        boolOooO0oo = null;
        if (z && !z2) {
            this.f37810OooO0oo.f37615OooO00o.zzay().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f37836OooO0O0), this.f37809OooO0oO.zzj() ? Integer.valueOf(this.f37809OooO0oO.zza()) : null);
            return true;
        }
        zzel zzelVarZzb = this.f37809OooO0oO.zzb();
        boolean zZzg2 = zzelVarZzb.zzg();
        if (zzglVar.zzr()) {
            if (zzelVarZzb.zzi()) {
                boolOooO0oo = o0OO0oO0.OooO0oo(o0OO0oO0.OooO0o(zzglVar.zzb(), zzelVarZzb.zzc()), zZzg2);
            } else {
                this.f37810OooO0oo.f37615OooO00o.zzay().zzk().zzb("No number filter for long property. property", this.f37810OooO0oo.f37615OooO00o.zzj().OooO0o(zzglVar.zzf()));
            }
        } else if (zzglVar.zzq()) {
            if (zzelVarZzb.zzi()) {
                double dZza = zzglVar.zza();
                try {
                    boolOooO0Oo = o0OO0oO0.OooO0Oo(new BigDecimal(dZza), zzelVarZzb.zzc(), Math.ulp(dZza));
                } catch (NumberFormatException unused) {
                }
                boolOooO0oo = o0OO0oO0.OooO0oo(boolOooO0Oo, zZzg2);
            } else {
                this.f37810OooO0oo.f37615OooO00o.zzay().zzk().zzb("No number filter for double property. property", this.f37810OooO0oo.f37615OooO00o.zzj().OooO0o(zzglVar.zzf()));
            }
        } else if (!zzglVar.zzt()) {
            this.f37810OooO0oo.f37615OooO00o.zzay().zzk().zzb("User property has no value, property", this.f37810OooO0oo.f37615OooO00o.zzj().OooO0o(zzglVar.zzf()));
        } else if (zzelVarZzb.zzk()) {
            boolOooO0oo = o0OO0oO0.OooO0oo(o0OO0oO0.OooO0o0(zzglVar.zzg(), zzelVarZzb.zzd(), this.f37810OooO0oo.f37615OooO00o.zzay()), zZzg2);
        } else if (!zzelVarZzb.zzi()) {
            this.f37810OooO0oo.f37615OooO00o.zzay().zzk().zzb("No string or number filter defined. property", this.f37810OooO0oo.f37615OooO00o.zzj().OooO0o(zzglVar.zzf()));
        } else if (zzlb.OooOoo(zzglVar.zzg())) {
            boolOooO0oo = o0OO0oO0.OooO0oo(o0OO0oO0.OooO0oO(zzglVar.zzg(), zzelVarZzb.zzc()), zZzg2);
        } else {
            this.f37810OooO0oo.f37615OooO00o.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.f37810OooO0oo.f37615OooO00o.zzj().OooO0o(zzglVar.zzf()), zzglVar.zzg());
        }
        this.f37810OooO0oo.f37615OooO00o.zzay().zzj().zzb("Property filter result", boolOooO0oo == null ? "null" : boolOooO0oo);
        if (boolOooO0oo == null) {
            return false;
        }
        this.f37837OooO0OO = Boolean.TRUE;
        if (zZzi && !boolOooO0oo.booleanValue()) {
            return true;
        }
        if (!z || this.f37809OooO0oO.zzg()) {
            this.f37838OooO0Oo = boolOooO0oo;
        }
        if (boolOooO0oo.booleanValue() && z2 && zzglVar.zzs()) {
            long jZzc = zzglVar.zzc();
            if (l != null) {
                jZzc = l.longValue();
            }
            if (zZzs && this.f37809OooO0oO.zzg() && !this.f37809OooO0oO.zzh() && l2 != null) {
                jZzc = l2.longValue();
            }
            if (this.f37809OooO0oO.zzh()) {
                this.f37839OooO0o = Long.valueOf(jZzc);
            } else {
                this.f37840OooO0o0 = Long.valueOf(jZzc);
            }
        }
        return true;
    }

    @Override // o0OO0OoO.o0OO0oO0
    public final int OooO00o() {
        return this.f37809OooO0oO.zza();
    }

    @Override // o0OO0OoO.o0OO0oO0
    public final boolean OooO0O0() {
        return false;
    }

    @Override // o0OO0OoO.o0OO0oO0
    public final boolean OooO0OO() {
        return true;
    }
}
