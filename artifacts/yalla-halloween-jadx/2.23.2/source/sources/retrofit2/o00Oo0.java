package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O00O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o00Oo0 implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f60619OooO00o;

    public o00Oo0(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f60619OooO00o = cancellableContinuationImpl;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        Result.Companion companion = Result.INSTANCE;
        this.f60619OooO00o.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull o0000O0<Object> o0000o1) {
        boolean zOooO0oO = o0000o1.f60546OooO00o.OooO0oO();
        CancellableContinuation cancellableContinuation = this.f60619OooO00o;
        if (!zOooO0oO) {
            HttpException httpException = new HttpException(o0000o1);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(httpException)));
            return;
        }
        Object obj = o0000o1.f60547OooO0O0;
        if (obj != null) {
            cancellableContinuation.resumeWith(Result.m4215constructorimpl(obj));
            return;
        }
        o0O00O0o o0o00o0oOooO00o = oooO0O0.OooO00o();
        o0o00o0oOooO00o.getClass();
        Intrinsics.checkNotNullParameter(o000oOoO.class, "type");
        Object objCast = o000oOoO.class.cast(o0o00o0oOooO00o.f57833OooO0o0.get(o000oOoO.class));
        if (objCast == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(objCast, "call.request().tag(Invocation::class.java)!!");
        Method method = ((o000oOoO) objCast).f60616OooO00o;
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
        cancellableContinuation.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
    }
}
