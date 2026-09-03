package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.WorkerThread;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzey;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzmh;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p039OoooOoo.o00OO;
import p269o00ooooo.o0O0OO0;
import p269o00ooooo.oOOO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlj extends oOOO0O0o {
    public static final String OooO(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static final void OooO0OO(zzfs zzfsVar, String str, Long l) {
        List listZzp = zzfsVar.zzp();
        int i = 0;
        while (true) {
            if (i >= listZzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfx) listZzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfw zzfwVarZze = zzfx.zze();
        zzfwVarZze.zzj(str);
        if (l instanceof Long) {
            zzfwVarZze.zzi(l.longValue());
        }
        if (i >= 0) {
            zzfsVar.zzj(i, zzfwVarZze);
        } else {
            zzfsVar.zze(zzfwVarZze);
        }
    }

    public static final zzfx OooO0Oo(zzft zzftVar, String str) {
        for (zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable OooO0o0(zzft zzftVar, String str) {
        zzfx zzfxVarOooO0Oo = OooO0Oo(zzftVar, str);
        if (zzfxVarOooO0Oo == null) {
            return null;
        }
        if (zzfxVarOooO0Oo.zzy()) {
            return zzfxVarOooO0Oo.zzh();
        }
        if (zzfxVarOooO0Oo.zzw()) {
            return Long.valueOf(zzfxVarOooO0Oo.zzd());
        }
        if (zzfxVarOooO0Oo.zzu()) {
            return Double.valueOf(zzfxVarOooO0Oo.zza());
        }
        if (zzfxVarOooO0Oo.zzc() <= 0) {
            return null;
        }
        List<zzfx> listZzi = zzfxVarOooO0Oo.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfx zzfxVar : listZzi) {
            if (zzfxVar != null) {
                Bundle bundle = new Bundle();
                for (zzfx zzfxVar2 : zzfxVar.zzi()) {
                    if (zzfxVar2.zzy()) {
                        bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                    } else if (zzfxVar2.zzw()) {
                        bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                    } else if (zzfxVar2.zzu()) {
                        bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void OooO0oo(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void OooOO0(StringBuilder sb, String str, zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        OooO0oo(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            OooO0oo(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : zzgiVar.zzi()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            OooO0oo(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : zzgiVar.zzk()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            OooO0oo(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (zzfr zzfrVar : zzgiVar.zzh()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(CertificateUtil.DELIMITER);
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            OooO0oo(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (zzgk zzgkVar : zzgiVar.zzj()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzgkVar.zzf().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        OooO0oo(3, sb);
        sb.append("}\n");
    }

    public static final void OooOO0O(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        OooO0oo(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void OooOO0o(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        String str2;
        if (zzerVar == null) {
            return;
        }
        OooO0oo(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (zzerVar.zzg()) {
            int iZzm = zzerVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            OooOO0O(sb, i, "comparison_type", str2);
        }
        if (zzerVar.zzi()) {
            OooOO0O(sb, i, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            OooOO0O(sb, i, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            OooOO0O(sb, i, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            OooOO0O(sb, i, "max_comparison_value", zzerVar.zzd());
        }
        OooO0oo(i, sb);
        sb.append("}\n");
    }

    public static int OooOOO0(zzgc zzgcVar, String str) {
        for (int i = 0; i < zzgcVar.zzb(); i++) {
            if (str.equals(zzgcVar.zzap(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle OooOOOO(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(OooOOOO((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static zzau OooOOo0(zzaa zzaaVar) {
        Object obj;
        Bundle bundleOooOOOO = OooOOOO(zzaaVar.zze(), true);
        String string = (!bundleOooOOOO.containsKey("_o") || (obj = bundleOooOOOO.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzhc.zzb(zzaaVar.zzd());
        if (strZzb == null) {
            strZzb = zzaaVar.zzd();
        }
        return new zzau(strZzb, new zzas(bundleOooOOOO), string, zzaaVar.zza());
    }

    public static zzmh OooOOoo(zzkx zzkxVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzll {
        zzkn zzknVarZza = zzkn.zza();
        return zzknVarZza != null ? zzkxVar.zzaz(bArr, zzknVarZza) : zzkxVar.zzay(bArr);
    }

    public static HashMap OooOo(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(OooOo((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(OooOo((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(OooOo((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static ArrayList OooOo0o(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean OooOoO0(int i, List list) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean OooOoOO(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
    }

    public final void OooO0o(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfx zzfxVar = (zzfx) it.next();
            if (zzfxVar != null) {
                OooO0oo(i2, sb);
                sb.append("param {\n");
                OooOO0O(sb, i2, "name", zzfxVar.zzx() ? this.f41276OooO00o.zzj().OooO0o0(zzfxVar.zzg()) : null);
                OooOO0O(sb, i2, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                OooOO0O(sb, i2, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                OooOO0O(sb, i2, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    OooO0o(sb, i2, zzfxVar.zzi());
                }
                OooO0oo(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public final void OooO0oO(StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        OooO0oo(i, sb);
        sb.append("filter {\n");
        if (zzemVar.zzh()) {
            OooOO0O(sb, i, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            OooOO0O(sb, i, "param_name", this.f41276OooO00o.zzj().OooO0o0(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i2 = i + 1;
            zzey zzeyVarZzd = zzemVar.zzd();
            if (zzeyVarZzd != null) {
                OooO0oo(i2, sb);
                sb.append("string_filter {\n");
                if (zzeyVarZzd.zzi()) {
                    switch (zzeyVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    OooOO0O(sb, i2, "match_type", str);
                }
                if (zzeyVarZzd.zzh()) {
                    OooOO0O(sb, i2, "expression", zzeyVarZzd.zzd());
                }
                if (zzeyVarZzd.zzg()) {
                    OooOO0O(sb, i2, "case_sensitive", Boolean.valueOf(zzeyVarZzd.zzf()));
                }
                if (zzeyVarZzd.zza() > 0) {
                    OooO0oo(i2 + 1, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : zzeyVarZzd.zze()) {
                        OooO0oo(i2 + 2, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                OooO0oo(i2, sb);
                sb.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            OooOO0o(sb, i + 1, "number_filter", zzemVar.zzc());
        }
        OooO0oo(i, sb);
        sb.append("}\n");
    }

    @WorkerThread
    public final long OooOOO(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzv().zzg();
        MessageDigest messageDigestOooO0oO = zzlp.OooO0oO();
        if (messageDigestOooO0oO != null) {
            return zzlp.Oooo0oo(messageDigestOooO0oO.digest(bArr));
        }
        o0O0OO0.OooO00o(zzgdVar, "Failed to get MD5");
        return 0L;
    }

    public final Parcelable OooOOOo(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f41276OooO00o.zzaA().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzft OooOOo(zzap zzapVar) {
        zzfs zzfsVarZze = zzft.zze();
        zzfsVarZze.zzl(zzapVar.f15890OooO0o0);
        zzas zzasVar = zzapVar.f15889OooO0o;
        for (String str : zzasVar.f15891OooO0Oo.keySet()) {
            zzfw zzfwVarZze = zzfx.zze();
            zzfwVarZze.zzj(str);
            Object obj = zzasVar.f15891OooO0Oo.get(str);
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj);
            zzfwVarZze.zzg();
            zzfwVarZze.zze();
            zzfwVarZze.zzd();
            zzfwVarZze.zzf();
            if (obj instanceof String) {
                zzfwVarZze.zzk((String) obj);
            } else if (obj instanceof Long) {
                zzfwVarZze.zzi(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                zzfwVarZze.zzh(((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                ArrayList arrayList = new ArrayList();
                for (Bundle bundle : (Bundle[]) obj) {
                    if (bundle != null) {
                        zzfw zzfwVarZze2 = zzfx.zze();
                        for (String str2 : bundle.keySet()) {
                            zzfw zzfwVarZze3 = zzfx.zze();
                            zzfwVarZze3.zzj(str2);
                            Object obj2 = bundle.get(str2);
                            if (obj2 instanceof Long) {
                                zzfwVarZze3.zzi(((Long) obj2).longValue());
                            } else if (obj2 instanceof String) {
                                zzfwVarZze3.zzk((String) obj2);
                            } else if (obj2 instanceof Double) {
                                zzfwVarZze3.zzh(((Double) obj2).doubleValue());
                            }
                            zzfwVarZze2.zzc(zzfwVarZze3);
                        }
                        if (zzfwVarZze2.zza() > 0) {
                            arrayList.add((zzfx) zzfwVarZze2.zzaD());
                        }
                    }
                }
                zzfwVarZze.zzb(arrayList);
            } else {
                this.f41276OooO00o.zzaA().zzd().zzb("Ignoring invalid (type) event param value", obj);
            }
            zzfsVarZze.zze(zzfwVarZze);
        }
        return (zzft) zzfsVarZze.zzaD();
    }

    public final String OooOo0(com.google.android.gms.internal.measurement.zzet zzetVar) {
        StringBuilder sbOooO00o = o00OO.OooO00o("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            OooOO0O(sbOooO00o, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        OooOO0O(sbOooO00o, 0, "property_name", this.f41276OooO00o.zzj().OooO0o(zzetVar.zze()));
        String strOooO = OooO(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!strOooO.isEmpty()) {
            OooOO0O(sbOooO00o, 0, "filter_type", strOooO);
        }
        OooO0oO(sbOooO00o, 1, zzetVar.zzb());
        sbOooO00o.append("}\n");
        return sbOooO00o.toString();
    }

    public final String OooOo00(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder sbOooO00o = o00OO.OooO00o("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                OooO0oo(1, sbOooO00o);
                sbOooO00o.append("bundle {\n");
                if (zzgdVar.zzbl()) {
                    OooOO0O(sbOooO00o, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzqu.zzc();
                zzgd zzgdVar2 = this.f41276OooO00o;
                if (zzgdVar2.zzf().zzs(zzgdVar.zzy(), zzeg.zzao) && zzgdVar.zzbo()) {
                    OooOO0O(sbOooO00o, 1, "session_stitching_token", zzgdVar.zzL());
                }
                OooOO0O(sbOooO00o, 1, "platform", zzgdVar.zzJ());
                if (zzgdVar.zzbh()) {
                    OooOO0O(sbOooO00o, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbt()) {
                    OooOO0O(sbOooO00o, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzs()));
                }
                if (zzgdVar.zzbf()) {
                    OooOO0O(sbOooO00o, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzbc()) {
                    OooOO0O(sbOooO00o, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                OooOO0O(sbOooO00o, 1, "gmp_app_id", zzgdVar.zzG());
                OooOO0O(sbOooO00o, 1, "admob_app_id", zzgdVar.zzx());
                OooOO0O(sbOooO00o, 1, "app_id", zzgdVar.zzy());
                OooOO0O(sbOooO00o, 1, "app_version", zzgdVar.zzB());
                if (zzgdVar.zzba()) {
                    OooOO0O(sbOooO00o, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                OooOO0O(sbOooO00o, 1, "firebase_instance_id", zzgdVar.zzF());
                if (zzgdVar.zzbe()) {
                    OooOO0O(sbOooO00o, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                OooOO0O(sbOooO00o, 1, "app_store", zzgdVar.zzA());
                if (zzgdVar.zzbs()) {
                    OooOO0O(sbOooO00o, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbp()) {
                    OooOO0O(sbOooO00o, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbg()) {
                    OooOO0O(sbOooO00o, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbk()) {
                    OooOO0O(sbOooO00o, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbj()) {
                    OooOO0O(sbOooO00o, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                OooOO0O(sbOooO00o, 1, "app_instance_id", zzgdVar.zzz());
                OooOO0O(sbOooO00o, 1, "resettable_device_id", zzgdVar.zzK());
                OooOO0O(sbOooO00o, 1, "ds_id", zzgdVar.zzE());
                if (zzgdVar.zzbi()) {
                    OooOO0O(sbOooO00o, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaY()));
                }
                OooOO0O(sbOooO00o, 1, "os_version", zzgdVar.zzI());
                OooOO0O(sbOooO00o, 1, "device_model", zzgdVar.zzD());
                OooOO0O(sbOooO00o, 1, "user_default_language", zzgdVar.zzM());
                if (zzgdVar.zzbr()) {
                    OooOO0O(sbOooO00o, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzbb()) {
                    OooOO0O(sbOooO00o, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbn()) {
                    OooOO0O(sbOooO00o, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaZ()));
                }
                OooOO0O(sbOooO00o, 1, "health_monitor", zzgdVar.zzH());
                if (zzgdVar.zzbm()) {
                    OooOO0O(sbOooO00o, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbd()) {
                    OooOO0O(sbOooO00o, 1, "consent_signals", zzgdVar.zzC());
                }
                zzpz.zzc();
                if (zzgdVar2.zzf().zzs(null, zzeg.zzaE) && zzgdVar.zzbq()) {
                    OooOO0O(sbOooO00o, 1, "target_os_version", Long.valueOf(zzgdVar.zzq()));
                }
                List<zzgm> listZzP = zzgdVar.zzP();
                if (listZzP != null) {
                    for (zzgm zzgmVar : listZzP) {
                        if (zzgmVar != null) {
                            OooO0oo(2, sbOooO00o);
                            sbOooO00o.append("user_property {\n");
                            OooOO0O(sbOooO00o, 2, "set_timestamp_millis", zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            OooOO0O(sbOooO00o, 2, "name", zzgdVar2.zzj().OooO0o(zzgmVar.zzf()));
                            OooOO0O(sbOooO00o, 2, "string_value", zzgmVar.zzg());
                            OooOO0O(sbOooO00o, 2, "int_value", zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            OooOO0O(sbOooO00o, 2, "double_value", zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            OooO0oo(2, sbOooO00o);
                            sbOooO00o.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> listZzN = zzgdVar.zzN();
                if (listZzN != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : listZzN) {
                        if (zzfpVar != null) {
                            OooO0oo(2, sbOooO00o);
                            sbOooO00o.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                OooOO0O(sbOooO00o, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                OooOO0O(sbOooO00o, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            OooOO0(sbOooO00o, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                OooOO0(sbOooO00o, "previous_data", zzfpVar.zze());
                            }
                            OooO0oo(2, sbOooO00o);
                            sbOooO00o.append("}\n");
                        }
                    }
                }
                List<zzft> listZzO = zzgdVar.zzO();
                if (listZzO != null) {
                    for (zzft zzftVar : listZzO) {
                        if (zzftVar != null) {
                            OooO0oo(2, sbOooO00o);
                            sbOooO00o.append("event {\n");
                            OooOO0O(sbOooO00o, 2, "name", zzgdVar2.zzj().OooO0Oo(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                OooOO0O(sbOooO00o, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                OooOO0O(sbOooO00o, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                OooOO0O(sbOooO00o, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                OooO0o(sbOooO00o, 2, zzftVar.zzi());
                            }
                            OooO0oo(2, sbOooO00o);
                            sbOooO00o.append("}\n");
                        }
                    }
                }
                OooO0oo(1, sbOooO00o);
                sbOooO00o.append("}\n");
            }
        }
        sbOooO00o.append("}\n");
        return sbOooO00o.toString();
    }

    public final List OooOo0O(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            zzgd zzgdVar = this.f41276OooO00o;
            if (iIntValue < 0) {
                zzgdVar.zzaA().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue2 = num.intValue() / 64;
                if (iIntValue2 >= arrayList.size()) {
                    zzgdVar.zzaA().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue2, Long.valueOf(((Long) arrayList.get(iIntValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final boolean OooOoO(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f41276OooO00o.zzax().currentTimeMillis() - j) > j2;
    }

    public final byte[] OooOoo0(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f41276OooO00o.zzaA().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
