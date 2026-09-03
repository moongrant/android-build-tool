package p045Oooooo;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p030OoooO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00000OO f1877OooO00o;

    public o00000O(o00000OO o00000oo2) {
        this.f1877OooO00o = o00000oo2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        boolean z = th instanceof MediaCodec.CodecException;
        o00000OO o00000oo2 = this.f1877OooO00o;
        if (!z) {
            o00000oo2.f1881OooO00o.OooO0OO(th, 0, th.getMessage());
            return;
        }
        o0000Ooo o0000ooo = o00000oo2.f1881OooO00o;
        MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
        o0000ooo.getClass();
        o0000ooo.OooO0OO(codecException, 1, codecException.getMessage());
    }

    @Override // p030OoooO.OooOOO0
    public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
    }
}
