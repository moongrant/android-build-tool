package p580o0oOoOoo;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p579o0oOoOoO.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO0O0O f56559OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(oOO0O0O ooo0o0o) {
        super(0);
        this.f56559OooO0Oo = ooo0o0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32340OooO0o0, null, new oOOO00(this.f56559OooO0Oo));
        }
        return Unit.INSTANCE;
    }
}
