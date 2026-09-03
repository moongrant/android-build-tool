package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends Lambda implements Function1<View, o0OoOo0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00Ooo f2199OooO0Oo = new o00Ooo();

    public o00Ooo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0OoOo0 invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(o00O0O.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof o0OoOo0) {
            return (o0OoOo0) tag;
        }
        return null;
    }
}
