package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.emoji2.text.EmojiCompat;
import com.yallatech.support.platform.share.bean.ShareRequest;
import io.agora.rtc.Constants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u001c\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "asExecutor", "Ljava/util/concurrent/Executor;", "Landroid/view/Choreographer;", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "updateWithEmojiCompat", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextInputServiceAndroid_androidKt {

    @NotNull
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    @NotNull
    public static final Executor asExecutor(@NotNull final Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "<this>");
        return new Executor() { // from class: androidx.compose.ui.text.input.OooO
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$1(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$1(Choreographer this_asExecutor, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(this_asExecutor, "$this_asExecutor");
        this_asExecutor.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.OooO0o
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int iM3478getImeActioneUduSuo = imeOptions.getImeAction();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        int i = 6;
        if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3467getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3471getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3469getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3470getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3472getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3473getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3474getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m3455equalsimpl0(iM3478getImeActioneUduSuo, companion.m3468getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int iM3479getKeyboardTypePjHm6EE = imeOptions.getKeyboardType();
        KeyboardType.Companion companion2 = KeyboardType.INSTANCE;
        if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3520getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3513getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3516getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3519getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3521getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3515getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3518getPasswordPjHm6EE())) {
            editorInfo.inputType = Constants.ERR_WATERMARK_READ;
        } else if (KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3517getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!KeyboardType.m3500equalsimpl0(iM3479getKeyboardTypePjHm6EE, companion2.m3514getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m3455equalsimpl0(imeOptions.getImeAction(), companion.m3467getDefaulteUduSuo())) {
                editorInfo.imeOptions |= Pow2.MAX_POW2;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM3477getCapitalizationIUNYP9k = imeOptions.getCapitalization();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.INSTANCE;
            if (KeyboardCapitalization.m3485equalsimpl0(iM3477getCapitalizationIUNYP9k, companion3.m3493getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m3485equalsimpl0(iM3477getCapitalizationIUNYP9k, companion3.m3496getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m3485equalsimpl0(iM3477getCapitalizationIUNYP9k, companion3.m3495getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
            }
        }
        editorInfo.initialSelStart = TextRange.m3310getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m3305getEndimpl(textFieldValue.getSelection());
        o0000OO.OooO0OO.OooO00o(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.OooO0OO()) {
            EmojiCompat.OooO00o().OooOO0(editorInfo);
        }
    }
}
