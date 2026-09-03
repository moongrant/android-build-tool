package p539o0o0OoO;

import androidx.compose.runtime.MutableState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p581o0oOoo.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f54545OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Job> f54546OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f54547OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(o0000O0O o0000o0o2, CoroutineScope coroutineScope, MutableState<Job> mutableState) {
        super(1);
        this.f54545OooO0Oo = o0000o0o2;
        this.f54547OooO0o0 = coroutineScope;
        this.f54546OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        o0000O0O o0000o0o2 = this.f54545OooO0Oo;
        o0000o0o2.getClass();
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        o0000o0o2.f56588OooO00o.setValue(it);
        if (!StringsKt.isBlank(it)) {
            MutableState<Job> mutableState = this.f54546OooO0o;
            Job value = mutableState.getValue();
            if (value != null) {
                Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
            }
            mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.f54547OooO0o0, null, null, new oo0oOO0(o0000o0o2, null), 3, null));
        }
        return Unit.INSTANCE;
    }
}
