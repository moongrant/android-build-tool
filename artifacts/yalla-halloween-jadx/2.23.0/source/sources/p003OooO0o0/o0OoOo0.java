package p003OooO0o0;

import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.OooO0o;
import androidx.activity.result.OooOO0;
import com.yallatech.support.platform.callback.YCSDKCallbackManager;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final YCSDKCallbackManager f145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOO0 f146OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public OooO0o f147OooO00o;
    }

    public o0OoOo0(@Nullable YCSDKCallbackManager yCSDKCallbackManager, @NotNull OooOO0 activityResultRegistryOwner) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        this.f145OooO00o = yCSDKCallbackManager;
        this.f146OooO0O0 = activityResultRegistryOwner;
    }

    @Override // p003OooO0o0.o000000
    public final void OooO00o(int i, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        final OooO00o oooO00o = new OooO00o();
        OooO0o oooO0oOooO0Oo = this.f146OooO0O0.getActivityResultRegistry().OooO0Oo("yalla-chat-sdk", new o00O0O(), new androidx.activity.result.OooO00o() { // from class: OooO0o0.o000oOoO
            @Override // androidx.activity.result.OooO00o
            public final void onActivityResult(Object obj) {
                Pair pair = (Pair) obj;
                o0OoOo0 this$0 = this.f127OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OoOo0.OooO00o launcherHolder = oooO00o;
                Intrinsics.checkNotNullParameter(launcherHolder, "$launcherHolder");
                if (pair != null) {
                    YCSDKCallbackManager yCSDKCallbackManager = this$0.f145OooO00o;
                    if (yCSDKCallbackManager != null) {
                        int iOooO00o = YCSDKCallbackManagerImpl.RequestCodeOffset.Login.OooO00o();
                        Object obj2 = pair.first;
                        Intrinsics.checkNotNullExpressionValue(obj2, "it.first");
                        yCSDKCallbackManager.onActivityResult(iOooO00o, ((Number) obj2).intValue(), (Intent) pair.second);
                    }
                    OooO0o oooO0o = launcherHolder.f147OooO00o;
                    if (oooO0o != null) {
                        Intrinsics.checkNotNull(oooO0o);
                        oooO0o.OooO0OO();
                        launcherHolder.f147OooO00o = null;
                    }
                }
            }
        });
        oooO00o.f147OooO00o = oooO0oOooO0Oo;
        oooO0oOooO0Oo.OooO0O0(intent);
    }
}
