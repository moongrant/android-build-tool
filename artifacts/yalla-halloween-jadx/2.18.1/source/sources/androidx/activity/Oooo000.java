package androidx.activity;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function1<View, OooOOOO> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final Oooo000 f4332Oooo0o = new Oooo000();

    public Oooo000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final OooOOOO invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(OooOo00.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OooOOOO) {
            return (OooOOOO) tag;
        }
        return null;
    }
}
