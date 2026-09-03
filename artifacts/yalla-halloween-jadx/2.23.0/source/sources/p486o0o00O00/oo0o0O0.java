package p486o0o00O00;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48413OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(SettingActivity settingActivity) {
        super(0);
        this.f48413OooO0Oo = settingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = SettingActivity.f25532OooOo00;
        SettingActivity settingActivity = this.f48413OooO0Oo;
        settingActivity.getClass();
        BaseActivityK.OooOo0o(settingActivity, "", 0L, 2);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(settingActivity), Dispatchers.getIO(), null, new o00O0(settingActivity, null), 2, null);
        return Unit.INSTANCE;
    }
}
