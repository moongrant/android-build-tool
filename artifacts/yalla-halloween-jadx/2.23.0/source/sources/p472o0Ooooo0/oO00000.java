package p472o0Ooooo0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.FriendListSynchronizer$syncFriendList$1", f = "FriendListSynchronizer.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class oO00000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47192OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f47193OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000(boolean z, Continuation<? super oO00000> continuation) {
        super(2, continuation);
        this.f47193OooO0o0 = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00000(this.f47193OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0068 -> B:20:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f47192OooO0Oo
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r9)
            r1 = r0
            r0 = r8
            goto L6c
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r8.f47193OooO0o0
            r3 = 0
            if (r9 == 0) goto L3c
            p472o0Ooooo0.oO00000o.f47195OooO0O0 = r3
            com.yalla.yalla.data.db.YlAppDataBase r9 = p581o0oOoo00.o000OOo.OooO00o()
            o0Oo0OOo.o0O00 r9 = r9.OooOOo()
            o0Oooo.o000000O r1 = p464o0Oooo.o000000O.f46674OooO00o
            java.lang.Object r1 = androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            r9.OooO(r3)
            goto L5c
        L3c:
            com.yalla.yalla.data.db.YlAppDataBase r9 = p581o0oOoo00.o000OOo.OooO00o()
            o0Oo0OOo.o0O00 r9 = r9.OooOOo()
            o0Oooo.o000000O r1 = p464o0Oooo.o000000O.f46674OooO00o
            java.lang.Object r1 = androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()
            java.lang.Number r1 = (java.lang.Number) r1
            long r5 = r1.longValue()
            com.yalla.yalla.data.db.table.Friend r9 = r9.OooO0oO(r5)
            if (r9 == 0) goto L5a
            long r3 = r9.getTime()
        L5a:
            p472o0Ooooo0.oO00000o.f47195OooO0O0 = r3
        L5c:
            r9 = r8
        L5d:
            o0Ooooo0.oO00000o r1 = p472o0Ooooo0.oO00000o.f47194OooO00o
            r9.f47192OooO0Oo = r2
            java.lang.Object r1 = p472o0Ooooo0.oO00000o.OooO00o(r1, r9)
            if (r1 != r0) goto L68
            return r0
        L68:
            r7 = r0
            r0 = r9
            r9 = r1
            r1 = r7
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L95
            boolean r9 = r0.f47193OooO0o0
            if (r9 == 0) goto L8f
            com.yalla.yalla.data.db.YlAppDataBase r9 = p581o0oOoo00.o000OOo.OooO00o()
            o0Oo0OOo.o0O00 r9 = r9.OooOOo()
            o0Oooo.o000000O r0 = p464o0Oooo.o000000O.f46674OooO00o
            java.lang.Object r0 = androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r9.OooO0Oo(r0)
        L8f:
            r9 = 0
            p472o0Ooooo0.oO00000o.f47196OooO0OO = r9
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L95:
            r9 = r0
            r0 = r1
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: p472o0Ooooo0.oO00000.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
