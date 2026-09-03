package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final EmojiCompat.OooOOO f8115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooOo f8116OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public EmojiCompat.OooO0o f8117OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8118OooO00o = 1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOo.OooO00o f8119OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooOo.OooO00o f8120OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOo.OooO00o f8121OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8122OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8123OooO0o0;

        public OooO00o(OooOo.OooO00o oooO00o) {
            this.f8119OooO0O0 = oooO00o;
            this.f8120OooO0OO = oooO00o;
        }

        public final int OooO00o(int i) {
            SparseArray<OooOo.OooO00o> sparseArray = this.f8120OooO0OO.f8142OooO00o;
            OooOo.OooO00o oooO00o = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 3;
            if (this.f8118OooO00o == 2) {
                if (oooO00o != null) {
                    this.f8120OooO0OO = oooO00o;
                    this.f8122OooO0o++;
                } else {
                    if (i == 65038) {
                        OooO0O0();
                    } else {
                        if (!(i == 65039)) {
                            OooOo.OooO00o oooO00o2 = this.f8120OooO0OO;
                            if (oooO00o2.f8143OooO0O0 == null) {
                                OooO0O0();
                            } else if (this.f8122OooO0o != 1) {
                                this.f8121OooO0Oo = oooO00o2;
                                OooO0O0();
                            } else if (OooO0OO()) {
                                this.f8121OooO0Oo = this.f8120OooO0OO;
                                OooO0O0();
                            } else {
                                OooO0O0();
                            }
                        }
                    }
                    i2 = 1;
                }
                i2 = 2;
            } else if (oooO00o == null) {
                OooO0O0();
                i2 = 1;
            } else {
                this.f8118OooO00o = 2;
                this.f8120OooO0OO = oooO00o;
                this.f8122OooO0o = 1;
                i2 = 2;
            }
            this.f8123OooO0o0 = i;
            return i2;
        }

        public final void OooO0O0() {
            this.f8118OooO00o = 1;
            this.f8120OooO0OO = this.f8119OooO0O0;
            this.f8122OooO0o = 0;
        }

        public final boolean OooO0OO() {
            o000OOo0.OooO00o oooO00oOooO0o0 = this.f8120OooO0OO.f8143OooO0O0.OooO0o0();
            int iOooO00o = oooO00oOooO0o0.OooO00o(6);
            if ((iOooO00o == 0 || oooO00oOooO0o0.f28285OooO0O0.get(iOooO00o + oooO00oOooO0o0.f28284OooO00o) == 0) ? false : true) {
                return true;
            }
            return this.f8123OooO0o0 == 65039;
        }
    }

    public OooOO0O(@NonNull OooOo oooOo, @NonNull EmojiCompat.OooOOO oooOOO, @NonNull EmojiCompat.OooO0o oooO0o) {
        this.f8115OooO00o = oooOOO;
        this.f8116OooO0O0 = oooOo;
        this.f8117OooO0OO = oooO0o;
    }

    public static boolean OooO00o(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z) {
        OooOOO0[] oooOOO0Arr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (oooOOO0Arr = (OooOOO0[]) editable.getSpans(selectionStart, selectionEnd, OooOOO0.class)) != null && oooOOO0Arr.length > 0) {
            for (OooOOO0 oooOOO0 : oooOOO0Arr) {
                int spanStart = editable.getSpanStart(oooOOO0);
                int spanEnd = editable.getSpanEnd(oooOOO0);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean OooO0O0(CharSequence charSequence, int i, int i2, EmojiMetadata emojiMetadata) {
        if (emojiMetadata.f8105OooO0OO == 0) {
            EmojiCompat.OooO0o oooO0o = this.f8117OooO0OO;
            o000OOo0.OooO00o oooO00oOooO0o0 = emojiMetadata.OooO0o0();
            int iOooO00o = oooO00oOooO0o0.OooO00o(8);
            emojiMetadata.f8105OooO0OO = ((OooO0o) oooO0o).OooO00o(charSequence, i, i2, iOooO00o != 0 ? oooO00oOooO0o0.f28285OooO0O0.getShort(iOooO00o + oooO00oOooO0o0.f28284OooO00o) : (short) 0) ? 2 : 1;
        }
        return emojiMetadata.f8105OooO0OO == 2;
    }
}
