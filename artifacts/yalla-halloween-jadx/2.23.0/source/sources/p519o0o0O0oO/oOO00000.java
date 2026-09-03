package p519o0o0O0oO;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Looper;
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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.app.base.protobuf.room.Room;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.model.socketPostModel.SkillCardSendModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.fragment.room.RoomWearCrazyFragment;
import com.yalla.yalla.ui.fragment.room.RoomWearHatsFragment;
import com.yalla.yalla.ui.fragment.room.RoomWearVoiceFragment;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p417o0OoO0.oo0o0Oo;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p475o0o000.o000000;
import p533o0o0Oo0.oo0O;
import p539o0o0OoOO.a2;
import p564o0oOo0OO.o000O;
import p579o0oOoo.oOO0OO;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public class oOO00000 extends androidx.fragment.app.OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f52918OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public RoomUserInfoModel f52919OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TextView f52920OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Dialog f52921OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f52922OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f52923OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f52924OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f52925OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View f52926OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f52927OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public View f52928OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f52929OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f52930OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f52931OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public NetImageView f52932OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f52933OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList<Fragment> f52934OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public SVGAView f52935OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ViewPager f52936OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Button f52937OooOo0O;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RoomWearCrazyFragment f52939OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RoomWearHatsFragment f52940OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public RoomWearVoiceFragment f52941OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooOOOO f52944OooOooO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int[] f52938OooOo0o = {oO00OOo0.headwear, oO00OOo0.balderdash, oO00OOo0.Voice_Changer};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f52943OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ArrayList<RoomUserInfoModel> f52942OooOoo = new ArrayList<>();

    public class OooO extends oo00o {
        public OooO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            oOO00000 ooo00000 = oOO00000.this;
            if (ooo00000.f52943OooOoo0 != 0) {
                ooo00000.f52936OooOo00.setCurrentItem(0);
            }
        }
    }

    public class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            oOO0OO.OooO00o(false, false, new Function1() { // from class: o0o0O0oO.oO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    oo0o0Oo.OooO0OO(oOO00000.this.getDialog(), ((c0) obj).f52534OooO0o0);
                    return null;
                }
            });
        }
    }

    public class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            SkillCardListModel.DataBean selectedWear;
            oOO00000 ooo00000 = oOO00000.this;
            int i = ooo00000.f52943OooOoo0;
            boolean z = true;
            if (i == 0) {
                selectedWear = ((RoomWearHatsFragment) ooo00000.f52934OooOo.get(i)).getSelectedWear();
            } else if (i != 1) {
                selectedWear = i != 2 ? null : ((RoomWearVoiceFragment) ooo00000.f52934OooOo.get(i)).getSelectedWear();
            } else {
                selectedWear = ((RoomWearCrazyFragment) ooo00000.f52934OooOo.get(i)).getSelectedWear();
            }
            if (selectedWear == null) {
                return;
            }
            int i2 = selectedWear.warestype;
            if (i2 != 1) {
                if (i2 == 2) {
                    ooo00000.dismiss();
                    long jLongValue = ooo00000.f52919OooO0Oo.getUserId().getValue().longValue();
                    int i3 = Integer.parseInt(selectedWear.shopid);
                    SkillCardSendModel skillCardSendModel = new SkillCardSendModel();
                    skillCardSendModel.target = jLongValue;
                    skillCardSendModel.differtype = i3;
                    RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oO(10050, oOo00OO0.OooO0OO(skillCardSendModel));
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                ooo00000.dismiss();
                long jLongValue2 = ooo00000.f52919OooO0Oo.getUserId().getValue().longValue();
                int i4 = Integer.parseInt(selectedWear.shopid);
                Room.MagicVoiceIn.Builder builderNewBuilder = Room.MagicVoiceIn.newBuilder();
                builderNewBuilder.setTarget(jLongValue2);
                builderNewBuilder.setCardid(i4);
                RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oo(10066, builderNewBuilder.build().toByteArray());
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (ooo00000.f52932OooOOo0.getVisibility() == 0 && ooo00000.f52919OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
                arrayList.add(ooo00000.f52919OooO0Oo.getUserId().getValue());
            }
            for (RoomUserInfoModel roomUserInfoModel : ooo00000.f52942OooOoo) {
                if (roomUserInfoModel.isSelectedForSendHats().getValue().booleanValue()) {
                    arrayList.add(roomUserInfoModel.getUserId().getValue());
                }
            }
            if (arrayList.isEmpty()) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.Choose_AtLeast_One);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            int size = arrayList.size() - selectedWear.num;
            if (size <= 0) {
                ooo00000.dismiss();
                Long[] lArr = (Long[]) arrayList.toArray(new Long[arrayList.size()]);
                int i5 = Integer.parseInt(selectedWear.shopid);
                HashMap map = new HashMap();
                map.put("cardid", String.valueOf(i5));
                o0OO000.OooO0O0("102035", map);
                SkillCardSendModel skillCardSendModel2 = new SkillCardSendModel();
                skillCardSendModel2.tousers = lArr;
                skillCardSendModel2.headwearid = i5;
                RoomLiveService roomLiveService3 = RoomLiveService.f25058OooOo00;
                if (roomLiveService3 != null) {
                    roomLiveService3.OooO0oO(10049, oOo00OO0.OooO0OO(skillCardSendModel2));
                    return;
                }
                return;
            }
            if (selectedWear.state == 1 || selectedWear.activityType == 1) {
                o0OO00O o0oo00o2 = new o0OO00O(ooo00000.requireContext());
                o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.hats_not_enough));
                o0oo00o2.OooOo0(new Function0() { // from class: o0o0O0oO.oOO0000
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        oOO00000.this.dismiss();
                        return null;
                    }
                });
                o0oo00o2.OooOO0o();
                return;
            }
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Pair pair = (Pair) o000000O.OooOO0o().getValue();
            if (selectedWear.lowestVIPLv > 0 && !((Boolean) pair.getFirst()).booleanValue()) {
                if (selectedWear.num != 0) {
                    o0OO00O o0oo00o3 = new o0OO00O(ooo00000.requireContext());
                    o0oo00o3.OooOo00(o0000.OooO0OO(oO00OOo0.hats_not_enough));
                    o0oo00o3.OooOo0(new Function0() { // from class: o0o0O0oO.oOO000o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            oOO00000.this.dismiss();
                            return null;
                        }
                    });
                    o0oo00o3.OooOO0o();
                    return;
                }
                ooo00000.dismiss();
                o0OO00O o0oo00o4 = new o0OO00O(ooo00000.requireContext());
                o0oo00o4.OooOOoo(oO00OOo0.VIP_commodity);
                o0oo00o4.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
                o0oo00o4.OooOo0(new oOO000());
                o0oo00o4.OooOo(true);
                o0oo00o4.OooOO0o();
                return;
            }
            if (Integer.parseInt(selectedWear.discountprice) * size > ((Long) o000000O.OooO0O0().getValue()).longValue()) {
                LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").post(ooo00000.f52921OooO0o0);
                return;
            }
            ooo00000.dismiss();
            Long[] lArr2 = (Long[]) arrayList.toArray(new Long[arrayList.size()]);
            int i6 = Integer.parseInt(selectedWear.shopid);
            HashMap map2 = new HashMap();
            map2.put("cardid", String.valueOf(i6));
            o0OO000.OooO0O0("102035", map2);
            SkillCardSendModel skillCardSendModel3 = new SkillCardSendModel();
            skillCardSendModel3.tousers = lArr2;
            skillCardSendModel3.headwearid = i6;
            RoomLiveService roomLiveService4 = RoomLiveService.f25058OooOo00;
            if (roomLiveService4 != null) {
                roomLiveService4.OooO0oO(10049, oOo00OO0.OooO0OO(skillCardSendModel3));
            }
        }
    }

    public class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO0OO(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            SkillCardListModel skillCardListModel = (SkillCardListModel) oOo00OO0.OooO00o(str, SkillCardListModel.class);
            oOO00000 ooo00000 = oOO00000.this;
            if (ooo00000.f52940OooOoO0 == null || ooo00000.f52939OooOoO == null) {
                return;
            }
            ooo00000.f52935OooOo0.OooO0oO(true);
            ooo00000.f52935OooOo0.setVisibility(8);
            if (skillCardListModel != null) {
                ooo00000.f52940OooOoO0.setData(skillCardListModel.data1);
                ooo00000.f52939OooOoO.setData(skillCardListModel.data);
                ooo00000.f52941OooOoOO.setData(skillCardListModel.data2);
            }
        }
    }

    public class OooO0o implements Observer<Long> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            long jLongValue = l.longValue();
            TextView textView = oOO00000.this.f52924OooOO0;
            if (textView != null) {
                textView.setText(p590o0oo0.OooOOOO.OooO0Oo(String.valueOf(jLongValue)));
            }
        }
    }

    public class OooOO0 extends oo00o {
        public OooOO0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            oOO00000 ooo00000 = oOO00000.this;
            if (ooo00000.f52943OooOoo0 != 1) {
                ooo00000.f52936OooOo00.setCurrentItem(1);
            }
        }
    }

    public class OooOO0O extends oo00o {
        public OooOO0O() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            oOO00000 ooo00000 = oOO00000.this;
            if (ooo00000.f52943OooOoo0 != 2) {
                ooo00000.f52936OooOo00.setCurrentItem(2);
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
            oOO00000 ooo00000 = oOO00000.this;
            ooo00000.f52943OooOoo0 = i;
            ooo00000.OooO0O0();
            if (i == 0) {
                ooo00000.f52929OooOOOO.findViewById(oO00O0oO.llUser).setVisibility(0);
            } else {
                ooo00000.f52929OooOOOO.findViewById(oO00O0oO.llUser).setVisibility(8);
            }
        }
    }

    public class OooOOO0 extends o00000OO {
        public OooOOO0(FragmentManager fragmentManager) {
            super(fragmentManager, 0);
        }

        @Override // p082o000OoOo.OooOO0O
        public final int OooO0OO() {
            return oOO00000.this.f52934OooOo.size();
        }

        @Override // p082o000OoOo.OooOO0O
        public final CharSequence OooO0o0(int i) {
            oOO00000 ooo00000 = oOO00000.this;
            return i < ooo00000.f52938OooOo0o.length ? ooo00000.getResources().getString(ooo00000.f52938OooOo0o[i]) : "";
        }

        @Override // androidx.fragment.app.o00000OO
        public final Fragment OooOOo0(int i) {
            return oOO00000.this.f52934OooOo.get(i);
        }
    }

    public class OooOOOO extends o000O<RoomUserInfoModel> {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
            NetImageView netImageView = (NetImageView) viewHolder.getView(oO00O0oO.ivHeader);
            int i = 0;
            if (roomUserInfoModel != null) {
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
                oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                oooO00o.OooO0O0(1, o0000.OooO00o(oO00O0o.transparent));
                oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(roomUserInfoModel.getUserHeader().getValue());
                oooO00o.f43909OooO00o = 0;
                oooO00o.f43914OooO0o0 = true;
                oooO00o.OooO0Oo(netImageView);
                if (roomUserInfoModel.isSelectedForSendHats().getValue().booleanValue()) {
                    netImageView.setBorderColor(o0000.OooO00o(oO00O0o.color_00d8c9));
                    viewHolder.setBackgroundRes(oO00O0oO.tvIndex, p584o0oOooO0.oOo00OO0.room_shape_bg_card_hats_user_index_selected);
                } else {
                    viewHolder.setBackgroundRes(oO00O0oO.tvIndex, p584o0oOooO0.oOo00OO0.room_shape_bg_card_hats_user_index);
                }
            }
            for (oo0O oo0o : com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O) {
                if (oo0o.f54838OooO0OO.getValue().equals(roomUserInfoModel.getUserId().getValue())) {
                    i = oo0o.f54836OooO00o;
                    break;
                }
            }
            viewHolder.setText(oO00O0oO.tvIndex, (i + 1) + "");
        }
    }

    public class OooOo extends oo00o {
        public OooOo() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            oOO00000 ooo00000 = oOO00000.this;
            PurchaseSkillCardActivity.OooOo0(ooo00000.f52943OooOoo0, ooo00000.getContext());
        }
    }

    public class OooOo00 implements BaseQuickAdapter.OooO0o {
        public OooOo00() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            oOO00000 ooo00000 = oOO00000.this;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) ooo00000.f52944OooOooO.f10111OooOOoo.get(i);
            roomUserInfoModel.isSelectedForSendHats().setValue(Boolean.valueOf(!roomUserInfoModel.isSelectedForSendHats().getValue().booleanValue()));
            ooo00000.f52944OooOooO.notifyItemChanged(i);
            ooo00000.OooO0Oo();
            ooo00000.OooO0OO();
        }
    }

    public final void OooO0O0() {
        int i = this.f52943OooOoo0;
        if (i == 0) {
            this.f52920OooO0o.setTextAppearance(getContext(), oO00Oo00.RoomWearDialogTabTextSelected);
            this.f52920OooO0o.getLayoutParams().height = o0000O0.OooO00o(42);
            this.f52920OooO0o.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_selected);
            TextView textView = this.f52922OooO0oO;
            Context context = getContext();
            int i2 = oO00Oo00.RoomWearDialogTabTextNormal;
            textView.setTextAppearance(context, i2);
            float f = 36;
            this.f52922OooO0oO.getLayoutParams().height = o0000O0.OooO00o(f);
            this.f52922OooO0oO.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_crazy_normal);
            this.f52923OooO0oo.setTextAppearance(getContext(), i2);
            this.f52923OooO0oo.getLayoutParams().height = o0000O0.OooO00o(f);
            this.f52923OooO0oo.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_voice_normal);
            this.f52926OooOO0o.setVisibility(4);
            this.f52928OooOOO0.setVisibility(0);
            this.f52927OooOOO.setVisibility(0);
            return;
        }
        if (i == 1) {
            TextView textView2 = this.f52920OooO0o;
            Context context2 = getContext();
            int i3 = oO00Oo00.RoomWearDialogTabTextNormal;
            textView2.setTextAppearance(context2, i3);
            float f2 = 36;
            this.f52920OooO0o.getLayoutParams().height = o0000O0.OooO00o(f2);
            this.f52920OooO0o.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_hat_normal);
            this.f52922OooO0oO.setTextAppearance(getContext(), oO00Oo00.RoomWearDialogTabTextSelected);
            this.f52922OooO0oO.getLayoutParams().height = o0000O0.OooO00o(42);
            this.f52922OooO0oO.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_selected);
            this.f52923OooO0oo.setTextAppearance(getContext(), i3);
            this.f52923OooO0oo.getLayoutParams().height = o0000O0.OooO00o(f2);
            this.f52923OooO0oo.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_voice_normal);
            this.f52926OooOO0o.setVisibility(0);
            this.f52928OooOOO0.setVisibility(4);
            this.f52927OooOOO.setVisibility(0);
            return;
        }
        TextView textView3 = this.f52920OooO0o;
        Context context3 = getContext();
        int i4 = oO00Oo00.RoomWearDialogTabTextNormal;
        textView3.setTextAppearance(context3, i4);
        float f3 = 36;
        this.f52920OooO0o.getLayoutParams().height = o0000O0.OooO00o(f3);
        this.f52920OooO0o.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_hat_normal);
        this.f52922OooO0oO.setTextAppearance(getContext(), i4);
        this.f52922OooO0oO.getLayoutParams().height = o0000O0.OooO00o(f3);
        this.f52922OooO0oO.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_crazy_normal);
        this.f52923OooO0oo.setTextAppearance(getContext(), oO00Oo00.RoomWearDialogTabTextSelected);
        this.f52923OooO0oo.getLayoutParams().height = o0000O0.OooO00o(42);
        this.f52923OooO0oo.setBackgroundResource(p584o0oOooO0.oOo00OO0.shape_bg_dialog_room_wear_tab_selected);
        this.f52926OooOO0o.setVisibility(0);
        this.f52928OooOOO0.setVisibility(0);
        this.f52927OooOOO.setVisibility(4);
    }

    public final void OooO0OO() {
        String value;
        if (this.f52932OooOOo0.getVisibility() == 0 && this.f52919OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
            this.f52940OooOoO0.updateUserHeader(this.f52919OooO0Oo.getUserHeader().getValue());
            return;
        }
        Iterator<RoomUserInfoModel> it = this.f52942OooOoo.iterator();
        while (true) {
            if (!it.hasNext()) {
                value = "";
                break;
            }
            RoomUserInfoModel next = it.next();
            if (next.isSelectedForSendHats().getValue().booleanValue()) {
                value = next.getUserHeader().getValue();
                break;
            }
        }
        RoomWearHatsFragment roomWearHatsFragment = this.f52940OooOoO0;
        if (roomWearHatsFragment != null) {
            roomWearHatsFragment.updateUserHeader(value);
        }
    }

    public final void OooO0Oo() {
        boolean z;
        Iterator it = this.f52944OooOooO.f10111OooOOoo.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((RoomUserInfoModel) it.next()).isSelectedForSendHats().getValue().booleanValue()) {
                z = false;
                break;
            }
        }
        this.f52931OooOOo.setImageTintList(ColorStateList.valueOf(o0000.OooO00o(z ? oO00O0o.color_00d8c9 : oO00O0o.color_918EAD)));
    }

    @Override // androidx.fragment.app.OooOo
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getWindow().requestFeature(1);
        return dialogOnCreateDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ArrayList<RoomUserInfoModel> arrayList;
        ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(getArguments().getLong("user_id_key")));
        this.f52919OooO0Oo = roomUserInfoModelOooO0o0;
        MutableStateFlow<Boolean> mutableStateFlowIsSelectedForSendHats = roomUserInfoModelOooO0o0.isSelectedForSendHats();
        o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
        mutableStateFlowIsSelectedForSendHats.setValue(Boolean.valueOf(!o000000Var.OooOOO0(this.f52919OooO0Oo.getUserId().getValue().longValue())));
        View viewInflate = layoutInflater.inflate(oO00OO0O.skill_select_popup, viewGroup);
        this.f52929OooOOOO = viewInflate.findViewById(oO00O0oO.llUser);
        this.f52932OooOOo0 = (NetImageView) viewInflate.findViewById(oO00O0oO.ivSelectedUser);
        this.f52930OooOOOo = viewInflate.findViewById(oO00O0oO.vLine);
        this.f52931OooOOo = (ImageView) viewInflate.findViewById(oO00O0oO.ivAll);
        this.f52933OooOOoo = (RecyclerView) viewInflate.findViewById(oO00O0oO.rv);
        this.f52918OooO = (TextView) viewInflate.findViewById(oO00O0oO.tv_wear_tab_store);
        this.f52920OooO0o = (TextView) viewInflate.findViewById(oO00O0oO.tv_wear_tab_hat);
        this.f52922OooO0oO = (TextView) viewInflate.findViewById(oO00O0oO.tv_wear_tab_crazy);
        this.f52923OooO0oo = (TextView) viewInflate.findViewById(oO00O0oO.tv_wear_tab_voice);
        this.f52926OooOO0o = viewInflate.findViewById(oO00O0oO.view_room_wear_tab_line_hat);
        this.f52928OooOOO0 = viewInflate.findViewById(oO00O0oO.view_room_wear_tab_line_crazy);
        this.f52927OooOOO = viewInflate.findViewById(oO00O0oO.view_room_wear_tab_line_voice);
        this.f52936OooOo00 = (ViewPager) viewInflate.findViewById(oO00O0oO.dialog_wear_view_pager_viewPager);
        this.f52935OooOo0 = (SVGAView) viewInflate.findViewById(oO00O0oO.svga_dialog_wear_loading);
        this.f52924OooOO0 = (TextView) viewInflate.findViewById(oO00O0oO.tv_wear_coin);
        this.f52925OooOO0O = (TextView) viewInflate.findViewById(oO00O0oO.tv_wear_recharge);
        this.f52937OooOo0O = (Button) viewInflate.findViewById(oO00O0oO.btn_wear_send);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().observe(this, new OooO0o());
        this.f52920OooO0o.setOnClickListener(new OooO());
        this.f52922OooO0oO.setOnClickListener(new OooOO0());
        this.f52923OooO0oo.setOnClickListener(new OooOO0O());
        OooO0O0();
        this.f52934OooOo = new ArrayList<>();
        this.f52940OooOoO0 = RoomWearHatsFragment.newInstance(this.f52919OooO0Oo.getUserId().getValue().longValue());
        this.f52939OooOoO = RoomWearCrazyFragment.newInstance();
        this.f52941OooOoOO = RoomWearVoiceFragment.newInstance();
        this.f52934OooOo.add(this.f52940OooOoO0);
        this.f52934OooOo.add(this.f52939OooOoO);
        this.f52934OooOo.add(this.f52941OooOoOO);
        this.f52936OooOo00.setAdapter(new OooOOO0(getChildFragmentManager()));
        this.f52936OooOo00.setOffscreenPageLimit(2);
        this.f52936OooOo00.OooO0O0(new OooOOO());
        Iterator<oo0O> it = o000000Var.f47380OooOO0O.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f52942OooOoo;
            if (!zHasNext) {
                break;
            }
            oo0O next = it.next();
            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(next.f54838OooO0OO.getValue());
            if (roomUserInfoModelOooO0o1 != null) {
                roomUserInfoModelOooO0o1.isSelectedForSendHats().setValue(Boolean.valueOf(next.f54838OooO0OO.getValue().equals(this.f52919OooO0Oo.getUserId().getValue())));
                arrayList.add(roomUserInfoModelOooO0o1);
            }
        }
        this.f52933OooOOoo.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        OooOOOO oooOOOO = new OooOOOO(getContext(), oO00OO0O.room_item_card_hats_user);
        this.f52944OooOooO = oooOOOO;
        oooOOOO.f10098OooO0o = new OooOo00();
        oooOOOO.Oooo00O(false);
        this.f52933OooOOoo.addItemDecoration(new a2(o0000O0.OooO00o(4), o0000.OooO00o(oO00O0o.transparent)));
        this.f52933OooOOoo.setAdapter(this.f52944OooOooO);
        this.f52944OooOooO.OooOoO0(arrayList);
        if (arrayList.isEmpty()) {
            this.f52933OooOOoo.setVisibility(8);
            this.f52931OooOOo.setVisibility(8);
        } else {
            this.f52933OooOOoo.setVisibility(0);
            this.f52931OooOOo.setVisibility(0);
        }
        if (com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.OooOOO0(this.f52919OooO0Oo.getUserId().getValue().longValue())) {
            this.f52932OooOOo0.setVisibility(8);
            this.f52930OooOOOo.setVisibility(8);
        } else {
            this.f52932OooOOo0.setVisibility(0);
            this.f52930OooOOOo.setVisibility(0);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0O0(1, o0000.OooO00o(oO00O0o.color_00d8c9));
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(this.f52919OooO0Oo.getUserHeader().getValue());
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43914OooO0o0 = true;
            oooO00o.OooO0Oo(this.f52932OooOOo0);
        }
        this.f52932OooOOo0.setOnClickListener(new oO0oO000(this, 0));
        this.f52931OooOOo.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.oOo00o00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                oOO00000 ooo00000 = this.f53008OooO0Oo;
                Iterator it2 = ooo00000.f52944OooOooO.f10111OooOOoo.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    } else if (!((RoomUserInfoModel) it2.next()).isSelectedForSendHats().getValue().booleanValue()) {
                        z = true;
                        break;
                    }
                }
                Iterator it3 = ooo00000.f52944OooOooO.f10111OooOOoo.iterator();
                while (it3.hasNext()) {
                    ((RoomUserInfoModel) it3.next()).isSelectedForSendHats().setValue(Boolean.valueOf(z));
                }
                ooo00000.f52944OooOooO.notifyDataSetChanged();
                ooo00000.OooO0Oo();
                ooo00000.OooO0OO();
            }
        });
        this.f52918OooO.setOnClickListener(new OooOo());
        this.f52925OooOO0O.setOnClickListener(new OooO00o());
        this.f52937OooOo0O.setOnClickListener(new OooO0O0());
        OooO0Oo();
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        OooO0OO oooO0OO = new OooO0OO(getActivity());
        o000o00o2.getClass();
        boolean z = App.f22703OooO0o0;
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        o000000O o000000o3 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0o().getValue();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            linkedHashMapOooO00o.put("viplevel", pair.getSecond() + "");
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44125Ooooo00, linkedHashMapOooO00o, oooO0OO);
        return viewInflate;
    }

    @Override // androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        this.f52921OooO0o0 = dialog;
        Window window = dialog.getWindow();
        window.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
        window.setBackgroundDrawableResource(oO00O0o.transparent);
        window.setDimAmount(0.3f);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f52921OooO0o0.setCanceledOnTouchOutside(true);
    }
}
