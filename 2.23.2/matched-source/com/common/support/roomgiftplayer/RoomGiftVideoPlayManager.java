package com.common.support.roomgiftplayer;

import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OooO0OO;
import com.common.support.roomgiftplayer.download.RoomGiftVideoPlayDownloadManager;
import com.common.support.roomgiftplayer.view.RoomGiftPlayContainer;
import com.common.support.roomgiftplayer.view.YYEvaVideoView;
import com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p466o0OooOoo.o0O0o00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tJ!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\u0006\u0010\u0018\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/common/support/roomgiftplayer/RoomGiftVideoPlayManager;", "", "()V", "mActivity", "Landroidx/appcompat/app/AppCompatActivity;", "mCustomChannel", "Lcom/common/support/roomgiftplayer/CustomChannel;", "Lcom/common/support/roomgiftplayer/VideoModel;", "mGifVideoPlayContainer", "Lcom/common/support/roomgiftplayer/view/RoomGiftPlayContainer;", "addItem", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "addItemToFirst", "getRoomGiftPlayContainer", "init", "activity", "gifVideoPlayContainer", "realPlay", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "videoModel", "(Ljava/io/File;Lcom/common/support/roomgiftplayer/VideoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "reset", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomGiftVideoPlayManager {
    public static final int $stable = 8;
    private AppCompatActivity mActivity;
    private CustomChannel<VideoModel> mCustomChannel;
    private RoomGiftPlayContainer mGifVideoPlayContainer;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.YYEva.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.AlphaVideo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoType.Svga.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.RoomGiftVideoPlayManager$init$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.RoomGiftVideoPlayManager$init$2", f = "RoomGiftVideoPlayManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RoomGiftVideoPlayDownloadManager.INSTANCE.log("视频列表为空，等待接收视频数据");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.RoomGiftVideoPlayManager$init$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/common/support/roomgiftplayer/VideoModel;", "videoModel", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.common.support.roomgiftplayer.RoomGiftVideoPlayManager$init$3", f = "RoomGiftVideoPlayManager.kt", i = {1, 1}, l = {53, 57, 68}, m = "invokeSuspend", n = {"videoModel", ShareInternalUtility.STAGING_PARAM}, s = {"L$0", "L$1"})
    public static final class AnonymousClass3 extends SuspendLambda implements Function3<CoroutineScope, VideoModel, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00cf A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            VideoModel videoModel;
            File file;
            Boolean bool;
            RoomGiftVideoPlayManager roomGiftVideoPlayManager;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        file = (File) this.L$1;
                        videoModel = (VideoModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        bool = (Boolean) obj;
                        RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
                        roomGiftVideoPlayDownloadManager.log("play net wait to load " + videoModel);
                        roomGiftVideoPlayDownloadManager.clearWaiting$RoomGiftVideoPlayer_release();
                        if (bool != null && file.exists()) {
                            roomGiftVideoPlayManager = RoomGiftVideoPlayManager.this;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            if (roomGiftVideoPlayManager.realPlay(file, videoModel, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                VideoModel videoModel2 = (VideoModel) this.L$0;
                RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager2 = RoomGiftVideoPlayDownloadManager.INSTANCE;
                roomGiftVideoPlayDownloadManager2.log("-------------------------  start");
                roomGiftVideoPlayDownloadManager2.log("onReceive    " + videoModel2);
                String fileNameByUrl = videoModel2.getFileNameByUrl();
                if (videoModel2.isDownloadUrl()) {
                    File file2 = o0O0o00O.f47844OooO00o;
                    File file3 = new File(o0O0o00O.OooO0OO(), fileNameByUrl);
                    if (file3.exists()) {
                        roomGiftVideoPlayDownloadManager2.log("play local  " + videoModel2);
                        RoomGiftVideoPlayManager roomGiftVideoPlayManager2 = RoomGiftVideoPlayManager.this;
                        this.label = 1;
                        if (roomGiftVideoPlayManager2.realPlay(file3, videoModel2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        roomGiftVideoPlayDownloadManager2.log("play net");
                        long downloadTimeOut = roomGiftVideoPlayDownloadManager2.getDownloadTimeOut();
                        RoomGiftVideoPlayManager$init$3$result$1 roomGiftVideoPlayManager$init$3$result$1 = new RoomGiftVideoPlayManager$init$3$result$1(videoModel2, null);
                        this.L$0 = videoModel2;
                        this.L$1 = file3;
                        this.label = 2;
                        Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(downloadTimeOut, roomGiftVideoPlayManager$init$3$result$1, this);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        videoModel = videoModel2;
                        obj = objWithTimeoutOrNull;
                        file = file3;
                        bool = (Boolean) obj;
                        RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager3 = RoomGiftVideoPlayDownloadManager.INSTANCE;
                        roomGiftVideoPlayDownloadManager3.log("play net wait to load " + videoModel);
                        roomGiftVideoPlayDownloadManager3.clearWaiting$RoomGiftVideoPlayer_release();
                        if (bool != null) {
                            roomGiftVideoPlayManager = RoomGiftVideoPlayManager.this;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            if (roomGiftVideoPlayManager.realPlay(file, videoModel, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    roomGiftVideoPlayDownloadManager2.log("local video");
                }
            }
            RoomGiftVideoPlayDownloadManager.INSTANCE.log("-------------------------  end");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull VideoModel videoModel, @Nullable Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = RoomGiftVideoPlayManager.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = videoModel;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.common.support.roomgiftplayer.RoomGiftVideoPlayManager$realPlay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.common.support.roomgiftplayer.RoomGiftVideoPlayManager", f = "RoomGiftVideoPlayManager.kt", i = {0, 0, 1, 1}, l = {133, 140}, m = "realPlay", n = {"this", "videoModel", "this", "videoModel"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C08691 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C08691(Continuation<? super C08691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomGiftVideoPlayManager.this.realPlay(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object realPlay(File file, VideoModel videoModel, Continuation<? super Unit> continuation) {
        C08691 c08691;
        RoomGiftVideoPlayManager roomGiftVideoPlayManager;
        VideoModel videoModel2;
        RoomGiftVideoPlayManager roomGiftVideoPlayManager2;
        if (continuation instanceof C08691) {
            c08691 = (C08691) continuation;
            int i = c08691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c08691.label = i - Integer.MIN_VALUE;
            } else {
                c08691 = new C08691(continuation);
            }
        } else {
            c08691 = new C08691(continuation);
        }
        Object objPlay = c08691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c08691.label;
        RoomGiftPlayContainer roomGiftPlayContainer = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPlay);
            int i3 = WhenMappings.$EnumSwitchMapping$0[videoModel.getType().ordinal()];
            if (i3 == 1 || i3 == 2) {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("play YYEva start url: " + videoModel.getUrl());
                RoomGiftPlayContainer roomGiftPlayContainer2 = this.mGifVideoPlayContainer;
                if (roomGiftPlayContainer2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
                    roomGiftPlayContainer2 = null;
                }
                roomGiftPlayContainer2.getYyEvaVideoView().showVisible(true);
                RoomGiftPlayContainer roomGiftPlayContainer3 = this.mGifVideoPlayContainer;
                if (roomGiftPlayContainer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
                    roomGiftPlayContainer3 = null;
                }
                YYEvaVideoView yyEvaVideoView = roomGiftPlayContainer3.getYyEvaVideoView();
                c08691.L$0 = this;
                c08691.L$1 = videoModel;
                c08691.label = 1;
                if (yyEvaVideoView.play(file, videoModel, c08691) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                roomGiftVideoPlayManager = this;
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("play YYEva end url: " + videoModel.getUrl());
            } else if (i3 != 3) {
                roomGiftVideoPlayManager = this;
            } else {
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("play svga start url: " + videoModel.getUrl());
                RoomGiftPlayContainer roomGiftPlayContainer4 = this.mGifVideoPlayContainer;
                if (roomGiftPlayContainer4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
                    roomGiftPlayContainer4 = null;
                }
                IRoomGiftVideoView svgaView = roomGiftPlayContainer4.getSvgaView();
                if (svgaView != null) {
                    svgaView.showVisible(true);
                }
                RoomGiftPlayContainer roomGiftPlayContainer5 = this.mGifVideoPlayContainer;
                if (roomGiftPlayContainer5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
                    roomGiftPlayContainer5 = null;
                }
                IRoomGiftVideoView svgaView2 = roomGiftPlayContainer5.getSvgaView();
                if (svgaView2 != null) {
                    c08691.L$0 = this;
                    c08691.L$1 = videoModel;
                    c08691.label = 2;
                    objPlay = svgaView2.play(file, videoModel, c08691);
                    if (objPlay == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    videoModel2 = videoModel;
                    roomGiftVideoPlayManager2 = this;
                    RoomGiftVideoPlayManager roomGiftVideoPlayManager3 = roomGiftVideoPlayManager2;
                    videoModel = videoModel2;
                    roomGiftVideoPlayManager = roomGiftVideoPlayManager3;
                } else {
                    roomGiftVideoPlayManager = this;
                }
                RoomGiftVideoPlayDownloadManager.INSTANCE.log("play svga end url: " + videoModel.getUrl());
            }
        } else if (i2 == 1) {
            videoModel = (VideoModel) c08691.L$1;
            roomGiftVideoPlayManager = (RoomGiftVideoPlayManager) c08691.L$0;
            ResultKt.throwOnFailure(objPlay);
            RoomGiftVideoPlayDownloadManager.INSTANCE.log("play YYEva end url: " + videoModel.getUrl());
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            videoModel2 = (VideoModel) c08691.L$1;
            roomGiftVideoPlayManager2 = (RoomGiftVideoPlayManager) c08691.L$0;
            ResultKt.throwOnFailure(objPlay);
            RoomGiftVideoPlayManager roomGiftVideoPlayManager4 = roomGiftVideoPlayManager2;
            videoModel = videoModel2;
            roomGiftVideoPlayManager = roomGiftVideoPlayManager4;
            RoomGiftVideoPlayDownloadManager.INSTANCE.log("play svga end url: " + videoModel.getUrl());
        }
        RoomGiftPlayContainer roomGiftPlayContainer6 = roomGiftVideoPlayManager.mGifVideoPlayContainer;
        if (roomGiftPlayContainer6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
        } else {
            roomGiftPlayContainer = roomGiftPlayContainer6;
        }
        roomGiftPlayContainer.goneAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        RoomGiftPlayContainer roomGiftPlayContainer = this.mGifVideoPlayContainer;
        RoomGiftPlayContainer roomGiftPlayContainer2 = null;
        if (roomGiftPlayContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
            roomGiftPlayContainer = null;
        }
        roomGiftPlayContainer.getYyEvaVideoView().release();
        RoomGiftPlayContainer roomGiftPlayContainer3 = this.mGifVideoPlayContainer;
        if (roomGiftPlayContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
        } else {
            roomGiftPlayContainer2 = roomGiftPlayContainer3;
        }
        IRoomGiftVideoView svgaView = roomGiftPlayContainer2.getSvgaView();
        if (svgaView != null) {
            svgaView.release();
        }
    }

    public final void addItem(@NotNull VideoModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (TextUtils.isEmpty(model.getUrl())) {
            return;
        }
        RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
        File file = o0O0o00O.f47844OooO00o;
        File fileOooO0OO = o0O0o00O.OooO0OO();
        AppCompatActivity appCompatActivity = this.mActivity;
        CustomChannel<VideoModel> customChannel = null;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            appCompatActivity = null;
        }
        RoomGiftVideoPlayDownloadManager.addDownloadVideo$default(roomGiftVideoPlayDownloadManager, model, fileOooO0OO, LifecycleOwnerKt.getLifecycleScope(appCompatActivity), false, 8, null);
        CustomChannel<VideoModel> customChannel2 = this.mCustomChannel;
        if (customChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomChannel");
        } else {
            customChannel = customChannel2;
        }
        customChannel.send(model);
    }

    public final void addItemToFirst(@NotNull VideoModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (TextUtils.isEmpty(model.getUrl())) {
            return;
        }
        RoomGiftVideoPlayDownloadManager roomGiftVideoPlayDownloadManager = RoomGiftVideoPlayDownloadManager.INSTANCE;
        File file = o0O0o00O.f47844OooO00o;
        File fileOooO0OO = o0O0o00O.OooO0OO();
        AppCompatActivity appCompatActivity = this.mActivity;
        CustomChannel<VideoModel> customChannel = null;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            appCompatActivity = null;
        }
        roomGiftVideoPlayDownloadManager.addDownloadVideo(model, fileOooO0OO, LifecycleOwnerKt.getLifecycleScope(appCompatActivity), true);
        CustomChannel<VideoModel> customChannel2 = this.mCustomChannel;
        if (customChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomChannel");
        } else {
            customChannel = customChannel2;
        }
        customChannel.sendFirst(model);
    }

    @Nullable
    public final RoomGiftPlayContainer getRoomGiftPlayContainer() {
        RoomGiftPlayContainer roomGiftPlayContainer = this.mGifVideoPlayContainer;
        if (roomGiftPlayContainer != null) {
            if (roomGiftPlayContainer != null) {
                return roomGiftPlayContainer;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
        }
        return null;
    }

    public final void init(@NotNull AppCompatActivity activity, @NotNull RoomGiftPlayContainer gifVideoPlayContainer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(gifVideoPlayContainer, "gifVideoPlayContainer");
        this.mActivity = activity;
        this.mGifVideoPlayContainer = gifVideoPlayContainer;
        this.mCustomChannel = new CustomChannel<>(LifecycleOwnerKt.getLifecycleScope(activity), false, 2, null);
        AppCompatActivity appCompatActivity = this.mActivity;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            appCompatActivity = null;
        }
        appCompatActivity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.common.support.roomgiftplayer.RoomGiftVideoPlayManager.init.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                RoomGiftVideoPlayManager.this.release();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
        gifVideoPlayContainer.goneAll();
        CustomChannel<VideoModel> customChannel = this.mCustomChannel;
        if (customChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomChannel");
            customChannel = null;
        }
        customChannel.setOnDataEmpty(new AnonymousClass2(null));
        CustomChannel<VideoModel> customChannel2 = this.mCustomChannel;
        if (customChannel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomChannel");
            customChannel2 = null;
        }
        customChannel2.setOnReceive(new AnonymousClass3(null));
    }

    public final void reset() {
        RoomGiftVideoPlayDownloadManager.INSTANCE.log("RoomGiftVideoPlayManager  reset");
        CustomChannel<VideoModel> customChannel = this.mCustomChannel;
        RoomGiftPlayContainer roomGiftPlayContainer = null;
        if (customChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCustomChannel");
            customChannel = null;
        }
        customChannel.clear();
        RoomGiftPlayContainer roomGiftPlayContainer2 = this.mGifVideoPlayContainer;
        if (roomGiftPlayContainer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
            roomGiftPlayContainer2 = null;
        }
        roomGiftPlayContainer2.getYyEvaVideoView().reset();
        RoomGiftPlayContainer roomGiftPlayContainer3 = this.mGifVideoPlayContainer;
        if (roomGiftPlayContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
            roomGiftPlayContainer3 = null;
        }
        IRoomGiftVideoView svgaView = roomGiftPlayContainer3.getSvgaView();
        if (svgaView != null) {
            svgaView.reset();
        }
        RoomGiftPlayContainer roomGiftPlayContainer4 = this.mGifVideoPlayContainer;
        if (roomGiftPlayContainer4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGifVideoPlayContainer");
        } else {
            roomGiftPlayContainer = roomGiftPlayContainer4;
        }
        roomGiftPlayContainer.goneAll();
    }
}
