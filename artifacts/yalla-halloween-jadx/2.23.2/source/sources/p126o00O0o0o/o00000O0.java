package p126o00O0o0o;

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
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o000000;
import p128o00O0oOO.o000O00O;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
public final class o00000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o000000O>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o000000 f36671OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f36672OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f36673OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f36674OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f36675OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f36676OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MemoryCache.Key f36677OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ o00000OO.OooO00o f36678OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(o0O0O00 o0o0o00, OooO00o oooO00o, Object obj, o0O0O00 o0o0o01, o000000 o000000Var, MemoryCache.Key key, o00000OO.OooO00o oooO00o2, Continuation<? super o00000O0> continuation) {
        super(2, continuation);
        this.f36674OooO0o0 = o0o0o00;
        this.f36673OooO0o = oooO00o;
        this.f36675OooO0oO = obj;
        this.f36676OooO0oo = o0o0o01;
        this.f36671OooO = o000000Var;
        this.f36677OooOO0 = key;
        this.f36678OooOO0O = oooO00o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000O0(this.f36674OooO0o0, this.f36673OooO0o, this.f36675OooO0oO, this.f36676OooO0oo, this.f36671OooO, this.f36677OooOO0, this.f36678OooOO0O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o000000O> continuation) {
        return ((o00000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        MemoryCache memoryCacheOooO0Oo;
        Bitmap bitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f36672OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0O00 o0o0o00 = this.f36674OooO0o0;
            OooO00o oooO00o = this.f36673OooO0o;
            Object obj2 = this.f36675OooO0oO;
            o0O0O00 o0o0o01 = this.f36676OooO0oo;
            o000000 o000000Var = this.f36671OooO;
            this.f36672OooO0Oo = 1;
            obj = o0O0O00.OooO0OO(o0o0o00, oooO00o, obj2, o0o0o01, o000000Var, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        o0O0O00.OooO00o oooO00o2 = (o0O0O00.OooO00o) obj;
        o000O00O o000o00o2 = this.f36674OooO0o0.f36705OooO0OO;
        o000o00o2.getClass();
        boolean writeEnabled = this.f36673OooO0o.f11659OooOo00.getWriteEnabled();
        MemoryCache.Key key = this.f36677OooOO0;
        if (!writeEnabled || (memoryCacheOooO0Oo = o000o00o2.f36724OooO00o.OooO0Oo()) == null || key == null) {
            z = false;
        } else {
            Drawable drawable = oooO00o2.f36706OooO00o;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                z = false;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(oooO00o2.f36707OooO0O0));
                String str = oooO00o2.f36709OooO0Oo;
                if (str != null) {
                    linkedHashMap.put("coil#disk_cache_key", str);
                }
                memoryCacheOooO0Oo.OooO0OO(key, new MemoryCache.OooO00o(bitmap, linkedHashMap));
                z = true;
            }
        }
        Drawable drawable2 = oooO00o2.f36706OooO00o;
        OooO00o oooO00o3 = this.f36673OooO0o;
        DataSource dataSource = oooO00o2.f36708OooO0OO;
        MemoryCache.Key key2 = z ? key : null;
        String str2 = oooO00o2.f36709OooO0Oo;
        boolean z2 = oooO00o2.f36707OooO0O0;
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        o00000OO.OooO00o oooO00o4 = this.f36678OooOO0O;
        return new o000000O(drawable2, oooO00o3, dataSource, key2, str2, z2, (oooO00o4 instanceof o0000Ooo) && ((o0000Ooo) oooO00o4).f36685OooO0oO);
    }
}
