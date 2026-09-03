package p544o0o0OoOO;

import android.content.Intent;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class h7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f44247Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(VoteGameCreateActivity voteGameCreateActivity) {
        super(0);
        this.f44247Oooo0o = voteGameCreateActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VoteHistoryActivity.OooO00o oooO00o = VoteHistoryActivity.f23083Oooooo;
        VoteGameCreateActivity context = this.f44247Oooo0o;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) VoteHistoryActivity.class));
        return Unit.INSTANCE;
    }
}
