package p423o0OoO0OO;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO0O implements InputFilter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f46676OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f46677OooO0O0;

    public o000OO0O() {
        Intrinsics.checkNotNullParameter("\n", "regex");
        Intrinsics.checkNotNullParameter("", "replacement");
        this.f46676OooO00o = "\n";
        this.f46677OooO0O0 = "";
    }

    @Override // android.text.InputFilter
    @Nullable
    public final CharSequence filter(@Nullable CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        String string;
        String str = this.f46676OooO00o;
        boolean zAreEqual = Intrinsics.areEqual(charSequence, str);
        String str2 = this.f46677OooO0O0;
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
