package p534o0o0Oo00;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.view.rich_edit_text.AtUserSpan;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f54887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f54888OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<AtUserSpan> f54889OooO0OO;

    public o000oOoO() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        return Intrinsics.areEqual(this.f54887OooO00o, o000oooo2.f54887OooO00o) && this.f54888OooO0O0 == o000oooo2.f54888OooO0O0 && Intrinsics.areEqual(this.f54889OooO0OO, o000oooo2.f54889OooO0OO);
    }

    public final int hashCode() {
        return this.f54889OooO0OO.hashCode() + (((this.f54887OooO00o.hashCode() * 31) + this.f54888OooO0O0) * 31);
    }

    @NotNull
    public final String toString() {
        return "RichTextFieldValue(text=" + this.f54887OooO00o + ", position=" + this.f54888OooO0O0 + ", atUserSpans=" + this.f54889OooO0OO + ")";
    }

    public /* synthetic */ o000oOoO(int i) {
        this("", 0, CollectionsKt.emptyList());
    }

    public o000oOoO(@NotNull String text, int i, @NotNull List<AtUserSpan> atUserSpans) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(atUserSpans, "atUserSpans");
        this.f54887OooO00o = text;
        this.f54888OooO0O0 = i;
        this.f54889OooO0OO = atUserSpans;
    }
}
