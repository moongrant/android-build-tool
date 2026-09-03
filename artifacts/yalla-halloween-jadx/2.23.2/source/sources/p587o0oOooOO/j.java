package p587o0oOooOO;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends Lambda implements Function1<Context, View> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f56846OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(1);
        this.f56846OooO0Oo = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f56846OooO0Oo;
    }
}
