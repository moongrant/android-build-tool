package p544o0o0OoOO;

import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f44328Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(MemberListConveneActivity memberListConveneActivity) {
        super(0);
        this.f44328Oooo0o = memberListConveneActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MemberListConveneActivity memberListConveneActivity = this.f44328Oooo0o;
        int i = MemberListConveneActivity.f22860o0OoOo0;
        oo0oOO0 oo0ooo0 = new oo0oOO0(memberListConveneActivity);
        oo0ooo0.OooOoo(R.string.room_member_convene_dialog_title);
        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.room_member_convene_dialog_info1) + '\n' + o000O0O0.OooO0OO(R.string.room_member_convene_dialog_info2));
        oo0ooo0.OooOOO0();
        return Unit.INSTANCE;
    }
}
