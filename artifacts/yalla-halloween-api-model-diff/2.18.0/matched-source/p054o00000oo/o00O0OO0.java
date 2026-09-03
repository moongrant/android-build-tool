package p054o00000oo;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OO00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO0 implements InputConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00O f27207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f27208OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27209OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public oo0oOO0 f27210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f27211OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27212OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<o000O> f27213OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f27214OooO0oo;

    public o00O0OO0(@NotNull oo0oOO0 initState, @NotNull o00O00O eventCallback, boolean z) {
        Intrinsics.checkNotNullParameter(initState, "initState");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f27207OooO00o = eventCallback;
        this.f27208OooO0O0 = z;
        this.f27210OooO0Oo = initState;
        this.f27213OooO0oO = new ArrayList();
        this.f27214OooO0oo = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o00000oo.o000O>] */
    public final void OooO00o(o000O o000o) {
        this.f27209OooO0OO++;
        try {
            this.f27213OooO0oO.add(o000o);
        } finally {
            OooO0O0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o00000oo.o000O>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o00000oo.o000O>] */
    public final boolean OooO0O0() {
        int i = this.f27209OooO0OO - 1;
        this.f27209OooO0OO = i;
        if (i == 0 && (!this.f27213OooO0oO.isEmpty())) {
            this.f27207OooO00o.OooO0OO(CollectionsKt.toMutableList((Collection) this.f27213OooO0oO));
            this.f27213OooO0oO.clear();
        }
        return this.f27209OooO0OO > 0;
    }

    public final void OooO0OO(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        this.f27209OooO0OO++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o00000oo.o000O>] */
    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f27213OooO0oO.clear();
        this.f27209OooO0OO = 0;
        this.f27214OooO0oo = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(@Nullable CompletionInfo completionInfo) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@NotNull InputContentInfo inputContentInfo, int i, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z = this.f27214OooO0oo;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(@Nullable CorrectionInfo correctionInfo) {
        boolean z = this.f27214OooO0oo;
        return z ? this.f27208OooO0O0 : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(@Nullable CharSequence charSequence, int i) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            OooO00o(new o000O0Oo(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        OooO00o(new o000OO0O(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        OooO00o(new o000O0O0(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return OooO0O0();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        OooO00o(new o0O0ooO());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        oo0oOO0 oo0ooo0 = this.f27210OooO0Oo;
        return TextUtils.getCapsMode(oo0ooo0.f27256OooO00o.f26774Oooo, o0OO00O.OooO0oO(oo0ooo0.f27257OooO0O0), i);
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f27211OooO0o = z;
        if (z) {
            this.f27212OooO0o0 = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return o00O00o0.OooO00o(this.f27210OooO0Oo);
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Nullable
    public final CharSequence getSelectedText(int i) {
        if (o0OO00O.OooO0OO(this.f27210OooO0Oo.f27257OooO0O0)) {
            return null;
        }
        return o00O.OooO00o(this.f27210OooO0Oo).f26774Oooo;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return o00O.OooO0O0(this.f27210OooO0Oo, i).f26774Oooo;
    }

    @Override // android.view.inputmethod.InputConnection
    @NotNull
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return o00O.OooO0OO(this.f27210OooO0Oo, i).f26774Oooo;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    OooO00o(new o00O0OOO(0, this.f27210OooO0Oo.f27256OooO00o.f26774Oooo.length()));
                    break;
                case R.id.cut:
                    OooO0OO(277);
                    break;
                case R.id.copy:
                    OooO0OO(278);
                    break;
                case R.id.paste:
                    OooO0OO(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f27214OooO0oo;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            this.f27207OooO00o.OooO0O0(i2);
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(@Nullable String str, @Nullable Bundle bundle) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        this.f27207OooO00o.OooO00o(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            OooO00o(new oo0o0O0(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(@Nullable CharSequence charSequence, int i) {
        boolean z = this.f27214OooO0oo;
        if (z) {
            OooO00o(new o00O0OO(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.f27214OooO0oo;
        if (!z) {
            return z;
        }
        OooO00o(new o00O0OOO(i, i2));
        return true;
    }
}
