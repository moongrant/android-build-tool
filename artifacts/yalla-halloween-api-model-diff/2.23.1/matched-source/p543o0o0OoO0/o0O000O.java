package p543o0o0OoO0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.share.ShareChannel;
import com.yalla.yalla.model.share.ShareContentModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ShareContentModel f54875OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00OOOOo f54876OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o0O000Oo f54877OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0OoO00O f54878OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o0O0000O f54879OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final oo00oO f54880OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final o0O00o0 f54881OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0o0OoO0.o0O000O$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0488OooO00o {
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
            switch (C0488OooO00o.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                case 1:
                    new o0O00o0(activity).OooO00o(shareContentModel);
                    break;
                case 2:
                    new o0O0000O(activity).OooO00o(shareContentModel);
                    break;
                case 3:
                    new o00OOOOo(activity).OooO00o(shareContentModel);
                    break;
                case 4:
                    new o0O000Oo(activity).OooO00o(shareContentModel);
                    break;
                case 5:
                    new oo00oO(activity).OooO0O0(shareContentModel);
                    break;
                case 6:
                    new o0OoO00O(activity).OooO00o(shareContentModel);
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

    public o0O000O(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f54876OooO0O0 = new o00OOOOo(activity);
        this.f54877OooO0OO = new o0O000Oo(activity);
        this.f54878OooO0Oo = new o0OoO00O(activity);
        this.f54880OooO0o0 = new oo00oO(activity);
        this.f54879OooO0o = new o0O0000O(activity);
        this.f54881OooO0oO = new o0O00o0(activity);
    }
}
