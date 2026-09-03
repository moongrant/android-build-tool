package p494o0o00OOo;

import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f49609OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(o0OoOo0 o0oooo1) {
        super(1);
        this.f49609OooO0Oo = o0oooo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            o0OO00O o0oo00o2 = o00000OO.f56401OooO0Oo;
            if (o0oo00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
                o0oo00o2 = null;
            }
            o0OO00O o0oo00o3 = o0oo00o2;
            o0OoOo0 o0oooo1 = this.f49609OooO0Oo;
            MomentSendActivity momentSendActivity = o0oooo1.f49590OooO00o;
            int i = o0oooo1.f49597OooO0oo;
            o0oo00o3.OooO00o(o000oOoO.f49574OooO00o, o000oOoO.f49575OooO0O0, momentSendActivity, i <= 9, o0oooo1.f49596OooO0oO <= 0 && i <= 0);
        }
        return Unit.INSTANCE;
    }
}
