package p373o0OOoO0O;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p368o0OOo0oO.o00Oo0;
import p368o0OOo0oO.o0OoOo0;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends o00Oo0 implements OooOOO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f44044OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OoOo0 f44045OooO0oo;

    public OooOOOO(@NotNull o0OoOo0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f44045OooO0oo = config;
        this.f44044OooO0oO = new LinkedBlockingQueue<>();
    }

    @Override // p373o0OOoO0O.OooOOO
    public final void OooO00o(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f43986OooO0Oo) {
            return;
        }
        try {
            this.f44044OooO0oO.offer(data);
        } catch (Throwable th) {
            wc.OooO00o(this.f44045OooO0oo.f43994OooO0Oo).OooO0O0("Msg processor enqueue data error! \n" + th.getMessage(), new Object[0]);
            OooO0Oo();
        }
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0O0() {
        wc.OooO00o(this.f44045OooO0oo.f43994OooO0Oo).OooO00o("AbsMsgProcessor end", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0OO() {
        wc.OooO00o(this.f44045OooO0oo.f43994OooO0Oo).OooO00o("AbsMsgProcessor start", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0o0() {
        byte[] msg;
        o0OoOo0 o0oooo0 = this.f44045OooO0oo;
        try {
            msg = this.f44044OooO0oO.take();
        } catch (Throwable th) {
            wc.OooO00o(o0oooo0.f43994OooO0Oo).OooO0O0("Msg processor take data error! \n" + th.getMessage(), new Object[0]);
            msg = null;
        }
        if (msg == null) {
            wc.OooO00o(o0oooo0.f43994OooO0Oo).OooO0O0("Msg processor take null msg!", new Object[0]);
        } else {
            Intrinsics.checkNotNullParameter(msg, "msg");
            o0oooo0.f43995OooO0o.OooO00o(msg);
        }
    }
}
