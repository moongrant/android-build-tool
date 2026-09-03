package p252o00ooO0;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p483o0o000O0.OooOO0;
import p483o0o000O0.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile boolean f34227OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CountDownLatch f34228OooO0O0;

    public o000000O() {
        int size;
        if (OooO00o() == null) {
            size = 0;
        } else {
            List<Class<? extends o000000O>> listOooO00o = OooO00o();
            Intrinsics.checkNotNull(listOooO00o);
            size = listOooO00o.size();
        }
        this.f34228OooO0O0 = new CountDownLatch(size);
    }

    @Nullable
    public List<Class<? extends o000000O>> OooO00o() {
        return null;
    }

    public boolean OooO0O0() {
        return this instanceof OooOO0;
    }

    public abstract void OooO0OO();

    public boolean OooO0Oo() {
        return this instanceof OooOOO0;
    }
}
