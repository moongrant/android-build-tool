package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzay extends zzaw {
    public zzay() {
        this.f15190OooO00o.add(zzbl.EQUALS);
        this.f15190OooO00o.add(zzbl.GREATER_THAN);
        this.f15190OooO00o.add(zzbl.GREATER_THAN_EQUALS);
        this.f15190OooO00o.add(zzbl.IDENTITY_EQUALS);
        this.f15190OooO00o.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f15190OooO00o.add(zzbl.LESS_THAN);
        this.f15190OooO00o.add(zzbl.LESS_THAN_EQUALS);
        this.f15190OooO00o.add(zzbl.NOT_EQUALS);
    }

    public static boolean OooO0O0(zzap zzapVar, zzap zzapVar2) {
        if (zzapVar.getClass().equals(zzapVar2.getClass())) {
            if ((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) {
                return true;
            }
            if (zzapVar instanceof zzah) {
                return (Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue()) || zzapVar.zzh().doubleValue() != zzapVar2.zzh().doubleValue()) ? false : true;
            }
            if (zzapVar instanceof zzat) {
                return zzapVar.zzi().equals(zzapVar2.zzi());
            }
            if (zzapVar instanceof zzaf) {
                return zzapVar.zzg().equals(zzapVar2.zzg());
            }
            return zzapVar == zzapVar2;
        }
        if (((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) && ((zzapVar2 instanceof zzau) || (zzapVar2 instanceof zzan))) {
            return true;
        }
        boolean z = zzapVar instanceof zzah;
        if (z && (zzapVar2 instanceof zzat)) {
            return OooO0O0(zzapVar, new zzah(zzapVar2.zzh()));
        }
        boolean z2 = zzapVar instanceof zzat;
        if (z2 && (zzapVar2 instanceof zzah)) {
            return OooO0O0(new zzah(zzapVar.zzh()), zzapVar2);
        }
        if (zzapVar instanceof zzaf) {
            return OooO0O0(new zzah(zzapVar.zzh()), zzapVar2);
        }
        if (zzapVar2 instanceof zzaf) {
            return OooO0O0(zzapVar, new zzah(zzapVar2.zzh()));
        }
        if ((z2 || z) && (zzapVar2 instanceof zzal)) {
            return OooO0O0(zzapVar, new zzat(zzapVar2.zzi()));
        }
        if ((zzapVar instanceof zzal) && ((zzapVar2 instanceof zzat) || (zzapVar2 instanceof zzah))) {
            return OooO0O0(new zzat(zzapVar.zzi()), zzapVar2);
        }
        return false;
    }

    public static boolean OooO0OO(zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof zzal) {
            zzapVar = new zzat(zzapVar.zzi());
        }
        if (zzapVar2 instanceof zzal) {
            zzapVar2 = new zzat(zzapVar2.zzi());
        }
        if ((zzapVar instanceof zzat) && (zzapVar2 instanceof zzat)) {
            return zzapVar.zzi().compareTo(zzapVar2.zzi()) < 0;
        }
        double dDoubleValue = zzapVar.zzh().doubleValue();
        double dDoubleValue2 = zzapVar2.zzh().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean OooO0Oo(zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof zzal) {
            zzapVar = new zzat(zzapVar.zzi());
        }
        if (zzapVar2 instanceof zzal) {
            zzapVar2 = new zzat(zzapVar2.zzi());
        }
        return (((zzapVar instanceof zzat) && (zzapVar2 instanceof zzat)) || !(Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue()))) && !OooO0OO(zzapVar2, zzapVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        boolean zOooO0O0;
        boolean zOooO0O1;
        zzh.zzh(zzh.zze(str).name(), 2, list);
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(1));
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zOooO0O1 = OooO0O0(zzapVarZzb, zzapVarZzb2);
            } else if (iOrdinal == 42) {
                zOooO0O0 = OooO0OO(zzapVarZzb, zzapVarZzb2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zOooO0O0 = OooO0OO(zzapVarZzb2, zzapVarZzb);
                        break;
                    case 38:
                        zOooO0O0 = OooO0Oo(zzapVarZzb2, zzapVarZzb);
                        break;
                    case 39:
                        zOooO0O0 = zzh.zzl(zzapVarZzb, zzapVarZzb2);
                        break;
                    case 40:
                        zOooO0O1 = zzh.zzl(zzapVarZzb, zzapVarZzb2);
                        break;
                    default:
                        OooO00o(str);
                        throw null;
                }
            } else {
                zOooO0O0 = OooO0Oo(zzapVarZzb, zzapVarZzb2);
            }
            zOooO0O0 = !zOooO0O1;
        } else {
            zOooO0O0 = OooO0O0(zzapVarZzb, zzapVarZzb2);
        }
        return zOooO0O0 ? zzap.zzk : zzap.zzl;
    }
}
