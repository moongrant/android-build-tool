package p022Oooo00O;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.SessionEventsState;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f760OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f761OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f762OooO0o0;

    public /* synthetic */ o0O0OO0(int i, Object obj, Object obj2) {
        this.f760OooO0Oo = i;
        this.f762OooO0o0 = obj;
        this.f761OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f760OooO0Oo) {
            case 0:
                o0O0OOOo o0o0oooo = (o0O0OOOo) this.f762OooO0o0;
                o0oO0O0o o0oo0o0o2 = (o0oO0O0o) this.f761OooO0o;
                o00OOOOo o00ooooo2 = o0o0oooo.f767OooO0O0;
                synchronized (o00ooooo2.f652OooO0O0) {
                    o00ooooo2.f653OooO0OO.remove(o0o0oooo);
                    o00ooooo2.f654OooO0Oo.remove(o0o0oooo);
                    break;
                }
                o0o0oooo.OooOOOo(o0oo0o0o2);
                Objects.requireNonNull(o0o0oooo.f770OooO0o);
                o0o0oooo.f770OooO0o.OooOO0o(o0oo0o0o2);
                return;
            default:
                AppEventQueue.m4062handleResponse$lambda5((AccessTokenAppIdPair) this.f762OooO0o0, (SessionEventsState) this.f761OooO0o);
                return;
        }
    }
}
