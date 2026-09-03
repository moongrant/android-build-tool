package o00OO0O;

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
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p135o00OO0o0.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.OooOO0 f37216OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f37217OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f37218OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f37219OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Context context, com.airbnb.lottie.OooOO0 oooOO1, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f37216OooO0Oo = oooOO1;
        this.f37218OooO0o0 = context;
        this.f37217OooO0o = str;
        this.f37219OooO0oO = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo000(this.f37218OooO0o0, this.f37216OooO0Oo, this.f37217OooO0o, this.f37219OooO0oO, continuation);
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
        for (o00Ooo font : this.f37216OooO0Oo.f11818OooO0o0.values()) {
            Context context = this.f37218OooO0o0;
            Intrinsics.checkNotNullExpressionValue(font, "font");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.f37217OooO0o);
            String str = font.f37323OooO00o;
            String str2 = font.f37324OooO0O0;
            sb.append((Object) str);
            sb.append(this.f37219OooO0oO);
            try {
                Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), sb.toString());
                try {
                    Intrinsics.checkNotNullExpressionValue(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                    Intrinsics.checkNotNullExpressionValue(str2, "font.style");
                    boolean zContains$default = StringsKt__StringsKt.contains$default(str2, "Italic", false, 2, (Object) null);
                    boolean zContains$default2 = StringsKt__StringsKt.contains$default(str2, "Bold", false, 2, (Object) null);
                    if (zContains$default && zContains$default2) {
                        i = 3;
                    } else if (zContains$default) {
                        i = 2;
                    } else {
                        i = zContains$default2 ? 1 : 0;
                    }
                    if (typefaceWithDefaultStyle.getStyle() != i) {
                        typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i);
                    }
                    font.f37325OooO0OO = typefaceWithDefaultStyle;
                } catch (Exception unused) {
                    o00OOO0.OooOO0.f37421OooO00o.getClass();
                }
            } catch (Exception unused2) {
                o00OOO0.OooOO0.f37421OooO00o.getClass();
            }
        }
        return Unit.INSTANCE;
    }
}
