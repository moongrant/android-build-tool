package p563o0oOo0;

import android.view.View;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f45047Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(PrivateChatAdapter privateChatAdapter) {
        super(1);
        this.f45047Oooo0o = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        PackManager.INSTANCE.goToAppStore(this.f45047Oooo0o.f23638OooOOo0);
        return Unit.INSTANCE;
    }
}
