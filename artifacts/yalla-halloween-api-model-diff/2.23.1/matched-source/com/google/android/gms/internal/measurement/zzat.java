package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzat implements Iterable, zzap {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f15196OooO0Oo;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f15196OooO0Oo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.f15196OooO0Oo.equals(((zzat) obj).f15196OooO0Oo);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15196OooO0Oo.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new OooO(this);
    }

    public final String toString() {
        return p028Oooo0oO.o0oOO.OooO00o(new StringBuilder("\""), this.f15196OooO0Oo, "\"");
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02de  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e2 A[LOOP:0: B:138:0x02e0->B:139:0x02e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0151 A[PHI: r5
      0x0151: PHI (r5v30 java.lang.String) = 
      (r5v2 java.lang.String)
      (r5v3 java.lang.String)
      (r5v4 java.lang.String)
      (r5v5 java.lang.String)
      (r5v7 java.lang.String)
      (r5v8 java.lang.String)
      (r5v9 java.lang.String)
      (r5v10 java.lang.String)
      (r5v11 java.lang.String)
      (r5v12 java.lang.String)
      (r5v14 java.lang.String)
      (r5v15 java.lang.String)
      (r5v16 java.lang.String)
      (r5v17 java.lang.String)
      (r5v18 java.lang.String)
      (r5v19 java.lang.String)
      (r5v21 java.lang.String)
      (r5v31 java.lang.String)
     binds: [B:92:0x014d, B:89:0x0142, B:86:0x0137, B:83:0x012d, B:252:?, B:251:?, B:250:?, B:249:?, B:248:?, B:247:?, B:246:?, B:245:?, B:244:?, B:243:?, B:242:?, B:241:?, B:240:?, B:41:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        String str2;
        byte b;
        zzap zzatVar;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean zIsEmpty;
        zzg zzgVar2;
        int iZza;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str) && !"toLocaleUpperCase".equals(str) && !"trim".equals(str)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", str));
        }
        switch (str.hashCode()) {
            case -1789698943:
                str2 = "charAt";
                if (str.equals("hasOwnProperty")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1776922004:
                str2 = "charAt";
                if (str.equals("toString")) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -1464939364:
                str2 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -1361633751:
                str2 = "charAt";
                if (str.equals(str2)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 1;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 13;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 11;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 15;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b = 16;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 3;
                    str2 = "charAt";
                } else {
                    str2 = "charAt";
                    b = -1;
                }
                break;
            default:
                str2 = "charAt";
                b = -1;
                break;
        }
        String strZzi = "undefined";
        String str3 = str2;
        String str4 = this.f15196OooO0Oo;
        switch (b) {
            case 0:
                zzh.zzj(str3, 1, list);
                int iZza2 = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                if (iZza2 < 0 || iZza2 >= str4.length()) {
                    return zzap.zzm;
                }
                zzatVar = new zzat(String.valueOf(str4.charAt(iZza2)));
                return zzatVar;
            case 1:
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str4);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(zzgVar.zzb((zzap) list.get(i4)).zzi());
                    }
                    return new zzat(sb.toString());
                }
                return this;
            case 2:
                zzh.zzh("hasOwnProperty", 1, list);
                zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    return zzap.zzk;
                }
                double dDoubleValue = zzapVarZzb.zzh().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str4.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                zzatVar = new zzah(Double.valueOf(str4.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                return zzatVar;
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String strZzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                double dDoubleValue2 = list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                zzatVar = new zzah(Double.valueOf(str4.lastIndexOf(strZzi2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : zzh.zza(dDoubleValue2)))));
                return zzatVar;
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(str4);
                if (!matcher.find()) {
                    return zzap.zzg;
                }
                zzatVar = new zzae(Arrays.asList(new zzat(matcher.group())));
                return zzatVar;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVarZza = zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str5 = strZzi;
                int iIndexOf = str4.indexOf(str5);
                if (iIndexOf >= 0) {
                    if (zzapVarZza instanceof zzai) {
                        zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str5), new zzah(Double.valueOf(iIndexOf)), this));
                    }
                    zzatVar = new zzat(p031OoooO0.o0OoOo0.OooO00o(str4.substring(0, iIndexOf), zzapVarZza.zzi(), str4.substring(str5.length() + iIndexOf)));
                    return zzatVar;
                }
                return this;
            case 7:
                zzh.zzj("search", 1, list);
                Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(str4);
                if (!matcher2.find()) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                zzatVar = new zzah(Double.valueOf(matcher2.start()));
                return zzatVar;
            case 8:
                zzh.zzj("slice", 2, list);
                double dZza = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                double dMax = dZza < 0.0d ? Math.max(((double) str4.length()) + dZza, 0.0d) : Math.min(dZza, str4.length());
                double dZza2 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str4.length());
                int i5 = (int) dMax;
                zzatVar = new zzat(str4.substring(i5, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(((double) str4.length()) + dZza2, 0.0d) : Math.min(dZza2, str4.length()))) - i5) + i5));
                return zzatVar;
            case 9:
                zzh.zzj("split", 2, list);
                if (str4.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long jZzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (jZzd == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str4.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    int length = strArrSplit.length;
                    if (!strZzi3.isEmpty() || length <= 0) {
                        z = false;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        i2 = length - 1;
                        if (!strArrSplit[i2].isEmpty()) {
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jZzd) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList.add(new zzat(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    i3 = zIsEmpty;
                    z = zIsEmpty;
                    i2 = length;
                    i3 = z;
                    i3 = zIsEmpty;
                    z = zIsEmpty;
                    if (length > jZzd) {
                        i2--;
                    }
                    while (i3 < i2) {
                        arrayList.add(new zzat(strArrSplit[i3]));
                        i3++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzj("substring", 2, list);
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iZza = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int iZza3 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str4.length();
                int iMin = Math.min(Math.max(iZza, 0), str4.length());
                int iMin2 = Math.min(Math.max(iZza3, 0), str4.length());
                return new zzat(str4.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.zzh("toLocaleUpperCase", 0, list);
                return new zzat(str4.toUpperCase());
            case 12:
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(str4.toLowerCase());
            case 13:
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(str4.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", 0, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(str4.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(str4.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.f15196OooO0Oo);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f15196OooO0Oo.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        String str = this.f15196OooO0Oo;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.f15196OooO0Oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new OooO0o(this);
    }
}
