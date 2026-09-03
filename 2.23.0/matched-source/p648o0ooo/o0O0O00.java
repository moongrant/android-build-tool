package p648o0ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.share.ShareChannel;
import com.yalla.yalla.model.share.ShareContentModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ShareContentModel f59767OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o000oOoO f59768OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o000000 f59769OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o00000O0 f59770OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o0OO00O f59771OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final oo000o f59772OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final o00Oo0 f59773OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0ooo.o0O0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0515OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ShareChannel.values().length];
                try {
                    iArr[ShareChannel.Friends.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShareChannel.Moments.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShareChannel.Facebook.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ShareChannel.Twitter.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ShareChannel.Instagram.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ShareChannel.WhatsApp.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static void OooO00o(@NotNull FragmentActivity activity, @NotNull ShareChannel shareChannel, @Nullable ShareContentModel shareContentModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(shareChannel, "shareChannel");
            if (shareContentModel == null) {
            }
            switch (C0515OooO00o.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                case 1:
                    new o00Oo0(activity).OooO00o(shareContentModel);
                    break;
                case 2:
                    new o0OO00O(activity).OooO00o(shareContentModel);
                    break;
                case 3:
                    new o000oOoO(activity).OooO00o(shareContentModel);
                    break;
                case 4:
                    new o000000(activity).OooO00o(shareContentModel);
                    break;
                case 5:
                    new oo000o(activity).OooO0O0(shareContentModel);
                    break;
                case 6:
                    new o00000O0(activity).OooO00o(shareContentModel);
                    break;
            }
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareChannel.values().length];
            try {
                iArr[ShareChannel.Friends.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareChannel.Moments.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareChannel.Facebook.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareChannel.Twitter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareChannel.Instagram.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareChannel.WhatsApp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0O0O00(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f59768OooO0O0 = new o000oOoO(activity);
        this.f59769OooO0OO = new o000000(activity);
        this.f59770OooO0Oo = new o00000O0(activity);
        this.f59772OooO0o0 = new oo000o(activity);
        this.f59771OooO0o = new o0OO00O(activity);
        this.f59773OooO0oO = new o00Oo0(activity);
    }
}
