package p487o0o00O;

import android.widget.LinearLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.main.SettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SettingActivity f48906OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(SettingActivity settingActivity) {
        super(1);
        this.f48906OooO0Oo = settingActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SettingActivity settingActivity = this.f48906OooO0Oo;
        if (zBooleanValue) {
            int i = SettingActivity.f25078OooOo00;
            LinearLayout llUnprotected = settingActivity.OooOo().f44763OooO0O0;
            Intrinsics.checkNotNullExpressionValue(llUnprotected, "llUnprotected");
            o000O.OooO0O0(llUnprotected);
        } else {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (((Boolean) o0O00oO0.f47984OoooOo0.getValue()).booleanValue()) {
                int i2 = SettingActivity.f25078OooOo00;
                LinearLayout llUnprotected2 = settingActivity.OooOo().f44763OooO0O0;
                Intrinsics.checkNotNullExpressionValue(llUnprotected2, "llUnprotected");
                o000O.OooOOOO(llUnprotected2);
            } else {
                int i3 = SettingActivity.f25078OooOo00;
                LinearLayout llUnprotected3 = settingActivity.OooOo().f44763OooO0O0;
                Intrinsics.checkNotNullExpressionValue(llUnprotected3, "llUnprotected");
                o000O.OooO0O0(llUnprotected3);
            }
        }
        return Unit.INSTANCE;
    }
}
