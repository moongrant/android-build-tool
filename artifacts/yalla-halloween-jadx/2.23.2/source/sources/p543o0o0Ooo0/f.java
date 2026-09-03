package p543o0o0Ooo0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final f f55404OooO0Oo = new f();

    public f() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("105102");
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = BadgeActivity.f26604OooOo;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            long jLongValue = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
            T value = o0O00oO0.OooOOoo().getValue();
            Intrinsics.checkNotNull(value);
            String str = (String) value;
            T value2 = o0O00oO0.OooO().getValue();
            Intrinsics.checkNotNull(value2);
            String str2 = (String) value2;
            String str3 = (String) o0O00oO0.OooOO0O().getValue();
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            Intrinsics.checkNotNull(str4);
            BadgeActivity.OooO00o.OooO00o(activityOooO0O0, jLongValue, str, str2, str4, false);
        }
        return Unit.INSTANCE;
    }
}
