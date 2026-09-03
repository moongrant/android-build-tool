package p022Oooo00O;

import com.google.android.exoplayer2.audio.OooO0o;
import java.util.Objects;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0O0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f750OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f751OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f752OooO0o0;

    public /* synthetic */ o0O0O0o0(int i, Object obj, Object obj2) {
        this.f750OooO0Oo = i;
        this.f752OooO0o0 = obj;
        this.f751OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f750OooO0Oo) {
            case 0:
                o0O0OOOo o0o0oooo = (o0O0OOOo) this.f752OooO0o0;
                o0oO0O0o o0oo0o0o2 = (o0oO0O0o) this.f751OooO0o;
                o00OOOOo o00ooooo2 = o0o0oooo.f760OooO0O0;
                synchronized (o00ooooo2.f653OooO0O0) {
                    o00ooooo2.f654OooO0OO.remove(o0o0oooo);
                    o00ooooo2.f655OooO0Oo.remove(o0o0oooo);
                    break;
                }
                o0o0oooo.OooOOOo(o0oo0o0o2);
                Objects.requireNonNull(o0o0oooo.f763OooO0o);
                o0o0oooo.f763OooO0o.OooOO0o(o0oo0o0o2);
                return;
            default:
                OooO0o.OooO00o oooO00o = (OooO0o.OooO00o) this.f752OooO0o0;
                String str = (String) this.f751OooO0o;
                oooO00o.getClass();
                int i = o0O00.f40595OooO00o;
                oooO00o.f11611OooO0O0.OooO0Oo(str);
                return;
        }
    }
}
