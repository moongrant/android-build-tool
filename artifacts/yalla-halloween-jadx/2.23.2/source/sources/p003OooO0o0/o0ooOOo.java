package p003OooO0o0;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseReq;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.base.PlatformActivity;
import com.yallatech.support.platform.callback.YCSDKCallback;
import com.yallatech.support.platform.callback.YCSDKCallbackManager;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import com.yallatech.support.platform.exception.YallaException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0ooOOo {
    public static Activity OooO00o(Context context) {
        boolean z;
        Context baseContext = context;
        while (true) {
            z = baseContext instanceof Activity;
            if (z || !(baseContext instanceof ContextWrapper)) {
                break;
            }
            baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "context as ContextWrapper).baseContext");
        }
        if (z) {
            return (Activity) baseContext;
        }
        throw new YallaException("Unable to get Activity");
    }

    @NotNull
    public abstract BaseResp OooO0O0();

    public final void OooO0OO(YCSDKCallbackManager yCSDKCallbackManager, final YCSDKCallback yCSDKCallback) {
        if (!(yCSDKCallbackManager instanceof YCSDKCallbackManagerImpl)) {
            throw new YallaException("Unexpected CallbackManager, please use the provided Factory.");
        }
        int iOooO00o = YCSDKCallbackManagerImpl.RequestCodeOffset.Login.OooO00o();
        YCSDKCallbackManagerImpl.OooO00o callback = new YCSDKCallbackManagerImpl.OooO00o() { // from class: OooO0o0.o00oO0o
            @Override // com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl.OooO00o
            public final void OooO00o(int i, Intent intent) {
                o0ooOOo this$0 = this.f135OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                YCSDKCallback yCSDKCallback2 = yCSDKCallback;
                try {
                    if (intent == null) {
                        if (i == 0 && yCSDKCallback2 != null) {
                            yCSDKCallback2.onResult(this$0.OooO0O0());
                            return;
                        }
                        return;
                    }
                    BaseResp baseResp = (BaseResp) intent.getParcelableExtra("ylapi_response");
                    if (baseResp == null) {
                        baseResp = null;
                    } else if (baseResp.getCode() != -1 && yCSDKCallback2 != null) {
                        yCSDKCallback2.onResult(baseResp);
                    }
                    if (baseResp == null && i == 0 && yCSDKCallback2 != null) {
                        yCSDKCallback2.onResult(this$0.OooO0O0());
                    }
                } catch (Exception unused) {
                }
            }
        };
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((YCSDKCallbackManagerImpl) yCSDKCallbackManager).f32406OooO00o.put(Integer.valueOf(iOooO00o), callback);
    }

    public boolean OooO0Oo(@NotNull Context context, @NotNull BaseReq baseReq, @NotNull o000OOo startActivityDelegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseReq, "baseReq");
        Intrinsics.checkNotNullParameter(startActivityDelegate, "startActivityDelegate");
        Intent intent = new Intent();
        intent.setClass(context, PlatformActivity.class);
        intent.putExtra("yalla_buddle_extra_data", baseReq);
        intent.putExtra("yalla_buddle_type", baseReq.getType());
        if (!(YCSDKOpenKit.getApplicationContext$lib_release().getPackageManager().resolveActivity(intent, 0) != null)) {
            return false;
        }
        try {
            startActivityDelegate.OooO00o(OooO0o0(), intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public abstract int OooO0o0();
}
