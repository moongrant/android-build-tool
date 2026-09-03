package com.google.android.gms.measurement.internal;

import OooO00o.OooO00o;
import Oooo000.o0000oo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import o0OO0OoO.o0O0OOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlb extends o0O0OOOo {
    public zzlb(zzkz zzkzVar) {
        super(zzkzVar);
    }

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

    @WorkerThread
    public static final boolean OooO0OO(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfw OooO0Oo(zzfs zzfsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzfsVar.zzi()) {
            if (zzfwVar.zzg().equals(str)) {
                return zzfwVar;
            }
        }
        return null;
    }

    public static final Object OooO0o0(zzfs zzfsVar, String str) {
        com.google.android.gms.internal.measurement.zzfw zzfwVarOooO0Oo = OooO0Oo(zzfsVar, str);
        if (zzfwVarOooO0Oo == null) {
            return null;
        }
        if (zzfwVarOooO0Oo.zzy()) {
            return zzfwVarOooO0Oo.zzh();
        }
        if (zzfwVarOooO0Oo.zzw()) {
            return Long.valueOf(zzfwVarOooO0Oo.zzd());
        }
        if (zzfwVarOooO0Oo.zzu()) {
            return Double.valueOf(zzfwVarOooO0Oo.zza());
        }
        if (zzfwVarOooO0Oo.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfw> listZzi = zzfwVarOooO0Oo.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : listZzi) {
            if (zzfwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar2 : zzfwVar.zzi()) {
                    if (zzfwVar2.zzy()) {
                        bundle.putString(zzfwVar2.zzg(), zzfwVar2.zzh());
                    } else if (zzfwVar2.zzw()) {
                        bundle.putLong(zzfwVar2.zzg(), zzfwVar2.zzd());
                    } else if (zzfwVar2.zzu()) {
                        bundle.putDouble(zzfwVar2.zzg(), zzfwVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void OooO0oo(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void OooOO0(StringBuilder sb, String str, zzgh zzghVar) {
        if (zzghVar == null) {
            return;
        }
        OooO0oo(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzghVar.zzb() != 0) {
            OooO0oo(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : zzghVar.zzk()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (zzghVar.zzd() != 0) {
            OooO0oo(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : zzghVar.zzn()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zzghVar.zza() != 0) {
            OooO0oo(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfqVar.zzh() ? Integer.valueOf(zzfqVar.zza()) : null);
                sb.append(CertificateUtil.DELIMITER);
                sb.append(zzfqVar.zzg() ? Long.valueOf(zzfqVar.zzb()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (zzghVar.zzc() != 0) {
            OooO0oo(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (zzgj zzgjVar : zzghVar.zzm()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgjVar.zzi() ? Integer.valueOf(zzgjVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzgjVar.zzf().iterator();
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
        OooO0oo(sb, 3);
        sb.append("}\n");
    }

    public static final void OooOO0O(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        OooO0oo(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void OooOO0o(StringBuilder sb, int i, String str, zzeq zzeqVar) {
        String str2;
        if (zzeqVar == null) {
            return;
        }
        OooO0oo(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzeqVar.zzg()) {
            int iZzm = zzeqVar.zzm();
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
        if (zzeqVar.zzi()) {
            OooOO0O(sb, i, "match_as_float", Boolean.valueOf(zzeqVar.zzf()));
        }
        if (zzeqVar.zzh()) {
            OooOO0O(sb, i, "comparison_value", zzeqVar.zzc());
        }
        if (zzeqVar.zzk()) {
            OooOO0O(sb, i, "min_comparison_value", zzeqVar.zze());
        }
        if (zzeqVar.zzj()) {
            OooOO0O(sb, i, "max_comparison_value", zzeqVar.zzd());
        }
        OooO0oo(sb, i);
        sb.append("}\n");
    }

    public static int OooOOO0(zzgb zzgbVar, String str) {
        for (int i = 0; i < zzgbVar.zzb(); i++) {
            if (str.equals(zzgbVar.zzao(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static zzlk OooOOoo(zzlk zzlkVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzko {
        zzjq zzjqVarZza = zzjq.zza();
        return zzjqVarZza != null ? zzlkVar.zzaA(bArr, zzjqVarZza) : zzlkVar.zzaz(bArr);
    }

    public static List OooOo0o(BitSet bitSet) {
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

    public static boolean OooOoOO(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean OooOoo(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void OooOooo(zzfr zzfrVar, String str, Object obj) {
        List listZzp = zzfrVar.zzp();
        int i = 0;
        while (true) {
            if (i >= listZzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfw) listZzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
        zzfvVarZze.zzj(str);
        if (obj instanceof Long) {
            zzfvVarZze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfrVar.zzj(i, zzfvVarZze);
        } else {
            zzfrVar.zze(zzfvVarZze);
        }
    }

    @Override // o0OO0OoO.o0O0OOOo
    public final void OooO0O0() {
    }

    public final void OooO0o(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it.next();
            if (zzfwVar != null) {
                OooO0oo(sb, i2);
                sb.append("param {\n");
                OooOO0O(sb, i2, "name", zzfwVar.zzx() ? this.f37591OooO00o.zzj().OooO0o0(zzfwVar.zzg()) : null);
                OooOO0O(sb, i2, "string_value", zzfwVar.zzy() ? zzfwVar.zzh() : null);
                OooOO0O(sb, i2, "int_value", zzfwVar.zzw() ? Long.valueOf(zzfwVar.zzd()) : null);
                OooOO0O(sb, i2, "double_value", zzfwVar.zzu() ? Double.valueOf(zzfwVar.zza()) : null);
                if (zzfwVar.zzc() > 0) {
                    OooO0o(sb, i2, zzfwVar.zzi());
                }
                OooO0oo(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void OooO0oO(StringBuilder sb, int i, zzel zzelVar) {
        String str;
        if (zzelVar == null) {
            return;
        }
        OooO0oo(sb, i);
        sb.append("filter {\n");
        if (zzelVar.zzh()) {
            OooOO0O(sb, i, "complement", Boolean.valueOf(zzelVar.zzg()));
        }
        if (zzelVar.zzj()) {
            OooOO0O(sb, i, "param_name", this.f37591OooO00o.zzj().OooO0o0(zzelVar.zze()));
        }
        if (zzelVar.zzk()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzex zzexVarZzd = zzelVar.zzd();
            if (zzexVarZzd != null) {
                OooO0oo(sb, i2);
                sb.append("string_filter {\n");
                if (zzexVarZzd.zzi()) {
                    switch (zzexVarZzd.zzj()) {
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
                if (zzexVarZzd.zzh()) {
                    OooOO0O(sb, i2, "expression", zzexVarZzd.zzd());
                }
                if (zzexVarZzd.zzg()) {
                    OooOO0O(sb, i2, "case_sensitive", Boolean.valueOf(zzexVarZzd.zzf()));
                }
                if (zzexVarZzd.zza() > 0) {
                    OooO0oo(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : zzexVarZzd.zze()) {
                        OooO0oo(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                OooO0oo(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzelVar.zzi()) {
            OooOO0o(sb, i + 1, "number_filter", zzelVar.zzc());
        }
        OooO0oo(sb, i);
        sb.append("}\n");
    }

    @WorkerThread
    public final long OooOOO(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.f37591OooO00o.zzv().zzg();
        MessageDigest messageDigestOooO0oo = zzlh.OooO0oo();
        if (messageDigestOooO0oo != null) {
            return zzlh.OoooO00(messageDigestOooO0oo.digest(bArr));
        }
        o0000oo.OooO00o(this.f37591OooO00o, "Failed to get MD5");
        return 0L;
    }

    public final Bundle OooOOOO(Map map, boolean z) {
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
            this.f37591OooO00o.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzfs OooOOo(zzar zzarVar) {
        zzfr zzfrVarZze = zzfs.zze();
        zzfrVarZze.zzl(zzarVar.f16112OooO0o0);
        for (String str : zzarVar.f16111OooO0o.f16113Oooo.keySet()) {
            com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
            zzfvVarZze.zzj(str);
            Object objOooO0oo = zzarVar.f16111OooO0o.OooO0oo(str);
            Preconditions.checkNotNull(objOooO0oo);
            OooOoO0(zzfvVarZze, objOooO0oo);
            zzfrVarZze.zze(zzfvVarZze);
        }
        return (zzfs) zzfrVarZze.zzaE();
    }

    public final zzaw OooOOo0(zzaa zzaaVar) {
        Object obj;
        Bundle bundleOooOOOO = OooOOOO(zzaaVar.zze(), true);
        String string = (!bundleOooOOOO.containsKey("_o") || (obj = bundleOooOOOO.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzgv.zzb(zzaaVar.zzd());
        if (strZzb == null) {
            strZzb = zzaaVar.zzd();
        }
        return new zzaw(strZzb, new zzau(bundleOooOOOO), string, zzaaVar.zza());
    }

    public final Map OooOo(Bundle bundle, boolean z) {
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

    public final String OooOo0(zzes zzesVar) {
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("\nproperty_filter {\n");
        if (zzesVar.zzj()) {
            OooOO0O(sbOooO0O0, 0, "filter_id", Integer.valueOf(zzesVar.zza()));
        }
        OooOO0O(sbOooO0O0, 0, "property_name", this.f37591OooO00o.zzj().OooO0o(zzesVar.zze()));
        String strOooO = OooO(zzesVar.zzg(), zzesVar.zzh(), zzesVar.zzi());
        if (!strOooO.isEmpty()) {
            OooOO0O(sbOooO0O0, 0, "filter_type", strOooO);
        }
        OooO0oO(sbOooO0O0, 1, zzesVar.zzb());
        sbOooO0O0.append("}\n");
        return sbOooO0O0.toString();
    }

    public final String OooOo00(zzga zzgaVar) {
        if (zzgaVar == null) {
            return "";
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO0O0("\nbatch {\n");
        for (zzgc zzgcVar : zzgaVar.zzd()) {
            if (zzgcVar != null) {
                OooO0oo(sbOooO0O0, 1);
                sbOooO0O0.append("bundle {\n");
                if (zzgcVar.zzbj()) {
                    OooOO0O(sbOooO0O0, 1, "protocol_version", Integer.valueOf(zzgcVar.zzd()));
                }
                zzoz.zzc();
                if (this.f37591OooO00o.zzf().zzs(null, zzeb.zzar) && zzgcVar.zzbm()) {
                    OooOO0O(sbOooO0O0, 1, "session_stitching_token", zzgcVar.zzK());
                }
                OooOO0O(sbOooO0O0, 1, "platform", zzgcVar.zzI());
                if (zzgcVar.zzbf()) {
                    OooOO0O(sbOooO0O0, 1, "gmp_version", Long.valueOf(zzgcVar.zzm()));
                }
                if (zzgcVar.zzbq()) {
                    OooOO0O(sbOooO0O0, 1, "uploading_gmp_version", Long.valueOf(zzgcVar.zzr()));
                }
                if (zzgcVar.zzbd()) {
                    OooOO0O(sbOooO0O0, 1, "dynamite_version", Long.valueOf(zzgcVar.zzj()));
                }
                if (zzgcVar.zzba()) {
                    OooOO0O(sbOooO0O0, 1, "config_version", Long.valueOf(zzgcVar.zzh()));
                }
                OooOO0O(sbOooO0O0, 1, "gmp_app_id", zzgcVar.zzF());
                OooOO0O(sbOooO0O0, 1, "admob_app_id", zzgcVar.zzw());
                OooOO0O(sbOooO0O0, 1, "app_id", zzgcVar.zzx());
                OooOO0O(sbOooO0O0, 1, "app_version", zzgcVar.zzA());
                if (zzgcVar.zzaY()) {
                    OooOO0O(sbOooO0O0, 1, "app_version_major", Integer.valueOf(zzgcVar.zza()));
                }
                OooOO0O(sbOooO0O0, 1, "firebase_instance_id", zzgcVar.zzE());
                if (zzgcVar.zzbc()) {
                    OooOO0O(sbOooO0O0, 1, "dev_cert_hash", Long.valueOf(zzgcVar.zzi()));
                }
                OooOO0O(sbOooO0O0, 1, "app_store", zzgcVar.zzz());
                if (zzgcVar.zzbp()) {
                    OooOO0O(sbOooO0O0, 1, "upload_timestamp_millis", Long.valueOf(zzgcVar.zzq()));
                }
                if (zzgcVar.zzbn()) {
                    OooOO0O(sbOooO0O0, 1, "start_timestamp_millis", Long.valueOf(zzgcVar.zzp()));
                }
                if (zzgcVar.zzbe()) {
                    OooOO0O(sbOooO0O0, 1, "end_timestamp_millis", Long.valueOf(zzgcVar.zzk()));
                }
                if (zzgcVar.zzbi()) {
                    OooOO0O(sbOooO0O0, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgcVar.zzo()));
                }
                if (zzgcVar.zzbh()) {
                    OooOO0O(sbOooO0O0, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgcVar.zzn()));
                }
                OooOO0O(sbOooO0O0, 1, "app_instance_id", zzgcVar.zzy());
                OooOO0O(sbOooO0O0, 1, "resettable_device_id", zzgcVar.zzJ());
                OooOO0O(sbOooO0O0, 1, "ds_id", zzgcVar.zzD());
                if (zzgcVar.zzbg()) {
                    OooOO0O(sbOooO0O0, 1, "limited_ad_tracking", Boolean.valueOf(zzgcVar.zzaW()));
                }
                OooOO0O(sbOooO0O0, 1, "os_version", zzgcVar.zzH());
                OooOO0O(sbOooO0O0, 1, "device_model", zzgcVar.zzC());
                OooOO0O(sbOooO0O0, 1, "user_default_language", zzgcVar.zzL());
                if (zzgcVar.zzbo()) {
                    OooOO0O(sbOooO0O0, 1, "time_zone_offset_minutes", Integer.valueOf(zzgcVar.zzf()));
                }
                if (zzgcVar.zzaZ()) {
                    OooOO0O(sbOooO0O0, 1, "bundle_sequential_index", Integer.valueOf(zzgcVar.zzb()));
                }
                if (zzgcVar.zzbl()) {
                    OooOO0O(sbOooO0O0, 1, "service_upload", Boolean.valueOf(zzgcVar.zzaX()));
                }
                OooOO0O(sbOooO0O0, 1, "health_monitor", zzgcVar.zzG());
                if (zzgcVar.zzbk()) {
                    OooOO0O(sbOooO0O0, 1, "retry_counter", Integer.valueOf(zzgcVar.zze()));
                }
                if (zzgcVar.zzbb()) {
                    OooOO0O(sbOooO0O0, 1, "consent_signals", zzgcVar.zzB());
                }
                List<zzgl> listZzO = zzgcVar.zzO();
                if (listZzO != null) {
                    for (zzgl zzglVar : listZzO) {
                        if (zzglVar != null) {
                            OooO0oo(sbOooO0O0, 2);
                            sbOooO0O0.append("user_property {\n");
                            OooOO0O(sbOooO0O0, 2, "set_timestamp_millis", zzglVar.zzs() ? Long.valueOf(zzglVar.zzc()) : null);
                            OooOO0O(sbOooO0O0, 2, "name", this.f37591OooO00o.zzj().OooO0o(zzglVar.zzf()));
                            OooOO0O(sbOooO0O0, 2, "string_value", zzglVar.zzg());
                            OooOO0O(sbOooO0O0, 2, "int_value", zzglVar.zzr() ? Long.valueOf(zzglVar.zzb()) : null);
                            OooOO0O(sbOooO0O0, 2, "double_value", zzglVar.zzq() ? Double.valueOf(zzglVar.zza()) : null);
                            OooO0oo(sbOooO0O0, 2);
                            sbOooO0O0.append("}\n");
                        }
                    }
                }
                List<zzfo> listZzM = zzgcVar.zzM();
                if (listZzM != null) {
                    for (zzfo zzfoVar : listZzM) {
                        if (zzfoVar != null) {
                            OooO0oo(sbOooO0O0, 2);
                            sbOooO0O0.append("audience_membership {\n");
                            if (zzfoVar.zzk()) {
                                OooOO0O(sbOooO0O0, 2, "audience_id", Integer.valueOf(zzfoVar.zza()));
                            }
                            if (zzfoVar.zzm()) {
                                OooOO0O(sbOooO0O0, 2, "new_audience", Boolean.valueOf(zzfoVar.zzj()));
                            }
                            OooOO0(sbOooO0O0, "current_data", zzfoVar.zzd());
                            if (zzfoVar.zzn()) {
                                OooOO0(sbOooO0O0, "previous_data", zzfoVar.zze());
                            }
                            OooO0oo(sbOooO0O0, 2);
                            sbOooO0O0.append("}\n");
                        }
                    }
                }
                List<zzfs> listZzN = zzgcVar.zzN();
                if (listZzN != null) {
                    for (zzfs zzfsVar : listZzN) {
                        if (zzfsVar != null) {
                            OooO0oo(sbOooO0O0, 2);
                            sbOooO0O0.append("event {\n");
                            OooOO0O(sbOooO0O0, 2, "name", this.f37591OooO00o.zzj().OooO0Oo(zzfsVar.zzh()));
                            if (zzfsVar.zzu()) {
                                OooOO0O(sbOooO0O0, 2, "timestamp_millis", Long.valueOf(zzfsVar.zzd()));
                            }
                            if (zzfsVar.zzt()) {
                                OooOO0O(sbOooO0O0, 2, "previous_timestamp_millis", Long.valueOf(zzfsVar.zzc()));
                            }
                            if (zzfsVar.zzs()) {
                                OooOO0O(sbOooO0O0, 2, "count", Integer.valueOf(zzfsVar.zza()));
                            }
                            if (zzfsVar.zzb() != 0) {
                                OooO0o(sbOooO0O0, 2, zzfsVar.zzi());
                            }
                            OooO0oo(sbOooO0O0, 2);
                            sbOooO0O0.append("}\n");
                        }
                    }
                }
                OooO0oo(sbOooO0O0, 1);
                sbOooO0O0.append("}\n");
            }
        }
        sbOooO0O0.append("}\n");
        return sbOooO0O0.toString();
    }

    public final List OooOo0O(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f37591OooO00o.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f37591OooO00o.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
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

    public final void OooOoO(zzgk zzgkVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgkVar.zzc();
        zzgkVar.zzb();
        zzgkVar.zza();
        if (obj instanceof String) {
            zzgkVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzgkVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgkVar.zzd(((Double) obj).doubleValue());
        } else {
            this.f37591OooO00o.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void OooOoO0(com.google.android.gms.internal.measurement.zzfv zzfvVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfvVar.zzg();
        zzfvVar.zze();
        zzfvVar.zzd();
        zzfvVar.zzf();
        if (obj instanceof String) {
            zzfvVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfvVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f37591OooO00o.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfv zzfvVarZze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                    zzfvVarZze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzfvVarZze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzfvVarZze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzfvVarZze2.zzh(((Double) obj2).doubleValue());
                    }
                    zzfvVarZze.zzc(zzfvVarZze2);
                }
                if (zzfvVarZze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfw) zzfvVarZze.zzaE());
                }
            }
        }
        zzfvVar.zzb(arrayList);
    }

    public final boolean OooOoo0(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f37591OooO00o.zzav().currentTimeMillis() - j) > j2;
    }

    public final byte[] OooOooO(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f37591OooO00o.zzay().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
