package p022Oooo00O;

import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import p003OooO0o0.o0O0O00;
import p030OoooO.OooOo00;
import p033OoooO0O.o00oO0o;
import p045Oooooo.o00O0O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f660OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f661OooO0o0;

    public /* synthetic */ o00Oo0(int i, Object obj, Object obj2) {
        this.f659OooO0Oo = i;
        this.f661OooO0o0 = obj;
        this.f660OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f659OooO0Oo;
        Object obj = this.f660OooO0o;
        Object obj2 = this.f661OooO0o0;
        switch (i) {
            case 0:
                final o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj2;
                final long jOooOo0 = o0oo0oo2.OooOo0();
                OooOo00.OooO0o(true, o00O000.OooO00o(new o00O000.OooO0OO() { // from class: Oooo00O.oo000o
                    @Override // o0ooOO0.o00O000.OooO0OO
                    public final Object OooO0o0(final o00O000.OooO00o oooO00o) {
                        o0Oo0oo o0oo0oo3 = o0oo0oo2;
                        o0oo0oo3.getClass();
                        final long j = jOooOo0;
                        o0oo0oo3.OooOO0(new o0Oo0oo.OooO0OO() { // from class: Oooo00O.OooOo00
                            @Override // Oooo00O.o0Oo0oo.OooO0OO
                            public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
                                if (!o0Oo0oo.OooOOo(totalCaptureResult, j)) {
                                    return false;
                                }
                                oooO00o.OooO0O0(null);
                                return true;
                            }
                        });
                        return "waitForSessionUpdateId:" + j;
                    }
                }), (o00O000.OooO00o) obj, o00oO0o.OooO00o());
                return;
            case 1:
                ((o00O0O.OooO0OO.OooO00o) obj2).OooO00o((Surface) obj);
                return;
            case 2:
                SpecialEffectsController.OooO00o((SpecialEffectsController) obj2, (SpecialEffectsController.OooO00o) obj);
                return;
            default:
                o0O0O00.OooO0O0(obj2);
                int i2 = AdsMediaSource.f13155OooOO0O;
                throw null;
        }
    }
}
