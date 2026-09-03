package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f18617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f18618OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f18619OooO0OO;

    public static abstract class OooO00o extends com.google.common.base.OooO0O0<String> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final CharSequence f18621OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO f18622OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f18624OooOO0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f18620OooO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f18623OooO0oo = false;

        public OooO00o(oo0o0Oo oo0o0oo, CharSequence charSequence) {
            this.f18622OooO0oO = oo0o0oo.f18617OooO00o;
            this.f18624OooOO0 = oo0o0oo.f18619OooO0OO;
            this.f18621OooO0o = charSequence;
        }

        public abstract int OooO00o(int i);

        public abstract int OooO0O0(int i);
    }

    public interface OooO0O0 {
        Iterator<String> OooO00o(oo0o0Oo oo0o0oo, CharSequence charSequence);
    }

    public oo0o0Oo(OooO0O0 oooO0O0) {
        OooO.C0222OooO c0222OooO = OooO.C0222OooO.f18581OooO0o0;
        this.f18618OooO0O0 = oooO0O0;
        this.f18617OooO00o = c0222OooO;
        this.f18619OooO0OO = Integer.MAX_VALUE;
    }

    public final List<String> OooO00o(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> itOooO00o = this.f18618OooO0O0.OooO00o(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itOooO00o.hasNext()) {
            arrayList.add(itOooO00o.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
