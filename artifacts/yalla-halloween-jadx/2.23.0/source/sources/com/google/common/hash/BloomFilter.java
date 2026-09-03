package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.o000oOoO;
import com.google.common.base.o0OoOo0;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class BloomFilter<T> implements o0OoOo0<T>, Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.common.hash.OooO00o f19700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Funnel<? super T> f19701OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19702OooO0o0;

    public static class OooO00o<T> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long[] f19703OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Funnel<? super T> f19704OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19705OooO0o0;

        public OooO00o(BloomFilter<T> bloomFilter) {
            this.f19703OooO0Oo = com.google.common.hash.OooO00o.OooO00o(bloomFilter.f19700OooO0Oo.f19718OooO00o);
            this.f19705OooO0o0 = bloomFilter.f19702OooO0o0;
            this.f19704OooO0o = bloomFilter.f19701OooO0o;
            bloomFilter.getClass();
        }

        public Object readResolve() {
            return new BloomFilter(new com.google.common.hash.OooO00o(this.f19703OooO0Oo), this.f19705OooO0o0, this.f19704OooO0o, null);
        }
    }

    public interface OooO0O0 extends Serializable {
        boolean o0000o0();
    }

    public BloomFilter() {
        throw null;
    }

    public BloomFilter(com.google.common.hash.OooO00o oooO00o, int i, Funnel funnel, OooO0O0 oooO0O0) {
        o000oOoO.OooO0OO("numHashFunctions (%s) must be > 0", i, i > 0);
        o000oOoO.OooO0OO("numHashFunctions (%s) must be <= 255", i, i <= 255);
        this.f19700OooO0Oo = oooO00o;
        this.f19702OooO0o0 = i;
        funnel.getClass();
        this.f19701OooO0o = funnel;
        oooO0O0.getClass();
    }

    private Object writeReplace() {
        return new OooO00o(this);
    }

    @Override // com.google.common.base.o0OoOo0
    @Deprecated
    public final boolean apply(@ParametricNullness T t) {
        throw null;
    }

    @Override // com.google.common.base.o0OoOo0
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BloomFilter) {
            BloomFilter bloomFilter = (BloomFilter) obj;
            if (this.f19702OooO0o0 == bloomFilter.f19702OooO0o0 && this.f19701OooO0o.equals(bloomFilter.f19701OooO0o) && this.f19700OooO0Oo.equals(bloomFilter.f19700OooO0Oo)) {
                bloomFilter.getClass();
                throw null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19702OooO0o0), this.f19701OooO0o, null, this.f19700OooO0Oo});
    }
}
