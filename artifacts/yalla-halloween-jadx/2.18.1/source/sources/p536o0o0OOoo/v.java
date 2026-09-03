package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43878Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f43878Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        PrivateChatActivity.OooOoo(this.f43878Oooo0o, bool.booleanValue());
        return Unit.INSTANCE;
    }
}
