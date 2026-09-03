package p028Oooo0o0;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000O;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0oo00 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f2169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f2170OooO0O0;

    public o0O0oo00(o0OO000 o0oo000, View view) {
        this.f2169OooO00o = o0oo000;
        this.f2170OooO0O0 = view;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o0OO000 o0oo000 = this.f2169OooO00o;
        View view = this.f2170OooO0O0;
        Objects.requireNonNull(o0oo000);
        Intrinsics.checkNotNullParameter(view, "view");
        int i = o0oo000.f2194OooOo00 - 1;
        o0oo000.f2194OooOo00 = i;
        if (i == 0) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO.OooOo0(view, null);
            ViewCompat.OooOoOO(view, null);
            view.removeOnAttachStateChangeListener(o0oo000.f2193OooOo0);
        }
    }
}
