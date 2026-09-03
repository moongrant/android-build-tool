package p061o0000o0O;

import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.OooOo;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0OOO0o extends InputConnectionWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f34276OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f34277OooO0O0;

    public static class OooO00o {
        public static boolean OooO00o(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2, boolean z) {
            int iMin;
            Object obj = EmojiCompat.f5584OooOO0;
            if (editable == null || inputConnection == null || i < 0 || i2 < 0) {
                return false;
            }
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
                return false;
            }
            if (z) {
                int iMax = Math.max(i, 0);
                int length = editable.length();
                if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                    loop0: while (true) {
                        boolean z2 = false;
                        while (true) {
                            if (iMax == 0) {
                                break loop0;
                            }
                            selectionStart--;
                            if (selectionStart < 0) {
                                if (!z2) {
                                    selectionStart = 0;
                                    break loop0;
                                }
                                break;
                            }
                            char cCharAt = editable.charAt(selectionStart);
                            if (z2) {
                                if (Character.isHighSurrogate(cCharAt)) {
                                    iMax--;
                                }
                            } else if (!Character.isSurrogate(cCharAt)) {
                                iMax--;
                            } else if (!Character.isHighSurrogate(cCharAt)) {
                                z2 = true;
                            }
                            selectionStart = -1;
                            break;
                        }
                    }
                }
                selectionStart = -1;
                break;
                int iMax2 = Math.max(i2, 0);
                iMin = editable.length();
                if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                    loop2: while (true) {
                        boolean z3 = false;
                        while (true) {
                            if (iMax2 != 0) {
                                if (selectionEnd >= iMin) {
                                    if (!z3) {
                                        break loop2;
                                    }
                                    break loop2;
                                }
                                char cCharAt2 = editable.charAt(selectionEnd);
                                if (z3) {
                                    if (Character.isLowSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    }
                                } else if (!Character.isSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                } else if (!Character.isLowSurrogate(cCharAt2)) {
                                    selectionEnd++;
                                    z3 = true;
                                }
                                iMin = -1;
                                break loop2;
                            }
                            iMin = selectionEnd;
                            break loop2;
                        }
                    }
                }
                iMin = -1;
                break loop2;
                if (selectionStart == -1 || iMin == -1) {
                    return false;
                }
            } else {
                selectionStart = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            OooOo[] oooOoArr = (OooOo[]) editable.getSpans(selectionStart, iMin, OooOo.class);
            if (oooOoArr == null || oooOoArr.length <= 0) {
                return false;
            }
            for (OooOo oooOo : oooOoArr) {
                int spanStart = editable.getSpanStart(oooOo);
                int spanEnd = editable.getSpanEnd(oooOo);
                selectionStart = Math.min(spanStart, selectionStart);
                iMin = Math.max(spanEnd, iMin);
            }
            int iMax3 = Math.max(selectionStart, 0);
            int iMin2 = Math.min(iMin, editable.length());
            inputConnection.beginBatchEdit();
            editable.delete(iMax3, iMin2);
            inputConnection.endBatchEdit();
            return true;
        }
    }

    public o0OOO0o(@NonNull EditText editText, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        OooO00o oooO00o = new OooO00o();
        super(inputConnection, false);
        this.f34276OooO00o = editText;
        this.f34277OooO0O0 = oooO00o;
        if (EmojiCompat.OooO0OO()) {
            EmojiCompat.OooO00o().OooOO0(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f34276OooO00o.getEditableText();
        this.f34277OooO0O0.getClass();
        return OooO00o.OooO00o(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f34276OooO00o.getEditableText();
        this.f34277OooO0O0.getClass();
        return OooO00o.OooO00o(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
