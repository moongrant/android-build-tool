package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends Lambda implements Function1<View, View> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00Oo0 f2198OooO0Oo = new o00Oo0();

    public o00Oo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
