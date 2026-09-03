package androidx.compose.foundation.text;

import android.text.Spanned;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.OooOo;
import androidx.emoji2.text.OooOo00;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000OO.OooOOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0007"}, d2 = {"getEmojiCompatIfLoaded", "Landroidx/emoji2/text/EmojiCompat;", "findFollowingBreak", "", "", "index", "findPrecedingBreak", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class StringHelpers_androidKt {
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int findFollowingBreak(@NotNull String str, int i) {
        Integer numValueOf;
        int spanEnd;
        Intrinsics.checkNotNullParameter(str, "<this>");
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        if (emojiCompatIfLoaded != null) {
            OooOOO0.OooO0o("Not initialized yet", emojiCompatIfLoaded.OooO0O0() == 1);
            OooOOO0.OooO0o0(str, "charSequence cannot be null");
            OooOo00 oooOo00 = emojiCompatIfLoaded.f5605OooO0o0.f5608OooO0O0;
            oooOo00.getClass();
            if (i < 0 || i >= str.length()) {
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                OooOo[] oooOoArr = (OooOo[]) spanned.getSpans(i, i + 1, OooOo.class);
                if (oooOoArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(oooOoArr[0]);
                } else {
                    spanEnd = ((OooOo00.OooO0OO) oooOo00.OooO0OO(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new OooOo00.OooO0OO(i))).f5648OooO0OO;
                }
            } else {
                spanEnd = ((OooOo00.OooO0OO) oooOo00.OooO0OO(str, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new OooOo00.OooO0OO(i))).f5648OooO0OO;
            }
            numValueOf = Integer.valueOf(spanEnd);
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final int findPrecedingBreak(@NotNull String str, int i) {
        Integer numValueOf;
        int spanStart;
        Intrinsics.checkNotNullParameter(str, "<this>");
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        if (emojiCompatIfLoaded != null) {
            int iMax = Math.max(0, i - 1);
            OooOOO0.OooO0o("Not initialized yet", emojiCompatIfLoaded.OooO0O0() == 1);
            OooOOO0.OooO0o0(str, "charSequence cannot be null");
            OooOo00 oooOo00 = emojiCompatIfLoaded.f5605OooO0o0.f5608OooO0O0;
            oooOo00.getClass();
            if (iMax < 0 || iMax >= str.length()) {
                spanStart = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                OooOo[] oooOoArr = (OooOo[]) spanned.getSpans(iMax, iMax + 1, OooOo.class);
                if (oooOoArr.length > 0) {
                    spanStart = spanned.getSpanStart(oooOoArr[0]);
                } else {
                    spanStart = ((OooOo00.OooO0OO) oooOo00.OooO0OO(str, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new OooOo00.OooO0OO(iMax))).f5647OooO0O0;
                }
            } else {
                spanStart = ((OooOo00.OooO0OO) oooOo00.OooO0OO(str, Math.max(0, iMax - 16), Math.min(str.length(), iMax + 16), Integer.MAX_VALUE, true, new OooOo00.OooO0OO(iMax))).f5647OooO0O0;
            }
            numValueOf = Integer.valueOf(spanStart);
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (!EmojiCompat.OooO0OO()) {
            return null;
        }
        EmojiCompat emojiCompatOooO00o = EmojiCompat.OooO00o();
        if (emojiCompatOooO00o.OooO0O0() == 1) {
            return emojiCompatOooO00o;
        }
        return null;
    }
}
