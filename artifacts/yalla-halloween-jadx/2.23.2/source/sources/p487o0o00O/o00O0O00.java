package p487o0o00O;

import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48811OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(SettingActivity settingActivity) {
        super(1);
        this.f48811OooO0Oo = settingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            SettingActivity settingActivity = this.f48811OooO0Oo;
            o000O o000o = new o000O(settingActivity);
            o000o.OooOoO(o0000.OooO0OO(o000000.clear_cache) + o0000.OooO0OO(o000000.Question_mark));
            o000o.OooOOoo(o000000.clear_cache_info);
            o000o.OooOo(true);
            o000o.OooOo0(new o00O0(settingActivity));
            o000o.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
