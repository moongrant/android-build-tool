package p488o0o00O0o;

import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f48421OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o0OO00O o0oo00o2) {
        super(1);
        this.f48421OooO0Oo = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            o00000OO o00000oo2 = o0000OO0.f56185OooO0Oo;
            if (o00000oo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                o00000oo2 = null;
            }
            o00000OO o00000oo3 = o00000oo2;
            o0OO00O o0oo00o2 = this.f48421OooO0Oo;
            MomentSendActivity momentSendActivity = o0oo00o2.f48448OooO00o;
            int i = o0oo00o2.f48455OooO0oo;
            o00000oo3.OooO0o(o0OOO0o.f48462OooO00o, o0OOO0o.f48463OooO0O0, momentSendActivity, i <= 9, o0oo00o2.f48454OooO0oO <= 0 && i <= 0);
        }
        return Unit.INSTANCE;
    }
}
