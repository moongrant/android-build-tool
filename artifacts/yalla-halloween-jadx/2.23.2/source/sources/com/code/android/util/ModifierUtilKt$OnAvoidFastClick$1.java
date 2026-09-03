package com.code.android.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nModifierUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt$OnAvoidFastClick$1\n*L\n1#1,230:1\n*E\n"})
public final class ModifierUtilKt$OnAvoidFastClick$1 extends Lambda implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - o000O0Oo.f13426OooO00o) < 0) {
            return Unit.INSTANCE;
        }
        o000O0Oo.f13426OooO00o = jCurrentTimeMillis;
        throw null;
    }
}
