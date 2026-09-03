package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static OooO0O0 f6285OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BreakIterator f6286OooO0OO;

    public OooO0O0(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(locale)");
        this.f6286OooO0OO = characterInstance;
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO00o(int i) {
        int length = OooO0Oo().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f6286OooO0OO;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f6286OooO0OO;
                if (breakIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return OooO0OO(i, iFollowing);
            }
            BreakIterator breakIterator3 = this.f6286OooO0OO;
            if (breakIterator3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f6286OooO0OO;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f6286OooO0OO;
                if (breakIterator2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return OooO0OO(iPreceding, i);
            }
            BreakIterator breakIterator3 = this.f6286OooO0OO;
            if (breakIterator3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator3 = null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.OooO00o
    public final void OooO0o0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        super.OooO0o0(text);
        BreakIterator breakIterator = this.f6286OooO0OO;
        if (breakIterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
    }
}
