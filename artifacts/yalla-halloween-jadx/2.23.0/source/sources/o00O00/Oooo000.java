package o00O00;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.OooOO0 f36100OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f36101OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f36102OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f36103OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Context context, com.airbnb.lottie.OooOO0 oooOO1, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f36100OooO0Oo = oooOO1;
        this.f36102OooO0o0 = context;
        this.f36101OooO0o = str;
        this.f36103OooO0oO = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo000(this.f36102OooO0o0, this.f36100OooO0Oo, this.f36101OooO0o, this.f36103OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        for (oOO00O.OooO0O0 font : this.f36100OooO0Oo.f8728OooO0o0.values()) {
            Context context = this.f36102OooO0o0;
            Intrinsics.checkNotNullExpressionValue(font, "font");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.f36101OooO0o);
            String str = font.f60833OooO00o;
            String str2 = font.f60834OooO0O0;
            sb.append((Object) str);
            sb.append(this.f36103OooO0oO);
            try {
                Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), sb.toString());
                try {
                    Intrinsics.checkNotNullExpressionValue(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                    Intrinsics.checkNotNullExpressionValue(str2, "font.style");
                    boolean zOooO0o = StringsKt.OooO0o(str2, "Italic");
                    boolean zOooO0o2 = StringsKt.OooO0o(str2, "Bold");
                    if (zOooO0o && zOooO0o2) {
                        i = 3;
                    } else if (zOooO0o) {
                        i = 2;
                    } else {
                        i = zOooO0o2 ? 1 : 0;
                    }
                    if (typefaceWithDefaultStyle.getStyle() != i) {
                        typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i);
                    }
                    font.f60835OooO0OO = typefaceWithDefaultStyle;
                } catch (Exception unused) {
                    o00O0.OooOO0.f35970OooO00o.getClass();
                }
            } catch (Exception unused2) {
                o00O0.OooOO0.f35970OooO00o.getClass();
            }
        }
        return Unit.INSTANCE;
    }
}
