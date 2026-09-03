package p509o0o00ooO;

import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChatModel f50701OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(ChatModel chatModel) {
        super(0);
        this.f50701OooO0Oo = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f50701OooO0Oo.getMemberBadgeActivate()) {
            OooO00o.OooO0O0("102050");
        } else {
            OooO00o.OooO0O0("102051");
        }
        if (OooO0O0.f24533OoooOOO.OooO00o().OooOO0O()) {
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48519OooO00o.setValue(Boolean.TRUE);
        } else {
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48544OooOoOO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
