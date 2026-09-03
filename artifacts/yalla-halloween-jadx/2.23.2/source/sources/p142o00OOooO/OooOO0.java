package p142o00OOooO;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f37526OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Intent f37527OooO0O0;

    public OooOO0(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        OooO oooO = (OooO) fragmentActivity.getSupportFragmentManager().OooOoo("OooOO0");
        if (oooO == null) {
            oooO = new OooO();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0OO(0, oooO, "OooOO0", 1);
            oooO00o.OooO0o();
            supportFragmentManager.OooOo(true);
            supportFragmentManager.OooOooO();
        }
        this.f37526OooO00o = oooO;
    }

    public final void OooO00o(OooOO0O oooOO0O) {
        OooO oooO = this.f37526OooO00o;
        if (oooO == null) {
            throw new NullPointerException("From activity is null , forget from() ?");
        }
        if (oooO.getActivity() == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        Intent intent = this.f37527OooO0O0;
        if (intent == null) {
            intent = new Intent();
        }
        int iRandom = (int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d);
        oooO.f37525OooO0Oo.put(iRandom, oooOO0O);
        oooO.startActivityForResult(intent, iRandom);
    }
}
