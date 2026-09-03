package p451o0Ooo000;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f46434OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Context context) {
        super(0);
        this.f46434OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f46434OooO0Oo;
        context.startActivity(new Intent(context, (Class<?>) PrivacyActivity.class));
        return Unit.INSTANCE;
    }
}
