package com.yalla.yalla.common.manager;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import com.facebook.share.internal.ShareInternalUtility;
import com.umeng.analytics.pro.d;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o0O000Oo;
import p179o00o0.o00O0O;
import p190o00o00oo.o000000O;
import p494o0o00OO0.OooO0o;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004J)\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0019\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/yalla/yalla/common/manager/GiftVideoManager;", "", "()V", "currentDownloadUrl", "", "downloadJob", "Lkotlinx/coroutines/Job;", "downloadVideoTaskList", "", "fileDirectory", "Ljava/io/File;", "waitCurrentDownloadListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "url", ShareInternalUtility.STAGING_PARAM, "", "addVideoDownloadTask", "videoUrl", "download", "parentFile", "fileName", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadPicThenTransform2Bitmap", "Landroid/graphics/Bitmap;", d.R, "Lcom/app/base/mixedroom/MixedRoomActivity;", "(Lcom/app/base/mixedroom/MixedRoomActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileNameByUrl", "getVideoFilePathByUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "independentDownload", "playNextIfNeed", "startDownload", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiftVideoManager {
    public static final int $stable;

    @NotNull
    public static final GiftVideoManager INSTANCE = new GiftVideoManager();

    @NotNull
    private static String currentDownloadUrl;

    @Nullable
    private static Job downloadJob;

    @NotNull
    private static final List<String> downloadVideoTaskList;

    @NotNull
    private static final File fileDirectory;

    @Nullable
    private static Function2<? super String, ? super String, Unit> waitCurrentDownloadListener;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.GiftVideoManager$downloadPicThenTransform2Bitmap$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.GiftVideoManager$downloadPicThenTransform2Bitmap$2", f = "GiftVideoManager.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        public final /* synthetic */ MixedRoomActivity $context;
        public final /* synthetic */ String $url;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MixedRoomActivity mixedRoomActivity, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$context = mixedRoomActivity;
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$context, this.$url, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MixedRoomActivity mixedRoomActivity = this.$context;
                String str = this.$url;
                this.L$0 = mixedRoomActivity;
                this.L$1 = str;
                this.label = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(mixedRoomActivity);
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgPng(o00O00O.OooO00o(str));
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o0(new com.yalla.yalla.util.netimage.listener.OooO00o<BitmapDrawable>() { // from class: com.yalla.yalla.common.manager.GiftVideoManager$downloadPicThenTransform2Bitmap$2$1$1
                    @Override // com.yalla.yalla.util.netimage.listener.OooO00o
                    public void onSuccess(@Nullable BitmapDrawable resource) {
                        if (resource != null) {
                            Continuation<Bitmap> continuation = safeContinuation;
                            int width = resource.getBitmap().getWidth();
                            Bitmap bitmap = resource.getBitmap();
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setShader(bitmapShader);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            float f = width / 2.0f;
                            canvas.drawCircle(f, f, f, paint);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                            canvas.drawBitmap(resource.getBitmap(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, paint);
                            Result.Companion companion = Result.INSTANCE;
                            continuation.resumeWith(Result.m502constructorimpl(bitmapCreateBitmap));
                        }
                    }
                });
                obj = safeContinuation.getOrThrow();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.GiftVideoManager$getVideoFilePathByUrl$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.GiftVideoManager$getVideoFilePathByUrl$2", f = "GiftVideoManager.kt", i = {}, l = {33, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04622 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public final /* synthetic */ String $url;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.manager.GiftVideoManager$getVideoFilePathByUrl$2$1, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.manager.GiftVideoManager$getVideoFilePathByUrl$2$1", f = "GiftVideoManager.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
            public final /* synthetic */ String $url;
            public Object L$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$url = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$url, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final String str = this.$url;
                    this.L$0 = str;
                    this.label = 1;
                    final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    GiftVideoManager giftVideoManager = GiftVideoManager.INSTANCE;
                    GiftVideoManager.waitCurrentDownloadListener = new Function2<String, String, Unit>() { // from class: com.yalla.yalla.common.manager.GiftVideoManager$getVideoFilePathByUrl$2$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(String str2, String str3) {
                            invoke2(str2, str3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String videoUrl, @NotNull String videoFile) {
                            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                            Intrinsics.checkNotNullParameter(videoFile, "videoFile");
                            if (Intrinsics.areEqual(videoUrl, str)) {
                                GiftVideoManager giftVideoManager2 = GiftVideoManager.INSTANCE;
                                GiftVideoManager.waitCurrentDownloadListener = null;
                                CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m502constructorimpl(videoFile));
                            }
                        }
                    };
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04622(String str, Continuation<? super C04622> continuation) {
            super(2, continuation);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04622(this.$url, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((C04622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GiftVideoManager giftVideoManager = GiftVideoManager.INSTANCE;
            File file = new File(GiftVideoManager.fileDirectory, giftVideoManager.getFileNameByUrl(this.$url));
            if (file.exists()) {
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
                return absolutePath;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("download url = ");
            sbOooO0o0.append(this.$url);
            o00O00.OooO0OO("RoomEffectGiftPlayer", sbOooO0o0.toString());
            if (Intrinsics.areEqual(this.$url, GiftVideoManager.currentDownloadUrl)) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$url, null);
                this.label = 1;
                obj = TimeoutKt.withTimeout(30000L, anonymousClass1, this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
            String str = this.$url;
            this.label = 2;
            obj = giftVideoManager.independentDownload(str, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.GiftVideoManager$independentDownload$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.GiftVideoManager$independentDownload$2", f = "GiftVideoManager.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04632 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04632(String str, String str2, Continuation<? super C04632> continuation) {
            super(2, continuation);
            this.$fileName = str;
            this.$url = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04632(this.$fileName, this.$url, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((C04632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GiftVideoManager giftVideoManager = GiftVideoManager.INSTANCE;
                File file = GiftVideoManager.fileDirectory;
                String str = this.$fileName;
                String str2 = this.$url;
                this.label = 1;
                obj = giftVideoManager.download(file, str, str2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.GiftVideoManager$startDownload$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.GiftVideoManager$startDownload$1", f = "GiftVideoManager.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GiftVideoManager giftVideoManager = GiftVideoManager.INSTANCE;
                GiftVideoManager.currentDownloadUrl = (String) GiftVideoManager.downloadVideoTaskList.get(0);
                GiftVideoManager.downloadVideoTaskList.remove(0);
                GiftVideoManager$startDownload$1$download$1 giftVideoManager$startDownload$1$download$1 = new GiftVideoManager$startDownload$1$download$1(giftVideoManager.getFileNameByUrl(GiftVideoManager.currentDownloadUrl), null);
                this.label = 1;
                obj = TimeoutKt.withTimeout(15000L, giftVideoManager$startDownload$1$download$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) obj;
            Function2 function2 = GiftVideoManager.waitCurrentDownloadListener;
            if (function2 != null) {
                function2.invoke(GiftVideoManager.currentDownloadUrl, str);
            }
            GiftVideoManager.INSTANCE.playNextIfNeed();
            return Unit.INSTANCE;
        }
    }

    static {
        OooO0o oooO0o = OooO0o.f41155OooO00o;
        fileDirectory = new File(((File) OooO0o.f41165OooOO0o.getValue()).getAbsolutePath());
        downloadVideoTaskList = new ArrayList();
        currentDownloadUrl = "";
        $stable = 8;
    }

    private GiftVideoManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object download(File file, String str, String str2, Continuation<? super String> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        o000000O o000000oOooO0OO = o0O000Oo.OooO0OO(file);
        o000000oOooO0OO.f33059OooO0oo = str;
        o000000oOooO0OO.f33055OooO0Oo = new o00O0O() { // from class: com.yalla.yalla.common.manager.GiftVideoManager$download$2$1
            @Override // p179o00o0.o00O0O
            public final void result(boolean z, String str3) {
                if (z) {
                    CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m502constructorimpl(str3));
                } else {
                    CancellableContinuation<String> cancellableContinuation2 = cancellableContinuationImpl;
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m502constructorimpl(""));
                }
            }
        };
        o000000oOooO0OO.OooO0O0(str2);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileNameByUrl(String url) {
        return StringsKt__StringsKt.substringAfterLast(url, "/", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object independentDownload(String str, Continuation<? super String> continuation) {
        downloadVideoTaskList.remove(str);
        return TimeoutKt.withTimeout(30000L, new C04632(getFileNameByUrl(str), str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playNextIfNeed() {
        downloadJob = null;
        currentDownloadUrl = "";
        if (!downloadVideoTaskList.isEmpty()) {
            startDownload();
        }
    }

    private final void startDownload() {
        if (downloadJob != null) {
            return;
        }
        downloadJob = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    public final void addVideoDownloadTask(@NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        if (StringsKt.isBlank(videoUrl) || !StringsKt__StringsJVMKt.endsWith$default(videoUrl, ".mp4", false, 2, null)) {
            return;
        }
        downloadVideoTaskList.add(videoUrl);
        startDownload();
    }

    @Nullable
    public final Object downloadPicThenTransform2Bitmap(@NotNull MixedRoomActivity mixedRoomActivity, @NotNull String str, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(mixedRoomActivity, str, null), continuation);
    }

    @Nullable
    public final Object getVideoFilePathByUrl(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return (StringsKt.isBlank(str) || !StringsKt__StringsJVMKt.endsWith$default(str, ".mp4", false, 2, null)) ? "" : BuildersKt.withContext(Dispatchers.getIO(), new C04622(str, null), continuation);
    }
}
