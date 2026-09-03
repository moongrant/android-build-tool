package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o000OOo0.OooO0O0 f8138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final char[] f8139OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO00o f8140OooO0OO = new OooO00o(1024);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Typeface f8141OooO0Oo;

    public OooOo(@NonNull Typeface typeface, @NonNull o000OOo0.OooO0O0 oooO0O0) {
        this.f8141OooO0Oo = typeface;
        this.f8138OooO00o = oooO0O0;
        this.f8139OooO0O0 = new char[oooO0O0.OooO0OO() * 2];
        int iOooO0OO = oooO0O0.OooO0OO();
        for (int i = 0; i < iOooO0OO; i++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i);
            Character.toChars(emojiMetadata.OooO0Oo(), this.f8139OooO0O0, i * 2);
            o000OO0O.OooOOO0.OooO00o(emojiMetadata.OooO0O0() > 0, "invalid metadata codepoint length");
            this.f8140OooO0OO.OooO00o(emojiMetadata, 0, emojiMetadata.OooO0O0() - 1);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseArray<OooO00o> f8142OooO00o = new SparseArray<>(1);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public EmojiMetadata f8143OooO0O0;

        public OooO00o() {
        }

        public final void OooO00o(@NonNull EmojiMetadata emojiMetadata, int i, int i2) {
            int iOooO00o = emojiMetadata.OooO00o(i);
            SparseArray<OooO00o> sparseArray = this.f8142OooO00o;
            OooO00o oooO00o = sparseArray == null ? null : sparseArray.get(iOooO00o);
            if (oooO00o == null) {
                oooO00o = new OooO00o();
                this.f8142OooO00o.put(emojiMetadata.OooO00o(i), oooO00o);
            }
            if (i2 > i) {
                oooO00o.OooO00o(emojiMetadata, i + 1, i2);
            } else {
                oooO00o.f8143OooO0O0 = emojiMetadata;
            }
        }

        public OooO00o(int i) {
        }
    }
}
