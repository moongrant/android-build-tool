package p580o0oOoOoo;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.main.NoticeSettingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f56569OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(Context context) {
        super(0);
        this.f56569OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("105049");
        int i = NoticeSettingActivity.f24974OooOo0;
        Context context = this.f56569OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) NoticeSettingActivity.class));
        return Unit.INSTANCE;
    }
}
