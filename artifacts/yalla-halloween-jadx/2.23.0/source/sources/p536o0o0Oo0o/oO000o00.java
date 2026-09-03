package p536o0o0Oo0o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO000o00 f55124OooO0Oo = new oO000o00();

    public oO000o00() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("105102");
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = BadgeActivity.f27070OooOo;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            long jLongValue = ((Number) OooO0OO.OooO0O0()).longValue();
            T value = o000000O.OooOOoo().getValue();
            Intrinsics.checkNotNull(value);
            String str = (String) value;
            T value2 = o000000O.OooO().getValue();
            Intrinsics.checkNotNull(value2);
            String str2 = (String) value2;
            String str3 = (String) o000000O.OooOO0O().getValue();
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str3;
            Intrinsics.checkNotNullExpressionValue(str4, "Account.medal.value ?: \"\"");
            BadgeActivity.OooO00o.OooO00o(activityOooO0O0, jLongValue, str, str2, str4, false);
        }
        return Unit.INSTANCE;
    }
}
