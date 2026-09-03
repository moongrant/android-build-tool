package p368o0OOo0Oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.netimage.PicDownloadUtils$downloadPicThenTransform2Bitmap$2", f = "PicDownloadUtils.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43085OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f43086OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f43087OooO0o0;

    public static final class OooO00o extends com.yalla.netimage.listener.OooO00o<BitmapDrawable> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Continuation<Bitmap> f43088OooO0oO;

        public OooO00o(SafeContinuation safeContinuation) {
            this.f43088OooO0oO = safeContinuation;
        }

        @Override // com.yalla.netimage.listener.OooO00o
        public final void OooO0o0() {
            this.f43088OooO0oO.resumeWith(Result.m4215constructorimpl(null));
        }

        @Override // com.yalla.netimage.listener.OooO00o
        public final void OooO0oO(BitmapDrawable bitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            int width = bitmapDrawable2.getBitmap().getWidth();
            Bitmap bitmap = bitmapDrawable2.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f = width / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDrawable2.getBitmap(), 0.0f, 0.0f, paint);
            this.f43088OooO0oO.resumeWith(Result.m4215constructorimpl(bitmapCreateBitmap));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Context context, String str, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f43087OooO0o0 = context;
        this.f43086OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(this.f43087OooO0o0, this.f43086OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43085OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f43087OooO0o0;
            String str = this.f43086OooO0o;
            this.f43085OooO0Oo = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
            oooO00o.f43126OooO0OO = str;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0OO(new OooO00o(safeContinuation));
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
