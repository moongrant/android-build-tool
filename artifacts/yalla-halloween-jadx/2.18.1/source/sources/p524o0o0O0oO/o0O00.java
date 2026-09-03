package p524o0o0O0oO;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p143o00OOooo.o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f43017Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(o0O0000O o0o0000o2) {
        super(1);
        this.f43017Oooo0o = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        MutableLiveData<String> firstChargeRewardUrl = SharedUrlManager.INSTANCE.getFirstChargeRewardUrl();
        o0O0000O o0o0000o2 = this.f43017Oooo0o;
        firstChargeRewardUrl.observe(o0o0000o2.f43021OooO0Oo, new o00O(o0o0000o2, 1));
        return Unit.INSTANCE;
    }
}
