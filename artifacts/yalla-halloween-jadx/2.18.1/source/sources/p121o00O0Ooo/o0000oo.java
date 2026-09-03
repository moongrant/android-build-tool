package p121o00O0Ooo;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.OooOo;
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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129o00O0oOo.o000O0Oo;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0000oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f30895Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f30896Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f30897Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(OooOO0O oooOO0O, Context context, String str, Continuation<? super o0000oo> continuation) {
        super(2, continuation);
        this.f30895Oooo0o = oooOO0O;
        this.f30896Oooo0oO = context;
        this.f30897Oooo0oo = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000oo(this.f30895Oooo0o, this.f30896Oooo0oO, this.f30897Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        for (OooOo asset : this.f30895Oooo0o.f10044OooO0Oo.values()) {
            Intrinsics.checkNotNullExpressionValue(asset, "asset");
            if (asset.f10077OooO0Oo == null) {
                String filename = asset.f10076OooO0OO;
                Intrinsics.checkNotNullExpressionValue(filename, "filename");
                if (StringsKt.OooOoOO(filename, "data:") && StringsKt__StringsKt.indexOf$default((CharSequence) filename, "base64,", 0, false, 6, (Object) null) > 0) {
                    try {
                        String strSubstring = filename.substring(StringsKt__StringsKt.indexOf$default((CharSequence) filename, ',', 0, false, 6, (Object) null) + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        byte[] bArrDecode = Base64.decode(strSubstring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = Constants.ERR_ALREADY_IN_RECORDING;
                        asset.f10077OooO0Oo = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    } catch (IllegalArgumentException e) {
                        o000Oo0.OooO0Oo("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.f30896Oooo0oO;
            String str = this.f30897Oooo0oo;
            if (asset.f10077OooO0Oo == null && str != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open(Intrinsics.stringPlus(str, asset.f10076OooO0OO));
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "try {\n        context.assets.open(imageAssetsFolder + filename)\n    } catch (e: IOException) {\n        Logger.warning(\"Unable to open asset.\", e)\n        return\n    }");
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = Constants.ERR_ALREADY_IN_RECORDING;
                        asset.f10077OooO0Oo = o000O0Oo.OooO0o0(BitmapFactory.decodeStream(inputStreamOpen, null, options2), asset.f10074OooO00o, asset.f10075OooO0O0);
                    } catch (IllegalArgumentException e2) {
                        o000Oo0.OooO0Oo("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    o000Oo0.OooO0Oo("Unable to open asset.", e3);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
