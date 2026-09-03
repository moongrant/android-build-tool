package p101o000oo;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.OooO00o;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o0000O0O;
import p108o000ooOO.o000OO0O;
import p109o000ooo.o0O0O00;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0O0O00>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f35560OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f35562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f35563OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f35564OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f35565OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MemoryCache.Key f35566OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o00oO0o.OooO00o f35567OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(Oooo0 oooo0, OooO00o oooO00o, Object obj, o0Oo0oo o0oo0oo2, o0000O0O o0000o0o2, MemoryCache.Key key, o00oO0o.OooO00o oooO00o2, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f35563OooO0o0 = oooo0;
        this.f35562OooO0o = oooO00o;
        this.f35564OooO0oO = obj;
        this.f35565OooO0oo = o0oo0oo2;
        this.f35560OooO = o0000o0o2;
        this.f35566OooOO0 = key;
        this.f35567OooOO0O = oooO00o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Ooo(this.f35563OooO0o0, this.f35562OooO0o, this.f35564OooO0oO, this.f35565OooO0oo, this.f35560OooO, this.f35566OooOO0, this.f35567OooOO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0O0O00> continuation) {
        return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        MemoryCache memoryCacheOooO0Oo;
        Bitmap bitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35561OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oooo0 oooo0 = this.f35563OooO0o0;
            OooO00o oooO00o = this.f35562OooO0o;
            Object obj2 = this.f35564OooO0oO;
            o0Oo0oo o0oo0oo2 = this.f35565OooO0oo;
            o0000O0O o0000o0o2 = this.f35560OooO;
            this.f35561OooO0Oo = 1;
            obj = Oooo0.OooO0OO(oooo0, oooO00o, obj2, o0oo0oo2, o0000o0o2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Oooo0.OooO00o oooO00o2 = (Oooo0.OooO00o) obj;
        o000OO0O o000oo0o2 = this.f35563OooO0o0.f35519OooO0OO;
        o000oo0o2.getClass();
        boolean writeEnabled = this.f35562OooO0o.f8569OooOo00.getWriteEnabled();
        MemoryCache.Key key = this.f35566OooOO0;
        if (!writeEnabled || (memoryCacheOooO0Oo = o000oo0o2.f35819OooO00o.OooO0Oo()) == null || key == null) {
            z = false;
        } else {
            Drawable drawable = oooO00o2.f35520OooO00o;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(oooO00o2.f35521OooO0O0));
                String str = oooO00o2.f35523OooO0Oo;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                memoryCacheOooO0Oo.OooO0OO(key, new MemoryCache.OooO00o(bitmap, linkedHashMap));
                z = true;
            }
        }
        Drawable drawable2 = oooO00o2.f35520OooO00o;
        OooO00o oooO00o3 = this.f35562OooO0o;
        DataSource dataSource = oooO00o2.f35522OooO0OO;
        MemoryCache.Key key2 = z ? key : null;
        String str2 = oooO00o2.f35523OooO0Oo;
        boolean z2 = oooO00o2.f35521OooO0O0;
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        o00oO0o.OooO00o oooO00o4 = this.f35567OooOO0O;
        return new o0O0O00(drawable2, oooO00o3, dataSource, key2, str2, z2, (oooO00o4 instanceof o0ooOOo) && ((o0ooOOo) oooO00o4).f35585OooO0oO);
    }
}
