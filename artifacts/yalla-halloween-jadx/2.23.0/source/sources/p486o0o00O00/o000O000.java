package p486o0o00O00;

import android.content.Intent;
import android.os.Looper;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p380o0OOoo0.OooOO0;
import p426o0OoOO.OooOo00;
import p426o0OoOO.Oooo0;
import p426o0OoOO.Oooo000;
import p464o0Oooo.o000000O;
import p472o0Ooooo0.oO0000Oo;
import p579o0oOoo.o;
import p579o0oOoo.oO0OOO00;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48282OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(MainActivity mainActivity) {
        super(1);
        this.f48282OooO0Oo = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        boolean zBooleanValue = it.booleanValue();
        MainActivity activity = this.f48282OooO0Oo;
        if (zBooleanValue) {
            int i = MainActivity.f25394OooOoo;
            activity.getClass();
            o.OooO0O0(false);
            activity.OooOoO().loadUserInfo();
            IMMessageService iMMessageService = IMMessageService.f24939OooO0o;
            if (iMMessageService != null) {
                iMMessageService.OooO00o();
            }
            Intrinsics.checkNotNullParameter(activity, "activity");
            oO0000Oo oo0000oo = new oO0000Oo();
            try {
                OooOOO0.OooO0OO("IMMessageService", "MessageManager startService");
                Intent intent = new Intent(App.f22702OooO0o, (Class<?>) IMMessageService.class);
                App.f22702OooO0o.startService(intent);
                activity.bindService(intent, oo0000oo, 1);
            } catch (IllegalStateException e) {
                OooOOO0.OooO00o(100, "IMMessageService", "MessageManager error ", e);
                e.printStackTrace();
            }
            activity.f25403OooOoOO = oo0000oo;
            activity.OooOoO().updateMessageStateFailed();
            Looper.myQueue().addIdleHandler(activity.f25402OooOoO0);
            OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(activity), new o000OO0O(null));
            Oooo0 oooo0OooOoO0 = activity.OooOoO0();
            if (!oooo0OooOoO0.f46042OooO00o && oooo0OooOoO0.f46043OooO0O0) {
                oooo0OooOoO0.f46042OooO00o = true;
            }
            OooOo00 oooOo00 = (OooOo00) activity.f25397OooOo0.getValue();
            if (!oooOo00.f46042OooO00o && oooOo00.f46043OooO0O0) {
                oooOo00.f46042OooO00o = true;
            }
            activity.OooOoO().loadLimitedPsdRoom();
            activity.OooOoO().checkTermsService().observe(activity, new o0000O(activity));
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOoO();
            o000000O.OooOoOO();
            OooOO0 oooOO0OooO00o = OooOO0.OooO00o();
            long jLongValue = ((Number) OooO0OO.OooO0O0()).longValue();
            String str = (String) o000000O.OooOOOO().getValue();
            oooOO0OooO00o.getClass();
            OooOO0.OooO0O0(jLongValue, str, activity);
            if (o000000O.OooOo00().getValue() == 0) {
                activity.OooOoO().getEventSettingState();
            }
        } else {
            int i2 = MainActivity.f25394OooOoo;
            OooOo00 oooOo01 = (OooOo00) activity.f25397OooOo0.getValue();
            oooOo01.getClass();
            oO0OOO00.f56607OooO0O0.observe(oooOo01.f45594OooO0Oo, new OooOo00.OooO0OO(new Oooo000(oooOo01)));
        }
        return Unit.INSTANCE;
    }
}
