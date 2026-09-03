package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtIncompatible
public final class ImmutableRangeSet<C extends Comparable> extends OooOo00<C> implements Serializable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final ImmutableRangeSet<Comparable<?>> f18200Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final ImmutableRangeSet<Comparable<?>> f18201Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final transient ImmutableList<Range<C>> f18202Oooo0o;

    public static final class OooO00o<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableList<Range<C>> f18203Oooo0o;

        public OooO00o(ImmutableList<Range<C>> immutableList) {
            this.f18203Oooo0o = immutableList;
        }

        public Object readResolve() {
            if (this.f18203Oooo0o.isEmpty()) {
                return ImmutableRangeSet.f18200Oooo0oO;
            }
            return this.f18203Oooo0o.equals(ImmutableList.OooOOOo(Range.f18368Oooo0oo)) ? ImmutableRangeSet.f18201Oooo0oo : new ImmutableRangeSet(this.f18203Oooo0o);
        }
    }

    static {
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        f18200Oooo0oO = new ImmutableRangeSet<>(o0.f18399OoooO00);
        f18201Oooo0oo = new ImmutableRangeSet<>(ImmutableList.OooOOOo(Range.f18368Oooo0oo));
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.f18202Oooo0o = immutableList;
    }

    @Override // com.google.common.collect.o0oOOo
    public final Set OooO00o() {
        if (this.f18202Oooo0o.isEmpty()) {
            int i = ImmutableSet.f18204Oooo0oo;
            return o0O0000O.f18593OoooOO0;
        }
        ImmutableList<Range<C>> immutableList = this.f18202Oooo0o;
        Range<Comparable> range = Range.f18368Oooo0oo;
        return new o0O000O(immutableList, Range.OooO00o.f18371Oooo0o);
    }

    public Object writeReplace() {
        return new OooO00o(this.f18202Oooo0o);
    }
}
