package p580o0oOoOoo;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.AboutActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f56562OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OO0(Context context) {
        super(0);
        this.f56562OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f56562OooO0Oo;
        context.startActivity(new Intent(context, (Class<?>) AboutActivity.class));
        return Unit.INSTANCE;
    }
}
