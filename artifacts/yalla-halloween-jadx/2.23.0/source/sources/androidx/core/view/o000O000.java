package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nViewGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,175:1\n55#2,4:176\n*S KotlinDebug\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n*L\n118#1:176,4\n*E\n"})
public final class o000O000 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public /* synthetic */ Object f5423OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewGroup f5424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f5425OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f5426OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f5427OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f5428OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f5429OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(ViewGroup viewGroup, Continuation<? super o000O000> continuation) {
        super(2, continuation);
        this.f5429OooOO0 = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000O000 o000o001 = new o000O000(this.f5429OooOO0, continuation);
        o000o001.f5423OooO = obj;
        return o000o001;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
        return ((o000O000) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0064  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0093 -> B:22:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009c -> B:24:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f5428OooO0oo
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            int r1 = r12.f5427OooO0oO
            int r4 = r12.f5425OooO0o
            android.view.ViewGroup r5 = r12.f5424OooO0Oo
            java.lang.Object r6 = r12.f5423OooO
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L95
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            int r1 = r12.f5427OooO0oO
            int r4 = r12.f5425OooO0o
            android.view.View r5 = r12.f5426OooO0o0
            android.view.ViewGroup r6 = r12.f5424OooO0Oo
            java.lang.Object r7 = r12.f5423OooO
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            goto L6b
        L37:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f5423OooO
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            android.view.ViewGroup r1 = r12.f5429OooOO0
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r12
        L46:
            if (r5 >= r4) goto La5
            android.view.View r7 = r1.getChildAt(r5)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r6.f5423OooO = r13
            r6.f5424OooO0Oo = r1
            r6.f5426OooO0o0 = r7
            r6.f5425OooO0o = r5
            r6.f5427OooO0oO = r4
            r6.f5428OooO0oo = r3
            java.lang.Object r8 = r13.yield(r7, r6)
            if (r8 != r0) goto L64
            return r0
        L64:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L6b:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L9c
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r8)
            androidx.core.view.o000O000 r8 = new androidx.core.view.o000O000
            r9 = 0
            r8.<init>(r5, r9)
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.sequence(r8)
            r13.f5423OooO = r7
            r13.f5424OooO0Oo = r6
            r13.f5426OooO0o0 = r9
            r13.f5425OooO0o = r4
            r13.f5427OooO0oO = r1
            r13.f5428OooO0oo = r2
            java.lang.Object r5 = r7.yieldAll(r5, r13)
            if (r5 != r0) goto L93
            return r0
        L93:
            r5 = r6
            r6 = r7
        L95:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto La0
        L9c:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        La0:
            int r4 = r4 + r3
            r10 = r5
            r5 = r4
            r4 = r10
            goto L46
        La5:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.o000O000.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
