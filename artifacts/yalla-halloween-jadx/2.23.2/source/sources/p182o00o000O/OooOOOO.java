package p182o00o000O;

import android.net.Uri;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager$uploadFile$2", f = "CloudFileManager.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OooO0o>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f38431OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f38432OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O<Object> f38433OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Uri f38434OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f38435OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f38436OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Boolean f38437OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(Uri uri, OooOO0O<Object> oooOO0O, Object obj, Long l, boolean z, Boolean bool, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f38434OooO0o0 = uri;
        this.f38433OooO0o = oooOO0O;
        this.f38435OooO0oO = obj;
        this.f38436OooO0oo = l;
        this.f38431OooO = z;
        this.f38437OooOO0 = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(this.f38434OooO0o0, this.f38433OooO0o, this.f38435OooO0oO, this.f38436OooO0oo, this.f38431OooO, this.f38437OooOO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OooO0o> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f38432OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            File fileOooO00o = OooO0o.OooO00o(this.f38434OooO0o0);
            if (fileOooO00o == null) {
                return null;
            }
            OooOO0O<Object> oooOO0O = this.f38433OooO0o;
            Object obj2 = this.f38435OooO0oO;
            Long l = this.f38436OooO0oo;
            boolean z = this.f38431OooO;
            Boolean bool = this.f38437OooOO0;
            this.f38432OooO0Oo = 1;
            obj = oooOO0O.OooO0OO(obj2, fileOooO00o, l, z, bool, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
