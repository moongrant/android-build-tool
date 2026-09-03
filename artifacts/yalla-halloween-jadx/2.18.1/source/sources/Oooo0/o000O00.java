package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import p030Oooo0oo.o0O0O0O;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 extends Lambda implements Function1<p710ooOO.o0000oo, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<androidx.compose.foundation.lazy.layout.o00Ooo> f566Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f567Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f568Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f569Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f570OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<p026Oooo0OO.o0000> f571OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(CoroutineScope coroutineScope, o0O00OO<Boolean> o0o00oo2, o0O0O0O o0o0o0o, o0O00OO<androidx.compose.foundation.lazy.layout.o00Ooo> o0o00oo3, o0O00OO<p026Oooo0OO.o0000> o0o00oo4, p026Oooo0OO.o000 o000Var) {
        super(1);
        this.f567Oooo0o = coroutineScope;
        this.f568Oooo0oO = o0o00oo2;
        this.f569Oooo0oo = o0o0o0o;
        this.f566Oooo = o0o00oo3;
        this.f571OoooO00 = o0o00oo4;
        this.f570OoooO0 = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p710ooOO.o0000oo o0000ooVar) {
        p710ooOO.o0000oo it = o0000ooVar;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f568Oooo0oO.setValue(Boolean.valueOf(it.OooO0O0()));
        if (o000O00O.OooO00o(this.f568Oooo0oO)) {
            BuildersKt__Builders_commonKt.launch$default(this.f567Oooo0o, null, CoroutineStart.UNDISPATCHED, new o000O000(this.f569Oooo0oo, this.f566Oooo, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(this.f567Oooo0o, null, null, new o000O0o(this.f571OoooO00, this.f570OoooO0, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.f567Oooo0o, null, null, new o000Oo0(this.f571OoooO00, this.f570OoooO0, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
