package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends Comparable> extends OooOo00<C> implements Serializable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ImmutableRangeSet<Comparable<?>> f18714OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ImmutableRangeSet<Comparable<?>> f18715OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final transient ImmutableList<Range<C>> f18716OooO0Oo;

    public static final class OooO00o<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableList<Range<C>> f18717OooO0Oo;

        public OooO00o(ImmutableList<Range<C>> immutableList) {
            this.f18717OooO0Oo = immutableList;
        }

        public Object readResolve() {
            ImmutableList<Range<C>> immutableList = this.f18717OooO0Oo;
            if (immutableList.isEmpty()) {
                return ImmutableRangeSet.f18715OooO0o0;
            }
            return immutableList.equals(ImmutableList.OooOOOo(Range.f18886OooO0o)) ? ImmutableRangeSet.f18714OooO0o : new ImmutableRangeSet(immutableList);
        }
    }

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        f18715OooO0o0 = new ImmutableRangeSet<>(o0O00.f19060OooO0oo);
        f18714OooO0o = new ImmutableRangeSet<>(ImmutableList.OooOOOo(Range.f18886OooO0o));
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f18716OooO0Oo = immutableList;
    }

    @Override // com.google.common.collect.o0O000Oo
    public final Set OooO00o() {
        ImmutableList<Range<C>> immutableList = this.f18716OooO0Oo;
        if (immutableList.isEmpty()) {
            int i = ImmutableSet.f18718OooO0o;
            return o0O00O0o.f19090OooOOO0;
        }
        Range<Comparable> range = Range.f18886OooO0o;
        return new o0O00OO(immutableList, Range.OooO00o.f18889OooO0Oo);
    }

    public Object writeReplace() {
        return new OooO00o(this.f18716OooO0Oo);
    }
}
