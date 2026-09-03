package com.yalla.yalla.common.manager.data;

import android.util.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.yalla.support.common.base.LoadLogic;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o0O000Oo;
import p190o00o00oo.o000000O;
import p254o00ooO0O.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedThemeVideoManager;", "", "()V", "loadLogic", "com/yalla/yalla/common/manager/data/SharedThemeVideoManager$loadLogic$1", "Lcom/yalla/yalla/common/manager/data/SharedThemeVideoManager$loadLogic$1;", "lruCache", "Landroid/util/LruCache;", "", "videoDir", "Ljava/io/File;", "getFileName", "url", "loadVideo", "Landroidx/lifecycle/LiveData;", "videoUrl", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SharedThemeVideoManager {
    public static final int $stable;

    @NotNull
    public static final SharedThemeVideoManager INSTANCE = new SharedThemeVideoManager();

    @NotNull
    private static final SharedThemeVideoManager$loadLogic$1 loadLogic;

    @NotNull
    private static LruCache<String, String> lruCache;

    @NotNull
    private static final File videoDir;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedThemeVideoManager$loadVideo$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedThemeVideoManager$loadVideo$1", f = "SharedThemeVideoManager.kt", i = {}, l = {54, 54}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<String>, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $videoUrl;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$videoUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$videoUrl, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull LiveDataScope<String> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
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
            SharedThemeVideoManager$loadLogic$1 sharedThemeVideoManager$loadLogic$1 = SharedThemeVideoManager.loadLogic;
            String str = this.$videoUrl;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = LoadLogic.load$default(sharedThemeVideoManager$loadLogic$1, str, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                str2 = "";
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(str2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.yalla.yalla.common.manager.data.SharedThemeVideoManager$loadLogic$1] */
    static {
        p494o0o00OO0.OooO0o oooO0o = p494o0o00OO0.OooO0o.f41155OooO00o;
        videoDir = (File) p494o0o00OO0.OooO0o.f41164OooOO0O.getValue();
        lruCache = new LruCache<>(20);
        loadLogic = new LoadLogic<String, String>() { // from class: com.yalla.yalla.common.manager.data.SharedThemeVideoManager$loadLogic$1
            @Override // com.yalla.support.common.base.LoadLogic
            public /* bridge */ /* synthetic */ Object saveToDisk(String str, String str2, Continuation continuation) {
                return saveToDisk2(str, str2, (Continuation<? super Unit>) continuation);
            }

            @Override // com.yalla.support.common.base.LoadLogic
            public /* bridge */ /* synthetic */ Object syncCache(String str, String str2, Continuation continuation) {
                return syncCache2(str, str2, (Continuation<? super Unit>) continuation);
            }

            @Override // com.yalla.support.common.base.LoadLogic
            @Nullable
            public Object fetchFromNet(@NotNull String str, @NotNull Continuation<? super String> continuation) {
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
                cancellableContinuationImpl.initCancellability();
                final String fileName = SharedThemeVideoManager.INSTANCE.getFileName(str);
                o000000O o000000oOooO0OO = o0O000Oo.OooO0OO(SharedThemeVideoManager.videoDir);
                o000000oOooO0OO.f33059OooO0oo = fileName;
                o000000oOooO0OO.f33055OooO0Oo = new p179o00o0.o00O0O() { // from class: com.yalla.yalla.common.manager.data.SharedThemeVideoManager$loadLogic$1$fetchFromNet$2$1
                    @Override // p179o00o0.o00O0O
                    public final void result(boolean z, String str2) {
                        if (z) {
                            CancellableContinuation<String> cancellableContinuation = cancellableContinuationImpl;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m502constructorimpl(new File(SharedThemeVideoManager.videoDir, fileName).getAbsolutePath()));
                        } else {
                            CancellableContinuation<String> cancellableContinuation2 = cancellableContinuationImpl;
                            Result.Companion companion2 = Result.INSTANCE;
                            cancellableContinuation2.resumeWith(Result.m502constructorimpl(null));
                        }
                    }
                };
                o000000oOooO0OO.OooO0O0(str);
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            }

            @Override // com.yalla.support.common.base.LoadLogic
            @Nullable
            public Object loadFromCache(@NotNull String str, @NotNull Continuation<? super String> continuation) {
                return SharedThemeVideoManager.lruCache.get(str);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0028  */
            /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // com.yalla.support.common.base.LoadLogic
            @Nullable
            public Object loadFromDisk(@NotNull String str, @NotNull Continuation<? super String> continuation) {
                String fileName = SharedThemeVideoManager.INSTANCE.getFileName(str);
                File[] fileArrListFiles = SharedThemeVideoManager.videoDir.listFiles();
                if (fileArrListFiles == null) {
                    return null;
                }
                for (File file : fileArrListFiles) {
                    if (Intrinsics.areEqual(file.getName(), fileName)) {
                        if (file != null) {
                            return file.getAbsolutePath();
                        }
                        return null;
                    }
                }
                file = null;
                if (file != null) {
                    return file.getAbsolutePath();
                }
                return null;
            }

            @Nullable
            /* JADX INFO: renamed from: saveToDisk, reason: avoid collision after fix types in other method */
            public Object saveToDisk2(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
                return Unit.INSTANCE;
            }

            @Nullable
            /* JADX INFO: renamed from: syncCache, reason: avoid collision after fix types in other method */
            public Object syncCache2(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) {
                SharedThemeVideoManager.lruCache.put(str, str2);
                return Unit.INSTANCE;
            }
        };
        $stable = 8;
    }

    private SharedThemeVideoManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileName(String url) {
        return StringsKt__StringsKt.substringAfterLast(url, "/", "");
    }

    @NotNull
    public final LiveData<String> loadVideo(@NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        return o0000O0O.OooO00o(new AnonymousClass1(videoUrl, null));
    }
}
