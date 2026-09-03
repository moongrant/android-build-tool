package p522o0o0O0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.view.rich_edit_text.AtUserSpan;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f53109OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f53110OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<AtUserSpan> f53111OooO0OO;

    public oO000O0() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oO000O0)) {
            return false;
        }
        oO000O0 oo000o0 = (oO000O0) obj;
        return Intrinsics.areEqual(this.f53109OooO00o, oo000o0.f53109OooO00o) && this.f53110OooO0O0 == oo000o0.f53110OooO0O0 && Intrinsics.areEqual(this.f53111OooO0OO, oo000o0.f53111OooO0OO);
    }

    public final int hashCode() {
        return this.f53111OooO0OO.hashCode() + (((this.f53109OooO00o.hashCode() * 31) + this.f53110OooO0O0) * 31);
    }

    @NotNull
    public final String toString() {
        return "RichTextFieldValue(text=" + this.f53109OooO00o + ", position=" + this.f53110OooO0O0 + ", atUserSpans=" + this.f53111OooO0OO + ")";
    }

    public /* synthetic */ oO000O0(int i) {
        this("", 0, CollectionsKt.emptyList());
    }

    public oO000O0(@NotNull String text, int i, @NotNull List<AtUserSpan> atUserSpans) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(atUserSpans, "atUserSpans");
        this.f53109OooO00o = text;
        this.f53110OooO0O0 = i;
        this.f53111OooO0OO = atUserSpans;
    }
}
