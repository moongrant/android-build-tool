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
import p591o0oOoooO.b3;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity$cropBitmap$1", f = "CustomizeThemePreviewActivity.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f26475OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CustomizeThemePreviewActivity f26476OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity$cropBitmap$1$1", f = "CustomizeThemePreviewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemePreviewActivity f26477OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CustomizeThemePreviewActivity customizeThemePreviewActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26477OooO0Oo = customizeThemePreviewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f26477OooO0Oo, continuation);
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
            CustomizeThemePreviewActivity customizeThemePreviewActivity = this.f26477OooO0Oo;
            customizeThemePreviewActivity.OooOo0();
            customizeThemePreviewActivity.finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(CustomizeThemePreviewActivity customizeThemePreviewActivity, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f26476OooO0o0 = customizeThemePreviewActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0Oo0oo(this.f26476OooO0o0, continuation);
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
        int i = this.f26475OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = CustomizeThemePreviewActivity.f26062OooOo0;
            CustomizeThemePreviewActivity customizeThemePreviewActivity = this.f26476OooO0o0;
            SubsamplingScaleImageView subsamplingScaleImageView = customizeThemePreviewActivity.OooOo().f45173OooO0OO;
            int i3 = p423o0OoO0OO.o000O000.f46650OooO00o;
            int i4 = p423o0OoO0OO.o000O000.f46651OooO0O0;
            subsamplingScaleImageView.getClass();
            try {
                int iAbs = (int) Math.abs(subsamplingScaleImageView.f30316OooOoo.x / subsamplingScaleImageView.f30315OooOoOO);
                int iAbs2 = (int) Math.abs(subsamplingScaleImageView.f30316OooOoo.y / subsamplingScaleImageView.f30315OooOoOO);
                float f = subsamplingScaleImageView.f30315OooOoOO;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(subsamplingScaleImageView.f30293OooO0Oo, iAbs, iAbs2, (int) (i3 / f), (int) (i4 / f));
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
                File file = p466o0OooOoo.o0O0o00O.f47845OooO0O0;
                p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                Object value = p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append(value);
                sb.append(jCurrentTimeMillis);
                String strOooO0Oo = b3.OooO0Oo(bitmapDecodeStream, file, sb.toString());
                bitmapDecodeStream.recycle();
                if (!customizeThemePreviewActivity.isDestroyed() && !customizeThemePreviewActivity.isFinishing()) {
                    LiveEventBus.get("ROOM_THEME_PREVIEW_CROP_RESULT").post(strOooO0Oo);
                }
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(customizeThemePreviewActivity, null);
            this.f26475OooO0Oo = 1;
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
