package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.lang.Comparable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends o0O000O implements com.google.common.base.o0OoOo0<C> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Range<Comparable> f19362OooO0o = new Range<>(o00000O0.OooO0O0.f19422OooO0o0, o00000O0.OooO00o.f19421OooO0o0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O0<C> f19363OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O0<C> f19364OooO0o0;

    public static class OooO00o extends o0O000<Range<?>> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f19365OooO0Oo = new OooO00o();

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return o00000.f19395OooO00o.OooO0O0(range.f19363OooO0Oo, range2.f19363OooO0Oo).OooO0O0(range.f19364OooO0o0, range2.f19364OooO0o0).OooO0o();
        }
    }

    public Range(o00000O0<C> o00000o1, o00000O0<C> o00000o2) {
        this.f19363OooO0Oo = o00000o1;
        o00000o2.getClass();
        this.f19364OooO0o0 = o00000o2;
        if (o00000o1.compareTo(o00000o2) > 0 || o00000o1 == o00000O0.OooO00o.f19421OooO0o0 || o00000o2 == o00000O0.OooO0O0.f19422OooO0o0) {
            StringBuilder sb = new StringBuilder(16);
            o00000o1.OooO0O0(sb);
            sb.append("..");
            o00000o2.OooO0OO(sb);
            String strValueOf = String.valueOf(sb.toString());
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid range: ".concat(strValueOf) : new String("Invalid range: "));
        }
    }

    @Override // com.google.common.base.o0OoOo0
    @Deprecated
    public final boolean apply(Object obj) {
        ((Comparable) obj).getClass();
        return this.f19363OooO0Oo.OooO0Oo() && !this.f19364OooO0o0.OooO0Oo();
    }

    @Override // com.google.common.base.o0OoOo0
    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.f19363OooO0Oo.equals(range.f19363OooO0Oo) && this.f19364OooO0o0.equals(range.f19364OooO0o0);
    }

    public final int hashCode() {
        return this.f19364OooO0o0.hashCode() + (this.f19363OooO0Oo.hashCode() * 31);
    }

    public Object readResolve() {
        Range<Comparable> range = f19362OooO0o;
        return equals(range) ? range : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f19363OooO0Oo.OooO0O0(sb);
        sb.append("..");
        this.f19364OooO0o0.OooO0OO(sb);
        return sb.toString();
    }
}
