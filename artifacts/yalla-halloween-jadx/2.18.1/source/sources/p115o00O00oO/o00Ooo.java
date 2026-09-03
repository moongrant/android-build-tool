package p115o00O00oO;

import android.content.Context;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import coil.size.PixelSize;
import coil.size.Size;
import java.io.File;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o00O0OO0.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o00Oo0;
import p119o00O0Oo0.oo000o;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class o00Ooo implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f30357OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Context f30358OooO0O0;

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {174, 148}, m = "decode", n = {"this", "source", "size", "options", "isSampled", "options", "isSampled", "baseDrawable"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public o00oO0o f30359Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f30360Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f30361Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Object f30362Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f30363OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public /* synthetic */ Object f30364OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Ref.BooleanRef f30365OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30364OoooO0 = obj;
            this.f30363OoooO |= Integer.MIN_VALUE;
            return o00Ooo.this.OooO0O0(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder$decode$drawable$1", f = "ImageDecoderDecoder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Drawable f30367Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30368Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30369Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Drawable drawable, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30367Oooo0o = drawable;
            this.f30368Oooo0oO = function0;
            this.f30369Oooo0oo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f30367Oooo0o, this.f30368Oooo0oO, this.f30369Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ((AnimatedImageDrawable) this.f30367Oooo0o).registerAnimationCallback(new o00Oo0(this.f30368Oooo0oO, this.f30369Oooo0oo));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f30370OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Size f30371OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o00oO0o f30372OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f30373OooO0Oo;

        public OooO0OO(Ref.ObjectRef objectRef, Size size, o00oO0o o00oo0o2, Ref.BooleanRef booleanRef) {
            this.f30370OooO00o = objectRef;
            this.f30371OooO0O0 = size;
            this.f30372OooO0OO = o00oo0o2;
            this.f30373OooO0Oo = booleanRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@NotNull ImageDecoder decoder, @NotNull ImageDecoder.ImageInfo info, @NotNull ImageDecoder.Source source) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(source, "source");
            File file = (File) this.f30370OooO00o.element;
            if (file != null) {
                file.delete();
            }
            if (this.f30371OooO0O0 instanceof PixelSize) {
                android.util.Size size = info.getSize();
                Intrinsics.checkNotNullExpressionValue(size, "size");
                int width = size.getWidth();
                int height = size.getHeight();
                PixelSize pixelSize = (PixelSize) this.f30371OooO0O0;
                double dOooO0O0 = Oooo000.OooO0O0(width, height, pixelSize.f9946Oooo0o, pixelSize.f9947Oooo0oO, this.f30372OooO0OO.f30378OooO0Oo);
                Ref.BooleanRef booleanRef = this.f30373OooO0Oo;
                boolean z = dOooO0O0 < 1.0d;
                booleanRef.element = z;
                if (z || !this.f30372OooO0OO.f30380OooO0o0) {
                    decoder.setTargetSize(MathKt.roundToInt(((double) width) * dOooO0O0), MathKt.roundToInt(dOooO0O0 * ((double) height)));
                }
            }
            decoder.setAllocator(oo000o.OooO00o(this.f30372OooO0OO.f30376OooO0O0) ? 3 : 1);
            decoder.setMemorySizePolicy(!this.f30372OooO0OO.f30379OooO0o ? 1 : 0);
            ColorSpace colorSpace = this.f30372OooO0OO.f30377OooO0OO;
            if (colorSpace != null) {
                decoder.setTargetColorSpace(colorSpace);
            }
            decoder.setUnpremultipliedRequired(!this.f30372OooO0OO.f30381OooO0oO);
            OooOOOO oooOOOO = this.f30372OooO0OO.f30374OooO;
            Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
            oooOOOO.OooO0O0("coil#animated_transformation");
            decoder.setPostProcessor(null);
        }
    }

    @Deprecated(message = "Migrate to the constructor that accepts a Context.", replaceWith = @ReplaceWith(expression = "ImageDecoderDecoder(context)", imports = {}))
    public o00Ooo() {
        this.f30357OooO00o = false;
        this.f30358OooO0O0 = null;
    }

    @Override // p115o00O00oO.Oooo0
    public final boolean OooO00o(@NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (Oooo000.OooO0OO(source)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source, "source");
        if ((source.Ooooo00(0L, Oooo000.f30347OooO0Oo) && source.Ooooo00(8L, Oooo000.f30349OooO0o0)) && source.Ooooo00(12L, Oooo000.f30348OooO0o) && source.request(17L) && ((byte) (source.OooO0o0().OooOOoo(16L) & 2)) > 0) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(source, "source");
            if (source.Ooooo00(4L, Oooo000.f30350OooO0oO) && (source.Ooooo00(8L, Oooo000.f30351OooO0oo) || source.Ooooo00(8L, Oooo000.f30343OooO) || source.Ooooo00(8L, Oooo000.f30352OooOO0))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, java.io.File] */
    @Override // p115o00O00oO.Oooo0
    @Nullable
    public final Object OooO0O0(@NotNull p113o00O00Oo.OooO0O0 oooO0O0, @NotNull o0oOOo o0oooo2, @NotNull Size size, @NotNull o00oO0o o00oo0o2, @NotNull Continuation<? super OooOo> continuation) throws Exception {
        OooO00o oooO00o;
        ImageDecoder.Source sourceCreateSource;
        Ref.BooleanRef booleanRef;
        File cacheDir;
        Drawable oooO0OO;
        o00oO0o o00oo0o3;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f30363OoooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f30363OoooO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f30364OoooO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f30363OoooO;
        if (i2 != 0) {
            if (i2 == 1) {
                Ref.BooleanRef booleanRef2 = oooO00o.f30365OoooO00;
                o00oo0o2 = oooO00o.f30359Oooo;
                ResultKt.throwOnFailure(obj);
                booleanRef = booleanRef2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0OO = (Drawable) oooO00o.f30362Oooo0oo;
                booleanRef = (Ref.BooleanRef) oooO00o.f30361Oooo0oO;
                o00oo0o3 = (o00oO0o) oooO00o.f30360Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o2 = o00oo0o3;
            oooO0OO = new oo00o.OooO0OO(oooO0OO, o00oo0o2.f30378OooO0Oo);
            return new OooOo(oooO0OO, booleanRef.element);
        }
        ResultKt.throwOnFailure(obj);
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        oooO00o.f30360Oooo0o = this;
        oooO00o.f30361Oooo0oO = o0oooo2;
        oooO00o.f30362Oooo0oo = size;
        oooO00o.f30359Oooo = o00oo0o2;
        oooO00o.f30365OoooO00 = booleanRef3;
        oooO00o.f30363OoooO = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            oo000o oo000oVar = new oo000o(cancellableContinuationImpl, o0oooo2);
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                try {
                    o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(oo000oVar);
                    if (this.f30357OooO00o && Oooo000.OooO0OO(o0ooooOooO0OO)) {
                        o0ooooOooO0OO = o0O000Oo.OooO0OO(new o00O0O(o0ooooOooO0OO));
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        try {
                            o0O00OO o0o00oo2 = (o0O00OO) o0ooooOooO0OO;
                            byte[] bArrOooOoo0 = o0o00oo2.OooOoo0();
                            CloseableKt.closeFinally(o0o00oo2, null);
                            sourceCreateSource = ImageDecoder.createSource(ByteBuffer.wrap(bArrOooOoo0));
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(o0ooooOooO0OO, th);
                                throw th2;
                            }
                        }
                    } else {
                        Context context = this.f30358OooO0O0;
                        if (context == null || (cacheDir = context.getCacheDir()) == null) {
                            cacheDir = null;
                        } else {
                            cacheDir.mkdirs();
                            Unit unit = Unit.INSTANCE;
                        }
                        ?? CreateTempFile = File.createTempFile("tmp", null, cacheDir);
                        objectRef.element = CreateTempFile;
                        try {
                            o0O00o00 o0o00o00OooO0oO = o0O000Oo.OooO0oO(CreateTempFile);
                            try {
                                o0O00OO o0o00oo3 = (o0O00OO) o0ooooOooO0OO;
                                o0o00oo3.OooOO0O(o0o00o00OooO0oO);
                                CloseableKt.closeFinally(o0o00o00OooO0oO, null);
                                CloseableKt.closeFinally(o0o00oo3, null);
                                sourceCreateSource = ImageDecoder.createSource((File) objectRef.element);
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    CloseableKt.closeFinally(o0o00o00OooO0oO, th3);
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                CloseableKt.closeFinally(o0ooooOooO0OO, th5);
                                throw th6;
                            }
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(sourceCreateSource, "if (SDK_INT >= 30) {\n   …mpFile)\n                }");
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceCreateSource, new OooO0OO(objectRef, size, o00oo0o2, booleanRef3));
                    Intrinsics.checkNotNullExpressionValue(drawableDecodeDrawable, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Drawable {\n    return ImageDecoder.decodeDrawable(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
                    File file = (File) objectRef.element;
                    if (file != null) {
                        Boxing.boxBoolean(file.delete());
                    }
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(drawableDecodeDrawable));
                    oo000oVar.OooO00o();
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(oooO00o);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef3;
                    obj = result;
                } catch (Throwable th7) {
                    File file2 = (File) objectRef.element;
                    if (file2 != null) {
                        Boxing.boxBoolean(file2.delete());
                    }
                    throw th7;
                }
            } catch (Throwable th8) {
                oo000oVar.OooO00o();
                throw th8;
            }
        } catch (Exception e) {
            if (!(e instanceof InterruptedException) && !(e instanceof InterruptedIOException)) {
                throw e;
            }
            Throwable thInitCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e);
            Intrinsics.checkNotNullExpressionValue(thInitCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw thInitCause;
        }
        oooO0OO = (Drawable) obj;
        if (oooO0OO instanceof AnimatedImageDrawable) {
            OooOOOO oooOOOO = o00oo0o2.f30374OooO;
            Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
            oooOOOO.OooO0O0("coil#repeat_count");
            ((AnimatedImageDrawable) oooO0OO).setRepeatCount(-1);
            OooOOOO oooOOOO2 = o00oo0o2.f30374OooO;
            Intrinsics.checkNotNullParameter(oooOOOO2, "<this>");
            oooOOOO2.OooO0O0("coil#animation_start_callback");
            Function0 function0 = (Function0) TypeIntrinsics.beforeCheckcastToFunctionOfArity(null, 0);
            OooOOOO oooOOOO3 = o00oo0o2.f30374OooO;
            Intrinsics.checkNotNullParameter(oooOOOO3, "<this>");
            oooOOOO3.OooO0O0("coil#animation_end_callback");
            Function0 function1 = (Function0) TypeIntrinsics.beforeCheckcastToFunctionOfArity(null, 0);
            if (function0 != null || function1 != null) {
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                OooO0O0 oooO0O1 = new OooO0O0(oooO0OO, function0, function1, null);
                oooO00o.f30360Oooo0o = o00oo0o2;
                oooO00o.f30361Oooo0oO = booleanRef;
                oooO00o.f30362Oooo0oo = oooO0OO;
                oooO00o.f30359Oooo = null;
                oooO00o.f30365OoooO00 = null;
                oooO00o.f30363OoooO = 2;
                if (BuildersKt.withContext(immediate, oooO0O1, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o3 = o00oo0o2;
                o00oo0o2 = o00oo0o3;
            }
            oooO0OO = new oo00o.OooO0OO(oooO0OO, o00oo0o2.f30378OooO0Oo);
        }
        return new OooOo(oooO0OO, booleanRef.element);
    }

    public o00Ooo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30357OooO00o = false;
        this.f30358OooO0O0 = context;
    }
}
