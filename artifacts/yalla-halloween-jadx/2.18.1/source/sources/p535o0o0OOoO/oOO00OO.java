package p535o0o0OOoO;

import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f43691Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00OO(SettingActivity settingActivity) {
        super(1);
        this.f43691Oooo0o = settingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(this.f43691Oooo0o);
            SettingActivity settingActivity = this.f43691Oooo0o;
            oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.clear_cache) + o000O0O0.OooO0OO(R.string.Question_mark));
            oo0ooo0.OooOo0(R.string.clear_cache_info);
            oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
            oo0ooo0.OooOo0o(new oOO00O0(settingActivity));
            oo0ooo0.OooOOO0();
        }
        return Unit.INSTANCE;
    }
}
