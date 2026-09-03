package p620o0oo0o0O;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.OooO00o;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O00O f48617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f48618OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f48619OooO0OO;

    public o00O00OO(FragmentActivity fragmentActivity) {
        Objects.requireNonNull(fragmentActivity, "Surprise , something is error , perhaps this is love");
        o00O00O o00o00o2 = (o00O00O) fragmentActivity.getSupportFragmentManager().Oooo00O("o00O00OO");
        if (o00o00o2 == null) {
            o00o00o2 = new o00O00O();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            OooO00o oooO00o = new OooO00o(supportFragmentManager);
            oooO00o.OooO0Oo(0, o00o00o2, "o00O00OO", 1);
            oooO00o.OooO0oo();
            supportFragmentManager.OooOooO();
        }
        this.f48617OooO00o = o00o00o2;
    }

    public final o00O00OO OooO00o(Bundle bundle) {
        this.f48619OooO0OO = new Bundle(bundle);
        return this;
    }

    public final void OooO0O0(o00O00o0 o00o00o1) {
        o00O00O o00o00o2 = this.f48617OooO00o;
        Objects.requireNonNull(o00o00o2, "From activity is null , forget from() ?");
        FragmentActivity activity = o00o00o2.getActivity();
        Objects.requireNonNull(activity, "Surprise , something is error , perhaps this is love");
        Intent intent = new Intent();
        Class<?> cls = this.f48618OooO0O0;
        if (cls != null) {
            intent.setClass(activity, cls);
        }
        Bundle bundle = this.f48619OooO0OO;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int iRandom = (int) (((Math.random() * 9.0d) + 1.0d) * 1000.0d);
        o00O00O o00o00o3 = this.f48617OooO00o;
        o00o00o3.f48616Oooo0o.put(iRandom, o00o00o1);
        o00o00o3.startActivityForResult(intent, iRandom);
    }
}
