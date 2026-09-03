package p579o0oOoOOo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.account.LoginErrorActivity;
import com.yalla.yalla.ui.vm.account.LoginTouristVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.oo000o;
import p502o0o00o0.o0000O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class ooooO0O0 extends o0000O {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f46242OoooOo0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(@NotNull Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    public static final void OooO0oO(ooooO0O0 ooooo0o0) {
        Objects.requireNonNull(ooooo0o0);
        LiveEventBus.get("LOGIN_TOURIST_SUSCCESS", Boolean.TYPE).observe(ooooo0o0, new oo000o(ooooo0o0, 3));
        LoginErrorActivity.OooO00o oooO00o = LoginErrorActivity.f21761Ooooo0o;
        Context context = ooooo0o0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) LoginErrorActivity.class));
    }

    @Override // p502o0o00o0.o0000O, p502o0o00o0.o0000oo, com.yalla.yalla.common.ui.dialog.LifeCycleDialog, android.app.Dialog
    public final void show() {
        super.show();
        LoginTouristVM loginTouristVM = new LoginTouristVM();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        loginTouristVM.loginByTourists(context).observe(this, new OooOo(new oOO0Oo00(this), new oOO0OoO0(this), null, false, 12));
    }
}
