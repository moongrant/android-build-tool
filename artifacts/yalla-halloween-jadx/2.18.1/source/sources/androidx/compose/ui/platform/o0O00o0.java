package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final p036OoooOOO.o000OOo<Reference<T>> f6588OooO00o = new p036OoooOOO.o000OOo<>(new Reference[16]);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ReferenceQueue<T> f6589OooO0O0 = new ReferenceQueue<>();

    public final void OooO00o() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.f6589OooO0O0.poll();
            if (referencePoll != null) {
                this.f6588OooO00o.OooOO0O(referencePoll);
            }
        } while (referencePoll != null);
    }
}
