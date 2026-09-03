package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43759Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(PrivateChatActivity privateChatActivity) {
        super(0);
        this.f43759Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PrivateChatActivity privateChatActivity = this.f43759Oooo0o;
        if (privateChatActivity.f22170Ooooo00) {
            privateChatActivity.Oooo00o().f49091OooO.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }
}
