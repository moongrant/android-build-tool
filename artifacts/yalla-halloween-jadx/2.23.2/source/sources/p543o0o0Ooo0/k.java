package p543o0o0Ooo0;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55456OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FragmentActivity fragmentActivity) {
        super(0);
        this.f55456OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("105021");
        int i = ChangeRegionActivity.f24923OooOoO0;
        FragmentActivity context = this.f55456OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) ChangeRegionActivity.class));
        return Unit.INSTANCE;
    }
}
