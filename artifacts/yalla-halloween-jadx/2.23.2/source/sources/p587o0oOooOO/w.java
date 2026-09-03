package p587o0oOooOO;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAutoSizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeText.kt\ncom/yalla/yalla/ui/view/FontSizeRange\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n186#2,2:93\n1#3:95\n*S KotlinDebug\n*F\n+ 1 AutoSizeText.kt\ncom/yalla/yalla/ui/view/FontSizeRange\n*L\n85#1:93,2\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f57001OooO0Oo = TextUnitKt.getSp(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f57002OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f57003OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f57004OooO0OO;

    public w(long j, long j2) {
        this.f57002OooO00o = j;
        this.f57003OooO0O0 = j2;
        long j3 = f57001OooO0Oo;
        this.f57004OooO0OO = j3;
        TextUnitKt.m3970checkArithmeticNB67dxo(j, j2);
        if (!(Float.compare(TextUnit.m3956getValueimpl(j), TextUnit.m3956getValueimpl(j2)) < 0)) {
            throw new IllegalArgumentException(("min should be less than max, " + this).toString());
        }
        if (TextUnit.m3956getValueimpl(j3) > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("step should be greater than 0, " + this).toString());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return TextUnit.m3953equalsimpl0(this.f57002OooO00o, wVar.f57002OooO00o) && TextUnit.m3953equalsimpl0(this.f57003OooO0O0, wVar.f57003OooO0O0) && TextUnit.m3953equalsimpl0(this.f57004OooO0OO, wVar.f57004OooO0OO);
    }

    public final int hashCode() {
        return TextUnit.m3957hashCodeimpl(this.f57004OooO0OO) + ((TextUnit.m3957hashCodeimpl(this.f57003OooO0O0) + (TextUnit.m3957hashCodeimpl(this.f57002OooO00o) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String strM3963toStringimpl = TextUnit.m3963toStringimpl(this.f57002OooO00o);
        String strM3963toStringimpl2 = TextUnit.m3963toStringimpl(this.f57003OooO0O0);
        return o0oOO.OooO0O0(OooO0OO.OooO00o("FontSizeRange(min=", strM3963toStringimpl, ", max=", strM3963toStringimpl2, ", step="), TextUnit.m3963toStringimpl(this.f57004OooO0OO), ")");
    }
}
