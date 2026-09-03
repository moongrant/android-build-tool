package com.code.android.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00O00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 176)
public final class ModifierUtilKt$OnAvoidFastClick$1 extends Lambda implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - o00O00.f34345OooO00o) < 0) {
            return Unit.INSTANCE;
        }
        o00O00.f34345OooO00o = jCurrentTimeMillis;
        throw null;
    }
}
