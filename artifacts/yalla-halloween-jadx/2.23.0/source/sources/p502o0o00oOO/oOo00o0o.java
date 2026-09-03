package p502o0o00oOO;

import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChatModel f49692OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o0o(ChatModel chatModel) {
        super(0);
        this.f49692OooO0Oo = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f49692OooO0Oo.getMemberBadgeActivate()) {
            o0OO000.OooO00o("102050");
        } else {
            o0OO000.OooO00o("102051");
        }
        if (OooO0O0.f24995OoooOOO.OooO00o().OooOO0O()) {
            OooO00o.f24986OooOOOO.f47506OooO00o.setValue(Boolean.TRUE);
        } else {
            OooO00o.f24986OooOOOO.f47531OooOoOO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
