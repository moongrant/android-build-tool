package p003OooO0Oo;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.OooO0O0;
import androidx.activity.result.OooO0OO;
import com.yallatech.support.platform.callback.YCSDKCallbackManager;
import com.yallatech.support.platform.callback.YCSDKCallbackManagerImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011OooOOoo.OooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public YCSDKCallbackManager f102OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public OooO0OO f103OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public androidx.activity.result.OooO0O0<Intent> f104OooO00o;
    }

    public static final class OooO0O0 extends OooO<Intent, Pair<Integer, Intent>> {
        @Override // p011OooOOoo.OooO
        public final Intent createIntent(Context context, Intent intent) {
            Intent input = intent;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        @Override // p011OooOOoo.OooO
        public final Pair<Integer, Intent> parseResult(int i, Intent intent) {
            return Pair.create(Integer.valueOf(i), intent);
        }
    }

    public OooOOOO(@Nullable YCSDKCallbackManager yCSDKCallbackManager, @NotNull OooO0OO activityResultRegistryOwner) {
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        this.f102OooO00o = yCSDKCallbackManager;
        this.f103OooO0O0 = activityResultRegistryOwner;
    }

    @Override // p003OooO0Oo.o00oO0o
    public final void OooO00o(@NotNull Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        final OooO00o oooO00o = new OooO00o();
        androidx.activity.result.OooO0O0 oooO0O0OooO0Oo = this.f103OooO0O0.getActivityResultRegistry().OooO0Oo("yalla-chat-sdk", new OooO0O0(), new androidx.activity.result.OooO00o() { // from class: OooO0Oo.OooOOO
            @Override // androidx.activity.result.OooO00o
            public final void onActivityResult(Object obj) {
                OooOOOO this$0 = this.f99OooO0Oo;
                OooOOOO.OooO00o launcherHolder = oooO00o;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(launcherHolder, "$launcherHolder");
                if (pair != null) {
                    YCSDKCallbackManager yCSDKCallbackManager = this$0.f102OooO00o;
                    if (yCSDKCallbackManager != null) {
                        int iOooO00o = YCSDKCallbackManagerImpl.RequestCodeOffset.Login.OooO00o();
                        Object obj2 = pair.first;
                        Intrinsics.checkNotNullExpressionValue(obj2, "it.first");
                        yCSDKCallbackManager.onActivityResult(iOooO00o, ((Number) obj2).intValue(), (Intent) pair.second);
                    }
                    OooO0O0<Intent> oooO0O0 = launcherHolder.f104OooO00o;
                    if (oooO0O0 != null) {
                        Intrinsics.checkNotNull(oooO0O0);
                        oooO0O0.OooO0OO();
                        launcherHolder.f104OooO00o = null;
                    }
                }
            }
        });
        oooO00o.f104OooO00o = (ActivityResultRegistry.OooO0O0) oooO0O0OooO0Oo;
        oooO0O0OooO0Oo.OooO0O0(intent);
    }
}
