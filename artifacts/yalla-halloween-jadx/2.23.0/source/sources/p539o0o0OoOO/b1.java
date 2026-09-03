package p539o0o0OoOO;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAutoSizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeText.kt\ncom/yalla/yalla/ui/view/FontSizeRange\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n186#2,2:93\n1#3:95\n*S KotlinDebug\n*F\n+ 1 AutoSizeText.kt\ncom/yalla/yalla/ui/view/FontSizeRange\n*L\n85#1:93,2\n*E\n"})
public final class b1 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f55453OooO0Oo = TextUnitKt.getSp(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f55454OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f55455OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f55456OooO0OO;

    public b1(long j, long j2) {
        this.f55454OooO00o = j;
        this.f55455OooO0O0 = j2;
        long j3 = f55453OooO0Oo;
        this.f55456OooO0OO = j3;
        TextUnitKt.m3960checkArithmeticNB67dxo(j, j2);
        if (!(Float.compare(TextUnit.m3946getValueimpl(j), TextUnit.m3946getValueimpl(j2)) < 0)) {
            throw new IllegalArgumentException(("min should be less than max, " + this).toString());
        }
        if (TextUnit.m3946getValueimpl(j3) > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("step should be greater than 0, " + this).toString());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return TextUnit.m3943equalsimpl0(this.f55454OooO00o, b1Var.f55454OooO00o) && TextUnit.m3943equalsimpl0(this.f55455OooO0O0, b1Var.f55455OooO0O0) && TextUnit.m3943equalsimpl0(this.f55456OooO0OO, b1Var.f55456OooO0OO);
    }

    public final int hashCode() {
        return TextUnit.m3947hashCodeimpl(this.f55456OooO0OO) + ((TextUnit.m3947hashCodeimpl(this.f55455OooO0O0) + (TextUnit.m3947hashCodeimpl(this.f55454OooO00o) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String strM3953toStringimpl = TextUnit.m3953toStringimpl(this.f55454OooO00o);
        String strM3953toStringimpl2 = TextUnit.m3953toStringimpl(this.f55455OooO0O0);
        return o0O00o0.OooO0O0(OooO0o.OooO0OO("FontSizeRange(min=", strM3953toStringimpl, ", max=", strM3953toStringimpl2, ", step="), TextUnit.m3953toStringimpl(this.f55456OooO0OO), ")");
    }
}
