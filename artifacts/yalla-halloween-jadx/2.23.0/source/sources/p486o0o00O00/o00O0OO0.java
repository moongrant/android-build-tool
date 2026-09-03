package p486o0o00O00;

import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48311OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(SettingActivity settingActivity) {
        super(1);
        this.f48311OooO0Oo = settingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            SettingActivity settingActivity = this.f48311OooO0Oo;
            o0OO00O o0oo00o2 = new o0OO00O(settingActivity);
            o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.clear_cache) + o0000.OooO0OO(oO00OOo0.Question_mark));
            o0oo00o2.OooOOoo(oO00OOo0.clear_cache_info);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new o00O0O0O(settingActivity));
            o0oo00o2.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
