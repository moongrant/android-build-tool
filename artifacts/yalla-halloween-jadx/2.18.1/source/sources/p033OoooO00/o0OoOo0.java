package p033OoooO00;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO0O0;
import o00O0O.OooOO0O;
import o00O0O.OooOOO;
import o00O0O.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends OooOo00 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(@NotNull OooOo topStart, @NotNull OooOo topEnd, @NotNull OooOo bottomEnd, @NotNull OooOo bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
    }

    @Override // p033OoooO00.OooOo00
    @NotNull
    public final o0000OO0 OooO0O0(long j, float f, float f2, float f3, float f4, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (((f + f2) + f3) + f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return new o0000OO0.OooO0O0(OooOo.OooO0OO(j));
        }
        OooOO0O rect = OooOo.OooO0OO(j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? f : f2;
        long jOooO00o = OooO0O0.OooO00o(f5, f5);
        float f6 = layoutDirection == layoutDirection2 ? f2 : f;
        long jOooO00o2 = OooO0O0.OooO00o(f6, f6);
        float f7 = layoutDirection == layoutDirection2 ? f3 : f4;
        long jOooO00o3 = OooO0O0.OooO00o(f7, f7);
        float f8 = layoutDirection == layoutDirection2 ? f4 : f3;
        long jOooO00o4 = OooO0O0.OooO00o(f8, f8);
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new o0000OO0.OooO0OO(new OooOOO(rect.f30404OooO00o, rect.f30405OooO0O0, rect.f30406OooO0OO, rect.f30407OooO0Oo, jOooO00o, jOooO00o2, jOooO00o3, jOooO00o4));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        return Intrinsics.areEqual(this.f3425OooO00o, o0oooo1.f3425OooO00o) && Intrinsics.areEqual(this.f3426OooO0O0, o0oooo1.f3426OooO0O0) && Intrinsics.areEqual(this.f3427OooO0OO, o0oooo1.f3427OooO0OO) && Intrinsics.areEqual(this.f3428OooO0Oo, o0oooo1.f3428OooO0Oo);
    }

    public final int hashCode() {
        return this.f3428OooO0Oo.hashCode() + ((this.f3427OooO0OO.hashCode() + ((this.f3426OooO0O0.hashCode() + (this.f3425OooO00o.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoundedCornerShape(topStart = ");
        sbOooO0o0.append(this.f3425OooO00o);
        sbOooO0o0.append(", topEnd = ");
        sbOooO0o0.append(this.f3426OooO0O0);
        sbOooO0o0.append(", bottomEnd = ");
        sbOooO0o0.append(this.f3427OooO0OO);
        sbOooO0o0.append(", bottomStart = ");
        sbOooO0o0.append(this.f3428OooO0Oo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
