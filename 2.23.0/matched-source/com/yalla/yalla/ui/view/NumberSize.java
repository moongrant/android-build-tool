package com.yalla.yalla.ui.view;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class NumberSize {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f30503OooO00o = oOo00OO0.ic_chatline_gift_x;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f30504OooO0O0 = oOo00OO0.ic_x_number_space;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.M.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Size.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Size.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Size.XX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Size.RunWay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberSize$Size;", "", "S", "M", "H", "X", "XX", "RunWay", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum Size {
        S,
        M,
        H,
        X,
        XX,
        RunWay
    }

    @NotNull
    public static Size OooO00o(@Nullable Integer num) {
        if (num != null && num.intValue() == 0) {
            return Size.S;
        }
        if (num != null && num.intValue() == 1) {
            return Size.M;
        }
        if (num != null && num.intValue() == 2) {
            return Size.H;
        }
        if (num != null && num.intValue() == 3) {
            return Size.X;
        }
        if (num != null && num.intValue() == 4) {
            return Size.XX;
        }
        return (num != null && num.intValue() == 5) ? Size.RunWay : Size.H;
    }
}
