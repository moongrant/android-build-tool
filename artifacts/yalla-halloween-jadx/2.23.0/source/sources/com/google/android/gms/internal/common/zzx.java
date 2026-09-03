package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jspecify.nullness.NullMarked;
import p265o00oooOo.o0O00OOO;
import p265o00oooOo.o0O00o00;
import p265o00oooOo.o0O00oO0;
import p265o00oooOo.o0oO0Ooo;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class zzx {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzo f15363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f15364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00o00 f15365OooO0OO;

    public zzx(o0O00o00 o0o00o01, boolean z, zzo zzoVar) {
        this.f15365OooO0OO = o0o00o01;
        this.f15364OooO0O0 = z;
        this.f15363OooO00o = zzoVar;
    }

    public static zzx zzc(zzo zzoVar) {
        return new zzx(new o0O00o00(zzoVar), false, o0O00OOO.f41076OooO0O0);
    }

    public final zzx zzb() {
        return new zzx(this.f15365OooO0OO, true, this.f15363OooO00o);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new o0O00oO0(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        o0oO0Ooo o0oo0ooo2 = new o0oO0Ooo(this.f15365OooO0OO, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (o0oo0ooo2.hasNext()) {
            arrayList.add((String) o0oo0ooo2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
