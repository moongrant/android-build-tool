package p044OooooOO;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LiveData<Object> f3998Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f3999Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Object> f4000Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(LiveData<Object> liveData, LifecycleOwner lifecycleOwner, o0O00OO<Object> o0o00oo2) {
        super(1);
        this.f3998Oooo0o = liveData;
        this.f3999Oooo0oO = lifecycleOwner;
        this.f4000Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o00O000 o00o001 = new o00O000(this.f4000Oooo0oo, 0);
        this.f3998Oooo0o.observe(this.f3999Oooo0oO, o00o001);
        return new o00O000o(this.f3998Oooo0o, o00o001);
    }
}
