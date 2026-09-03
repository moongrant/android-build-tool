package com.yalla.yalla.ui.adapter.room;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0OoOo0;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.AdVM;
import com.yalla.yalla.util.WebPageInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p417o0OoO0.o0000O00;
import p427o0OoOO00.o0OOO0o;
import p466o0Oooo0o.o00O00OO;
import p466o0Oooo0o.oo00o;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public class RoomBaseAdapter<T extends RoomIndexModel> extends o000O<T> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public PageSource f27701OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final LongSparseArray<String> f27702OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public o00O00OO<RoomIndexModel> f27703OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EnterRoomParentPage f27704OooOooo;

    public static /* synthetic */ class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27705OooO00o;

        static {
            int[] iArr = new int[PageSource.values().length];
            f27705OooO00o = iArr;
            try {
                iArr[PageSource.RoomAllNewFragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27705OooO00o[PageSource.RoomAllPopularFragment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27705OooO00o[PageSource.GeneralRoomCountry.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27705OooO00o[PageSource.RoomRelatedJoinedFragment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27705OooO00o[PageSource.RoomRelatedFollowingFragment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class OooO00o extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f27707OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27708OooO0oo;

        public OooO00o(RoomIndexModel roomIndexModel, ViewHolder viewHolder) {
            this.f27707OooO0oO = roomIndexModel;
            this.f27708OooO0oo = viewHolder;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            ViewHolder viewHolder = this.f27708OooO0oo;
            int layoutPosition = viewHolder.getLayoutPosition();
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            if (roomBaseAdapter.f10108OooOOOo != null) {
                PageSource pageSource = roomBaseAdapter.f27701OooOoo;
                if (pageSource != null) {
                    int i = OooO.f27705OooO00o[pageSource.ordinal()];
                    String strOooO00o = "11";
                    if (i == 1) {
                        HashMap map = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i2 = layoutPosition + 1;
                            strOooO00o = i2 < 10 ? p022Oooo00O.o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i2), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i2), "00");
                        }
                        map.put("roompoint", strOooO00o);
                        o0OO000.OooO0O0("201012", map);
                    } else if (i == 2) {
                        HashMap map2 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i3 = layoutPosition + 1;
                            strOooO00o = i3 < 10 ? p022Oooo00O.o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i3), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i3), "00");
                        }
                        map2.put("roompoint", strOooO00o);
                        o0OO000.OooO0O0("201011", map2);
                    } else if (i == 3) {
                        HashMap map3 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i4 = layoutPosition + 1;
                            strOooO00o = i4 < 10 ? p022Oooo00O.o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i4), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i4), "00");
                        }
                        map3.put("roompoint", strOooO00o);
                        o0OO000.OooO0O0("201008", map3);
                    } else if (i == 4) {
                        HashMap map4 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i5 = layoutPosition + 1;
                            strOooO00o = i5 < 10 ? p022Oooo00O.o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i5), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i5), "00");
                        }
                        map4.put("roompoint", strOooO00o);
                        o0OO000.OooO0O0("201004", map4);
                    } else if (i == 5) {
                        HashMap map5 = new HashMap();
                        if (layoutPosition < 0) {
                            strOooO00o = "00";
                        } else if (layoutPosition < 10) {
                            int i6 = layoutPosition + 1;
                            strOooO00o = i6 < 10 ? p022Oooo00O.o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, o0OoOo0.OooOO0o(Integer.valueOf(i6), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : o0OoOo0.OooOO0o(Integer.valueOf(i6), "00");
                        }
                        map5.put("roompoint", strOooO00o);
                        o0OO000.OooO0O0("201005", map5);
                    }
                }
                o00O00OO<RoomIndexModel> o00o00oo2 = roomBaseAdapter.f27703OooOooO;
                RoomIndexModel roomIndexModel = this.f27707OooO0oO;
                if (o00o00oo2 != null) {
                    o00o00oo2.OooO00o(roomIndexModel);
                }
                String str = roomIndexModel.roomserverip;
                RoomModel roomModel = new RoomModel();
                roomModel.setName(roomIndexModel.barname);
                roomModel.setImage(roomIndexModel.barimage);
                roomModel.setBaridx(roomIndexModel.baridx);
                roomModel.setId(OooOOOO.OooOO0o(roomIndexModel.barid));
                roomModel.setRoomIp(str);
                roomModel.websocketaddr = roomIndexModel.websocketaddr;
                roomModel.setSessionId(roomIndexModel.sessionId);
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO0o(roomModel, roomBaseAdapter.f27704OooOooo);
            }
            viewHolder.getAdapterPosition();
            roomBaseAdapter.Oooo0o();
        }
    }

    public class OooO0O0 implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27709OooO0Oo;

        public OooO0O0(ViewHolder viewHolder) {
            this.f27709OooO0Oo = viewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((SVGAView) this.f27709OooO0Oo.getView(oO00O0oO.lav_live)).OooO0Oo();
            return null;
        }
    }

    public class OooO0OO extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f27711OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27712OooO0oo;

        public class OooO00o implements Observer<Object> {
            public OooO00o() {
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String strValueOf = String.valueOf(obj);
                OooO0OO oooO0OO = OooO0OO.this;
                if (strValueOf.equals(oooO0OO.f27711OooO0oO.adData.adid)) {
                    RoomBaseAdapter.this.f10111OooOOoo.remove(oooO0OO.f27712OooO0oo.getLayoutPosition());
                    RoomBaseAdapter.this.notifyDataSetChanged();
                }
            }
        }

        public OooO0OO(RoomIndexModel roomIndexModel, ViewHolder viewHolder) {
            this.f27711OooO0oO = roomIndexModel;
            this.f27712OooO0oo = viewHolder;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0000O00(o0OoOo0.OooO0o(0, this.f27711OooO0oO.adData.adid), roomBaseAdapter.f27701OooOoo == PageSource.RoomAllPopularFragment ? 1 : 0, null), 3, null);
            if (roomBaseAdapter.f10108OooOOOo instanceof FragmentActivity) {
                LiveEventBus.get("BLOCK_ADVERTISING").observe((FragmentActivity) roomBaseAdapter.f10108OooOOOo, new OooO00o());
            }
        }
    }

    public class OooO0o extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f27714OooO0oO;

        public OooO0o(RoomIndexModel roomIndexModel) {
            this.f27714OooO0oO = roomIndexModel;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            RoomBaseAdapter roomBaseAdapter = RoomBaseAdapter.this;
            PageSource pageSource = roomBaseAdapter.f27701OooOoo;
            if (pageSource != null) {
                int i = OooO.f27705OooO00o[pageSource.ordinal()];
                if (i == 1) {
                    o0OO000.OooO00o("102264");
                } else if (i == 2) {
                    o0OO000.OooO00o("102263");
                }
            }
            AdVM adVM = new AdVM();
            RoomIndexModel roomIndexModel = this.f27714OooO0oO;
            adVM.advertUserLogInsClick(o0OoOo0.OooO(0L, roomIndexModel.adData.adid));
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
            webPageInfo.OooO0o0(roomIndexModel.adData.adUrl);
            webPageInfo.f32816OooO = true;
            int i2 = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(roomBaseAdapter.f10108OooOOOo, webPageInfo);
        }
    }

    public enum PageSource {
        RoomAllPopularFragment,
        RoomAllNewFragment,
        RoomRelatedFollowingFragment,
        RoomRelatedJoinedFragment,
        GeneralRoomTag,
        GeneralRoomCountry
    }

    public RoomBaseAdapter(Context context, int i) {
        super(context, i);
        this.f27702OooOoo0 = new LongSparseArray<>();
        this.f27703OooOooO = null;
        this.f10115OooOo0o = 5;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void OooOoO0(@Nullable List<T> list) {
        super.OooOoO0(list);
        LongSparseArray<String> longSparseArray = this.f27702OooOoo0;
        longSparseArray.clear();
        if (list != null) {
            for (T t : list) {
                if (OooOo00.OooO0O0(t.barid)) {
                    longSparseArray.put(Long.parseLong(t.barid), t.barid);
                }
            }
        }
    }

    public void Oooo0o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0, reason: merged with bridge method [inline-methods] */
    public void OooO0oO(ViewHolder viewHolder, T t) {
        int i = oO00O0oO.item_bg;
        String str = t.barid;
        viewHolder.setGone(i, (str == null || str.isEmpty()) ? false : true);
        Context context = this.f56196OooOo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0o());
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(t.barimage);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.sdv_header));
        int i2 = oO00O0oO.iv_lock;
        String str2 = t.isencrypt;
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        viewHolder.setGone(i2, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2));
        viewHolder.setBackgroundRes(i, t.istop > 0 ? oOo00OO0.shape_bg_item_room_top : oOo00OO0.shape_bg_item_room);
        int i3 = oO00O0oO.iv_honor;
        viewHolder.setGone(i3, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewHolder.getView(i3);
        String str4 = t.bartype;
        if (str4 != null) {
            switch (str4) {
                case "2":
                    viewHolder.setImageResource(i3, oOo00OO0.room_princess_garden1);
                    lottieAnimationView.OooO0OO();
                    break;
                case "3":
                    viewHolder.setImageResource(i3, oOo00OO0.room_dreamland1);
                    lottieAnimationView.OooO0OO();
                    break;
                case "4":
                    viewHolder.setImageResource(i3, oOo00OO0.upgraderoom_crown_somall);
                    lottieAnimationView.OooO0OO();
                    break;
                case "5":
                    lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                    lottieAnimationView.setRepeatCount(-1);
                    lottieAnimationView.OooO0oO();
                    break;
                default:
                    viewHolder.setGone(i3, false);
                    lottieAnimationView.OooO0OO();
                    break;
            }
        }
        viewHolder.setText(oO00O0oO.tv_room_name, t.barname);
        String str5 = t.countryid;
        if (str5 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str5)) {
            viewHolder.setGone(oO00O0oO.sdv_country, false);
        } else {
            int i4 = oO00O0oO.sdv_country;
            viewHolder.setGone(i4, true);
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o2.f43911OooO0OO = p591o0oo000O.OooO.OooO00o(t.countryid);
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i4));
        }
        if (OooOo00.OooO00o(t.labelname)) {
            viewHolder.setGone(oO00O0oO.tv_tag, false);
        } else {
            int i5 = oO00O0oO.tv_tag;
            viewHolder.setGone(i5, true);
            viewHolder.setText(i5, OooOOOO.OooO(t.labelname.trim()));
        }
        viewHolder.setText(oO00O0oO.tv_desc, OooOo00.OooO00o(t.notice) ? "" : t.notice);
        int i6 = oO00O0oO.tv_online_num;
        String str6 = t.onlinenum;
        if (str6 != null) {
            str3 = str6;
        }
        viewHolder.setText(i6, str3);
        viewHolder.setGone(oO00O0oO.iv_official, t.isofficial == 1);
        viewHolder.getView(i).setOnClickListener(new OooO00o(t, viewHolder));
        UserMedalView userMedalView = (UserMedalView) viewHolder.getView(oO00O0oO.mv_medal);
        userMedalView.setVisibility(4);
        userMedalView.OooO00o(t.medal, (LifecycleOwner) context);
        userMedalView.setVisibility(0);
        int i7 = oO00O0oO.lav_live;
        ((SVGAView) viewHolder.getView(i7)).OooO0Oo();
        ((SVGAView) viewHolder.getView(i7)).setOnAttachedToWindowListener(new OooO0O0(viewHolder));
        Oooo0oo(viewHolder);
        int i8 = oO00O0oO.llAdvertising;
        RoomIndexModel.AdData adData = t.adData;
        viewHolder.setGone(i8, (adData == null || adData.adid == null) ? false : true);
        RoomIndexModel.AdData adData2 = t.adData;
        if (adData2 == null || adData2.adid == null) {
            return;
        }
        OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(this.f10108OooOOOo);
        oooO00o3.OooO0o(8, 8, 8, 8);
        oooO00o3.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0Oo(t.adData.adImage);
        oooO00o3.f43909OooO00o = 0;
        oooO00o3.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivAdvertising));
        viewHolder.setText(oO00O0oO.tvAdvertising, t.adData.adTitle);
        viewHolder.setText(oO00O0oO.tvAdvertisingContent, t.adData.adDescription);
        viewHolder.getView(oO00O0oO.ivClose).setOnClickListener(new OooO0OO(t, viewHolder));
        viewHolder.getView(i8).setOnClickListener(new OooO0o(t));
    }

    public final void Oooo0oO(List<T> list) {
        if (OooOo00.OooO0O0(list)) {
            int i = 0;
            while (i < list.size()) {
                String str = list.get(i).barid;
                if (!OooOo00.OooO00o(str)) {
                    long j = Long.parseLong(str);
                    LongSparseArray<String> longSparseArray = this.f27702OooOoo0;
                    if (OooOo00.OooO0O0(longSparseArray.get(j, ""))) {
                        list.remove(i);
                        i--;
                    } else {
                        longSparseArray.put(j, str);
                    }
                }
                i++;
            }
        }
    }

    public void Oooo0oo(ViewHolder viewHolder) {
    }

    public RoomBaseAdapter(Context context) {
        this(context, oO00OO0O.item_room_base);
    }
}
