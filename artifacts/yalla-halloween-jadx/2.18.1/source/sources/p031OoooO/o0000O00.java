package p031OoooO;

import androidx.compose.material.SwipeableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f2668Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f2669Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SwipeableState<Object> f2670Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Unit> f2671Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(Object obj, SwipeableState<Object> swipeableState, Function1<Object, Unit> function1, o0O00OO<Boolean> o0o00oo2) {
        super(1);
        this.f2669Oooo0o = obj;
        this.f2670Oooo0oO = swipeableState;
        this.f2671Oooo0oo = function1;
        this.f2668Oooo = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (!Intrinsics.areEqual(this.f2669Oooo0o, this.f2670Oooo0oO.OooO0o0())) {
            this.f2671Oooo0oo.invoke(this.f2670Oooo0oO.OooO0o0());
            o0O00OO<Boolean> o0o00oo2 = this.f2668Oooo;
            o0o00oo2.setValue(Boolean.valueOf(!o0o00oo2.getValue().booleanValue()));
        }
        return new o0000();
    }
}
