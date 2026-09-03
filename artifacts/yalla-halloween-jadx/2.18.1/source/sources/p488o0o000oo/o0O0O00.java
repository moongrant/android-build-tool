package p488o0o000oo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import com.app.base.application.App;
import com.code.android.util.ToastUtil;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p494o0o00OO0.OooO0o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$downloadPage$1$1$1$1", f = "BaseJSBridge.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f40973Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f40974Oooo0oO;

    public static final class OooO00o extends com.yalla.yalla.util.netimage.listener.OooO00o<BitmapDrawable> {
        @Override // com.yalla.yalla.util.netimage.listener.OooO00o
        public final void onSuccess(BitmapDrawable bitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oo0o0Oo(bitmapDrawable2, null), 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$downloadPage$1$1$1$1$2", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f40975Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f40975Oooo0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f40975Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
            String str = this.f40975Oooo0o;
            if (str == null) {
                str = "";
            }
            oooO0O0.OooO0O0(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(String str, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f40974Oooo0oO = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0O00(this.f40974Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f40973Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (StringsKt.OooOoOO(this.f40974Oooo0oO, "http")) {
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(App.f11458Oooo0oO);
                oooO00o.f48429OooO0OO = this.f40974Oooo0oO;
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o0(new OooO00o());
            } else {
                byte[] bArrDecode = Base64.decode(this.f40974Oooo0oO, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                OooO0o oooO0o = OooO0o.f41155OooO00o;
                String strOooO0o0 = o00OOO0O.OooO00o.OooO0o0(bitmapDecodeByteArray, oooO0o.OooO0Oo());
                oooO0o.OooO0o(new File(strOooO0o0));
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO0O0 oooO0O0 = new OooO0O0(strOooO0o0, null);
                this.f40973Oooo0o = 1;
                if (BuildersKt.withContext(main, oooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
