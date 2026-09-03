package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.DoNotMock;
import java.lang.Comparable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
@DoNotMock("Use ImmutableRangeSet or TreeRangeSet")
@ElementTypesAreNonnullByDefault
public interface o0O000Oo<C extends Comparable> {
    Set<Range<C>> OooO00o();
}
