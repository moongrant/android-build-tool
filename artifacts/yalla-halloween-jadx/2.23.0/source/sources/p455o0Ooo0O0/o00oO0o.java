package p455o0Ooo0O0;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOOO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o0OOo000.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p453o0Ooo00o.o00Oo0;
import p468o0OoooO0.o0OO0O0;
import p468o0OoooO0.o0OO0oO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$onNextClick$2", f = "MediaPreviewScreen.kt", i = {0, 1, 2}, l = {459, 465, 470, 476}, m = "invokeSuspend", n = {"$this$launchIO", "$this$launchIO", "audioCmdResult"}, s = {"L$0", "L$0", "L$0"})
public final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Uri, Unit> f46565OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f46567OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f46568OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f46569OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f46570OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$onNextClick$2$1", f = "MediaPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0o0Oo f46571OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo0o0Oo oo0o0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46571OooO0Oo = oo0o0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46571OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            OooO0OO oooO0OOOooO0o0 = this.f46571OooO0Oo.OooO0o0();
            if (oooO0OOOooO0o0 == null) {
                return null;
            }
            oooO0OOOooO0o0.pause();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00oO0o(oo0o0Oo oo0o0oo, MutableState<Boolean> mutableState, o00Oo0 o00oo1, Function1<? super Uri, Unit> function1, Continuation<? super o00oO0o> continuation) {
        super(2, continuation);
        this.f46567OooO0o = oo0o0oo;
        this.f46569OooO0oO = mutableState;
        this.f46570OooO0oo = o00oo1;
        this.f46565OooO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00oO0o o00oo0o2 = new o00oO0o(this.f46567OooO0o, this.f46569OooO0oO, this.f46570OooO0oo, this.f46565OooO, continuation);
        o00oo0o2.f46568OooO0o0 = obj;
        return o00oo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Object objAwait;
        o0OO0oO0 o0oo0oo1;
        String str;
        Object objAwait2;
        o0OO0oO0 o0oo0oo2;
        String str2;
        oo0o0Oo oo0o0oo;
        MutableState<Boolean> mutableState;
        Function1<Uri, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46566OooO0Oo;
        o00Oo0 o00oo1 = this.f46570OooO0oo;
        MutableState<Boolean> mutableState2 = this.f46569OooO0oO;
        oo0o0Oo oo0o0oo2 = this.f46567OooO0o;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.f46568OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                coroutineScope = (CoroutineScope) this.f46568OooO0o0;
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
                CoroutineScope coroutineScope2 = coroutineScope;
                if (objAwait instanceof o0OO0oO0) {
                    o0oo0oo1 = (o0OO0oO0) objAwait;
                } else {
                    o0oo0oo1 = null;
                }
                if (o0oo0oo1 != null) {
                    str = o0oo0oo1.f46918OooO0O0;
                } else {
                    str = null;
                }
                o0OO0O0.OooO00o("_PreView", "compress backgroundMusicFilePath :  " + str);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new o0OO00O(oo0o0oo2, o00oo1, mutableState2, null), 3, null);
                this.f46568OooO0o0 = o0oo0oo1;
                this.f46566OooO0Oo = 3;
                objAwait2 = deferredAsync$default.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (objAwait2 instanceof o0OO0oO0) {
                    o0oo0oo2 = (o0OO0oO0) objAwait2;
                } else {
                    o0oo0oo2 = null;
                }
                if (o0oo0oo2 != null) {
                    str2 = o0oo0oo2.f46918OooO0O0;
                } else {
                    str2 = null;
                }
                o0OO0O0.OooO00o("_PreView", "compress mp4FilePath :  " + str2);
                if (o0oo0oo2 == null) {
                    return Unit.INSTANCE;
                }
                oo0o0oo = this.f46567OooO0o;
                mutableState = this.f46569OooO0oO;
                function1 = this.f46565OooO;
                this.f46568OooO0o0 = null;
                this.f46566OooO0Oo = 4;
                if (o00Oo0.OooO0o0(o0oo0oo2, o0oo0oo1, oo0o0oo, mutableState, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                o0OO0oO0 o0oo0oo3 = (o0OO0oO0) this.f46568OooO0o0;
                ResultKt.throwOnFailure(obj);
                o0oo0oo1 = o0oo0oo3;
                objAwait2 = obj;
                if (objAwait2 instanceof o0OO0oO0) {
                    o0oo0oo2 = (o0OO0oO0) objAwait2;
                } else {
                    o0oo0oo2 = null;
                }
                if (o0oo0oo2 != null) {
                    str2 = o0oo0oo2.f46918OooO0O0;
                } else {
                    str2 = null;
                }
                o0OO0O0.OooO00o("_PreView", "compress mp4FilePath :  " + str2);
                if (o0oo0oo2 == null) {
                    return Unit.INSTANCE;
                }
                oo0o0oo = this.f46567OooO0o;
                mutableState = this.f46569OooO0oO;
                function1 = this.f46565OooO;
                this.f46568OooO0o0 = null;
                this.f46566OooO0Oo = 4;
                if (o00Oo0.OooO0o0(o0oo0oo2, o0oo0oo1, oo0o0oo, mutableState, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        coroutineScope = (CoroutineScope) this.f46568OooO0o0;
        OooO00o oooO00o = new OooO00o(oo0o0oo2, null);
        this.f46568OooO0o0 = coroutineScope;
        this.f46566OooO0Oo = 1;
        if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new o0Oo0oo(oo0o0oo2, o00oo1, mutableState2, null), 3, null);
        this.f46568OooO0o0 = coroutineScope;
        this.f46566OooO0Oo = 2;
        objAwait = deferredAsync$default2.await(this);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        CoroutineScope coroutineScope3 = coroutineScope;
        if (objAwait instanceof o0OO0oO0) {
            o0oo0oo1 = (o0OO0oO0) objAwait;
        } else {
            o0oo0oo1 = null;
        }
        if (o0oo0oo1 != null) {
            str = o0oo0oo1.f46918OooO0O0;
        } else {
            str = null;
        }
        o0OO0O0.OooO00o("_PreView", "compress backgroundMusicFilePath :  " + str);
        Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new o0OO00O(oo0o0oo2, o00oo1, mutableState2, null), 3, null);
        this.f46568OooO0o0 = o0oo0oo1;
        this.f46566OooO0Oo = 3;
        objAwait2 = deferredAsync$default3.await(this);
        if (objAwait2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (objAwait2 instanceof o0OO0oO0) {
            o0oo0oo2 = (o0OO0oO0) objAwait2;
        } else {
            o0oo0oo2 = null;
        }
        if (o0oo0oo2 != null) {
            str2 = o0oo0oo2.f46918OooO0O0;
        } else {
            str2 = null;
        }
        o0OO0O0.OooO00o("_PreView", "compress mp4FilePath :  " + str2);
        if (o0oo0oo2 == null) {
            return Unit.INSTANCE;
        }
        oo0o0oo = this.f46567OooO0o;
        mutableState = this.f46569OooO0oO;
        function1 = this.f46565OooO;
        this.f46568OooO0o0 = null;
        this.f46566OooO0Oo = 4;
        if (o00Oo0.OooO0o0(o0oo0oo2, o0oo0oo1, oo0o0oo, mutableState, function1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
