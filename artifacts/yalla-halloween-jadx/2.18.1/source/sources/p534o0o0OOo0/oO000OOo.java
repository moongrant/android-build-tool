package p534o0o0OOo0;

import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f43614Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(UntieAccountBindActivity untieAccountBindActivity) {
        super(0);
        this.f43614Oooo0o = untieAccountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PhoneNumberActivity.f21819OooooOO.OooO00o(this.f43614Oooo0o, null, ClientCodeType.BingingPhone);
        return Unit.INSTANCE;
    }
}
