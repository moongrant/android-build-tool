package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import o0OOOO0o.OooOOOO;
import o0OOOO0o.OooOo00;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Beta
public final class BloomFilter<T> implements OooOo00<T>, Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0OO f18700Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0OOOO.OooO00o f18701Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f18702Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Funnel<? super T> f18703Oooo0oo;

    public static class OooO0O0<T> implements Serializable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final OooO0OO f18704Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final long[] f18705Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f18706Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Funnel<? super T> f18707Oooo0oo;

        public OooO0O0(BloomFilter<T> bloomFilter) {
            this.f18705Oooo0o = o0OOOO.OooO00o.OooO00o(bloomFilter.f18701Oooo0o.f38201OooO00o);
            this.f18706Oooo0oO = bloomFilter.f18702Oooo0oO;
            this.f18707Oooo0oo = bloomFilter.f18703Oooo0oo;
            this.f18704Oooo = bloomFilter.f18700Oooo;
        }

        public Object readResolve() {
            return new BloomFilter(new o0OOOO.OooO00o(this.f18705Oooo0o), this.f18706Oooo0oO, this.f18707Oooo0oo, this.f18704Oooo, null);
        }
    }

    public interface OooO0OO extends Serializable {
        boolean o0000OO();
    }

    public BloomFilter(o0OOOO.OooO00o oooO00o, int i, Funnel funnel, OooO0OO oooO0OO, OooO00o oooO00o2) {
        OooOOOO.OooO0o(i > 0, "numHashFunctions (%s) must be > 0", i);
        OooOOOO.OooO0o(i <= 255, "numHashFunctions (%s) must be <= 255", i);
        this.f18701Oooo0o = oooO00o;
        this.f18702Oooo0oO = i;
        Objects.requireNonNull(funnel);
        this.f18703Oooo0oo = funnel;
        Objects.requireNonNull(oooO0OO);
        this.f18700Oooo = oooO0OO;
    }

    private Object writeReplace() {
        return new OooO0O0(this);
    }

    @Override // o0OOOO0o.OooOo00
    @Deprecated
    public final boolean apply(T t) {
        return this.f18700Oooo.o0000OO();
    }

    @Override // o0OOOO0o.OooOo00
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BloomFilter)) {
            return false;
        }
        BloomFilter bloomFilter = (BloomFilter) obj;
        return this.f18702Oooo0oO == bloomFilter.f18702Oooo0oO && this.f18703Oooo0oo.equals(bloomFilter.f18703Oooo0oo) && this.f18701Oooo0o.equals(bloomFilter.f18701Oooo0o) && this.f18700Oooo.equals(bloomFilter.f18700Oooo);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18702Oooo0oO), this.f18703Oooo0oo, this.f18700Oooo, this.f18701Oooo0o});
    }
}
