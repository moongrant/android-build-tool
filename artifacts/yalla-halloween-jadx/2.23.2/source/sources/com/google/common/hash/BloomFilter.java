package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.o00O0O;
import com.google.common.base.o0OoOo0;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements o00O0O<T>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.common.hash.OooO00o f19224OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Funnel<? super T> f19225OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19226OooO0o0;

    public static class OooO00o<T> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long[] f19227OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Funnel<? super T> f19228OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19229OooO0o0;

        public OooO00o(BloomFilter<T> bloomFilter) {
            this.f19227OooO0Oo = com.google.common.hash.OooO00o.OooO00o(bloomFilter.f19224OooO0Oo.f19242OooO00o);
            this.f19229OooO0o0 = bloomFilter.f19226OooO0o0;
            this.f19228OooO0o = bloomFilter.f19225OooO0o;
            bloomFilter.getClass();
        }

        public Object readResolve() {
            return new BloomFilter(new com.google.common.hash.OooO00o(this.f19227OooO0Oo), this.f19229OooO0o0, this.f19228OooO0o, null);
        }
    }

    public interface OooO0O0 extends Serializable {
        boolean o0000o0();
    }

    public BloomFilter() {
        throw null;
    }

    public BloomFilter(com.google.common.hash.OooO00o oooO00o, int i, Funnel funnel, OooO0O0 oooO0O0) {
        o0OoOo0.OooO0OO("numHashFunctions (%s) must be > 0", i, i > 0);
        o0OoOo0.OooO0OO("numHashFunctions (%s) must be <= 255", i, i <= 255);
        this.f19224OooO0Oo = oooO00o;
        this.f19226OooO0o0 = i;
        funnel.getClass();
        this.f19225OooO0o = funnel;
        oooO0O0.getClass();
    }

    private Object writeReplace() {
        return new OooO00o(this);
    }

    @Override // com.google.common.base.o00O0O
    @Deprecated
    public final boolean apply(@ParametricNullness T t) {
        throw null;
    }

    @Override // com.google.common.base.o00O0O
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) obj;
            if (this.f19226OooO0o0 == bloomFilter.f19226OooO0o0 && this.f19225OooO0o.equals(bloomFilter.f19225OooO0o) && this.f19224OooO0Oo.equals(bloomFilter.f19224OooO0Oo)) {
                bloomFilter.getClass();
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19226OooO0o0), this.f19225OooO0o, null, this.f19224OooO0Oo});
    }
}
