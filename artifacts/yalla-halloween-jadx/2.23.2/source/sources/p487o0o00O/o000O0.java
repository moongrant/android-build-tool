package p487o0o00O;

import android.content.Intent;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p385o0OOoo0o.o000OOo;
import p433o0OoOOO0.o00000O0;
import p433o0OoOOO0.o00000OO;
import p433o0OoOOO0.o0000Ooo;
import p443o0OoOo0o.o000Oo0;
import p475o0Ooooo0.o0O00oO0;
import p544o0o0o00O.o0O0o000;
import p590o0oOooo0.oOO0000;
import p590o0oOooo0.oo000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48774OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(MainActivity mainActivity) {
        super(1);
        this.f48774OooO0Oo = mainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        MainActivity activity = this.f48774OooO0Oo;
        if (zBooleanValue) {
            int i = MainActivity.f24940OooOoo;
            activity.getClass();
            oOO0000.OooO0O0(false);
            activity.OooOoO().loadUserInfo();
            IMMessageService iMMessageService = IMMessageService.f24478OooO0o;
            if (iMMessageService != null) {
                iMMessageService.OooO00o();
            }
            Intrinsics.checkNotNullParameter(activity, "activity");
            o0O0o000 o0o0o000 = new o0O0o000();
            int i2 = 1;
            try {
                o0000O00.OooO0OO("IMMessageService", "MessageManager startService");
                Intent intent = new Intent(App.f22232OooO0o, (Class<?>) IMMessageService.class);
                App.f22232OooO0o.startService(intent);
                activity.bindService(intent, o0o0o000, 1);
            } catch (IllegalStateException e) {
                o0000O00.OooO00o(100, "IMMessageService", "MessageManager error ", e);
                e.printStackTrace();
            }
            activity.f24949OooOoOO = o0o0o000;
            activity.OooOoO().updateMessageStateFailed();
            Looper.myQueue().addIdleHandler(activity.f24948OooOoO0);
            OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(activity), new o000O0Oo(null));
            o0000Ooo o0000oooOooOoO0 = activity.OooOoO0();
            if (!o0000oooOooOoO0.f46843OooO00o && o0000oooOooOoO0.f46844OooO0O0) {
                o0000oooOooOoO0.f46843OooO00o = true;
            }
            o00000O0 o00000o1 = (o00000O0) activity.f24943OooOo0.getValue();
            if (!o00000o1.f46843OooO00o && o00000o1.f46844OooO0O0) {
                o00000o1.f46843OooO00o = true;
            }
            activity.OooOoO().loadLimitedPsdRoom();
            activity.OooOoO().checkTermsService().observe(activity, new o000Oo0(activity, i2));
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooOoO0();
            o0O00oO0.OooOoO();
            o000OOo o000oooOooO00o = o000OOo.OooO00o();
            long jLongValue = ((Number) OooO00o.OooO00o()).longValue();
            String str = (String) o0O00oO0.OooOOOO().getValue();
            o000oooOooO00o.getClass();
            o000OOo.OooO0O0(jLongValue, str, activity);
            if (o0O00oO0.OooOo00().getValue() == 0) {
                activity.OooOoO().getEventSettingState();
            }
        } else {
            int i3 = MainActivity.f24940OooOoo;
            o00000O0 o00000o2 = (o00000O0) activity.f24943OooOo0.getValue();
            o00000o2.getClass();
            oo000000.f57241OooO0O0.observe(o00000o2.f46853OooO0Oo, new o00000O0.OooO0OO(new o00000OO(o00000o2)));
        }
        return Unit.INSTANCE;
    }
}
