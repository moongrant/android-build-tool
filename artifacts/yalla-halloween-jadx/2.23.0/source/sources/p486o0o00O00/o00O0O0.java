package p486o0o00O00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.main.SettingActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48307OooO0Oo;

    public o00O0O0(SettingActivity settingActivity) {
        this.f48307OooO0Oo = settingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f48307OooO0Oo.finish();
    }
}
