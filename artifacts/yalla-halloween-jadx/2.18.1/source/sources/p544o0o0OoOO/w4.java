package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class w4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f44335Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(MemberListConveneActivity memberListConveneActivity) {
        super(0);
        this.f44335Oooo0o = memberListConveneActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MemberListConveneActivity memberListConveneActivity = this.f44335Oooo0o;
        int i = MemberListConveneActivity.f22860o0OoOo0;
        memberListConveneActivity.OooOooo().f50309OooO0o.OooO0oo();
        if (!StringsKt.isBlank(this.f44335Oooo0o.f22870Ooooooo)) {
            MemberListConveneActivity memberListConveneActivity2 = this.f44335Oooo0o;
            memberListConveneActivity2.Oooo00o(memberListConveneActivity2.f22870Ooooooo, true);
        } else {
            this.f44335Oooo0o.Oooo00O(true);
        }
        return Unit.INSTANCE;
    }
}
