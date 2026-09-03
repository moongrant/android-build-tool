package p267o00ooo0o;

import android.content.SharedPreferences;
import androidx.lifecycle.MutableLiveData;
import com.common.support.apm.model.TokenModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.common.support.apm.TokenManager$init$1", f = "TokenManager.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f34921Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO f34922Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f34923Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(o00OO0OO o00oo0oo, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o00OO0O0> continuation) {
        super(2, continuation);
        this.f34922Oooo0oO = o00oo0oo;
        this.f34923Oooo0oo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00OO0O0(this.f34922Oooo0oO, this.f34923Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00OO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34921Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00OO0OO o00oo0oo = this.f34922Oooo0oO;
            SharedPreferences sharedPreferences = o00oo0oo.f34925OooO00o.f34909OooO00o.getSharedPreferences(o00oo0oo.f34926OooO0O0, 0);
            String string = sharedPreferences.getString(o00oo0oo.f34927OooO0OO, "");
            if (string == null) {
                string = "";
            }
            String string2 = sharedPreferences.getString(o00oo0oo.f34928OooO0Oo, "");
            if (string2 == null) {
                string2 = "";
            }
            if (string.length() == 0) {
                z = false;
            } else {
                if (string2.length() == 0) {
                    z = false;
                } else {
                    if (o00OO0OO.f34924OooO0oO == null) {
                        o00OO0OO.f34924OooO0oO = new TokenModel();
                    }
                    String string3 = sharedPreferences.getString(o00oo0oo.f34930OooO0o0, "");
                    if (string3 == null) {
                        string3 = "";
                    }
                    String string4 = sharedPreferences.getString(o00oo0oo.f34929OooO0o, "");
                    String str = string4 != null ? string4 : "";
                    TokenModel tokenModel = o00OO0OO.f34924OooO0oO;
                    if (tokenModel != null) {
                        tokenModel.setAccessToken(string);
                        tokenModel.setRefreshToken(string2);
                        tokenModel.setExpiresIn(str);
                        tokenModel.setTokenType(string3);
                    }
                    z = true;
                }
            }
            if (z) {
                this.f34923Oooo0oo.postValue(Boxing.boxBoolean(true));
            } else {
                o00OO0OO o00oo0oo2 = this.f34922Oooo0oO;
                this.f34921Oooo0o = 1;
                obj = o00oo0oo2.OooO0O0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            this.f34923Oooo0oo.postValue(Boxing.boxBoolean(true));
        } else {
            this.f34923Oooo0oo.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
