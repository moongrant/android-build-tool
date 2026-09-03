package p650o0ooOoO;

import android.view.KeyEvent;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class f {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final KeyEvent f51138OooO00o;

    public /* synthetic */ f(KeyEvent keyEvent) {
        this.f51138OooO00o = keyEvent;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && Intrinsics.areEqual(this.f51138OooO00o, ((f) obj).f51138OooO00o);
    }

    public final int hashCode() {
        return this.f51138OooO00o.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f51138OooO00o + ')';
    }
}
