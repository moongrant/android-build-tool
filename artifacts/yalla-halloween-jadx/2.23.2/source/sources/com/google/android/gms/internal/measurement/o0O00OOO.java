package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OOO extends o0O00o00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Class f15063OooO0OO = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.measurement.o0O00o00
    public final void OooO00o(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) o0oo0000.OooOO0(j, obj);
        if (list instanceof zzlq) {
            objUnmodifiableList = ((zzlq) list).zze();
        } else {
            if (f15063OooO0OO.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof o0O0oo00) && (list instanceof zzli)) {
                zzli zzliVar = (zzli) list;
                if (zzliVar.zzc()) {
                    zzliVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o0oo0000.OooOOo(j, obj, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.o0O00o00
    public final void OooO0O0(long j, Object obj, Object obj2) {
        List list;
        List list2;
        List listZzd;
        List list3 = (List) o0oo0000.OooOO0(j, obj2);
        int size = list3.size();
        List list4 = (List) o0oo0000.OooOO0(j, obj);
        if (list4.isEmpty()) {
            if (list4 instanceof zzlq) {
                listZzd = new zzlp(size);
            } else {
                listZzd = ((list4 instanceof o0O0oo00) && (list4 instanceof zzli)) ? ((zzli) list4).zzd(size) : new ArrayList(size);
            }
            o0oo0000.OooOOo(j, obj, listZzd);
            list2 = listZzd;
        } else {
            if (f15063OooO0OO.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                o0oo0000.OooOOo(j, obj, arrayList);
                list = arrayList;
            } else if (list4 instanceof zznp) {
                zzlp zzlpVar = new zzlp(list4.size() + size);
                zzlpVar.addAll(zzlpVar.size(), (zznp) list4);
                o0oo0000.OooOOo(j, obj, zzlpVar);
                list = zzlpVar;
            } else if ((list4 instanceof o0O0oo00) && (list4 instanceof zzli)) {
                zzli zzliVar = (zzli) list4;
                if (!zzliVar.zzc()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    zzli zzliVarZzd = zzliVar.zzd(list4.size() + size);
                    o0oo0000.OooOOo(j, obj, zzliVarZzd);
                    list2 = zzliVarZzd;
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
        o0oo0000.OooOOo(j, obj, list3);
    }
}
