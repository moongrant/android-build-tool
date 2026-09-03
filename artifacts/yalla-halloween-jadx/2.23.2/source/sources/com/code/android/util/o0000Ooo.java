package com.code.android.util;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRedPointCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,293:1\n164#2:294\n154#2:295\n154#2:296\n154#2:297\n154#2:298\n154#2:299\n154#2:300\n154#2:301\n*S KotlinDebug\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt\n*L\n35#1:294\n49#1:295\n50#1:296\n57#1:297\n197#1:298\n206#1:299\n207#1:300\n210#1:301\n*E\n"})
public final class o0000Ooo {
    public static Modifier OooO00o(Modifier redPointCircle, boolean z, long j, float f, boolean z2, boolean z3, float f2, float f3, float f4, int i) {
        boolean z4 = (i & 1) != 0 ? true : z;
        long jColor = (i & 2) != 0 ? ColorKt.Color(4293415249L) : j;
        float fM3775constructorimpl = (i & 4) != 0 ? Dp.m3775constructorimpl(5) : f;
        boolean z5 = (i & 8) != 0 ? false : z2;
        boolean z6 = (i & 16) != 0 ? false : z3;
        boolean z7 = (i & 32) != 0;
        float fM3775constructorimpl2 = (i & 64) != 0 ? Dp.m3775constructorimpl(0) : f2;
        float fM3775constructorimpl3 = (i & 128) != 0 ? Dp.m3775constructorimpl(0) : f3;
        float fM3775constructorimpl4 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Dp.m3775constructorimpl(0) : f4;
        long jM1718getWhite0d7_KjU = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L;
        Intrinsics.checkNotNullParameter(redPointCircle, "$this$redPointCircle");
        return ComposedModifierKt.composed$default(redPointCircle, null, new o00000O0(z4, fM3775constructorimpl4, fM3775constructorimpl, fM3775constructorimpl2, fM3775constructorimpl3, z7, z5, z6, jColor, jM1718getWhite0d7_KjU), 1, null);
    }

    public static Modifier OooO0O0(Modifier redPointNumber, Integer num, float f, boolean z, boolean z2, long j, float f2, float f3, float f4, int i) {
        float fM3775constructorimpl = (i & 2) != 0 ? Dp.m3775constructorimpl((float) 7.5d) : f;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        boolean z5 = (i & 16) != 0;
        long jColor = (i & 32) != 0 ? ColorKt.Color(4293415249L) : j;
        boolean z6 = (i & 64) != 0;
        float fM3775constructorimpl2 = (i & 128) != 0 ? Dp.m3775constructorimpl(0) : f2;
        float fM3775constructorimpl3 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? Dp.m3775constructorimpl(0) : f3;
        long sp = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? TextUnitKt.getSp(11) : 0L;
        long jM1718getWhite0d7_KjU = (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L;
        float fM3775constructorimpl4 = (i & 2048) != 0 ? Dp.m3775constructorimpl(0) : f4;
        long jM1718getWhite0d7_KjU2 = (i & 4096) != 0 ? Color.INSTANCE.m1718getWhite0d7_KjU() : 0L;
        float f5 = (i & 8192) != 0 ? 1.4f : 0.0f;
        Intrinsics.checkNotNullParameter(redPointNumber, "$this$redPointNumber");
        return ComposedModifierKt.composed$default(redPointNumber, null, new o00000OO(fM3775constructorimpl4, fM3775constructorimpl2, fM3775constructorimpl3, num, sp, fM3775constructorimpl, z5, jM1718getWhite0d7_KjU, f5, z6, z3, z4, jColor, jM1718getWhite0d7_KjU2), 1, null);
    }
}
