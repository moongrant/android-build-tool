package p022Oooo00O;

import android.hardware.camera2.TotalCaptureResult;
import com.twitter.sdk.android.tweetui.Oooo000;
import com.yalla.yalla.ui.fragment.ExploreTagRoomListFragment;
import p030OoooO.OooOo;
import p033OoooO0O.o00oO0o;
import p559o0oOo.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000oOoO implements o000Oo0.OooO0OO, Oooo000, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f603OooO0Oo;

    public /* synthetic */ o000oOoO(Object obj) {
        this.f603OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        ExploreTagRoomListFragment.initView$lambda$0((ExploreTagRoomListFragment) this.f603OooO0Oo);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(final o000Oo0.OooO00o oooO00o) {
        final o0Oo0oo o0oo0oo2 = (o0Oo0oo) this.f603OooO0Oo;
        o0oo0oo2.getClass();
        o0oo0oo2.f847OooO0OO.execute(new Runnable() { // from class: Oooo00O.oo000o
            @Override // java.lang.Runnable
            public final void run() {
                final o0Oo0oo o0oo0oo3 = o0oo0oo2;
                final long jOooOo0 = o0oo0oo3.OooOo0();
                OooOo.OooO0o(true, o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: Oooo00O.OooOo
                    @Override // o0ooOO0.o000Oo0.OooO0OO
                    public final Object OooO0o0(final o000Oo0.OooO00o oooO00o2) {
                        o0Oo0oo o0oo0oo4 = o0oo0oo3;
                        o0oo0oo4.getClass();
                        final long j = jOooOo0;
                        o0oo0oo4.OooOO0(new o0Oo0oo.OooO0OO() { // from class: Oooo00O.Oooo000
                            @Override // Oooo00O.o0Oo0oo.OooO0OO
                            public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
                                if (!o0Oo0oo.OooOOo(totalCaptureResult, j)) {
                                    return false;
                                }
                                oooO00o2.OooO0O0(null);
                                return true;
                            }
                        });
                        return "waitForSessionUpdateId:" + j;
                    }
                }), oooO00o, o00oO0o.OooO00o());
            }
        });
        return "updateSessionConfigAsync";
    }
}
