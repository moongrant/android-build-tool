package p516o0o0O00o;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p232o00oOoO0.o000;
import p232o00oOoO0.o000O000;
import p232o00oOoO0.o000O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nHighLightGuidePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighLightGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/HighLightGuidePopup$BaseGuidePopup$2$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,220:1\n63#2,5:221\n*S KotlinDebug\n*F\n+ 1 HighLightGuidePopup.kt\ncom/yalla/yalla/ui/composable/common/HighLightGuidePopup$BaseGuidePopup$2$1$1\n*L\n86#1:221,5\n*E\n"})
public final class oo0O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0o f51739OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f51740OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(o000 o000Var, long j) {
        super(1);
        this.f51739OooO0Oo = o000Var;
        this.f51740OooO0o0 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        DisposableEffectScope DisposableEffect = disposableEffectScope;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o000O0o o000o0o2 = this.f51739OooO0Oo;
        o000O000.OooO00o(o000o0o2, this.f51740OooO0o0, false, 6);
        return new o00OO0OO(o000o0o2);
    }
}
