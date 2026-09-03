package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00Ooo implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f61158OooO00o;

    public o00Ooo(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f61158OooO00o = cancellableContinuationImpl;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        this.f61158OooO00o.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull o0000O0O<Object> o0000o0o2) {
        boolean zOooO0oO = o0000o0o2.f61108OooO00o.OooO0oO();
        CancellableContinuation cancellableContinuation = this.f61158OooO00o;
        if (!zOooO0oO) {
            HttpException httpException = new HttpException(o0000o0o2);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(httpException)));
            return;
        }
        Object obj = o0000o0o2.f61109OooO0O0;
        if (obj != null) {
            cancellableContinuation.resumeWith(Result.m4213constructorimpl(obj));
            return;
        }
        o00OOOOo o00oooooOooO00o = oooO0O0.OooO00o();
        o00oooooOooO00o.getClass();
        Intrinsics.checkNotNullParameter(o0OoOo0.class, "type");
        Object objCast = o0OoOo0.class.cast(o00oooooOooO00o.f57318OooO0o0.get(o0OoOo0.class));
        if (objCast == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(objCast, "call.request().tag(Invocation::class.java)!!");
        Method method = ((o0OoOo0) objCast).f61182OooO00o;
        StringBuilder sb = new StringBuilder("Response from ");
        Intrinsics.checkExpressionValueIsNotNull(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
        Result.Companion companion2 = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
    }
}
