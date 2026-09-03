package p546o0o0Ooo0;

import com.app.base.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p162o00OoOOo.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f44417Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f44417Oooo0o = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MixedRoomActivity mixedRoomActivity = this.f44417Oooo0o;
        if (mixedRoomActivity == null) {
            return null;
        }
        oo00oO oo00oo = mixedRoomActivity.f11776o000000;
        if (oo00oo != null) {
            oo00oo.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
