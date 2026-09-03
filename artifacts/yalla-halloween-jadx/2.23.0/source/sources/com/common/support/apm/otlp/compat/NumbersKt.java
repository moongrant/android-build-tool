package com.common.support.apm.otlp.compat;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"hashCodeCompat", "", "", "sailfish_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NumbersKt {
    public static final int hashCodeCompat(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
