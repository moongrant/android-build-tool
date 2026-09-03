package p051o00000Oo;

import androidx.appcompat.widget.o00000O0;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27070OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CharSequence f27071OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27072OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f27073OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final BreakIterator f27074OooO0Oo;

    public static final class OooO00o {
        public final boolean OooO00o(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public oo000o(@NotNull CharSequence charSequence, int i, @Nullable Locale locale) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f27071OooO00o = charSequence;
        if (!(charSequence.length() >= 0)) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!(i >= 0 && i <= charSequence.length())) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.f27074OooO0Oo = wordInstance;
        this.f27072OooO0O0 = Math.max(0, -50);
        this.f27073OooO0OO = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new o00000OO.OooO00o(charSequence, i));
    }

    public final void OooO00o(int i) {
        int i2 = this.f27072OooO0O0;
        boolean z = false;
        if (i <= this.f27073OooO0OO && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("Invalid offset: ", i, ". Valid range is [");
        sbOooO00o.append(this.f27072OooO0O0);
        sbOooO00o.append(" , ");
        throw new IllegalArgumentException(o0O0ooO.OooO00o(sbOooO00o, this.f27073OooO0OO, ']').toString());
    }

    public final boolean OooO0O0(int i) {
        return (i <= this.f27073OooO0OO && this.f27072OooO0O0 + 1 <= i) && Character.isLetterOrDigit(Character.codePointBefore(this.f27071OooO00o, i));
    }

    public final boolean OooO0OO(int i) {
        if (i <= this.f27073OooO0OO && this.f27072OooO0O0 + 1 <= i) {
            return f27070OooO0o0.OooO00o(Character.codePointBefore(this.f27071OooO00o, i));
        }
        return false;
    }

    public final boolean OooO0Oo(int i) {
        return (i < this.f27073OooO0OO && this.f27072OooO0O0 <= i) && Character.isLetterOrDigit(Character.codePointAt(this.f27071OooO00o, i));
    }

    public final boolean OooO0o0(int i) {
        if (i < this.f27073OooO0OO && this.f27072OooO0O0 <= i) {
            return f27070OooO0o0.OooO00o(Character.codePointAt(this.f27071OooO00o, i));
        }
        return false;
    }
}
