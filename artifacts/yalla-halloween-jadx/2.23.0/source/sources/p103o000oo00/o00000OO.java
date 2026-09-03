package p103o000oo00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104o000oo0O.oOO00O;
import p105o000oo0o.oo0oOO0;
import p109o000ooo.o0OO00O;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O00O;
import p321o0O0ooO.o000O0O0;
import p659o0oooO00.o0000;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class o00000OO implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f35670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35671OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f35672OooO0OO;

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f35673OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f35674OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f35675OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Drawable drawable, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f35673OooO0Oo = drawable;
            this.f35675OooO0o0 = function0;
            this.f35674OooO0o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f35673OooO0Oo, this.f35675OooO0o0, this.f35674OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000OO.OooO00o(this.f35673OooO0Oo).registerAnimationCallback(new o000O00O(this.f35675OooO0o0, this.f35674OooO0o));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements o000oOoO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f35676OooO00o = true;

        /* JADX WARN: Code duplicated, block: B:39:0x008a  */
        @Override // o000oo00.o000oOoO.OooO00o
        @Nullable
        public final o000oOoO OooO00o(@NotNull oo0oOO0 oo0ooo0, @NotNull o0Oo0oo o0oo0oo2) {
            o0000 o0000VarOooOOo0 = oo0ooo0.f35800OooO00o.OooOOo0();
            boolean z = false;
            if (o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35713OooO0O0) || o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35712OooO00o)) {
                z = true;
            } else {
                if ((o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35714OooO0OO) && o0000VarOooOOo0.Oooo00O(8L, o0ooOOo.f35715OooO0Oo)) && o0000VarOooOOo0.Oooo00O(12L, o0ooOOo.f35717OooO0o0) && o0000VarOooOOo0.request(17L) && ((byte) (o0000VarOooOOo0.OooO0O0().OooOo(16L) & 2)) > 0) {
                    z = true;
                } else if (Build.VERSION.SDK_INT >= 30) {
                    if (o0000VarOooOOo0.Oooo00O(4L, o0ooOOo.f35716OooO0o) && (o0000VarOooOOo0.Oooo00O(8L, o0ooOOo.f35718OooO0oO) || o0000VarOooOOo0.Oooo00O(8L, o0ooOOo.f35719OooO0oo) || o0000VarOooOOo0.Oooo00O(8L, o0ooOOo.f35711OooO))) {
                        z = true;
                    }
                }
            }
            if (z) {
                return new o00000OO(oo0ooo0.f35800OooO00o, o0oo0oo2, this.f35676OooO00o);
            }
            return null;
        }

        public final boolean equals(@Nullable Object obj) {
            return obj instanceof OooO00o;
        }

        public final int hashCode() {
            return OooO00o.class.hashCode();
        }
    }

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0, 1}, l = {50, 90}, m = "decode", n = {"this", "isSampled", "isSampled"}, s = {"L$0", "L$1", "L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f35677OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f35678OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Ref.BooleanRef f35679OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f35681OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35678OooO0o = obj;
            this.f35681OooO0oo |= Integer.MIN_VALUE;
            return o00000OO.this.OooO00o(this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Drawable> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f35683OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.BooleanRef booleanRef) {
            super(0);
            this.f35683OooO0o0 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() throws IOException {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            o00000OO o00000oo2 = o00000OO.this;
            o0000OO0 o000o001 = o00000oo2.f35670OooO00o;
            if (o00000oo2.f35672OooO0OO) {
                o0000 o0000VarOooOOo0 = o000o001.OooOOo0();
                if (o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35713OooO0O0) || o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35712OooO00o)) {
                    o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(new o00oO0o(o000o001.OooOOo0()));
                    Context context = o00000oo2.f35671OooO0O0.f35863OooO00o;
                    Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
                    File cacheDir = context.getCacheDir();
                    cacheDir.mkdirs();
                    o000o001 = new o000O000(o00o0000OooO0O0, cacheDir, null);
                }
            }
            try {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(o00000OO.OooO0O0(o00000oo2, o000o001), new o0000O0O(objectRef, o00000oo2, this.f35683OooO0o0));
                Intrinsics.checkNotNullExpressionValue(drawableDecodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
                return drawableDecodeDrawable;
            } finally {
                ImageDecoder imageDecoderOooO00o = o0000.OooO00o(objectRef.element);
                if (imageDecoderOooO00o != null) {
                    imageDecoderOooO00o.close();
                }
                o000o001.close();
            }
        }
    }

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0}, l = {158}, m = "wrapDrawable", n = {"this", "baseDrawable"}, s = {"L$0", "L$1"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00000OO f35684OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f35685OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Drawable f35686OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f35688OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35685OooO0o = obj;
            this.f35688OooO0oo |= Integer.MIN_VALUE;
            return o00000OO.this.OooO0OO(null, this);
        }
    }

    @JvmOverloads
    public o00000OO(@NotNull o0000OO0 o0000oo1, @NotNull o0Oo0oo o0oo0oo2, boolean z) {
        this.f35670OooO00o = o0000oo1;
        this.f35671OooO0O0 = o0oo0oo2;
        this.f35672OooO0OO = z;
    }

    public static final ImageDecoder.Source OooO0O0(o00000OO o00000oo2, o0000OO0 o0000oo1) {
        o00000oo2.getClass();
        o000OO00 o000oo00OooO0OO = o0000oo1.OooO0OO();
        if (o000oo00OooO0OO != null) {
            return ImageDecoder.createSource(o000oo00OooO0OO.OooO0Oo());
        }
        o0000OO0.OooO00o oooO00oOooO0oO = o0000oo1.OooO0oO();
        boolean z = oooO00oOooO0oO instanceof OooOOO0;
        o0Oo0oo o0oo0oo2 = o00000oo2.f35671OooO0O0;
        if (z) {
            return ImageDecoder.createSource(o0oo0oo2.f35863OooO00o.getAssets(), ((OooOOO0) oooO00oOooO0oO).f35650OooO00o);
        }
        if (oooO00oOooO0oO instanceof OooOo) {
            return ImageDecoder.createSource(o0oo0oo2.f35863OooO00o.getContentResolver(), ((OooOo) oooO00oOooO0oO).f35651OooO00o);
        }
        if (oooO00oOooO0oO instanceof o000) {
            o000 o000Var = (o000) oooO00oOooO0oO;
            if (Intrinsics.areEqual(o000Var.f35667OooO00o, o0oo0oo2.f35863OooO00o.getPackageName())) {
                return ImageDecoder.createSource(o0oo0oo2.f35863OooO00o.getResources(), o000Var.f35668OooO0O0);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return ImageDecoder.createSource(o0000oo1.OooOOo0().o00Ooo());
        }
        return i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(o0000oo1.OooOOo0().o00Ooo())) : ImageDecoder.createSource(o0000oo1.OooO00o().OooO0Oo());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p103o000oo00.o000oOoO
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super Oooo000> continuation) {
        OooO0O0 oooO0O0;
        o00000OO o00000oo2;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f35681OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f35681OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0OO = oooO0O0.f35678OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f35681OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                booleanRef = oooO0O0.f35679OooO0o0;
                o00000oo2 = (o00000OO) oooO0O0.f35677OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef2 = (Ref.BooleanRef) oooO0O0.f35677OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
            }
            return new Oooo000((Drawable) objOooO0OO, booleanRef2.element);
        }
        ResultKt.throwOnFailure(objOooO0OO);
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        OooO0OO oooO0OO = new OooO0OO(booleanRef3);
        oooO0O0.f35677OooO0Oo = this;
        oooO0O0.f35679OooO0o0 = booleanRef3;
        oooO0O0.f35681OooO0oo = 1;
        Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, oooO0OO, oooO0O0, 1, null);
        if (objRunInterruptible$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00000oo2 = this;
        booleanRef = booleanRef3;
        objOooO0OO = objRunInterruptible$default;
        oooO0O0.f35677OooO0Oo = booleanRef;
        oooO0O0.f35679OooO0o0 = null;
        oooO0O0.f35681OooO0oo = 2;
        objOooO0OO = o00000oo2.OooO0OO((Drawable) objOooO0OO, oooO0O0);
        if (objOooO0OO == coroutine_suspended) {
            return coroutine_suspended;
        }
        booleanRef2 = booleanRef;
        return new Oooo000((Drawable) objOooO0OO, booleanRef2.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0OO(Drawable drawable, Continuation<? super Drawable> continuation) {
        OooO0o oooO0o;
        o00000OO o00000oo2;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f35688OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f35688OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object obj = oooO0o.f35685OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f35688OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!o0Oo0oo.OooO00o(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableOooO0O0 = OooO0OO.OooO0OO.OooO0O0(drawable);
            o0Oo0oo o0oo0oo2 = this.f35671OooO0O0;
            Integer num = (Integer) o0oo0oo2.f35873OooOO0o.OooO00o("coil#repeat_count");
            animatedImageDrawableOooO0O0.setRepeatCount(num != null ? num.intValue() : -1);
            o0OO00O o0oo00o2 = o0oo0oo2.f35873OooOO0o;
            Function0 function0 = (Function0) o0oo00o2.OooO00o("coil#animation_start_callback");
            Function0 function1 = (Function0) o0oo00o2.OooO00o("coil#animation_end_callback");
            if (function0 != null || function1 != null) {
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                OooO oooO = new OooO(drawable, function0, function1, null);
                oooO0o.f35684OooO0Oo = this;
                oooO0o.f35686OooO0o0 = drawable;
                oooO0o.f35688OooO0oo = 1;
                if (BuildersKt.withContext(immediate, oooO, oooO0o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            o00000oo2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = oooO0o.f35686OooO0o0;
            o00000oo2 = oooO0o.f35684OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        return new oOO00O(drawable, o00000oo2.f35671OooO0O0.f35868OooO0o0);
    }
}
