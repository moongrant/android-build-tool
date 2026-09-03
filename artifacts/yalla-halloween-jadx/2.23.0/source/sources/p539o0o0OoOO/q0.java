package p539o0o0OoOO;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends Lambda implements Function1<Context, View> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f55647OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(View view) {
        super(1);
        this.f55647OooO0Oo = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f55647OooO0Oo;
    }
}
