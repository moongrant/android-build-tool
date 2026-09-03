package com.code.android.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nModifierUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt$OnAvoidFastClick$1\n*L\n1#1,230:1\n*E\n"})
public final class ModifierUtilKt$OnAvoidFastClick$1 extends Lambda implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - o000OO0O.f10369OooO00o) < 0) {
            return Unit.INSTANCE;
        }
        o000OO0O.f10369OooO00o = jCurrentTimeMillis;
        throw null;
    }
}
