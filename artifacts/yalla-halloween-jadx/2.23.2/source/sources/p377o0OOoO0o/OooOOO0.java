package p377o0OOoO0o;

import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p374o0OOoO0.OooOOOO;
import p375o0OOoO00.Oooo0;
import p375o0OOoO00.o0OoOo0;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo0 f43244OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f43245OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OutputStream f43246OooO0oo;

    public OooOOO0(@NotNull OutputStream output, @NotNull Oooo0 config) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43246OooO0oo = output;
        this.f43244OooO = config;
        this.f43245OooO0oO = new LinkedBlockingQueue<>();
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0O0() {
        oO000O0O.OooO00o(this.f43244OooO.f43211OooO0Oo).OooO00o("MsgWriter end", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0OO() {
        oO000O0O.OooO00o(this.f43244OooO.f43211OooO0Oo).OooO00o("MsgWriter start", new Object[0]);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0Oo() {
        super.OooO0Oo();
        try {
            this.f43246OooO0oo.close();
        } catch (Throwable th) {
            oO000O0O.OooO00o(this.f43244OooO.f43211OooO0Oo).OooO0OO(th);
        }
    }

    public final void OooO0o(@NotNull byte[] msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!(!(msg.length == 0))) {
            throw new IllegalArgumentException("empty msg".toString());
        }
        oO000O0O.OooO00o(this.f43244OooO.f43211OooO0Oo).OooO00o("MsgWriter write msg ,is closed = " + this.f43236OooO0Oo, new Object[0]);
        if (this.f43236OooO0Oo) {
            return;
        }
        this.f43245OooO0oO.offer(msg);
    }

    @Override // p375o0OOoO00.o0OoOo0
    public final void OooO0o0() {
        try {
            oO000O0O.OooO00o(this.f43244OooO.f43211OooO0Oo).OooO00o("MsgWriter doWork , is closed = " + this.f43236OooO0Oo, new Object[0]);
            byte[] bArrTake = this.f43245OooO0oO.take();
            this.f43246OooO0oo.write(bArrTake, 0, bArrTake.length);
        } catch (Throwable th) {
            if (this.f43236OooO0Oo) {
                return;
            }
            this.f43244OooO.f43214OooO0oO.OooO0oO(new OooOOOO.OooO0O0(1, th));
            OooO0Oo();
        }
    }
}
