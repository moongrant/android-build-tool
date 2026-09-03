package com.yalla.yalla.ui.activity.room;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.view.crop.SubsamplingScaleImageView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p416o0Oo0ooo.y0;
import p586o0oOooOo.q;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity$cropBitmap$1", f = "CustomizeThemePreviewActivity.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f26941OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CustomizeThemePreviewActivity f26942OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity$cropBitmap$1$1", f = "CustomizeThemePreviewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemePreviewActivity f26943OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CustomizeThemePreviewActivity customizeThemePreviewActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26943OooO0Oo = customizeThemePreviewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f26943OooO0Oo, continuation);
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
            CustomizeThemePreviewActivity customizeThemePreviewActivity = this.f26943OooO0Oo;
            customizeThemePreviewActivity.OooOo0();
            customizeThemePreviewActivity.finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(CustomizeThemePreviewActivity customizeThemePreviewActivity, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f26942OooO0o0 = customizeThemePreviewActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0Oo0oo(this.f26942OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Bitmap bitmapDecodeStream;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f26941OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = CustomizeThemePreviewActivity.f26514OooOo0;
            CustomizeThemePreviewActivity customizeThemePreviewActivity = this.f26942OooO0o0;
            SubsamplingScaleImageView subsamplingScaleImageView = customizeThemePreviewActivity.OooOo().f57590OooO0OO;
            int i3 = p417o0OoO0.o0ooOOo.f45529OooO00o;
            int i4 = p417o0OoO0.o0ooOOo.f45530OooO0O0;
            subsamplingScaleImageView.getClass();
            try {
                int iAbs = (int) Math.abs(subsamplingScaleImageView.f30861OooOoo.x / subsamplingScaleImageView.f30860OooOoOO);
                int iAbs2 = (int) Math.abs(subsamplingScaleImageView.f30861OooOoo.y / subsamplingScaleImageView.f30860OooOoOO);
                float f = subsamplingScaleImageView.f30860OooOoOO;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(subsamplingScaleImageView.f30838OooO0Oo, iAbs, iAbs2, (int) (i3 / f), (int) (i4 / f));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = bitmapCreateBitmap.getWidth() / subsamplingScaleImageView.getWidth();
                bitmapDecodeStream = BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                bitmapCreateBitmap.recycle();
            } catch (Exception e) {
                e.printStackTrace();
                bitmapDecodeStream = null;
            }
            if (bitmapDecodeStream != null) {
                File file = y0.f45408OooO0O0;
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                Object value = p464o0Oooo.o000000O.OooOOo0().getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append(jCurrentTimeMillis);
                String strOooO0Oo = q.OooO0Oo(bitmapDecodeStream, file, sb.toString());
                bitmapDecodeStream.recycle();
                if (!customizeThemePreviewActivity.isDestroyed() && !customizeThemePreviewActivity.isFinishing()) {
                    LiveEventBus.get("ROOM_THEME_PREVIEW_CROP_RESULT").post(strOooO0Oo);
                }
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(customizeThemePreviewActivity, null);
            this.f26941OooO0Oo = 1;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
