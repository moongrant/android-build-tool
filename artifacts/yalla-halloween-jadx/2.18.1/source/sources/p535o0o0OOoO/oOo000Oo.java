package p535o0o0OOoO;

import android.view.View;
import com.app.base.Function.LifecycleRequest;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.o0ooOOo;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o000OOo;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p654o0ooo.o00Oo0;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo000Oo extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f43722Oooo;

    public oOo000Oo(ChangeRegionActivity changeRegionActivity) {
        this.f43722Oooo = changeRegionActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ChangeRegionActivity changeRegionActivity = this.f43722Oooo;
        int i = changeRegionActivity.f21936Ooooo00;
        if (i == -1 || i == changeRegionActivity.f21935OoooOoo) {
            return;
        }
        if (changeRegionActivity.f21938OooooO0 == null) {
            Objects.requireNonNull(o0ooOOo.OooO00o());
            changeRegionActivity.f21938OooooO0 = new o000O();
        }
        o000O o000o = changeRegionActivity.f21938OooooO0;
        Intrinsics.checkNotNull(o000o);
        o000o.OooO0OO(changeRegionActivity, changeRegionActivity.getResources().getString(R.string.language_setting));
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o000OOo o000ooo2 = o00000OO.f32209OooO0OO;
        String strValueOf = String.valueOf(i);
        oOo000o0 ooo000o0 = new oOo000o0(changeRegionActivity, i);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.remove("region");
        mapOooO0O0.put("region", strValueOf);
        LifecycleRequest lifecycleRequest = new LifecycleRequest(changeRegionActivity);
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(lifecycleRequest.OooO00o(ooo000o0), p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32329o00oO0O, mapOooO0O0, ooo000o0);
    }
}
