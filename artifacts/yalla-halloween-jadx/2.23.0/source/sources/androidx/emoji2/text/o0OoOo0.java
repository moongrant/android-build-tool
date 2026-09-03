package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final p060o0000o0.o00O0O f5659OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final char[] f5660OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO00o f5661OooO0OO = new OooO00o(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Typeface f5662OooO0Oo;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SparseArray<OooO00o> f5663OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TypefaceEmojiRasterizer f5664OooO0O0;

        public OooO00o() {
            this(1);
        }

        public final void OooO00o(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i, int i2) {
            int iOooO00o = typefaceEmojiRasterizer.OooO00o(i);
            SparseArray<OooO00o> sparseArray = this.f5663OooO00o;
            OooO00o oooO00o = sparseArray == null ? null : sparseArray.get(iOooO00o);
            if (oooO00o == null) {
                oooO00o = new OooO00o();
                sparseArray.put(typefaceEmojiRasterizer.OooO00o(i), oooO00o);
            }
            if (i2 > i) {
                oooO00o.OooO00o(typefaceEmojiRasterizer, i + 1, i2);
            } else {
                oooO00o.f5664OooO0O0 = typefaceEmojiRasterizer;
            }
        }

        public OooO00o(int i) {
            this.f5663OooO00o = new SparseArray<>(i);
        }
    }

    public o0OoOo0(@NonNull Typeface typeface, @NonNull p060o0000o0.o00O0O o00o0o2) {
        int i;
        int i2;
        this.f5662OooO0Oo = typeface;
        this.f5659OooO00o = o00o0o2;
        int iOooO00o = o00o0o2.OooO00o(6);
        if (iOooO00o != 0) {
            int i3 = iOooO00o + o00o0o2.f34260OooO00o;
            i = o00o0o2.f34261OooO0O0.getInt(o00o0o2.f34261OooO0O0.getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f5660OooO0O0 = new char[i * 2];
        int iOooO00o2 = o00o0o2.OooO00o(6);
        if (iOooO00o2 != 0) {
            int i4 = iOooO00o2 + o00o0o2.f34260OooO00o;
            i2 = o00o0o2.f34261OooO0O0.getInt(o00o0o2.f34261OooO0O0.getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i5);
            p060o0000o0.o0OoOo0 o0oooo0OooO0OO = typefaceEmojiRasterizer.OooO0OO();
            int iOooO00o3 = o0oooo0OooO0OO.OooO00o(4);
            Character.toChars(iOooO00o3 != 0 ? o0oooo0OooO0OO.f34261OooO0O0.getInt(iOooO00o3 + o0oooo0OooO0OO.f34260OooO00o) : 0, this.f5660OooO0O0, i5 * 2);
            o000OO.OooOOO0.OooO0O0(typefaceEmojiRasterizer.OooO0O0() > 0, "invalid metadata codepoint length");
            this.f5661OooO0OO.OooO00o(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.OooO0O0() - 1);
        }
    }
}
