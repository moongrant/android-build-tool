package p506o0o00oO0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.vm.ShareLogViewModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p433o0OoOO0o.o0;
import p433o0OoOO0o.o0O00oO0;
import p433o0OoOO0o.o0oO0Ooo;
import p487o0o000oO.o0OOO0o;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.oo0o0Oo;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f41682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public ShareLogViewModel f41683OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f41684OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f41685OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f41686OooO0o0;

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

    public o0oOOo(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f41682OooO00o = activity;
        this.f41683OooO0O0 = (ShareLogViewModel) new ViewModelProvider(activity).get(ShareLogViewModel.class);
        this.f41684OooO0OO = "com.twitter.android";
        this.f41685OooO0Oo = "https://twitter.com/intent/tweet?text=%s&url=%s";
        this.f41686OooO0o0 = 1702;
        if (activity == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        Context applicationContext = activity.getApplicationContext();
        o0 o0Var = new o0(2);
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o);
        String strOooO0Oo = oo0o0ooOooO0o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-26804062756368L).hashCode()), p254o00ooO0O.o000O0O0.OooO0OO(R.string.single_twitter_key));
        oo0o0Oo oo0o0ooOooO0o2 = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o2);
        o0oO0Ooo.OooO0Oo(new o0O00oO0(applicationContext, o0Var, new TwitterAuthConfig(strOooO0Oo, oo0o0ooOooO0o2.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-26924321840656L).hashCode()), p254o00ooO0O.o000O0O0.OooO0OO(R.string.single_twitter_secret))), Boolean.valueOf(!o0OOO0o.OooO0OO())));
    }
}
