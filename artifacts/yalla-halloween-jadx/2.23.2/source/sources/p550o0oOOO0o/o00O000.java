package p550o0oOOO0o;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p363o0OOo00O.OooO;
import p460o0Ooo0o.o00O;
import p460o0Ooo0o.oo0o0O0;
import p551o0oOOOoo.oO0Oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$onNextClick$2", f = "MediaPreviewScreen.kt", i = {0, 1, 2}, l = {462, 468, 473, 479}, m = "invokeSuspend", n = {"$this$launchIO", "$this$launchIO", "audioCmdResult"}, s = {"L$0", "L$0", "L$0"})
public final class o00O000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function1<Uri, Unit> f55898OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f55899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f55900OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f55901OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55902OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f55903OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.module.media.preview.MediaPreviewScreenKt$onNextClick$2$1", f = "MediaPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f55904OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00OO o00o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f55904OooO0Oo = o00o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f55904OooO0Oo, continuation);
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
            OooO oooOOooO0o0 = this.f55904OooO0Oo.OooO0o0();
            if (oooOOooO0o0 == null) {
                return null;
            }
            oooOOooO0o0.pause();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O000(o00O00OO o00o00oo2, MutableState<Boolean> mutableState, oO0Oo oo0oo, Function1<? super Uri, Unit> function1, Continuation<? super o00O000> continuation) {
        super(2, continuation);
        this.f55900OooO0o = o00o00oo2;
        this.f55902OooO0oO = mutableState;
        this.f55903OooO0oo = oo0oo;
        this.f55898OooO = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O000 o00o001 = new o00O000(this.f55900OooO0o, this.f55902OooO0oO, this.f55903OooO0oo, this.f55898OooO, continuation);
        o00o001.f55901OooO0o0 = obj;
        return o00o001;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        o00O o00o2;
        String str;
        Object objAwait2;
        o00O o00o3;
        String str2;
        o00O00OO o00o00oo2;
        MutableState<Boolean> mutableState;
        Function1<Uri, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f55899OooO0Oo;
        oO0Oo oo0oo = this.f55903OooO0oo;
        MutableState<Boolean> mutableState2 = this.f55902OooO0oO;
        o00O00OO o00o00oo3 = this.f55900OooO0o;
        if (i != 0) {
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.f55901OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                coroutineScope = (CoroutineScope) this.f55901OooO0o0;
                ResultKt.throwOnFailure(obj);
                objAwait = obj;
                CoroutineScope coroutineScope2 = coroutineScope;
                if (objAwait instanceof o00O) {
                    o00o2 = (o00O) objAwait;
                } else {
                    o00o2 = null;
                }
                if (o00o2 != null) {
                    str = o00o2.f47777OooO0O0;
                } else {
                    str = null;
                }
                oo0o0O0.OooO00o("_PreView", "compress backgroundMusicFilePath :  " + str);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new oOO00O(o00o00oo3, oo0oo, mutableState2, null), 3, null);
                this.f55901OooO0o0 = o00o2;
                this.f55899OooO0Oo = 3;
                objAwait2 = deferredAsync$default.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (objAwait2 instanceof o00O) {
                    o00o3 = (o00O) objAwait2;
                } else {
                    o00o3 = null;
                }
                if (o00o3 != null) {
                    str2 = o00o3.f47777OooO0O0;
                } else {
                    str2 = null;
                }
                oo0o0O0.OooO00o("_PreView", "compress mp4FilePath :  " + str2);
                if (o00o3 == null) {
                    return Unit.INSTANCE;
                }
                o00o00oo2 = this.f55900OooO0o;
                mutableState = this.f55902OooO0oO;
                function1 = this.f55898OooO;
                this.f55901OooO0o0 = null;
                this.f55899OooO0Oo = 4;
                if (o00O0000.OooO0o0(o00o3, o00o2, o00o00oo2, mutableState, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                o00O o00o4 = (o00O) this.f55901OooO0o0;
                ResultKt.throwOnFailure(obj);
                o00o2 = o00o4;
                objAwait2 = obj;
                if (objAwait2 instanceof o00O) {
                    o00o3 = (o00O) objAwait2;
                } else {
                    o00o3 = null;
                }
                if (o00o3 != null) {
                    str2 = o00o3.f47777OooO0O0;
                } else {
                    str2 = null;
                }
                oo0o0O0.OooO00o("_PreView", "compress mp4FilePath :  " + str2);
                if (o00o3 == null) {
                    return Unit.INSTANCE;
                }
                o00o00oo2 = this.f55900OooO0o;
                mutableState = this.f55902OooO0oO;
                function1 = this.f55898OooO;
                this.f55901OooO0o0 = null;
                this.f55899OooO0Oo = 4;
                if (o00O0000.OooO0o0(o00o3, o00o2, o00o00oo2, mutableState, function1, this) == coroutine_suspended) {
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
        coroutineScope = (CoroutineScope) this.f55901OooO0o0;
        OooO00o oooO00o = new OooO00o(o00o00oo3, null);
        this.f55901OooO0o0 = coroutineScope;
        this.f55899OooO0Oo = 1;
        if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new o00O00O(o00o00oo3, oo0oo, mutableState2, null), 3, null);
        this.f55901OooO0o0 = coroutineScope;
        this.f55899OooO0Oo = 2;
        objAwait = deferredAsync$default2.await(this);
        if (objAwait == coroutine_suspended) {
            return coroutine_suspended;
        }
        CoroutineScope coroutineScope3 = coroutineScope;
        if (objAwait instanceof o00O) {
            o00o2 = (o00O) objAwait;
        } else {
            o00o2 = null;
        }
        if (o00o2 != null) {
            str = o00o2.f47777OooO0O0;
        } else {
            str = null;
        }
        oo0o0O0.OooO00o("_PreView", "compress backgroundMusicFilePath :  " + str);
        Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope3, null, null, new oOO00O(o00o00oo3, oo0oo, mutableState2, null), 3, null);
        this.f55901OooO0o0 = o00o2;
        this.f55899OooO0Oo = 3;
        objAwait2 = deferredAsync$default3.await(this);
        if (objAwait2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (objAwait2 instanceof o00O) {
            o00o3 = (o00O) objAwait2;
        } else {
            o00o3 = null;
        }
        if (o00o3 != null) {
            str2 = o00o3.f47777OooO0O0;
        } else {
            str2 = null;
        }
        oo0o0O0.OooO00o("_PreView", "compress mp4FilePath :  " + str2);
        if (o00o3 == null) {
            return Unit.INSTANCE;
        }
        o00o00oo2 = this.f55900OooO0o;
        mutableState = this.f55902OooO0oO;
        function1 = this.f55898OooO;
        this.f55901OooO0o0 = null;
        this.f55899OooO0Oo = 4;
        if (o00O0000.OooO0o0(o00o3, o00o2, o00o00oo2, mutableState, function1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
