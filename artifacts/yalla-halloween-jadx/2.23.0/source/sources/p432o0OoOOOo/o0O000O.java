package p432o0OoOOOo;

import android.content.Context;
import android.content.Intent;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f45949OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(o0OO00O o0oo00o2) {
        super(0);
        this.f45949OooO0Oo = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = YallaTeamMessageActivity.f25774OooOoo0;
        Context context = this.f45949OooO0Oo.f10133OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
        return Unit.INSTANCE;
    }
}
