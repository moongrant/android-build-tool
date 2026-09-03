package retrofit2;

import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 implements OooO0o<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation f53761OooO00o;

    public Oooo0(CancellableContinuation cancellableContinuation) {
        this.f53761OooO00o = cancellableContinuation;
    }

    @Override // retrofit2.OooO0o
    public final void OooO00o(@NotNull Throwable th) {
        CancellableContinuation cancellableContinuation = this.f53761OooO00o;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(@NotNull OooO0O0<Object> oooO0O0, @NotNull oo0o0Oo<Object> oo0o0oo) {
        if (!oo0o0oo.OooO00o()) {
            CancellableContinuation cancellableContinuation = this.f53761OooO00o;
            HttpException httpException = new HttpException(oo0o0oo);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(httpException)));
            return;
        }
        Object obj = oo0o0oo.f53907OooO0O0;
        if (obj != null) {
            CancellableContinuation cancellableContinuation2 = this.f53761OooO00o;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(obj));
            return;
        }
        o00OOO00 o00ooo00OooO00o = oooO0O0.OooO00o();
        Objects.requireNonNull(o00ooo00OooO00o);
        Intrinsics.checkNotNullParameter(OooOo.class, "type");
        Object objCast = OooOo.class.cast(o00ooo00OooO00o.f51428OooO0o.get(OooOo.class));
        if (objCast == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(objCast, "call.request().tag(Invocation::class.java)!!");
        Method method = ((OooOo) objCast).f53753OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("Response from ");
        Intrinsics.checkExpressionValueIsNotNull(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
        CancellableContinuation cancellableContinuation3 = this.f53761OooO00o;
        Result.Companion companion3 = Result.INSTANCE;
        cancellableContinuation3.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
    }
}
