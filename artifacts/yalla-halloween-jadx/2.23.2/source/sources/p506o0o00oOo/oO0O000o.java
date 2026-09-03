package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f50475OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000o(SupportTopActivity supportTopActivity) {
        super(0);
        this.f50475OooO0Oo = supportTopActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000O o000o = new o000O(this.f50475OooO0Oo);
        o000o.OooOoO0(o000000.user_support_top_tag);
        o000o.OooOOoo(o000000.user_support_top_dialog_content);
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
