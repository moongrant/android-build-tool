package p373o0OOoO;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p375o0OOoO00.Oooo0;
import p375o0OOoO00.o0OoOo0;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends o0OoOo0 implements OooO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f43189OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Oooo0 f43190OooO0oo;

    public OooOO0(@NotNull Oooo0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43190OooO0oo = config;
        this.f43189OooO0oO = new LinkedBlockingQueue<>();
    }

    @Override // p373o0OOoO.OooO
    public final void OooO00o(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f43236OooO0Oo) {
            return;
        }
        try {
            this.f43189OooO0oO.offer(data);
        } catch (Throwable th) {
            oO000O0O.OooO00o(this.f43190OooO0oo.f43211OooO0Oo).OooO0O0("Msg processor enqueue data error! \n" + th.getMessage(), new Object[0]);
            OooO0Oo();
        }
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0O0() {
        oO000O0O.OooO00o(this.f43190OooO0oo.f43211OooO0Oo).OooO00o("AbsMsgProcessor end", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0OO() {
        oO000O0O.OooO00o(this.f43190OooO0oo.f43211OooO0Oo).OooO00o("AbsMsgProcessor start", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0o0() {
        byte[] msg;
        Oooo0 oooo0 = this.f43190OooO0oo;
        try {
            msg = this.f43189OooO0oO.take();
        } catch (Throwable th) {
            oO000O0O.OooO00o(oooo0.f43211OooO0Oo).OooO0O0("Msg processor take data error! \n" + th.getMessage(), new Object[0]);
            msg = null;
        }
        if (msg == null) {
            oO000O0O.OooO00o(oooo0.f43211OooO0Oo).OooO0O0("Msg processor take null msg!", new Object[0]);
        } else {
            Intrinsics.checkNotNullParameter(msg, "msg");
            oooo0.f43212OooO0o.OooO00o(msg);
        }
    }
}
