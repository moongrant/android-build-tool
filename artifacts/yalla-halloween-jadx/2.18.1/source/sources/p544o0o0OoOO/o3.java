package p544o0o0OoOO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView;
import com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Objects;
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
import p494o0o00OO0.OooO0o;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity$cropBitmap$1", f = "CustomizeThemePreviewActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class o3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f44279Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CustomizeThemePreviewActivity f44280Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity$cropBitmap$1$1", f = "CustomizeThemePreviewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemePreviewActivity f44281Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CustomizeThemePreviewActivity customizeThemePreviewActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f44281Oooo0o = customizeThemePreviewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f44281Oooo0o, continuation);
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
            this.f44281Oooo0o.OooOoO();
            this.f44281Oooo0o.finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(CustomizeThemePreviewActivity customizeThemePreviewActivity, Continuation<? super o3> continuation) {
        super(2, continuation);
        this.f44280Oooo0oO = customizeThemePreviewActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o3(this.f44280Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Bitmap bitmapDecodeStream;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44279Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CustomizeThemePreviewActivity customizeThemePreviewActivity = this.f44280Oooo0oO;
            CustomizeThemePreviewActivity.OooO00o oooO00o = CustomizeThemePreviewActivity.f22786Ooooo0o;
            SubsamplingScaleImageView subsamplingScaleImageView = customizeThemePreviewActivity.OooOoo().f49765OooO0OO;
            int i2 = o000O0Oo.f42985OooO00o;
            int i3 = o000O0Oo.f42986OooO0O0;
            Objects.requireNonNull(subsamplingScaleImageView);
            try {
                int iAbs = (int) Math.abs(subsamplingScaleImageView.f21135ooOO.x / subsamplingScaleImageView.f21089Ooooooo);
                int iAbs2 = (int) Math.abs(subsamplingScaleImageView.f21135ooOO.y / subsamplingScaleImageView.f21089Ooooooo);
                float f = subsamplingScaleImageView.f21089Ooooooo;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(subsamplingScaleImageView.f21068Oooo0o, iAbs, iAbs2, (int) (i2 / f), (int) (i3 / f));
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
                OooO0o oooO0o = OooO0o.f41155OooO00o;
                File file = OooO0o.f41156OooO0O0;
                StringBuilder sb = new StringBuilder();
                sb.append(OooOOO.f41216OooO00o.OooOo().getValue());
                sb.append(System.currentTimeMillis());
                String strOooO0o = o00OOO0O.OooO00o.OooO0o(bitmapDecodeStream, file, sb.toString());
                bitmapDecodeStream.recycle();
                CustomizeThemePreviewActivity customizeThemePreviewActivity2 = this.f44280Oooo0oO;
                Objects.requireNonNull(customizeThemePreviewActivity2);
                if (!customizeThemePreviewActivity2.isDestroyed()) {
                    CustomizeThemePreviewActivity customizeThemePreviewActivity3 = this.f44280Oooo0oO;
                    Objects.requireNonNull(customizeThemePreviewActivity3);
                    if (!customizeThemePreviewActivity3.isFinishing()) {
                        LiveEventBus.get("ROOM_THEME_PREVIEW_CROP_RESULT").post(strOooO0o);
                    }
                }
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o2 = new OooO00o(this.f44280Oooo0oO, null);
            this.f44279Oooo0o = 1;
            if (BuildersKt.withContext(main, oooO00o2, this) == coroutine_suspended) {
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
