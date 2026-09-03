package p495o0o00Ooo;

import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48949OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48949OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102280");
        o00000OO o00000oo2 = o0000OO0.f56185OooO0Oo;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o00000oo2 = null;
        }
        o00000oo2.OooO0Oo(this.f48949OooO0Oo);
        return Unit.INSTANCE;
    }
}
