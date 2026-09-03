package o0OO0OoO;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzea;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzlb;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f37847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f37848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public zzgh f37849OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public BitSet f37850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Map f37851OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public BitSet f37852OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public p021OooOooo.Oooo0 f37853OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f37854OooO0oo;

    public /* synthetic */ o0OOooO0(OooO0OO oooO0OO, String str) {
        this.f37854OooO0oo = oooO0OO;
        this.f37847OooO00o = str;
        this.f37848OooO0O0 = true;
        this.f37850OooO0Oo = new BitSet();
        this.f37852OooO0o0 = new BitSet();
        this.f37851OooO0o = new p021OooOooo.Oooo0();
        this.f37853OooO0oO = new p021OooOooo.Oooo0();
    }

    @NonNull
    public final zzfo OooO00o(int i) {
        ArrayList arrayList;
        List listEmptyList;
        zzfn zzfnVarZzb = zzfo.zzb();
        zzfnVarZzb.zza(i);
        zzfnVarZzb.zzc(this.f37848OooO0O0);
        zzgh zzghVar = this.f37849OooO0OO;
        if (zzghVar != null) {
            zzfnVarZzb.zzd(zzghVar);
        }
        zzgg zzggVarZzf = zzgh.zzf();
        zzggVarZzf.zzb(zzlb.OooOo0o(this.f37850OooO0Oo));
        zzggVarZzf.zzd(zzlb.OooOo0o(this.f37852OooO0o0));
        Map map = this.f37851OooO0o;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            Iterator it = this.f37851OooO0o.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l = (Long) this.f37851OooO0o.get(Integer.valueOf(iIntValue));
                if (l != null) {
                    zzfp zzfpVarZzc = zzfq.zzc();
                    zzfpVarZzc.zzb(iIntValue);
                    zzfpVarZzc.zza(l.longValue());
                    arrayList.add((zzfq) zzfpVarZzc.zzaE());
                }
            }
        }
        if (arrayList != null) {
            zzggVarZzf.zza(arrayList);
        }
        p021OooOooo.Oooo0 oooo0 = this.f37853OooO0oO;
        if (oooo0 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(oooo0.f421Oooo0oo);
            for (Integer num : (OooOooo.Oooo0.OooO0OO) this.f37853OooO0oO.keySet()) {
                zzgi zzgiVarZzd = zzgj.zzd();
                zzgiVarZzd.zzb(num.intValue());
                List list = (List) this.f37853OooO0oO.getOrDefault(num, null);
                if (list != null) {
                    Collections.sort(list);
                    zzgiVarZzd.zza(list);
                }
                arrayList2.add((zzgj) zzgiVarZzd.zzaE());
            }
            listEmptyList = arrayList2;
        }
        zzggVarZzf.zzc(listEmptyList);
        zzfnVarZzb.zzb(zzggVarZzf);
        return (zzfo) zzfnVarZzb.zzaE();
    }

    public final void OooO0O0(@NonNull o0OO0oO0 o0oo0oo1) {
        int iOooO00o = o0oo0oo1.OooO00o();
        Boolean bool = o0oo0oo1.f37837OooO0OO;
        if (bool != null) {
            this.f37852OooO0o0.set(iOooO00o, bool.booleanValue());
        }
        Boolean bool2 = o0oo0oo1.f37838OooO0Oo;
        if (bool2 != null) {
            this.f37850OooO0Oo.set(iOooO00o, bool2.booleanValue());
        }
        if (o0oo0oo1.f37840OooO0o0 != null) {
            Map map = this.f37851OooO0o;
            Integer numValueOf = Integer.valueOf(iOooO00o);
            Long l = (Long) map.get(numValueOf);
            long jLongValue = o0oo0oo1.f37840OooO0o0.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.f37851OooO0o.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (o0oo0oo1.f37839OooO0o != null) {
            p021OooOooo.Oooo0 oooo0 = this.f37853OooO0oO;
            Integer numValueOf2 = Integer.valueOf(iOooO00o);
            List arrayList = (List) oooo0.getOrDefault(numValueOf2, null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f37853OooO0oO.put(numValueOf2, arrayList);
            }
            if (o0oo0oo1.OooO0OO()) {
                arrayList.clear();
            }
            zzny.zzc();
            zzag zzagVarZzf = this.f37854OooO0oo.f37615OooO00o.zzf();
            String str = this.f37847OooO00o;
            zzea zzeaVar = zzeb.zzW;
            if (zzagVarZzf.zzs(str, zzeaVar) && o0oo0oo1.OooO0O0()) {
                arrayList.clear();
            }
            zzny.zzc();
            if (!this.f37854OooO0oo.f37615OooO00o.zzf().zzs(this.f37847OooO00o, zzeaVar)) {
                arrayList.add(Long.valueOf(o0oo0oo1.f37839OooO0o.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(o0oo0oo1.f37839OooO0o.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public /* synthetic */ o0OOooO0(OooO0OO oooO0OO, String str, zzgh zzghVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f37854OooO0oo = oooO0OO;
        this.f37847OooO00o = str;
        this.f37850OooO0Oo = bitSet;
        this.f37852OooO0o0 = bitSet2;
        this.f37851OooO0o = map;
        this.f37853OooO0oO = new p021OooOooo.Oooo0();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f37853OooO0oO.put(num, arrayList);
        }
        this.f37848OooO0O0 = false;
        this.f37849OooO0OO = zzghVar;
    }
}
