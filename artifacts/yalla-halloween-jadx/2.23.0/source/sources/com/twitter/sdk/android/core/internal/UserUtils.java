package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class UserUtils {

    public enum AvatarSize {
        NORMAL("_normal"),
        BIGGER("_bigger"),
        MINI("_mini"),
        ORIGINAL("_original"),
        REASONABLY_SMALL("_reasonably_small");

        private final String suffix;

        AvatarSize(String str) {
            this.suffix = str;
        }

        public final String OooO00o() {
            return this.suffix;
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f21998OooO00o;

        static {
            int[] iArr = new int[AvatarSize.values().length];
            f21998OooO00o = iArr;
            try {
                iArr[AvatarSize.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21998OooO00o[AvatarSize.BIGGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21998OooO00o[AvatarSize.MINI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21998OooO00o[AvatarSize.ORIGINAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21998OooO00o[AvatarSize.REASONABLY_SMALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static String OooO00o(User user, AvatarSize avatarSize) {
        String str;
        if (user == null || (str = user.f22177OooOoo) == null) {
            return null;
        }
        if (avatarSize == null || str == null) {
            return str;
        }
        int i = OooO00o.f21998OooO00o[avatarSize.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? str.replace(AvatarSize.NORMAL.OooO00o(), avatarSize.OooO00o()) : str;
    }
}
