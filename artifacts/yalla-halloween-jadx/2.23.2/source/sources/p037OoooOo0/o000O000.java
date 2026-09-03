package p037OoooOo0;

import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
import o000OO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000<T> implements OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o<T> f1527OooO00o;

    @Override // o000OO.OooO00o
    public final void accept(@NonNull T t) {
        Intrinsics.checkNotNull(this.f1527OooO00o, "Listener is not set.");
        this.f1527OooO00o.accept(t);
    }
}
