package p436o0OoOOo;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f47081OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o000O o000o) {
        super(0);
        this.f47081OooO0Oo = o000o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = YallaTeamMessageActivity.f25319OooOoo0;
        Context context = this.f47081OooO0Oo.f38487OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
        return Unit.INSTANCE;
    }
}
