package p097o000o0oO;

import android.graphics.Bitmap;
import coil.request.OooO00o;
import coil.request.RequestDelegate;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {169, 180, 184}, m = "executeMain", n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "placeholderBitmap", "this", "requestDelegate", "request", "eventListener"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
public final class o000O00 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public /* synthetic */ Object f35411OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000Oo0 f35412OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f35413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RequestDelegate f35414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0000O0O f35415OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Bitmap f35416OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f35417OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f35418OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o000Oo0 o000oo1, Continuation<? super o000O00> continuation) {
        super(continuation);
        this.f35417OooOO0 = o000oo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35411OooO = obj;
        this.f35418OooOO0O |= Integer.MIN_VALUE;
        return o000Oo0.OooO0o0(this.f35417OooOO0, null, 0, this);
    }
}
