package oo0oOO0;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f60907OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Intent f60908OooO0O0;

    public OooO0O0(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        OooO00o oooO00o = (OooO00o) fragmentActivity.getSupportFragmentManager().OooOoo("OooO0O0");
        if (oooO00o == null) {
            oooO00o = new OooO00o();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.OooO00o oooO00o2 = new androidx.fragment.app.OooO00o(supportFragmentManager);
            oooO00o2.OooO0OO(0, oooO00o, "OooO0O0", 1);
            oooO00o2.OooO0o();
            supportFragmentManager.OooOo(true);
            supportFragmentManager.OooOooO();
        }
        this.f60907OooO00o = oooO00o;
    }

    public final void OooO00o(OooO0OO oooO0OO) {
        OooO00o oooO00o = this.f60907OooO00o;
        if (oooO00o == null) {
            throw new NullPointerException("From activity is null , forget from() ?");
        }
        if (oooO00o.getActivity() == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        Intent intent = this.f60908OooO0O0;
        if (intent == null) {
            intent = new Intent();
        }
        int iRandom = (int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d);
        oooO00o.f60906OooO0Oo.put(iRandom, oooO0OO);
        oooO00o.startActivityForResult(intent, iRandom);
    }
}
