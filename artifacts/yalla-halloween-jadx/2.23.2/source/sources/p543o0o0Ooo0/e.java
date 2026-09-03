package p543o0o0Ooo0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p004OooO0oO.o000oOoO;
import p414o0Oo0oO.oOo00OO0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final e f55395OooO0Oo = new e();

    public e() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            oOo00OO0 ooo00oo0OooOO0O = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o000oOoO.OooO0OO("premiumRedDot_MomentEdit_Hide4Main", o0O00oO0.OooOOo0().getValue(), ooo00oo0OooOO0O, true);
            SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boolean.FALSE);
            T value = o0O00oO0.OooOO0o().getValue();
            Intrinsics.checkNotNull(value);
            int iIntValue = ((Number) ((Pair) value).getSecond()).intValue();
            OooO00o.OooO0O0("105017");
            int i = PremiumActivity.f26673Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(activityOooO0O0, PremiumLevel.INSTANCE.of(Integer.valueOf(iIntValue)));
        }
        return Unit.INSTANCE;
    }
}
