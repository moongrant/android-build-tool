package Oooo0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends Lambda implements Function1<p100o000oOoO.o00OOOO0, p100o000oOoO.o0o0Oo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f585Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f586Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f587Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<p026Oooo0OO.o0000> f588Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(boolean z, CoroutineScope coroutineScope, o0O00OO<p026Oooo0OO.o0000> o0o00oo2, p026Oooo0OO.o000 o000Var) {
        super(1);
        this.f586Oooo0o = z;
        this.f587Oooo0oO = coroutineScope;
        this.f588Oooo0oo = o0o00oo2;
        this.f585Oooo = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final p100o000oOoO.o0o0Oo invoke(p100o000oOoO.o00OOOO0 o00oooo1) {
        p100o000oOoO.o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (!this.f586Oooo0o) {
            BuildersKt__Builders_commonKt.launch$default(this.f587Oooo0oO, null, null, new o0000O0(this.f588Oooo0oo, this.f585Oooo, null), 3, null);
        }
        return new o0000O0O();
    }
}
