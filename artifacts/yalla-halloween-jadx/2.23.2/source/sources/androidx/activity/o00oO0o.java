package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function1<View, o00Oo0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00oO0o f2195OooO0Oo = new o00oO0o();

    public o00oO0o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00Oo0 invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(o00Ooo.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof o00Oo0) {
            return (o00Oo0) tag;
        }
        return null;
    }
}
