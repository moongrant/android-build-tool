package p579o0oOoOOo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.GifConfigJson;
import com.yalla.yalla.model.GifListJson;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.GifRecyclerView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o00;
import p159o00OoOO.o00000OO;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p188o00o00o0.OooO0o;
import p255o00ooO0o.oo0oOO0;
import p498o0o00Oo0.OooOOO;
import p502o0o00o0.o00000O;
import p518o0o0O00o.o000O000;
import p606o0oo0O.OooOo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.Cif;
import p649o0ooOOoo.ch;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOOOOo0O extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Cif f46183OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f46184OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public PopupWindow f46185OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ch f46186OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f46187o000oOoO;

    public final class OooO00o extends p188o00o00o0.OooO0OO<GifListJson> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oOOOOo0O f46188OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull oOOOOo0O oooooo0o, @NotNull Context context, List<GifListJson> data) {
            super(context, R.layout.room_item_mic_emoji_panel_content, data);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f46188OooO00o = oooooo0o;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o oooO0o = (OooO0o) oooO00o;
            final GifListJson gifListJson = (GifListJson) obj;
            if (oooO0o == null || gifListJson == null) {
                return;
            }
            final int[] iArr = {0, 0};
            final GifRecyclerView gifRecyclerView = (GifRecyclerView) oooO0o.OooO0Oo(R.id.rvItemEmojiPanel);
            final ArrayList arrayList = new ArrayList();
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final oOOOoo00 oooooo00 = new oOOOoo00(gifListJson, getContext(), gifListJson.getItem());
            gifRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
            gifRecyclerView.setAdapter(oooooo00);
            gifRecyclerView.setLongClickPreviewListener(new oOOO0OOO(gifRecyclerView, iArr, arrayList, this.f46188OooO00o, objectRef, oooooo00, gifListJson));
            final oOOOOo0O oooooo0o = this.f46188OooO00o;
            oooooo00.setOnItemChildLongClickListener(new BaseQuickAdapter.OooOOO() { // from class: o0oOoOOo.oOOO0O0o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO
                public final void OooO00o(View view, int i) {
                    String gif;
                    List itemViewList = arrayList;
                    GifRecyclerView gifRecyclerView2 = gifRecyclerView;
                    oOOOoo00 adapter = oooooo00;
                    Ref.ObjectRef lastView = objectRef;
                    int[] rvLocal = iArr;
                    oOOOOo0O this$0 = oooooo0o;
                    GifListJson gifListJson2 = gifListJson;
                    Intrinsics.checkNotNullParameter(itemViewList, "$itemViewList");
                    Intrinsics.checkNotNullParameter(adapter, "$adapter");
                    Intrinsics.checkNotNullParameter(lastView, "$lastView");
                    Intrinsics.checkNotNullParameter(rvLocal, "$rvLocal");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    itemViewList.clear();
                    int childCount = gifRecyclerView2.getChildCount();
                    boolean z = false;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childView = gifRecyclerView2.getChildAt(i2);
                        Intrinsics.checkNotNullExpressionValue(childView, "childView");
                        itemViewList.add(childView);
                    }
                    gifRecyclerView2.setLongClickPreview(true);
                    GifConfigJson item = adapter.getItem(i);
                    lastView.element = view;
                    int[] iArr2 = {0, 0};
                    view.getLocationOnScreen(iArr2);
                    int i3 = iArr2[1] < rvLocal[1] ? rvLocal[1] - iArr2[1] : 0;
                    int iOooO00o = rvLocal[1] - OooOo00.OooO00o(65);
                    int height = (gifRecyclerView2.getHeight() + rvLocal[1]) - OooOo00.OooO00o(45);
                    int i4 = iArr2[1];
                    if (iOooO00o <= i4 && i4 <= height) {
                        z = true;
                    }
                    if (z) {
                        Intrinsics.checkNotNullExpressionValue(view, "view");
                        if (item == null || (gif = item.getGif()) == null) {
                            gif = "";
                        }
                        oOOOOo0O.OooOO0o(this$0, view, gif, gifListJson2.getFolderName(), i3);
                    }
                }
            });
            final oOOOOo0O oooooo0o2 = this.f46188OooO00o;
            oooooo00.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o0oOoOOo.oOOO0OO0
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    oOOOoo00 adapter = oooooo00;
                    oOOOOo0O this$0 = oooooo0o2;
                    GifListJson gifListJson2 = gifListJson;
                    Intrinsics.checkNotNullParameter(adapter, "$adapter");
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    GifConfigJson item = adapter.getItem(i);
                    int lowestKAVIP = item != null ? item.getLowestKAVIP() : 0;
                    OooOOO oooOOO = OooOOO.f41216OooO00o;
                    Pair<Integer, Integer> value = oooOOO.OooO().getValue();
                    int iIntValue = value != null ? value.getSecond().intValue() : 0;
                    GifConfigJson item2 = adapter.getItem(i);
                    int lowestVip = item2 != null ? item2.getLowestVip() : 0;
                    Pair<Boolean, Integer> value2 = oooOOO.OooOOO0().getValue();
                    boolean zBooleanValue = value2 != null ? value2.getFirst().booleanValue() : false;
                    Pair<Boolean, Integer> value3 = oooOOO.OooOOO0().getValue();
                    int iIntValue2 = value3 != null ? value3.getSecond().intValue() : 0;
                    if (lowestKAVIP > 0 && iIntValue < lowestKAVIP) {
                        oo0oOO0 oo0ooo0 = new oo0oOO0(this$0.f41543Oooo0o);
                        oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_mic_emoji_upgrade_ka_vip_content));
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_mic_emoji_upgrade_ka_vip_dredge));
                        oo0ooo0.OooOo0o(new oOOo0O00(oo0ooo0));
                        oo0ooo0.OooOOO0();
                        return;
                    }
                    if ((!zBooleanValue || iIntValue2 < lowestVip) && lowestVip > 0) {
                        oo0oOO0 oo0ooo1 = new oo0oOO0(this$0.f41543Oooo0o);
                        oo0ooo1.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.room_mic_emoji_upgrade_vip_content));
                        oo0ooo1.OooOoOO(true);
                        oo0ooo1.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Get_Yalla_Premium));
                        oo0ooo1.OooOo0o(new oOo0o00(oo0ooo1));
                        oo0ooo1.OooOOO0();
                        return;
                    }
                    GifConfigJson item3 = adapter.getItem(i);
                    Pair[] pairArr = new Pair[1];
                    pairArr[0] = new Pair("emotiid", item3 != null ? Integer.valueOf(item3.getId()) : "");
                    OooOo.OooO0OO("102033", MapsKt.hashMapOf(pairArr));
                    StringBuilder sb = new StringBuilder();
                    sb.append(gifListJson2.getFolderName());
                    sb.append(item3 != null ? item3.getGif() : null);
                    String string = sb.toString();
                    Objects.requireNonNull(this$0);
                    SparseArray<RoomLoginInformation.MIC> sparseArray = o000O00O.OooO().f32431OoooO;
                    int size = sparseArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        RoomLoginInformation.MIC mic = sparseArray.get(sparseArray.keyAt(i2));
                        Intrinsics.checkNotNullExpressionValue(mic, "micListInfo.get(micListInfo.keyAt(i))");
                        RoomUserInfoModel roomUserInfoModel = mic.user;
                        if (roomUserInfoModel != null) {
                            long userId = roomUserInfoModel.getUserId();
                            Long value4 = OooOOO.f41216OooO00o.OooOo().getValue();
                            if (value4 != null && userId == value4.longValue()) {
                                int i3 = i2 + 1;
                                Objects.requireNonNull(o00O000.OooO());
                                o00 o00Var = o00O000.f32468OooO00o;
                                if (o00Var != null) {
                                    o00Var.OooO0o(1000400, "{\"type\":2,\"emjUrl\":\"" + string + "\",\"micNumber\":" + i3 + "}");
                                }
                                this$0.OooO0O0();
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    public final class OooO0O0 extends p188o00o00o0.OooO0OO<GifListJson> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oOOOOo0O f46189OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull oOOOOo0O oooooo0o, @NotNull Context context, List<GifListJson> data) {
            super(context, R.layout.room_item_mic_emoji_panel_table, data);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f46189OooO00o = oooooo0o;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o oooO0o = (OooO0o) oooO00o;
            GifListJson gifListJson = (GifListJson) obj;
            if (oooO0o == null || gifListJson == null) {
                return;
            }
            oooO0o.OooO0oO(R.id.vSelect, this.f46189OooO00o.f46184OoooOO0 == oooO0o.getLayoutPosition());
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48443OooOOo0 = com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.icon_emoji);
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(gifListJson.getFolderName()) + gifListJson.getFolderIcon();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivItemEmojiTable));
            oooO0o.OooO0oO(R.id.vSplitLine, oooO0o.getLayoutPosition() != getItemCount() - 1);
        }
    }

    public static final class OooO0OO extends RecyclerView.o00O0O {
        public OooO0OO() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
        @SuppressLint({"NotifyDataSetChanged"})
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                oOOOOo0O oooooo0o = oOOOOo0O.this;
                RecyclerView.Oooo000 layoutManager = recyclerView.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                oooooo0o.f46184OoooOO0 = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
                RecyclerView.Adapter adapter = oOOOOo0O.this.f46183OoooO.f49673OooO0OO.getAdapter();
                boolean z = false;
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                oOOOOo0O oooooo0o2 = oOOOOo0O.this;
                int i2 = oooooo0o2.f46184OoooOO0;
                if (i2 >= 0 && i2 < itemCount) {
                    z = true;
                }
                if (!z || itemCount <= 1) {
                    return;
                }
                oooooo0o2.f46183OoooO.f49672OooO0O0.scrollToPosition(i2);
                OooO0O0 oooO0O0 = oOOOOo0O.this.f46187o000oOoO;
                if (oooO0O0 != null) {
                    oooO0O0.notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOOo0O(@NotNull FragmentActivity context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Cif cifInflate = Cif.inflate(LayoutInflater.from(context), this.f41545Oooo0oo, false);
        Intrinsics.checkNotNullExpressionValue(cifInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        this.f46183OoooO = cifInflate;
        FrameLayout frameLayout = cifInflate.f49671OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "emojiPanelBinding.root");
        OooO0oO(frameLayout);
        Window window = this.f41544Oooo0oO.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = this.f41544Oooo0oO.getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(R.style.anim_bottom_top_bottom);
        }
        if (this.f41543Oooo0o instanceof FragmentActivity) {
            o000O000 o000o001 = o000O000.f42185OooO00o;
            o000O000.f42186OooO0O0.observe(this.f41544Oooo0oO, new o00000OO(this, 4));
            final int[] iArr = new int[2];
            cifInflate.f49671OooO00o.setOnTouchListener(new View.OnTouchListener() { // from class: o0oOoOOo.oOOO00o0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    oOOOOo0O this$0 = this.f46164Oooo0o;
                    int[] location = iArr;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(location, "$location");
                    this$0.f46183OoooO.f49672OooO0O0.getLocationOnScreen(location);
                    if (view.getY() >= location[1]) {
                        return false;
                    }
                    this$0.OooO0O0();
                    return false;
                }
            });
        }
    }

    public static final boolean OooOO0O(oOOOOo0O oooooo0o, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(oooooo0o);
        if (view == null) {
            return false;
        }
        float x = view.getX();
        float x2 = view.getX() + view.getWidth();
        float x3 = motionEvent.getX();
        if (!(x <= x3 && x3 <= x2)) {
            return false;
        }
        float y = view.getY();
        float y2 = view.getY() + view.getHeight();
        float y3 = motionEvent.getY();
        return (y > y3 ? 1 : (y == y3 ? 0 : -1)) <= 0 && (y3 > y2 ? 1 : (y3 == y2 ? 0 : -1)) <= 0;
    }

    public static final void OooOO0o(oOOOOo0O oooooo0o, View view, String str, String str2, int i) {
        int height;
        int measuredHeight;
        ch chVar = null;
        ch chVarOooO00o = ch.OooO00o(View.inflate(oooooo0o.f41543Oooo0o, R.layout.room_popupwindow_mic_emoji, null));
        Intrinsics.checkNotNullExpressionValue(chVarOooO00o, "bind(FrameLayout.inflate…pwindow_mic_emoji, null))");
        oooooo0o.f46186OoooOOo = chVarOooO00o;
        oOOo0000 oooo0000 = new oOOo0000(oooooo0o, chVarOooO00o.f49109OooO00o);
        oooooo0o.f46185OoooOOO = oooo0000;
        oooo0000.setClippingEnabled(true);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(oooooo0o.f41543Oooo0o);
        oooO00o.f48430OooO0Oo = true;
        oooO00o.OooO0oO(8);
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(str2) + str;
        oooO00o.f48427OooO00o = 0;
        ch chVar2 = oooooo0o.f46186OoooOOo;
        if (chVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            chVar2 = null;
        }
        oooO00o.OooO0o(chVar2.f49110OooO0O0);
        ch chVar3 = oooooo0o.f46186OoooOOo;
        if (chVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            chVar3 = null;
        }
        chVar3.f49109OooO00o.measure(0, 0);
        int width = view.getWidth();
        ch chVar4 = oooooo0o.f46186OoooOOo;
        if (chVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            chVar4 = null;
        }
        int measuredWidth = (width - chVar4.f49109OooO00o.getMeasuredWidth()) / 2;
        if (i <= 0) {
            height = OooOo00.OooO00o(4.0f) - view.getHeight();
            ch chVar5 = oooooo0o.f46186OoooOOo;
            if (chVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                chVar = chVar5;
            }
            measuredHeight = chVar.f49109OooO00o.getMeasuredHeight();
        } else {
            height = i - view.getHeight();
            ch chVar6 = oooooo0o.f46186OoooOOo;
            if (chVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                chVar = chVar6;
            }
            measuredHeight = chVar.f49109OooO00o.getMeasuredHeight();
        }
        int i2 = height - measuredHeight;
        PopupWindow popupWindow = oooooo0o.f46185OoooOOO;
        if (popupWindow != null) {
            popupWindow.showAsDropDown(view, measuredWidth, i2, 0);
        }
    }

    public final void OooOOO0(List<GifListJson> list) {
        this.f46183OoooO.f49672OooO0O0.setLayoutManager(new FixLinearLayoutManager(this.f41543Oooo0o, 0));
        this.f46183OoooO.f49672OooO0O0.setAdapter(new OooO00o(this, this.f41543Oooo0o, list));
        o000OOo o000ooo2 = new o000OOo();
        this.f46183OoooO.f49672OooO0O0.setOnFlingListener(null);
        o000ooo2.attachToRecyclerView(this.f46183OoooO.f49672OooO0O0);
        this.f46183OoooO.f49672OooO0O0.addOnScrollListener(new OooO0OO());
    }
}
