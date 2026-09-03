package p176o00OoooO;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.fragment.RoomWearCrazyFragment;
import com.app.base.fragment.RoomWearHatsFragment;
import com.app.base.fragment.RoomWearVoiceFragment;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.model.SkillCardListModel;
import com.app.base.model.socketPostModel.SkillCardSendModel;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p031OoooO.o0000O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p508o0o00oOo.o000;
import p522o0o0O0o.o00;
import p579o0oOoOOo.m;
import p579o0oOoOOo.p;
import p616o0oo0Ooo.oO0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ValidFragment"})
public class oO000O0O extends androidx.fragment.app.OooOo00 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f32793Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public RoomUserInfoModel f32794Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Dialog f32795Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f32796Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f32797OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f32798OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f32799OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f32800OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f32801OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f32802OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f32803OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f32804OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public NetImageView f32805OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ImageView f32806OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public RecyclerView f32807Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ViewPager f32808Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public SVGAView f32809OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public Button f32810OooooOO;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public RoomWearHatsFragment f32812Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ArrayList<Fragment> f32813Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public RoomWearCrazyFragment f32814OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public RoomWearVoiceFragment f32815Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f32816o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<RoomLoginInformation.MIC> f32817o00O0O;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int[] f32811OooooOo = {R.string.headwear, R.string.balderdash, R.string.Voice_Changer};

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f32818o0OoOo0 = 0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ArrayList<RoomLoginInformation.MIC> f32819ooOO = new ArrayList<>();

    public class OooO extends o00Oo0 {
        public OooO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            oO000O0O oo000o0o = oO000O0O.this;
            if (oo000o0o.f32818o0OoOo0 != 0) {
                oo000o0o.f32808Ooooo0o.setCurrentItem(0);
            }
        }
    }

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            p.OooO00o(false, false, new Function1() { // from class: o00OoooO.oO000O0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    o00.OooO00o(oO000O0O.this.getDialog(), ((m) obj).f41544Oooo0oO);
                    return null;
                }
            });
        }
    }

    public class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            SkillCardListModel.DataBean selectedWear;
            oO000O0O oo000o0o = oO000O0O.this;
            int i = oo000o0o.f32818o0OoOo0;
            boolean z = true;
            if (i == 0) {
                selectedWear = ((RoomWearHatsFragment) oo000o0o.f32813Oooooo0.get(i)).getSelectedWear();
            } else if (i != 1) {
                selectedWear = i != 2 ? null : ((RoomWearVoiceFragment) oo000o0o.f32813Oooooo0.get(i)).getSelectedWear();
            } else {
                selectedWear = ((RoomWearCrazyFragment) oo000o0o.f32813Oooooo0.get(i)).getSelectedWear();
            }
            if (selectedWear == null) {
                return;
            }
            int i2 = selectedWear.warestype;
            if (i2 != 1) {
                if (i2 == 2) {
                    oO000O0O.this.dismiss();
                    o00O000 o00o000OooO = o00O000.OooO();
                    long userId = oO000O0O.this.f32794Oooo0o.getUserId();
                    int i3 = Integer.parseInt(selectedWear.shopid);
                    Objects.requireNonNull(o00o000OooO);
                    if (o00O000.f32468OooO00o != null) {
                        SkillCardSendModel skillCardSendModel = new SkillCardSendModel();
                        skillCardSendModel.target = userId;
                        skillCardSendModel.differtype = i3;
                        o00O000.f32468OooO00o.OooO0o(10050, o0Oo0oo.OooO0Oo(skillCardSendModel));
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                oO000O0O.this.dismiss();
                o00O000 o00o000OooO2 = o00O000.OooO();
                long userId2 = oO000O0O.this.f32794Oooo0o.getUserId();
                int i4 = Integer.parseInt(selectedWear.shopid);
                Objects.requireNonNull(o00o000OooO2);
                if (o00O000.f32468OooO00o != null) {
                    Room.MagicVoiceIn.Builder builderNewBuilder = Room.MagicVoiceIn.newBuilder();
                    builderNewBuilder.setTarget(userId2);
                    builderNewBuilder.setCardid(i4);
                    o00O000.f32468OooO00o.OooO0oO(10066, builderNewBuilder.build().toByteArray());
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (oO000O0O.this.f32805OoooOoO.getVisibility() == 0 && oO000O0O.this.f32794Oooo0o.getIsSelectedForSendHats()) {
                arrayList.add(Long.valueOf(oO000O0O.this.f32794Oooo0o.getUserId()));
            }
            for (RoomLoginInformation.MIC mic : oO000O0O.this.f32819ooOO) {
                if (mic.isSelectedForSendHats) {
                    arrayList.add(Long.valueOf(mic.user.getUserId()));
                }
            }
            if (arrayList.isEmpty()) {
                String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Choose_AtLeast_One);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                    return;
                } else {
                    p254o00ooO0O.o00O000 o00o001 = p254o00ooO0O.o00O000.f34346OooO00o;
                    p254o00ooO0O.o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    return;
                }
            }
            int size = arrayList.size() - Integer.parseInt(selectedWear.num);
            if (size <= 0) {
                oO000O0O.this.dismiss();
                o00O000.OooO().OooOo((Long[]) arrayList.toArray(new Long[arrayList.size()]), Integer.parseInt(selectedWear.shopid));
                return;
            }
            if (selectedWear.state == 1 || selectedWear.activityType == 1) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(oO000O0O.this.requireContext());
                oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.hats_not_enough));
                oo0ooo0.OooOo0o(new Function0() { // from class: o00OoooO.oO0Ooooo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        oO000O0O.this.dismiss();
                        return null;
                    }
                });
                oo0ooo0.OooOOO0();
                return;
            }
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
            if (selectedWear.lowestVIPLv <= 0 || value.getFirst().booleanValue()) {
                if (Integer.parseInt(selectedWear.discountprice) * size > oooOOO.OooO0OO().getValue().longValue()) {
                    LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").post(oO000O0O.this.f32795Oooo0oO);
                    return;
                } else {
                    oO000O0O.this.dismiss();
                    o00O000.OooO().OooOo((Long[]) arrayList.toArray(new Long[arrayList.size()]), Integer.parseInt(selectedWear.shopid));
                    return;
                }
            }
            if (Integer.parseInt(selectedWear.num) != 0) {
                oo0oOO0 oo0ooo1 = new oo0oOO0(oO000O0O.this.requireContext());
                oo0ooo1.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.hats_not_enough));
                oo0ooo1.OooOo0o(new Function0() { // from class: o00OoooO.oO0o0o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        oO000O0O.this.dismiss();
                        return null;
                    }
                });
                oo0ooo1.OooOOO0();
                return;
            }
            oO000O0O.this.dismiss();
            oo0oOO0 oo0ooo2 = new oo0oOO0(oO000O0O.this.requireContext());
            oo0ooo2.OooOo0(R.string.VIP_commodity);
            oo0ooo2.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
            oo0ooo2.OooOo0o(new Function0() { // from class: o00OoooO.oO0OoOO0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                    Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
                    if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        contextOooO0O0 = null;
                    }
                    oooO00o.OooO00o(contextOooO0O0, PremiumLevel.Premium1);
                    return null;
                }
            });
            oo0ooo2.OooOoO();
            oo0ooo2.OooOOO0();
        }
    }

    public class OooO0OO extends o00OO0O0.OooO0O0 {
        public OooO0OO(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            SkillCardListModel skillCardListModel = (SkillCardListModel) o0Oo0oo.OooO0O0(str, SkillCardListModel.class);
            oO000O0O oo000o0o = oO000O0O.this;
            if (oo000o0o.f32812Oooooo == null || oo000o0o.f32814OoooooO == null) {
                return;
            }
            oo000o0o.f32809OooooO0.OooO0o0(true);
            oO000O0O.this.f32809OooooO0.setVisibility(8);
            if (skillCardListModel != null) {
                oO000O0O.this.f32812Oooooo.setData(skillCardListModel.data1);
                oO000O0O.this.f32814OoooooO.setData(skillCardListModel.data);
                oO000O0O.this.f32815Ooooooo.setData(skillCardListModel.data2);
            }
        }
    }

    public class OooO0o implements Observer<Long> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            oO000O0O oo000o0o = oO000O0O.this;
            long jLongValue = l.longValue();
            TextView textView = oo000o0o.f32800OoooO0O;
            if (textView != null) {
                textView.setText(o0O0O00.OooO0Oo(String.valueOf(jLongValue)));
            }
        }
    }

    public class OooOO0 extends o00Oo0 {
        public OooOO0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            oO000O0O oo000o0o = oO000O0O.this;
            if (oo000o0o.f32818o0OoOo0 != 1) {
                oo000o0o.f32808Ooooo0o.setCurrentItem(1);
            }
        }
    }

    public class OooOO0O extends o00Oo0 {
        public OooOO0O() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            oO000O0O oo000o0o = oO000O0O.this;
            if (oo000o0o.f32818o0OoOo0 != 2) {
                oo000o0o.f32808Ooooo0o.setCurrentItem(2);
            }
        }
    }

    public class OooOOO implements ViewPager.OooOOO0 {
        public OooOOO() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            oO000O0O oo000o0o = oO000O0O.this;
            oo000o0o.f32818o0OoOo0 = i;
            oo000o0o.OooO00o();
            if (i == 0) {
                oO000O0O.this.f32803OoooOOo.findViewById(R.id.llUser).setVisibility(0);
            } else {
                oO000O0O.this.f32803OoooOOo.findViewById(R.id.llUser).setVisibility(8);
            }
        }
    }

    public class OooOOO0 extends o00000 {
        public OooOOO0(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p105o000oo0o.o00Ooo
        public final int OooO0OO() {
            return oO000O0O.this.f32813Oooooo0.size();
        }

        @Override // p105o000oo0o.o00Ooo
        public final CharSequence OooO0o0(int i) {
            oO000O0O oo000o0o = oO000O0O.this;
            return i < oo000o0o.f32811OooooOo.length ? oo000o0o.getResources().getString(oO000O0O.this.f32811OooooOo[i]) : "";
        }

        @Override // androidx.fragment.app.o00000
        public final Fragment OooOOOo(int i) {
            return oO000O0O.this.f32813Oooooo0.get(i);
        }
    }

    public class OooOOOO extends p188o00o00o0.OooO0OO<RoomLoginInformation.MIC> {
        public OooOOOO(Context context) {
            super(context, R.layout.room_item_card_hats_user);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            RoomLoginInformation.MIC mic = (RoomLoginInformation.MIC) obj;
            NetImageView netImageView = (NetImageView) oooO0o.OooO0Oo(R.id.ivHeader);
            if (mic.user != null) {
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0O0(1, com.yalla.support.common.util.OooOOO.OooO00o(R.color.transparent)));
                oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(mic.user.getUserHeader(), com.yalla.support.common.util.OooOo00.OooO00o(24.0f), true);
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o(netImageView);
                if (mic.isSelectedForSendHats) {
                    netImageView.setBorderColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9));
                    oooO0o.OooO0o(R.id.tvIndex, R.drawable.room_shape_bg_card_hats_user_index_selected);
                } else {
                    oooO0o.OooO0o(R.id.tvIndex, R.drawable.room_shape_bg_card_hats_user_index);
                }
            }
            oooO0o.OooOO0(R.id.tvIndex, (mic.getMicorder() + 1) + "");
        }
    }

    public class OooOo extends o00Oo0 {
        public OooOo() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            Context context = oO000O0O.this.getContext();
            int i = oO000O0O.this.f32818o0OoOo0;
            int i2 = PurchaseSkillCardActivity.f23211Oooooo;
            Intent intent = new Intent(context, (Class<?>) PurchaseSkillCardActivity.class);
            intent.putExtra("page", i);
            context.startActivity(intent);
        }
    }

    public class OooOo00 implements BaseQuickAdapter.OooOOOO {
        public OooOo00() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            RoomLoginInformation.MIC mic = oO000O0O.this.f32817o00O0O.getData().get(i);
            mic.isSelectedForSendHats = !mic.isSelectedForSendHats;
            oO000O0O.this.f32817o00O0O.notifyItemChanged(i);
            oO000O0O.this.OooO0OO();
            oO000O0O.this.OooO0O0();
        }
    }

    public final void OooO00o() {
        int i = this.f32818o0OoOo0;
        if (i == 0) {
            this.f32796Oooo0oo.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextSelected);
            this.f32796Oooo0oo.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(42.0f);
            this.f32796Oooo0oo.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_selected);
            this.f32793Oooo.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextNormal);
            this.f32793Oooo.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(36.0f);
            this.f32793Oooo.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_crazy_normal);
            this.f32799OoooO00.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextNormal);
            this.f32799OoooO00.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(36.0f);
            this.f32799OoooO00.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_voice_normal);
            this.f32801OoooOO0.setVisibility(4);
            this.f32816o000oOoO.setVisibility(0);
            this.f32802OoooOOO.setVisibility(0);
            return;
        }
        if (i == 1) {
            this.f32796Oooo0oo.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextNormal);
            this.f32796Oooo0oo.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(36.0f);
            this.f32796Oooo0oo.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_hat_normal);
            this.f32793Oooo.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextSelected);
            this.f32793Oooo.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(42.0f);
            this.f32793Oooo.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_selected);
            this.f32799OoooO00.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextNormal);
            this.f32799OoooO00.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(36.0f);
            this.f32799OoooO00.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_voice_normal);
            this.f32801OoooOO0.setVisibility(0);
            this.f32816o000oOoO.setVisibility(4);
            this.f32802OoooOOO.setVisibility(0);
            return;
        }
        this.f32796Oooo0oo.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextNormal);
        this.f32796Oooo0oo.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(36.0f);
        this.f32796Oooo0oo.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_hat_normal);
        this.f32793Oooo.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextNormal);
        this.f32793Oooo.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(36.0f);
        this.f32793Oooo.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_crazy_normal);
        this.f32799OoooO00.setTextAppearance(getContext(), R.style.RoomWearDialogTabTextSelected);
        this.f32799OoooO00.getLayoutParams().height = com.yalla.support.common.util.OooOo00.OooO00o(42.0f);
        this.f32799OoooO00.setBackgroundResource(R.drawable.shape_bg_dialog_room_wear_tab_selected);
        this.f32801OoooOO0.setVisibility(0);
        this.f32816o000oOoO.setVisibility(0);
        this.f32802OoooOOO.setVisibility(4);
    }

    public final void OooO0O0() {
        String userHeader;
        if (this.f32805OoooOoO.getVisibility() == 0 && this.f32794Oooo0o.getIsSelectedForSendHats()) {
            this.f32812Oooooo.updateUserHeader(this.f32794Oooo0o.getUserHeader());
            return;
        }
        Iterator<RoomLoginInformation.MIC> it = this.f32819ooOO.iterator();
        while (true) {
            if (!it.hasNext()) {
                userHeader = "";
                break;
            }
            RoomLoginInformation.MIC next = it.next();
            if (next.isSelectedForSendHats) {
                userHeader = next.user.getUserHeader();
                break;
            }
        }
        RoomWearHatsFragment roomWearHatsFragment = this.f32812Oooooo;
        if (roomWearHatsFragment != null) {
            roomWearHatsFragment.updateUserHeader(userHeader);
        }
    }

    public final void OooO0OO() {
        boolean z;
        Iterator<RoomLoginInformation.MIC> it = this.f32817o00O0O.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!it.next().isSelectedForSendHats) {
                z = false;
                break;
            }
        }
        this.f32806OoooOoo.setImageTintList(ColorStateList.valueOf(com.yalla.support.common.util.OooOOO.OooO00o(z ? R.color.color_00d8c9 : R.color.color_918EAD)));
    }

    @Override // androidx.fragment.app.OooOo00
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().requestFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) getArguments().getSerializable("user_key");
        this.f32794Oooo0o = roomUserInfoModel;
        roomUserInfoModel.setSelectedForSendHats(!o000O00O.OooO().OooOOo(this.f32794Oooo0o.getUserId()));
        View viewInflate = layoutInflater.inflate(R.layout.skill_select_popup, viewGroup);
        this.f32803OoooOOo = viewInflate.findViewById(R.id.llUser);
        this.f32805OoooOoO = (NetImageView) viewInflate.findViewById(R.id.ivSelectedUser);
        this.f32804OoooOo0 = viewInflate.findViewById(R.id.vLine);
        this.f32806OoooOoo = (ImageView) viewInflate.findViewById(R.id.ivAll);
        this.f32807Ooooo00 = (RecyclerView) viewInflate.findViewById(R.id.rv);
        this.f32798OoooO0 = (TextView) viewInflate.findViewById(R.id.tv_wear_tab_store);
        this.f32796Oooo0oo = (TextView) viewInflate.findViewById(R.id.tv_wear_tab_hat);
        this.f32793Oooo = (TextView) viewInflate.findViewById(R.id.tv_wear_tab_crazy);
        this.f32799OoooO00 = (TextView) viewInflate.findViewById(R.id.tv_wear_tab_voice);
        this.f32801OoooOO0 = viewInflate.findViewById(R.id.view_room_wear_tab_line_hat);
        this.f32816o000oOoO = viewInflate.findViewById(R.id.view_room_wear_tab_line_crazy);
        this.f32802OoooOOO = viewInflate.findViewById(R.id.view_room_wear_tab_line_voice);
        this.f32808Ooooo0o = (ViewPager) viewInflate.findViewById(R.id.dialog_wear_view_pager_viewPager);
        this.f32809OooooO0 = (SVGAView) viewInflate.findViewById(R.id.svga_dialog_wear_loading);
        this.f32800OoooO0O = (TextView) viewInflate.findViewById(R.id.tv_wear_coin);
        this.f32797OoooO = (TextView) viewInflate.findViewById(R.id.tv_wear_recharge);
        this.f32810OooooOO = (Button) viewInflate.findViewById(R.id.btn_wear_send);
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().observe(this, new OooO0o());
        this.f32796Oooo0oo.setOnClickListener(new OooO());
        this.f32793Oooo.setOnClickListener(new OooOO0());
        this.f32799OoooO00.setOnClickListener(new OooOO0O());
        OooO00o();
        this.f32813Oooooo0 = new ArrayList<>();
        this.f32812Oooooo = RoomWearHatsFragment.newInstance(this.f32794Oooo0o);
        this.f32814OoooooO = RoomWearCrazyFragment.newInstance(this.f32794Oooo0o);
        this.f32815Ooooooo = RoomWearVoiceFragment.newInstance(this.f32794Oooo0o);
        this.f32813Oooooo0.add(this.f32812Oooooo);
        this.f32813Oooooo0.add(this.f32814OoooooO);
        this.f32813Oooooo0.add(this.f32815Ooooooo);
        this.f32808Ooooo0o.setAdapter(new OooOOO0(getChildFragmentManager()));
        this.f32808Ooooo0o.setOffscreenPageLimit(2);
        this.f32808Ooooo0o.OooO0O0(new OooOOO());
        SparseArray<RoomLoginInformation.MIC> sparseArray = o000O00O.OooO().f32431OoooO;
        int i = 0;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            RoomLoginInformation.MIC micValueAt = sparseArray.valueAt(i2);
            if (micValueAt.user != null) {
                micValueAt.setMicorder(i2);
                micValueAt.isSelectedForSendHats = micValueAt.user.getUserId() == this.f32794Oooo0o.getUserId();
                this.f32819ooOO.add(micValueAt);
            }
        }
        this.f32807Ooooo00.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        OooOOOO oooOOOO = new OooOOOO(getContext());
        this.f32817o00O0O = oooOOOO;
        oooOOOO.setOnItemClickListener(new OooOo00());
        this.f32817o00O0O.setFirstLoading(false);
        this.f32807Ooooo00.addItemDecoration(new o000(com.yalla.support.common.util.OooOo00.OooO00o(4.0f), com.yalla.support.common.util.OooOOO.OooO00o(R.color.transparent)));
        this.f32807Ooooo00.setAdapter(this.f32817o00O0O);
        this.f32817o00O0O.setNewData(this.f32819ooOO);
        if (this.f32819ooOO.isEmpty()) {
            this.f32807Ooooo00.setVisibility(8);
            this.f32806OoooOoo.setVisibility(8);
        } else {
            this.f32807Ooooo00.setVisibility(0);
            this.f32806OoooOoo.setVisibility(0);
        }
        if (o000O00O.OooO().OooOOo(this.f32794Oooo0o.getUserId())) {
            this.f32805OoooOoO.setVisibility(8);
            this.f32804OoooOo0.setVisibility(8);
        } else {
            this.f32805OoooOoO.setVisibility(0);
            this.f32804OoooOo0.setVisibility(0);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0O0(1, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9)));
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(this.f32794Oooo0o.getUserHeader(), com.yalla.support.common.util.OooOo00.OooO00o(24.0f), true);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f32805OoooOoO);
        }
        this.f32805OoooOoO.setOnClickListener(new View.OnClickListener() { // from class: o00OoooO.oO000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oO000O0O oo000o0o = this.f32776Oooo0o;
                RoomUserInfoModel roomUserInfoModel2 = oo000o0o.f32794Oooo0o;
                roomUserInfoModel2.setSelectedForSendHats(!roomUserInfoModel2.getIsSelectedForSendHats());
                if (oo000o0o.f32794Oooo0o.getIsSelectedForSendHats()) {
                    oo000o0o.f32805OoooOoO.setBorderColor(OooOOO.OooO00o(R.color.color_00d8c9));
                } else {
                    oo000o0o.f32805OoooOoO.setBorderColor(OooOOO.OooO00o(R.color.transparent));
                }
                oo000o0o.OooO0O0();
            }
        });
        this.f32806OoooOoo.setOnClickListener(new oO0000o0(this, i));
        this.f32798OoooO0.setOnClickListener(new OooOo());
        this.f32797OoooO.setOnClickListener(new OooO00o());
        this.f32810OooooOO.setOnClickListener(new OooO0O0());
        OooO0OO();
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        p153o00Oo0oO.o0O0O00 o0o0o00 = o00000OO.f32211OooO0o;
        OooO0OO oooO0OO = new OooO0OO(getActivity());
        App app = App.f11458Oooo0oO;
        Map mapOooO00o = com.app.base.Function.OooO0OO.OooO00o();
        Pair<Boolean, Integer> value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue();
        if (value.getFirst().booleanValue()) {
            mapOooO00o.put("viplevel", value.getSecond() + "");
        }
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32269Ooooo00, mapOooO00o, oooO0OO);
        return viewInflate;
    }

    @Override // androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        this.f32795Oooo0oO = dialog;
        Window window = dialog.getWindow();
        window.setWindowAnimations(R.style.anim_bottom_top_bottom);
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setDimAmount(0.3f);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f32795Oooo0oO.setCanceledOnTouchOutside(true);
    }
}
