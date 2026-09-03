package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jspecify.nullness.NullMarked;
import p267o00oooOo.oO000O0;
import p267o00oooOo.oO000O0O;
import p267o00oooOo.oO0Ooooo;
import p267o00oooOo.oO0o0o;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class zzx {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzo f14887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f14888OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0Ooooo f14889OooO0OO;

    public zzx(oO0Ooooo oo0ooooo, boolean z, zzo zzoVar) {
        this.f14889OooO0OO = oo0ooooo;
        this.f14888OooO0O0 = z;
        this.f14887OooO00o = zzoVar;
    }

    public static zzx zzc(zzo zzoVar) {
        return new zzx(new oO0Ooooo(zzoVar), false, oO000O0.f40405OooO0O0);
    }

    public final zzx zzb() {
        return new zzx(this.f14889OooO0OO, true, this.f14887OooO00o);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new oO0o0o(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        oO000O0O oo000o0o = new oO000O0O(this.f14889OooO0OO, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (oo000o0o.hasNext()) {
            arrayList.add((String) oo000o0o.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
