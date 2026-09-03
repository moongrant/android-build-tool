package Oooo0;

import android.graphics.Canvas;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO extends androidx.compose.ui.platform.o00O00 implements p442o0OoOo0.o00O0O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final AndroidEdgeEffectOverscrollEffect f550Oooo0oO;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00000OO(@NotNull AndroidEdgeEffectOverscrollEffect overscrollEffect) {
        Function1<androidx.compose.ui.platform.o00O000o, Unit> inspectorInfo = androidx.compose.ui.platform.o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f550Oooo0oO = overscrollEffect;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p442o0OoOo0.o00O0O
    public final void Oooo0o(@NotNull p191o00o0O.o00oO0o o00oo0o2) {
        boolean zOooO;
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        o000000.o00O0O o00o0o2 = (o000000.o00O0O) o00oo0o2;
        o00o0o2.o0ooOOo();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f550Oooo0oO;
        Objects.requireNonNull(androidEdgeEffectOverscrollEffect);
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        p145o00Oo0.o0O0O00 o0o0o00OooO0o = o00o0o2.f26649Oooo0o.f33068Oooo0oO.OooO0o();
        androidEdgeEffectOverscrollEffect.f5520OooOO0O.getValue();
        Canvas canvasOooO00o = p145o00Oo0.OooOOOO.OooO00o(o0o0o00OooO0o);
        boolean z = true;
        if (!(o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5510OooO) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            androidEdgeEffectOverscrollEffect.OooOO0(o00oo0o2, androidEdgeEffectOverscrollEffect.f5510OooO, canvasOooO00o);
            androidEdgeEffectOverscrollEffect.f5510OooO.finish();
        }
        if (androidEdgeEffectOverscrollEffect.f5514OooO0Oo.isFinished()) {
            zOooO = false;
        } else {
            zOooO = androidEdgeEffectOverscrollEffect.OooO(o00oo0o2, androidEdgeEffectOverscrollEffect.f5514OooO0Oo, canvasOooO00o);
            o0000Ooo.OooO0OO(androidEdgeEffectOverscrollEffect.f5510OooO, o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5514OooO0Oo));
        }
        if (!(o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5517OooO0oO) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            androidEdgeEffectOverscrollEffect.OooO0oo(o00oo0o2, androidEdgeEffectOverscrollEffect.f5517OooO0oO, canvasOooO00o);
            androidEdgeEffectOverscrollEffect.f5517OooO0oO.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f5512OooO0O0.isFinished()) {
            zOooO = androidEdgeEffectOverscrollEffect.OooOO0O(o00oo0o2, androidEdgeEffectOverscrollEffect.f5512OooO0O0, canvasOooO00o) || zOooO;
            o0000Ooo.OooO0OO(androidEdgeEffectOverscrollEffect.f5517OooO0oO, o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5512OooO0O0));
        }
        if (!(o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5519OooOO0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            androidEdgeEffectOverscrollEffect.OooO(o00oo0o2, androidEdgeEffectOverscrollEffect.f5519OooOO0, canvasOooO00o);
            androidEdgeEffectOverscrollEffect.f5519OooOO0.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f5516OooO0o0.isFinished()) {
            zOooO = androidEdgeEffectOverscrollEffect.OooOO0(o00oo0o2, androidEdgeEffectOverscrollEffect.f5516OooO0o0, canvasOooO00o) || zOooO;
            o0000Ooo.OooO0OO(androidEdgeEffectOverscrollEffect.f5519OooOO0, o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5516OooO0o0));
        }
        if (!(o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5518OooO0oo) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            androidEdgeEffectOverscrollEffect.OooOO0O(o00oo0o2, androidEdgeEffectOverscrollEffect.f5518OooO0oo, canvasOooO00o);
            androidEdgeEffectOverscrollEffect.f5518OooO0oo.finish();
        }
        if (!androidEdgeEffectOverscrollEffect.f5513OooO0OO.isFinished()) {
            if (!androidEdgeEffectOverscrollEffect.OooO0oo(o00oo0o2, androidEdgeEffectOverscrollEffect.f5513OooO0OO, canvasOooO00o) && !zOooO) {
                z = false;
            }
            o0000Ooo.OooO0OO(androidEdgeEffectOverscrollEffect.f5518OooO0oo, o0000Ooo.OooO0O0(androidEdgeEffectOverscrollEffect.f5513OooO0OO));
            zOooO = z;
        }
        if (zOooO) {
            androidEdgeEffectOverscrollEffect.OooOO0o();
        }
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return p048OoooooO.o00OOOOo.OooO00o(this, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00000OO) {
            return Intrinsics.areEqual(this.f550Oooo0oO, ((o00000OO) obj).f550Oooo0oO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f550Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DrawOverscrollModifier(overscrollEffect=");
        sbOooO0o0.append(this.f550Oooo0oO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
