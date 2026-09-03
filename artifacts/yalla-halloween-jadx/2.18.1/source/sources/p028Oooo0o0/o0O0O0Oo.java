package p028Oooo0o0;

import androidx.compose.ui.platform.o00O000o;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0Oo extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f2153Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(float f) {
        super(1);
        this.f2153Oooo0o = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o $receiver = o00o000o2;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Objects.requireNonNull($receiver);
        $receiver.f6462OooO0O0.OooO00o("fraction", Float.valueOf(this.f2153Oooo0o));
        return Unit.INSTANCE;
    }
}
