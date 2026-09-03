package p501o0o00o;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p143o00OOooo.o00O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41495Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o000 o000Var) {
        super(1);
        this.f41495Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O00000.OooO0OO("InRoom_gift_award");
        MutableLiveData<String> firstChargeRewardUrl = SharedUrlManager.INSTANCE.getFirstChargeRewardUrl();
        o000 o000Var = this.f41495Oooo0o;
        firstChargeRewardUrl.observe(o000Var.f41395OooO0oO, new o00O0(o000Var, 1));
        return Unit.INSTANCE;
    }
}
