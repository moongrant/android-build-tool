package p505o0o00oOO;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O00o00 implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = PurchaseSkillCardActivity.f26522OooOoO;
        Context context = o000O00O.f13421OooO00o;
        Activity context2 = OooO0O0.OooO0O0();
        PremiumLevel level = PremiumLevel.Premium1;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(level, "level");
        Intent intent = new Intent(context2, (Class<?>) PremiumActivity.class);
        intent.putExtra("VipLevel", level.getValue());
        context2.startActivity(intent);
        return null;
    }
}
