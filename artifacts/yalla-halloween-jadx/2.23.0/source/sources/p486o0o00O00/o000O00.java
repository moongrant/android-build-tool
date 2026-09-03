package p486o0o00O00;

import androidx.lifecycle.Observer;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.ui.activity.main.MainActivity;
import p557o0oOo.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 implements Observer<OooOo00> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48281OooO0Oo;

    public o000O00(MainActivity mainActivity) {
        this.f48281OooO0Oo = mainActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OooOo00 oooOo00) {
        OooOo00 oooOo01 = oooOo00;
        long jCurrentTimeMillis = System.currentTimeMillis();
        MainActivity mainActivity = this.f48281OooO0Oo;
        OooOo00 oooOo02 = mainActivity.f25401OooOoO;
        if (jCurrentTimeMillis - o0OoOo0.OooOO0(oooOo02 != null ? Long.valueOf(oooOo02.f56172OooO0o) : null) > 3600000) {
            mainActivity.f25401OooOoO = oooOo01;
            mainActivity.OooOoOO();
        }
    }
}
