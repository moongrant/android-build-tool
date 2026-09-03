package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzks;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000O extends o0O000Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Class f37360OooO0OO = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // p334o0OO00o.o0O000Oo
    public final void OooO00o(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) o0OO0oO0.OooOO0(obj, j);
        if (list instanceof zzkt) {
            objUnmodifiableList = ((zzkt) list).zze();
        } else {
            if (f37360OooO0OO.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof o0O0O0Oo) && (list instanceof zzkl)) {
                zzkl zzklVar = (zzkl) list;
                if (zzklVar.zzc()) {
                    zzklVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o0OO0oO0.OooOOo(obj, j, objUnmodifiableList);
    }

    @Override // p334o0OO00o.o0O000Oo
    public final void OooO0O0(Object obj, Object obj2, long j) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) o0OO0oO0.OooOO0(obj2, j);
        int size = list3.size();
        List list4 = (List) o0OO0oO0.OooOO0(obj, j);
        if (list4.isEmpty()) {
            if (list4 instanceof zzkt) {
                listZzd = new zzks(size);
            } else {
                listZzd = ((list4 instanceof o0O0O0Oo) && (list4 instanceof zzkl)) ? ((zzkl) list4).zzd(size) : new ArrayList(size);
            }
            o0OO0oO0.OooOOo(obj, j, listZzd);
            list2 = listZzd;
        } else {
            if (f37360OooO0OO.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                o0OO0oO0.OooOOo(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof zzms) {
                zzks zzksVar = new zzks(list4.size() + size);
                zzksVar.addAll(zzksVar.size(), (zzms) list4);
                o0OO0oO0.OooOOo(obj, j, zzksVar);
                list = zzksVar;
            } else if ((list4 instanceof o0O0O0Oo) && (list4 instanceof zzkl)) {
                zzkl zzklVar = (zzkl) list4;
                if (!zzklVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzkl zzklVarZzd = zzklVar.zzd(list4.size() + size);
                    o0OO0oO0.OooOOo(obj, j, zzklVarZzd);
                    list2 = zzklVarZzd;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        o0OO0oO0.OooOOo(obj, j, list3);
    }
}
