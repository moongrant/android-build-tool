package p507o0o00ooo;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p186o00o00oO.o00O00OO;
import p186o00o00oO.o00O00o0;
import p186o00o00oO.oo00o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHighLightGuidePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighLightGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/HighLightGuidePopup$BaseGuidePopup$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,220:1\n63#2,5:221\n*S KotlinDebug\n*F\n+ 1 HighLightGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/HighLightGuidePopup$BaseGuidePopup$2$1$1\n*L\n86#1:221,5\n*E\n"})
public final class l0 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo00o f50023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f50024OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o00O00OO o00o00oo2, long j) {
        super(1);
        this.f50023OooO0Oo = o00o00oo2;
        this.f50024OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        oo00o oo00oVar = this.f50023OooO0Oo;
        o00O00o0.OooO0O0(oo00oVar, this.f50024OooO0o0, false, 6);
        return new k0(oo00oVar);
    }
}
