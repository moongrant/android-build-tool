package p124o00O0o00;

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
import o00OO00O.OooOO0O;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p123o00O0o0.o000oOoO;
import p125o00O0o0O.oo0o0Oo;
import p131o00O0oo0.o000OOo;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public final class o00000O0 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OO f36544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f36546OooO0OO;

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Drawable f36547OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f36548OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f36549OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Drawable drawable, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f36547OooO0Oo = drawable;
            this.f36549OooO0o0 = function0;
            this.f36548OooO0o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f36547OooO0Oo, this.f36549OooO0o0, this.f36548OooO0o, continuation);
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
            o0000O0.OooO00o(this.f36547OooO0Oo).registerAnimationCallback(new OooOO0O(this.f36549OooO0o0, this.f36548OooO0o));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f36550OooO00o = true;

        /* JADX WARN: Code duplicated, block: B:39:0x008a  */
        @Override // o00O0o00.OooOOOO.OooO00o
        @Nullable
        public final OooOOOO OooO00o(@NotNull oo0o0Oo oo0o0oo, @NotNull o0O0O00 o0o0o00) {
            o0O0o0 o0o0o0OooOOo = oo0o0oo.f36632OooO00o.OooOOo();
            boolean z = false;
            if (o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36583OooO0O0) || o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36582OooO00o)) {
                z = true;
            } else {
                if ((o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36584OooO0OO) && o0o0o0OooOOo.Oooo00O(8L, o00O0O.f36585OooO0Oo)) && o0o0o0OooOOo.Oooo00O(12L, o00O0O.f36587OooO0o0) && o0o0o0OooOOo.request(17L) && ((byte) (o0o0o0OooOOo.OooO0O0().OooOo(16L) & 2)) > 0) {
                    z = true;
                } else if (Build.VERSION.SDK_INT >= 30) {
                    if (o0o0o0OooOOo.Oooo00O(4L, o00O0O.f36586OooO0o) && (o0o0o0OooOOo.Oooo00O(8L, o00O0O.f36588OooO0oO) || o0o0o0OooOOo.Oooo00O(8L, o00O0O.f36589OooO0oo) || o0o0o0OooOOo.Oooo00O(8L, o00O0O.f36581OooO))) {
                        z = true;
                    }
                }
            }
            if (z) {
                return new o00000O0(oo0o0oo.f36632OooO00o, o0o0o00, this.f36550OooO00o);
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
        public Object f36551OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f36552OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Ref.BooleanRef f36553OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f36555OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36552OooO0o = obj;
            this.f36555OooO0oo |= Integer.MIN_VALUE;
            return o00000O0.this.OooO00o(this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Drawable> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f36557OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.BooleanRef booleanRef) {
            super(0);
            this.f36557OooO0o0 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() throws IOException {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            o00000O0 o00000o1 = o00000O0.this;
            o000OO o0000oo1 = o00000o1.f36544OooO00o;
            if (o00000o1.f36546OooO0OO) {
                o0O0o0 o0o0o0OooOOo = o0000oo1.OooOOo();
                if (o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36583OooO0O0) || o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36582OooO00o)) {
                    o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(new o0OoOo0(o0000oo1.OooOOo()));
                    Context context = o00000o1.f36545OooO0O0.f36838OooO00o;
                    Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
                    File cacheDir = context.getCacheDir();
                    cacheDir.mkdirs();
                    o0000oo1 = new o0000OO0(o0o0000VarOooO0O0, cacheDir, null);
                }
            }
            try {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(o00000O0.OooO0O0(o00000o1, o0000oo1), new o0000oo(objectRef, o00000o1, this.f36557OooO0o0));
                Intrinsics.checkNotNullExpressionValue(drawableDecodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
                return drawableDecodeDrawable;
            } finally {
                ImageDecoder imageDecoderOooO00o = o00000OO.OooO00o(objectRef.element);
                if (imageDecoderOooO00o != null) {
                    imageDecoderOooO00o.close();
                }
                o0000oo1.close();
            }
        }
    }

    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0}, l = {158}, m = "wrapDrawable", n = {"this", "baseDrawable"}, s = {"L$0", "L$1"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00000O0 f36558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f36559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Drawable f36560OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f36562OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36559OooO0o = obj;
            this.f36562OooO0oo |= Integer.MIN_VALUE;
            return o00000O0.this.OooO0OO(null, this);
        }
    }

    @JvmOverloads
    public o00000O0(@NotNull o000OO o000oo2, @NotNull o0O0O00 o0o0o00, boolean z) {
        this.f36544OooO00o = o000oo2;
        this.f36545OooO0O0 = o0o0o00;
        this.f36546OooO0OO = z;
    }

    public static final ImageDecoder.Source OooO0O0(o00000O0 o00000o1, o000OO o000oo2) {
        o00000o1.getClass();
        o0OOOO00 o0oooo00OooO0OO = o000oo2.OooO0OO();
        if (o0oooo00OooO0OO != null) {
            return ImageDecoder.createSource(o0oooo00OooO0OO.OooO0Oo());
        }
        o000OO.OooO00o oooO00oOooO0oO = o000oo2.OooO0oO();
        boolean z = oooO00oOooO0oO instanceof p124o00O0o00.OooO0OO;
        o0O0O00 o0o0o00 = o00000o1.f36545OooO0O0;
        if (z) {
            return ImageDecoder.createSource(o0o0o00.f36838OooO00o.getAssets(), ((p124o00O0o00.OooO0OO) oooO00oOooO0oO).f36520OooO00o);
        }
        if (oooO00oOooO0oO instanceof OooOO0O) {
            return ImageDecoder.createSource(o0o0o00.f36838OooO00o.getContentResolver(), ((OooOO0O) oooO00oOooO0oO).f36534OooO00o);
        }
        if (oooO00oOooO0oO instanceof o0000O) {
            o0000O o0000o2 = (o0000O) oooO00oOooO0oO;
            if (Intrinsics.areEqual(o0000o2.f36563OooO00o, o0o0o00.f36838OooO00o.getPackageName())) {
                return ImageDecoder.createSource(o0o0o00.f36838OooO00o.getResources(), o0000o2.f36564OooO0O0);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return ImageDecoder.createSource(o000oo2.OooOOo().o00ooo());
        }
        return i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(o000oo2.OooOOo().o00ooo())) : ImageDecoder.createSource(o000oo2.OooO00o().OooO0Oo());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p124o00O0o00.OooOOOO
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super OooOOO0> continuation) {
        OooO0O0 oooO0O0;
        o00000O0 o00000o1;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f36555OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f36555OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0OO = oooO0O0.f36552OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f36555OooO0oo;
        if (i2 != 0) {
            if (i2 == 1) {
                booleanRef = oooO0O0.f36553OooO0o0;
                o00000o1 = (o00000O0) oooO0O0.f36551OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef2 = (Ref.BooleanRef) oooO0O0.f36551OooO0Oo;
                ResultKt.throwOnFailure(objOooO0OO);
            }
            return new OooOOO0((Drawable) objOooO0OO, booleanRef2.element);
        }
        ResultKt.throwOnFailure(objOooO0OO);
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        OooO0OO oooO0OO = new OooO0OO(booleanRef3);
        oooO0O0.f36551OooO0Oo = this;
        oooO0O0.f36553OooO0o0 = booleanRef3;
        oooO0O0.f36555OooO0oo = 1;
        Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, oooO0OO, oooO0O0, 1, null);
        if (objRunInterruptible$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        o00000o1 = this;
        booleanRef = booleanRef3;
        objOooO0OO = objRunInterruptible$default;
        oooO0O0.f36551OooO0Oo = booleanRef;
        oooO0O0.f36553OooO0o0 = null;
        oooO0O0.f36555OooO0oo = 2;
        objOooO0OO = o00000o1.OooO0OO((Drawable) objOooO0OO, oooO0O0);
        if (objOooO0OO == coroutine_suspended) {
            return coroutine_suspended;
        }
        booleanRef2 = booleanRef;
        return new OooOOO0((Drawable) objOooO0OO, booleanRef2.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0OO(Drawable drawable, Continuation<? super Drawable> continuation) {
        OooO0o oooO0o;
        o00000O0 o00000o1;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f36562OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f36562OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object obj = oooO0o.f36559OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f36562OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!o00Ooo.OooO00o(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableOooO00o = o0Oo0oo.OooO00o(drawable);
            o0O0O00 o0o0o00 = this.f36545OooO0O0;
            Integer num = (Integer) o0o0o00.f36848OooOO0o.OooO00o("coil#repeat_count");
            animatedImageDrawableOooO00o.setRepeatCount(num != null ? num.intValue() : -1);
            o000OOo o000ooo2 = o0o0o00.f36848OooOO0o;
            Function0 function0 = (Function0) o000ooo2.OooO00o("coil#animation_start_callback");
            Function0 function1 = (Function0) o000ooo2.OooO00o("coil#animation_end_callback");
            if (function0 != null || function1 != null) {
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                OooO oooO = new OooO(drawable, function0, function1, null);
                oooO0o.f36558OooO0Oo = this;
                oooO0o.f36560OooO0o0 = drawable;
                oooO0o.f36562OooO0oo = 1;
                if (BuildersKt.withContext(immediate, oooO, oooO0o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            o00000o1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = oooO0o.f36560OooO0o0;
            o00000o1 = oooO0o.f36558OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        return new o000oOoO(drawable, o00000o1.f36545OooO0O0.f36843OooO0o0);
    }
}
