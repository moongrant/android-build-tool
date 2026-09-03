package p496o0o00o;

import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f49052OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(SupportTopActivity supportTopActivity) {
        super(0);
        this.f49052OooO0Oo = supportTopActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO00O o0oo00o2 = new o0OO00O(this.f49052OooO0Oo);
        o0oo00o2.OooOoO0(oO00OOo0.user_support_top_tag);
        o0oo00o2.OooOOoo(oO00OOo0.user_support_top_dialog_content);
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
