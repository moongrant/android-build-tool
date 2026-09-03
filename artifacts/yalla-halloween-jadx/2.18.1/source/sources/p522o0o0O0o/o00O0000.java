package p522o0o0O0o;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000 implements InputFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f42994OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f42995OooO0O0;

    public o00O0000() {
        Intrinsics.checkNotNullParameter("\n", "regex");
        Intrinsics.checkNotNullParameter("", "replacement");
        this.f42994OooO00o = "\n";
        this.f42995OooO0O0 = "";
    }

    @Override // android.text.InputFilter
    @Nullable
    public final CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        String string;
        if (Intrinsics.areEqual(charSequence, this.f42994OooO00o)) {
            return this.f42995OooO0O0;
        }
        if ((charSequence == null || (string = charSequence.toString()) == null || !string.contentEquals(this.f42994OooO00o)) ? false : true) {
            return this.f42995OooO0O0;
        }
        return null;
    }
}
