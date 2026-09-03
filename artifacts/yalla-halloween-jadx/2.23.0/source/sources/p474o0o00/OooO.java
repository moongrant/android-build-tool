package p474o0o00;

import com.yalla.yalla.model.TrustedDevice;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function1<List<TrustedDevice>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AccountProtectionActivity f47209OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(AccountProtectionActivity accountProtectionActivity) {
        super(1);
        this.f47209OooO0Oo = accountProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<TrustedDevice> list) {
        List<TrustedDevice> list2 = list;
        OooOo00 oooOo00 = this.f47209OooO0Oo.f25148OooOo0;
        if (oooOo00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooOo00 = null;
        }
        oooOo00.OooOoO0(list2);
        return Unit.INSTANCE;
    }
}
