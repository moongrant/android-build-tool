package p525o0o0OOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p382o0OOoo0o.o0OoOo0;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f53543OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f53544OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(boolean z, boolean z2) {
        super(1);
        this.f53543OooO0Oo = z;
        this.f53544OooO0o0 = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int i;
        bool.booleanValue();
        if (this.f53543OooO0Oo) {
            i = this.f53544OooO0o0 ? 2 : 1;
        } else {
            i = 0;
        }
        o00Oo0.OooO0O0().OooOO0O(i);
        o0OoOo0.f44303OooO0Oo.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
