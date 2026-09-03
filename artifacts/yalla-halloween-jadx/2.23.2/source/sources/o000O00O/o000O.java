package o000O00O;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.media3.common.Player;
import androidx.media3.common.util.Log;
import com.geetest.captcha.GTCaptcha4Client;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O implements o000OoO.o00000O0.OooO00o, androidx.media3.session.o000OOo0.OooO00o, GTCaptcha4Client.OnWebViewShowListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34025OooO0Oo;

    public /* synthetic */ o000O(Object obj) {
        this.f34025OooO0Oo = obj;
    }

    @Override // androidx.media3.session.o000OOo0.OooO00o
    public final void OooO0O0(androidx.media3.session.o0000OO0 o0000oo1) {
        androidx.media3.session.OooO oooO = (androidx.media3.session.OooO) this.f34025OooO0Oo;
        int i = androidx.media3.session.o000OOo0.f9318OooO0o0;
        if (o0000oo1.f9298OooO0Oo != null) {
            Log.OooO0OO("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            o0000oo1.OooO0o0().release();
            return;
        }
        o0000oo1.f9298OooO0Oo = oooO.f9225OooO0o;
        o0000oo1.f9296OooO0O0 = oooO.f9228OooO0oo;
        Player.OooO00o oooO00o = oooO.f9223OooO;
        o0000oo1.getClass();
        Player.OooO00o oooO00o2 = oooO.f9229OooOO0;
        o0000oo1.getClass();
        Player.OooO00o oooO00oOooO0OO = androidx.media3.session.o0000OO0.OooO0OO(oooO00o, oooO00o2);
        o0000oo1.f9297OooO0OO = oooO00oOooO0OO;
        androidx.media3.session.o0000OO0.OooO0Oo(oooO.f9232OooOOO0, oooO00oOooO0OO, o0000oo1.f9296OooO0O0);
        o0000oo1.getClass();
        o0000oo1.f9295OooO00o = oooO.f9231OooOO0o;
        try {
            IBinder iBinderAsBinder = oooO.f9225OooO0o.asBinder();
            o0000oo1.getClass();
            iBinderAsBinder.linkToDeath(null, 0);
            o0000oo1.getClass();
            throw null;
        } catch (RemoteException unused) {
            o0000oo1.OooO0o0().release();
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onVideoSizeChanged((androidx.media3.common.o00Ooo) this.f34025OooO0Oo);
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnWebViewShowListener
    public final void onWebViewShow() {
        Function0 function0 = (Function0) this.f34025OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
