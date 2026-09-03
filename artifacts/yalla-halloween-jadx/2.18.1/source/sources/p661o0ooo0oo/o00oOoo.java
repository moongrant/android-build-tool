package p661o0ooo0oo;

import java.io.IOException;
import kotlin.Unit;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oOoo extends o0O00000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f51501Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f51502Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO.OooO0O0 f51503Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(o0O0ooO.OooO0O0 oooO0O0, o0O0O0O o0o0o0o, o0O0O0O o0o0o0o2) {
        super(o0o0o0o2);
        this.f51503Oooo0oo = oooO0O0;
        this.f51501Oooo = o0o0o0o;
    }

    @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f51502Oooo0oO) {
            return;
        }
        this.f51502Oooo0oO = true;
        synchronized (this.f51503Oooo0oo.f51544OooOO0) {
            o0O0ooO.OooO0O0 oooO0O0 = this.f51503Oooo0oo;
            int i = oooO0O0.f51542OooO0oO - 1;
            oooO0O0.f51542OooO0oO = i;
            if (i == 0 && oooO0O0.f51541OooO0o0) {
                oooO0O0.f51544OooOO0.OooOoo(oooO0O0);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
