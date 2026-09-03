package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000OO<T> implements o00O00o0<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00000OO<Object> f3666OooO0O0 = new o00000OO<>(null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OoooO.Oooo0.OooO0OO f3667OooO00o;

    public o00000OO(@Nullable androidx.camera.video.OooO0o oooO0o) {
        this.f3667OooO00o = p030OoooO.OooOo00.OooO0Oo(oooO0o);
    }

    @Override // androidx.camera.core.impl.o00O00o0
    public final void OooO00o(@NonNull o00O00o0.OooO00o oooO00o, @NonNull Executor executor) {
        this.f3667OooO00o.OooO(new o00000O(0, this, oooO00o), executor);
    }

    @Override // androidx.camera.core.impl.o00O00o0
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<T> OooO0O0() {
        return this.f3667OooO00o;
    }

    @Override // androidx.camera.core.impl.o00O00o0
    public final void OooO0OO(@NonNull o00O00o0.OooO00o<? super T> oooO00o) {
    }
}
