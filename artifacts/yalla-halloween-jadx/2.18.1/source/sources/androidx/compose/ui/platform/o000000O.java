package androidx.compose.ui.platform;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends Lambda implements Function1<p100o000oOoO.o00OOOO0, p100o000oOoO.o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f6399Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00000 f6400Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(Context context, o00000 o00000Var) {
        super(1);
        this.f6399Oooo0o = context;
        this.f6400Oooo0oO = o00000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final p100o000oOoO.o0o0Oo invoke(p100o000oOoO.o00OOOO0 o00oooo1) {
        p100o000oOoO.o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.f6399Oooo0o.getApplicationContext().registerComponentCallbacks(this.f6400Oooo0oO);
        return new o000000(this.f6399Oooo0o, this.f6400Oooo0oO);
    }
}
