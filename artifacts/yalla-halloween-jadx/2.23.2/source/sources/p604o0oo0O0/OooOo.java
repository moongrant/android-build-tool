package p604o0oo0O0;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f57387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f57388OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f57389OooO0OO;

    public OooOo(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        OooOOOO oooOOOO = (OooOOOO) fragmentActivity.getSupportFragmentManager().OooOoo("OooOo");
        if (oooOOOO == null) {
            oooOOOO = new OooOOOO();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0OO(0, oooOOOO, "OooOo", 1);
            oooO00o.OooO0o();
            supportFragmentManager.OooOo(true);
            supportFragmentManager.OooOooO();
        }
        this.f57387OooO00o = oooOOOO;
    }

    public final void OooO00o(Bundle bundle) {
        this.f57389OooO0OO = new Bundle(bundle);
    }

    public final void OooO0O0(Oooo000 oooo000) {
        OooOOOO oooOOOO = this.f57387OooO00o;
        if (oooOOOO == null) {
            throw new NullPointerException("From activity is null , forget from() ?");
        }
        FragmentActivity activity = oooOOOO.getActivity();
        if (activity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        Intent intent = new Intent();
        Class<?> cls = this.f57388OooO0O0;
        if (cls != null) {
            intent.setClass(activity, cls);
        }
        Bundle bundle = this.f57389OooO0OO;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int iRandom = (int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d);
        oooOOOO.f57386OooO0Oo.put(iRandom, oooo000);
        oooOOOO.startActivityForResult(intent, iRandom);
    }
}
