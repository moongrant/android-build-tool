package p271o00ooooo;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzef;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40454OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f40455OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzgi f40456OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final BitSet f40457OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map f40458OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final BitSet f40459OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f40460OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oO000Oo f40461OooO0oo;

    public /* synthetic */ a1(oO000Oo oo000oo, String str) {
        this.f40461OooO0oo = oo000oo;
        this.f40454OooO00o = str;
        this.f40455OooO0O0 = true;
        this.f40457OooO0Oo = new BitSet();
        this.f40459OooO0o0 = new BitSet();
        this.f40458OooO0o = new OooO();
        this.f40460OooO0oO = new OooO();
    }

    @NonNull
    public final zzfp OooO00o(int i) {
        ArrayList arrayList;
        List listEmptyList;
        zzfo zzfoVarZzb = zzfp.zzb();
        zzfoVarZzb.zza(i);
        zzfoVarZzb.zzc(this.f40455OooO0O0);
        zzgi zzgiVar = this.f40456OooO0OO;
        if (zzgiVar != null) {
            zzfoVarZzb.zzd(zzgiVar);
        }
        zzgh zzghVarZze = zzgi.zze();
        zzghVarZze.zzb(zzlj.OooOo0o(this.f40457OooO0Oo));
        zzghVarZze.zzd(zzlj.OooOo0o(this.f40459OooO0o0));
        Map map = this.f40458OooO0o;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l = (Long) map.get(Integer.valueOf(iIntValue));
                if (l != null) {
                    zzfq zzfqVarZzc = zzfr.zzc();
                    zzfqVarZzc.zzb(iIntValue);
                    zzfqVarZzc.zza(l.longValue());
                    arrayList.add((zzfr) zzfqVarZzc.zzaD());
                }
            }
        }
        if (arrayList != null) {
            zzghVarZze.zza(arrayList);
        }
        OooO oooO = this.f40460OooO0oO;
        if (oooO == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(oooO.f38568OooO0o);
            for (Integer num : (OooO.OooO0OO) oooO.keySet()) {
                zzgj zzgjVarZzd = zzgk.zzd();
                zzgjVarZzd.zzb(num.intValue());
                List list = (List) oooO.getOrDefault(num, null);
                if (list != null) {
                    Collections.sort(list);
                    zzgjVarZzd.zza(list);
                }
                arrayList2.add((zzgk) zzgjVarZzd.zzaD());
            }
            listEmptyList = arrayList2;
        }
        zzghVarZze.zzc(listEmptyList);
        zzfoVarZzb.zzb(zzghVarZze);
        return (zzfp) zzfoVarZzb.zzaD();
    }

    public final void OooO0O0(@NonNull d1 d1Var) {
        int iOooO00o = d1Var.OooO00o();
        Boolean bool = d1Var.f40484OooO0OO;
        if (bool != null) {
            bool.booleanValue();
            this.f40459OooO0o0.set(iOooO00o, true);
        }
        Boolean bool2 = d1Var.f40485OooO0Oo;
        if (bool2 != null) {
            this.f40457OooO0Oo.set(iOooO00o, bool2.booleanValue());
        }
        if (d1Var.f40487OooO0o0 != null) {
            Integer numValueOf = Integer.valueOf(iOooO00o);
            Map map = this.f40458OooO0o;
            Long l = (Long) map.get(numValueOf);
            long jLongValue = d1Var.f40487OooO0o0.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                map.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (d1Var.f40486OooO0o != null) {
            OooO oooO = this.f40460OooO0oO;
            Integer numValueOf2 = Integer.valueOf(iOooO00o);
            List arrayList = (List) oooO.getOrDefault(numValueOf2, null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                oooO.put(numValueOf2, arrayList);
            }
            if (d1Var.OooO0OO()) {
                arrayList.clear();
            }
            zzoy.zzc();
            oO000Oo oo000oo = this.f40461OooO0oo;
            zzag zzagVarZzf = oo000oo.f40788OooO00o.zzf();
            zzef zzefVar = zzeg.zzY;
            String str = this.f40454OooO00o;
            if (zzagVarZzf.zzs(str, zzefVar) && d1Var.OooO0O0()) {
                arrayList.clear();
            }
            zzoy.zzc();
            if (!oo000oo.f40788OooO00o.zzf().zzs(str, zzefVar)) {
                arrayList.add(Long.valueOf(d1Var.f40486OooO0o.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(d1Var.f40486OooO0o.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1(oO000Oo oo000oo, String str, zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, OooO oooO, OooO oooO2) {
        this.f40461OooO0oo = oo000oo;
        this.f40454OooO00o = str;
        this.f40457OooO0Oo = bitSet;
        this.f40459OooO0o0 = bitSet2;
        this.f40458OooO0o = oooO;
        this.f40460OooO0oO = new OooO();
        for (Integer num : (OooO.OooO0OO) oooO2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) oooO2.getOrDefault(num, null));
            this.f40460OooO0oO.put(num, arrayList);
        }
        this.f40455OooO0O0 = false;
        this.f40456OooO0OO = zzgiVar;
    }
}
