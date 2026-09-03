package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.model.PremiumLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\"\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/UserPremiumView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lkotlin/Pair;", "", "", "premium", "", "setPremium", "OooO0Oo", "Z", "getShowProtection", "()Z", "setShowProtection", "(Z)V", "showProtection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserPremiumView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f30802OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    public boolean showProtection;

    public static final class OooO00o {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.UserPremiumView$OooO00o$OooO00o, reason: collision with other inner class name */
        public /* synthetic */ class C0343OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PremiumLevel.values().length];
                try {
                    iArr[PremiumLevel.Premium0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PremiumLevel.Premium1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PremiumLevel.Premium2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PremiumLevel.Premium3.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PremiumLevel.Premium4.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PremiumLevel.Premium5.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PremiumLevel.Premium6.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PremiumLevel.Premium7.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static int OooO00o(int i) {
            switch (C0343OooO00o.$EnumSwitchMapping$0[PremiumLevel.INSTANCE.of(Integer.valueOf(i)).ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return oOo00OO0.ic_vip1;
                case 3:
                    return oOo00OO0.ic_vip2;
                case 4:
                    return oOo00OO0.ic_vip3;
                case 5:
                    return oOo00OO0.ic_vip4;
                case 6:
                    return oOo00OO0.ic_vip5;
                case 7:
                    return oOo00OO0.ic_vip6;
                case 8:
                    return oOo00OO0.ic_vip7;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @NotNull
        public static String OooO0O0(int i) {
            return OooO0OO(PremiumLevel.INSTANCE.of(Integer.valueOf(i)));
        }

        @NotNull
        public static String OooO0OO(@NotNull PremiumLevel premiumLevel) {
            Intrinsics.checkNotNullParameter(premiumLevel, "premiumLevel");
            return o0000.OooO0OO(OooO0Oo(premiumLevel));
        }

        public static int OooO0Oo(PremiumLevel premiumLevel) {
            switch (C0343OooO00o.$EnumSwitchMapping$0[premiumLevel.ordinal()]) {
                case 1:
                    return oO00OOo0.single_placeholder;
                case 2:
                    return oO00OOo0.Patrician;
                case 3:
                    return oO00OOo0.Knight;
                case 4:
                    return oO00OOo0.Baron;
                case 5:
                    return oO00OOo0.Count;
                case 6:
                    return oO00OOo0.Marquis;
                case 7:
                    return oO00OOo0.Duke;
                case 8:
                    return oO00OOo0.Emperor;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PremiumLevel.values().length];
            try {
                iArr[PremiumLevel.Premium1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumLevel.Premium2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumLevel.Premium3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumLevel.Premium4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumLevel.Premium5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PremiumLevel.Premium6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PremiumLevel.Premium7.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PremiumLevel.Premium0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserPremiumView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0OO(int i, int i2) {
        OooO0o0(i == 1, PremiumLevel.INSTANCE.of(Integer.valueOf(i2)));
    }

    public final void OooO0Oo(int i, boolean z) {
        OooO0o0(z, PremiumLevel.INSTANCE.of(Integer.valueOf(i)));
    }

    public final void OooO0o0(boolean z, @NotNull PremiumLevel premiumLevel) {
        Intrinsics.checkNotNullParameter(premiumLevel, "premiumLevel");
        if (premiumLevel.getValue() <= 0 || !(z || this.showProtection)) {
            setVisibility(8);
        }
        boolean z2 = false;
        setVisibility(0);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        int value = premiumLevel.getValue();
        PremiumLevel premiumLevel2 = PremiumLevel.Premium5;
        if (value > premiumLevel2.getValue()) {
            premiumLevel = premiumLevel2;
        }
        if (!z && this.showProtection) {
            z2 = true;
        }
        switch (OooO0O0.$EnumSwitchMapping$0[premiumLevel.ordinal()]) {
            case 1:
                setImageResource(z2 ? oOo00OO0.ic_vip1_expired : oOo00OO0.ic_vip1);
                break;
            case 2:
                setImageResource(z2 ? oOo00OO0.ic_vip2_expired : oOo00OO0.ic_vip2);
                break;
            case 3:
                setImageResource(z2 ? oOo00OO0.ic_vip3_expired : oOo00OO0.ic_vip3);
                break;
            case 4:
                setImageResource(z2 ? oOo00OO0.ic_vip4_expired : oOo00OO0.ic_vip4);
                break;
            case 5:
                setImageResource(z2 ? oOo00OO0.ic_vip5_expired : oOo00OO0.ic_vip5);
                break;
            case 6:
                setImageResource(z2 ? oOo00OO0.ic_vip6_expired : oOo00OO0.ic_vip6);
                break;
            case 7:
                setImageResource(z2 ? oOo00OO0.ic_vip7_expired : oOo00OO0.ic_vip7);
                break;
            case 8:
                setVisibility(8);
                break;
        }
    }

    public final boolean getShowProtection() {
        return this.showProtection;
    }

    public final void setPremium(@NotNull Pair<Boolean, Integer> premium) {
        Intrinsics.checkNotNullParameter(premium, "premium");
        OooO0o0(premium.getFirst().booleanValue(), PremiumLevel.INSTANCE.of(premium.getSecond()));
    }

    public final void setShowProtection(boolean z) {
        this.showProtection = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserPremiumView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserPremiumView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserPremiumView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
