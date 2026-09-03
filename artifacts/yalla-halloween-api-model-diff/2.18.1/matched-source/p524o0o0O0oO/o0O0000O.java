package p524o0o0O0oO;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import o00OOO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0O0;
import p143o00OOooo.o00O0O00;
import p143o00OOooo.o00O0O0O;
import p143o00OOooo.o00O0OO;
import p143o00OOooo.o00O0OO0;
import p143o00OOooo.o00OO000;
import p143o00OOooo.o00OO00O;
import p143o00OOooo.oo0oOO0;
import p159o00OoOO.o000O;
import p168o00Ooo0.o00O0O;
import p176o00OoooO.oO00Oo0;
import p254o00ooO0O.oOO00O;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p501o0o00o.o0000O;
import p501o0o00o.o0000OO0;
import p501o0o00o.o0000oo;
import p522o0o0O0o.o00O00O;
import p525o0o0O0oo.o0OO000o;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ha;
import p649o0ooOOoo.wa;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0000O extends o0OO000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public oO00Oo0 f43020OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f43021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Integer[] f43022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ha f43023OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f43024OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public wa f43025OooO0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            iArr[VipLevel.Vip1.ordinal()] = 1;
            iArr[VipLevel.Vip2.ordinal()] = 2;
            iArr[VipLevel.Vip3.ordinal()] = 3;
            iArr[VipLevel.Vip4.ordinal()] = 4;
            iArr[VipLevel.Vip5.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o0O0000O(@NotNull MainActivity activity, @NotNull ha binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f43021OooO0Oo = activity;
        this.f43023OooO0o0 = binding;
        this.f43022OooO0o = new Integer[]{Integer.valueOf(R.string.single_language_English), Integer.valueOf(R.string.single_language_Arabic), Integer.valueOf(R.string.single_language_Turkish), Integer.valueOf(R.string.single_language_Indonesia), Integer.valueOf(R.string.single_language_Japanese), Integer.valueOf(R.string.single_language_Portugal), Integer.valueOf(R.string.single_language_Espana), Integer.valueOf(R.string.single_language_Hindi), Integer.valueOf(R.string.single_language_Urdu)};
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO00o() {
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        MediatorLiveData<Boolean> drawerTaskDot = sharedMainMessageManager.getDrawerTaskDot();
        int i = 1;
        if (drawerTaskDot != null) {
            drawerTaskDot.observe(this.f43021OooO0Oo, new o0000oo(this, i));
        }
        MediatorLiveData<Boolean> storeDot = sharedMainMessageManager.getStoreDot();
        if (storeDot != null) {
            storeDot.observe(this.f43021OooO0Oo, new o0000O(this, i));
        }
        MediatorLiveData<Boolean> premiumDot = sharedMainMessageManager.getPremiumDot();
        if (premiumDot != null) {
            premiumDot.observe(this.f43021OooO0Oo, new oo00oO(this, 0));
        }
        MediatorLiveData<Boolean> vipDot = sharedMainMessageManager.getVipDot();
        if (vipDot != null) {
            vipDot.observe(this.f43021OooO0Oo, new o0000OO0(this, i));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0O0() {
        final wa waVarOooO00o = wa.OooO00o(this.f43023OooO0o0.f49541OooOO0.inflate());
        Intrinsics.checkNotNullExpressionValue(waVarOooO00o, "bind(binding.vsDrawer.inflate())");
        this.f43025OooO0oo = waVarOooO00o;
        int i = 1;
        this.f43024OooO0oO = true;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        oooOOO.OooOoO().observe(this.f43021OooO0Oo, new o00O0O00(waVarOooO00o, i));
        oooOOO.OooO0oO().observe(this.f43021OooO0Oo, new o00O0O0(new o00O0O(this.f43021OooO0Oo, waVarOooO00o.f50878OooO0oo), i));
        int i2 = 0;
        oooOOO.OooOO0O().observe(this.f43021OooO0Oo, new o0oOOo(waVarOooO00o, this, i2));
        MediatorLiveData<Boolean> drawUserDot = SharedMainMessageManager.INSTANCE.getDrawUserDot();
        if (drawUserDot != null) {
            drawUserDot.observe(this.f43021OooO0Oo, new o0O00o0(waVarOooO00o, i2));
        }
        oooOOO.OooO0oo().observe(this.f43021OooO0Oo, new Observer() { // from class: o0o0O0oO.o0O0o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                o0O0000O this$0 = this.f43079OooO00o;
                wa bindingDrawer = waVarOooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this$0.f43021OooO0Oo);
                oooO00o.f48429OooO0OO = o00O00O.OooO00o((String) obj);
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO00o(OooO00o.OooO0o0());
                oooO00o.OooO0o(bindingDrawer.f50873OooO0OO);
            }
        });
        int i3 = 2;
        oooOOO.OooOoO0().observe(this.f43021OooO0Oo, new o000O(waVarOooO00o, i3));
        ((MutableLiveData) OooOOO.f41230OooOOOo.getValue()).observe(this.f43021OooO0Oo, new o00OO00O(waVarOooO00o, i));
        int i4 = 3;
        oooOOO.OooO0OO().observe(this.f43021OooO0Oo, new o00O0OO(waVarOooO00o, i4));
        oooOOO.OooO0o().observe(this.f43021OooO0Oo, new o00OO000(waVarOooO00o, i3));
        waVarOooO00o.f50875OooO0o.f50950OooOOo.setShowProtection(true);
        oooOOO.OooOOO0().observe(this.f43021OooO0Oo, new oo0oOO0(waVarOooO00o, i3));
        oooOOO.OooOO0().observe(this.f43021OooO0Oo, new o00O0OO0(waVarOooO00o, i3));
        oooOOO.OooOOO().observe(this.f43021OooO0Oo, new Observer() { // from class: o0o0O0oO.o0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                o0O0000O this$0 = this.f43014OooO00o;
                wa bindingDrawer = waVarOooO00o;
                Integer region = (Integer) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(bindingDrawer, "$bindingDrawer");
                Intrinsics.checkNotNullExpressionValue(region, "region");
                if (region.intValue() > this$0.f43022OooO0o.length - 1) {
                    bindingDrawer.f50875OooO0o.f50954OooOo0.setText("");
                    TextView textView = bindingDrawer.f50875OooO0o.f50954OooOo0;
                    Intrinsics.checkNotNullExpressionValue(textView, "bindingDrawer.list.tvLanguage");
                    oOO00O.OooO00o(textView);
                    return;
                }
                TextView textView2 = bindingDrawer.f50875OooO0o.f50954OooOo0;
                Intrinsics.checkNotNullExpressionValue(textView2, "bindingDrawer.list.tvLanguage");
                oOO00O.OooO(textView2);
                bindingDrawer.f50875OooO0o.f50954OooOo0.setText(this$0.f43022OooO0o[region.intValue()].intValue());
            }
        });
        oooOOO.OooO().observe(this.f43021OooO0Oo, new o00O0O0O(waVarOooO00o, 4));
        oooOOO.OooOoo().observe(this.f43021OooO0Oo, new o00OOO00.OooO00o(waVarOooO00o, i4));
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        if (OooOOO0.OooO00o().OooOO0O() == 0) {
            ImageView imageView = waVarOooO00o.f50875OooO0o.f50939OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView, "bindingDrawer.list.firstChargeReward");
            oOO00O.OooO00o(imageView);
        } else {
            ImageView imageView2 = waVarOooO00o.f50875OooO0o.f50939OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView2, "bindingDrawer.list.firstChargeReward");
            oOO00O.OooO(imageView2);
        }
        DrawerLayout drawerLayout = this.f43023OooO0o0.f49535OooO0OO;
        o0O00o00 o0o00o01 = new o0O00o00(this, waVarOooO00o);
        Objects.requireNonNull(drawerLayout);
        if (drawerLayout.f8051OooooOo == null) {
            drawerLayout.f8051OooooOo = new ArrayList();
        }
        drawerLayout.f8051OooooOo.add(o0o00o01);
        wa waVar = this.f43025OooO0oo;
        if (waVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
            waVar = null;
        }
        View view = waVar.f50880OooOO0O;
        Intrinsics.checkNotNullExpressionValue(view, "bindingDrawer.vTopBg");
        oOO00O.OooO0oO(view, new o0OoOoOo(this));
        LinearLayout linearLayout = waVar.f50875OooO0o.f50951OooOOo0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "bindingDrawer.list.navTask");
        oOO00O.OooO0oO(linearLayout, new o0O000Oo(this));
        LinearLayout linearLayout2 = waVar.f50875OooO0o.f50946OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "bindingDrawer.list.navRecharge");
        oOO00O.OooO0oO(linearLayout2, new o0O000o0(this));
        ImageView imageView3 = waVar.f50875OooO0o.f50939OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView3, "bindingDrawer.list.firstChargeReward");
        oOO00O.OooO0oO(imageView3, new o0O00(this));
        LinearLayout linearLayout3 = waVar.f50875OooO0o.f50947OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "bindingDrawer.list.navPremium");
        oOO00O.OooO0oO(linearLayout3, new o0OoO00O(this));
        LinearLayout linearLayout4 = waVar.f50875OooO0o.f50943OooOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "bindingDrawer.list.navKAVip");
        oOO00O.OooO0oO(linearLayout4, new o0O00O0o(this));
        LinearLayout linearLayout5 = waVar.f50875OooO0o.f50949OooOOOo;
        Intrinsics.checkNotNullExpressionValue(linearLayout5, "bindingDrawer.list.navStore");
        oOO00O.OooO0oO(linearLayout5, new o0O00O(this));
        LinearLayout linearLayout6 = waVar.f50875OooO0o.f50945OooOO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout6, "bindingDrawer.list.navLevel");
        oOO00O.OooO0oO(linearLayout6, new o0O00OOO(this));
        LinearLayout linearLayout7 = waVar.f50875OooO0o.f50944OooOO0O;
        Intrinsics.checkNotNullExpressionValue(linearLayout7, "bindingDrawer.list.navLanguage");
        oOO00O.OooO0oO(linearLayout7, new o0oO0Ooo(this));
        LinearLayout linearLayout8 = waVar.f50875OooO0o.f50934OooO;
        Intrinsics.checkNotNullExpressionValue(linearLayout8, "bindingDrawer.list.navFAQ");
        oOO00O.OooO0oO(linearLayout8, new o0O000(this));
        LinearLayout linearLayout9 = waVar.f50875OooO0o.f50948OooOOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayout9, "bindingDrawer.list.navSetting");
        oOO00O.OooO0oO(linearLayout9, new o0O000O(this));
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0OO() {
        DrawerLayout drawerLayout = this.f43023OooO0o0.f49533OooO00o;
        oo000o oo000oVar = new oo000o() { // from class: o0o0O0oO.o0O00000
            @Override // o000O0O0.oo000o
            public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat insets) {
                o0O0000O this$0 = this.f43019Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                if (this$0.f43024OooO0oO) {
                    p617o0oo0o.oOO00O ooo00o = p617o0oo0o.oOO00O.f48582OooO00o;
                    wa waVar = this$0.f43025OooO0oo;
                    wa waVar2 = null;
                    if (waVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                        waVar = null;
                    }
                    View view2 = waVar.f50880OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(view2, "bindingDrawer.vTopBg");
                    ooo00o.OooO00o(view2, insets, true);
                    wa waVar3 = this$0.f43025OooO0oo;
                    if (waVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bindingDrawer");
                    } else {
                        waVar2 = waVar3;
                    }
                    NetImageView netImageView = waVar2.f50873OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(netImageView, "bindingDrawer.ivHeader");
                    ooo00o.OooO00o(netImageView, insets, false);
                }
                return insets;
            }
        };
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(drawerLayout, oo000oVar);
        super.OooO0OO();
    }
}
