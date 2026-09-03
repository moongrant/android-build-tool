package p451o0Ooo000;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f46440OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(Context context) {
        super(0);
        this.f46440OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f46440OooO0Oo;
        context.startActivity(new Intent(context, (Class<?>) AboutActivity.class));
        return Unit.INSTANCE;
    }
}
