package p028Oooo0o0;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0O0.o00000O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f2107Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f2108Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(o0OO000 o0oo000, View view) {
        super(1);
        this.f2107Oooo0o = o0oo000;
        this.f2108Oooo0oO = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o0OO000 o0oo000 = this.f2107Oooo0o;
        View view = this.f2108Oooo0oO;
        Objects.requireNonNull(o0oo000);
        Intrinsics.checkNotNullParameter(view, "view");
        if (o0oo000.f2194OooOo00 == 0) {
            oo0oOO0 oo0ooo0 = o0oo000.f2193OooOo0;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO.OooOo0(view, oo0ooo0);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(o0oo000.f2193OooOo0);
            if (Build.VERSION.SDK_INT >= 30) {
                ViewCompat.OooOoOO(view, o0oo000.f2193OooOo0);
            }
        }
        o0oo000.f2194OooOo00++;
        return new o0O0oo00(this.f2107Oooo0o, this.f2108Oooo0oO);
    }
}
