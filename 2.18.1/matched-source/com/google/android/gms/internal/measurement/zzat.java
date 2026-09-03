package com.google.android.gms.internal.measurement;

import OooO0o.OooO0OO;
import com.umeng.analytics.pro.bz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p334o0OO00o.OooOO0O;
import p334o0OO00o.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f15898Oooo0o;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f15898Oooo0o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.f15898Oooo0o.equals(((zzat) obj).f15898Oooo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15898Oooo0o.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new OooOOO0(this);
    }

    public final String toString() {
        return OooO0OO.OooO00o("\"", this.f15898Oooo0o, "\"");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0167  */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:104:0x0186  */
    /* JADX WARN: Code duplicated, block: B:105:0x019d  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:112:0x0215  */
    /* JADX WARN: Code duplicated, block: B:115:0x021f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0237  */
    /* JADX WARN: Code duplicated, block: B:119:0x0268  */
    /* JADX WARN: Code duplicated, block: B:121:0x027a  */
    /* JADX WARN: Code duplicated, block: B:122:0x028b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x029c  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:142:0x0305  */
    /* JADX WARN: Code duplicated, block: B:144:0x0309 A[LOOP:0: B:143:0x0307->B:144:0x0309, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x031d  */
    /* JADX WARN: Code duplicated, block: B:148:0x032f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0343  */
    /* JADX WARN: Code duplicated, block: B:152:0x034f  */
    /* JADX WARN: Code duplicated, block: B:153:0x035a  */
    /* JADX WARN: Code duplicated, block: B:156:0x036b  */
    /* JADX WARN: Code duplicated, block: B:157:0x037e  */
    /* JADX WARN: Code duplicated, block: B:160:0x038d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0398  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:168:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:170:0x0400  */
    /* JADX WARN: Code duplicated, block: B:172:0x0412  */
    /* JADX WARN: Code duplicated, block: B:174:0x0428  */
    /* JADX WARN: Code duplicated, block: B:177:0x043c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0440  */
    /* JADX WARN: Code duplicated, block: B:182:0x0483  */
    /* JADX WARN: Code duplicated, block: B:184:0x0495  */
    /* JADX WARN: Code duplicated, block: B:185:0x0498  */
    /* JADX WARN: Code duplicated, block: B:188:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:189:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:193:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:196:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:197:0x0500  */
    /* JADX WARN: Code duplicated, block: B:200:0x0519  */
    /* JADX WARN: Code duplicated, block: B:201:0x051c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0531  */
    /* JADX WARN: Code duplicated, block: B:206:0x0546  */
    /* JADX WARN: Code duplicated, block: B:210:0x055e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0586  */
    /* JADX WARN: Code duplicated, block: B:214:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:215:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:223:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:225:0x05da  */
    /* JADX WARN: Code duplicated, block: B:228:0x05e8 A[LOOP:1: B:226:0x05e2->B:228:0x05e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0609  */
    /* JADX WARN: Code duplicated, block: B:233:0x0619  */
    /* JADX WARN: Code duplicated, block: B:234:0x0632  */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0125  */
    /* JADX WARN: Code duplicated, block: B:82:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0154  */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0160 A[PHI: r4 r6
      0x0160: PHI (r4v53 java.lang.String) = (r4v3 java.lang.String), (r4v54 java.lang.String) binds: [B:96:0x015c, B:94:0x0151] A[DONT_GENERATE, DONT_INLINE]
      0x0160: PHI (r6v22 java.lang.String) = (r6v1 java.lang.String), (r6v23 java.lang.String) binds: [B:96:0x015c, B:94:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:203:0x0531, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        byte b;
        String strZzi;
        int iZza;
        zzap zzatVar;
        zzat zzatVar2;
        StringBuilder sb;
        int i;
        String str5;
        zzap zzapVarZzb;
        int i2;
        double dDoubleValue;
        double dZza;
        zzap zzahVar;
        String strZzi2;
        zzap zzapVarZza;
        String str6;
        String str7;
        int iIndexOf;
        String str8;
        double dDoubleValue2;
        double dZza2;
        double dMin;
        double length;
        double dZza3;
        double dMin2;
        zzat zzatVar3;
        String str9;
        ArrayList arrayList;
        String strZzi3;
        long jZzd;
        String[] strArrSplit;
        int length2;
        boolean z;
        int i3;
        int i4;
        boolean zIsEmpty;
        String str10;
        zzg zzgVar2;
        int iZza2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str3 = "charAt";
                    str4 = r4;
                    if (str.equals(str4)) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -1776922004:
                    str3 = "charAt";
                    if (str.equals("toString")) {
                        b = bz.l;
                        str4 = r4;
                    }
                    str4 = "hasOwnProperty";
                    b = -1;
                    break;
                case -1464939364:
                    str3 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b = 12;
                        str4 = r4;
                    }
                    str4 = "hasOwnProperty";
                    b = -1;
                    break;
                case -1361633751:
                    str3 = "charAt";
                    if (str.equals(str3)) {
                        b = 0;
                        str4 = r4;
                    }
                    str4 = "hasOwnProperty";
                    b = -1;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b = 1;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b = bz.k;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b = 7;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b = 11;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b = 4;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b = bz.m;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        b = bz.n;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b = 5;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b = 8;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b = 9;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b = 10;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b = 6;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b = 3;
                        str3 = "charAt";
                        str4 = r4;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        b = -1;
                    }
                    break;
                default:
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                    break;
            }
            strZzi = "undefined";
            switch (b) {
                case 0:
                    zzh.zzj(str3, 1, list);
                    if (list.isEmpty()) {
                        iZza = 0;
                    } else {
                        iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                    }
                    String str11 = this.f15898Oooo0o;
                    if (iZza >= 0 || iZza >= str11.length()) {
                        return zzap.zzm;
                    }
                    zzatVar = new zzat(String.valueOf(str11.charAt(iZza)));
                    return zzatVar;
                case 1:
                    zzatVar2 = this;
                    if (!list.isEmpty()) {
                        sb = new StringBuilder(zzatVar2.f15898Oooo0o);
                        for (i = 0; i < list.size(); i++) {
                            sb.append(zzgVar.zzb((zzap) list.get(i)).zzi());
                        }
                        return new zzat(sb.toString());
                    }
                    return zzatVar2;
                case 2:
                    zzh.zzh(str4, 1, list);
                    str5 = this.f15898Oooo0o;
                    zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                    if ("length".equals(zzapVarZzb.zzi())) {
                        return zzap.zzk;
                    }
                    double dDoubleValue3 = zzapVarZzb.zzh().doubleValue();
                    return (dDoubleValue3 == Math.floor(dDoubleValue3) || (i2 = (int) dDoubleValue3) < 0 || i2 >= str5.length()) ? zzap.zzl : zzap.zzk;
                case 3:
                    zzh.zzj("indexOf", 2, list);
                    zzatVar = new zzah(Double.valueOf(this.f15898Oooo0o.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                    return zzatVar;
                case 4:
                    zzh.zzj("lastIndexOf", 2, list);
                    String str12 = this.f15898Oooo0o;
                    String strZzi4 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                    if (list.size() < 2) {
                        dDoubleValue = Double.NaN;
                    } else {
                        dDoubleValue = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue)) {
                        dZza = Double.POSITIVE_INFINITY;
                    } else {
                        dZza = zzh.zza(dDoubleValue);
                    }
                    zzahVar = new zzah(Double.valueOf(str12.lastIndexOf(strZzi4, (int) dZza)));
                    return zzahVar;
                case 5:
                    zzh.zzj("match", 1, list);
                    String str13 = this.f15898Oooo0o;
                    if (list.size() <= 0) {
                        strZzi2 = "";
                    } else {
                        strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    Matcher matcher = Pattern.compile(strZzi2).matcher(str13);
                    return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
                case 6:
                    zzatVar2 = this;
                    zzh.zzj("replace", 2, list);
                    zzapVarZza = zzap.zzf;
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                        }
                    }
                    str6 = strZzi;
                    str7 = zzatVar2.f15898Oooo0o;
                    iIndexOf = str7.indexOf(str6);
                    if (iIndexOf >= 0) {
                        if (zzapVarZza instanceof zzai) {
                            zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str6), new zzah(Double.valueOf(iIndexOf)), zzatVar2));
                        }
                        zzahVar = new zzat(OooO0OO.OooO00o(str7.substring(0, iIndexOf), zzapVarZza.zzi(), str7.substring(str6.length() + iIndexOf)));
                        return zzahVar;
                    }
                    return zzatVar2;
                case 7:
                    zzh.zzj("search", 1, list);
                    Matcher matcher2 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.f15898Oooo0o);
                    return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
                case 8:
                    zzh.zzj("slice", 2, list);
                    str8 = this.f15898Oooo0o;
                    if (list.isEmpty()) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue();
                    }
                    dZza2 = zzh.zza(dDoubleValue2);
                    if (dZza2 < 0.0d) {
                        dMin = Math.max(((double) str8.length()) + dZza2, 0.0d);
                    } else {
                        dMin = Math.min(dZza2, str8.length());
                    }
                    int i5 = (int) dMin;
                    if (list.size() > 1) {
                        length = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    } else {
                        length = str8.length();
                    }
                    dZza3 = zzh.zza(length);
                    if (dZza3 < 0.0d) {
                        dMin2 = Math.max(((double) str8.length()) + dZza3, 0.0d);
                    } else {
                        dMin2 = Math.min(dZza3, str8.length());
                    }
                    zzatVar3 = new zzat(str8.substring(i5, Math.max(0, ((int) dMin2) - i5) + i5));
                    return zzatVar3;
                case 9:
                    zzh.zzj("split", 2, list);
                    str9 = this.f15898Oooo0o;
                    if (str9.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            jZzd = zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                        } else {
                            jZzd = 2147483647L;
                        }
                        if (jZzd == 0) {
                            return new zzae();
                        }
                        strArrSplit = str9.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                        length2 = strArrSplit.length;
                        if (strZzi3.isEmpty() || length2 <= 0) {
                            z = false;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i3 = length2 - 1;
                            if (!strArrSplit[i3].isEmpty()) {
                            }
                            i4 = zIsEmpty;
                            z = zIsEmpty;
                            if (length2 > jZzd) {
                                i3--;
                            }
                            while (i4 < i3) {
                                arrayList.add(new zzat(strArrSplit[i4]));
                                i4++;
                            }
                        }
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        i3 = length2;
                        i4 = z;
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        if (length2 > jZzd) {
                            i3--;
                        }
                        while (i4 < i3) {
                            arrayList.add(new zzat(strArrSplit[i4]));
                            i4++;
                        }
                    }
                    return new zzae(arrayList);
                case 10:
                    zzh.zzj("substring", 2, list);
                    str10 = this.f15898Oooo0o;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZza2 = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZza2 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        length3 = str10.length();
                    }
                    int iMin = Math.min(Math.max(iZza2, 0), str10.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str10.length());
                    zzatVar3 = new zzat(str10.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    return zzatVar3;
                case 11:
                    zzh.zzh(str2, 0, list);
                    return new zzat(this.f15898Oooo0o.toUpperCase());
                case 12:
                    zzh.zzh("toLocaleLowerCase", 0, list);
                    return new zzat(this.f15898Oooo0o.toLowerCase());
                case 13:
                    zzh.zzh("toLowerCase", 0, list);
                    return new zzat(this.f15898Oooo0o.toLowerCase(Locale.ENGLISH));
                case 14:
                    zzatVar2 = this;
                    zzh.zzh("toString", 0, list);
                    return zzatVar2;
                case 15:
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.f15898Oooo0o.toUpperCase(Locale.ENGLISH));
                case 16:
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.f15898Oooo0o.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = r4;
                if (str.equals(str4)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    b = bz.l;
                    str4 = r4;
                }
                str4 = "hasOwnProperty";
                b = -1;
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b = 12;
                    str4 = r4;
                }
                str4 = "hasOwnProperty";
                b = -1;
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    b = 0;
                    str4 = r4;
                }
                str4 = "hasOwnProperty";
                b = -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 1;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = bz.k;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    b = 7;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b = 11;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 4;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = bz.m;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b = bz.n;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 5;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 8;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = 9;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 10;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 6;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 3;
                    str3 = "charAt";
                    str4 = r4;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    b = -1;
                }
                break;
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                b = -1;
                break;
        }
        strZzi = "undefined";
        switch (b) {
            case 0:
                zzh.zzj(str3, 1, list);
                if (list.isEmpty()) {
                    iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                } else {
                    iZza = 0;
                }
                String str14 = this.f15898Oooo0o;
                if (iZza >= 0) {
                    break;
                }
                return zzap.zzm;
            case 1:
                zzatVar2 = this;
                if (!list.isEmpty()) {
                    sb = new StringBuilder(zzatVar2.f15898Oooo0o);
                    while (i < list.size()) {
                        sb.append(zzgVar.zzb((zzap) list.get(i)).zzi());
                    }
                    return new zzat(sb.toString());
                }
                return zzatVar2;
            case 2:
                zzh.zzh(str4, 1, list);
                str5 = this.f15898Oooo0o;
                zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    return zzap.zzk;
                }
                double dDoubleValue4 = zzapVarZzb.zzh().doubleValue();
                if (dDoubleValue4 == Math.floor(dDoubleValue4)) {
                }
                break;
            case 3:
                zzh.zzj("indexOf", 2, list);
                zzatVar = new zzah(Double.valueOf(this.f15898Oooo0o.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
                return zzatVar;
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str15 = this.f15898Oooo0o;
                String strZzi5 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                if (list.size() < 2) {
                    dDoubleValue = Double.NaN;
                } else {
                    dDoubleValue = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                }
                if (Double.isNaN(dDoubleValue)) {
                    dZza = Double.POSITIVE_INFINITY;
                } else {
                    dZza = zzh.zza(dDoubleValue);
                }
                zzahVar = new zzah(Double.valueOf(str15.lastIndexOf(strZzi5, (int) dZza)));
                return zzahVar;
            case 5:
                zzh.zzj("match", 1, list);
                String str16 = this.f15898Oooo0o;
                if (list.size() <= 0) {
                    strZzi2 = "";
                } else {
                    strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                Matcher matcher3 = Pattern.compile(strZzi2).matcher(str16);
                if (matcher3.find()) {
                }
            case 6:
                zzatVar2 = this;
                zzh.zzj("replace", 2, list);
                zzapVarZza = zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                str6 = strZzi;
                str7 = zzatVar2.f15898Oooo0o;
                iIndexOf = str7.indexOf(str6);
                if (iIndexOf >= 0) {
                    if (zzapVarZza instanceof zzai) {
                        zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str6), new zzah(Double.valueOf(iIndexOf)), zzatVar2));
                    }
                    zzahVar = new zzat(OooO0OO.OooO00o(str7.substring(0, iIndexOf), zzapVarZza.zzi(), str7.substring(str6.length() + iIndexOf)));
                    return zzahVar;
                }
                return zzatVar2;
            case 7:
                zzh.zzj("search", 1, list);
                Matcher matcher4 = Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.f15898Oooo0o);
                if (matcher4.find()) {
                }
            case 8:
                zzh.zzj("slice", 2, list);
                str8 = this.f15898Oooo0o;
                if (list.isEmpty()) {
                    dDoubleValue2 = zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                dZza2 = zzh.zza(dDoubleValue2);
                if (dZza2 < 0.0d) {
                    dMin = Math.max(((double) str8.length()) + dZza2, 0.0d);
                } else {
                    dMin = Math.min(dZza2, str8.length());
                }
                int i6 = (int) dMin;
                if (list.size() > 1) {
                    length = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                } else {
                    length = str8.length();
                }
                dZza3 = zzh.zza(length);
                if (dZza3 < 0.0d) {
                    dMin2 = Math.max(((double) str8.length()) + dZza3, 0.0d);
                } else {
                    dMin2 = Math.min(dZza3, str8.length());
                }
                zzatVar3 = new zzat(str8.substring(i6, Math.max(0, ((int) dMin2) - i6) + i6));
                return zzatVar3;
            case 9:
                zzh.zzj("split", 2, list);
                str9 = this.f15898Oooo0o;
                if (str9.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        jZzd = zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        jZzd = 2147483647L;
                    }
                    if (jZzd == 0) {
                        return new zzae();
                    }
                    strArrSplit = str9.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    length2 = strArrSplit.length;
                    if (strZzi3.isEmpty()) {
                        z = false;
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        i3 = length2;
                        i4 = z;
                    } else {
                        z = false;
                        i4 = zIsEmpty;
                        z = zIsEmpty;
                        i3 = length2;
                        i4 = z;
                    }
                    i4 = zIsEmpty;
                    z = zIsEmpty;
                    if (length2 > jZzd) {
                        i3--;
                    }
                    while (i4 < i3) {
                        arrayList.add(new zzat(strArrSplit[i4]));
                        i4++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzj("substring", 2, list);
                str10 = this.f15898Oooo0o;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza2 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZza2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                } else {
                    length3 = str10.length();
                }
                int iMin3 = Math.min(Math.max(iZza2, 0), str10.length());
                int iMin4 = Math.min(Math.max(length3, 0), str10.length());
                zzatVar3 = new zzat(str10.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                return zzatVar3;
            case 11:
                zzh.zzh(str2, 0, list);
                return new zzat(this.f15898Oooo0o.toUpperCase());
            case 12:
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.f15898Oooo0o.toLowerCase());
            case 13:
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.f15898Oooo0o.toLowerCase(Locale.ENGLISH));
            case 14:
                zzatVar2 = this;
                zzh.zzh("toString", 0, list);
                return zzatVar2;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.f15898Oooo0o.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.f15898Oooo0o.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.f15898Oooo0o);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f15898Oooo0o.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.f15898Oooo0o.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f15898Oooo0o);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.f15898Oooo0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new OooOO0O(this);
    }
}
