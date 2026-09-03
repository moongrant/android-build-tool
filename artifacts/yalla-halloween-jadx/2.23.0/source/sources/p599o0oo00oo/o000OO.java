package p599o0oo00oo;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O0 f56863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f56864OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f56865OooO0OO;

    public o000OO(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        o0000O0 o0000o1 = (o0000O0) fragmentActivity.getSupportFragmentManager().OooOoo("o000OO");
        if (o0000o1 == null) {
            o0000o1 = new o0000O0();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0OO(0, o0000o1, "o000OO", 1);
            oooO00o.OooO0o();
            supportFragmentManager.OooOo(true);
            supportFragmentManager.OooOooO();
        }
        this.f56863OooO00o = o0000o1;
    }

    public final void OooO00o(Bundle bundle) {
        this.f56865OooO0OO = new Bundle(bundle);
    }

    public final void OooO0O0(o0000O o0000o2) {
        o0000O0 o0000o1 = this.f56863OooO00o;
        if (o0000o1 == null) {
            throw new NullPointerException("From activity is null , forget from() ?");
        }
        FragmentActivity activity = o0000o1.getActivity();
        if (activity == null) {
            throw new NullPointerException("Surprise , something is error , perhaps this is love");
        }
        Intent intent = new Intent();
        Class<?> cls = this.f56864OooO0O0;
        if (cls != null) {
            intent.setClass(activity, cls);
        }
        Bundle bundle = this.f56865OooO0OO;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int iRandom = (int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d);
        o0000o1.f56858OooO0Oo.put(iRandom, o0000o2);
        o0000o1.startActivityForResult(intent, iRandom);
    }
}
