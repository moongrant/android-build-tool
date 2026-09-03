package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends EmojiCompat.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ EmojiCompat.OooOOO0 f8113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f8114OooO0O0;

    public OooOO0(EmojiCompat.OooOOO0 oooOOO0, ThreadPoolExecutor threadPoolExecutor) {
        this.f8113OooO00o = oooOOO0;
        this.f8114OooO0O0 = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
    public final void OooO00o(@Nullable Throwable th) {
        try {
            this.f8113OooO00o.OooO00o(th);
        } finally {
            this.f8114OooO0O0.shutdown();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
    public final void OooO0O0(@NonNull OooOo oooOo) {
        try {
            this.f8113OooO00o.OooO0O0(oooOo);
        } finally {
            this.f8114OooO0O0.shutdown();
        }
    }
}
