package com.common.support.roomgiftplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yy.yyeva.util.ScaleType;
import com.yy.yyeva.view.EvaAnimViewV3;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u0018\u0010#\u001a\u00020$*\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020$H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/common/support/roomgiftplayer/view/YYEvaVideoView;", "Lcom/yy/yyeva/view/EvaAnimViewV3;", "Lcom/common/support/roomgiftplayer/view/inter/IRoomGiftVideoView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "playJob", "Lkotlinx/coroutines/Job;", "createGiftInfo", "", "giftPlayReplaceInfo", "Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo;", "(Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getView", "Landroid/view/View;", "init", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "play", "", "localFile", "Ljava/io/File;", "videoModel", "Lcom/common/support/roomgiftplayer/VideoModel;", "(Ljava/io/File;Lcom/common/support/roomgiftplayer/VideoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "reset", "showVisible", "visible", "safeToString", "", NewFriendsOld.State_Default, "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nYYEvaVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YYEvaVideoView.kt\ncom/common/support/roomgiftplayer/view/YYEvaVideoView\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,210:1\n314#2,11:211\n*S KotlinDebug\n*F\n+ 1 YYEvaVideoView.kt\ncom/common/support/roomgiftplayer/view/YYEvaVideoView\n*L\n64#1:211,11\n*E\n"})
public final class YYEvaVideoView extends EvaAnimViewV3 implements IRoomGiftVideoView {
    public static final int $stable = 8;
    private CoroutineScope coroutineScope;

    @Nullable
    private Job playJob;

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.view.YYEvaVideoView$createGiftInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.view.YYEvaVideoView$createGiftInfo$2", f = "YYEvaVideoView.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nYYEvaVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YYEvaVideoView.kt\ncom/common/support/roomgiftplayer/view/YYEvaVideoView$createGiftInfo$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1855#2,2:211\n*S KotlinDebug\n*F\n+ 1 YYEvaVideoView.kt\ncom/common/support/roomgiftplayer/view/YYEvaVideoView$createGiftInfo$2\n*L\n174#1:211,2\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GiftPlayReplaceInfo $giftPlayReplaceInfo;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ YYEvaVideoView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GiftPlayReplaceInfo giftPlayReplaceInfo, YYEvaVideoView yYEvaVideoView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$giftPlayReplaceInfo = giftPlayReplaceInfo;
            this.this$0 = yYEvaVideoView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$giftPlayReplaceInfo, this.this$0, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x0077 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0078 -> B:15:0x007f). Please report as a decompilation issue!!! */
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
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.L$2
                com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$GiftPlayReplaceSingleInfo r1 = (com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo) r1
                java.lang.Object r3 = r11.L$1
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r11.L$0
                com.common.support.roomgiftplayer.view.YYEvaVideoView r4 = (com.common.support.roomgiftplayer.view.YYEvaVideoView) r4
                kotlin.ResultKt.throwOnFailure(r12)
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L7f
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                kotlin.ResultKt.throwOnFailure(r12)
                com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo r12 = r11.$giftPlayReplaceInfo
                java.util.ArrayList r12 = r12.getReplaceImageInfoList()
                com.common.support.roomgiftplayer.view.YYEvaVideoView r1 = r11.this$0
                java.util.Iterator r12 = r12.iterator()
                r3 = r12
                r4 = r1
                r12 = r11
            L3a:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L89
                java.lang.Object r1 = r3.next()
                com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$GiftPlayReplaceSingleInfo r1 = (com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo) r1
                android.content.Context r5 = r4.getContext()
                java.lang.String r6 = "getContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                java.lang.String r6 = r1.getContent()
                r7 = 0
                java.lang.String r6 = com.common.support.roomgiftplayer.view.YYEvaVideoView.safeToString$default(r4, r6, r7, r2, r7)
                java.lang.String r6 = p403o0Oo0OO.OooO0OO.OooO00o(r6)
                java.lang.String r6 = p184o00o00O0.OooO0OO.OooO0o0(r6)
                r12.L$0 = r4
                r12.L$1 = r3
                r12.L$2 = r1
                r12.label = r2
                kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
                o0OOo0Oo.Oooo0 r9 = new o0OOo0Oo.Oooo0
                r9.<init>(r5, r6, r7)
                java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r8, r9, r12)
                if (r5 != r0) goto L78
                return r0
            L78:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L7f:
                android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
                r3.setBitmap(r12)
                r12 = r0
                r0 = r1
                r3 = r4
                r4 = r5
                goto L3a
            L89:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.common.support.roomgiftplayer.view.YYEvaVideoView.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YYEvaVideoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createGiftInfo(GiftPlayReplaceInfo giftPlayReplaceInfo, Continuation<? super Unit> continuation) {
        Object objOooO0Oo = OooOOO.OooO0Oo(new AnonymousClass2(giftPlayReplaceInfo, this, null), continuation);
        return objOooO0Oo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0Oo : Unit.INSTANCE;
    }

    private final String safeToString(String str, String str2) {
        return str == null || str.length() == 0 ? str2 : str;
    }

    public static /* synthetic */ String safeToString$default(YYEvaVideoView yYEvaVideoView, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return yYEvaVideoView.safeToString(str, str2);
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public void init(@NotNull AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.coroutineScope = LifecycleOwnerKt.getLifecycleScope(activity);
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @Nullable
    public Object play(@NotNull File file, @NotNull VideoModel videoModel, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        CoroutineScope coroutineScope;
        RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
        roomGiftVideoPlayDownloadManager.log("YYEvaVideoView playVideo  " + file + "  " + this.playJob);
        if (this.playJob != null) {
            return Boxing.boxBoolean(false);
        }
        Object obj = videoModel.getObj();
        GiftPlayReplaceInfo giftPlayReplaceInfo = obj instanceof GiftPlayReplaceInfo ? (GiftPlayReplaceInfo) obj : null;
        roomGiftVideoPlayDownloadManager.log("effectGiftModel:  " + giftPlayReplaceInfo);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CoroutineScope coroutineScope2 = this.coroutineScope;
        if (coroutineScope2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        } else {
            coroutineScope = coroutineScope2;
        }
        this.playJob = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new YYEvaVideoView$play$2$1(file, this, cancellableContinuationImpl, giftPlayReplaceInfo, videoModel, null), 2, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public void release() {
        reset();
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public void reset() {
        RoomGiftVideoPlayDownloadManager.INSTANCE.log("YYEvaVideoView reset");
        stopPlay();
        Job job = this.playJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.playJob = null;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public void showVisible(boolean visible) {
        if (visible) {
            o000O.OooOOOO(this);
        } else {
            o000O.OooO0O0(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YYEvaVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ YYEvaVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YYEvaVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setScaleType(ScaleType.CENTER_CROP);
    }
}
