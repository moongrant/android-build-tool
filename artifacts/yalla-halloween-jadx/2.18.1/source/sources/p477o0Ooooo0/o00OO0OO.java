package p477o0Ooooo0;

import OooO00o.OooO00o;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p469o0Oooo.o00oO0o;
import p469o0Oooo.o0OOO0o;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO extends o0OOO0o implements o00OO0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final LinkedBlockingQueue<byte[]> f40665Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o00oO0o f40666OoooO00;

    public o00OO0OO(@NotNull o00oO0o config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f40666OoooO00 = config;
        this.f40665Oooo = new LinkedBlockingQueue<>();
    }

    @Override // p477o0Ooooo0.o00OO0O0
    public final void OooO00o(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f40603Oooo0o) {
            return;
        }
        try {
            this.f40665Oooo.offer(data);
        } catch (Throwable th) {
            o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(this.f40666OoooO00.f40584OooO0Oo);
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Msg processor enqueue data error! \n");
            sbOooO0o0.append(th.getMessage());
            oooO0OOOooO00o.OooO0O0(sbOooO0o0.toString(), new Object[0]);
            OooO0Oo();
        }
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0O0() {
        o00Ooo.OooO00o(this.f40666OoooO00.f40584OooO0Oo).OooO00o("AbsMsgProcessor end", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0OO() {
        o00Ooo.OooO00o(this.f40666OoooO00.f40584OooO0Oo).OooO00o("AbsMsgProcessor start", new Object[0]);
    }

    @Override // p469o0Oooo.o0OOO0o
    public final void OooO0o0() {
        byte[] msg;
        try {
            msg = this.f40665Oooo.take();
        } catch (Throwable th) {
            o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(this.f40666OoooO00.f40584OooO0Oo);
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Msg processor take data error! \n");
            sbOooO0o0.append(th.getMessage());
            oooO0OOOooO00o.OooO0O0(sbOooO0o0.toString(), new Object[0]);
            msg = null;
        }
        if (msg == null) {
            o00Ooo.OooO00o(this.f40666OoooO00.f40584OooO0Oo).OooO0O0("Msg processor take null msg!", new Object[0]);
        } else {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.f40666OoooO00.f40587OooO0oO.OooO0O0(msg);
        }
    }
}
