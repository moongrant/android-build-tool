package o00OO0O0;

import com.app.base.model.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ChatModel f31467Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(ChatModel chatModel) {
        super(0);
        this.f31467Oooo0o = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f31467Oooo0o.memberBadgeActivate) {
            p606o0oo0O.OooOo.OooO0O0("102050");
        } else {
            p606o0oo0O.OooOo.OooO0O0("102051");
        }
        if (p530o0o0OOO.o00OO00O.f43313OooooOo.OooO00o().OooOOO()) {
            p530o0o0OOO.o00O o00o2 = p530o0o0OOO.o00O.f43140OooO00o;
            p530o0o0OOO.o00O.f43139OooO.setValue(Boolean.TRUE);
        } else {
            p530o0o0OOO.o00O o00o3 = p530o0o0OOO.o00O.f43140OooO00o;
            p530o0o0OOO.o00O.f43168OooOooO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
