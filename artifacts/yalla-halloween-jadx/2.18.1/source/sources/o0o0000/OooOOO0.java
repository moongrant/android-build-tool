package o0o0000;

import android.app.Activity;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.user.VipActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Activity f40805Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(Activity activity) {
        super(0);
        this.f40805Oooo0o = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VipActivity.f23570OoooOOo.OooO00o(this.f40805Oooo0o, VipLevel.Vip1);
        return Unit.INSTANCE;
    }
}
