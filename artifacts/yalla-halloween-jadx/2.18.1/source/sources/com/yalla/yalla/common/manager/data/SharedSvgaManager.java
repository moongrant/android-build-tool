package com.yalla.yalla.common.manager.data;

import android.content.Context;
import android.util.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.facebook.share.internal.ShareInternalUtility;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.base.LoadLogic;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p032OoooO0.o0O000Oo;
import p190o00o00oo.o000000O;
import p207o00o0oO.o00O0;
import p254o00ooO0O.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u001d\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u001d\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0006J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00102\u0006\u0010\u000f\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedSvgaManager;", "", "", "key", "Lo0Oo0OO0/OooOo;", "loadSvgaFromNet", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "loadSvgaFromFileInputStream", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadSvgaFromNet", "loadSvgaFromDisk", "loadSvgaFromAssets", "loadSvgaFromCard", "path", "Landroidx/lifecycle/LiveData;", "loadSvga", "assetsStartWith", "Ljava/lang/String;", "Landroid/util/LruCache;", "lruCache", "Landroid/util/LruCache;", "com/yalla/yalla/common/manager/data/SharedSvgaManager$loadLogic$1", "loadLogic", "Lcom/yalla/yalla/common/manager/data/SharedSvgaManager$loadLogic$1;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SharedSvgaManager {
    public static final int $stable;

    @NotNull
    private static p405o0Oo0OO0.OooOo00 svgaParser;

    @NotNull
    public static final SharedSvgaManager INSTANCE = new SharedSvgaManager();

    @NotNull
    private static final String assetsStartWith = "svga/";

    @NotNull
    private static LruCache<String, p405o0Oo0OO0.OooOo> lruCache = new LruCache<>(20);

    @NotNull
    private static SharedSvgaManager$loadLogic$1 loadLogic = new LoadLogic<String, p405o0Oo0OO0.OooOo>() { // from class: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadLogic$1
        @Override // com.yalla.support.common.base.LoadLogic
        public /* bridge */ /* synthetic */ Object saveToDisk(String str, p405o0Oo0OO0.OooOo oooOo, Continuation continuation) {
            return saveToDisk2(str, oooOo, (Continuation<? super Unit>) continuation);
        }

        @Override // com.yalla.support.common.base.LoadLogic
        public /* bridge */ /* synthetic */ Object syncCache(String str, p405o0Oo0OO0.OooOo oooOo, Continuation continuation) {
            return syncCache2(str, oooOo, (Continuation<? super Unit>) continuation);
        }

        @Override // com.yalla.support.common.base.LoadLogic
        @Nullable
        public Object fetchFromNet(@NotNull String str, @NotNull Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
            return SharedSvgaManager.INSTANCE.loadSvgaFromNet(str, continuation);
        }

        @Override // com.yalla.support.common.base.LoadLogic
        @Nullable
        public Object loadFromCache(@NotNull String str, @NotNull Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
            return SharedSvgaManager.lruCache.get(str);
        }

        @Override // com.yalla.support.common.base.LoadLogic
        @Nullable
        public Object loadFromDisk(@NotNull String str, @NotNull Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
            return SharedSvgaManager.INSTANCE.loadSvgaFromDisk(str, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: saveToDisk, reason: avoid collision after fix types in other method */
        public Object saveToDisk2(@NotNull String str, @NotNull p405o0Oo0OO0.OooOo oooOo, @NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Nullable
        /* JADX INFO: renamed from: syncCache, reason: avoid collision after fix types in other method */
        public Object syncCache2(@NotNull String str, @NotNull p405o0Oo0OO0.OooOo oooOo, @NotNull Continuation<? super Unit> continuation) {
            SharedSvgaManager.lruCache.put(str, oooOo);
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedSvgaManager$downloadSvgaFromNet$2, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedSvgaManager$downloadSvgaFromNet$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        public final /* synthetic */ String $key;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super File> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$key;
                this.L$0 = str;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                p494o0o00OO0.OooO0o oooO0o = p494o0o00OO0.OooO0o.f41155OooO00o;
                o000000O o000000oOooO0OO = o0O000Oo.OooO0OO(p494o0o00OO0.OooO0o.f41157OooO0OO);
                o000000oOooO0OO.f33055OooO0Oo = new p179o00o0.o00O0O() { // from class: com.yalla.yalla.common.manager.data.SharedSvgaManager$downloadSvgaFromNet$2$1$1
                    @Override // p179o00o0.o00O0O
                    public final void result(boolean z, @Nullable String str2) {
                        CancellableContinuation<File> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(new File(str2)));
                    }
                };
                o000000oOooO0OO.OooO0O0(str);
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

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvga$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lo0Oo0OO0/OooOo;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvga$1", f = "SharedSvgaManager.kt", i = {0}, l = {55, 56}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<p405o0Oo0OO0.OooOo>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $path;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$path, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LiveDataScope<p405o0Oo0OO0.OooOo> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            SharedSvgaManager$loadLogic$1 sharedSvgaManager$loadLogic$1 = SharedSvgaManager.loadLogic;
            String str = this.$path;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = LoadLogic.load$default(sharedSvgaManager$loadLogic$1, str, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit((p405o0Oo0OO0.OooOo) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromAssets$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lo0Oo0OO0/OooOo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromAssets$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04732 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super p405o0Oo0OO0.OooOo>, Object> {
        public final /* synthetic */ String $key;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04732(String str, Continuation<? super C04732> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04732(this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
            return ((C04732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$key;
                this.L$0 = str;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                SharedSvgaManager.svgaParser.OooO0oO(str, new o0Oo0OO0.OooOo00.OooO0O0() { // from class: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromAssets$2$1$callback$1
                    @Override // o0Oo0OO0.OooOo00.OooO0O0
                    public void onComplete(@NotNull p405o0Oo0OO0.OooOo videoItem) {
                        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
                        CancellableContinuation<p405o0Oo0OO0.OooOo> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(videoItem));
                    }

                    @Override // o0Oo0OO0.OooOo00.OooO0O0
                    public void onError() {
                        CancellableContinuation<p405o0Oo0OO0.OooOo> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m502constructorimpl(null));
                    }
                });
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

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromFileInputStream$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lo0Oo0OO0/OooOo;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromFileInputStream$2", f = "SharedSvgaManager.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04742 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super p405o0Oo0OO0.OooOo>, Object> {
        public final /* synthetic */ File $file;
        public final /* synthetic */ String $key;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04742(File file, String str, Continuation<? super C04742> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04742(this.$file, this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
            return ((C04742) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                File file = this.$file;
                String str = this.$key;
                this.L$0 = file;
                this.L$1 = str;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    SharedSvgaManager.svgaParser.OooO0oo(fileInputStream, str, new o0Oo0OO0.OooOo00.OooO0O0() { // from class: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromFileInputStream$2$1$callback$1
                        @Override // o0Oo0OO0.OooOo00.OooO0O0
                        public void onComplete(@NotNull p405o0Oo0OO0.OooOo videoItem) {
                            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
                            CancellableContinuation<p405o0Oo0OO0.OooOo> cancellableContinuation = cancellableContinuationImpl;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m502constructorimpl(videoItem));
                        }

                        @Override // o0Oo0OO0.OooOo00.OooO0O0
                        public void onError() {
                            CancellableContinuation<p405o0Oo0OO0.OooOo> cancellableContinuation = cancellableContinuationImpl;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m502constructorimpl(null));
                        }
                    }, true);
                } catch (Exception e) {
                    e.printStackTrace();
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(null));
                }
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

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedSvgaManager$loadSvgaFromNet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedSvgaManager", f = "SharedSvgaManager.kt", i = {0, 0}, l = {60, 61}, m = "loadSvgaFromNet", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class C04751 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C04751(Continuation<? super C04751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedSvgaManager.this.loadSvgaFromNet(null, this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.yalla.yalla.common.manager.data.SharedSvgaManager$loadLogic$1] */
    static {
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        svgaParser = new p405o0Oo0OO0.OooOo00(context);
        $stable = 8;
    }

    private SharedSvgaManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadSvgaFromNet(String str, Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadSvgaFromAssets(String str, Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C04732(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadSvgaFromCard(String str, Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
        String str2 = o000000O.OooO00o(str) + o00O0.OooO0O0(str);
        p494o0o00OO0.OooO0o oooO0o = p494o0o00OO0.OooO0o.f41155OooO00o;
        File file = new File(p494o0o00OO0.OooO0o.f41157OooO0OO, str2);
        if (file.exists()) {
            return loadSvgaFromFileInputStream(file, str, continuation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadSvgaFromDisk(String str, Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
        return StringsKt.OooOoOO(str, assetsStartWith) ? loadSvgaFromAssets(str, continuation) : loadSvgaFromCard(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadSvgaFromFileInputStream(File file, String str, Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C04742(file, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadSvgaFromNet(String str, Continuation<? super p405o0Oo0OO0.OooOo> continuation) {
        C04751 c04751;
        SharedSvgaManager sharedSvgaManager;
        if (continuation instanceof C04751) {
            c04751 = (C04751) continuation;
            int i = c04751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04751.label = i - Integer.MIN_VALUE;
            } else {
                c04751 = new C04751(continuation);
            }
        } else {
            c04751 = new C04751(continuation);
        }
        Object objDownloadSvgaFromNet = c04751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04751.label;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) c04751.L$1;
                sharedSvgaManager = (SharedSvgaManager) c04751.L$0;
                ResultKt.throwOnFailure(objDownloadSvgaFromNet);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objDownloadSvgaFromNet);
            }
        }
        ResultKt.throwOnFailure(objDownloadSvgaFromNet);
        c04751.L$0 = this;
        c04751.L$1 = str;
        c04751.label = 1;
        objDownloadSvgaFromNet = downloadSvgaFromNet(str, c04751);
        if (objDownloadSvgaFromNet == coroutine_suspended) {
            return coroutine_suspended;
        }
        sharedSvgaManager = this;
        c04751.L$0 = null;
        c04751.L$1 = null;
        c04751.label = 2;
        objDownloadSvgaFromNet = sharedSvgaManager.loadSvgaFromFileInputStream((File) objDownloadSvgaFromNet, str, c04751);
        return objDownloadSvgaFromNet == coroutine_suspended ? coroutine_suspended : objDownloadSvgaFromNet;
    }

    @NotNull
    public final LiveData<p405o0Oo0OO0.OooOo> loadSvga(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return o0000O0O.OooO00o(new AnonymousClass1(path, null));
    }
}
