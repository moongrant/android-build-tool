package p475o0OoooOo;

import OooO00o.OooO00o;
import java.io.OutputStream;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p469o0Oooo.o00oO0o;
import p469o0Oooo.o0OOO0o;
import p472o0OoooO.o0O0ooO;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000O0 extends o0OOO0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f40662Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o00oO0o f40663OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OutputStream f40664OoooO00;

    public oO000O0(@NotNull OutputStream output, @NotNull o00oO0o config) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f40664OoooO00 = output;
        this.f40663OoooO0 = config;
        this.f40662Oooo = new LinkedBlockingQueue<>();
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0O0() {
        o00Ooo.OooO00o(this.f40663OoooO0.f40584OooO0Oo).OooO00o("MsgWriter end", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0OO() {
        o00Ooo.OooO00o(this.f40663OoooO0.f40584OooO0Oo).OooO00o("MsgWriter start", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0Oo() {
        super.OooO0Oo();
        try {
            this.f40664OoooO00.close();
        } catch (Throwable th) {
            o00Ooo.OooO00o(this.f40663OoooO0.f40584OooO0Oo).OooO0OO(th);
        }
    }

    public final void OooO0o(@NotNull byte[] msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!(!(msg.length == 0))) {
            throw new IllegalArgumentException("empty msg".toString());
        }
        o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(this.f40663OoooO0.f40584OooO0Oo);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MsgWriter write msg ,is closed = ");
        sbOooO0o0.append(this.f40603Oooo0o);
        oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
        if (this.f40603Oooo0o) {
            return;
        }
        this.f40662Oooo.offer(msg);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0o0() {
        try {
            o00Ooo.OooO00o(this.f40663OoooO0.f40584OooO0Oo).OooO00o("MsgWriter doWork , is closed = " + this.f40603Oooo0o, new Object[0]);
            byte[] bArrTake = this.f40662Oooo.take();
            this.f40664OoooO00.write(bArrTake, 0, bArrTake.length);
        } catch (Throwable th) {
            if (this.f40603Oooo0o) {
                return;
            }
            this.f40663OoooO0.f40588OooO0oo.OooO0oO(new o0O0ooO.OooO0O0(1, th));
            OooO0Oo();
        }
    }
}
