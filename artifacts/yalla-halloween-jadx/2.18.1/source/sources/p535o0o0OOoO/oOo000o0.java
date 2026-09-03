package p535o0o0OOoO;

import android.content.Context;
import android.content.Intent;
import com.app.base.application.App;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import oo0O.OooO00o;
import oo0O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.oo000o;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p558o0oOOoo.o00O0;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo000o0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f43723OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f43724OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(ChangeRegionActivity changeRegionActivity, int i) {
        super(changeRegionActivity);
        this.f43723OooO00o = changeRegionActivity;
        this.f43724OooO0O0 = i;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(code2, message);
        o000O o000o = this.f43723OooO00o.f21938OooooO0;
        Intrinsics.checkNotNull(o000o);
        o000o.OooO00o();
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        oo000o.OooO0o(App.f11458Oooo0oO);
        OooOOO.f41216OooO00o.OooOOO().postValue(Integer.valueOf(this.f43724OooO0O0));
        RoomStateManager.INSTANCE.closeRoom();
        ChangeRegionActivity changeRegionActivity = this.f43723OooO00o;
        ChangeRegionActivity.OooO00o oooO00o = ChangeRegionActivity.f21932OooooOo;
        Objects.requireNonNull(changeRegionActivity);
        OooOOO.f41218OooO0OO = false;
        o000O o000o = this.f43723OooO00o.f21938OooooO0;
        if (o000o != null) {
            o000o.OooO00o();
        }
        o0O00000.OooO0o0("Me_language_success", this.f43724OooO0O0 + "");
        if (OooO00o.f53321OooO0O0 == null) {
            synchronized (OooO0O0.class) {
                if (OooO00o.f53321OooO0O0 == null) {
                    OooO00o.f53321OooO0O0 = new o00O0();
                }
            }
        }
        Objects.requireNonNull(OooO00o.f53321OooO0O0);
        this.f43723OooO00o.finish();
        MainActivity.OooO00o oooO00o2 = MainActivity.f21943ooOO;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }
}
