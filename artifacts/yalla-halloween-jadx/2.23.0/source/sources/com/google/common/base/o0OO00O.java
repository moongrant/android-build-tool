package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f19089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f19090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f19091OooO0OO;

    public static abstract class OooO00o extends com.google.common.base.OooO0O0<String> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final CharSequence f19093OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO0o f19094OooO0oO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f19096OooOO0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f19092OooO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f19095OooO0oo = false;

        public OooO00o(o0OO00O o0oo00o2, CharSequence charSequence) {
            this.f19094OooO0oO = o0oo00o2.f19089OooO00o;
            this.f19096OooOO0 = o0oo00o2.f19091OooO0OO;
            this.f19093OooO0o = charSequence;
        }

        public abstract int OooO00o(int i);

        public abstract int OooO0O0(int i);
    }

    public interface OooO0O0 {
        Iterator<String> OooO00o(o0OO00O o0oo00o2, CharSequence charSequence);
    }

    public o0OO00O(OooO0O0 oooO0O0) {
        OooO0o.OooO oooO = OooO0o.OooO.f19067OooO0o0;
        this.f19090OooO0O0 = oooO0O0;
        this.f19089OooO00o = oooO;
        this.f19091OooO0OO = Integer.MAX_VALUE;
    }

    public final List<String> OooO00o(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> itOooO00o = this.f19090OooO0O0.OooO00o(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itOooO00o.hasNext()) {
            arrayList.add(itOooO00o.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
