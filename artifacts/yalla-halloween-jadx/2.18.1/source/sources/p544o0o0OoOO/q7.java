package p544o0o0OoOO;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p649o0ooOOoo.vf;

/* JADX INFO: loaded from: classes2.dex */
public final class q7 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ vf f44300Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ VoteGameCreateActivity f44301Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oo0oOO0 f44302Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(vf vfVar, VoteGameCreateActivity voteGameCreateActivity, oo0oOO0 oo0ooo0) {
        super(0);
        this.f44300Oooo0o = vfVar;
        this.f44301Oooo0oO = voteGameCreateActivity;
        this.f44302Oooo0oo = oo0ooo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string = StringsKt.trim((CharSequence) this.f44300Oooo0o.f50817OooO0O0.getText().toString()).toString();
        if (string.length() == 0) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.room_vote_game_title_is_empty));
        } else {
            VoteGameCreateActivity voteGameCreateActivity = this.f44301Oooo0oO;
            VoteGameCreateActivity.OooO00o oooO00o = VoteGameCreateActivity.f23073OooooOo;
            voteGameCreateActivity.OooOoo().f51027OooO.setText(string);
            this.f44302Oooo0oo.OooO0Oo();
        }
        return Unit.INSTANCE;
    }
}
