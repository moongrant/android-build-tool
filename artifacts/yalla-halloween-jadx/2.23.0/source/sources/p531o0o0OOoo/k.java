package p531o0o0OOoo;

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
import p577o0oOoOoO.oOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO00 f54514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Job> f54515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f54516OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(oOO00 ooo00, CoroutineScope coroutineScope, MutableState<Job> mutableState) {
        super(1);
        this.f54514OooO0Oo = ooo00;
        this.f54516OooO0o0 = coroutineScope;
        this.f54515OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        oOO00 ooo00 = this.f54514OooO0Oo;
        ooo00.getClass();
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        ooo00.f56339OooO00o.setValue(it);
        if (!StringsKt.isBlank(it)) {
            MutableState<Job> mutableState = this.f54515OooO0o;
            Job value = mutableState.getValue();
            if (value != null) {
                Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
            }
            mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.f54516OooO0o0, null, null, new j(ooo00, null), 3, null));
        }
        return Unit.INSTANCE;
    }
}
