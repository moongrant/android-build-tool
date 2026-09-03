package p650o0ooo;

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
import androidx.fragment.app.Oooo0;
import androidx.fragment.app.o0000Ooo;
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
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.model.socketPostModel.SkillCardSendModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.room.o0O0000O;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.fragment.room.RoomWearCrazyFragment;
import com.yalla.yalla.ui.fragment.room.RoomWearHatsFragment;
import com.yalla.yalla.ui.fragment.room.RoomWearVoiceFragment;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.security.InvalidParameterException;
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
import p205o00o0o0o.o000O;
import p361o0OOOooo.o000OO;
import p368o0OOo0Oo.Oooo000;
import p384o0OOoo0O.o00oO0o;
import p423o0OoO0OO.o000O0Oo;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p541o0o0OoOO.oo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p587o0oOooOO.x0;
import p590o0oOooo0.k0;
import p590o0oOooo0.oOOO00;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public class oO00Oo0 extends Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public TextView f58799OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public RoomUserInfoModel f58800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public TextView f58801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Dialog f58802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public TextView f58803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public TextView f58804OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public TextView f58805OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f58806OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public View f58807OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public View f58808OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public View f58809OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View f58810OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f58811OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f58812OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public NetImageView f58813OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public RecyclerView f58814OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList<Fragment> f58815OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public SVGAView f58816OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ViewPager f58817OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Button f58818OooOo0O;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RoomWearCrazyFragment f58820OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RoomWearHatsFragment f58821OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public RoomWearVoiceFragment f58822OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public OooOOOO f58825OooOooO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int[] f58819OooOo0o = {o000000.headwear, o000000.balderdash, o000000.Voice_Changer};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f58824OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ArrayList<RoomUserInfoModel> f58823OooOoo = new ArrayList<>();

    public class OooO extends o0OOOO0o {
        public OooO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            if (oo00oo0.f58824OooOoo0 != 0) {
                oo00oo0.f58817OooOo00.setCurrentItem(0);
            }
        }
    }

    public class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            k0.OooO00o(false, false, new Function1() { // from class: o0ooo.oO00Oo00
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    o000O0Oo.OooO0O0(oO00Oo0.this.getDialog(), ((f0) obj).f58509OooO0o0);
                    return null;
                }
            });
        }
    }

    public class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            SkillCardListModel.DataBean selectedWear;
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            int i = oo00oo0.f58824OooOoo0;
            boolean z = true;
            if (i == 0) {
                selectedWear = ((RoomWearHatsFragment) oo00oo0.f58815OooOo.get(i)).getSelectedWear();
            } else if (i != 1) {
                selectedWear = i != 2 ? null : ((RoomWearVoiceFragment) oo00oo0.f58815OooOo.get(i)).getSelectedWear();
            } else {
                selectedWear = ((RoomWearCrazyFragment) oo00oo0.f58815OooOo.get(i)).getSelectedWear();
            }
            if (selectedWear == null) {
                return;
            }
            int i2 = selectedWear.warestype;
            if (i2 != 1) {
                if (i2 == 2) {
                    oo00oo0.dismiss();
                    long jLongValue = oo00oo0.f58800OooO0Oo.getUserId().getValue().longValue();
                    int i3 = Integer.parseInt(selectedWear.shopid);
                    SkillCardSendModel skillCardSendModel = new SkillCardSendModel();
                    skillCardSendModel.target = jLongValue;
                    skillCardSendModel.differtype = i3;
                    RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oO(10050, oOOO00.OooO0OO(skillCardSendModel));
                        return;
                    }
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                oo00oo0.dismiss();
                long jLongValue2 = oo00oo0.f58800OooO0Oo.getUserId().getValue().longValue();
                int i4 = Integer.parseInt(selectedWear.shopid);
                Room.MagicVoiceIn.Builder builderNewBuilder = Room.MagicVoiceIn.newBuilder();
                builderNewBuilder.setTarget(jLongValue2);
                builderNewBuilder.setCardid(i4);
                RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                if (roomLiveService2 != null) {
                    roomLiveService2.OooO0oo(10066, builderNewBuilder.build().toByteArray());
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (oo00oo0.f58813OooOOo0.getVisibility() == 0 && oo00oo0.f58800OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
                arrayList.add(oo00oo0.f58800OooO0Oo.getUserId().getValue());
            }
            for (RoomUserInfoModel roomUserInfoModel : oo00oo0.f58823OooOoo) {
                if (roomUserInfoModel.isSelectedForSendHats().getValue().booleanValue()) {
                    arrayList.add(roomUserInfoModel.getUserId().getValue());
                }
            }
            if (arrayList.isEmpty()) {
                String strOooO0OO = o0000.OooO0OO(o000000.Choose_AtLeast_One);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
            }
            int size = arrayList.size() - selectedWear.num;
            if (size <= 0) {
                oo00oo0.dismiss();
                Long[] lArr = (Long[]) arrayList.toArray(new Long[arrayList.size()]);
                int i5 = Integer.parseInt(selectedWear.shopid);
                HashMap map = new HashMap();
                map.put("cardid", String.valueOf(i5));
                o0oo0000.OooO00o.OooO0OO("102035", map);
                SkillCardSendModel skillCardSendModel2 = new SkillCardSendModel();
                skillCardSendModel2.tousers = lArr;
                skillCardSendModel2.headwearid = i5;
                RoomLiveService roomLiveService3 = RoomLiveService.f24596OooOo00;
                if (roomLiveService3 != null) {
                    roomLiveService3.OooO0oO(10049, oOOO00.OooO0OO(skillCardSendModel2));
                    return;
                }
                return;
            }
            if (selectedWear.state == 1 || selectedWear.activityType == 1) {
                o000O o000o = new o000O(oo00oo0.requireContext());
                o000o.OooOo00(o0000.OooO0OO(o000000.hats_not_enough));
                o000o.OooOo0(new o0O0000O(1, this));
                o000o.OooOO0o();
                return;
            }
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
            if (selectedWear.lowestVIPLv > 0 && !((Boolean) pair.getFirst()).booleanValue()) {
                if (selectedWear.num != 0) {
                    o000O o000o2 = new o000O(oo00oo0.requireContext());
                    o000o2.OooOo00(o0000.OooO0OO(o000000.hats_not_enough));
                    o000o2.OooOo0(new Function0() { // from class: o0ooo.oO00o000
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            oO00Oo0.this.dismiss();
                            return null;
                        }
                    });
                    o000o2.OooOO0o();
                    return;
                }
                oo00oo0.dismiss();
                o000O o000o3 = new o000O(oo00oo0.requireContext());
                o000o3.OooOOoo(o000000.VIP_commodity);
                o000o3.OooOOOo(o0000.OooO0OO(o000000.Get_Yalla_Premium));
                o000o3.OooOo0(new oOOoOOO0());
                o000o3.OooOo(true);
                o000o3.OooOO0o();
                return;
            }
            if (Integer.parseInt(selectedWear.discountprice) * size > ((Long) o0O00oO0.OooO0O0().getValue()).longValue()) {
                LiveEventBus.get("QuickRechargeDialogFromMagicCardDialog").post(oo00oo0.f58802OooO0o0);
                return;
            }
            oo00oo0.dismiss();
            Long[] lArr2 = (Long[]) arrayList.toArray(new Long[arrayList.size()]);
            int i6 = Integer.parseInt(selectedWear.shopid);
            HashMap map2 = new HashMap();
            map2.put("cardid", String.valueOf(i6));
            o0oo0000.OooO00o.OooO0OO("102035", map2);
            SkillCardSendModel skillCardSendModel3 = new SkillCardSendModel();
            skillCardSendModel3.tousers = lArr2;
            skillCardSendModel3.headwearid = i6;
            RoomLiveService roomLiveService4 = RoomLiveService.f24596OooOo00;
            if (roomLiveService4 != null) {
                roomLiveService4.OooO0oO(10049, oOOO00.OooO0OO(skillCardSendModel3));
            }
        }
    }

    public class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO0OO(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            SkillCardListModel skillCardListModel = (SkillCardListModel) oOOO00.OooO00o(str, SkillCardListModel.class);
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            if (oo00oo0.f58821OooOoO0 == null || oo00oo0.f58820OooOoO == null) {
                return;
            }
            oo00oo0.f58816OooOo0.OooO0oO(true);
            oo00oo0.f58816OooOo0.setVisibility(8);
            if (skillCardListModel != null) {
                oo00oo0.f58821OooOoO0.setData(skillCardListModel.data1);
                oo00oo0.f58820OooOoO.setData(skillCardListModel.data);
                oo00oo0.f58822OooOoOO.setData(skillCardListModel.data2);
            }
        }
    }

    public class OooO0o implements Observer<Long> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            long jLongValue = l.longValue();
            TextView textView = oO00Oo0.this.f58805OooOO0;
            if (textView != null) {
                textView.setText(o0O0O0Oo.OooO0Oo(String.valueOf(jLongValue)));
            }
        }
    }

    public class OooOO0 extends o0OOOO0o {
        public OooOO0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            if (oo00oo0.f58824OooOoo0 != 1) {
                oo00oo0.f58817OooOo00.setCurrentItem(1);
            }
        }
    }

    public class OooOO0O extends o0OOOO0o {
        public OooOO0O() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            if (oo00oo0.f58824OooOoo0 != 2) {
                oo00oo0.f58817OooOo00.setCurrentItem(2);
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
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            oo00oo0.f58824OooOoo0 = i;
            oo00oo0.OooO0O0();
            if (i == 0) {
                oo00oo0.f58810OooOOOO.findViewById(o0OO00O.llUser).setVisibility(0);
            } else {
                oo00oo0.f58810OooOOOO.findViewById(o0OO00O.llUser).setVisibility(8);
            }
        }
    }

    public class OooOOO0 extends o0000Ooo {
        public OooOOO0(FragmentManager fragmentManager) {
            super(fragmentManager, 0);
        }

        @Override // p114o00O00o.OooO0OO
        public final int OooO0OO() {
            return oO00Oo0.this.f58815OooOo.size();
        }

        @Override // p114o00O00o.OooO0OO
        public final CharSequence OooO0o0(int i) {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            return i < oo00oo0.f58819OooOo0o.length ? oo00oo0.getResources().getString(oo00oo0.f58819OooOo0o[i]) : "";
        }

        @Override // androidx.fragment.app.o0000Ooo
        public final Fragment OooOOo0(int i) {
            return oO00Oo0.this.f58815OooOo.get(i);
        }
    }

    public class OooOOOO extends o0000oo<RoomUserInfoModel> {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) obj;
            NetImageView netImageView = (NetImageView) viewHolder.getView(o0OO00O.ivHeader);
            int i = 0;
            if (roomUserInfoModel != null) {
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
                oooO00o.OooO00o(d1.OooO0OO());
                oooO00o.OooO0O0(1, o0000.OooO00o(o0OOO0o.transparent));
                oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(roomUserInfoModel.getUserHeader().getValue());
                oooO00o.f43124OooO00o = 0;
                oooO00o.f43129OooO0o0 = true;
                oooO00o.OooO0Oo(netImageView);
                if (roomUserInfoModel.isSelectedForSendHats().getValue().booleanValue()) {
                    netImageView.setBorderColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
                    viewHolder.setBackgroundRes(o0OO00O.tvIndex, o0Oo0oo.room_shape_bg_card_hats_user_index_selected);
                } else {
                    viewHolder.setBackgroundRes(o0OO00O.tvIndex, o0Oo0oo.room_shape_bg_card_hats_user_index);
                }
            }
            for (oo00 oo00Var : com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O) {
                if (oo00Var.f55307OooO0OO.getValue().equals(roomUserInfoModel.getUserId().getValue())) {
                    i = oo00Var.f55305OooO00o;
                    break;
                }
            }
            viewHolder.setText(o0OO00O.tvIndex, (i + 1) + "");
        }
    }

    public class OooOo extends o0OOOO0o {
        public OooOo() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            PurchaseSkillCardActivity.OooOo0(oo00oo0.f58824OooOoo0, oo00oo0.getContext());
        }
    }

    public class OooOo00 implements BaseQuickAdapter.OooO0o {
        public OooOo00() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            oO00Oo0 oo00oo0 = oO00Oo0.this;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) oo00oo0.f58825OooOooO.f13189OooOOoo.get(i);
            roomUserInfoModel.isSelectedForSendHats().setValue(Boolean.valueOf(!roomUserInfoModel.isSelectedForSendHats().getValue().booleanValue()));
            oo00oo0.f58825OooOooO.notifyItemChanged(i);
            oo00oo0.OooO0Oo();
            oo00oo0.OooO0OO();
        }
    }

    public final void OooO0O0() {
        int i = this.f58824OooOoo0;
        if (i == 0) {
            this.f58801OooO0o.setTextAppearance(getContext(), o000000O.RoomWearDialogTabTextSelected);
            this.f58801OooO0o.getLayoutParams().height = o0000O0.OooO00o(42);
            this.f58801OooO0o.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_selected);
            TextView textView = this.f58803OooO0oO;
            Context context = getContext();
            int i2 = o000000O.RoomWearDialogTabTextNormal;
            textView.setTextAppearance(context, i2);
            float f = 36;
            this.f58803OooO0oO.getLayoutParams().height = o0000O0.OooO00o(f);
            this.f58803OooO0oO.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_crazy_normal);
            this.f58804OooO0oo.setTextAppearance(getContext(), i2);
            this.f58804OooO0oo.getLayoutParams().height = o0000O0.OooO00o(f);
            this.f58804OooO0oo.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_voice_normal);
            this.f58807OooOO0o.setVisibility(4);
            this.f58809OooOOO0.setVisibility(0);
            this.f58808OooOOO.setVisibility(0);
            return;
        }
        if (i == 1) {
            TextView textView2 = this.f58801OooO0o;
            Context context2 = getContext();
            int i3 = o000000O.RoomWearDialogTabTextNormal;
            textView2.setTextAppearance(context2, i3);
            float f2 = 36;
            this.f58801OooO0o.getLayoutParams().height = o0000O0.OooO00o(f2);
            this.f58801OooO0o.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_hat_normal);
            this.f58803OooO0oO.setTextAppearance(getContext(), o000000O.RoomWearDialogTabTextSelected);
            this.f58803OooO0oO.getLayoutParams().height = o0000O0.OooO00o(42);
            this.f58803OooO0oO.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_selected);
            this.f58804OooO0oo.setTextAppearance(getContext(), i3);
            this.f58804OooO0oo.getLayoutParams().height = o0000O0.OooO00o(f2);
            this.f58804OooO0oo.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_voice_normal);
            this.f58807OooOO0o.setVisibility(0);
            this.f58809OooOOO0.setVisibility(4);
            this.f58808OooOOO.setVisibility(0);
            return;
        }
        TextView textView3 = this.f58801OooO0o;
        Context context3 = getContext();
        int i4 = o000000O.RoomWearDialogTabTextNormal;
        textView3.setTextAppearance(context3, i4);
        float f3 = 36;
        this.f58801OooO0o.getLayoutParams().height = o0000O0.OooO00o(f3);
        this.f58801OooO0o.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_hat_normal);
        this.f58803OooO0oO.setTextAppearance(getContext(), i4);
        this.f58803OooO0oO.getLayoutParams().height = o0000O0.OooO00o(f3);
        this.f58803OooO0oO.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_crazy_normal);
        this.f58804OooO0oo.setTextAppearance(getContext(), o000000O.RoomWearDialogTabTextSelected);
        this.f58804OooO0oo.getLayoutParams().height = o0000O0.OooO00o(42);
        this.f58804OooO0oo.setBackgroundResource(o0Oo0oo.shape_bg_dialog_room_wear_tab_selected);
        this.f58807OooOO0o.setVisibility(0);
        this.f58809OooOOO0.setVisibility(0);
        this.f58808OooOOO.setVisibility(4);
    }

    public final void OooO0OO() {
        String value;
        if (this.f58813OooOOo0.getVisibility() == 0 && this.f58800OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
            this.f58821OooOoO0.updateUserHeader(this.f58800OooO0Oo.getUserHeader().getValue());
            return;
        }
        Iterator<RoomUserInfoModel> it = this.f58823OooOoo.iterator();
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
        RoomWearHatsFragment roomWearHatsFragment = this.f58821OooOoO0;
        if (roomWearHatsFragment != null) {
            roomWearHatsFragment.updateUserHeader(value);
        }
    }

    public final void OooO0Oo() {
        boolean z;
        Iterator it = this.f58825OooOooO.f13189OooOOoo.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            } else if (!((RoomUserInfoModel) it.next()).isSelectedForSendHats().getValue().booleanValue()) {
                z = false;
                break;
            }
        }
        this.f58812OooOOo.setImageTintList(ColorStateList.valueOf(o0000.OooO00o(z ? o0OOO0o.color_00d8c9 : o0OOO0o.color_918EAD)));
    }

    @Override // androidx.fragment.app.Oooo0
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
        ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(getArguments().getLong("user_id_key")));
        this.f58800OooO0Oo = roomUserInfoModelOooO0o0;
        if (roomUserInfoModelOooO0o0 == null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            this.f58800OooO0Oo = com.yalla.yalla.service.room.OooO00o.OooO0o0((Long) o0O00oO0.OooOOo0().getValue());
            p285o0O0OOo.OooOo.OooO00o().OooO0O0(new InvalidParameterException("userid is ==>" + getArguments().getLong("user_id_key")));
        }
        MutableStateFlow<Boolean> mutableStateFlowIsSelectedForSendHats = this.f58800OooO0Oo.isSelectedForSendHats();
        p483o0o000Oo.o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
        mutableStateFlowIsSelectedForSendHats.setValue(Boolean.valueOf(!o0000ooVar.OooOOO0(this.f58800OooO0Oo.getUserId().getValue().longValue())));
        View viewInflate = layoutInflater.inflate(oo0o0Oo.skill_select_popup, viewGroup);
        this.f58810OooOOOO = viewInflate.findViewById(o0OO00O.llUser);
        this.f58813OooOOo0 = (NetImageView) viewInflate.findViewById(o0OO00O.ivSelectedUser);
        this.f58811OooOOOo = viewInflate.findViewById(o0OO00O.vLine);
        this.f58812OooOOo = (ImageView) viewInflate.findViewById(o0OO00O.ivAll);
        this.f58814OooOOoo = (RecyclerView) viewInflate.findViewById(o0OO00O.rv);
        this.f58799OooO = (TextView) viewInflate.findViewById(o0OO00O.tv_wear_tab_store);
        this.f58801OooO0o = (TextView) viewInflate.findViewById(o0OO00O.tv_wear_tab_hat);
        this.f58803OooO0oO = (TextView) viewInflate.findViewById(o0OO00O.tv_wear_tab_crazy);
        this.f58804OooO0oo = (TextView) viewInflate.findViewById(o0OO00O.tv_wear_tab_voice);
        this.f58807OooOO0o = viewInflate.findViewById(o0OO00O.view_room_wear_tab_line_hat);
        this.f58809OooOOO0 = viewInflate.findViewById(o0OO00O.view_room_wear_tab_line_crazy);
        this.f58808OooOOO = viewInflate.findViewById(o0OO00O.view_room_wear_tab_line_voice);
        this.f58817OooOo00 = (ViewPager) viewInflate.findViewById(o0OO00O.dialog_wear_view_pager_viewPager);
        this.f58816OooOo0 = (SVGAView) viewInflate.findViewById(o0OO00O.svga_dialog_wear_loading);
        this.f58805OooOO0 = (TextView) viewInflate.findViewById(o0OO00O.tv_wear_coin);
        this.f58806OooOO0O = (TextView) viewInflate.findViewById(o0OO00O.tv_wear_recharge);
        this.f58818OooOo0O = (Button) viewInflate.findViewById(o0OO00O.btn_wear_send);
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().observe(this, new OooO0o());
        this.f58801OooO0o.setOnClickListener(new OooO());
        this.f58803OooO0oO.setOnClickListener(new OooOO0());
        this.f58804OooO0oo.setOnClickListener(new OooOO0O());
        OooO0O0();
        this.f58815OooOo = new ArrayList<>();
        this.f58821OooOoO0 = RoomWearHatsFragment.newInstance(this.f58800OooO0Oo.getUserId().getValue().longValue());
        this.f58820OooOoO = RoomWearCrazyFragment.newInstance();
        this.f58822OooOoOO = RoomWearVoiceFragment.newInstance();
        this.f58815OooOo.add(this.f58821OooOoO0);
        this.f58815OooOo.add(this.f58820OooOoO);
        this.f58815OooOo.add(this.f58822OooOoOO);
        this.f58817OooOo00.setAdapter(new OooOOO0(getChildFragmentManager()));
        this.f58817OooOo00.setOffscreenPageLimit(2);
        this.f58817OooOo00.OooO0O0(new OooOOO());
        Iterator<oo00> it = o0000ooVar.f48585OooOO0O.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f58823OooOoo;
            if (!zHasNext) {
                break;
            }
            oo00 next = it.next();
            ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(next.f55307OooO0OO.getValue());
            if (roomUserInfoModelOooO0o1 != null) {
                roomUserInfoModelOooO0o1.isSelectedForSendHats().setValue(Boolean.valueOf(next.f55307OooO0OO.getValue().equals(this.f58800OooO0Oo.getUserId().getValue())));
                arrayList.add(roomUserInfoModelOooO0o1);
            }
        }
        this.f58814OooOOoo.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        OooOOOO oooOOOO = new OooOOOO(getContext(), oo0o0Oo.room_item_card_hats_user);
        this.f58825OooOooO = oooOOOO;
        oooOOOO.f13176OooO0o = new OooOo00();
        oooOOOO.Oooo00O(false);
        this.f58814OooOOoo.addItemDecoration(new x0(o0000O0.OooO00o(4), o0000.OooO00o(o0OOO0o.transparent)));
        this.f58814OooOOoo.setAdapter(this.f58825OooOooO);
        this.f58825OooOooO.OooOoO0(arrayList);
        if (arrayList.isEmpty()) {
            this.f58814OooOOoo.setVisibility(8);
            this.f58812OooOOo.setVisibility(8);
        } else {
            this.f58814OooOOoo.setVisibility(0);
            this.f58812OooOOo.setVisibility(0);
        }
        if (com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.OooOOO0(this.f58800OooO0Oo.getUserId().getValue().longValue())) {
            this.f58813OooOOo0.setVisibility(8);
            this.f58811OooOOOo.setVisibility(8);
        } else {
            this.f58813OooOOo0.setVisibility(0);
            this.f58811OooOOOo.setVisibility(0);
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.OooO0O0(1, o0000.OooO00o(o0OOO0o.color_00d8c9));
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(this.f58800OooO0Oo.getUserHeader().getValue());
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43129OooO0o0 = true;
            oooO00o.OooO0Oo(this.f58813OooOOo0);
        }
        this.f58813OooOOo0.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.oO00OOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oO00Oo0 oo00oo0 = this.f58798OooO0Oo;
                oo00oo0.f58800OooO0Oo.isSelectedForSendHats().setValue(Boolean.valueOf(!oo00oo0.f58800OooO0Oo.isSelectedForSendHats().getValue().booleanValue()));
                if (oo00oo0.f58800OooO0Oo.isSelectedForSendHats().getValue().booleanValue()) {
                    oo00oo0.f58813OooOOo0.setBorderColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
                } else {
                    oo00oo0.f58813OooOOo0.setBorderColor(o0000.OooO00o(o0OOO0o.transparent));
                }
                oo00oo0.OooO0OO();
            }
        });
        this.f58812OooOOo.setOnClickListener(new o000OO(this, 1));
        this.f58799OooO.setOnClickListener(new OooOo());
        this.f58806OooOO0O.setOnClickListener(new OooO00o());
        this.f58818OooOo0O.setOnClickListener(new OooO0O0());
        OooO0Oo();
        o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        OooO0OO oooO0OO = new OooO0OO(getActivity());
        o00oo0o2.getClass();
        boolean z = App.f22233OooO0o0;
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            linkedHashMapOooO00o.put("viplevel", pair.getSecond() + "");
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43384Ooooo00, linkedHashMapOooO00o, oooO0OO);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Oooo0, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        this.f58802OooO0o0 = dialog;
        Window window = dialog.getWindow();
        window.setWindowAnimations(o000000O.anim_bottom_top_bottom);
        window.setBackgroundDrawableResource(o0OOO0o.transparent);
        window.setDimAmount(0.3f);
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f58802OooO0o0.setCanceledOnTouchOutside(true);
    }
}
