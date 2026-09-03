package o00OO0O;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.OooOO0 f37213OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f37214OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f37215OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Context context, com.airbnb.lottie.OooOO0 oooOO1, String str, Continuation continuation) {
        super(2, continuation);
        this.f37213OooO0Oo = oooOO1;
        this.f37215OooO0o0 = context;
        this.f37214OooO0o = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(this.f37215OooO0o0, this.f37213OooO0Oo, this.f37214OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        for (com.airbnb.lottie.o000oOoO asset : this.f37213OooO0Oo.f11816OooO0Oo.values()) {
            Intrinsics.checkNotNullExpressionValue(asset, "asset");
            Bitmap bitmap = asset.f11969OooO0Oo;
            String filename = asset.f11968OooO0OO;
            if (bitmap == null) {
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                if (StringsKt__StringsJVMKt.startsWith$default(filename, "data:", false, 2, null) && StringsKt__StringsKt.indexOf$default((CharSequence) filename, "base64,", 0, false, 6, (Object) null) > 0) {
                    try {
                        String strSubstring = filename.substring(StringsKt__StringsKt.indexOf$default((CharSequence) filename, ',', 0, false, 6, (Object) null) + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        byte[] bArrDecode = Base64.decode(strSubstring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = Constants.ERR_ALREADY_IN_RECORDING;
                        asset.f11969OooO0Oo = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    } catch (IllegalArgumentException e) {
                        o00OOO0.OooOO0.OooO0OO("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.f37215OooO0o0;
            if (asset.f11969OooO0Oo == null && (str = this.f37214OooO0o) != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(Intrinsics.stringPlus(str, filename));
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "try {\n        context.assets.open(imageAssetsFolder + filename)\n    } catch (e: IOException) {\n        Logger.warning(\"Unable to open asset.\", e)\n        return\n    }");
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = Constants.ERR_ALREADY_IN_RECORDING;
                        asset.f11969OooO0Oo = o00OOO0.OooOOOO.OooO0o0(BitmapFactory.decodeStream(inputStreamOpen, null, options2), asset.f11966OooO00o, asset.f11967OooO0O0);
                    } catch (IllegalArgumentException e2) {
                        o00OOO0.OooOO0.OooO0OO("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    o00OOO0.OooOO0.OooO0OO("Unable to open asset.", e3);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
