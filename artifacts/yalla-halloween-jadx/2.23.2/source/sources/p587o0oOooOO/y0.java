package p587o0oOooOO;

import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.yalla.yalla.ui.view.RoomGiftSVGAView;
import io.agora.rtc.Constants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.RoomGiftSVGAView$createGiftInfo$2", f = "RoomGiftSVGAView.kt", i = {}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomGiftSVGAView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftSVGAView.kt\ncom/yalla/yalla/ui/view/RoomGiftSVGAView$createGiftInfo$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1855#2,2:159\n*S KotlinDebug\n*F\n+ 1 RoomGiftSVGAView.kt\ncom/yalla/yalla/ui/view/RoomGiftSVGAView$createGiftInfo$2\n*L\n129#1:159,2\n*E\n"})
public final class y0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ RoomGiftSVGAView f57020OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public RoomGiftSVGAView f57021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo f57022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Iterator f57023OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57024OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ GiftPlayReplaceInfo f57025OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(GiftPlayReplaceInfo giftPlayReplaceInfo, RoomGiftSVGAView roomGiftSVGAView, Continuation<? super y0> continuation) {
        super(2, continuation);
        this.f57025OooO0oo = giftPlayReplaceInfo;
        this.f57020OooO = roomGiftSVGAView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new y0(this.f57025OooO0oo, this.f57020OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((y0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0072 -> B:15:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f57024OooO0oO
            r2 = 1
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$GiftPlayReplaceSingleInfo r1 = r11.f57022OooO0o
            java.util.Iterator r3 = r11.f57023OooO0o0
            com.yalla.yalla.ui.view.RoomGiftSVGAView r4 = r11.f57021OooO0Oo
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r11
            goto L79
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            kotlin.ResultKt.throwOnFailure(r12)
            com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo r12 = r11.f57025OooO0oo
            java.util.ArrayList r12 = r12.getReplaceImageInfoList()
            java.util.Iterator r12 = r12.iterator()
            com.yalla.yalla.ui.view.RoomGiftSVGAView r1 = r11.f57020OooO
            r3 = r12
            r4 = r1
            r12 = r11
        L34:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r3.next()
            com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$GiftPlayReplaceSingleInfo r1 = (com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo) r1
            android.content.Context r5 = r4.getContext()
            java.lang.String r6 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = r1.getContent()
            java.lang.String r6 = com.code.android.util.o0OoOo0.OooOOo0(r6)
            java.lang.String r6 = p403o0Oo0OO.OooO0OO.OooO00o(r6)
            java.lang.String r6 = p184o00o00O0.OooO0OO.OooO0o0(r6)
            r12.f57021OooO0Oo = r4
            r12.f57023OooO0o0 = r3
            r12.f57022OooO0o = r1
            r12.f57024OooO0oO = r2
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            o0OOo0Oo.Oooo0 r8 = new o0OOo0Oo.Oooo0
            r9 = 0
            r8.<init>(r5, r6, r9)
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r7, r8, r12)
            if (r5 != r0) goto L72
            return r0
        L72:
            r10 = r0
            r0 = r12
            r12 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r10
        L79:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            r3.setBitmap(r12)
            r12 = r0
            r0 = r1
            r3 = r4
            r4 = r5
            goto L34
        L83:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p587o0oOooOO.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
