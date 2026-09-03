package p536o0o0Oo0o;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p022Oooo00O.o00O000;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000OO;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO000Oo f55122OooO0Oo = new oO000Oo();

    public oO000Oo() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
            o00000ooOooOO0O.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o00O000.OooO0O0("premiumRedDot_MomentEdit_Hide4Main", o000000O.OooOOo0().getValue(), o00000ooOooOO0O, true);
            SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boolean.FALSE);
            T value = o000000O.OooOO0o().getValue();
            Intrinsics.checkNotNull(value);
            int iIntValue = ((Number) ((Pair) value).getSecond()).intValue();
            o0OO000.OooO00o("105017");
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(activityOooO0O0, PremiumLevel.INSTANCE.of(Integer.valueOf(iIntValue)));
        }
        return Unit.INSTANCE;
    }
}
