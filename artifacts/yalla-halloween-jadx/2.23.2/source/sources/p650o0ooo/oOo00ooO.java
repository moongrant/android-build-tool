package p650o0ooo;

import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f59035OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(MainRoomVM mainRoomVM) {
        super(0);
        this.f59035OooO0Oo = mainRoomVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0ooOOo o0ooooo = o00000OO.f56398OooO00o;
        if (o0ooooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("account");
            o0ooooo = null;
        }
        o0ooooo.OooO0O0();
        oOo000o0.OooO0o0(this.f59035OooO0Oo);
        return Unit.INSTANCE;
    }
}
