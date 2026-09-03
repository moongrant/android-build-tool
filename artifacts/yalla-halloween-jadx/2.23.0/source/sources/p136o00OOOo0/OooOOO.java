package p136o00OOOo0;

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
import p139o00OOooO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager$uploadFile$2", f = "CloudFileManager.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f37376OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37377OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0<Object> f37378OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Uri f37379OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37380OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Long f37381OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Boolean f37382OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Uri uri, OooOO0<Object> oooOO1, Object obj, Long l, boolean z, Boolean bool, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f37379OooO0o0 = uri;
        this.f37378OooO0o = oooOO1;
        this.f37380OooO0oO = obj;
        this.f37381OooO0oo = l;
        this.f37376OooO = z;
        this.f37382OooOO0 = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO(this.f37379OooO0o0, this.f37378OooO0o, this.f37380OooO0oO, this.f37381OooO0oo, this.f37376OooO, this.f37382OooOO0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OooO0OO> continuation) {
        return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f37377OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            File fileOooO00o = OooO.OooO00o(this.f37379OooO0o0);
            if (fileOooO00o == null) {
                return null;
            }
            OooOO0<Object> oooOO1 = this.f37378OooO0o;
            Object obj2 = this.f37380OooO0oO;
            Long l = this.f37381OooO0oo;
            boolean z = this.f37376OooO;
            Boolean bool = this.f37382OooOO0;
            this.f37377OooO0Oo = 1;
            obj = oooOO1.OooO0OO(obj2, fileOooO00o, l, z, bool, this);
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
