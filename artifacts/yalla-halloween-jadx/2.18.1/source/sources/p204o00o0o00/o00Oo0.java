package p204o00o0o00;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0O f33242OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f33243OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Intent f33244OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Bundle f33245OooO0Oo;

    public o00Oo0(FragmentActivity fragmentActivity) {
        Objects.requireNonNull(fragmentActivity, "Surprise , something is error , perhaps this is love");
        o00O0O o00o0o2 = (o00O0O) fragmentActivity.getSupportFragmentManager().Oooo00O("o00Oo0");
        if (o00o0o2 == null) {
            o00o0o2 = new o00O0O();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0Oo(0, o00o0o2, "o00Oo0", 1);
            oooO00o.OooO0oo();
            supportFragmentManager.OooOooO();
        }
        this.f33242OooO00o = o00o0o2;
    }

    public final void OooO00o(o00Ooo o00ooo2) {
        o00O0O o00o0o2 = this.f33242OooO00o;
        Objects.requireNonNull(o00o0o2, "From activity is null , forget from() ?");
        FragmentActivity activity = o00o0o2.getActivity();
        Objects.requireNonNull(activity, "Surprise , something is error , perhaps this is love");
        Intent intent = this.f33244OooO0OO;
        if (intent == null) {
            intent = new Intent();
        }
        Class<?> cls = this.f33243OooO0O0;
        if (cls != null) {
            intent.setClass(activity, cls);
        }
        Bundle bundle = this.f33245OooO0Oo;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int iRandom = (int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d);
        o00O0O o00o0o3 = this.f33242OooO00o;
        o00o0o3.f33241Oooo0o.put(iRandom, o00ooo2);
        o00o0o3.startActivityForResult(intent, iRandom);
    }
}
