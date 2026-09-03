package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0O extends OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static OooOO0O f6298OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BreakIterator f6299OooO0OO;

    public OooOO0O(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.f6299OooO0OO = wordInstance;
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO00o(int i) {
        if (OooO0Oo().length() <= 0 || i >= OooO0Oo().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!OooO0oO(i)) {
            boolean z = true;
            if (!OooO0oO(i) || (i != 0 && OooO0oO(i - 1))) {
                z = false;
            }
            if (z) {
                break;
            }
            BreakIterator breakIterator = this.f6299OooO0OO;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f6299OooO0OO;
        if (breakIterator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i);
        if (iFollowing == -1 || !OooO0o(iFollowing)) {
            return null;
        }
        return OooO0OO(i, iFollowing);
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO0O0(int i) {
        int length = OooO0Oo().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !OooO0oO(i - 1) && !OooO0o(i)) {
            BreakIterator breakIterator = this.f6299OooO0OO;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f6299OooO0OO;
        if (breakIterator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i);
        if (iPreceding != -1) {
            if (OooO0oO(iPreceding) && (iPreceding == 0 || !OooO0oO(iPreceding + (-1)))) {
                return OooO0OO(iPreceding, i);
            }
        }
        return null;
    }

    public final boolean OooO0o(int i) {
        return i > 0 && OooO0oO(i + (-1)) && (i == OooO0Oo().length() || !OooO0oO(i));
    }

    @Override // androidx.compose.ui.platform.OooO00o
    public final void OooO0o0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        super.OooO0o0(text);
        BreakIterator breakIterator = this.f6299OooO0OO;
        if (breakIterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }

    public final boolean OooO0oO(int i) {
        if (i < 0 || i >= OooO0Oo().length()) {
            return false;
        }
        return Character.isLetterOrDigit(OooO0Oo().codePointAt(i));
    }
}
