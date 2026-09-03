package p121o00O0Ooo;

import android.content.Context;
import android.graphics.Typeface;
import com.airbnb.lottie.OooOO0O;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129o00O0oOo.o000Oo0;
import p225o00oOOo.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f30890Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f30891Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f30892Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f30893Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(OooOO0O oooOO0O, Context context, String str, String str2, Continuation<? super o0000O00> continuation) {
        super(2, continuation);
        this.f30891Oooo0o = oooOO0O;
        this.f30892Oooo0oO = context;
        this.f30893Oooo0oo = str;
        this.f30890Oooo = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O00(this.f30891Oooo0o, this.f30892Oooo0oO, this.f30893Oooo0oo, this.f30890Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        for (oo0o0O0 font : this.f30891Oooo0o.f10046OooO0o0.values()) {
            Context context = this.f30892Oooo0oO;
            Intrinsics.checkNotNullExpressionValue(font, "font");
            String str = this.f30893Oooo0oo;
            try {
                Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), ((Object) str) + ((Object) font.f33872OooO00o) + this.f30890Oooo);
                try {
                    Intrinsics.checkNotNullExpressionValue(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                    String str2 = font.f33873OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(str2, "font.style");
                    int i = 0;
                    boolean zContains$default = StringsKt__StringsKt.contains$default(str2, "Italic", false, 2, (Object) null);
                    boolean zContains$default2 = StringsKt__StringsKt.contains$default(str2, "Bold", false, 2, (Object) null);
                    if (zContains$default && zContains$default2) {
                        i = 3;
                    } else if (zContains$default) {
                        i = 2;
                    } else if (zContains$default2) {
                        i = 1;
                    }
                    if (typefaceWithDefaultStyle.getStyle() != i) {
                        typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i);
                    }
                    font.f33874OooO0OO = typefaceWithDefaultStyle;
                } catch (Exception unused) {
                    o000Oo0.OooO0O0();
                }
            } catch (Exception unused2) {
                o000Oo0.OooO0O0();
            }
        }
        return Unit.INSTANCE;
    }
}
