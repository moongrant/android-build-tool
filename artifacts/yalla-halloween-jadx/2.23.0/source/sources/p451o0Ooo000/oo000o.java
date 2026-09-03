package p451o0Ooo000;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p573o0oOoOOO.oO0OO00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0OO00 f46444OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(oO0OO00 oo0oo00) {
        super(0);
        this.f46444OooO0Oo = oo0oo00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32884OooO0o0, null, new o00Ooo(this.f46444OooO0Oo));
        }
        return Unit.INSTANCE;
    }
}
