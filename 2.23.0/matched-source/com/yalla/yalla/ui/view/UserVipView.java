package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.VipLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/view/UserVipView;", "Lcom/code/android/uikit/svga/SVGAView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserVipView extends SVGAView {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f30811Oooo000;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            try {
                iArr[VipLevel.Vip0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VipLevel.Vip1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VipLevel.Vip2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VipLevel.Vip3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VipLevel.Vip4.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VipLevel.Vip5.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VipLevel.Vip6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserVipView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooOOO(int i, boolean z, LifecycleOwner lifecycleOwner) {
        if (!z) {
            o000OO00.OooO0O0(this);
        }
        switch (OooO00o.$EnumSwitchMapping$0[VipLevel.INSTANCE.of(i).ordinal()]) {
            case 1:
                setImageResource(oO00O0o.tr_00);
                o000OO00.OooO0O0(this);
                break;
            case 2:
                o000OO00.OooOOOO(this);
                setImageResource(oOo00OO0.user_ka_vip_level_image_1);
                break;
            case 3:
                o000OO00.OooOOOO(this);
                setImageResource(oOo00OO0.user_ka_vip_level_image_2);
                break;
            case 4:
                o000OO00.OooOOOO(this);
                setImageResource(oOo00OO0.user_ka_vip_level_image_3);
                break;
            case 5:
                o000OO00.OooOOOO(this);
                setImageResource(oOo00OO0.user_ka_vip_level_image_4);
                break;
            case 6:
                o000OO00.OooOOOO(this);
                setImageResource(oOo00OO0.user_ka_vip_level_image_5);
                break;
            case 7:
                o000OO00.OooOOOO(this);
                OooOO0O(this.f30811Oooo000 ? "svga/ic_vip6_big.svga" : "svga/ic_vip6_small.svga", lifecycleOwner);
                OooOO0o();
                break;
            default:
                setImageResource(oO00O0o.tr_00);
                o000OO00.OooO0O0(this);
                break;
        }
    }

    @JvmOverloads
    public final void OooOOOO(int i, boolean z, @Nullable LifecycleOwner lifecycleOwner) {
        this.f30811Oooo000 = false;
        OooOOO(i, z, lifecycleOwner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserVipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserVipView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserVipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
