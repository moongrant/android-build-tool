package p516o0o0O000;

import android.app.NotificationManager;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.activity.main.MainActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p169o00Ooo00.OooOOOO;
import p391o0OOooOo.o0O00000;
import p433o0OoOO0o.o0O0oo0o;
import p498o0o00Oo0.OooOOO;
import p579o0oOoOOo.ooooO0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f42125OooO00o = new oo0o0Oo();

    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f42126OooO00o;

        public OooO00o(Function0<Unit> function0) {
            this.f42126OooO00o = function0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            LiveEventBus.get("LOGIN_TOURIST_SUSCCESS").removeObserver(this);
            this.f42126OooO00o.invoke();
            o00OOOO.OooO00o OooO00o2 = o00OOOO.OooO00o.OooO00o();
            Context context = o0000O.f2657OooO00o;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            OooO00o2.OooO0O0(context, ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue(), oooOOO.OooOo00().getValue());
        }
    }

    public final void OooO00o(@NotNull FragmentActivity context, @NotNull Function0<Unit> onInit) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onInit, "onInit");
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        if (value == null || value.longValue() != 0) {
            String value2 = oooOOO.OooOo00().getValue();
            if (!(value2 == null || StringsKt.isBlank(value2))) {
                onInit.invoke();
                return;
            }
        }
        LiveEventBus.get("LOGIN_TOURIST_SUSCCESS").observeForever(new OooO00o(onInit));
        new ooooO0O0(context).show();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [o0OoOO0o.o0O000O, o0OoOO0o.o0O00OOO<o0OoOO0o.o0O0O0Oo>] */
    public final void OooO0O0(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        o0O00000.OooO0OO("Me_logout");
        try {
            try {
                OooOOOO oooOOOO = OooOOOO.f32671OooO00o;
                OooOOOO.f32672OooO0O0.clear();
                o00OO0O0.OooO0O0 oooO0O0 = new o00OO0O0.OooO0O0();
                Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                Context context2 = null;
                o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32283o000000o, mapOooO0O0, oooO0O0);
                RoomStateManager.INSTANCE.closeRoom();
                Context context3 = o0000O.f2657OooO00o;
                if (context3 != null) {
                    context2 = context3;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                }
                ((NotificationManager) context2.getSystemService("notification")).cancelAll();
                try {
                    o0O0oo0o.OooO0OO().f39949OooO00o.OooO00o();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            OooOOO.f41216OooO00o.OooO00o();
            if (!z) {
                LiveEventBus.get("RECREATE").post(Boolean.TRUE);
            } else {
                MainActivity.OooO00o oooO00o = MainActivity.f21943ooOO;
                MainActivity.OooO00o.OooO00o(context, true, 0, 28);
            }
        } catch (Throwable th) {
            OooOOO.f41216OooO00o.OooO00o();
            throw th;
        }
    }
}
