package p536o0o0OOoo;

import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f43758Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AtFriendsActivity atFriendsActivity) {
        super(1);
        this.f43758Oooo0o = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        AtFriendsActivity atFriendsActivity = this.f43758Oooo0o;
        int i = AtFriendsActivity.f22128ooOO;
        atFriendsActivity.Oooo000(it);
        return Unit.INSTANCE;
    }
}
