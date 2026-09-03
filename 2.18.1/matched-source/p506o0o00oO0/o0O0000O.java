package p506o0o00oO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.vm.ShareLogViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f41661OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public ShareLogViewModel f41662OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f41663OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f41664OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.Room.ordinal()] = 1;
            iArr[ShareType.Web.ordinal()] = 2;
            iArr[ShareType.Events.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0O0000O(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f41661OooO00o = activity;
        this.f41662OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f41663OooO0OO = 1704;
        this.f41664OooO0Oo = "com.whatsapp";
    }
}
