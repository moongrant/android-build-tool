package p371o0OOoO0;

import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p368o0OOo0oO.o00Oo0;
import p368o0OOo0oO.o0OoOo0;
import p369o0OOo0oo.o00oO0o;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0OoOo0 f44041OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f44042OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OutputStream f44043OooO0oo;

    public OooO0o(@NotNull OutputStream output, @NotNull o0OoOo0 config) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f44043OooO0oo = output;
        this.f44041OooO = config;
        this.f44042OooO0oO = new LinkedBlockingQueue<>();
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0O0() {
        wc.OooO00o(this.f44041OooO.f43994OooO0Oo).OooO00o("MsgWriter end", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0OO() {
        wc.OooO00o(this.f44041OooO.f43994OooO0Oo).OooO00o("MsgWriter start", new Object[0]);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0Oo() {
        super.OooO0Oo();
        try {
            this.f44043OooO0oo.close();
        } catch (Throwable th) {
            wc.OooO00o(this.f44041OooO.f43994OooO0Oo).OooO0OO(th);
        }
    }

    public final void OooO0o(@NotNull byte[] msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!(!(msg.length == 0))) {
            throw new IllegalArgumentException("empty msg".toString());
        }
        wc.OooO00o(this.f44041OooO.f43994OooO0Oo).OooO00o("MsgWriter write msg ,is closed = " + this.f43986OooO0Oo, new Object[0]);
        if (this.f43986OooO0Oo) {
            return;
        }
        this.f44042OooO0oO.offer(msg);
    }

    @Override // p368o0OOo0oO.o00Oo0
    public final void OooO0o0() {
        try {
            wc.OooO00o(this.f44041OooO.f43994OooO0Oo).OooO00o("MsgWriter doWork , is closed = " + this.f43986OooO0Oo, new Object[0]);
            byte[] bArrTake = this.f44042OooO0oO.take();
            this.f44043OooO0oo.write(bArrTake, 0, bArrTake.length);
        } catch (Throwable th) {
            if (this.f43986OooO0Oo) {
                return;
            }
            this.f44041OooO.f43997OooO0oO.OooO0oO(new o00oO0o.OooO0O0(1, th));
            OooO0Oo();
        }
    }
}
