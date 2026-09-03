package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends EmojiCompat.OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ EmojiCompat.OooOOO f5627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f5628OooO0O0;

    public OooOOO0(EmojiCompat.OooOOO oooOOO, ThreadPoolExecutor threadPoolExecutor) {
        this.f5627OooO00o = oooOOO;
        this.f5628OooO0O0 = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.EmojiCompat.OooOOO
    public final void OooO00o(@Nullable Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f5628OooO0O0;
        try {
            this.f5627OooO00o.OooO00o(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.OooOOO
    public final void OooO0O0(@NonNull o0OoOo0 o0oooo1) {
        ThreadPoolExecutor threadPoolExecutor = this.f5628OooO0O0;
        try {
            this.f5627OooO00o.OooO0O0(o0oooo1);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
