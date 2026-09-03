package androidx.emoji2.text;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends EmojiCompat.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ EmojiCompat.OooO00o f5623OooO00o;

    public OooOO0(EmojiCompat.OooO00o oooO00o) {
        this.f5623OooO00o = oooO00o;
    }

    @Override // androidx.emoji2.text.EmojiCompat.OooOOO
    public final void OooO00o(@Nullable Throwable th) {
        this.f5623OooO00o.f5610OooO00o.OooO0o0(th);
    }

    @Override // androidx.emoji2.text.EmojiCompat.OooOOO
    public final void OooO0O0(@NonNull o0OoOo0 o0oooo1) {
        EmojiCompat.OooO00o oooO00o = this.f5623OooO00o;
        oooO00o.f5609OooO0OO = o0oooo1;
        o0OoOo0 o0oooo2 = oooO00o.f5609OooO0OO;
        EmojiCompat emojiCompat = oooO00o.f5610OooO00o;
        oooO00o.f5608OooO0O0 = new OooOo00(o0oooo2, emojiCompat.f5606OooO0oO, emojiCompat.f5599OooO, Build.VERSION.SDK_INT >= 34 ? OooOOO.OooO00o() : OooOOOO.OooO00o());
        oooO00o.f5610OooO00o.OooO0o();
    }
}
