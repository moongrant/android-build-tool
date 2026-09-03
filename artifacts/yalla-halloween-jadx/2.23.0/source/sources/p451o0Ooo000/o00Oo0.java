package p451o0Ooo000;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f46435OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Context context) {
        super(0);
        this.f46435OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f46435OooO0Oo;
        context.startActivity(new Intent(context, (Class<?>) BlackListActivity.class));
        return Unit.INSTANCE;
    }
}
