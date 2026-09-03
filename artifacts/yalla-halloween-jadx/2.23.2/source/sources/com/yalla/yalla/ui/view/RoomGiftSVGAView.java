package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.common.support.roomgiftplayer.VideoModel;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo;
import com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import o0OO0O0O.OooOO0;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p587o0oOooOO.y0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomGiftSVGAView;", "Lcom/code/android/uikit/svga/SVGAView;", "Lcom/common/support/roomgiftplayer/view/inter/IRoomGiftVideoView;", "Landroid/view/View;", "getView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomGiftSVGAView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftSVGAView.kt\ncom/yalla/yalla/ui/view/RoomGiftSVGAView\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,158:1\n314#2,11:159\n*S KotlinDebug\n*F\n+ 1 RoomGiftSVGAView.kt\ncom/yalla/yalla/ui/view/RoomGiftSVGAView\n*L\n59#1:159,11\n*E\n"})
public final class RoomGiftSVGAView extends SVGAView implements IRoomGiftVideoView {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f30037Oooo00o = 0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public LifecycleCoroutineScope f30038Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public Job f30039Oooo00O;

    @DebugMetadata(c = "com.yalla.yalla.ui.view.RoomGiftSVGAView$play$2$1", f = "RoomGiftSVGAView.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomGiftSVGAView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftSVGAView.kt\ncom/yalla/yalla/ui/view/RoomGiftSVGAView$play$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1855#2,2:159\n1855#2,2:161\n*S KotlinDebug\n*F\n+ 1 RoomGiftSVGAView.kt\ncom/yalla/yalla/ui/view/RoomGiftSVGAView$play$2$1\n*L\n68#1:159,2\n72#1:161,2\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Boolean> f30040OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30041OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomGiftSVGAView f30042OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GiftPlayReplaceInfo f30043OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ File f30044OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ VideoModel f30045OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.RoomGiftSVGAView$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.view.RoomGiftSVGAView$play$2$1$1", f = "RoomGiftSVGAView.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0337OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f30046OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ GiftPlayReplaceInfo f30047OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ RoomGiftSVGAView f30048OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0337OooO00o(GiftPlayReplaceInfo giftPlayReplaceInfo, RoomGiftSVGAView roomGiftSVGAView, Continuation continuation) {
                super(2, continuation);
                this.f30048OooO0o0 = roomGiftSVGAView;
                this.f30047OooO0o = giftPlayReplaceInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0337OooO00o(this.f30047OooO0o, this.f30048OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0337OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f30046OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f30046OooO0Oo = 1;
                    int i2 = RoomGiftSVGAView.f30037Oooo00o;
                    RoomGiftSVGAView roomGiftSVGAView = this.f30048OooO0o0;
                    roomGiftSVGAView.getClass();
                    Object objOooO0Oo = OooOOO.OooO0Oo(new y0(this.f30047OooO0o, roomGiftSVGAView, null), this);
                    if (objOooO0Oo != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0Oo = Unit.INSTANCE;
                    }
                    if (objOooO0Oo == coroutine_suspended) {
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

        public static final class OooO0O0 implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooOO0 f30049OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ RoomGiftSVGAView f30050OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ VideoModel f30051OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ CancellableContinuation<Boolean> f30052OooO0Oo;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.view.RoomGiftSVGAView$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C0338OooO00o implements o0OO0O0O.OooO0OO {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ RoomGiftSVGAView f30053OooO00o;

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final /* synthetic */ CancellableContinuation<Boolean> f30054OooO0O0;

                /* JADX WARN: Multi-variable type inference failed */
                public C0338OooO00o(RoomGiftSVGAView roomGiftSVGAView, CancellableContinuation<? super Boolean> cancellableContinuation) {
                    this.f30053OooO00o = roomGiftSVGAView;
                    this.f30054OooO0O0 = cancellableContinuation;
                }

                @Override // o0OO0O0O.OooO0OO
                public final void OooO00o() {
                }

                @Override // o0OO0O0O.OooO0OO
                public final void OooO0O0() {
                    RoomGiftVideoPlayDownloadManager.INSTANCE.log("RoomGiftSVGAView play end");
                    this.f30053OooO00o.f30039Oooo00O = null;
                    Result.Companion companion = Result.INSTANCE;
                    this.f30054OooO0O0.resumeWith(Result.m4215constructorimpl(Boolean.TRUE));
                }

                @Override // o0OO0O0O.OooO0OO
                public final void OooO0OO(int i) {
                }

                @Override // o0OO0O0O.OooO0OO
                public final void onPause() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(OooOO0 oooOO1, RoomGiftSVGAView roomGiftSVGAView, VideoModel videoModel, CancellableContinuation<? super Boolean> cancellableContinuation) {
                this.f30049OooO00o = oooOO1;
                this.f30050OooO0O0 = roomGiftSVGAView;
                this.f30051OooO0OO = videoModel;
                this.f30052OooO0Oo = cancellableContinuation;
            }

            @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
            public final void OooO00o(@NotNull o00Ooo videoItem) {
                Intrinsics.checkNotNullParameter(videoItem, "videoItem");
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("RoomGiftSVGAView load onComplete");
                o0OO0O0O.OooO oooO = new o0OO0O0O.OooO(videoItem, this.f30049OooO00o);
                RoomGiftSVGAView roomGiftSVGAView = this.f30050OooO0O0;
                roomGiftSVGAView.setImageDrawable(oooO);
                VideoModel videoModel = this.f30051OooO0OO;
                roomGiftSVGAView.setLoops(videoModel.getRepeatCount() > 0 ? 1 + videoModel.getRepeatCount() : 1);
                roomGiftSVGAView.setCallback(new C0338OooO00o(roomGiftSVGAView, this.f30052OooO0Oo));
                roomGiftSVGAView.OooO0Oo();
            }

            @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
            public final void onError() {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("RoomGiftSVGAView play error");
                this.f30050OooO0O0.f30039Oooo00O = null;
                Result.Companion companion = Result.INSTANCE;
                this.f30052OooO0Oo.resumeWith(Result.m4215constructorimpl(Boolean.TRUE));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(GiftPlayReplaceInfo giftPlayReplaceInfo, RoomGiftSVGAView roomGiftSVGAView, File file, VideoModel videoModel, CancellableContinuation<? super Boolean> cancellableContinuation, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30043OooO0o0 = giftPlayReplaceInfo;
            this.f30042OooO0o = roomGiftSVGAView;
            this.f30044OooO0oO = file;
            this.f30045OooO0oo = videoModel;
            this.f30040OooO = cancellableContinuation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f30043OooO0o0, this.f30042OooO0o, this.f30044OooO0oO, this.f30045OooO0oo, this.f30040OooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            VideoModel videoModel = this.f30045OooO0oo;
            CancellableContinuation<Boolean> cancellableContinuation = this.f30040OooO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30041OooO0Oo;
            GiftPlayReplaceInfo giftPlayReplaceInfo = this.f30043OooO0o0;
            RoomGiftSVGAView roomGiftSVGAView = this.f30042OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0337OooO00o c0337OooO00o = new C0337OooO00o(giftPlayReplaceInfo, roomGiftSVGAView, null);
                this.f30041OooO0Oo = 1;
                if (TimeoutKt.withTimeoutOrNull(30000L, c0337OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OooOO0 oooOO1 = new OooOO0();
            Iterator<T> it = giftPlayReplaceInfo.getCustomHideInfo().iterator();
            while (it.hasNext()) {
                oooOO1.OooO0OO((String) it.next(), true);
            }
            for (GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo giftPlayReplaceSingleInfo : giftPlayReplaceInfo.getReplaceImageInfoList()) {
                Bitmap bitmap = giftPlayReplaceSingleInfo.getBitmap();
                if (bitmap != null) {
                    oooOO1.OooO00o(bitmap, o0OoOo0.OooOOO(giftPlayReplaceSingleInfo.getPosition(), ""));
                }
            }
            try {
                com.opensource.svgaplayer.OooO0OO.OooO0Oo(new com.opensource.svgaplayer.OooO0OO(roomGiftSVGAView.getContext()), new FileInputStream(this.f30044OooO0oO), videoModel.getFileNameByUrl(), new OooO0O0(oooOO1, roomGiftSVGAView, videoModel, cancellableContinuation), false, 56);
            } catch (Exception e) {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("RoomGiftSVGAView  " + e);
                roomGiftSVGAView.f30039Oooo00O = null;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m4215constructorimpl(Boxing.boxBoolean(true)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomGiftSVGAView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @NotNull
    public View getView() {
        return this;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public final void init(@NotNull AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30038Oooo000 = LifecycleOwnerKt.getLifecycleScope(activity);
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    @Nullable
    public final Object play(@NotNull File file, @NotNull VideoModel videoModel, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        if (this.f30039Oooo00O != null) {
            return Boxing.boxBoolean(false);
        }
        if (!file.exists()) {
            RoomGiftVideoPlayDownloadManager.INSTANCE.log("文件不存在 跳过任务 filePath = " + file);
            return Boxing.boxBoolean(false);
        }
        Object obj = videoModel.getObj();
        GiftPlayReplaceInfo giftPlayReplaceInfo = obj instanceof GiftPlayReplaceInfo ? (GiftPlayReplaceInfo) obj : null;
        RoomGiftVideoPlayDownloadManager.INSTANCE.log("effectGiftModel:  " + giftPlayReplaceInfo);
        if (giftPlayReplaceInfo == null) {
            return Boxing.boxBoolean(false);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        LifecycleCoroutineScope lifecycleCoroutineScope = this.f30038Oooo000;
        if (lifecycleCoroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            lifecycleCoroutineScope = null;
        }
        this.f30039Oooo00O = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new OooO00o(giftPlayReplaceInfo, this, file, videoModel, cancellableContinuationImpl, null), 3, null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public final void release() {
        reset();
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public final void reset() {
        OooO0o();
        Job job = this.f30039Oooo00O;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f30039Oooo00O = null;
    }

    @Override // com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView
    public final void showVisible(boolean z) {
        if (z) {
            o000O.OooOOOO(this);
        } else {
            o000O.OooO0O0(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomGiftSVGAView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomGiftSVGAView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomGiftSVGAView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
