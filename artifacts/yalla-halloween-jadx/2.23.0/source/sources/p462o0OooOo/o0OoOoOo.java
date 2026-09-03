package p462o0OooOo;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.android.ylpopupwindow.utils.ViewBindingCreateUtils$sequenceFilterMap$1", f = "ViewBindingCreateUtils.kt", i = {0, 0}, l = {32}, m = "invokeSuspend", n = {"$this$sequence", "thisClass"}, s = {"L$0", "L$1"})
public final class o0OoOoOo extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Type>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Class f46662OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f46663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46664OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f46665OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(Object obj, Continuation<? super o0OoOoOo> continuation) {
        super(2, continuation);
        this.f46665OooO0oO = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OoOoOo o0oooooo = new o0OoOoOo(this.f46665OooO0oO, continuation);
        o0oooooo.f46663OooO0o = obj;
        return o0oooooo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Type> sequenceScope, Continuation<? super Unit> continuation) {
        return ((o0OoOoOo) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0040
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f46664OooO0o0
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Class r1 = r5.f46662OooO0Oo
            java.lang.Object r3 = r5.f46663OooO0o
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            goto L41
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.f46663OooO0o
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            java.lang.Object r1 = r5.f46665OooO0oO
            java.lang.Class r1 = r1.getClass()
            r3 = r6
            r6 = r5
        L2d:
            java.lang.reflect.Type r4 = r1.getGenericSuperclass()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r6.f46663OooO0o = r3
            r6.f46662OooO0Oo = r1
            r6.f46664OooO0o0 = r2
            java.lang.Object r4 = r3.yield(r4, r6)
            if (r4 != r0) goto L41
            return r0
        L41:
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 != 0) goto L2d
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p462o0OooOo.o0OoOoOo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
