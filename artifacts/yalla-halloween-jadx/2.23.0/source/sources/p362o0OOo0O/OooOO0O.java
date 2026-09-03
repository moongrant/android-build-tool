package p362o0OOo0O;

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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.netimage.PicDownloadUtils$downloadPicThenTransform2Bitmap$2", f = "PicDownloadUtils.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f43943OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f43944OooO0o0;

    public static final class OooO00o extends com.yalla.netimage.listener.OooO00o<BitmapDrawable> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Continuation<Bitmap> f43945OooO0oO;

        public OooO00o(SafeContinuation safeContinuation) {
            this.f43945OooO0oO = safeContinuation;
        }

        @Override // com.yalla.netimage.listener.OooO00o
        public final void OooO0oO() {
            this.f43945OooO0oO.resumeWith(Result.m4213constructorimpl(null));
        }

        @Override // com.yalla.netimage.listener.OooO00o
        public final void OooO0oo(BitmapDrawable bitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            int width = bitmapDrawable2.getBitmap().getWidth();
            Bitmap bitmap = bitmapDrawable2.getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, widt… Bitmap.Config.ARGB_8888)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float f = width / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmapDrawable2.getBitmap(), 0.0f, 0.0f, paint);
            this.f43945OooO0oO.resumeWith(Result.m4213constructorimpl(bitmapCreateBitmap));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(Context context, String str, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f43944OooO0o0 = context;
        this.f43943OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0O(this.f43944OooO0o0, this.f43943OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43942OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f43944OooO0o0;
            String str = this.f43943OooO0o;
            this.f43942OooO0Oo = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
            oooO00o.f43911OooO0OO = str;
            oooO00o.f43909OooO00o = 0;
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
