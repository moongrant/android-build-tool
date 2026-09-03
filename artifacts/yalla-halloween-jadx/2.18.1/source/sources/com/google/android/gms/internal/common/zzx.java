package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jspecify.nullness.NullMarked;
import p382o0OOoOo.o0O0O00;
import p446o0OoOoO.o000O;
import p446o0OoOoO.o000O0O0;
import p446o0OoOoO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@NullMarked
public final class zzx {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzo f15875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f15876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00 f15877OooO0OO;

    public zzx(o0O0O00 o0o0o00, boolean z, zzo zzoVar) {
        this.f15877OooO0OO = o0o0o00;
        this.f15876OooO0O0 = z;
        this.f15875OooO00o = zzoVar;
    }

    public static zzx zzc(zzo zzoVar) {
        return new zzx(new o0O0O00(zzoVar), false, o000O0O0.f40263OooO00o);
    }

    public final zzx zzb() {
        return new zzx(this.f15877OooO0OO, true, this.f15875OooO00o);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new o000OO00(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        o000O o000o = new o000O(this.f15877OooO0OO, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (o000o.hasNext()) {
            arrayList.add((String) o000o.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
