package p535o0o0OOoO;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f43690Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O0(SettingActivity settingActivity) {
        super(0);
        this.f43690Oooo0o = settingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SettingActivity settingActivity = this.f43690Oooo0o;
        SettingActivity.OooO00o oooO00o = SettingActivity.f22059Ooooo00;
        Objects.requireNonNull(settingActivity);
        BaseActivityK.OooOoo0(settingActivity, "", 0L, 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(settingActivity), null, null, new oOO000o(settingActivity, null), 3, null);
        return Unit.INSTANCE;
    }
}
