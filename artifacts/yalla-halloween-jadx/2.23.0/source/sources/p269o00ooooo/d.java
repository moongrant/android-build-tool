package p269o00ooooo;

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
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41119OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f41120OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzgi f41121OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final BitSet f41122OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map f41123OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final BitSet f41124OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0 f41125OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OOOo f41126OooO0oo;

    public /* synthetic */ d(o0O0OOOo o0o0oooo, String str) {
        this.f41126OooO0oo = o0o0oooo;
        this.f41119OooO00o = str;
        this.f41120OooO0O0 = true;
        this.f41122OooO0Oo = new BitSet();
        this.f41124OooO0o0 = new BitSet();
        this.f41123OooO0o = new OooOO0();
        this.f41125OooO0oO = new OooOO0();
    }

    @NonNull
    public final zzfp OooO00o(int i) {
        ArrayList arrayList;
        List listEmptyList;
        zzfo zzfoVarZzb = zzfp.zzb();
        zzfoVarZzb.zza(i);
        zzfoVarZzb.zzc(this.f41120OooO0O0);
        zzgi zzgiVar = this.f41121OooO0OO;
        if (zzgiVar != null) {
            zzfoVarZzb.zzd(zzgiVar);
        }
        zzgh zzghVarZze = zzgi.zze();
        zzghVarZze.zzb(zzlj.OooOo0o(this.f41122OooO0Oo));
        zzghVarZze.zzd(zzlj.OooOo0o(this.f41124OooO0o0));
        Map map = this.f41123OooO0o;
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
        OooOO0 oooOO1 = this.f41125OooO0oO;
        if (oooOO1 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(oooOO1.f38816OooO0o);
            for (Integer num : (OooOO0.OooO0OO) oooOO1.keySet()) {
                zzgj zzgjVarZzd = zzgk.zzd();
                zzgjVarZzd.zzb(num.intValue());
                List list = (List) oooOO1.getOrDefault(num, null);
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

    public final void OooO0O0(@NonNull g gVar) {
        int iOooO00o = gVar.OooO00o();
        Boolean bool = gVar.f41135OooO0OO;
        if (bool != null) {
            bool.booleanValue();
            this.f41124OooO0o0.set(iOooO00o, true);
        }
        Boolean bool2 = gVar.f41136OooO0Oo;
        if (bool2 != null) {
            this.f41122OooO0Oo.set(iOooO00o, bool2.booleanValue());
        }
        if (gVar.f41138OooO0o0 != null) {
            Integer numValueOf = Integer.valueOf(iOooO00o);
            Map map = this.f41123OooO0o;
            Long l = (Long) map.get(numValueOf);
            long jLongValue = gVar.f41138OooO0o0.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                map.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (gVar.f41137OooO0o != null) {
            OooOO0 oooOO1 = this.f41125OooO0oO;
            Integer numValueOf2 = Integer.valueOf(iOooO00o);
            List arrayList = (List) oooOO1.getOrDefault(numValueOf2, null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                oooOO1.put(numValueOf2, arrayList);
            }
            if (gVar.OooO0OO()) {
                arrayList.clear();
            }
            zzoy.zzc();
            o0O0OOOo o0o0oooo = this.f41126OooO0oo;
            zzag zzagVarZzf = o0o0oooo.f41276OooO00o.zzf();
            zzef zzefVar = zzeg.zzY;
            String str = this.f41119OooO00o;
            if (zzagVarZzf.zzs(str, zzefVar) && gVar.OooO0O0()) {
                arrayList.clear();
            }
            zzoy.zzc();
            if (!o0o0oooo.f41276OooO00o.zzf().zzs(str, zzefVar)) {
                arrayList.add(Long.valueOf(gVar.f41137OooO0o.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(gVar.f41137OooO0o.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(o0O0OOOo o0o0oooo, String str, zzgi zzgiVar, BitSet bitSet, BitSet bitSet2, OooOO0 oooOO1, OooOO0 oooOO2) {
        this.f41126OooO0oo = o0o0oooo;
        this.f41119OooO00o = str;
        this.f41122OooO0Oo = bitSet;
        this.f41124OooO0o0 = bitSet2;
        this.f41123OooO0o = oooOO1;
        this.f41125OooO0oO = new OooOO0();
        for (Integer num : (OooOO0.OooO0OO) oooOO2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) oooOO2.getOrDefault(num, null));
            this.f41125OooO0oO.put(num, arrayList);
        }
        this.f41120OooO0O0 = false;
        this.f41121OooO0OO = zzgiVar;
    }
}
