package p519o0o0O0oO;

import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$showWinningInfo$1", f = "TreasureBoxOpenDialog.kt", i = {0}, l = {97}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
public final class k4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f52406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxOpenDialog f52407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f52408OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog$showWinningInfo$1$1", f = "TreasureBoxOpenDialog.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52409OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f52409OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f52409OooO0Oo = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(TreasureBoxOpenDialog treasureBoxOpenDialog, Continuation<? super k4> continuation) {
        super(2, continuation);
        this.f52407OooO0o = treasureBoxOpenDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k4(this.f52407OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0055 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:14:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f52408OooO0o0
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            int r1 = r7.f52406OooO0Oo
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L56
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = 3
            r1 = r8
            r8 = r7
        L21:
            com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog r4 = r8.f52407OooO0o
            if (r2 >= r1) goto L58
            o0ooOOOO.f8 r4 = r4.f27973OooOO0o
            android.widget.TextView r4 = r4.f57932OooOO0
            int r5 = p584o0oOooO0.oO00OOo0.room_vote_game_second
            java.lang.String r5 = com.code.android.util.o0000.OooO0OO(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.setText(r5)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getDefault()
            o0o0O0oO.k4$OooO00o r5 = new o0o0O0oO.k4$OooO00o
            r6 = 0
            r5.<init>(r6)
            r8.f52406OooO0Oo = r1
            r8.f52408OooO0o0 = r3
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r8)
            if (r4 != r0) goto L56
            return r0
        L56:
            int r1 = r1 + r2
            goto L21
        L58:
            r4.OooO0O0()
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p519o0o0O0oO.k4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
