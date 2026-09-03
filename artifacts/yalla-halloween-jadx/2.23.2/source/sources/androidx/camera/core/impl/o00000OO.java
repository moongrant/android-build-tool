package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000OO<T> implements oo00o<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00000OO<Object> f3664OooO0O0 = new o00000OO<>(null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OoooO.o000oOoO.OooO0OO f3665OooO00o;

    public o00000OO(@Nullable androidx.camera.video.OooO0o oooO0o) {
        this.f3665OooO00o = p030OoooO.OooOo.OooO0Oo(oooO0o);
    }

    @Override // androidx.camera.core.impl.oo00o
    public final void OooO00o(@NonNull final oo00o.OooO00o oooO00o, @NonNull Executor executor) {
        this.f3665OooO00o.OooO0oo(new Runnable() { // from class: androidx.camera.core.impl.o00000O
            @Override // java.lang.Runnable
            public final void run() {
                oo00o.OooO00o oooO00o2 = oooO00o;
                o00000OO o00000oo2 = this.f3662OooO0Oo;
                o00000oo2.getClass();
                try {
                    oooO00o2.OooO00o(o00000oo2.f3665OooO00o.f1347OooO0Oo);
                } catch (InterruptedException | ExecutionException e) {
                    oooO00o2.onError(e);
                }
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.oo00o
    @NonNull
    public final com.google.common.util.concurrent.OooOO0O<T> OooO0O0() {
        return this.f3665OooO00o;
    }

    @Override // androidx.camera.core.impl.oo00o
    public final void OooO0OO(@NonNull oo00o.OooO00o<? super T> oooO00o) {
    }
}
