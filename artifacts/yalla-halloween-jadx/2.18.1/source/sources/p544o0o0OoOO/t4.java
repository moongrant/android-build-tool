package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.MemberListConveneActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class t4 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f44314Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(MemberListConveneActivity memberListConveneActivity) {
        super(1);
        this.f44314Oooo0o = memberListConveneActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String content = str;
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.length() == 0) {
            MemberListConveneActivity memberListConveneActivity = this.f44314Oooo0o;
            memberListConveneActivity.f22870Ooooooo = "";
            memberListConveneActivity.OooOooo().f50310OooO0o0.setClearVisibility(8);
            this.f44314Oooo0o.Oooo00o(content, true);
        } else {
            MemberListConveneActivity memberListConveneActivity2 = this.f44314Oooo0o;
            int i = MemberListConveneActivity.f22860o0OoOo0;
            memberListConveneActivity2.OooOooo().f50310OooO0o0.setClearVisibility(0);
            this.f44314Oooo0o.Oooo00o(content, true);
        }
        return Unit.INSTANCE;
    }
}
