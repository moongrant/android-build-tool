package p579o0oOoo;

import android.graphics.Bitmap;
import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOOO;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
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
import p155o00OoO0o.OooOO0;
import p155o00OoO0o.OooOO0O;
import p415o0Oo0ooO.u0;
import p415o0Oo0ooO.w0;
import p417o0OoO0.o0OoOo0;
import p532o0o0Oo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomEnterFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEnterFileUtils.kt\ncom/yalla/yalla/util/RoomEnterFileUtils\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,68:1\n314#2,11:69\n*S KotlinDebug\n*F\n+ 1 RoomEnterFileUtils.kt\ncom/yalla/yalla/util/RoomEnterFileUtils\n*L\n43#1:69,11\n*E\n"})
public final class oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO f56647OooO00o = new oOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f56648OooO0O0 = new LinkedHashMap();

    @DebugMetadata(c = "com.yalla.yalla.util.RoomEnterFileUtils$downloadFile$2", f = "RoomEnterFileUtils.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56649OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f56650OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f56650OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f56650OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56649OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f56649OooO0Oo = 1;
                String str = this.f56650OooO0o0;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new u0(w0.OooO00o(str), str, null), this);
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
        public oOO f56651OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f56652OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public String f56653OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f56655OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f56652OooO0o = obj;
            this.f56655OooO0oo |= Integer.MIN_VALUE;
            return oOO.this.OooO0OO(null, this);
        }
    }

    public static NinePatchDrawable OooO00o(oOO ooo, Bitmap bitmap) {
        int iOooO00o = o0000O0.OooO00o(79);
        int iOooO00o2 = o0000O0.OooO00o(113);
        ooo.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return OooOO0.OooO0O0(bitmap, o000O0.OooO00o(), CollectionsKt.listOf(new OooOO0O(iOooO00o, iOooO00o2)), CollectionsKt.emptyList());
    }

    @Nullable
    public static Object OooO0O0(@NotNull String str, @NotNull Continuation continuation) {
        return TimeoutKt.withTimeoutOrNull(20000L, new OooO00o(str, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull String str, @NotNull Continuation<? super NinePatchDrawable> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        oOO ooo;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f56655OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f56655OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object result = oooO0O0.f56652OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f56655OooO0oo;
        LinkedHashMap linkedHashMap = f56648OooO0O0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) linkedHashMap.get(str);
            if (Intrinsics.areEqual(ninePatchDrawable != null ? o0OoOo0.OooO00o(ninePatchDrawable) : null, "")) {
                return (NinePatchDrawable) linkedHashMap.get(str);
            }
            oooO0O0.f56651OooO0Oo = this;
            oooO0O0.f56653OooO0o0 = str;
            oooO0O0.f56655OooO0oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0O0), 1);
            cancellableContinuationImpl.initCancellability();
            OooOOOO<Bitmap> oooOOOOOoooOo0 = OooO0OO.OooO0oo(o000O0.OooO00o()).OooO0oo().OoooOo0(str);
            oooOOOOOoooOo0.OoooO(new ooooO0O0(cancellableContinuationImpl), null, oooOOOOOoooOo0, o000000O.f54561OooO00o);
            result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO0O0);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            ooo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooO0O0.f56653OooO0o0;
            ooo = oooO0O0.f56651OooO0Oo;
            ResultKt.throwOnFailure(result);
        }
        Bitmap bitmap = (Bitmap) result;
        if (bitmap == null) {
            return null;
        }
        NinePatchDrawable ninePatchDrawableOooO00o = OooO00o(ooo, bitmap);
        if (ninePatchDrawableOooO00o == null) {
            return ninePatchDrawableOooO00o;
        }
        linkedHashMap.put(str, ninePatchDrawableOooO00o);
        return ninePatchDrawableOooO00o;
    }
}
