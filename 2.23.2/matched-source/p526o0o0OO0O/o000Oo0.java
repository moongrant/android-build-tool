package p526o0o0OO0O;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.share.ShareChannel;
import com.yalla.yalla.model.share.ShareContentModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ShareContentModel f53335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0000Ooo f53336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o000O00O f53337OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o000OO0O f53338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o000 f53339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o0000O0 f53340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final o0000oo f53341OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0o0OO0O.o000Oo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0480OooO00o {
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

        public static void OooO00o(@NotNull BaseFragmentActivity activity, @NotNull ShareChannel shareChannel, @Nullable ShareContentModel shareContentModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(shareChannel, "shareChannel");
            if (shareContentModel == null) {
            }
            switch (C0480OooO00o.$EnumSwitchMapping$0[shareChannel.ordinal()]) {
                case 1:
                    new o0000oo(activity).OooO00o(shareContentModel);
                    break;
                case 2:
                    new o000(activity).OooO00o(shareContentModel);
                    break;
                case 3:
                    new o0000Ooo(activity).OooO00o(shareContentModel);
                    break;
                case 4:
                    new o000O00O(activity).OooO00o(shareContentModel);
                    break;
                case 5:
                    new o0000O0(activity).OooO0O0(shareContentModel);
                    break;
                case 6:
                    new o000OO0O(activity).OooO00o(shareContentModel);
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

    public o000Oo0(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f53336OooO0O0 = new o0000Ooo(activity);
        this.f53337OooO0OO = new o000O00O(activity);
        this.f53338OooO0Oo = new o000OO0O(activity);
        this.f53340OooO0o0 = new o0000O0(activity);
        this.f53339OooO0o = new o000(activity);
        this.f53341OooO0oO = new o0000oo(activity);
    }
}
