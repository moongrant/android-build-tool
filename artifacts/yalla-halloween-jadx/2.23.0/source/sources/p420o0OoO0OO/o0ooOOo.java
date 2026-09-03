package p420o0OoO0OO;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import kotlin.BuilderInference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nApiCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,69:1\n109#2:70\n109#2:71\n109#2:72\n*S KotlinDebug\n*F\n+ 1 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n*L\n24#1:70\n29#1:71\n34#1:72\n*E\n"})
public final class o0ooOOo {

    @DebugMetadata(c = "com.yalla.yalla.http.ApiCallKt$jobLiveData$1$1", f = "ApiCall.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45555OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OO00O<T> f45556OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<o0OO00O<T>, Continuation<? super Unit>, Object> f45557OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super o0OO00O<T>, ? super Continuation<? super Unit>, ? extends Object> function2, o0OO00O<T> o0oo00o2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45557OooO0o0 = function2;
            this.f45556OooO0o = o0oo00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45557OooO0o0, this.f45556OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45555OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f45555OooO0Oo = 1;
                if (this.f45557OooO0o0.invoke(this.f45556OooO0o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.http.ApiCallKt$jobLiveData$2$1", f = "ApiCall.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OO00O<T> f45559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<o0OO00O<T>, Continuation<? super Unit>, Object> f45560OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function2<? super o0OO00O<T>, ? super Continuation<? super Unit>, ? extends Object> function2, o0OO00O<T> o0oo00o2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f45560OooO0o0 = function2;
            this.f45559OooO0o = o0oo00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f45560OooO0o0, this.f45559OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45558OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f45558OooO0Oo = 1;
                if (this.f45560OooO0o0.invoke(this.f45559OooO0o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> o0OO00O<T> OooO00o(@NotNull ViewModel viewModel, @BuilderInference @NotNull Function2<? super o0OO00O<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(viewModel, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        o0OO00O<T> o0oo00o2 = new o0OO00O<>();
        o0oo00o2.f45552OooO00o = OooOOO.OooO0O0(ViewModelKt.getViewModelScope(viewModel), new OooO00o(block, o0oo00o2, null));
        return o0oo00o2;
    }

    @NotNull
    public static final <T> o0OO00O<T> OooO0O0(@NotNull CoroutineScope coroutineScope, @BuilderInference @NotNull Function2<? super o0OO00O<T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(block, "block");
        o0OO00O<T> o0oo00o2 = new o0OO00O<>();
        o0oo00o2.f45552OooO00o = OooOOO.OooO0O0(coroutineScope, new OooO0O0(block, o0oo00o2, null));
        return o0oo00o2;
    }
}
