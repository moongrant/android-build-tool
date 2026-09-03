package p590o0oOooo0;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOOO;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p174o00OooOo.o00O0OO0;
import p203o00o0o00.o000O0o;
import p203o00o0o00.o000Oo0;
import p393o0Oo.o00O0O;
import p393o0Oo.o00Ooo;
import p423o0OoO0OO.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomEnterFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterFileUtils.kt\ncom/yalla/yalla/util/RoomEnterFileUtils\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,68:1\n314#2,11:69\n*S KotlinDebug\n*F\n+ 1 RoomEnterFileUtils.kt\ncom/yalla/yalla/util/RoomEnterFileUtils\n*L\n43#1:69,11\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final q0 f57260OooO00o = new q0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f57261OooO0O0 = new LinkedHashMap();

    @DebugMetadata(c = "com.yalla.yalla.util.RoomEnterFileUtils$downloadFile$2", f = "RoomEnterFileUtils.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f57262OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f57263OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f57263OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f57263OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f57262OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f57262OooO0Oo = 1;
                String str = this.f57263OooO0o0;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new o00O0O(o00Ooo.OooO00o(str), str, null), this);
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

    @DebugMetadata(c = "com.yalla.yalla.util.RoomEnterFileUtils", f = "RoomEnterFileUtils.kt", i = {0, 0}, l = {27}, m = "loadNinePatch", n = {"this", "url"}, s = {"L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public q0 f57264OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f57265OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f57266OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f57268OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f57265OooO0o = obj;
            this.f57268OooO0oo |= Integer.MIN_VALUE;
            return q0.this.OooO0OO(null, this);
        }
    }

    public static NinePatchDrawable OooO00o(q0 q0Var, Bitmap bitmap) {
        int iOooO00o = o0000O0.OooO00o(79);
        int iOooO00o2 = o0000O0.OooO00o(113);
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return o000O0o.OooO0O0(bitmap, o000O00O.OooO00o(), CollectionsKt.listOf(new o000Oo0(iOooO00o, iOooO00o2)), CollectionsKt.emptyList());
    }

    @Nullable
    public static Object OooO0O0(@NotNull String str, @NotNull Continuation continuation) {
        return TimeoutKt.withTimeoutOrNull(20000L, new OooO00o(str, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull String str, @NotNull Continuation<? super NinePatchDrawable> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        q0 q0Var;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f57268OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f57268OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object result = oooO0O0.f57265OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f57268OooO0oo;
        LinkedHashMap linkedHashMap = f57261OooO0O0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) linkedHashMap.get(str);
            if (Intrinsics.areEqual(ninePatchDrawable != null ? o0000oo.OooO00o(ninePatchDrawable) : null, "")) {
                return (NinePatchDrawable) linkedHashMap.get(str);
            }
            oooO0O0.f57264OooO0Oo = this;
            oooO0O0.f57266OooO0o0 = str;
            oooO0O0.f57268OooO0oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0O0), 1);
            cancellableContinuationImpl.initCancellability();
            OooOOOO<Bitmap> OoooOoO2 = OooO0OO.OooO0oo(o000O00O.OooO00o()).OooO0oO().OoooOoO(str);
            OoooOoO2.OoooO(new p0(cancellableContinuationImpl), null, OoooOoO2, o00O0OO0.f38344OooO00o);
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO0O0);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            q0Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooO0O0.f57266OooO0o0;
            q0Var = oooO0O0.f57264OooO0Oo;
            ResultKt.throwOnFailure(result);
        }
        Bitmap bitmap = (Bitmap) result;
        if (bitmap == null) {
            return null;
        }
        NinePatchDrawable ninePatchDrawableOooO00o = OooO00o(q0Var, bitmap);
        if (ninePatchDrawableOooO00o == null) {
            return ninePatchDrawableOooO00o;
        }
        linkedHashMap.put(str, ninePatchDrawableOooO00o);
        return ninePatchDrawableOooO00o;
    }
}
