package p417o0OoO0;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo implements InputFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f45515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f45516OooO0O0;

    public o000OOo() {
        Intrinsics.checkNotNullParameter("\n", "regex");
        Intrinsics.checkNotNullParameter("", "replacement");
        this.f45515OooO00o = "\n";
        this.f45516OooO0O0 = "";
    }

    @Override // android.text.InputFilter
    @Nullable
    public final CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        String string;
        String str = this.f45515OooO00o;
        boolean zAreEqual = Intrinsics.areEqual(charSequence, str);
        String str2 = this.f45516OooO0O0;
        if (zAreEqual) {
            return str2;
        }
        boolean z = false;
        if (charSequence != null && (string = charSequence.toString()) != null && string.contentEquals(str)) {
            z = true;
        }
        if (z) {
            return str2;
        }
        return null;
    }
}
