package p486o0o00O00;

import android.widget.LinearLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48308OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(SettingActivity settingActivity) {
        super(1);
        this.f48308OooO0Oo = settingActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SettingActivity settingActivity = this.f48308OooO0Oo;
        if (zBooleanValue) {
            int i = SettingActivity.f25532OooOo00;
            LinearLayout linearLayout = settingActivity.OooOo().f58936OooO0O0;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUnprotected");
            o000OO00.OooO0O0(linearLayout);
        } else {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o000000O.OooOoO0()) {
                int i2 = SettingActivity.f25532OooOo00;
                LinearLayout linearLayout2 = settingActivity.OooOo().f58936OooO0O0;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llUnprotected");
                o000OO00.OooOOOO(linearLayout2);
            } else {
                int i3 = SettingActivity.f25532OooOo00;
                LinearLayout linearLayout3 = settingActivity.OooOo().f58936OooO0O0;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llUnprotected");
                o000OO00.OooO0O0(linearLayout3);
            }
        }
        return Unit.INSTANCE;
    }
}
